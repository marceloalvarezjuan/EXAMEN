import java.util.Scanner;
public class NUMERODOS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int a = 0;

		System.out.println("Ingrese la dimensión de la lista");
		a = entrada.nextInt();
		int numeros[] = new int[a];
		int nuevo[] = new int[numeros.length - 3];
		System.out.println("Ingrese los valores de la lista");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = entrada.nextInt();

		}

		for (int i = 0; i < numeros.length - 3; i++) {

			nuevo[i] = numeros[i] * numeros[i + 1] * numeros[i + 2] * numeros[i + 3];

		}
		int max = nuevo[0];
		int h = 0;
		for (int i = 0; i < numeros.length - 3; i++) {
			if (max < nuevo[i]) {
				max = nuevo[i];
				h = i;
			}
		}

		System.out.println("Los números consecutivos con el mayor producto son:");
		System.out.print(numeros[h] + "," + numeros[h + 1] + "," + numeros[h + 2] + "," + numeros[h + 3]);

	}

}
