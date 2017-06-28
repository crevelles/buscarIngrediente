
public class Ingrediente {

	int id_ingrediente;
	String nombre, descripcion;
	
	public Ingrediente(int id_ingrediente, String nombre, String descripcion) {
		super();
		this.id_ingrediente = id_ingrediente;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public Ingrediente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId_ingrediente() {
		return id_ingrediente;
	}

	public void setId_ingrediente(int id_ingrediente) {
		this.id_ingrediente = id_ingrediente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}
