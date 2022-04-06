package Opgave5313;

public class Car {
    double kml;
    double gas;
    double km;
    public Car(double kml){
        this.kml = kml;
    }

    public void addGas(double gas){
        this.gas += gas;
    }
    public double getKml(){
        return kml;
    }
    public void drive(double km){
        gas = gas - km / kml;
    }

    public double gasLeft(){
        return gas;
    }

}
