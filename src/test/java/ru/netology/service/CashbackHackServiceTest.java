package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn100IfAmountIs900() {
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn1000IfAmountIs0(){

        int amount = 0;

        int expected = 1000;
        int actual = service.remain(amount);

        assertEquals(actual,expected);
    }

    @Test
    public void shouldReturn800IfAmountIs1300(){
        int amount = 1300;

        int expected = 700;
        int actual = service.remain(amount);

        assertEquals(actual,expected);

    }

    @Test
    public void shouldReturn0IfAmountIs1000(){   // Тест завершается с ошибкой - баг программы
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
}







