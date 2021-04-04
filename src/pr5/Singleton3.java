package pr5;

public class Singleton3 {
    private Singleton3(){
        System.out.println("Singleton 3 - singHolder variation");
    }
    public static class SingHolder {
        private final static Singleton3 instance = new Singleton3();
    }
    public static Singleton3 getInstance(){
        return SingHolder.instance;
    }
}