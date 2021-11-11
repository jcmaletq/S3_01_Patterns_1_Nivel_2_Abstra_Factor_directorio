package Factorias;

import telefono.*;
import direccion.*;

public class Fr_Factoria implements Directorio_Factoria{
	@Override
	public Int_Telefonos crear_telefono(){	
		System.out.println("entra en Fr_Factoria.crear_telefono");
		return new Fr_Telef();
	    }

	@Override
	public Int_Direccion crear_direccion(){
		System.out.println("entra en Fr_Factoria.crear_direccion");
		return new Fr_Direc();
	}
}
