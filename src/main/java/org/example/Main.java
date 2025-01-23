package org.example;

import org.example.Medialar.Audio;
import org.example.Medialar.Document;
import org.example.Medialar.Photo;
import org.example.Medialar.Video;
import org.example.Sinf.Conculator;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;


public class Main {
    public static void main(String[] args) throws TelegramApiException {
        Bot bot = new Bot();
        Magazin magazin = new Magazin();
        Ortga ortga = new Ortga();
        Contact contact = new Contact();
        Inline inline = new Inline();
        Photo photo = new Photo();
        Conculator conculator = new Conculator();
        Video video = new Video();
        Document document = new Document();
        Audio audio = new Audio();
        Help help = new Help();
        TelegramBotsApi api = new TelegramBotsApi(DefaultBotSession.class);
        api.registerBot(ortga);
        System.out.println("ishlavoti");
    }
}