public class Main {
    public static void main(String[] args) {

        Car audi = new Car();
        audi.startEngine();
        audi.accelrate( 20 );
        audi.accelrate(40);
        audi.slowDown(15);
        audi.stopEngine();

    }
}
