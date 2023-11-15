package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.platform.commons.JUnitException;
import java.lang.reflect.Executable;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @org.junit.jupiter.api.Test
    void testPut1() {
        Account account = new Account();
        account.Put(152782444);
        double expectedSum = 152782444;
        Assertions.assertEquals(expectedSum, account.GetAmount());
    }
    @org.junit.jupiter.api.Test
    void testPut2() {
        Account account = new Account();
        account.Put(1444.14);
        double expectedSum = 1444.14;
        Assertions.assertEquals(expectedSum, account.GetAmount());
    }

    @org.junit.jupiter.api.Test
    void testPut3() {
        Account account = new Account();
        Assertions.assertThrows(ArithmeticException.class, () -> account.Put(0));
        Assertions.assertThrows(ArithmeticException.class, () -> account.Put(-1));
        Assertions.assertDoesNotThrow(() -> account.Put(50));
    }



    @org.junit.jupiter.api.Test
    void testTake1() {
        Account account = new Account();
        account.Put(1444);
        account.take(444);
        double expectedSum = 1000;
        Assertions.assertEquals(expectedSum, account.GetAmount());
    }

    @org.junit.jupiter.api.Test
    void testTake2() {
        Account account = new Account();
        account.Put(500);
        Assertions.assertThrows(ArithmeticException.class, () -> account.take(600));
        Assertions.assertThrows(ArithmeticException.class, () -> account.take(0));
        Assertions.assertThrows(ArithmeticException.class, () -> account.take(-100));
        Assertions.assertDoesNotThrow(() -> account.take(400));
    }

    @org.junit.jupiter.api.Test
    void testGetAmount() {
        Account account = new Account();
        Assertions.assertEquals(0, account.GetAmount());
    }
}