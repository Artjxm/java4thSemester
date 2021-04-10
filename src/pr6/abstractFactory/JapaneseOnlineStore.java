package pr6.abstractFactory;

public class JapaneseOnlineStore implements OnlineStore {
    public JapaneseOnlineStore() {
        System.out.println("Japanese Online Store");
    }
    @Override
    public Car getCar() {
        return new HondaCivic();
    }

    @Override
    public Motorcycle getMotorcycle() {
        return new  Katana();
    }
}
