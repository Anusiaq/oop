public class Mitsubishi extends Vehicle {

    private String typeOfSeats;


    public Mitsubishi(int dateOfProduction, String model, boolean airCon, int mileage, String typeOfSeats){
        super(dateOfProduction, model, airCon, mileage);
        this.typeOfSeats = typeOfSeats;
    }
    @Override
    public void startEngine(){
        System.out.println("Start Mitsubishi engine.");
    }

}
