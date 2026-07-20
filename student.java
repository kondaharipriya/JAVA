class Student{
	String name;
	int rollno;
	String branch;
	public Student(){
		name="Unknown";
		rollno=0;
		branch="Not Assigned";
	}
	public Student(String n,int r,String b){
		name=n;
		rollno=r;
		branch=b;
	}
	public static void main(String args[]){
		Student s1=new Student();
		Student s2=new Student("Haripriya",4,"CSM");
		s1.display();
		s2.display();
	}
	public void display(){
		System.out.println(name);
		System.out.println(rollno);
		System.out.println(branch);
	}
}