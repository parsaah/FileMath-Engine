import java.util.ArrayList;
import java.util.List;

public class Initializer {
    List<String> resultList = new ArrayList<>();

    public void initializer(int firstNumber, String operator, int secondName){
        Sum sum = new Sum();
        Minus minus = new Minus();
        Multi multi = new Multi();
        Division division = new Division();

        switch (operator) {
            case "+" -> {
                sum.setFirstNumber(firstNumber);
                sum.setSecondNumber(secondName);
                resultList.add(sum.operator());
            }
            case "-" -> {
                minus.setFirstNumber(firstNumber);
                minus.setSecondNumber(secondName);
                resultList.add(minus.operator());
            }
            case "*" -> {
                multi.setFirstNumber(firstNumber);
                multi.setSecondNumber(secondName);
                resultList.add(multi.operator());
            }
            case "/" -> {
                division.setFirstNumber(firstNumber);
                division.setSecondNumber(secondName);
                resultList.add(division.operator());
            }
        };
    }
}
