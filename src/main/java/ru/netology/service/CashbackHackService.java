package ru.netology.service;

public class CashbackHackService {
    private final int boundary = 1000;

    public int remain(int amount) {
        return boundary - amount % boundary;

        // 1000 - (900/1000)=   1000-900 = 100
        // 1000 - (1000/1000)= 1000-0 = 1000  // ожидаем 0
    }
}