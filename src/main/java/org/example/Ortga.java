package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;

public class Ortga extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();
        String text = message.getText();
        Long chatId = message.getChatId();

        if (text.equals("/menu")){
            sendMenu(chatId,"Menu");
        }else
            sendDefault(chatId,"default emas");
    }

    private void sendMenu(Long chatId, String text) {
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Click Premium");

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Kartalar");

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Tolov");

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Ortga");

        KeyboardRow row1 = new KeyboardRow();
        row1.add(button1);
        row1.add(button2);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(button3);
        row2.add(button4);

        ArrayList<KeyboardRow> rows = new ArrayList<>();
        rows.add(row1);
        rows.add(row2);

        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        markup.setKeyboard(rows);
        markup.setResizeKeyboard(true);
        markup.setOneTimeKeyboard(true);
        markup.setSelective(false);
        markup.setIsPersistent(false);

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Menu");
        sendMessage.setReplyMarkup(markup);

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendDefault(Long chatId, String text) {
            KeyboardButton button1 = new KeyboardButton();
            button1.setText("/start");

            KeyboardButton button2 = new KeyboardButton();
            button2.setText("/menu");

            KeyboardRow row1 = new KeyboardRow();
            row1.add(button1);
            row1.add(button2);

            ArrayList<KeyboardRow> rows = new ArrayList<>();
            rows.add(row1);

            ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
            markup.setKeyboard(rows);
            markup.setResizeKeyboard(true);
            markup.setOneTimeKeyboard(true);
            markup.setSelective(false);
            markup.setIsPersistent(false);

            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(chatId);
            sendMessage.setText("Menu");
            sendMessage.setReplyMarkup(markup);

            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
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
