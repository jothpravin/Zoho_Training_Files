public class Sample{
	public static void main(String[] args){
		int num =372001,temp=0;
		while(num!=0){
			int rem = num%10;
			temp=temp*10+rem;
			num =num/10;
		}
		System.out.println("Reversed Num:"+temp);
	}
}

