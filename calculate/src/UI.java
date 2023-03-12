import java.io.Console;
import  java.util.Scanner;
public class UI {
    public void menu() {
        Controller controller = new Controller();
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("1.Ввести арефметическое уравнение.");
        System.out.println("0.Выход.");
        System.out.println("-------------------------------");
        int a = scanner.nextInt();
while (a!=0){
            System.out.println("------------------------------");
           if (a==1){
                    String exspensive = null;
                    System.out.println(controller.calc(exspensive));
               System.out.print("Выберите действие:");
               a = scanner.nextInt();
            }
           else{
               System.out.println("Такого действия нет!");
               System.out.print("Выберите действие:");
               a = scanner.nextInt();
           }
        }

}}