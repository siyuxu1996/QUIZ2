package schoolfee;

import java.util.Scanner;

public class schoolfee {

	public static void main(String[] args) {
		double IT;
		double PI;
		Scanner input = new Scanner (System.in);
		System.out.println("Initial tuition?");
		IT = input.nextDouble();
		System.out.println("percentage increases?");
		PI = input.nextDouble();
		double total=0.0;
		for(int i=0;i<4;i++)
		{
			total=total+IT*Math.pow((1 + PI/100),i);}
		System.out.println(total);
}
}
