package com.osvaldomartini.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"Block_A", "default"})
public class ServerBlock_A_Service implements ConnectionService {
    /**
     * A bean representing an entry Server A, it Simulates a Success Connection for Machine/PC/Network Connection
     *
     * @author Osvaldo Martini Oversion 1.0
     */
    private static final Logger logger = LoggerFactory.getLogger(ServerBlock_A_Service.class);

    @Override
    public String checkConnection() {
        logger.info("Server Block A Connected!");
        return "Server Block A Connected!";
    }

}