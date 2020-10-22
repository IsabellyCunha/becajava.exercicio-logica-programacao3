package graus;

import java.util.Scanner;

public class CelsiusFarenheit {

	public static void main(String[] args) {
		int graus = 0;
		
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite os graus em farenheit para converter para celsius: ");
		graus = leitor.nextInt();
 		System.out.print(graus +"° farenheit correspondem a: " + ((graus -32) / 1.8) + "° celsius!\n\n");
 		
 		System.out.println("----------------------------------------------------------------------------------------------------------------------------");
 		System.out.print("Digite os graus em celsius para converter para farenheit: ");
		graus = leitor.nextInt();
 		System.out.print(graus +"° celsius correspondem a: " + ((graus *1.8) +32) + "° farenheit!");
		

	}

}
