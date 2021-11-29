package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnRemain5IfAmount500() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        //int amount = 500;
        int expected = 500;
        int actual = cashbackHackService.remain(500);
        assertEquals(actual,expected);

    }

    @Test
    public void shouldReturnRemain1IfAmount999() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        //int amount = 999;
        int expected = 1;
        int actual = cashbackHackService.remain(999);
        assertEquals(actual,expected);

    }

    @Test
    public void shouldReturnRemain0IfAmount1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        // int amount = 1000;
        int expected = 0;
        int actual = cashbackHackService.remain(1000);
        assertEquals(actual,expected, "The remain 1000 is wrong for amount 1000");

    }

    @Test
    public void shouldReturnRemain0IfAmount1001() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        // int amount = 1001;
        int expected = 0;
        int actual = cashbackHackService.remain(1001);
        assertEquals(actual,expected,"The remain 999 is wrong for amount 1001");

    }

}