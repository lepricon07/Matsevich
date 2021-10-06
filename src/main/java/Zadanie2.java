import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = console.nextLine();
        if(name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        }
        else {
            System.out.println( "Нет такого имени");
        }
    }
}

