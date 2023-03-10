package ru.netology;

import org.junit.Test;

import static org.junit.Assert.*;
public class CashbackHackServiceTest {

    @Test
    public void remain() {
            int amount = 900;
            CashbackHackService cashbackHackService = new CashbackHackService();
            int expected = 100;
            int actual = cashbackHackService.remain(amount);
            assertEquals(expected, actual);

        }

        @Test
        public void testRemainBounderMinus() {
            int amount = 999;
            CashbackHackService cashbackHackService = new CashbackHackService();
            int expected = 1;
            int actual = cashbackHackService.remain(amount);
            assertEquals(expected, actual);

        }
        @Test
        public void testRemainBounderPlus() {
            int amount = 1001;
            CashbackHackService cashbackHackService = new CashbackHackService();
            int expected = 999;
            int actual = cashbackHackService.remain(amount);
            assertEquals(expected, actual);

        }
        @Test
        public void testRemainEquals() {
            int amount = 1000;
            CashbackHackService cashbackHackService = new CashbackHackService();
            int expected = 0;
            int actual = cashbackHackService.remain(amount);
            assertEquals(expected, actual);

        }
    }