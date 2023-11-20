import java.util.*;

class Q3 {
	public static void main(String[] args) {
		System.out.printf("Table of 2^%d: \n",Integer.parseInt(args[0]));
		for(int i=0;i<Integer.parseInt(args[0]);i++) {
			System.out.println((int)Math.pow(2,i));
		}
	}
}
