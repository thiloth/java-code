import java.util.Scanner;

public class one {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("number of person");
		int n=sc.nextInt();
		int temp=0;
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			arr2[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			temp=arr1[i];
			arr1[i]=arr2[i];
			arr2[i]=temp;
			System.out.print(arr1[i]+" ");
			//System.out.print(arr2[i]+" ");
		}
		 
	}

}
