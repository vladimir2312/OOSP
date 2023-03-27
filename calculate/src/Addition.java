import java.util.ArrayList;
import  java.util.Scanner;
public class Addition {
    public static ArrayList<String> equation = new ArrayList();
    UI ui = new UI();
    public void equation(String n) {
        equation.add(n);
    }
    public void pastUr(){
        System.out.println("--------------- Прошлые вычисления ----------------\n" +
                "--- Чтобы открыть недавние вычисления нажмите 1 ---\n" +
                "----- Чтобы открыть все вычисления нажмите 2 ------\n" +
                "---------- Чтобы выйти в меню нажмите 0 -----------");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n==1 | n==2 | n==0) {
            if (n == 1) {
                recentCalculations();
            }
            if (n == 2) {
                allCalculations();
            }
            if (n == 0 ){
                ui.menu();
            }
        }
        else {
            System.out.println("Вы выбрали не существующие действие");
        }
    }
    private void recentCalculations(){
        System.out.println("--------------- Недавние вычисления ---------------");
        for(String a: equation){
            System.out.println(a);
        }
    }
    private void allCalculations(){
        System.out.println("----------------- Все вычисления -----------------");
        RecordFile notepad = new RecordFile();
        notepad.readFile();
    }
}
