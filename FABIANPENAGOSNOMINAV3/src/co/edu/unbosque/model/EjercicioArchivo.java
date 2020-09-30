package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.NominaFile;
import co.edu.unbosque.model.persistence.Propiedades;

public class EjercicioArchivo{
	
	NominaFile archivo=new NominaFile();
	Propiedades prop = new Propiedades();
	Double  []salarioneto10;
	Double  []salarioneto15;
	Double  []salarioneto20;
	String []documento10;
	String []documento15;
	String []documento20;
	int tam=0;
	public EjercicioArchivo() {
		gestionarPropiedades();
		tam=Integer.parseInt(prop.getNumregistros());
	salarioneto10=new Double[tam];
	salarioneto15=new Double[tam];
	salarioneto20=new Double[tam];
	documento10=new String[tam];
	documento15=new String[tam];
	documento20=new String[tam];

	}
	public void procesarNomina(NominaFile archivo) {
		double salario=0;
		for(int i=0;i<archivo.getSalario().length;i++) {
		if(archivo.getSalario()[i]<=2000) {
			salario=archivo.getSalario()[i]-(archivo.getSalario()[i]*0.10);
			salarioneto10[i]=salario;
			documento10[i]=archivo.getDocumento()[i];
		}
		}
		
		double salario2=0;
		for(int i=0;i<archivo.getSalario().length;i++) {
		 if(archivo.getSalario()[i]>2000 && archivo.getSalario()[i]<=5000) {
			salario2=archivo.getSalario()[i]-(archivo.getSalario()[i]*0.15);
			salarioneto15[i]=salario2;
			documento15[i]=archivo.getDocumento()[i];
		}
		}
		
		double salario3=0;
		for(int i=0;i<archivo.getSalario().length;i++) {
		 if(archivo.getSalario()[i]>5000) {
			salario3=archivo.getSalario()[i]-(archivo.getSalario()[i]*0.20);
			salarioneto20[i]=salario3;
			documento20[i]=archivo.getDocumento()[i];
		}	
		}
	}
	
	public String generarNomina10(NominaFile archivo) {
		String sl10="Documento:   Salario neto: "+"\n";
		for (int i = 0; i < salarioneto10.length; i++) {
			if(salarioneto10[i]!=null) {
				sl10+=documento10[i]+";"+salarioneto10[i]+"\n";
			}
			
		}
		
		return sl10;
	}
	public String generarNomina15(NominaFile archivo) {
		String sl15="Documento:   Salario neto: "+"\n";
		for (int i = 0; i < salarioneto15.length; i++) {
			if(salarioneto15[i]!=null) {
				sl15+=documento15[i]+";"+salarioneto15[i]+"\n";

			}
		}
		
		
		return sl15;
	}
	public String generarNomina20(NominaFile archivo) {
		String sl20="Documento:   Salario neto: "+"\n";
		for (int i = 0; i < salarioneto20.length; i++) {
			if(salarioneto20[i]!=null) {
				sl20+=documento20[i]+";"+salarioneto20[i]+"\n";


			}
		}
		return sl20;
		}
	public String generarNominaMaestro(NominaFile archivo) {
			String slmas="Documento:   Nombre: "+"\n";
			for (int i = 0; i < salarioneto20.length; i++) {
				slmas+=archivo.getDocumento()[i]+";"+archivo.getNombre()[i]+"\n";
			}
		
		
		return slmas;
	}
	
	public String gestionarArchivoCadena() {
		
	
		
		return "leí este dato : "+archivo.leerArchivo();
		
	}
	
	
	
	
	
	public String gestionarPropiedades() {
		
		
		prop.escribirPropiedades(0);
		
		return "Se leyeron estas propiedades: "+"\n"+prop.leerPropiedades(0);
	}
	public int getTam() {
		return tam;
	}
	public void setTam(int tam) {
		this.tam = tam;
	}
	
	
	
}



