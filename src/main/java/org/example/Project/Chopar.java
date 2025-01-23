package org.example.Project;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.ParseMode;
import org.telegram.telegrambots.meta.api.methods.send.*;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;

import static java.awt.SystemColor.text;

public class Chopar extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String text = update.getMessage().getText();
            Long chatId = update.getMessage().getChatId();

            if (text.equals("/start")) {

                SendMessage message = new SendMessage();
                message.setText("Assalomu alaykum! Chopar Pizza yetkazib berish xizmatiga xush kelibsiz.\n" +
                        "\n" +
                        "Здравствуйте! Добро пожаловать в службу доставки Chopar Pizza.\n" +
                        "\n" +
                        "Hello! Welcome to Chopar Pizza delivery service.");
                message.setChatId(chatId);
                message.setReplyMarkup(menuLanguageButton());

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }


            } else if (text.equals("Toshkent")) {
                ReplyKeyboardMarkup markup = mainSearch1();
                SendMessage message = new SendMessage();
                message.setText("Bosh menyu");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }


            } else if (text.equals("Chirchiq")) {
                ReplyKeyboardMarkup markup = mainSearch1();
                SendMessage message = new SendMessage();
                message.setText("Bosh menyu");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Qo'qand")) {
                ReplyKeyboardMarkup markup = mainSearch1();
                SendMessage message = new SendMessage();
                message.setText("Bosh menyu");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Andijon")) {
                ReplyKeyboardMarkup markup = mainSearch1();
                SendMessage message = new SendMessage();
                message.setText("Bosh menyu");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Qo'qon")) {
                ReplyKeyboardMarkup markup = mainSearch1();
                SendMessage message = new SendMessage();
                message.setText("Bosh menyu");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Farg'ona")) {
                ReplyKeyboardMarkup markup = mainSearch1();
                SendMessage message = new SendMessage();
                message.setText("Bosh menyu");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Nukus")) {
                ReplyKeyboardMarkup markup = mainSearch1();
                SendMessage message = new SendMessage();
                message.setText("Bosh menyu");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Marg'ilon")) {
                ReplyKeyboardMarkup markup = mainSearch1();
                SendMessage message = new SendMessage();
                message.setText("Bosh menyu");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Xorazm")) {
                ReplyKeyboardMarkup markup = mainSearch1();
                SendMessage message = new SendMessage();
                message.setText("Bosh menyu");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Tashkent")) {
                ReplyKeyboardMarkup markup = mainSearch2();
                SendMessage message = new SendMessage();
                message.setText("Main menu");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("ChirChiq")) {
                ReplyKeyboardMarkup markup = mainSearch2();
                SendMessage message = new SendMessage();
                message.setText("Main menu");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Qoqand")) {
                ReplyKeyboardMarkup markup = mainSearch2();
                SendMessage message = new SendMessage();
                message.setText("Main menu");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Andijan")) {
                ReplyKeyboardMarkup markup = mainSearch2();
                SendMessage message = new SendMessage();
                message.setText("Main menu");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Qoqon")) {
                ReplyKeyboardMarkup markup = mainSearch2();
                SendMessage message = new SendMessage();
                message.setText("Main menu");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Fargana")) {
                ReplyKeyboardMarkup markup = mainSearch2();
                SendMessage message = new SendMessage();
                message.setText("Main menu");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals(".Nukus")) {
                ReplyKeyboardMarkup markup = mainSearch2();
                SendMessage message = new SendMessage();
                message.setText("Main menu");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Margilan")) {
                ReplyKeyboardMarkup markup = mainSearch2();
                SendMessage message = new SendMessage();
                message.setText("Main menu");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Xorezm")) {
                ReplyKeyboardMarkup markup = mainSearch2();
                SendMessage message = new SendMessage();
                message.setText("Main menu");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Ташкент")) {
                ReplyKeyboardMarkup markup = mainSearch3();
                SendMessage message = new SendMessage();
                message.setText("главное меню");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Чирчик")) {
                ReplyKeyboardMarkup markup = mainSearch3();
                SendMessage message = new SendMessage();
                message.setText("главное меню");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Коканд")) {
                ReplyKeyboardMarkup markup = mainSearch3();
                SendMessage message = new SendMessage();
                message.setText("главное меню");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Андижан")) {
                ReplyKeyboardMarkup markup = mainSearch3();
                SendMessage message = new SendMessage();
                message.setText("главное меню");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Фергана")) {
                ReplyKeyboardMarkup markup = mainSearch3();
                SendMessage message = new SendMessage();
                message.setText("главное меню");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Нукус")) {
                ReplyKeyboardMarkup markup = mainSearch3();
                SendMessage message = new SendMessage();
                message.setText("главное меню");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Маргилан")) {
                ReplyKeyboardMarkup markup = mainSearch3();
                SendMessage message = new SendMessage();
                message.setText("главное меню");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Хорезм")) {
                ReplyKeyboardMarkup markup = mainSearch3();
                SendMessage message = new SendMessage();
                message.setText("главное меню");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("\uD83C\uDF55Buyurtma berish")) {
                ReplyKeyboardMarkup markup = mainAbout1();
                SendMessage message = new SendMessage();
                message.setText("Buyurtmani o'zingiz  \uD83D\uDE4B\u200D♂\uFE0F olib keting yoki Yetkazib \uD83D\uDE99 berishni tanlang");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("⬅️\uFE0F Orqaga")) {
                ReplyKeyboardMarkup markup = mainSearch1();
                SendMessage message = new SendMessage();
                message.setText("Bosh menyu");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("⬅️\uFE0F Back")) {
                ReplyKeyboardMarkup markup = mainAbout2();
                SendMessage message = new SendMessage();
                message.setText("Bosh menyu");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("⬅️\uFE0F Backs")) {
                ReplyKeyboardMarkup markup = mainSearch2();
                SendMessage message = new SendMessage();
                message.setText("Bosh menyu");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("\uD83D\uDDFAMy addresses")) {
                SendMessage message = new SendMessage();
                message.setText("No data");
                message.setChatId(chatId);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("\uD83D\uDDFA Mening manzillarim")) {
                SendMessage message = new SendMessage();
                message.setText("Ma'lumot yoq");
                message.setChatId(chatId);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("\uD83D\uDDFA Мои адреса")) {
                SendMessage message = new SendMessage();
                message.setText("Нравится информация");
                message.setChatId(chatId);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("⬅️\uFE0F Назад")) {
                ReplyKeyboardMarkup markup = mainAbout3();
                SendMessage message = new SendMessage();
                message.setText("Bosh menyu");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("⬅️\uFE0F Назадs")) {
                ReplyKeyboardMarkup markup = mainSearch3();
                SendMessage message = new SendMessage();
                message.setText("Bosh menyu");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("\uD83C\uDF55Place an order")) {
                ReplyKeyboardMarkup markup = mainAbout2();
                SendMessage message = new SendMessage();

                message.setText("Pick up your order yourself  \uD83D\uDE4B\u200D♂\uFE0F or choose Delivery \uD83D\uDE99");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("\uD83C\uDF55Разместить заказ")) {
                ReplyKeyboardMarkup markup = mainAbout3();
                SendMessage message = new SendMessage();
                message.setText("Заберите заказ сами \uD83D\uDE4B\u200D♂\uFE0F или выберите «Доставка» \uD83D\uDE99");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Telefon raqamini jo'natish")) {
                ReplyKeyboardMarkup markup = mainAbout1();
                SendMessage message = new SendMessage();
                message.setText("Biz bilan bog'lanish uchun quyidagi raqamlarga telefon qiling" +
                        "+998971756999");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            } else if (text.equals("\uD83D\uDCCDEng yaqin fillialni aniqlash")) {
                SendLocation location = new SendLocation();
                double longitude = 41.2349931;
                double latitude = 69.2053093;

                location.setLatitude(longitude);
                location.setLongitude(latitude);
                location.setChatId(chatId);

                ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                KeyboardRow row = new KeyboardRow();
                KeyboardButton button = new KeyboardButton();
                button.setText("Lokatsiyani ulashish");
                row.add(button);
                button.setRequestLocation(true);
                List<KeyboardRow> rowList = new ArrayList<>();
                rowList.add(row);
                markup.setKeyboard(rowList);
                markup.setResizeKeyboard(true);

                location.setReplyMarkup(markup);
                try {
                    execute(location);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            } else if (text.equals("\uD83D\uDCCDIdentifying the nearest branch")) {
                SendLocation location = new SendLocation();
                double longitude = 43.2349931;
                double latitude = 62.2053093;

                location.setLatitude(longitude);
                location.setLongitude(latitude);
                location.setChatId(chatId);

                ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                KeyboardRow row = new KeyboardRow();
                KeyboardButton button = new KeyboardButton();
                button.setText("Location sharing");
                row.add(button);
                button.setRequestLocation(true);
                List<KeyboardRow> rowList = new ArrayList<>();
                rowList.add(row);
                markup.setKeyboard(rowList);
                markup.setResizeKeyboard(true);

                location.setReplyMarkup(markup);
                try {
                    execute(location);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            } else if (text.equals("\uD83D\uDCCDОпределение ближайшего отделения")) {
                SendLocation location = new SendLocation();
                double longitude = 56.2349931;
                double latitude = 36.2053093;

                location.setLatitude(longitude);
                location.setLongitude(latitude);
                location.setChatId(chatId);

                ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                KeyboardRow row = new KeyboardRow();
                KeyboardButton button = new KeyboardButton();
                button.setText("Передача местоположения");
                row.add(button);
                button.setRequestLocation(true);
                List<KeyboardRow> rowList = new ArrayList<>();
                rowList.add(row);
                markup.setKeyboard(rowList);
                markup.setResizeKeyboard(true);

                location.setReplyMarkup(markup);
                try {
                    execute(location);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            } else if (text.equals("\uD83E\uDDD1\uD83C\uDFFB\u200D\uD83E\uDDAFOlib ketish")) {
                ReplyKeyboardMarkup markup = mainNews();
                SendMessage message = new SendMessage();
                message.setText("Qayerdasiz \uD83D\uDC40? Agar lokatsiyangizni\uD83D\uDCCD yuborsangiz, sizga eng yaqin filialni aniqlaymiz ");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            } else if (text.equals("Lavash")) {
                SendMessage message = new SendMessage();
                message.setText("Muvaffaqqiyatli!🏆 \nBuyurtmangiz qabul qilindi.");
                message.setChatId(chatId);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Burger")) {
                SendMessage message = new SendMessage();
                message.setText("Muvaffaqqiyatli!🏆 \nBuyurtmangiz qabul qilindi.");
                message.setChatId(chatId);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("\uD83D\uDE4B\uD83C\uDFFBJamoamizga qo'shiling")) {
                ReplyKeyboardMarkup markup = mainJamoa();
                SendMessage message = new SendMessage();
                message.setText("Ahil jamoamizda ishlashga taklif qilamiz! Telegramdan chiqmay, shu yerning o'zida anketani to'ldirish uchun quyidagi tugmani bosing.");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Pitsa")) {
                SendMessage message = new SendMessage();
                message.setText("Muvaffaqqiyatli!🏆 \nBuyurtmangiz qabul qilindi.");
                message.setChatId(chatId);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Klab Sendvichs")) {
                SendMessage message = new SendMessage();
                message.setText("Muvaffaqqiyatli!🏆 \nBuyurtmangiz qabul qilindi.");
                message.setChatId(chatId);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Chizburger")) {
                SendMessage message = new SendMessage();
                message.setText("Muvaffaqqiyatli!🏆 \nBuyurtmangiz qabul qilindi.");
                message.setChatId(chatId);
                try {

                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("KFC")) {
                SendMessage message = new SendMessage();
                message.setText("Muvaffaqqiyatli!🏆 \nBuyurtmangiz qabul qilindi.");
                message.setChatId(chatId);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Donar")) {
                SendMessage message = new SendMessage();
                message.setText("Muvaffaqqiyatli!🏆 \nBuyurtmangiz qabul qilindi.");
                message.setChatId(chatId);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Shovurma")) {
                SendMessage message = new SendMessage();
                message.setText("Muvaffaqqiyatli!🏆 \nBuyurtmangiz qabul qilindi.");
                message.setChatId(chatId);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Stake")) {
                SendMessage message = new SendMessage();
                message.setText("Muvaffaqqiyatli!🏆 \nBuyurtmangiz qabul qilindi.");
                message.setChatId(chatId);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Hot-dog")) {
                SendMessage message = new SendMessage();
                message.setText("Muvaffaqqiyatli!🏆 \nBuyurtmangiz qabul qilindi.");
                message.setChatId(chatId);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("\uD83E\uDDD1\uD83C\uDFFB\u200D\uD83E\uDDAFTake away")) {
                ReplyKeyboardMarkup markup = mainNews2();
                SendMessage message = new SendMessage();
                message.setText("Where are you \uD83D\uDC40? If you send us your location\uD83D\uDCCD, we will find the nearest branch to you");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            } else if (text.equals("\uD83E\uDDD1\uD83C\uDFFB\u200D\uD83E\uDDAFЕда на вынос")) {
                ReplyKeyboardMarkup markup = mainNews3();
                SendMessage message = new SendMessage();
                message.setText("Где ты \uD83D\uDC40? Если вы отправите нам свое местоположение\uD83D\uDCCD, мы найдем ближайшее к вам отделение.");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            } else if (text.equals("\uD83D\uDE99Yetkazib berish")) {
                ReplyKeyboardMarkup markup = mainDelivery();
                SendMessage message = new SendMessage();
                message.setText("Buyurtmangizni qayerga yetkazib berish kerak \uD83D\uDE99? Agar lokatsiyangizni\uD83D\uDCCD yuborsangiz, sizga eng yaqin filialni aniqlaymiz.");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("\uD83D\uDE99Delivery")) {
                ReplyKeyboardMarkup markup = mainDelivery2();
                SendMessage message = new SendMessage();
                message.setText("Where should your order be delivered \uD83D\uDE99? If you send us your location\uD83D\uDCCD, we will find the nearest branch to you.");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("\uD83D\uDE99Доставка")) {
                ReplyKeyboardMarkup markup = mainDelivery3();
                SendMessage message = new SendMessage();
                message.setText("Куда доставить ваш заказ \uD83D\uDE99? Если вы отправите нам свое местоположение\uD83D\uDCCD, мы найдем ближайшее к вам отделение.");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Fillialni tanlang")) {
                ReplyKeyboardMarkup markup = mainFlial();
                SendMessage message = new SendMessage();
                message.setText("Qaysi filialdan olib ketishni tanlang");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Выберите филиал")) {
                ReplyKeyboardMarkup markup = mainFlial3();
                SendMessage message = new SendMessage();
                message.setText("Выберите, в каком отделении забрать");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Select branch")) {
                ReplyKeyboardMarkup markup = mainFlial2();
                SendMessage message = new SendMessage();
                message.setText("Choose which branch to pick up from");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Bu yerda buyurtma berish \uD83C\uDF10")) {
                ReplyKeyboardMarkup markup = mainNews();
                SendMessage message = new SendMessage();
                message.setText(" https://choparpizza.uz/");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            } else if (text.equals("Заказать здесь\uD83C\uDF10")) {
                ReplyKeyboardMarkup markup = mainNews3();
                SendMessage message = new SendMessage();
                message.setText(" https://choparpizza.uz/");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            } else if (text.equals("Order here \uD83C\uDF10")) {
                ReplyKeyboardMarkup markup = mainNews2();
                SendMessage message = new SendMessage();
                message.setText(" https://choparpizza.uz/");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            } else if (text.equals("Zenit")) {
                ReplyKeyboardMarkup markup = mainMenu1();
                SendMessage message = new SendMessage();
                message.setText("Iltimos menudan buyurtma qiling");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Eco Park")) {
                ReplyKeyboardMarkup markup = mainMenu1();
                SendMessage message = new SendMessage();
                message.setText("Iltimos menudan buyurtma qiling");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("S.Rahimov")) {
                ReplyKeyboardMarkup markup = mainMenu1();
                SendMessage message = new SendMessage();
                message.setText("Iltimos menudan buyurtma qiling");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Nukus Asia.uz KSM")) {
                ReplyKeyboardMarkup markup = mainMenu1();
                SendMessage message = new SendMessage();
                message.setText("Iltimos menudan buyurtma qiling");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Atlas Chimgen")) {
                ReplyKeyboardMarkup markup = mainMenu1();
                SendMessage message = new SendMessage();
                message.setText("Iltimos menudan buyurtma qiling");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Magaplanet KSM")) {
                ReplyKeyboardMarkup markup = mainMenu1();
                SendMessage message = new SendMessage();
                message.setText("Iltimos menudan buyurtma qiling");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Perus KSM")) {
                ReplyKeyboardMarkup markup = mainMenu1();
                SendMessage message = new SendMessage();
                message.setText("Iltimos menudan buyurtma qiling");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            } else if (text.equals("Markaz-5")) {
                ReplyKeyboardMarkup markup = mainMenu1();
                SendMessage message = new SendMessage();
                message.setText("Iltimos menudan buyurtma qiling");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Farhod")) {
                ReplyKeyboardMarkup markup = mainMenu1();
                SendMessage message = new SendMessage();
                message.setText("Iltimos menudan buyurtma qiling");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Ko'kcha")) {
                ReplyKeyboardMarkup markup = mainMenu1();
                SendMessage message = new SendMessage();
                message.setText("Iltimos menudan buyurtma qiling");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Qo'yliq-5")) {
                ReplyKeyboardMarkup markup = mainMenu1();
                SendMessage message = new SendMessage();
                message.setText("Iltimos menudan buyurtma qiling");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Sergeli-2")) {
                ReplyKeyboardMarkup markup = mainMenu1();
                SendMessage message = new SendMessage();
                message.setText("Iltimos menudan buyurtma qiling");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("⬅️\uFE0F Ortga")) {
                ReplyKeyboardMarkup markup = mainAbout1();
                SendMessage message = new SendMessage();
                message.setText("Qayerdasiz \uD83D\uDC40? Agar lokatsiyangizni\uD83D\uDCCD yuborsangiz, sizga eng yaqin filialni aniqlaymiz");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
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
                message.setText("Qaysi shaharda yashisiz?\n" +
                        "Iltimos,shaharni tanlen");
                message.setChatId(chatId);
                message.setReplyMarkup(mainMenuUz());
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (data.equals("eng")) {
                SendMessage message = new SendMessage();
                message.setParseMode(ParseMode.HTML);
                message.setText("Where are you live?\n" +
                        "Please! Enter your Accomodation");
                message.setChatId(chatId);
                message.setReplyMarkup(mainMenuEng());
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (data.equals("rus")) {
                SendMessage message = new SendMessage();
                message.setParseMode(ParseMode.HTML);
                message.setText("В каком городе Вы живёте?\n" +
                        "Пожалуйста, выберите город:");
                message.setChatId(chatId);
                message.setReplyMarkup(mainMenuRus());
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("☎️\uFE0FChopar bilan aloqa")) {
                ReplyKeyboardMarkup markup = mainMedic();
                SendMessage message = new SendMessage();
                message.setText("Agar siz bizga yozsangiz yoki sharh qoldirmoqchi bo'lsangiz, xursand bo'lamiz.");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    }

    public InlineKeyboardMarkup menuLanguageButton() {
        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();


        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("\uD83C\uDDF7\uD83C\uDDFA Русский");
        button1.setCallbackData("rus");
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("\uD83C\uDDFA\uD83C\uDDFF O'zbekcha");
        button2.setCallbackData("uz");
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("\uD83C\uDDFA\uD83C\uDDF8 English");
        button3.setCallbackData("eng");


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

    public ReplyKeyboardMarkup mainMenuUz() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Toshkent");

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Chirchiq");

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Qo'qand");

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Andijon");

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("Qo'qon");

        KeyboardButton button6 = new KeyboardButton();
        button6.setText("Farg'ona");

        KeyboardButton button7 = new KeyboardButton();
        button7.setText("Nukus");

        KeyboardButton button8 = new KeyboardButton();
        button8.setText("Marg'ilon");

        KeyboardButton button9 = new KeyboardButton();
        button9.setText("Xorazm");

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

        KeyboardRow row5 = new KeyboardRow();
        row5.add(button9);

        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row4);
        rowList.add(row5);
        markup.setKeyboard(rowList);
        markup.setOneTimeKeyboard(true);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);
        return markup;
    }

    public ReplyKeyboardMarkup mainMenuEng() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Tashkent");

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("ChirChiq");

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Qoqand");

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Andijan");

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("Qoqon");

        KeyboardButton button6 = new KeyboardButton();
        button6.setText("Fargana");

        KeyboardButton button7 = new KeyboardButton();
        button7.setText(".Nukus");

        KeyboardButton button8 = new KeyboardButton();
        button8.setText("Margilan");

        KeyboardButton button9 = new KeyboardButton();
        button9.setText("Xorezm");

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

        KeyboardRow row5 = new KeyboardRow();
        row5.add(button9);

        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row4);
        rowList.add(row5);
        markup.setKeyboard(rowList);
        markup.setOneTimeKeyboard(true);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);
        return markup;
    }

    public ReplyKeyboardMarkup mainMenuRus() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Ташкент");

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Чирчик");

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Коканд");

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Фергана");

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("Нукус");

        KeyboardButton button6 = new KeyboardButton();
        button6.setText("Маргилан");

        KeyboardButton button7 = new KeyboardButton();
        button7.setText("Хорезм");

        KeyboardButton button8 = new KeyboardButton();
        button8.setText("Андижан");

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


        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row4);
        markup.setKeyboard(rowList);
        markup.setOneTimeKeyboard(true);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);
        return markup;
    }

    public ReplyKeyboardMarkup mainSearch1() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83C\uDF55Buyurtma berish");

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83D\uDCD6Buyurtmalar tarixi");

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("☎️\uFE0FChopar bilan aloqa");

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("⚙️\uFE0FSozlash Ma'lumotlar");

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("\uD83D\uDE4B\uD83C\uDFFBJamoamizga qo'shiling");


        KeyboardRow row1 = new KeyboardRow();
        row1.add(button1);


        KeyboardRow row2 = new KeyboardRow();
        row2.add(button2);
        row2.add(button3);


        KeyboardRow row3 = new KeyboardRow();
        row3.add(button4);
        row3.add(button5);
        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        markup.setKeyboard(rowList);
        markup.setOneTimeKeyboard(true);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);
        return markup;

    }

    public ReplyKeyboardMarkup mainSearch2() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83C\uDF55Place an order");

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83D\uDCD6Order history");

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("☎️\uFE0FCommunication with Chopar");

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("⚙️\uFE0FSetting Information");

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("\uD83D\uDE4B\uD83C\uDFFBJoin our team");


        KeyboardRow row1 = new KeyboardRow();
        row1.add(button1);


        KeyboardRow row2 = new KeyboardRow();
        row2.add(button2);
        row2.add(button3);


        KeyboardRow row3 = new KeyboardRow();
        row3.add(button4);
        row3.add(button5);
        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        markup.setKeyboard(rowList);
        markup.setOneTimeKeyboard(true);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);
        return markup;

    }

    public ReplyKeyboardMarkup mainSearch3() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83C\uDF55Разместить заказ");

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83D\uDCD6История заказов");

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("☎️\uFE0FОбщение с Чопаром");

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("⚙️\uFE0FИнформация о настройке");

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("\uD83D\uDE4B\uD83C\uDFFBПрисоединяйтесь к нашей команде");


        KeyboardRow row1 = new KeyboardRow();
        row1.add(button1);


        KeyboardRow row2 = new KeyboardRow();
        row2.add(button2);
        row2.add(button3);


        KeyboardRow row3 = new KeyboardRow();
        row3.add(button4);
        row3.add(button5);
        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        markup.setKeyboard(rowList);
        markup.setOneTimeKeyboard(true);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);
        return markup;

    }

    public ReplyKeyboardMarkup mainAbout1() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83E\uDDD1\uD83C\uDFFB\u200D\uD83E\uDDAFOlib ketish");

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83D\uDE99Yetkazib berish");

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("⬅️\uFE0F Orqaga");

        KeyboardRow row1 = new KeyboardRow();
        row1.add(button1);
        row1.add(button2);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(button3);
        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(row1);
        rowList.add(row2);
        markup.setKeyboard(rowList);
        markup.setOneTimeKeyboard(true);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);
        return markup;
    }

    public ReplyKeyboardMarkup mainAbout2() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83E\uDDD1\uD83C\uDFFB\u200D\uD83E\uDDAFTake away");

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83D\uDE99Delivery");

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("⬅️\uFE0F Backs");

        KeyboardRow row1 = new KeyboardRow();
        row1.add(button1);
        row1.add(button2);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(button3);
        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(row1);
        rowList.add(row2);
        markup.setKeyboard(rowList);
        markup.setOneTimeKeyboard(true);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);
        return markup;
    }

    public ReplyKeyboardMarkup mainAbout3() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83E\uDDD1\uD83C\uDFFB\u200D\uD83E\uDDAFЕда на вынос");

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83D\uDE99Доставка");

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("⬅️\uFE0F Назадs");

        KeyboardRow row1 = new KeyboardRow();
        row1.add(button1);
        row1.add(button2);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(button3);
        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(row1);
        rowList.add(row2);
        markup.setKeyboard(rowList);
        markup.setOneTimeKeyboard(true);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);
        return markup;
    }


    public ReplyKeyboardMarkup mainNews() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("⬅️\uFE0F Ortga");

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83D\uDCCDEng yaqin fillialni aniqlash");

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Bu yerda buyurtma berish \uD83C\uDF10");

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Fillialni tanlang");
        KeyboardRow row1 = new KeyboardRow();
        row1.add(button1);
        row1.add(button2);


        KeyboardRow row2 = new KeyboardRow();
        row2.add(button3);
        row2.add(button4);
        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(row1);
        rowList.add(row2);
        markup.setKeyboard(rowList);
        markup.setOneTimeKeyboard(true);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);
        return markup;
    }

    public ReplyKeyboardMarkup mainNews2() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("⬅️\uFE0F Back");

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83D\uDCCDIdentifying the nearest branch");

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Order here \uD83C\uDF10");

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Select branch");
        KeyboardRow row1 = new KeyboardRow();
        row1.add(button1);
        row1.add(button2);


        KeyboardRow row2 = new KeyboardRow();
        row2.add(button3);
        row2.add(button4);
        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(row1);
        rowList.add(row2);
        markup.setKeyboard(rowList);
        markup.setOneTimeKeyboard(true);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);
        return markup;
    }

    public ReplyKeyboardMarkup mainNews3() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("⬅️\uFE0F Назад");

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83D\uDCCDОпределение ближайшего отделения");

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Заказать здесь\uD83C\uDF10");

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Выберите филиал");
        KeyboardRow row1 = new KeyboardRow();
        row1.add(button1);
        row1.add(button2);


        KeyboardRow row2 = new KeyboardRow();
        row2.add(button3);
        row2.add(button4);
        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(row1);
        rowList.add(row2);
        markup.setKeyboard(rowList);
        markup.setOneTimeKeyboard(true);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);
        return markup;
    }

    public ReplyKeyboardMarkup mainDelivery() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83D\uDCCDEng yaqin fillialni aniqlash");

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83D\uDDFA Mening manzillarim");

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("⬅️\uFE0F Ortga");

        KeyboardRow row1 = new KeyboardRow();
        row1.add(button1);
        KeyboardRow row2 = new KeyboardRow();
        row2.add(button2);
        row2.add(button3);
        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(row1);
        rowList.add(row2);
        markup.setKeyboard(rowList);
        markup.setOneTimeKeyboard(true);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);
        return markup;
    }

    public ReplyKeyboardMarkup mainDelivery2() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83D\uDCCDIdentifying the nearest branch");

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83D\uDDFAMy addresses");

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("⬅️\uFE0F Back");

        KeyboardRow row1 = new KeyboardRow();
        row1.add(button1);
        KeyboardRow row2 = new KeyboardRow();
        row2.add(button2);
        row2.add(button3);
        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(row1);
        rowList.add(row2);
        markup.setKeyboard(rowList);
        markup.setOneTimeKeyboard(true);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);
        return markup;
    }

    public ReplyKeyboardMarkup mainDelivery3() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83D\uDCCDОпределение ближайшего отделения");

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83D\uDDFA Мои адреса");

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("⬅️\uFE0F Назад");

        KeyboardRow row1 = new KeyboardRow();
        row1.add(button1);
        KeyboardRow row2 = new KeyboardRow();
        row2.add(button2);
        row2.add(button3);
        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(row1);
        rowList.add(row2);
        markup.setKeyboard(rowList);
        markup.setOneTimeKeyboard(true);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);
        return markup;
    }

    public ReplyKeyboardMarkup mainFlial() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Eco Park");

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Zenit");

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("S.Rahimov");

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Nukus Asia.uz KSM");

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("Atlas Chimgen");

        KeyboardButton button6 = new KeyboardButton();
        button6.setText("Magaplanet KSM");

        KeyboardButton button7 = new KeyboardButton();
        button7.setText("Perus KSM");

        KeyboardButton button8 = new KeyboardButton();
        button8.setText("Markaz-5");

        KeyboardButton button9 = new KeyboardButton();
        button9.setText("Farhod");

        KeyboardButton button10 = new KeyboardButton();
        button10.setText("Ko'kcha");

        KeyboardButton button11 = new KeyboardButton();
        button11.setText("Qo'yliq-5");

        KeyboardButton button12 = new KeyboardButton();
        button12.setText("Sergeli-2");

        KeyboardButton button13 = new KeyboardButton();
        button13.setText("⬅️\uFE0F Ortga");

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
        KeyboardRow row5 = new KeyboardRow();
        row5.add(button9);
        row5.add(button10);
        KeyboardRow row6 = new KeyboardRow();
        row6.add(button11);
        row6.add(button12);
        KeyboardRow row7 = new KeyboardRow();
        row7.add(button13);
        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row4);
        rowList.add(row5);
        rowList.add(row6);
        rowList.add(row7);
        markup.setKeyboard(rowList);
        markup.setOneTimeKeyboard(true);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);
        return markup;
    }

    public ReplyKeyboardMarkup mainFlial2() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Eco Park");

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Zenit");

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("S. Rahimov");

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Nukus Asia.uz KSM");

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("Atlas Chimgen");

        KeyboardButton button6 = new KeyboardButton();
        button6.setText("Magaplanet KSM");

        KeyboardButton button7 = new KeyboardButton();
        button7.setText("Perus KSM");

        KeyboardButton button8 = new KeyboardButton();
        button8.setText("Markaz-5");

        KeyboardButton button9 = new KeyboardButton();
        button9.setText("Farhod");

        KeyboardButton button10 = new KeyboardButton();
        button10.setText("Ko'kcha");

        KeyboardButton button11 = new KeyboardButton();
        button11.setText("Qo'yliq-5");

        KeyboardButton button12 = new KeyboardButton();
        button12.setText("Sergeli-2");

        KeyboardButton button13 = new KeyboardButton();
        button13.setText("⬅️\uFE0F Back");


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
        KeyboardRow row5 = new KeyboardRow();
        row5.add(button9);
        row5.add(button10);
        KeyboardRow row6 = new KeyboardRow();
        row6.add(button11);
        row6.add(button12);
        KeyboardRow row7 = new KeyboardRow();
        row7.add(button13);
        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row4);
        rowList.add(row5);
        rowList.add(row6);
        rowList.add(row7);
        markup.setKeyboard(rowList);
        markup.setOneTimeKeyboard(true);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);
        return markup;
    }

    public ReplyKeyboardMarkup mainFlial3() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Eco Park");

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Zenit");

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("S.Rahimov");

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Nukus Asia.uz KSM");

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("Atlas Chimgen");

        KeyboardButton button6 = new KeyboardButton();
        button6.setText("Magaplanet KSM");

        KeyboardButton button7 = new KeyboardButton();
        button7.setText("Perus KSM");

        KeyboardButton button8 = new KeyboardButton();
        button8.setText("Markaz-5");

        KeyboardButton button9 = new KeyboardButton();
        button9.setText("Farhod");

        KeyboardButton button10 = new KeyboardButton();
        button10.setText("Ko'kcha");

        KeyboardButton button11 = new KeyboardButton();
        button11.setText("Qo'yliq-5");

        KeyboardButton button12 = new KeyboardButton();
        button12.setText("Sergeli-2");

        KeyboardButton button13 = new KeyboardButton();
        button13.setText("⬅️\uFE0F Назад");

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
        KeyboardRow row5 = new KeyboardRow();
        row5.add(button9);
        row5.add(button10);
        KeyboardRow row6 = new KeyboardRow();
        row6.add(button11);
        row6.add(button12);
        KeyboardRow row7 = new KeyboardRow();
        row7.add(button13);
        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row4);
        rowList.add(row5);
        rowList.add(row6);
        rowList.add(row7);
        markup.setKeyboard(rowList);
        markup.setOneTimeKeyboard(true);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);
        return markup;
    }

    public ReplyKeyboardMarkup mainMenu1() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Lavash");

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Burger");

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Pitsa");

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Klab Sendvichs");


        KeyboardButton button5 = new KeyboardButton();
        button5.setText("Chizburger");

        KeyboardButton button6 = new KeyboardButton();
        button6.setText("KFC");

        KeyboardButton button7 = new KeyboardButton();
        button7.setText("Donar");

        KeyboardButton button8 = new KeyboardButton();
        button8.setText("Shovurma");

        KeyboardButton button9 = new KeyboardButton();
        button9.setText("Stake");

        KeyboardButton button10 = new KeyboardButton();
        button10.setText("Hot-dog");

        KeyboardButton button11 = new KeyboardButton();
        button11.setText("⬅️\uFE0F Ortga");

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
        KeyboardRow row5 = new KeyboardRow();
        row5.add(button9);
        row5.add(button10);
        KeyboardRow row6 = new KeyboardRow();
        row6.add(button11);
        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row4);
        rowList.add(row5);
        rowList.add(row6);
        markup.setKeyboard(rowList);
        markup.setOneTimeKeyboard(true);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);
        return markup;
    }

    public ReplyKeyboardMarkup mainJamoa() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Lavash");

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Burger");

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Pitsa");

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Klab Sendvichs");

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("Chizburger");

        KeyboardButton button6 = new KeyboardButton();
        button6.setText("KFC");

        KeyboardButton button7 = new KeyboardButton();
        button7.setText("Donar");

        KeyboardButton button8 = new KeyboardButton();
        button8.setText("Shovurma");

        KeyboardButton button9 = new KeyboardButton();
        button9.setText("Stake");

        KeyboardButton button10 = new KeyboardButton();
        button10.setText("Hot-dog");

        KeyboardButton button11 = new KeyboardButton();
        button11.setText("⬅️\uFE0F Ortga");

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
        KeyboardRow row5 = new KeyboardRow();
        row5.add(button9);
        row5.add(button10);
        KeyboardRow row6 = new KeyboardRow();
        row6.add(button11);
        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row4);
        rowList.add(row5);
        rowList.add(row6);
        markup.setKeyboard(rowList);
        markup.setOneTimeKeyboard(true);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);
        return markup;
    }

    public ReplyKeyboardMarkup mainMedic() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83D\uDCACBiz bilan aloqaga chiqing");

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("✍️\uD83C\uDFFBFikr bildirish");


        KeyboardRow row1 = new KeyboardRow();
        row1.add(button1);
        row1.add(button2);


        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(row1);
        markup.setKeyboard(rowList);
        markup.setOneTimeKeyboard(true);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);
        return markup;
    }

    public ReplyKeyboardMarkup mainParametrs() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Ismni o'zgartirish");

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83D\uDCF1Raqamni o'zgartirish");

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("\uD83C\uDFD9Shaharni o'zgartirish");

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("\uD83C\uDDFA\uD83C\uDDFFTilni o'zgartirish");

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("ℹ️\uFE0FFilliallar haqida malumot");

        KeyboardButton button6 = new KeyboardButton();
        button6.setText("\uD83D\uDCC4Ommaviy taklif");

        KeyboardRow row1 = new KeyboardRow();
        row1.add(button1);
        row1.add(button2);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(button3);
        row2.add(button4);

        KeyboardRow row3 = new KeyboardRow();
        row3.add(button5);
        row3.add(button6);


        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        markup.setKeyboard(rowList);
        markup.setOneTimeKeyboard(true);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);
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
