package com.marcosviniciusdev;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao = 1;
		
		Televisor tv = new Televisor();
		System.out.println("=-=-=-=-=-=-= Televisao =-=-=-=-=-=-=");
		while (opcao != 0) {
			System.out.printf("\n\n1. Ligar/Desligar \n2. Aumentar Volume \n3. Diminuir Volume \n4. Aumentar Canal \n5. Diminuir Canal \n6. Status\n0. Sair\n\n\nO que deseja fazer: ");
			opcao = sc.nextInt();
			
			switch (opcao) {
			case 1:
				tv.ligar();
				if (tv.ligado) {
					System.out.println("TV ligada!");
				} else {
					System.out.println("TV desligado!");
				}
				break;
			case 2:
				tv.aumentarVolume();
				System.out.println("+ Volume: " + tv.volume);
				break;
			case 3:
				tv.diminuirVolume();
				System.out.println("- Volume: " + tv.volume);
				break;
			case 4:
				tv.aumentarCanal();
				System.out.println("+ Canal: " + tv.canal);
				break;
			case 5:
				tv.diminuirCanal();
				System.out.println("- Canal: " + tv.canal);
				break;
			case 6:
				System.out.println(tv.obterStatus());
				break;

			default:
				System.out.println("Opção invalida.");
				break;
			}
			
		}
		
		sc.close();
	}

}
