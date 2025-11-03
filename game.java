import java.util.*;
public class game {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value:");
		int n=sc.nextInt();
		int[][] a=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=0;
			}
		}
		System.out.println("Enter the coordinates in the form of 0,1,2,3,...etc");		
		while(true)
		{
			System.out.println("Enter the x cordinates one by one :");
			int x1=sc.nextInt();
			int y1=sc.nextInt();
			boolean yyy=true;
			
			while(yyy)
			{
				if(x1<n && y1<n && a[x1][y1]==0)
				{
					a[x1][y1]=1;
					yyy=false;
				}
				else {
					System.out.println("Error Re-enter");
					int ee=sc.nextInt();
					int uu=sc.nextInt();
					if(ee<n && uu<n && a[ee][uu]==0) {
						a[ee][uu]=1;
						x1=ee;
						y1=uu;
						yyy=false;
					}
				}
			}
			
			// print board
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}

			// check X winner
			for(int i=0;i<n;i++)
			{
				int flag=0;
				for(int j=0;j<n;j++)
				{
					if(a[j][i]==1)
					{
						flag++;
					}
				}
				if(flag==n) {
					System.out.println("X is winner");
					return;
				}
			}
			for(int i=0;i<n;i++)
			{
				int flag=0;
				for(int j=0;j<n;j++)
				{
					if(a[i][j]==1)
					{
						flag++;
					}
				}
				if(flag==n) {
					System.out.println("X is winner");
					return;
				}
			}
			int flag=0;
			for(int i=0;i<n;i++)
			{
				if(a[i][i]==1)
				{
					flag++;
				}
			}
			if(flag==n) {
				System.out.println("X is winner");
				return;
			}

			flag=0;
			for(int i=0;i<n;i++)
			{
				if(a[i][n-i-1]==1)  // fixed anti-diagonal
				{
					flag++;
				}
			}
			if(flag==n) {
				System.out.println("X is winner");
				return;
			}

			// O player
			System.out.println("Enter the y cordinates one by one :");
			int x2=sc.nextInt();
			int y2=sc.nextInt();
			boolean p3=true;
			while(p3)
			{
				if(x2<n && y2<n && a[x2][y2]==0)
				{
					a[x2][y2]=2;
					p3=false;
				}
				else {
					System.out.println("Error Re-enter");
					int ee1=sc.nextInt();
					int uu1=sc.nextInt();
					if(ee1<n && uu1<n && a[ee1][uu1]==0) {
						a[ee1][uu1]=2;
						x2=ee1;
						y2=uu1;
						p3=false;
					}
				}
			}
			
			// check O winner
			for(int i=0;i<n;i++)
			{
				int lag=0;
				for(int j=0;j<n;j++)
				{
					if(a[j][i]==2)
					{
						lag++;
					}
				}
				if(lag==n) {
					System.out.println("O is winner");
					return;
				}
			}
			for(int i=0;i<n;i++)
			{
				int lag=0;
				for(int j=0;j<n;j++)
				{
					if(a[i][j]==2)
					{
						lag++;
					}
				}
				if(lag==n) {
					System.out.println("O is winner");
					return;
				}
			}
			flag=0;
			for(int i=0;i<n;i++)
			{
				if(a[i][i]==2)
				{
					flag++;
				}
			}
			if(flag==n) {
				System.out.println("O is winner");
				return;
			}

			flag=0;
			for(int i=0;i<n;i++)
			{
				if(a[i][n-i-1]==2)  // fixed anti-diagonal for O
				{
					flag++;
				}
			}
			if(flag==n) {
				System.out.println("O is winner");
				return;
			}

			// print board again
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
        sc.close();
		}
	}
}
