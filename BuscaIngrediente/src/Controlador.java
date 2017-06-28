import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Controlador implements ActionListener {

	VistaIngrediente vi;
	AccessOracle bbdd;
	ArrayList<Ingrediente> ingredientes = new ArrayList<>();
	GestionBBDD gBBDD;
	
	
	
	public Controlador(VistaIngrediente vi, AccessOracle bbdd) {
		super();
		this.vi = vi;
		this.bbdd = bbdd;
		gBBDD = new GestionBBDD(bbdd.conexion);
		gBBDD.cargarRecetas(ingredientes);
	}





	@Override
	public void actionPerformed(ActionEvent arg0) {
	
		Object o = arg0.getSource();
		
		if(o == vi.btnSalir){
			vi.dispose();
			bbdd.cerrarBaseDatos();
		} else if(o == vi.btnBuscar){
			buscarIngrediente();
		}
	}





	private void buscarIngrediente() {
		boolean encontrado = false;
		String codRec = vi.textId.getText();
		if(codRec.length()==0){
			vi.lblError.setText("No puede quedar el campo vacio");
		} else {
			try{
				int codigoReceta = Integer.parseInt(codRec);
				for (Ingrediente ingrediente : ingredientes) {
					if(ingrediente.getId_ingrediente() == codigoReceta){
						encontrado=true;
						vi.textNombre.setText(ingrediente.getNombre());
						vi.textDescrip.setText(ingrediente.getDescripcion());
						vi.lblError.setForeground(Color.BLUE);
						vi.lblError.setText("Ingrediente encontrado");
					}
				}
			}catch (Exception e) {
				vi.lblError.setForeground(Color.RED);
				vi.lblError.setText("No puede quedar el campo vacio/ Solo números");
			}
			
		}
		if(!encontrado){
			vi.lblError.setText("No hay ningun ingrediente con el id: " + codRec);
			vi.textId.setText(null);
			vi.textNombre.setText(null);
			vi.textDescrip.setText(null);
		}
		
		
	}

}
