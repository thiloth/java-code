package pattern;

public class Butterfly {
    public static void method1() {
        int n = 4, noc = 2 * n - 1, nor = 1;
        for (int i = 1; i < n * 2; i++) {
            for (int j = 1; j < 2 * n; j++) {
                if (j <= nor || j >= noc) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            if (i < n) {
                nor++;
                noc--;
            } else {
                nor--;
                noc++;
            }
        }
    }

    public static void method2() {
        int n = 5, i, j;
        for (i = 1; i < n * 2; i++) {
            int star = i<= n ? i : 2 * n - i;
            for ( j = 1; j <=star; j++){
                System.out.print("*");
            }
            int s=0;
            int space=i==n?0:i<n?2*n-2*i-1:2*i-9;
            for(int k=0;k<space;k++){
               System.out.print(" ");
            }
            for(int l=0;l<star;l++){
                System.out.print("*");
            }
            System.out.println();

        }


    }

    public static void main(String[] args) {
        method1();
    }
}