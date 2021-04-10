package pr6.abstractFactory;

public class Main {
    public static void main(String[] args) {
        JapaneseOnlineStore link1 = new JapaneseOnlineStore();
        link1.getCar();
        link1.getMotorcycle();

        System.out.println();

        ItalianOnlineStore link2 = new ItalianOnlineStore();
        link2.getCar();
        link2.getMotorcycle();
    }
}
