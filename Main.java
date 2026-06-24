class Car{
      private String engine;
      private int wheels;
      private int seats;
      private String color;
      private boolean sunroof;
      private boolean navigationsystem;

      public Car(String engine,int wheels,int seats,String color,boolean sunroof,boolean navigationsystem){
            this.engine=engine;
            this.wheels=wheels;
            this.seats=seats;
            this.color=color;
            this.sunroof=sunroof;
            this.navigationsystem=navigationsystem;
      }
public String getEngine(){
      return engine;
}
public int getWheels(){
      return wheels;
}
public int getSeats(){
      return seats ;
}
public String getColor(){
      return color;
}
public boolean hassunroof(){
      return sunroof;
}
public boolean hasnavigation(){
      return navigationsystem;
}
@Override
      public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", wheels=" + wheels +
                ", seats=" + seats +
                ", color='" + color + '\'' +
                ", sunroof=" + sunroof +
                ", navigationSystem=" + navigationsystem +
          
                '}';
    }

    public static class CarBuilder{
      private String engine;
      private int wheels=4;
      private int seats=6;
      private String color="Black";
      private boolean sunroof=false;
      private boolean navigationsystem=false;


      public CarBuilder setEngine(String engine){
            this.engine=engine;
            return this;
      }
      public CarBuilder setWheels(int wheels){
            this.wheels=wheels;
            return this;
      }
      public CarBuilder setSeats(int seats){
            this.seats=seats;
            return this;
      }
      public CarBuilder setColor(String color){
            this.color=color;
            return this;
      }
      public CarBuilder setSunroof(boolean sunroof){
            this.sunroof=sunroof;
            return this;
      }
      public CarBuilder setNaviSystem(boolean navigationsystem){
            this.navigationsystem=navigationsystem;
            return this;
      }

      public Car build(){
            return new Car(
      engine,
        wheels,
        seats,
        color,
        sunroof,
        navigationsystem);

    }

    

public class Main{
public static void main(String[] args){
     Car.CarBuilder builder = new Car.CarBuilder();
    Car car1 = builder.setEngine("V8")
                   .setColor("Red")
                   .setSeats(5)
                   .setSunroof(true)
                   .build(); // The build method returns the final product
    System.out.println(car1);
      
}
}
    }
}
