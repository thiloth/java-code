package pattern;

public class Hollow_paterns {
    public static void main(String[] args) {
       // hollowtriangle();
        Xpattern();
        hollowwithspacetriangle();
        HollowButterfly();
        hollow_diamond();
        hollowTnvertedTriangle();

    }
    static void Xpattern(){
        int i,j;
        int n=6;
        if(n%2==0)
            n=n+1;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(i==j||i+j==n+1||i==1||i==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void hollowtriangle(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                if(i==1||j==1||i+j==n+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void hollowwithspacetriangle(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==n||j==n||i+j==n+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //method 2 printing with space
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                if(i==k||k==1||i==n)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
    static void HollowButterfly(){
        int i,j,n=7;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(j==1||j==n||i+j==n+1||i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
  static void hollow_diamond() {
      int n = 6, i, j, k;
      for (i = 1; i < n * 2; i++) {
          int space = i <= n ? n - i : i - n;
          for (j = 1; j <= space; j++) {
              System.out.print(" ");
          }
          int star = i <= n ? i : 2 * n - i;
          for (k = 1; k < star; k++) {
              if (k == 1 || k == 5 || k == i - 1 || n * 2 - i - 1 == k) {
                  System.out.print("* ");
              } else {
                  System.out.print("  ");
              }
          }
          System.out.println();

      }
  }
  static void hollowTnvertedTriangle(){
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==j||j==n){
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
