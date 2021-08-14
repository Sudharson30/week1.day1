package Week1.Day1;

public class PrimeNumber {
public static void main(String[] args) {
	int prime = 13;
	boolean flag=false;
	for(int i=2;i<=7;i++) {
		if (prime%2!=0) {
			System.out.println(prime+" is a prime number");
			flag=true;
			break;
					}
		if(flag==false) {
			System.out.println(prime+ " is not a prime number");
			break;
		}
	}
}
}
