import java.util.Scanner;

public class ExerciseSecond {
    //если введенное имя совпадает с Вячеслав,
    // то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите имя с заглавной буквы:");
        String name = num.nextLine();
        String userName = "Вячеслав";
        if (name.equals(userName)) {
            System.out.println("Привет," + userName);}
        else {
            System.out.println("Нет такого имени");
        }
    }
}
