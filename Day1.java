/*
 * Voici ma solution concernant le problème d'advent of code 2022; day one : https://adventofcode.com/2022/day/1 
 */

package adventOfCode2022;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class Day1 {
	public static void main(String[] args) throws Exception {
		String ligne = "";
		int calories = 0; // initialisation des valeurs
		int topCalories = 0;
		int total = 0;
		ArrayList<Integer> liste = new ArrayList<>();// Création d'une liste pour le total des calories par elfe;
		BufferedReader br = new BufferedReader( // Lecture de l'input
				new FileReader("D:\\Programmes Pro\\ECLIPSE\\Travaux\\Ressources AdventOfCode\\InputDay1-2022.txt")); // chemin

		while ((ligne = br.readLine()) != null) { // lecture ligne par ligne

			if (ligne.isBlank()) { // si la ligne est vide, ça veut dire qu'on passe à un autre elfe
				if (topCalories < calories) { // si le nombre de calories est plus grand que la valeur top Calorie; on
												// met à jour topCalories
					topCalories = calories;

				}

				liste.add(calories); // on ajoute à la liste le total des calories
				calories = 0; // puis on réinitialise la valeur

			} else { // si ce n'est pas "blank", c'est qu'on calcule toujours le total de calories de
						// cet elfe, on ajoute donc ( après conversion ) la valeur de la ligne à la
						// valeur calorie
				calories += Integer.parseInt(ligne);

			}

		}
		System.out.println(topCalories); // Top Calorie tous elfes confondus
		Collections.sort(liste, Collections.reverseOrder()); // on trie notre liste pour afficher dans l'ordre
																// décroissant
		System.out.println(liste);
		total += liste.get(0) + liste.get(1) + liste.get(2); // on aditionne les trois premiers éléments de la liste
		System.out.println(total); // On obient l'adition des trois plus grandes valeurs

	}
}