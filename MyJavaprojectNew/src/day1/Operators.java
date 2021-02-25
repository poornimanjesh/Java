 package day1;

public class Operators {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		//Arithmetic operators ----> + - * / % 
		
		System.out.println("******************************************Arithmetic operators*********************"); 
		System.out.println("sum of c is:" + a+b); //ans will be 1020
		System.out.println("sum of c is:" +( a+b));
		System.out.println("Diff of c is:" +( b-a));
		System.out.println("Div of c is:" +( a/b));
		System.out.println("Mod of c is:" +( a%b));
		System.out.println("mul of c is:" +( a*b));
       
		//Relational Operators(comparison operator)----> == < > <= >= !=
		System.out.println("******************************************Relational operators*********************"); 
		System.out.println(a==b); //false
		System.out.println(a>b);  //false
		System.out.println(a<b);  //true
		System.out.println(a>=b); //false
		System.out.println(a<=b); //true
		System.out.println(a!=b); //true
		
		//Logical operators && || !
		// works between two boolean
		
		boolean x=true; 
		boolean y=false;
		
		System.out.println("******************************************Logical operators*********************"); 
		System.out.println(x && y); //false
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);

		
		//increment/decrement operator
		System.out.println("******************************************increment*********************");
		a=10;
		//a=a+1; //the ans will be 11
		a++;   // this is shortcut method in java it increment 1 the ans will be 11
		System.out.println(a);
		
		System.out.println("******************************************Logical operators*********************");
		b=20;
		//b=b-1; //the ans will be 19
		b--;   // this is shortcut method in java it decrement 1 the ans will be 19
		System.out.println(b);
		
		




	}

}
