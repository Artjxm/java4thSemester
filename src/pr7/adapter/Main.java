package pr7.adapter;

public class Main {
    public static void main(String[] args) {
        DataBase db = new AdapterDataBase();
        db.load();
        db.insert();
        db.update();
        db.remove();
    }
}
