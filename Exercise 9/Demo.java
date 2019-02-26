//Ocean Lu
//CS141
//Exercise 9
//11.27.17

public class Demo {
        public static void main(String[] args) {
            Ship[] ships = new Ship[4];
            ships[0] = new Ship("Bombay", "1990");
            ships[1] = new Ship("Bengal", "1991");
            ships[2] = new CruiseShip("Siamese", "1992", 150);
            ships[3] = new CruiseShip("Seal Point", "1993", 200);
            for (int i = 0; i < 4; i++) {
                System.out.println(ships[i]);
            }
    }
}

