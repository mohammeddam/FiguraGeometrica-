package FiguraG;
import java.util.Scanner;

public class Figura {
	private static Scanner teclado;

	public static void main(String[] args) {
		/*
		 * Queremos averiguar si la figura introducida es un cuadrado o un rectángulo y
		 * mostrar su perímetro.
		 */
		int base, altura;
		String figura;
		teclado = new Scanner(System.in);
		System.out.print("Introduce la base de la figura: ");
		base = teclado.nextInt();
		System.out.print("Introduce la altura del figura: ");
		altura = teclado.nextInt();
		if (base == altura) {
			figura = "cuadrado";
		} else {
			figura = "rectángulo";
		}
		int perimetro = 2 * base + 2 * altura;
		System.out.println("La figura es un " + figura + " y su perímetro es: " + perimetro);
	}
}