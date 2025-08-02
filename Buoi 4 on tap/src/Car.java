public class Car {
    private String brand;
    private int maxSpeed;

    public Car(String brand, int maxSpeed){
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }
    public String getbrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void Car (){

    }
    public void run(){
        System.out.println("Xe " + brand + " dang chay voi toc do toi da " + maxSpeed + " km/h");
    }

}
