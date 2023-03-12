import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пример ввода: ( 6 + 6 ) * 6");
        String a = scanner.nextLine();
        Controller controller = new Controller();
        
        System.out.println(controller.calc(a));



    }
}