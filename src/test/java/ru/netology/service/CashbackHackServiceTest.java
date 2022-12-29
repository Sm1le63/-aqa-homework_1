package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn100IfAmountIs900() {
        int amount = 900;

        int expected = 100;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn1000IfAmountIs0(){

        int amount = 0;

        int expected = 1000;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn800IfAmountIs1300(){
        int amount = 1300;

        int expected = 700;
        int actual = service.remain(amount);

        assertEquals(expected, actual);

    }

    @Test
    public void shouldReturn0IfAmountIs1000(){   // Тест завершается с ошибкой - баг программы
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
}







