import java.util.Scanner;

public class Palindrome{
	static void Numcheck()
	{
	int sum=0,rem,temp;
	Scanner n =new Scanner(System.in);
	int num = n.nextInt();
	temp=num;
	while(temp>0)
	{
		rem = temp%10;
		sum =(sum*10)+rem;
		temp = temp/10;
	}
	if(sum==num){
		System.out.println("This is palindrome :"+num);
	}
	else{
		System.out.print("This is not a palindrome :"+num);
	}
}

public static void main(String args[]){
	Numcheck();
}
}
