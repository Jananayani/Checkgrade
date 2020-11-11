import java.util.Scanner;
public class CheckGrade{

	public static void main(String[] args){
		char grade;
		Scanner scan=new Scanner(System.in);

		System.out.println("Input your grade :");
		grade=scan.next().charAt(0);
		
		switch(grade){
		
		case 'A':
			System.out.println("Excellent");
		break;
		case 'B':
			System.out.println("Well Done");
		break;
		case 'C':
			System.out.println("Good");
		break;
		case 'D':
			System.out.println("You Pass");
		break;
		case 'F':
			System.out.println("Better Try Again");
		break;
		default:
			System.out.println("Invalid Grade");
		
		}

	}
}