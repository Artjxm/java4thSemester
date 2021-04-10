package pr6.Prototype;

public class Main {
    public static void main(String[] args) {
        JapaneseCycleStore shop1 = new JapaneseCycleStore(Companies.HONDA);
        JapaneseCycleStore shop2 = new JapaneseCycleStore(Companies.SUBARU);
        JapaneseCycleStore shop3 = new JapaneseCycleStore(Companies.TOYOTA);

        shop3.setManufacturer(Companies.SUZUKI);

        System.out.println(shop1);
        System.out.println(shop2);
        System.out.println(shop3);
    }
}
