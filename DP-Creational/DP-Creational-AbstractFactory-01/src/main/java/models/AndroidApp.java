package models;

public class AndroidApp implements MobileApp{
    private String name;
    private double version;

    public AndroidApp(String name, double version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }
    @Override
    public void buildApp(){
        System.out.println("Building" + " " + name  + " " + "Android App!");
    }
}
