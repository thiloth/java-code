package pattern;

//public class triangle {
//    public static void main(String[] args) {
//        int  n=4;
//        for(int i=1;i<(2*n);i++){
//            int space=i<=n?n-i:i-n;
//            for(int k=1;k<=space;k++){
//                System.out.print("  ");
//            }
//            int star=i<=n?i:(2*n)-i;
//            for(int j=1;j<=star;j++){
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }
//    }
//}

//------------------method 2-------------------------------------------------------------
class triangle1 {
    public static void main(String[] args) {
        int  n=4;
        int star=1;
     //   int space=n-1;
        for(int i=1;i<(2*n);i++){
//            for(int k=1;k<=space;k++){
//                System.out.print("  ");
//            }
            for(int j=1;j<=star;j++){
                System.out.print(star+" ");
            }
            System.out.println();
            if(i<n){
                star++;
               // space--;
            }
            else{
                star--;
               // space++;
            }
        }
    }
}
