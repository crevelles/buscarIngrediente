import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccessOracle {

	
	private String surl = "jdbc:oracle:thin:@localhost:1521:XE";
	public Connection conexion;

	public AccessOracle() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexion = DriverManager.getConnection(surl, "integrador", "integrador");
			System.out.println(" -Conexi�n con ORACLE establecida -");

			//conexion.close();
		} catch (Exception e) {
			System.out.println(" �Error de Conexi�n con ORACLE -");
			e.printStackTrace();
		}
	}

	public void cerrarBaseDatos() {
		try {
			conexion.close();
			System.out.println("BBDD cerrada");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error al cerrar BBDD");
			e.printStackTrace();
		}
	}
	
	
}
