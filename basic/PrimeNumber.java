import java.util.Scanner;

public class PrimeNumber{
	public static void main(String[] args){
		int i,m=0,flag=0;
		Scanner p =new Scanner(System.in);
		int n = p.nextInt();
		m=n/2;
		if(n==0 || n==1){
			System.out.println("This number is not prime Number"+n);
		}
		else{
			for(i=2;i<n;i++){
				if(n%i==0){
					System.out.println("This number is not prime :"+n);
					flag =1;
					break;
				}
			}
		
		if(flag==0){
			System.out.println("This number is Prime:"+n);
		}
		}

	}
}
