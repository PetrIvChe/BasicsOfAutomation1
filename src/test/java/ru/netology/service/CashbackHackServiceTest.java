package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnRemain1IfAmount999() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        //int amount = 999;
        int actual = 1;
        int expected = cashbackHackService.remain(999);
        assertEquals(actual,expected);

    }

    @Test
    public void shouldReturnRemain0IfAmount100() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        //int amount = 999;
        //int actual = 1;
        int expected = cashbackHackService.remain(1000);
        assertEquals(1000,0);

    }


}