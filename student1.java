package P1;
public class student1{
	public String name;
	private String rollno;
	String branch;
	protected String grade;
	public student1(String name,String rollno,String branch,String grade){
		this.rollno=rollno;
		this.name=name;
		this.branch=branch;
		this.grade=grade;
	}
	void show(){
		System.out.println("Name :"+name);
		System.out.println("Rollno :"+rollno);
		System.out.println("Branch :"+branch);
		System.out.println("Grade :"+grade);
	}
}