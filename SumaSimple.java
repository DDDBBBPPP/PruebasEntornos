import java.util.Scanner;

public class SumaSimple {
	public static void main(String[] args) {

		int num1;
		int num2;
		int suma;

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el primer número: ");
		num1 = sc.nextInt();
		System.out.print("Introduce el segundo número: ");
		num2 = sc.nextInt();

		suma = num1 + num2;

		System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
		sc.close();
	}

}