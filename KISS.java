class Factorial{

      int calculate(int n){
      int fact=1;
      for(int i=1;i<=n;i++){
            fact*=i;
      }
      
      return fact;
}
}
public class KISS{
      public static void main(String[] args) {
            Factorial f=new Factorial();
            System.out.println(f.calculate((7)));

      }
}