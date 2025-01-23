package org.example.Sinf;

import lombok.SneakyThrows;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.DeleteMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Edit extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();
        Long chatId = message.getChatId();

        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("Bu birinchi matn");
        sendMessage.setChatId(chatId);

        Message executed;
        try {
            executed = execute(sendMessage);


        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }


        Integer messageId = executed.getMessageId();
        System.out.println(messageId);

        for (int i = 0; i < 10; i++) {
            EditMessageText editMessageText = new EditMessageText();
            editMessageText.setText(i + "");
            editMessageText.setChatId(chatId);
            editMessageText.setMessageId(messageId);

            try {
                execute(editMessageText);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }

            DeleteMessage deleteMessage = new DeleteMessage();
            deleteMessage.setChatId(chatId);
            deleteMessage.setMessageId(messageId);

            try {
                execute(deleteMessage);
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
