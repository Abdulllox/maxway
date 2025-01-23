package org.example.Sinf;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;

public class Conculator extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage()) {
            Message message = update.getMessage();
            Long chatId = message.getChatId();

            sendInlineButton(chatId);
        } else if (update.hasCallbackQuery()) {
            CallbackQuery callbackQuery = update.getCallbackQuery();
            String data = callbackQuery.getData();
            System.out.println(data);
        }
    }


    private void sendInlineButton(Long chatId) {
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("CE");
        button1.setCallbackData("Ce");

        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("C");
        button2.setCallbackData("C");

        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Ochirish");
        button3.setCallbackData("Ochirish");

        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("/");
        button4.setCallbackData("/");

        InlineKeyboardButton button5 = new InlineKeyboardButton();
        button5.setText("7");
        button5.setCallbackData("7");

        InlineKeyboardButton button6 = new InlineKeyboardButton();
        button6.setText("8");
        button6.setCallbackData("8");

        InlineKeyboardButton button7 = new InlineKeyboardButton();
        button7.setText("9");
        button7.setCallbackData("9");

        InlineKeyboardButton button8 = new InlineKeyboardButton();
        button8.setText("*");
        button8.setCallbackData("*");

        InlineKeyboardButton button9 = new InlineKeyboardButton();
        button9.setText("4");
        button9.setCallbackData("4");

        InlineKeyboardButton button10 = new InlineKeyboardButton();
        button10.setText("5");
        button10.setCallbackData("5");

        InlineKeyboardButton button11 = new InlineKeyboardButton();
        button11.setText("6");
        button11.setCallbackData("6");

        InlineKeyboardButton button12 = new InlineKeyboardButton();
        button12.setText("-");
        button12.setCallbackData("-");

        InlineKeyboardButton button13 = new InlineKeyboardButton();
        button13.setText("1");
        button13.setCallbackData("1");

        InlineKeyboardButton button14 = new InlineKeyboardButton();
        button14.setText("2");
        button14.setCallbackData("2");

        InlineKeyboardButton button15 = new InlineKeyboardButton();
        button15.setText("3");
        button15.setCallbackData("3");

        InlineKeyboardButton button16 = new InlineKeyboardButton();
        button16.setText("+");
        button16.setCallbackData("+");

        InlineKeyboardButton button17 = new InlineKeyboardButton();
        button17.setText("#");
        button17.setCallbackData("#");

        InlineKeyboardButton button18 = new InlineKeyboardButton();
        button18.setText("0");
        button18.setCallbackData("0");

        InlineKeyboardButton button19 = new InlineKeyboardButton();
        button19.setText(".");
        button19.setCallbackData(".");

        InlineKeyboardButton button20 = new InlineKeyboardButton();
        button20.setText("=");
        button20.setCallbackData("=");

        ArrayList<InlineKeyboardButton> row1 = new ArrayList<>();
        row1.add(button1);
        row1.add(button2);
        row1.add(button3);
        row1.add(button4);

        ArrayList<InlineKeyboardButton> row2 = new ArrayList<>();
        row2.add(button5);
        row2.add(button6);
        row2.add(button7);
        row2.add(button8);

        ArrayList<InlineKeyboardButton> row3 = new ArrayList<>();
        row3.add(button9);
        row3.add(button10);
        row3.add(button11);
        row3.add(button12);

        ArrayList<InlineKeyboardButton> row4 = new ArrayList<>();
        row4.add(button13);
        row4.add(button14);
        row4.add(button15);
        row4.add(button16);

        ArrayList<InlineKeyboardButton> row5 = new ArrayList<>();
        row5.add(button17);
        row5.add(button18);
        row5.add(button19);
        row5.add(button20);

        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        rows.add(row1);
        rows.add(row2);
        rows.add(row3);
        rows.add(row4);
        rows.add(row5);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        markup.setKeyboard(rows);

        SendMessage message = new SendMessage();
        message.setText("Conculator");
        message.setChatId(chatId);
        message.setReplyMarkup(markup);

        try {
            execute(message);
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
