package anilprog1;

public class anilcode1
{

	public static void main(String[] args)
	{  
		int n =9;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==(n-1)/2 || i==0 || i==n-1)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			for(int r=0;r<n/2;r++)
			{
				System.out.print(" ");
			}
			
			for(int k=0;k<n;k++)
			{
				if(k==0 || i==k || k==n-1)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			for(int a=0;a<n/2;a++)
			{
				System.out.print(" ");
			}
			for(int l=0;l<n;l++)
			{
				if(l==0|| i==0 || i==(n-1)/2 || i==n-1)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			for(int b=0;b<n/2;b++)
			{
				System.out.print(" ");
			}
			for(int m=0;m<n;m++)
			{
				if(m==0 && i<n-1|| i==n-1 && m>0 && m<n-1|| m==n-1 && i<n-1)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			for(int c=0;c<n/2;c++)
			{
				System.out.print(" ");
			}
			for(int o=0;o<n;o++)
			{
				if(o==0 || i==0 && o<(n-1) || o==(n-1) && i!=(n-1)/2 && i>0|| i==(n-1)/2 && o<(n-1) )
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			for(int d=0;d<n/2;d++)
			{
				System.out.print(" ");
			}
			for(int p=0;p<n;p++)
			{
				if(p==0 && i>0 && i<n-1|| i==0 && p>0 && p<n-1|| i==n-1 && p>0 && p<n-1|| p==n-1 && i>0 && i<n-1)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			for(int e=0;e<n/2;e++)
			{
				System.out.print(" ");
			}
			for(int q=0;q<n;q++)
			{
				if(q==0 || i==q || q==n-1)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	
	}

}
