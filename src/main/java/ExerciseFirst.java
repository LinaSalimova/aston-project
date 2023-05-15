import java.util.Scanner;

public class ExerciseFirst {
    //если введенное число больше 7, то вывести “Привет”
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите число:");
        int i;
        i = num.nextInt();
        if (i > 7) {
            System.out.println("Привет");
        } else {
            System.out.println("Введите значение которое больше 7:");
        }

    }

}