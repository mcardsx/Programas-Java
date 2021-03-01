package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {

		ArrayList<String> cursos = new ArrayList<String>();

		String curso1 = "Java.io aprofundando";
		String curso2 = "Aprendendo Java.lang";
		String curso3 = "Aprofundando Collections java com paulo silveira!";

		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);

		// System.out.println("a primeira aula da lista é: " + cursos.get(0));
		// cursos.remove(0);

		Collections.sort(cursos);

		for (String curso : cursos) {
			System.out.println("Alura: " + curso);
		}

	}

}
