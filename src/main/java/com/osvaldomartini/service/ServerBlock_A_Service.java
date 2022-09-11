package com.osvaldomartini.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"Block_A", "default"})
public class ServerBlock_A_Service implements ConnectionService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public String checkConnection() {
        logger.info("Server Block A Connected!");
        return "Server Block A Connected!";
    }

}