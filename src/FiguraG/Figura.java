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
		figura = tipoF.tipofigura(base, altura);
		int perimetro = 2 * base + 2 * altura;
		System.out.println("La figura es un " + figura + " y su perímetro es: " + perimetro);
	}

	/**
	 * @param base
	 * @param altura
	 * @return
	 * @deprecated Use {@link tipoF#tipofigura(int,int)} instead
	 */
	public static String tipofigura(int base, int altura) {
		return tipoF.tipofigura(base, altura);
	}
}