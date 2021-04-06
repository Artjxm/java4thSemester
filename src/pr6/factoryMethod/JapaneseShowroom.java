package pr6.factoryMethod;

public class JapaneseShowroom extends Showroom {
    Transport introduceTransport(TransportType type) {
        Transport transport = null;

        switch (type) {
            case MOTORCYCLE:
                transport = new JapaneseMotorcycle();
                break;
            case BICYCLE:
                transport = new JapaneseBicycle();
                break;
            case AUTOMOBILE:
                transport = new JapaneseAutomobile();
                break;
        }
        return transport;
    }
}
