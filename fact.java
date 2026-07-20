import java.util.Scanner;
class MethodEx{
	public int fact(int n){
		int sum=1;
		for(int i=1;i<=n;i++){
			sum*=i;
		}
		return sum;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		MethodEx obj = new MethodEx();
        int sum = obj.fact(n); 
		System.out.println(sum);
	}
}