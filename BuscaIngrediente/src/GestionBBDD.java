import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GestionBBDD {

	
	Connection conexion;

	public GestionBBDD(Connection conexion) {
		super();
		this.conexion = conexion;
	}
	
	public void cargarRecetas(ArrayList<Ingrediente> ingredientes){
		try {
			Statement stmt = conexion.createStatement();
			String select = "SELECT *FROM INGREDIENTES";
			ResultSet rset = stmt.executeQuery(select);
			while(rset.next()){
				Ingrediente i = new Ingrediente();
				i.setId_ingrediente(rset.getInt("ID_ING"));
				i.setNombre(rset.getString("NOMBRE"));
				i.setDescripcion(rset.getString("DESCRIPCION"));
				ingredientes.add(i);
			}
			rset.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
