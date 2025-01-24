package org.example.Project;

import org.example.interfake.C;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Main {
    public static void main(String[] args) throws TelegramApiException {
        MaxWay maxWay = new MaxWay();
        Kia kia = new Kia();
        Chopar chopar = new Chopar();
        Shoxclinika shoxclinika = new Shoxclinika();
        TelegramBotsApi api = new TelegramBotsApi(DefaultBotSession.class);
        api.registerBot(kia);
        System.out.println("ishlavoti");
    }
}
