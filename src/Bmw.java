public class Bmw extends  Car {
    private  double volume;

    public double getVolume() {
        return volume;
    }

    public Bmw (int year, String name, double volume) {
        super(year, name);
        this.volume = volume;
    }

    @Override
    public void print() {
        System.out.println(
                "\nName:" + getName()+
                        "\nYear:" + getYear() +
                        "\nVolume:" + volume);

    }
}