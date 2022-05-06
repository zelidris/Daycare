package io.confluent.examples.clients.cloud;

import com.id.hackaton.notification.food.Food;
import com.id.hackaton.notification.health.Health;
import com.id.hackaton.notification.nap.Nap;
import com.id.hackaton.notification.play.Play;
import com.id.hackaton.parent.Parent;
import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.errors.TopicExistsException;

import javax.mail.MessagingException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Optional;
import java.util.Properties;
import java.util.concurrent.ExecutionException;

public class DaycareProducer {

  // Create topic in Confluent Cloud
  public static void createTopic(final String topic,final Properties cloudConfig) {
      final NewTopic newTopic = new NewTopic(topic, Optional.empty(), Optional.empty());
      try (final AdminClient adminClient = AdminClient.create(cloudConfig)) {
          adminClient.createTopics(Collections.singletonList(newTopic)).all().get();
      } catch (final InterruptedException | ExecutionException e) {
          // Ignore if TopicExistsException, which may be valid if topic exists
          if (!(e.getCause() instanceof TopicExistsException)) {
              throw new RuntimeException(e);
          }
      }
  }

  public static void sendParent(String topic, String key, Parent parent) throws IOException, MessagingException {

    final Properties props = loadConfig("C:\\Users\\vermej1\\java.config");
    createTopic(topic, props);

    props.put(ProducerConfig.ACKS_CONFIG, "all");
    props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
    props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "io.confluent.kafka.serializers.KafkaJsonSerializer");

    org.apache.kafka.clients.producer.Producer<String, Parent> producer = new KafkaProducer<>(props);
    System.out.printf("Producing record: %s\t%s%n", key, parent);
    producer.send(new ProducerRecord<>(topic, key, parent), (m, e) -> {
      if (e != null) {
        e.printStackTrace();
      } else {
        System.out.printf("Produced record to topic %s partition [%d] @ offset %d%n", m.topic(), m.partition(), m.offset());
      }
    });
    producer.flush();
    producer.close();
  }

  public static void sendNap(String topic, String key, Nap nap) throws IOException {

    final Properties props = loadConfig("C:\\Users\\vermej1\\java.config");
    createTopic(topic, props);

    props.put(ProducerConfig.ACKS_CONFIG, "all");
    props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
    props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "io.confluent.kafka.serializers.KafkaJsonSerializer");

    org.apache.kafka.clients.producer.Producer<String, Nap> producer = new KafkaProducer<>(props);

    System.out.printf("Producing record: %s\t%s%n", key, nap);
    producer.send(new ProducerRecord<>(topic, key, nap), (m, e) -> {
      if (e != null) {
        e.printStackTrace();
      } else {
        System.out.printf("Produced record to topic %s partition [%d] @ offset %d%n", m.topic(), m.partition(), m.offset());
      }
    });
    producer.flush();
    producer.close();
  }

  public static void sendFood(String topic, String key, Food food) throws IOException {

    final Properties props = loadConfig("C:\\Users\\vermej1\\java.config");
    createTopic(topic, props);

    props.put(ProducerConfig.ACKS_CONFIG, "all");
    props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
    props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "io.confluent.kafka.serializers.KafkaJsonSerializer");

    org.apache.kafka.clients.producer.Producer<String, Food> producer = new KafkaProducer<>(props);

    System.out.printf("Producing record: %s\t%s%n", key, food);
    producer.send(new ProducerRecord<>(topic, key, food), (m, e) -> {
      if (e != null) {
        e.printStackTrace();
      } else {
        System.out.printf("Produced record to topic %s partition [%d] @ offset %d%n", m.topic(), m.partition(), m.offset());
      }
    });
    producer.flush();
    producer.close();
  }

  public static void sendHealth(String topic, String key, Health health) throws IOException {

    final Properties props = loadConfig("C:\\Users\\vermej1\\java.config");
    createTopic(topic, props);

    props.put(ProducerConfig.ACKS_CONFIG, "all");
    props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
    props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "io.confluent.kafka.serializers.KafkaJsonSerializer");

    org.apache.kafka.clients.producer.Producer<String, Health> producer = new KafkaProducer<>(props);

    System.out.printf("Producing record: %s\t%s%n", key, health);
    producer.send(new ProducerRecord<>(topic, key, health), (m, e) -> {
      if (e != null) {
        e.printStackTrace();
      } else {
        System.out.printf("Produced record to topic %s partition [%d] @ offset %d%n", m.topic(), m.partition(), m.offset());
      }
    });
    producer.flush();
    producer.close();
  }

  public static void sendPlay(String topic, String key, Play play) throws IOException {

    final Properties props = loadConfig("C:\\Users\\vermej1\\java.config");
    createTopic(topic, props);

    props.put(ProducerConfig.ACKS_CONFIG, "all");
    props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
    props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "io.confluent.kafka.serializers.KafkaJsonSerializer");

    org.apache.kafka.clients.producer.Producer<String, Play> producer = new KafkaProducer<>(props);

    System.out.printf("Producing record: %s\t%s%n", key, play);
    producer.send(new ProducerRecord<>(topic, key, play), (m, e) -> {
      if (e != null) {
        e.printStackTrace();
      } else {
        System.out.printf("Produced record to topic %s partition [%d] @ offset %d%n", m.topic(), m.partition(), m.offset());
      }
    });
    producer.flush();
    producer.close();
  }

  public static void sendNotification(String topic, String key, Play play) throws IOException {

    final Properties props = loadConfig("C:\\Users\\vermej1\\java.config");
    createTopic(topic, props);

    props.put(ProducerConfig.ACKS_CONFIG, "all");
    props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
    props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "io.confluent.kafka.serializers.KafkaJsonSerializer");

    org.apache.kafka.clients.producer.Producer<String, Play> producer = new KafkaProducer<>(props);

    System.out.printf("Producing record: %s\t%s%n", key, play);
    producer.send(new ProducerRecord<>(topic, key, play), (m, e) -> {
      if (e != null) {
        e.printStackTrace();
      } else {
        System.out.printf("Produced record to topic %s partition [%d] @ offset %d%n", m.topic(), m.partition(), m.offset());
      }
    });
    producer.flush();
    producer.close();
  }

  public static Properties loadConfig(final String configFile) throws IOException {
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
