package pr6.Prototype;

public class JapaneseCycleStore {
    private Companies manufacturer;

    public Companies getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Companies manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "You've chosen " + manufacturer;
    }

    public JapaneseCycleStore(Companies manufacturer) {
        this.manufacturer = manufacturer;
    }
}
