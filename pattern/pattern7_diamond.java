package pattern;

public class pattern7_diamond {
    static{
        System.out.println("hi");
    }
    public static void main(String[] args) {
        int n=5,i,j,k;
        for( i=1;i<n*2;i++){
            int space=i<=n?n-i:i-n;
            for( j=1;j<=space;j++){
                System.out.print(" ");
            }
            int star=i<=n?i:2*n-i;
            for( k=1;k<star;k++){
                if(k==1||k==5||k==i-1||n*2-i-1==k){
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

