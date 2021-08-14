package Week1.Day1;

public class Whileloop {
public static void main (String[] args) {
	int i = 123;
	int remainder;
	int sum=0;
	while (i!=0) {
		remainder = i%10;
		sum = sum+remainder;
		i = i/10;
		}
	System.out.println(sum);
	}
}
