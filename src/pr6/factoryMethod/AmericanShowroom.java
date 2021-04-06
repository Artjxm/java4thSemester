package pr6.factoryMethod;

public class AmericanShowroom extends Showroom {
    Transport introduceTransport(TransportType type) {
        Transport transport = null;

        switch (type) {
            case BICYCLE:
                transport = new AmericanBicycle();
                break;
            case MOTORCYCLE:
                transport = new AmericanMotorcycle();
                break;
            case AUTOMOBILE:
                transport = new AmericanAutomobile();
                break;
        }
        return transport;
    }
}
