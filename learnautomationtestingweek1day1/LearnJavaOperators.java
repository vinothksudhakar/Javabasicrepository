package learnautomationtestingweek1day1;

public class LearnJavaOperators {

	public static void main(String[] args) {
	
		// Assignment Operator - Assign a value to a variable(=)
		int number=21;
		System.out.println(number);
		
		//Arithmetic Operator ( +, -, *, /)
		int a=7;
		int b=3;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		// To get Quotient use /
		System.out.println(a/b);
		// To get Reminder use %
		System.out.println(a%b);

		//Comparison Operator - Compare 2 values
		
		int c=7;
		int d=8;
		
		//EqualTo (==)
		System.out.println(c==d);

		//notEqualto
		System.out.println(c!=d);

		//LessThan
		System.out.println(c<d);

		//lessThanOrEqualTo
		System.out.println(c<=d);

		//greaterThan
		System.out.println(c>d);

		//greaterThanOrEqualTo
		System.out.println(c>=d);
		
		//Logical Operator - compare two conditions
		// And && - 2 Conditions Condition 1 and Condition 2 - true
		//Or || - 2 conditions - either one of the condition is satisfied - true
		
		int p=10;
		int q=20;
		
		System.out.println(p<q&&p==q);
		System.out.println(p<q||p<q);

		//Increment/Decrement
		int v=7;
		
		//Increment - increase the value by 1
		//postIncrement (v++)
		System.out.println(v++); //7
		System.out.println(v);   //8
	
		//PreIncrement (++v) 
		System.out.println(++v); //9
		System.out.println(v);   //9
		
		//Decrement - decrease the value by 1
		//PostDecrement
		System.out.println(v--); //9
		System.out.println(v);   //8
		
		//PreDecrement (--v)
		System.out.println(--v); //7
		System.out.println(v);   //7
		


		
		
		

	}

}
