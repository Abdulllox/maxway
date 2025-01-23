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

public class Bot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {

        Message message = update.getMessage();
        String text = message.getText();
        Long chatId = message.getChatId();

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Click Premium");

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Kartalarim");

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Tolov");

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Balans");


        KeyboardButton button5 = new KeyboardButton();
        button5.setText("Otkazmalar");

        KeyboardButton button6 = new KeyboardButton();
        button6.setText("Tolovlar tarixi");

        KeyboardButton button7 = new KeyboardButton();
        button7.setText("Kiruvchi hisoblar");

        KeyboardButton button8 = new KeyboardButton();
        button8.setText("Saralangan tolovlar");

        KeyboardRow row1 = new KeyboardRow();
        row1.add(button1);
        row1.add(button2);


        KeyboardRow row2 = new KeyboardRow();
        row2.add(button3);
        row2.add(button4);

        KeyboardRow row3 = new KeyboardRow();
        row3.add(button5);
        row3.add(button6);

        KeyboardRow row4 = new KeyboardRow();
        row4.add(button7);
        row4.add(button8);

        ArrayList<KeyboardRow> rows = new ArrayList<>();
        rows.add(row1);
        rows.add(row2);
        rows.add(row3);
        rows.add(row4);

        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        markup.setKeyboard(rows);
        markup.setResizeKeyboard(true);
        markup.setOneTimeKeyboard(true);

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Menu");
        sendMessage.setReplyMarkup(markup);

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }



        if (text.equals("Click Premium")){
            sendMessage.setText("Bu click premimum");

        } else if (text.equals("Kartalarim")) {
            sendMessage.setText("Humo");
            sendMessage.setText("Uzcard");

        } else if (text.equals("Tolov")) {
            sendMessage.setText("MasterCard");

        }  else if (text.equals("Balans")){
            sendMessage.setText("1000$");

        }else if (text.equals("Otkazmalar")){
            sendMessage.setText("PayMe");

        }else if (text.equals("Tolovlar tarixi")){
            sendMessage.setText("11.23.21 - Pul otqazilgan");

        }else if (text.equals("Kiruvchi hisoblar")){
            sendMessage.setText("Otqazildi");

        }else if (text.equals("Saralangan tolovlar")){
            sendMessage.setText("Saralandi");
        }



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
