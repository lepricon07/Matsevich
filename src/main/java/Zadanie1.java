import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число: ");
        int i = console.nextInt();
        if(i > 7){
            System.out.println("Привет");
        }
    }
}
