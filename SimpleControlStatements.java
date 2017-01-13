import java.util.Scanner;


/*
 * Futility at its finest
 */



public class SimpleControlStatements {
	public static void main(String[] args){	
		System.out.println("How old are you?");
		
		Scanner scanman = new Scanner(System.in);
		int age = scanman.nextInt();
		
		
		if ( isLessThan18(age))
			System.out.println("you are a child");
		else if (!isLessThan18(age))
			System.out.println("you are an adult");		
	
	}
	
	
	private static boolean isLessThan18(int age){
		if (age == 1)
			return true;
		else if (age == 2)return true;
		else if (age == 3)return true;
		else if (age == 4)return true;
		else if (age == 5)return true;
		else if (age == 6)return true;
		else if (age == 7)return true;
		else if (age == 8)return true;
		else if (age == 9)return true;
		else if (age == 10)return true;
		else if (age == 11)return true;
		else if (age == 12)return true;
		else if (age == 13)return true;
		else if (age == 14)return true;
		else if (age == 15)return true;
		else if (age == 16)return true;
		else if (age == 17)return true;
		else if (age >= 18)return false;
		return false;
	}
}
