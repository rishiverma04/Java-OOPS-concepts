interface Prototype{
      GameCharacter cloneCharacter();
}
class GameCharacter implements Prototype{
      private String name;
      private int health;
      private int attackpower;
      private int level;
      public GameCharacter(String name,int health,int attackpower,int level){
            this.name=name;
            this.health=health;
            this.attackpower=attackpower;
            this.level=level;
      }
      public void setname(String name){
            this.name=name;
      }
      public void sethealth(int health){
            this.health=health;
      }
      public void setattack(int attackpower){
            this.attackpower=attackpower;
      }
      public void setlevel(int level){
            this.level=level;
      }
      @Override
      public GameCharacter cloneCharacter(){
            return new GameCharacter(this.name, this.health, this.attackpower, this.level);
      }
public void display(){
      System.out.println("Name: "+name+" Health:"+health+" AttackPower: "+attackpower+" Level: "+level);
}
}
public class PrototypeDesign{
      public static void main(String[] args) {
            GameCharacter warrior=new GameCharacter("warrior",100,20, 1);
            GameCharacter player1=warrior.cloneCharacter();
            player1.setname("Rishi");

            GameCharacter player2=warrior.cloneCharacter();
            player2.sethealth(200);
            player2.setname("Hanuman");
            player2.setlevel(20);

            player1.display();
            player2.display();
            GameCharacter player3=warrior.cloneCharacter();
            player3.display();
      }
}