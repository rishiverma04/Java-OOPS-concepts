public class demo2 {
      public static void main(String[] args) {
            int marks[][]=new int[3][3];

            marks[0][0]=23;
            marks[0][1]=25;
            marks[0][2]=45;

            marks[1][0]=34;
            marks[1][1]=11;
            marks[1][2]=90;

            marks[2][0]=50;
            marks[2][1]=80;
            marks[2][2]=65;

            for(int row=0;row<3;row++){
           for(int col=0;col<3;col++){
            System.out.print(marks[row][col]+" ");
           }
           System.out.println();
            }



      }
}
