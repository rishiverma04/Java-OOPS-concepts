abstract class Button{
      abstract void onclick();
}
class submitbutton extends Button{
      @Override
      void onclick(){
            System.out.println("Form Submitted");
      }
}
class cancelbutton extends Button{
      @Override
      void onclick(){
            System.out.println("Form Cancelled");
      }
} 
public class DRY{
public static void main(String[] args){
      Button s=new submitbutton();
      s.onclick();
      Button c=new cancelbutton();
      c.onclick();
}
}