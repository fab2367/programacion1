package co.edu.unbosque.model.persistence;

import java.io.*;
import java.util.Properties;

public class Propiedades {

	private Properties prop = new Properties();
	private String archivoprop = ".\\config\\archivo.properties";
	private String numregistros,nomprop,nominf,nommedio,nomsup,nommst,nomnomina;
	
	public int escribirPropiedades(int num) {
		try {
			prop.setProperty("nombreProyecto", "FABIANPENAGOSNOMINAV3");
			prop.setProperty("maxregistros", "26");
			prop.setProperty("archpropiedades","archivo.properties");
			prop.setProperty("Archinferior", "Nomina1.txt");
			prop.setProperty("Archmedio", "Nomina2.txt");
			prop.setProperty("Archsuperior", "Nomina3.txt");
			prop.setProperty("Archmaestro", "Maestro.txt");
			prop.setProperty("Archnominaprincipal", "Datosprincipales.txt");
			prop.setProperty("nombreCodigoFuente", "Propiedades.Java");
			if( num==1) {
			
			prop.store(new FileOutputStream(archivoprop), null);	
			}else return 0;
			
		} 
		catch (IOException ex) {
			return -1;
		}
		return 0;
	}	
	
	public String leerPropiedades(int num) {
		String linea="";
		numregistros=nomprop=nominf=nommedio=nomsup=nommst=nomnomina="";
		try {
			// leer el archivo de propiedades
		prop.load(new FileInputStream(archivoprop));

		// obtener las propiedades definidas
		if(num==1) {
			prop.list(System.out);
			
		}
		
		//Reading each property value
		numregistros=prop.getProperty("maxregistros");
		nomprop=prop.getProperty("archpropiedades");
		nominf=prop.getProperty("Archinferior");
		nommedio=prop.getProperty("Archmedio");
		nomsup=prop.getProperty("Archsuperior");
		nommst=prop.getProperty("Archmaestro");
		nomnomina=prop.getProperty("Archnominaprincipal");
		
		linea += "nombre del Proyecto     :" + prop.getProperty("nombreProyecto")+"\n";
		linea += "maximo de registros     :" + prop.getProperty("maxregistros")+"\n";
		linea += "archivo de propiedades  :" + prop.getProperty("archpropiedades")+"\n";
		linea += "archivo inferior        :" + prop.getProperty("Archinferior")+"\n";
		linea += "archivo medio           :" + prop.getProperty("Archmedio")+"\n";
		linea += "archivo superior        :" + prop.getProperty("Archsuperior")+"\n";
		linea += "archivo maestro         :" + prop.getProperty("Archmaestro")+"\n";
		linea += "archivo nomina principal:" + prop.getProperty("Archnominaprincipal")+"\n";
		linea += "nombre codigo fuente    :" + prop.getProperty("nombreCodigoFuente")+"\n";
		
		} 
		catch (IOException ex) {
			return null;
		}
		return linea;
	}

	public String getNumregistros() {
		return numregistros;
	}

	public void setNumregistros(String numregistros) {
		this.numregistros = numregistros;
	}

	public String getNomprop() {
		return nomprop;
	}

	public void setNomprop(String nomprop) {
		this.nomprop = nomprop;
	}

	public String getNominf() {
		return nominf;
	}

	public void setNominf(String nominf) {
		this.nominf = nominf;
	}

	public String getNommedio() {
		return nommedio;
	}

	public void setNommedio(String nommedio) {
		this.nommedio = nommedio;
	}

	public String getNomsup() {
		return nomsup;
	}

	public void setNomsup(String nomsup) {
		this.nomsup = nomsup;
	}

	public String getNommst() {
		return nommst;
	}

	public void setNommst(String nommst) {
		this.nommst = nommst;
	}

	public String getNomnomina() {
		return nomnomina;
	}

	public void setNomnomina(String nomnomina) {
		this.nomnomina = nomnomina;
	}
	
	
	
}
