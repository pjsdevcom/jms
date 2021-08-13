package com.pjsdev.jms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JmsApplication {

    public static void main(String[] args) {

//        ActiveMQServer server = ActiveMQServers.newActiveMQServer(new ConfigurationImpl()
//                .setPersistenceEnabled(false) //no persistence
//                .setJournalDirectory("target/data/journal")
//                .setSecurityEnabled(false) //anybody can log in
//                .addAcceptorConfiguration("invm", "vm://0"));
//
//        server.start();

        SpringApplication.run(JmsApplication.class, args);
    }

}
