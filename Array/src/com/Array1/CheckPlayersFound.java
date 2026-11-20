package com.Array1;

//Online Java Compiler (Editor)
//Write and run Java online using this editor.
import java.util.*;

class CheckPlayersFound {
	public static void main(String[] args) {
		String players[];
		players = new String[5];
		players[0] = "Virat";
		players[1] = "Devilliers";
		players[2] = "Ben Stokes";
		players[3] = "Tim David";
		players[4] = "Hardik";

//FInd the Name from the Given Data
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Player Name : ");
		String name = sc.nextLine();
		boolean found = false;

		for (int i = 0; i < players.length; i++) {
			if (players[i].equalsIgnoreCase(name)) {
				System.out.println("Players Found : " + players[i]);
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.print("Players : " + name + " not found");
		}
		sc.close();
	}
}
