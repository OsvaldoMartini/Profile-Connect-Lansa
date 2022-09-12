package com.osvaldomartini.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("Block_C")
public class ServerBlock_C_Service implements ConnectionService {
    /**
     * A bean representing an entry Server C, it Simulates a Failed Connection for Machine/PC/Network Connection
     *
     * @author Osvaldo Martini Oversion 1.0
     */
    private static final Logger logger = LoggerFactory.getLogger(ServerBlock_C_Service.class);

    @Override
    public String checkConnection() {
        logger.info("Server Block C Disconnected!");
        return "Server Block C Disconnected!";
    }
}
