import java.util.Scanner;
class Exceptionhandling{
    public static void main(String[] args) {
      try{
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter age");
          int age=sc.nextInt();
          if(age>120)
          {
              throw new Exception("invalid age");
          }
          else
          {
              System.out.println("Age is:"+age);
          }
      }
      catch(Exception ex)
      {
          System.out.println(ex.getMessage());
      }
      
    }   
}
