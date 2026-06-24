

      class Baking{
     public void baker(){
            System.out.println("Baking the cookies");
      }
}
     class Manageinventory{
    public  void manage(){
            System.out.println("Manage the inventory");
      }
}
class BakeryCleaning{
      void cleaning(){
            System.out.println("Cleaning the bakery");
      }
}
public class ExampleBaker{
public static void main(String[] args) {
           
            Baking b=new Baking();
            Manageinventory m=new Manageinventory();
            BakeryCleaning clean=new BakeryCleaning();


            b.baker();
            m.manage();
            clean.cleaning();

           
      }
}
  

