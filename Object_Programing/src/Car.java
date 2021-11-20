public class Car {

    public int speed = 0;


    public void startEngine(){
        System.out.println("Silnik działa.");
    }
    public void stopEngine(){
        System.out.println("Silnik nie działa");
    }

    public void accelrate (int acceleration) {
        this.speed += acceleration;
        System.out.println(" Samochód jedzie z prędkością " + speed + " km/h. ");
    }
    public void slowDown(int speed){
        this.speed -= speed;
        System.out.println("Samochód jedzie z prędkością " + this.speed + " km/h. ");
    }
}
