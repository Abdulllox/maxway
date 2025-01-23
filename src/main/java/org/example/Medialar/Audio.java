package org.example.Medialar;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendAudio;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Audio extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasAudio()) {
            org.telegram.telegrambots.meta.api.objects.Audio audio = update.getMessage().getAudio();
            Long chatId = update.getMessage().getChatId();

            SendAudio sendAudio = new SendAudio();
            sendAudio.setAudio(new InputFile(audio.getFileId()));
            sendAudio.setChatId(chatId);
            sendAudio.setCaption("Siz yuborgan audio habar");

            try {
                execute(sendAudio);
            } catch (TelegramApiException e) {
                e.printStackTrace();
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
