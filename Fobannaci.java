import java.util.Scanner; 
public class Fobannaci{
	public static void main(String[] args){
		
		Scanner k = new Scanner(System.in);
		System.out.println("Enter the number for finding the Fobannaci sequence:-");
		int n= k.nextInt();
		int first=0;
		int second=1;
		int next;
		
		if(n==0)
		{
         System.out.println("0");     
		}
		else if(n==1)
		{
			System.out.println("1");
		}
		else if(n>1)
		{
			int i;

			for(i=1;i<=n;++i)
			{
				System.out.println(first);
				next=first+second;
				second=first;
				first=next;

				

			}
			
		}

	}
}