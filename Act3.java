package Act1; 
import java.util.*;

public class Act3 { 
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter the level of pyramid:");
		int n=sc.nextInt();
		int val=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n-i);j++)
			{
				System.out.print("");
			} 
			for(int j=1;j<=i;j++)
			{
				val++;
				if(val==10)
				{
					val=0;
				} 
				System.out.print(val);
			} 
			int temp=(val==0)?9:val-1;
			for(int j=1;j<i;j++)
			{
				System.out.print(temp);
				temp--;
				if(temp==-1)
				{
					temp=9;
				}
			} 
			System.out.println("");
		}
						
		
	}

}
