 interface Vehicle {
void start();
void stop();
      
}
 class Car implements Vehicle{
      public void start(){
            System.out.println("car is starting");
      }
      public void stop(){
            System.out.println("car is stopping");
      }
}
 class Truck implements Vehicle{
      public void start(){
            System.out.println("truck is starting..");
      }
      public void stop(){
            System.out.println("truck is stopping");
      }
}

 class Bike1 implements Vehicle{
      public void start(){
            System.out.println("Bike is starting..");
      }
      public void stop(){
            System.out.println("Bike is stopping");
      }
}
 class VehicleFactory{
      public static Vehicle getVehicle(String vehicletype){
            if(vehicletype.equals(("Car"))){
                  return new Car();
            
            }
            else if(vehicletype.equals("Truck")){
                  return new Truck();
            }
            else if(vehicletype.equals("Bike")){
                  return new Bike1();
            }
            else{
                  throw new IllegalArgumentException("Failed to find");
            }
      }
}
public class FactoryDesign{
      public static void main(String[] args){
      Vehicle v=VehicleFactory.getVehicle("Car");
      v.start();
      v.stop();

      Vehicle v1=VehicleFactory.getVehicle("Truck");
      v1.start();
      v1.stop();

      Vehicle v2=VehicleFactory.getVehicle(("Bike"));
      v2.start();
      v2.stop();
      }
}