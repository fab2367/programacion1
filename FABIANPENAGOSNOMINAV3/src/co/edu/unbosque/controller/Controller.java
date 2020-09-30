package co.edu.unbosque.controller;


import co.edu.unbosque.model.EjercicioArchivo;
import co.edu.unbosque.model.Mundo;
import co.edu.unbosque.model.persistence.NominaFile;
import co.edu.unbosque.view.View;

public class Controller {
	
	private View gui;
	
	Mundo m;
	public Controller() {
		m=new Mundo();
	
		gui = new View();
		generarNominas();
		
		/*	gui.escribirDato(m.gestionarArchivoCadena());
		gui.escribirDato(m.gestionarPropiedades());*/
	
	}
	
	public void generarNominas() {
		m.getProp().escribirPropiedades(0);
		m.getProp().leerPropiedades(1);
		m.getEjf().leerArchivo();
		gui.escribirDato(m.imprimirInfo());
		m.getEjar().procesarNomina(m.getEjf());
		m.getEjf().escribirArchivo(m.getEjar().generarNomina10(m.getEjf()),".//data//"+m.getProp().getNominf());
		m.getEjf().escribirArchivo(m.getEjar().generarNomina15(m.getEjf()),".//data//"+m.getProp().getNommedio());
		m.getEjf().escribirArchivo(m.getEjar().generarNomina20(m.getEjf()),".//data//"+m.getProp().getNomsup());
		m.getEjf().escribirArchivo(m.getEjar().generarNominaMaestro(m.getEjf()),".//data//"+m.getProp().getNommst());
		gui.escribirDato("nominas creadas exitosamente");
		
		//".//data//Nomina1.txt"
	}
	

}
