public abstract class Car implements  Printable {
    private  int  year;
    private  String name;

    public Car(int year, String name) {
        this.year = year;
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }
}



