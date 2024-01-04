package pattern;

public class Pattern6 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <2*n; i++){

            int star=i<=n?n-i+1:i-n+1;
            for(int k=0;k<star;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
