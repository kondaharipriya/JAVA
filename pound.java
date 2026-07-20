import java.util.Scanner;
public class pound {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number of pounds: ");
        double p = sc.nextDouble();
	double kg = p * 0.45359237;
	System.out.println(p + " pounds converted to kg = " + kg);
	sc.close();
    }
}
		