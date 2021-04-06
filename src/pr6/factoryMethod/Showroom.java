package pr6.factoryMethod;

public abstract class Showroom {
    public void getTransport(TransportType type) {
        Transport transport = introduceTransport(type);
        System.out.println("Title says: " + transport.getTransport());
    }
    abstract Transport introduceTransport(TransportType type);
}
