import java.util.*;

class Q1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the no. of times to flip the coins:");
		int n=input.nextInt();
		int tail=0,head=0;
		for(int i=0;i<n;i++){
			double rand=(Math.random()*1)+0;
			if(rand<0.5) {
				tail++;
			} else {
				head++;
			}
		}
		double headPerc=((double)head*100)/(double)n;
		double tailPerc=((double)tail*100)/(double)n;
		System.out.printf("Head Percentage: %f and Tail Percentage: %f",headPerc,tailPerc);
		input.close();
	}
}
