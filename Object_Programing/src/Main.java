public class Main {
    public static void main(String[] args) {

        Car audi = new Car(0, 1, "audi", true);
        audi.startEngine();
        audi.setLights(true);
        System.out.println(audi.getLights());
        audi.setGear(1);
        audi.accelrate( 20 );
        audi.accelrate(40);
        audi.slowDown(15);
        audi.stopEngine();

        System.out.println("Car is change");

        Car bmw = new Car(0, 1, "e36", true);
        bmw.startEngine();
        bmw.setLights(true);
        System.out.println(bmw.getLights());
        bmw.setGear(1);
        bmw.accelrate( 20 );
        bmw.accelrate(40);
        bmw.slowDown(15);
        bmw.stopEngine();

    }



    }
}
