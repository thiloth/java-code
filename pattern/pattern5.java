package pattern;

public class pattern5 {
    public static void main(String[] args) {
        int n=4,i;
        for( i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }
        System.out.println();
        for( i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }

}
