package day2;

public class JumpStatments {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				break;
			} 

			System.out.println(i);
		}

		for (int c=1;c<=10;c++)
		{
			if(c==5)
			{
				continue;
			}
			System.out.println(c); 
			
			{
				for(int d=1;d<=10;d++)
				{
					if(d==3|| d==5|| d==7|| d==9)
					{
						continue;
					}
					System.out.println(d);
				}
			}

		}

	}  
}


