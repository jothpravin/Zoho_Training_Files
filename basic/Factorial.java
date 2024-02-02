import java.util.Scanner;

public class Factorial{
	static void FactNum(int num){
		int i,fact=1;
		for(i=1;i<=num;i++){
			fact=fact*i;
		}
		System.out.println("The Factorial of "+num+" is :"+fact);
	}
	public static void main(String args[]){
		int number;
		Scanner n =new Scanner(System.in);
		number = n.nextInt();
		FactNum(number);
	}
}
