package day2;

public class Day2Assignment3 {

	public static void main(String[] args) {
		int count = 0 ,num = 987654;
		while(num!=0)
		{   
			num/=10;
			++count;
		}
		
		System.out.println(count);
		

	}

}
