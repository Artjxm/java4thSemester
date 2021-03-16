package pr1;
import java.util.Comparator;
import java.util.regex.*;

public class Main implements Comparator<Main> {

    private final int sumOfNums;

    public Main(String someString) {
        Pattern p = Pattern.compile("-?\\d+");
        assert false;
        Matcher m = p.matcher(someString);
        int summ = 0;
        while (m.find()) {
            summ += Integer.parseInt(m.group());
        }
        sumOfNums = summ;
    }

    public int compare(Main m2) {
        return Integer.compare(this.sumOfNums, m2.sumOfNums);
    }

    public static void main(String[] args) {
        Main object1 = new Main("12 4 0");
        Main object2 = new Main("9 2 4 1");

        if (object1.compare(object2) > 0)
            System.out.println("Первая строка больше по сумме чисел");
        else if (object1.compare(object2) < 0)
            System.out.println("Вторая строка больше по сумме чисел");
        else
            System.out.println("Строки равны по сумме чисел");
    }

    @Override
    public int compare(Main o1, Main o2) {
        return 0;
    }
}