class Students implements Runnable{
	private String name;
	public Students(String name){
		this.name=name;
	}
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println(name +"Writing Page "+i);
		}
	System.out.println(name +"Completed Writing");
	}
}
class ThreadinterfaceEx{
	public static void main(String args[]){
		Students r1=new Students("Haripriya ");
		Thread t1=new Thread(r1);
		t1.start();
		Students r2=new Students("Priya ");
		Thread t2=new Thread(r2);
		t2.start();
	}
}