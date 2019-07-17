import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        System.out.println(fakeBin("918273645"));

    }

    public static String fakeBin(String numberString) {
        StringBuilder sb = new StringBuilder();

        List<Character> numbersList = new ArrayList<>();
        for (int i = 0; i < numberString.length(); i++) {
            numbersList.add(numberString.charAt(i));
            if (numbersList.get(i) >= '5') {
                numbersList.set(i, '1');
            } else if (numbersList.get(i) < '5') {
                numbersList.set(i, '0');
            }
        }
        for (Character ch : numbersList) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
