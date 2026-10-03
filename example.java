class H{
	int i=10;
	H(int i){
		this.i=i;
	System.out.println("Parent class i="+i);
	}
}
class B extends H{
	int i=20;
	B(int i){
		super(i);
		System.out.println("Child class i="+this.i);
	}
}
class example{
	public static void main(String args[]){
		B obj=new B(40);
	}
}