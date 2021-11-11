package Factorias;

import telefono.*;
import direccion.*;

public class Sp_Factoria implements Directorio_Factoria{
	@Override
	public Int_Telefonos crear_telefono(){
		System.out.println("entra en Sp_Factoria.crear_telefono");
		return new Sp_Telef();
	    }

	@Override
	public Int_Direccion crear_direccion(){
		System.out.println("entra en Sp_Factoria.crear_direcion");
		return new Sp_Direc();
	}
}
