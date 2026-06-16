 class Singleton {
      
      private static Singleton instance;

      private Singleton(){}

      public static Singleton getinstance(){
            if(instance==null){
                  instance=new Singleton();
            }
            return instance;
      }
      public static void main(String[] args) {
            Singleton s1= Singleton.getinstance();
            Singleton s2=Singleton.getinstance();

            System.out.println(s1==s2);
      }
}
