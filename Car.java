public class Car{
      //Attributes
      String manufacturer;
      String model;
      int year;

       //Constructor
      public Car(String manufacturer,String model,int year){
            this.manufacturer=manufacturer;
            this.model=model;
            this.year=year;
      }
      //Methods
      public void displaydetails(){
            System.out.println("The "+model+" of "+manufacturer+" was released in"+year);
      }

     
            public static void main(String[] args) {
                  //Creating objects
                  Car c1=new Car("Toyoto","Innova",2021);
                  c1.displaydetails();


            
            }
}
