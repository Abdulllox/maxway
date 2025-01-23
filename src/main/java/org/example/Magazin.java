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

public class Magazin extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();
        String text = message.getText();
        Long chatId = message.getChatId();

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83D\uDECD Buyurtma berish");

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83C\uDF89 Aksiya");

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("\uD83C\uDFD8 Barcha filiallar");

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("\uD83D\uDCCB Mening buyurtmalarim");

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("\uD83D\uDCDD Izoh qoldirish");

        KeyboardButton button6 = new KeyboardButton();
        button6.setText("\uD83D\uDCBC Vakansiyalar");

        KeyboardButton button7 = new KeyboardButton();
        button7.setText("\uD83D\uDCDC Biz haqimizda");

        KeyboardRow row1 = new KeyboardRow();
        row1.add(button1);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(button2);
        row2.add(button3);

        KeyboardRow row3 = new KeyboardRow();
        row3.add(button4);
        row3.add(button5);

        KeyboardRow row4 = new KeyboardRow();
        row4.add(button6);
        row4.add(button7);

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
