package ru.netology.service;

public class Main {
    public static void main(String[] args) {

        CashbackHackService service = new CashbackHackService();
        int boundary = 1000;
        int amount = 900;


        int a = boundary - amount % boundary;
        System.out.println(a);
    }
}
