package Week1.Day1;

public class Fibonacci {
	public static void main(String[] args) {
		int i=0,j=1, sum;
		for(int k=0; k<=10; k++) {
			sum=i+j;
			i=j;
			j=sum;
			System.out.println(sum + "\n");
		}
	}

	
}
