package pr1;
import java.util.regex.*;

public class Main implements Comparator {

    private String someString;
    private int sum = 0;

    public void setSumOfNumbers(String str) {
        int sum = 0;
        String[] numbers = str.split("\\s+");
        for (String number : numbers) {
            Integer n = Integer.parseInt(number);
            sum += n;
        }

        this.sum = sum;
    }

    public static void main(String[] args) {
        Main object1 = new Main();
        Main object2 = new Main();

        object1.someString = " 20  3 1 0";
        object1.someString = "8 10 1";

        if (object1.compare(object2) > 0)
            System.out.println("Первая строка больше по сумме чисел");
        else if (object1.compare(object2) < 0)
            System.out.println("Вторая строка больше по сумме чисел");
        else
            System.out.println("Строки равны по сумме чисел");
    }

    public int compare(Main o1) {
        setSumOfNumbers(this.someString);
        setSumOfNumbers(o1.someString);

        return Integer.compare(this.sum, o1.sum);
    }

}


