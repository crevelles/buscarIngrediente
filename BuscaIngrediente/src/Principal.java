
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VistaIngrediente vi = new VistaIngrediente();
		AccessOracle bbdd = new AccessOracle();
		Controlador c = new Controlador(vi, bbdd);
		vi.setControlador(c);
		vi.setVisible(true);
		
	}

	
	
}
