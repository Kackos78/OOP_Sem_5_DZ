package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class DepositAccountTest {

    @Test
    void depositAccountTestTakeTwiceMonth() {
        DepositAccount depositAccount = new DepositAccount();
        depositAccount.Put(1000);
        depositAccount.take(500);
        Assertions.assertThrows(ArithmeticException.class, () -> depositAccount.take(50));
    }
    }