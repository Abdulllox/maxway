package org.example.Nazorat;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.*;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


import java.util.ArrayList;
import java.util.List;

public class Product extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage()) {
            Message message = update.getMessage();
            Long chatId = message.getChatId();

            List<PhotoSize> photo = message.getPhoto();
            PhotoSize photoSize = photo.get(3);


            SendPhoto sendPhoto = new SendPhoto();
            sendPhoto.setChatId(chatId);
            sendPhoto.setPhoto(new InputFile(photoSize.getFileId()));
            sendPhoto.setCaption("Rasm");

            try {
                execute(sendPhoto);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }


        } else if (update.hasCallbackQuery()){
            CallbackQuery callbackQuery = update.getCallbackQuery();
        String data = callbackQuery.getData();
        System.out.println(data);
    }
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(1, "Amir");
        arrayList.add(2, "Odil");
        arrayList.add(3, "Fozil");
        arrayList.remove(1);
        arrayList.get(1);
}


    @Override
    public String getBotUsername() {
        return "@@Xaliljonovv_bot";
    }
    @Override
    public String getBotToken() {
        return "7547720483:AAH3T-jltGcWhdYWY4guxe8ESSzsVuVcP3A";

    }
}
