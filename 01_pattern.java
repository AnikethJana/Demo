import java.util.Scanner;

class pattern{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.print("give n for input : ");
        int n=scan.nextInt();
        int i,j;
        for ( i=0;i<n;i++){
            // A
            for ( j=0;j<n;j++){
                if(i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 || i==(n-1)/2 && j<=(n-1)/2 || j== (n-1)/2 && i>0 ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            //B
            System.out.print(" ");
            for (j=0;j<n;j++){
                if(j==0 && i>0 || i==0 && j < (n-1)/2 ||j==(n-1)/2 && i >0 && i < (n-1) || i ==(n-1)/2 && j<=(n-1)/2|| i==(n-1) && j<(n-1)/2 ){
                      System.out.print("* ");
                  }
                  else
                  {
                  System.out.print("  ");
                  }
            }
            //C
            System.out.print(" ");
            for (j=0;j<n;j++){
                if(i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 && i < (n-1) || i==(n-1) && j>0 && j<(n-1)/2 ){
                      System.out.print("* ");
                  }
                  else
                  {
                  System.out.print("  ");
                  }
            }
            //D
            System.out.print(" ");
        for (j=0;j<n;j++){
            if(j==0 && i>0 || i==0 && j < (n-1)/2 || i==(n-1) && j<(n-1)/2 || j==(n-1)/2 && i >0 && i < (n-1)){
                  System.out.print("* ");
              }
              else
              {
              System.out.print("  ");
              }
        }
        //E
        System.out.print(" ");
        for (j=0;j<n;j++){
            if(j==0 && i>0 || i==0 && j < (n-1)/2 || i ==(n-1)/2 && j<(n-1)/2||i==(n-1) && j<(n-1)/2 ){
                  System.out.print("* ");
              }
              else
              {
              System.out.print("  ");
              }
      
      }
       //F
       System.out.print(" ");
       for (j=0;j<n;j++){
           if(j==0 && i>0 || i==0 && j < (n-1)/2 || i ==(n-1)/2 && j<(n-1)/2 ){
                 System.out.print("* ");
             }
             else
             {
             System.out.print("  ");
             }
     
        }
         //G
       System.out.print(" ");
       for (j=0;j<n;j++){
           if(j==0 && i>0 || i==0 && j <= (n-1)/2 || i ==(n-1)/2 && j<(n-1)/2||i==(n-1) && j<(n-1)/2 || j==(n-1)/2 && i>=(n-1)/2){
                 System.out.print("* ");
             }
             else
             {
             System.out.print("  ");
             }
     
        }
         //G
       System.out.print(" ");
       for (j=0;j<n;j++){
           if(j==0 && i>=0  || i ==(n-1)/2 && j<(n-1)/2|| j==(n-1)/2){
                 System.out.print("* ");
             }
             else
             {
             System.out.print("  ");
             }
     
        }
            System.out.println();
        }

    }
}