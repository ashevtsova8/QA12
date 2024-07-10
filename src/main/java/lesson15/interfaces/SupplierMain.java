package lesson15.interfaces;

import lesson15.User;

import java.util.Scanner;
import java.util.function.Supplier;

public class SupplierMain {
    public static void main(String[] args) {
        Supplier<User> userFactory = () -> {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите имя: ");
            String name = in.nextLine();
            return new User(name);
        };

        User user1 = userFactory.get();
        User user2 = userFactory.get();
        User user3 = userFactory.get();

        System.out.println("Имя user1 " + user1.getName());
        System.out.println("Имя user2 " + user2.getName());
        System.out.println("Имя user3 " + user3.getName());

    }
}
