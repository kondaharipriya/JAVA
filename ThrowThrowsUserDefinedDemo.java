import java.util.Scanner;
class InvalidGradeException extends Exception{
	public InvalidGradeException(String message){
		super(message);
	}
}
class ThrowThrowsUserDefinedDemo{
	static void checkGrade(String grade)throws InvalidGradeException{
		if(!((grade.equals("O+"))||(grade.equals("O"))||(grade.equals("A+"))||(grade.equals("A"))||(grade.equals("B+"))||(grade.equals("B"))||(grade.equals("C"))||(grade.equals("F")))){
			throw new InvalidGradeException("Invalid Grade");
		}
	}
	public static void main(String args[])throws InvalidGradeException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name:");
		String name=sc.nextLine();
		System.out.println("Enter grade:");
		String grade=sc.nextLine();
		grade=grade.toUpperCase();
		try{
			checkGrade(grade);
			System.out.println("Registration Successful");
		}
		catch(InvalidGradeException e){
			System.out.println("Registration Failed:"+e.getMessage());
		}
	}
}