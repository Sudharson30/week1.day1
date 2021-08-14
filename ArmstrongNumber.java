package Week1.Day1;

public class ArmstrongNumber {
public static void main(String[] args) {
	int number = 153;
	int remainder, original;
	double calculated=0;
	while(number>0) {
	remainder = number%10;
	calculated = calculated+Math.pow(remainder, 3);
	original=number/10;
	number=original;	
	}
	if(calculated==153) {
		System.out.println("The number is Armstrong Number");		
	}
	else {
		
	System.out.println("The number is not armstrong number");
	}
	}
}
