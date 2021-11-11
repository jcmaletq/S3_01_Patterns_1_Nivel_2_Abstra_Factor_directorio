package Factorias;
import direccion.*;
import telefono.*;
public interface Directorio_Factoria {
	Int_Telefonos crear_telefono();
	Int_Direccion crear_direccion();
}
