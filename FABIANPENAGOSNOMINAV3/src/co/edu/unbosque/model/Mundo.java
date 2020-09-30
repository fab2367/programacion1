package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.NominaFile;
import co.edu.unbosque.model.persistence.Propiedades;

public class Mundo {
	NominaFile ejf;
	EjercicioArchivo ejar;
	Propiedades prop;
	public Mundo() {
		prop=new Propiedades();
		ejar=new EjercicioArchivo();
		ejf=new NominaFile();
	}
	
	public String imprimirInfo() {
		
		
		return ejf.imprimirDatos();
	}
	
	public Propiedades getProp() {
		return prop;
	}

	public void setProp(Propiedades prop) {
		this.prop = prop;
	}

	public NominaFile getEjf() {
		return ejf;
	}
	public void setEjf(NominaFile ejf) {
		this.ejf = ejf;
	}

	public EjercicioArchivo getEjar() {
		return ejar;
	}

	public void setEjar(EjercicioArchivo ejar) {
		this.ejar = ejar;
	}
	
	
}
