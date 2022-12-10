public class Kamaz extends Car{
        private  String marca;

        public Kamaz(int year, String name, String marca) {
            super(year, name);
            this.marca = marca;

        }

        public String getMarca() {
            return marca;
        }

        @Override
        public void print() {
            System.out.println(
                    "\nName:" + getName() +
                            "\nYear:" + getYear() +
                            "\nMarka:" + marca );


        }
    }

