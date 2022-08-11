package Aula2;

import java.util.Scanner;

public class Atividade2class {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("==== PROGRAMA CONVERSOR DE TEMPERATURA ====");
		System.out.println("Digite a temperatura em graus Celsius: ");
		Double celsius = input.nextDouble();
		System.out.println();
		Double fahrenheit = (((9*celsius)+160)/5);
		
		System.out.println("A temperatura "+ celsius + "C" + "corresponde a " + fahrenheit + "F");
	
		input.close();
	}
}
