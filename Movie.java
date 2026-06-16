class Movie{
      private String title;
      private int duration;

      public Movie(String title,int duration){
            this.title=title;
            this.duration=duration;
      }
      public void displaydetails(){
       System.out.println("The movie:"+title+"is of:"+duration);
      }

      public static void main(String[] args) {
            Movie movie=new Movie("flames",90);
            movie.displaydetails();
           
      }
}