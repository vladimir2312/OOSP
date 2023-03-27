import java.io.IOException;
import java.sql.SQLOutput;
import  java.util.Scanner;
public class UI {
    public void menu() {
        Model model = new Model();
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------Калькулятор-----------------");
        System.out.println("1.Вывести прошлые вычисления.");
        System.out.println("2.Ввести уравнение.");
        System.out.println("0.Выход.");
        int n = scanner.nextInt();
        System.out.println("-----------------------------------------");

        if (n == 1 | n == 2 | n == 0) {
            if (n == 1) {
                Addition addition = new Addition();
                addition.pastUr();
            }

            if (n == 2) {
               String a = "";
                Controller controller = new Controller();
                System.out.println(controller.calc(a));

            }

            if (n == 0) {
                System.out.println("До Свидания");
                System.exit(0);
            }
        } else {
            System.out.println("Вы выбрали не существующие действие");
        }





    }


       /* int a = scanner.nextInt();
while (a!=0){
            System.out.println("------------------------------");
           if (a==1){
               try {
                   System.in.read();
                   expensive = scanner.nextLine();
                   System.out.println(model.actions(expensive));
                   System.in.read();
                   System.out.print("Выберите действие:");
                   a = scanner.nextInt();
               } catch (IOException e) {
                   throw new RuntimeException(e);
               }

            }
           else{
               System.out.println("Такого действия нет!");
               System.out.print("Выберите действие:");
               a = scanner.nextInt();
           }
        }*/

}