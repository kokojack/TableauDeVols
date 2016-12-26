package interfaceUtilisateur;

import java.util.Scanner;

public class InterfaceUser 
{

	public static void main(String[] args) 
	{
		char rep = '0';
		do 
		{
			System.out.println("Welcome to the Airport, choose your situation below");
			System.out.println("Administrator: 'A'\t Manager : 'M'\t Member of Equipage: 'E'");
			Scanner sc = new Scanner(System.in);
			rep = sc.nextLine().charAt(0);
			sc.close();
		}while (rep != 'A' || rep != 'M' || rep != 'E');
		switch (rep)
		{
			case 'A':
				new CompoAiroport();
			break;
			case 'M':
				new CompoAiroport();
			break;
			case 'E':
				new CompoAiroport();
			break;
		}
	}

}
