public class pattern4 {
    public static void main(String[] args) {
        int i,j;
        int n=8;
        for ( i=0;i<n;i++){
            //P
            for ( j=0;j<n;j++){
                if(j==0 && i>0||i==0 && j<(n-1)/2 || j==(n-1)/2 && i>0 && i<(n-1)/2 || i==(n-1)/2 && j<=(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            //W
            for ( j=0;j<n;j++){
                if(j==0||j==(n-1)||i==j && i>(n-1)/2 || i+j==(n-1) && i > (n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            //S
            System.out.print("           ");
            for ( j=0;j<n;j++){
                if(i==0||j==0&&i<(n-1)/2||i==(n-1)/2||j==(n-1) && i>(n-1)/2||i==(n-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            //K
            System.out.print("   ");
            for ( j=0;j<n;j++){
                if(j==0||i+j==(n-1)/2||i-j==(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            //I
            System.out.print(" ");
            for ( j=0;j<n;j++){
                if(j==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            //L
            
            for ( j=0;j<n;j++){
                if(j==0||i==(n-1)&&j<(n-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            //L
            System.out.print("  ");
            for ( j=0;j<n;j++){
                if(j==0||i==(n-1)&&j<(n-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            //S
            System.out.print(" ");
            for ( j=0;j<n;j++){
                if(i==0||j==0&&i<(n-1)/2||i==(n-1)/2||j==(n-1) && i>(n-1)/2||i==(n-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
 }

