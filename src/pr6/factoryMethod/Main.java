package pr6.factoryMethod;

public class Main {
    public static void main(String[] args) {
        System.out.println("We are in Japanese showroom");
        Showroom sr1 = new JapaneseShowroom();
        sr1.getTransport(TransportType.AUTOMOBILE);
        sr1.getTransport(TransportType.MOTORCYCLE);
        sr1.getTransport(TransportType.BICYCLE);

        System.out.println("\nNow we are in american showroom");
        Showroom sr2 = new AmericanShowroom();
        sr2.getTransport(TransportType.AUTOMOBILE);
        sr2.getTransport(TransportType.MOTORCYCLE);
        sr2.getTransport(TransportType.BICYCLE);
    }
}
