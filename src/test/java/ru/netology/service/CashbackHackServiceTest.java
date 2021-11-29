package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnRemain5IfAmount500() {
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
        // int amount = 1000;
        int expected = 1000;
        int actual = cashbackHackService.remain(1000);
        assertEquals(expected, actual);

    }

    @Test
    public void shouldReturnRemain0IfAmount1001() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        // int amount = 1001;
        int expected = 999;
        int actual = cashbackHackService.remain(1001);
        assertEquals(expected, actual);

    }

}