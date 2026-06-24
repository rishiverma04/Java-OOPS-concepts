class ExampleBaker{

      void baker(){
            System.out.println("Baking the cookies");
      }
      void manage(){
            System.out.println("Manage the inventory");
      }
      void cleaning(){
            System.out.println("Cleaning the bakery");
      }
      public static void main(String[] args) {
            ExampleBaker e1=new ExampleBaker();
            e1.baker();
            e1.manage();
            e1.cleaning();
      }
}