public class Audi extends Vehicle{

//    public String drive;
    public Drive naped;


    public Audi(int dataOfProduction, String model, boolean airCon, int mileage, Drive drive){
        super(dataOfProduction, model, airCon, mileage);
        this.naped = drive;

    }


}
