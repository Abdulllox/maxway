package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.ForwardMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.LinkedList;
import java.util.List;

public class Help extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();
        Long chatId = message.getChatId();
        String text = message.getText();

        if (text.equals("/help")) {
            List<List<InlineKeyboardButton>> rowList = new LinkedList<>();
            List<InlineKeyboardButton> row = new LinkedList<>();

            InlineKeyboardButton button = new InlineKeyboardButton();
            button.setText("Adminga xabar yuborish");
            button.setSwitchInlineQueryCurrentChat("Matnni kiriting : ");

            row.add(button);
            rowList.add(row);

            InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
            inlineKeyboardMarkup.setKeyboard(rowList);

            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(message.getChatId());
            sendMessage.setText("Qandaydir savol yoki takliflaringiz bo'lsa admin bilan bog'laning");
            sendMessage.setReplyMarkup(inlineKeyboardMarkup);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }
        else if (text.startsWith("@yourBotUsername")) {
            ForwardMessage forwardMessage = new ForwardMessage();
            forwardMessage.setChatId(message.getChatId());
            forwardMessage.setMessageId(message.getMessageId());
            forwardMessage.setFromChatId(message.getChatId());
            try {
                execute(forwardMessage);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }

            SendMessage sendMessage = new SendMessage();
            sendMessage.setText("Xabaringiz yuborildi tez orada a'loqaga chiqamiz.");
            sendMessage.setChatId(message.getChatId());
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
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
