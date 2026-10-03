package P1;
import P1.student1;
public class teststudent extends student1{
	public teststudent(String name,String rollno,String branch,String grade){
	super(name,rollno,branch,grade);
}

public static void main(String args[]){
	teststudent s1=new teststudent("Haripriya","F4","CSM","A");
	System.out.println("Name :"+s1.name);
	//System.out.println("Rollno :"+s1.rollno);
	System.out.println("Branch :"+s1.branch);
	System.out.println("Grade :"+s1.grade);
}
}