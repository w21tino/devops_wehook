package com.paymentchain.billing;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class BasicApplicationTests  {

    @Test
    void contextLoads() {
       String message = "Default Message test webhook 1 integrando slack para notificaciones";
        assertNotNull(message);
    }
}
