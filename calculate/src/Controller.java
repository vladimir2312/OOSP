import  java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Controller {
    List<String> strList = new ArrayList<>();
        private String expression;
     Model model = new Model();
     Scanner scanner = new Scanner(System.in);


   public double calc(String expression) {
        //expression = scanner.nextLine();
       List<String> strList = new ArrayList<>();
       for (String listElement : expression.trim().split(" ")) {
           strList.add(listElement);
           strList.add(" ");
       }
       strList.remove(strList.size() - 1);

       if (strList.indexOf("(") != -1) {


           for (int i = strList.indexOf("(") + 1; i < strList.size() - 1; i++) {
               String recursion = "";
               if (strList.get(i).equals("(")) {
                   for (int j = i; j < strList.lastIndexOf(")"); j++) {
                       recursion += strList.get(j);
                   }

                   String test = expression.substring(expression.indexOf("("), expression.lastIndexOf(")") + 1);
                   String testRecursion = String.valueOf(calc(recursion));
                   expression = expression.replace(test, testRecursion);
                   strList.removeAll(strList);
                   for (String newElement : expression.trim().split(" ")) {
                       strList.add(newElement);
                       strList.add(" ");
                   }

               }

               String recursion2 = "";
               if (strList.get(i).equals(")")) {

                   for (int j = strList.indexOf("(") + 1; j < strList.indexOf(")"); j++) {
                       recursion2 += strList.get(j);
                   }
                   String test2 = expression.substring(expression.indexOf("("), expression.lastIndexOf(")") + 1);
                   String testRecursion2 = String.valueOf(calc(recursion2));
                   expression = expression.replace(test2, testRecursion2);
                   for (String newElement : expression.trim().split(" ")) {
                       strList.add(newElement);
                       strList.add(" ");
                   }

               }
           }
       }
       return model.actions(expression);
   }
}
