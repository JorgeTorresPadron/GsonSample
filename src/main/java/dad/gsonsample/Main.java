package dad.gsonsample;

import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			String nuevoNombre, nuevoApellidos;
			int nuevoEdad;

			do {
				System.out.print("Escribe tu nombre: ");
				nuevoNombre = sc.nextLine();
			} while (nuevoNombre.isBlank());
			do {
				System.out.print("Escribe tus apellidos: ");
				nuevoApellidos = sc.nextLine();
			} while (nuevoApellidos.isBlank());
			do {
				System.out.print("Escribe tu edad: ");
				nuevoEdad = sc.nextInt();
			} while (nuevoEdad <= 0);

			Persona p = new Persona(nuevoNombre, nuevoApellidos, nuevoEdad);
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			String json = gson.toJson(p);
			System.out.println(json);

		}
	}
}
