package com.id.hackaton;

import com.id.hackaton.notification.food.Food;
import com.id.hackaton.notification.health.Health;
import com.id.hackaton.notification.nap.Nap;
import com.id.hackaton.notification.play.Play;
import com.id.hackaton.parent.Parent;
import io.confluent.examples.clients.cloud.DaycareProducer;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@RestController
@RequestMapping("/api/v1")
public class DaycareController {

        @PostMapping("/parent")
        public Parent createParent(@RequestBody Parent parent) throws IOException, NoSuchAlgorithmException, MessagingException {
            StringBuilder hashtext = new StringBuilder();
            hashtext.append(parent.getFirstName()).append(parent.getLastName());
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(StandardCharsets.UTF_8.encode(hashtext.toString()));
            String hash = String.format("%032x", new BigInteger(1, md5.digest()));
            parent.setKey(hash);
            DaycareProducer.sendParent("Parent", hash, parent);
            return parent;
        }

    @PostMapping("/nap")
    public Nap createNap(@RequestBody Nap nap) throws IOException, NoSuchAlgorithmException {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(StandardCharsets.UTF_8.encode(nap.getParent()));
            String hash = String.format("%032x", new BigInteger(1, md5.digest()));
            nap.setKey(hash);
            DaycareProducer.sendNap("Nap", hash, nap);
            return nap;
        }

    @PostMapping("/food")
    public Food createFood(@RequestBody Food food) throws IOException, NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.update(StandardCharsets.UTF_8.encode(food.getParent()));
        String hash = String.format("%032x", new BigInteger(1, md5.digest()));
        food.setKey(hash);
        DaycareProducer.sendFood("Food", hash, food);
        return food;
    }

    @PostMapping("/health")
    public Health createHealth(@RequestBody Health health) throws IOException, NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.update(StandardCharsets.UTF_8.encode(health.getParent()));
        String hash = String.format("%032x", new BigInteger(1, md5.digest()));
        health.setKey(hash);
        DaycareProducer.sendHealth("Health", hash, health);
        return health;
    }

    @PostMapping("/play")
    public Play createPlay(@RequestBody Play play) throws IOException, NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.update(StandardCharsets.UTF_8.encode(play.getParent()));
        String hash = String.format("%032x", new BigInteger(1, md5.digest()));
        play.setKey(hash);
        DaycareProducer.sendPlay("Play", hash, play);
        return play;
    }

}
