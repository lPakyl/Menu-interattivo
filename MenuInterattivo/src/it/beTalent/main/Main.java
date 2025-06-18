package it.beTalent.main;

import java.util.Scanner;

import it.beTalent.entity.Persona;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nome;
		String cognome;
		int selezione;
		Persona[] utenti = new Persona[5];

		int count = 0;

		while (true) {
			System.out.println("--------------------\nMenù interattivo | Scegli cosa fare: " 
					+ " \n1 - Crea Persona"
					+ "\n2 - Leggi tutti gli utenti" 
					+ "\n3 - Uscita");
					System.out.println("--------------------");

			selezione = sc.nextInt();
			switch (selezione) {
				case 1:
					if(count < utenti.length) {
						System.out.println("Hai scelto 1 | Crea persona");
					
					System.out.println("Inserisci il nome: ");
					sc.nextLine();
					nome = sc.nextLine();

					System.out.println("Inserisci il cognome: ");
					cognome = sc.nextLine();
					utenti[count] = new Persona(nome, cognome);
					System.out.println("Persona creata: " + nome + " " + cognome);
					count++;
					} else {
						System.out.println("Hai raggiunto il limite massimo di utenti");
					}
				break;

			case 2:
				System.out.println("Hai scelto 2 | Stampa persone");
				for (int j = 0; j < utenti.length; j++) {
					Persona p = utenti[j];
					System.out.println((j + 1 + ") " + p.nome + " " + p.cognome));
				}

				break;

			case 3:
				System.out.println("Hai scelto il numero 3 quindi di terminare il software...");
				sc.close();
				System.exit(0);
				count++;
				break;
				
			default:
				System.out.println("Numero non valido per la selzione");
			}
			
		}

	}
}
