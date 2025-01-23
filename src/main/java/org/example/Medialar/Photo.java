package org.example.Medialar;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.*;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.List;

public class Photo extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage()) {
            Message message = update.getMessage();
            List<PhotoSize> list = message.getPhoto();
            PhotoSize photoSize = list.get(3);

            Long chatId = message.getChatId();
            String text = message.getText();


            SendPhoto photo = new SendPhoto();
            photo.setChatId(chatId);
            photo.setPhoto(new InputFile(photoSize.getFileId()));
//            photo.setPhoto(new InputFile("https://i.pinimg.com/originals/5e/bb/59/5ebb5904b77071dd4415919c4b8730f0.jpg"));

            try {
                execute(photo);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }

        } else if (update.hasCallbackQuery()) {
            CallbackQuery callbackQuery = update.getCallbackQuery();
            String data = callbackQuery.getData();
            System.out.println(data);
        }
    }
    @Override
    public String getBotUsername() {
        return "@Xaliljonovv_bot";
    }
    @Override
    public String getBotToken() {
        return "7547720483:AAH3T-jltGcWhdYWY4guxe8ESSzsVuVcP3A";

    }
}
