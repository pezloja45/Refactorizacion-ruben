package refactoring;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un número: ");
		int numero1 = sc.nextInt();
		System.out.print("Introduce otro número: ");
		int numero2 = sc.nextInt();
		System.out.print("Introduce el último número: ");
		int numero3 = sc.nextInt();
		if (numero1 == numero2 && numero1 == numero3) {
			System.out.println("Son iguales");
		} else {
			mayor(numero1, numero2, numero3);
			menor(numero1, numero2, numero3);
		}
		sc.close();
	}

	public static void mayor(int numero1, int numero2, int numero3) {

		int numeroMayor = 0;

		if ((numero1 >= numero2) && (numero1 >= numero3)) {
			numeroMayor = numero1;
		} else {
			if ((numero2 >= numero1) && (numero2 >= numero3)) {
				numeroMayor = numero2;
			} else {
				numeroMayor = numero3;
			}

		}

		System.out.println("El número mayor es " + numeroMayor);

	}

	public static void menor(int numero1, int numero2, int numero3) {

		int numeroMenor = 0;

		if ((numero1 <= numero2) && (numero1 <= numero3)) {
			numeroMenor = numero1;
		} else {
			if ((numero2 <= numero1) && (numero2 <= numero3)) {
				numeroMenor = numero2;
			} else {
				numeroMenor = numero3;
			}

		}

		System.out.println("El número menor es " + numeroMenor);

	}
}