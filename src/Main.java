import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Практическое задание № 1.6 Индивидуальное задание №1 \n " +
                "РИБО-02-22, Цуранов Артем Юрьевич, Вариант №2");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите производителя телефона: ");
        String TelephoneMark = scan.nextLine();
        System.out.println("Введите модель телефона: ");
        String TelephoneModel = scan.next();
        Telephone telephone = new Telephone(TelephoneMark, TelephoneModel);
        System.out.println("Старые марка и модель телефона: " + telephone.toString());
        prodavec prod = new prodavec(telephone);
        prod.modify(telephone);
        System.out.println("Новые марка и модель телефона: " + telephone.toString());
    }
}