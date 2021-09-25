package dad.gsonsample;

import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static boolean comprobarNumero(String cadena) {
		int contador = 0;
		for (int i = 0; i < cadena.length(); i++) {
	        // Comprobar si contiene numero
	        if (Character.isDigit(cadena.charAt(i))) {
	            contador++;
	        }
	    }
		if (contador>0) {
	    return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			String nuevoNombre, nuevoApellidos;
			int nuevoEdad = 0;
			boolean esValida = true;

			do {
				System.out.print("Escribe tu nombre: ");
				nuevoNombre = sc.nextLine();
			} while (nuevoNombre.isBlank() || comprobarNumero(nuevoNombre) == true);
			do {
				System.out.print("Escribe tus apellidos: ");
				nuevoApellidos = sc.nextLine();
			} while (nuevoApellidos.isBlank() || comprobarNumero(nuevoApellidos) == true);
			do {
				System.out.print("Escribe tu edad: ");
				try { 
					nuevoEdad = Integer.parseInt(sc.nextLine());
					if (nuevoEdad > 0) { esValida = true; }	// Comprobamos que sea por encima de 0 años
				} catch(Exception e) { 
					esValida = false;
				}
			} while (!esValida);

			Persona p = new Persona(nuevoNombre, nuevoApellidos, nuevoEdad);
				Gson gson = new GsonBuilder().setPrettyPrinting().create();
				String json = gson.toJson(p);
				System.out.println(json);

		}
	}
}
