package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepositAccountTest {

    @Test
    void depositAccountTestTakeTwiceMonth() {
        DepositAccount depositAccount = new DepositAccount();
        depositAccount.Put(1000);
        depositAccount.take(500);
        Assertions.assertThrows(ArithmeticException.class, () -> depositAccount.take(50));
    }

    void depositAccountTestThrowArithmeticException() {
        DepositAccount depositAccount = new DepositAccount();
        depositAccount.Put(1000);


    }
    }
