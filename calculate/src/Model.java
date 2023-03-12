import java.util.ArrayList;
import java.util.List;


public class Model {

    public Double actions(String expression) {
        List<String> stringList2 = new ArrayList<>();
        for (String element : expression.trim().split(" ")) {
            stringList2.add(element);
        }

        while (stringList2.size() != 0) {

            Double result = 0d;

            if (stringList2.indexOf("/") != -1) {
                int index = stringList2.indexOf("/");
                result = Double.valueOf(stringList2.get(index - 1)) / Double.valueOf(stringList2.get(index + 1));
                stringList2.add(index - 1, String.valueOf(result));
                stringList2.remove(index + 2);
                stringList2.remove(index + 1);
                stringList2.remove(index);
            }
            else if (stringList2.indexOf("*") != -1) {
                int index = stringList2.indexOf("*");
                result = Double.valueOf(stringList2.get(index - 1)) * Double.valueOf(stringList2.get(index + 1));
                stringList2.add(index - 1, String.valueOf(result));
                stringList2.remove(index + 2);
                stringList2.remove(index + 1);
                stringList2.remove(index);
            }
            else if (stringList2.indexOf("-") != -1) {
                int index = stringList2.indexOf("-");
                int lastIndex = stringList2.lastIndexOf("-");
                if (index == 0) {
                    result = 0.0 - Double.valueOf(stringList2.get(index + 1));
                    stringList2.add(0, String.valueOf(result));
                    stringList2.remove(2);
                    stringList2.remove(1);
                }
                else if ((lastIndex-2>0) && (stringList2.get(lastIndex-2).equals("-"))){
                    result = Double.valueOf(stringList2.get(lastIndex + 1)) + Double.valueOf(stringList2.get(lastIndex - 1));
                    stringList2.add(lastIndex - 1, String.valueOf(result));
                    stringList2.remove(lastIndex + 2);
                    stringList2.remove(lastIndex + 1);
                    stringList2.remove(lastIndex);
                }
                else {
                    result = Double.valueOf(stringList2.get(index - 1)) - Double.valueOf(stringList2.get(index + 1));
                    stringList2.add(index - 1, String.valueOf(result));
                    stringList2.remove(index + 2);
                    stringList2.remove(index + 1);
                    stringList2.remove(index);
                }
            }
            else if (stringList2.indexOf("+") != -1) {
                int index = stringList2.indexOf("+");
                result = Double.valueOf(stringList2.get(index - 1)) + Double.valueOf(stringList2.get(index + 1));
                stringList2.add(index - 1, String.valueOf(result));
                stringList2.remove(index + 2);
                stringList2.remove(index + 1);
                stringList2.remove(index);
            }

            if ((stringList2.indexOf("*") == -1) && (stringList2.indexOf("/") == -1) && (stringList2.indexOf("+") == -1) && (stringList2.indexOf("-") == -1)) {
                return result;
            }
        }
        return Double.valueOf(stringList2.get(0));
    }

}
