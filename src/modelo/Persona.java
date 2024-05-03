package modelo;

public class Persona {
	private int ci;
	private String nombre;
	private String apellido;
	private int edad;
	private int peso;

	public Persona(int ci, String nombre, String apellido, int edad, int peso) {
		this.ci = ci;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.peso = peso;
	}

	public void mostrar() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Persona [ci=" + ci + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", peso="
				+ peso + "]";
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

}
