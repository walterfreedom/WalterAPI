package jottero.rocks.walterapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class WalterApiApplication implements CommandLineRunner{
    @Autowired
    postinterface postRepo;

    public static void main(String[] args) {
        SpringApplication.run(WalterApiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
