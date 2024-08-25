package com.eurekaclient.application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EurekaClientApplicationTest {

    @Test
    @DisplayName("Application runs success")
    void test_run_application(){
        Assertions.assertDoesNotThrow(()->EurekaClientApplication.main(new String[]{"args"}));
    }
}