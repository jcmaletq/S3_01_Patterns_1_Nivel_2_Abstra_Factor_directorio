package main_f;
import app.*;
import direccion.*;
import telefono.*;
import javax.swing.JOptionPane;

import Factorias.*;

public class main_f {

	private static Aplicacion main_f() {
		Aplicacion apl = null;
		Directorio_Factoria factoria;
		String pais = JOptionPane.showInputDialog("introudce el pais de la direccion","España").toLowerCase();
		if (pais.contains("españa")){
			factoria = new Sp_Factoria();
			apl = new Aplicacion(factoria);
		}
		if (pais.contains("francia")){
			factoria = new Fr_Factoria();
			apl = new Aplicacion(factoria);
		}		
		return apl;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aplicacion app = main_f();
		app.listar();
	}

}
