package ui;

import context.Context;
import user.User;
import user.UserService;

import java.util.UUID;

public class MainUi {
    private final UserService userService = UserService.getInstance();
    public void start (){
        boolean isExited = false;
        while (!isExited){
            System.out.println("""
                    1 Kirish
                    2 Ro'yxatdan o'tish
                    0 Chiqish
                    """);

            switch (Context.scannerInt.nextInt()){
                case 0 -> {
                    isExited = true;
                }
                case 1 -> {
                    signUp();
                }
                case 2 -> {
                    signIn();
                }
                default -> {
                    System.out.println("Noto'g'ri malumot kiritingiz");
                }
            }
        }
    }

    private void signUp(){
        System.out.print("Telefon raqam kiriting: ");
        String number = Context.scannerStr.nextLine();
        System.out.print("Ismingizni kiriting: ");
        String name = Context.scannerStr.nextLine();
        System.out.print("Familyangizni kiriting: ");
        String surname = Context.scannerStr.nextLine();
        System.out.print("Parolingizni kiriting: ");
        String password = Context.scannerStr.nextLine();
        System.out.print("Balance kiriting: ");
        double balance = Context.scannerInt.nextDouble();

        User buildUser = User.builder()
                .id(UUID.randomUUID())
                .phoneNumber(number)
                .name(name)
                .surname(surname)
                .password(password)
                .balance(balance)
                .build();
        boolean isCreate = userService.create(buildUser);
        if (isCreate){
            System.out.println("User yaratildi");
        } else {
            System.out.println("Bu telefon raqm allaqachon ro'yxatdan o'tgan");
        }
    }
    private void signIn(){

    }
}