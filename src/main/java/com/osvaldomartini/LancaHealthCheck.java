package com.osvaldomartini;

import com.osvaldomartini.service.ConnectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LancaHealthCheck implements CommandLineRunner {

    @Autowired
    private ConnectionService connectionService;

    public static void main(String[] args) {
        SpringApplication.run(LancaHealthCheck.class, args);
    }

    @Override
    public void run(String... args) {
        String resp = connectionService.checkConnection();
        if (resp.contains("Connected!")) {
            System.out.println(resp);
            System.out.println("### CONNECTED OK");
            System.out.println("*** Sent");
            System.out.println("** Received");
            System.out.println("### DISCONNECTED OK");
        } else {
            System.out.println("### DISCONNECTED OK");
        }
    }
}
