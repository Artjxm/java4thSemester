package pr6.abstractFactory;

public class ItalianOnlineStore implements OnlineStore {
    public ItalianOnlineStore() {
        System.out.println("Italian Online Store");
    }
    @Override
    public Car getCar() {
        return new Aventador();
    }

    @Override
    public Motorcycle getMotorcycle() {
        return new Ducati();
    }
}
