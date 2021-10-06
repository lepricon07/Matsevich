import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер масива: ");
        int size = console.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элементы масива:");
        for (int i = 0; i < size; i++) {
            array[i] = console.nextInt();
        }
        System.out.print("Элементы кратные 3: ");
        for (int i = 0; i < size; i++) {
            if (array[i] % 3 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

}
