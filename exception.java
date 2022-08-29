
class Exceptionhandling{
    public static void main(String[] args) {
      try{
          int[] a={5,10};
          int b;
          b=100/(10-a[1]);
          System.out.println(b);
      }
      catch(ArithmeticException e)
      {
          System.out.println("cannot divide by zero");
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
          System.out.println("Not in range");
      }
    }
}
