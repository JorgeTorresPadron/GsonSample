package dad.gsonsample;

public class Persona {

	private String nombre;
	private String apellidos;
	private int edad;
	
	Persona(String nuevoNombre, String nuevoApellidos, int nuevoEdad) {
		nombre=nuevoNombre;
		apellidos=nuevoApellidos;
		edad=nuevoEdad;
		
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
