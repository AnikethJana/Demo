public class pattern5 {
    public static void main(String[] args) {
        //NAME : ANIKETH JANA 
        int i,j;
        int n=7;
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
            //N
            for ( j=0;j<n;j++){
                if(j==0||j==(n-1)||i==j ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            //I
            System.out.print("    ");
            for ( j=0;j<n;j++){
                if(j==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
             //K
             for ( j=0;j<n;j++){
                 if(j==0||i+j==(n-1)/2||i-j==(n-1)/2){
                     System.out.print("*");
                 }
                 else{
                     System.out.print(" ");
                 }
             }
             //E
        System.out.print(" ");
        for (j=0;j<n;j++){
            if(j==0 && i>0 || i==0 && j < (n-1) || i ==(n-1)/2 && j<(n-1)||i==(n-1) && j<(n-1) ){
                  System.out.print("* ");
              }
              else
              {
              System.out.print("  ");
              }
      
        }
        //T
        for (j=0;j<n;j++){
            if(i==0|| i<=(n-1) && j==(n-1)/2){
                  System.out.print("* ");
              }
              else
              {
              System.out.print("  ");
              }
      
        }
         //H
       System.out.print("  ");
       for (j=0;j<n;j++){
           if(j==0 && i>=0  || i ==(n-1)/2 && j<(n-1)/2|| j==(n-1)/2){
                 System.out.print("* ");
             }
             else
             {
             System.out.print("  ");
             }
     
        }
        //J
        System.out.print("  ");
        for (j=0;j<n;j++){
            if(i==0|| i<=(n-1) && j==(n-1)/2||i==(n-1)&&j<(n-1)/2){
                  System.out.print("* ");
              }
              else
              {
              System.out.print("  ");
              }
      
        }
        // A
        for ( j=0;j<n;j++){
            if(i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 || i==(n-1)/2 && j<=(n-1)/2 || j== (n-1)/2 && i>0 ){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        //N
        for ( j=0;j<n;j++){
            if(j==0||j==(n-1)||i==j ){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        // A
        System.out.print("  ");
        for ( j=0;j<n;j++){
            if(i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 || i==(n-1)/2 && j<=(n-1)/2 || j== (n-1)/2 && i>0 ){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
            System.out.println();
        }
    }
}
