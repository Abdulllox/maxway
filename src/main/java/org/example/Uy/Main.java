package org.example.Uy;

import org.example.Medialar.Photo;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Main {
    public static void main(String[] args) throws TelegramApiException {
//        ygrmabesh ygrmabesh = new ygrmabesh();
//        TelegramBotsApi api = new TelegramBotsApi(DefaultBotSession.class);
//        api.registerBot(ygrmabesh);
//        System.out.println("ishlavoti");


            Animal cat = new Cat();
            cat.eat();
            cat.sleep();

            Animal dog = new Dog();
            dog.eat();
            dog.sleep();
            // 2.m

            Shape circle = new Circle(5);
            System.out.println(circle.area());
            System.out.println(circle.perimeter());

            Shape rectangle = new Rectangle(4, 6);
            System.out.println(rectangle.area());
            System.out.println(rectangle.perimeter());
            // 3.m
            Book book = new Book();
            book.print();
            book.read();

            //4.m
            MathOperations calculator = new Calculator();
            System.out.println(calculator.add(3, 5));
            System.out.println(MathOperations.multiply(3, 5));
            //5.m
            CircleArea circlearea = new CircleArea(5);
            System.out.println(circle.area());

            UserManager userManager = new UserManager(50);
            System.out.println(userManager.canAddUser());
    }
}
