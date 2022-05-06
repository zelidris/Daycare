package io.confluent.examples.clients.cloud;

import com.id.hackaton.parent.Parent;
import io.confluent.kafka.serializers.KafkaJsonDeserializerConfig;
import org.apache.kafka.clients.consumer.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Properties;

public class DaycareConsumer {
  public static void main(final String[] args) throws Exception {
    final String topic = "Parent";
    final Properties props = loadConfig("C:\\Users\\vermej1\\java.config");
    props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer");
    props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, "io.confluent.kafka.serializers.KafkaJsonDeserializer");
    props.put(KafkaJsonDeserializerConfig.JSON_VALUE_TYPE, Parent.class);
    props.put(ConsumerConfig.GROUP_ID_CONFIG, "test7");
    props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
    final Consumer<String, Parent> consumer = new KafkaConsumer<String, Parent>(props);
    consumer.subscribe(Arrays.asList(topic));
    try {
      while (true) {
        ConsumerRecords<String, Parent> records = consumer.poll(100);
        for (ConsumerRecord<String, Parent> record : records) {
          String key = record.key();
          Parent parent = record.value();
          System.out.printf("Key: " + key + " Food status: " + parent.getNotification().get(0).getFood() + "\n");
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