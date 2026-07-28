class Method_Overloading{
	void student(String name){
		System.out.println("Name of the student : "+name);
	}
	void student(int rollno,String dept){
		System.out.println("Roll Number : "+rollno);
		System.out.println("Department : "+dept);
	}
	public static void main(String args[]){
		Method_Overloading obj=new Method_Overloading();
		obj.student("Haripriya");
		obj.student(4,"CSM");
	}
}