package pr7.adapter;

public class AdapterDataBase extends AppDataBase implements DataBase {
    @Override
    public void load() {
        loadTable();
    }

    @Override
    public void insert() {
        insertTable();
    }

    @Override
    public void remove() {
        removeTable();
    }

    @Override
    public void update() {
        updateTable();
    }
}
