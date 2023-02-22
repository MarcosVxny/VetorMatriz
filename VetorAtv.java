package VetorMatriz;

import java.util.Scanner;

public class VetorAtv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner leia = new Scanner(System.in);
		
		int pnum[] = new int[10];
		
		for(int x = 0; x <10;x++) {
			System.out.println("\nDigite um numero: ");
			pnum[x] = leia.nextInt();
			
		}
		
		System.out.println("\nDigite o numero que voce deseja encontrar: ");
		int numero = leia.nextInt();
		
		for (int x = 0; x >=0 ; x++) {
		
	    if(pnum[x] == numero) {
		
		System.out.println("\nO número "+numero+" está localizado na posição: " +x+".");
		numero = leia.nextInt();
		}
		
	
		}System.out.println("\nNumero invalido");		
	}	
}