import java.util.*;

class Q2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the year you want to check whether leap or not:");
		String year=input.nextLine();
		if(year.length()!=4) {
			System.out.println("Invalid Year!!");
			return;
		}
		if(Integer.parseInt(year)%4==0) {
			System.out.println("This is a Leap Year");
		} else {
			System.out.println("This is not a Leap Year");
		}
		input.close();
	}
}
