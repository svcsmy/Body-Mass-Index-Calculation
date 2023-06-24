import java.util.Scanner;


public class main {

 public static void main(String[] args) {
	
	// body-mass index calculation
	 
	 Scanner scanner = new Scanner(System.in);
	 
System.out.println("Please enter your height (1.64) ");	 
double height = scanner.nextDouble();

System.out.println("Please enter your weight(54)");
int weight = scanner.nextInt();

int index = (int)(weight * (height*height));

System.out.println("Your body-mass index is: " + index);

 }
}
