package pattern;

public class pattern4 {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<2*n;i++){
            int space=i<=n?i+1:(2*n)-i+1;
            for(int j=0;j<space;j++)
            {
                System.out.print("  ");
            }
            int star=i<=n?n-i+1:i-n+1;
            int num=5;
            for(int k=0;k<star;k++){
                System.out.print(num--+"   ");
            }
            System.out.println();
        }
    }

}
