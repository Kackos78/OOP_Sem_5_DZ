package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditAccountTest {

    @Test
    void take() {
        CreditAccount creditAccount = new CreditAccount();
        creditAccount.Put(1000);
        creditAccount.take(500);
        double expectedAns = 1000-500*1.01;
        Assertions.assertEquals(expectedAns, creditAccount.GetAmount());

    }
}