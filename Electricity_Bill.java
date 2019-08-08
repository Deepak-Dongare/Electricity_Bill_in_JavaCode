import java.util.Scanner;

public class Electricity_Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total electrical used unit");
		long a=sc.nextInt();
		if(a<=50)
		{
				double b =50*0.5;
			System.out.println("" +b);
		}
		
		
		


	}
	

	
}
