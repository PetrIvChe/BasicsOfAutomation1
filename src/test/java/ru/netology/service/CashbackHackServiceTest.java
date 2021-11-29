package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CashbackHackServiceTest {

    @Test
    public void shouldReturnRemain500IfAmount500() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        //int amount = 500;
        int expected = 500;
        int actual = cashbackHackService.remain(500);
        assertEquals(expected, actual);

    }

    @Test
    public void shouldReturnRemain1IfAmount999() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        //int amount = 999;
        int expected = 1;
        int actual = cashbackHackService.remain(999);
        assertEquals(expected, actual);

    }

    @Test
    public void shouldReturnRemain0IfAmount1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        //int amount = 1000;
        int expected = 0;
        int actual = cashbackHackService.remain(1000);
        assertEquals(expected, actual, "1000р. при уже потраченных 1000");

    }

    @Test
    public void shouldReturnRemain0IfAmountMinus1001() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        //int amount = 1000;
        int expected = 0;
        int actual = cashbackHackService.remain(1001);
        assertEquals(expected, actual, "Ещё тратить 999р.?, при потраченных 1001");

    }


    @Test
    public void shouldReturnRemain1000IfAmountMinus500() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        //int amount = 1000;
        int expected = 1000;
        int actual = cashbackHackService.remain(-500);
        assertEquals(expected, actual, "Ещё трать 1500р., при минус 500");

    }


}