package com.osvaldomartini;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.springframework.boot.test.system.OutputCaptureRule;

import static org.assertj.core.api.Assertions.assertThat;

public class Lanca_Health_Check_All_Profiles_Test {
    @Rule
    public OutputCaptureRule outputCapture = new OutputCaptureRule();


    @Before
    public void before() {
        System.clearProperty("spring.profiles.active");
    }

    @Test
    public void testDefaultProfile() {
        LancaHealthCheck.main(new String[0]);
        String output = this.outputCapture.toString();
        assertThat(output).contains("Server Block A Connected!");
    }

    @Test
    public void test_Block_B_Profile() {
        System.setProperty("spring.profiles.active", "Block_B");
        LancaHealthCheck.main(new String[0]);
        String output = this.outputCapture.toString();
        assertThat(output).contains("Server Block B Connected!");
    }

    @Test
    public void testRainingProfile_withDoption() {
        LancaHealthCheck.main(new String[]{"--spring.profiles.active=Block_A"});
        String output = this.outputCapture.toString();
        assertThat(output).contains("Server Block A Connected!");
    }

    @After
    public void after() {
        System.clearProperty("spring.profiles.active");
    }

}
