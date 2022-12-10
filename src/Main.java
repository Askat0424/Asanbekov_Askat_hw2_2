import com.sun.jdi.Value;

public class Main {
    public static void main(String[] args) {
        Printable print[]  = {createObject("BMW"),
                createObject("Kamaz")
                ,createObject("Limousine")};
        for (Printable printable:print) {
            printable.print();

        }
    }
    public static Printable createObject (String className) {
        switch (className) {
            case "Kamaz":
                Kamaz kamaz = new Kamaz(2010, "MAN", "DAF");
                return kamaz;
            case  "Limousine":
                Limousine limousine = new Limousine(2017," Nummer"," 12 ");
                return  limousine;
            case  "BMW":
               Bmw bmw = new Bmw(2022," ALPINA B9 ",4.4);
                return  bmw;
            default:
                return null;
        }
    }
}







