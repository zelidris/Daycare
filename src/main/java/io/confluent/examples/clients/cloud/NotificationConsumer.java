package io.confluent.examples.clients.cloud;

import com.id.hackaton.handler.NotificationHandler;
import com.id.hackaton.notification.GenericNotification;
import io.confluent.kafka.serializers.KafkaJsonDeserializerConfig;
import org.apache.kafka.clients.consumer.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class NotificationConsumer {

    public static void main(final String[] args) throws Exception {
        final String topic = "check_notification";
        final Properties props = loadConfig("C:\\Users\\vermej1\\java.config");

        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer");
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, "io.confluent.kafka.serializers.KafkaJsonDeserializer");
        props.put(KafkaJsonDeserializerConfig.JSON_VALUE_TYPE, GenericNotification.class);
        props.put(ConsumerConfig.GROUP_ID_CONFIG, "notificationConsumer");
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "latest");
        final Consumer<String, GenericNotification> consumer = new KafkaConsumer<>(props);
        consumer.subscribe(Arrays.asList(topic));
        try {
            while (true) {
                List<GenericNotification> notificationList = new ArrayList<>();
                ConsumerRecords<String, GenericNotification> records = consumer.poll(Duration.ofSeconds(10));
                for (ConsumerRecord<String, GenericNotification> record : records) {
                    String key = record.key();
                    GenericNotification notification = record.value();
                    notificationList.add(notification);
                }
                System.out.printf("Size: " + notificationList.size() + "\n");
                if(notificationList.size() != 0) {
                    GenericNotification finalNotification = notificationList.get(notificationList.size()-1);
                    switch (finalNotification.getType()) {
                        case "Food":
                            NotificationHandler.handleFoodMessage(finalNotification);
                            break;
                        case "Nap":
                            NotificationHandler.handleNapMessage(finalNotification);
                            break;
                        case "Play":
                            NotificationHandler.handlePlayMessage(finalNotification);
                            break;
                        case "Health":
                            NotificationHandler.handleHealthMessage(finalNotification);
                            break;
                        default:
                            System.out.printf("Unknown type \n");
                            break;
                    }
                }
            }
        } finally {
            consumer.close();
        }
    }
    public static Properties loadConfig(String configFile) throws IOException {
        if (!Files.exists(Paths.get(configFile))) {
            throw new IOException(configFile + " not found.");
        }
        final Properties cfg = new Properties();
        try (InputStream inputStream = new FileInputStream(configFile)) {
            cfg.load(inputStream);
        }
        return cfg;
    }
}
