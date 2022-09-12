package com.osvaldomartini;

import com.osvaldomartini.service.ConnectionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("Block_A")
public class Lanca_Health_Check_Profile_A_Test {

    @Autowired
    ConnectionService connectionService;

    @Test
    public void test_Block_A_Profile() {
        String output = connectionService.checkConnection();
        assertThat(output).contains("Server Block A Connected!");
    }
}