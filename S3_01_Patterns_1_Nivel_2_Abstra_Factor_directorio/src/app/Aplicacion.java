package app;
import direccion.*;
import telefono.*;
import Factorias.*;

public class Aplicacion {
  private Int_Telefonos telefono;
  private Int_Direccion direccion;
  
 public Aplicacion (Directorio_Factoria dire_fact) {
	 telefono = dire_fact.crear_telefono();
	 direccion = dire_fact.crear_direccion();
 }
 public void listar() {
	 telefono.listar_telefono();
	 direccion.listar_direccion();
 }
}
