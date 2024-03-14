package org.example.dp;

public class Database {
    private static Database db;
    private String data;

    public Database() {
    }
    public static Database getInstance(){
        if (db == null){
            return db = new Database();
        }
        return db;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    public Memento save(){
        return new Memento(data);
    }
    public void restore(Memento memento)
    {
        data = memento.getData();
    }
}
