package pattern;

public class pattern1 {

        public static void main(String[] args) {
            int n=4;
            for (int i = 1; i <= n; i++){
                for(int space=1;space<n-i+1;space++)
                {
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print(" "+j);
                }
                System.out.println();
            }
        }
}

