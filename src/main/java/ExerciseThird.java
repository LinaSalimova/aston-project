import java.util.Scanner;

public class ExerciseThird {
    //на входе есть числовой массив, необходимо вывести элементы массива кратные 3
    public static void main(String[] args) {
        int[] myArray;
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во чисел в массиве:");
        number = scan.nextInt();
        myArray = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Введите элемент с индексом " + "[" + i + "]");
            myArray[i] = scan.nextInt();
        }
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 3 == 0) {
                System.out.println("Элементы массива кратные 3:  " + myArray[i] + "  индекс  " + "[" + i + "]");
            }
        }
    }
}
