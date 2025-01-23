package org.example.Project;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.ForwardMessage;
import org.telegram.telegrambots.meta.api.methods.ParseMode;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Shoxclinika extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String text = update.getMessage().getText();
            Long chatId = update.getMessage().getChatId();

            if (text.equals("/start")) {
                SendMessage message = new SendMessage();
                message.setText("Tilni tanlang");
                message.setChatId(chatId);
                message.setReplyMarkup(menuLanguageButton());

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("\uD83D\uDCB3 'Shox Med' kartasi")) {
                SendMessage message = new SendMessage();
                message.setText("Marhamat");
                message.setChatId(chatId);
                message.setReplyMarkup(medkarta());

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }else if (text.equals("\uD83D\uDCDD Fikr-mulohaza \uD83D\uDC4D\uD83D\uDC4E")){
                SendMessage message = new SendMessage();
                message.setText("Iltimos telefon raqamingizni yuboring (Namuna: +998999999999) \uD83D\uDCF2");
                message.setChatId(chatId);
                message.setReplyMarkup(fikrmuloxaza());

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }else if (text.equals("\uD83E\uDDFE Qabul")){
                SendMessage message = new SendMessage();
                message.setText("Qabulga yozilish uchun kerakli bo'limni tanlang.");
                message.setChatId(chatId);
                message.setReplyMarkup(qabul());

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }else if (text.equals("✅ Natijalar")){
                SendMessage message = new SendMessage();
                message.setText("Namunada ko'rsatilgandek ID va Parol ni kiriting.  ID bo'sh joy Parol. \n" +
                        "\n" +
                        "Namuna: 123456 ABCD12");
                message.setChatId(chatId);
                message.setReplyMarkup(natijalar());

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }else if (text.equals("\uD83D\uDE48 Shifokor yozuvini o'qib berish")){
                SendMessage message = new SendMessage();
                message.setText("Iltimos telefon raqamingizni yuboring (Namuna: +998999999999) \uD83D\uDCF2");
                message.setChatId(chatId);
                message.setReplyMarkup(shifokor());

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }else if (text.equals("\uD83D\uDD0E Xizmatlarni qidirish (narx)")){
                qidirish(update);

            }else if (text.equals("\uD83D\uDCF2 Qo'ng'iroq buyurtma qilish")){
                SendMessage message = new SendMessage();
                message.setText("Iltimos telefon raqamingizni yuboring (Namuna: +998999999999) \uD83D\uDCF2");
                message.setChatId(chatId);
                message.setReplyMarkup(qongiroq());

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }else if (text.equals("\uD83D\uDE91 Tez yordamni chaqirish")){
                SendMessage message = new SendMessage();
                message.setText("Iltimos telefon raqamingizni yuboring (Namuna: +998999999999) \uD83D\uDCF2");
                message.setChatId(chatId);
                message.setReplyMarkup(tezyordam());

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }else if (text.equals("☎\uFE0F Biz bilan bog'lanish")){
                SendMessage message = new SendMessage();
                message.setText("✅ SHOX MED CENTER\n" +
                        "\uD83D\uDCCD Manzil: Toshkent shahar, Mirobod tumani, Oybek ko'chasi, 34\n" +
                        "\n" +
                        "☎\uFE0F Telefon raqam:\n" +
                        " Call center: 1183\n" +
                        " +998 (71) 202-02-12\n" +
                        "\n" +
                        "⏱\uFE0F Ish vaqtlari: 24/7.\n" +
                        "\n" +
                        "✅ SHOX INTERNATIONAL HOSPITAL\n" +
                        "\uD83D\uDCCD Manzil: Toshkent shahar, Yakkasaroy tumani, Kichik Xalqa Yo'li ko'chasi, 70a\n" +
                        "\n" +
                        "☎\uFE0F Telefon raqam:\n" +
                        " Call center: 1183\n" +
                        " +998 (71) 207-00-17\n" +
                        "\n" +
                        "⏱\uFE0F Ish vaqtlari: 24/7.\n" +
                        "\n" +
                        "✅ MED ZDOROVAYA SEMYA CENTER\n" +
                        "\uD83D\uDCCD Manzil: Toshkent shahar, Chilonzor tumani 11-kvarta, Maqsud Shayx-Zoda ko'chasi, 31A\n" +
                        "\n" +
                        "☎\uFE0F Telefon raqam:\n" +
                        " Call center: 1183\n" +
                        " +998 (71) 207-10-51\n" +
                        "\n" +
                        "⏱\uFE0F Ish vaqtlari: 24/7.\n" +
                        "\n" +
                        "✅ SHOX MED PEDIATRIYA\n" +
                        "\uD83D\uDCCD Manzil: Toshkent 4-oʻtish Xushnava, 26/2\n" +
                        "\n" +
                        "☎\uFE0F Telefon raqam:\n" +
                        " Call center: 1183\n" +
                        " +998 (55) 519-11-83\n" +
                        "\n" +
                        "⏱\uFE0F Ish vaqtlari: 24/7.");
                message.setChatId(chatId);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }else if (text.equals("\uD83D\uDCCD Bizning manzillarimiz")){
                SendMessage message = new SendMessage();
                message.setChatId(chatId);
                message.setText("Iltimos filialni tanlang:");
                message.setReplyMarkup(manzilimiz());

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }else if (text.equals("\uD83D\uDE9A\uD83D\uDD2C Ko'chib yuruvchi laboratoriya")){
                SendMessage message = new SendMessage();
                message.setText("Iltimos telefon raqamingizni yuboring (Namuna: +998999999999) \uD83D\uDCF2");
                message.setChatId(chatId);
                message.setReplyMarkup(labarotorya());

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }else if (text.equals("\uD83C\uDDFA\uD83C\uDDFF Tilni o'zgartirish")){
                SendMessage message = new SendMessage();
                message.setText("Tilni tanlang");
                message.setChatId(chatId);
                message.setReplyMarkup(menuLanguageButton());

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
        } else if (update.hasCallbackQuery()) {
            String data = update.getCallbackQuery().getData();
            Long chatId = update.getCallbackQuery().getMessage().getChatId();

            if (data.equals("uz")) {
                SendMessage message = new SendMessage();
                message.setParseMode(ParseMode.HTML);
                message.setText("Ushbu bot Shox International Hospital xizmatlari haqida ma'lumot olishingizga yordam beradi.");
                message.setChatId(chatId);
                message.setReplyMarkup(menu());
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private ReplyKeyboard menuLanguageButton() {
        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();

        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("\uD83C\uDDFA\uD83C\uDDFFO'zbek tili");
        button1.setCallbackData("uz");

        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("\uD83C\uDDF7\uD83C\uDDFARus Tili");
        button2.setCallbackData("rus");


        List<InlineKeyboardButton> row1 = new ArrayList<>();
        row1.add(button1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        row2.add(button2);

        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        rowList.add(row1);
        rowList.add(row2);

        markup.setKeyboard(rowList);
        return markup;
    }

    private ReplyKeyboardMarkup menu() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83D\uDCB3 'Shox Med' kartasi");

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83D\uDCDD Fikr-mulohaza \uD83D\uDC4D\uD83D\uDC4E");

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("\uD83E\uDDFE Qabul");

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("✅ Natijalar");

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("\uD83D\uDE48 Shifokor yozuvini o'qib berish");

        KeyboardButton button6 = new KeyboardButton();
        button6.setText("\uD83D\uDD0E Xizmatlarni qidirish (narx)");

        KeyboardButton button7 = new KeyboardButton();
        button7.setText("\uD83D\uDCF2 Qo'ng'iroq buyurtma qilish");

        KeyboardButton button88 = new KeyboardButton();
        button88.setText("\uD83D\uDE91 Tez yordamni chaqirish");

        KeyboardButton button8 = new KeyboardButton();
        button8.setText("☎\uFE0F Biz bilan bog'lanish");

        KeyboardButton button9 = new KeyboardButton();
        button9.setText("\uD83D\uDCCD Bizning manzillarimiz");

        KeyboardButton button10 = new KeyboardButton();
        button10.setText("\uD83D\uDE9A\uD83D\uDD2C Ko'chib yuruvchi laboratoriya");

        KeyboardButton button11 = new KeyboardButton();
        button11.setText("\uD83C\uDDFA\uD83C\uDDFF Tilni o'zgartirish");

        KeyboardRow row1 = new KeyboardRow();
        row1.add(button1);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(button2);

        KeyboardRow row3 = new KeyboardRow();
        row3.add(button3);
        row3.add(button4);

        KeyboardRow row4 = new KeyboardRow();
        row4.add(button5);
        row4.add(button6);

        KeyboardRow row5 = new KeyboardRow();
        row5.add(button7);
        row5.add(button88);

        KeyboardRow row6 = new KeyboardRow();
        row6.add(button8);
        row6.add(button9);

        KeyboardRow row7 = new KeyboardRow();
        row7.add(button10);
        row7.add(button11);

        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row4);
        rowList.add(row5);
        rowList.add(row6);
        rowList.add(row7);

        markup.setKeyboard(rowList);
        return markup;

    }

    private ReplyKeyboard medkarta(){
        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();

        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Tafsilotlar");
        button1.setCallbackData("taf");

        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Elektron karta");
        button2.setCallbackData("karta");

        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("qaytish");
        button3.setCallbackData("qaytw");


        List<InlineKeyboardButton> row1 = new ArrayList<>();
        row1.add(button1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        row2.add(button2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        row3.add(button3);

        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);

        markup.setKeyboard(rowList);
        return markup;
    }

    private ReplyKeyboardMarkup fikrmuloxaza(){
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Mening raqamimni yuborish");
        button1.setRequestContact(true);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Bekor qilish");

        KeyboardRow row = new KeyboardRow();
        row.add(button1);

        KeyboardRow row1 = new KeyboardRow();
        row1.add(button2);

        ArrayList<KeyboardRow> rows = new ArrayList<>();
        rows.add(row);
        rows.add(row1);

        markup.setKeyboard(rows);
        return markup;
    }

    private ReplyKeyboard qabul(){
        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();

        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("MSKT");
        button1.setCallbackData("mskt");

        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("MRT");
        button2.setCallbackData("mrt");

        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("UZI");
        button3.setCallbackData("uzi");

        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("RENTGEN");
        button4.setCallbackData("rent");

        InlineKeyboardButton button5 = new InlineKeyboardButton();
        button5.setText("MUTAXASSISLAR");
        button5.setCallbackData("MUTA");

        InlineKeyboardButton button6 = new InlineKeyboardButton();
        button6.setText("Bekor qilish");
        button6.setCallbackData("bekor");

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        row1.add(button1);
        row1.add(button2);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        row2.add(button3);
        row2.add(button4);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        row3.add(button5);
        row3.add(button6);

        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);

        markup.setKeyboard(rowList);
        return markup;
    }

    private ReplyKeyboardMarkup natijalar(){
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Bekor qilish");

        KeyboardRow row = new KeyboardRow();
        row.add(button1);

        ArrayList<KeyboardRow> rows = new ArrayList<>();
        rows.add(row);

        markup.setKeyboard(rows);
        return markup;
    }

    private ReplyKeyboardMarkup shifokor() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Mening raqamimni yuborish");
        button1.setRequestContact(true);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Bekor qilish");

        KeyboardRow row = new KeyboardRow();
        row.add(button1);

        KeyboardRow row1 = new KeyboardRow();
        row1.add(button2);

        ArrayList<KeyboardRow> rows = new ArrayList<>();
        rows.add(row);
        rows.add(row1);

        markup.setKeyboard(rows);
        return markup;

    }

    private void qidirish(Update update) {
        Message message = update.getMessage();
        String text = message.getText();
        Long chatId = message.getChatId();

        if (text.equals("\uD83D\uDD0E Xizmatlarni qidirish (narx)")) {
            List<List<InlineKeyboardButton>> rowList = new LinkedList<>();
            List<InlineKeyboardButton> row = new LinkedList<>();

            InlineKeyboardButton button = new InlineKeyboardButton();
            button.setText("Qidirish");
            button.setSwitchInlineQueryCurrentChat("Matnni kiriting : ");

            row.add(button);
            rowList.add(row);

            InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
            inlineKeyboardMarkup.setKeyboard(rowList);

            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(chatId);
            sendMessage.setText("Qidirish uchun quyidagi tugmachani bosing \uD83D\uDC47");
            sendMessage.setReplyMarkup(inlineKeyboardMarkup);

            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }


            ForwardMessage forwardMessage = new ForwardMessage();
            forwardMessage.setChatId("Your Admin Id");
            forwardMessage.setMessageId(message.getMessageId());
            forwardMessage.setFromChatId(message.getChatId());

            try {
                execute(forwardMessage);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private ReplyKeyboardMarkup qongiroq(){
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Mening raqamimni yuborish");
        button1.setRequestContact(true);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Bekor qilish");

        KeyboardRow row = new KeyboardRow();
        row.add(button1);

        KeyboardRow row1 = new KeyboardRow();
        row1.add(button2);

        ArrayList<KeyboardRow> rows = new ArrayList<>();
        rows.add(row);
        rows.add(row1);

        markup.setKeyboard(rows);
        return markup;
    }

    private ReplyKeyboardMarkup tezyordam(){
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Mening raqamimni yuborish");
        button1.setRequestContact(true);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Bekor qilish");

        KeyboardRow row = new KeyboardRow();
        row.add(button1);

        KeyboardRow row1 = new KeyboardRow();
        row1.add(button2);

        ArrayList<KeyboardRow> rows = new ArrayList<>();
        rows.add(row);
        rows.add(row1);

        markup.setKeyboard(rows);
        return markup;
    }

    private ReplyKeyboardMarkup manzilimiz(){
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("SHOX MED CENTER");

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("MED ZDOROVAYA SEMYA CENTER");

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("SHOX INTERNATIONAL");

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("SHOX MED PEDIATRIYA");

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("Qaytish");

        KeyboardRow row1 = new KeyboardRow();
        row1.add(button1);
        row1.add(button2);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(button3);
        row2.add(button4);

        KeyboardRow row4 = new KeyboardRow();
        row4.add(button5);

        ArrayList<KeyboardRow> rows = new ArrayList<>();
        rows.add(row1);
        rows.add(row2);
        rows.add(row4);

        markup.setKeyboard(rows);
        return markup;
    }

    private ReplyKeyboardMarkup labarotorya(){
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Mening raqamimni yuborish");
        button1.setRequestContact(true);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Bekor qilish");

        KeyboardRow row = new KeyboardRow();
        row.add(button1);

        KeyboardRow row1 = new KeyboardRow();
        row1.add(button2);

        ArrayList<KeyboardRow> rows = new ArrayList<>();
        rows.add(row);
        rows.add(row1);

        markup.setKeyboard(rows);
        return markup;
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
