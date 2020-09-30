package co.edu.unbosque.model.persistence;

import java.io.*;

import co.edu.unbosque.model.EjercicioArchivo;

public class NominaFile {
	
	Propiedades prop=new Propiedades();
	String []documento;
	String []nombre;
	Double []salario;
	int tam;
	private String archivodata = ".//data//datosprincipales.txt";
	
	public NominaFile() {
		prop.escribirPropiedades(1);
		prop.leerPropiedades(0);
	tam=Integer.parseInt(prop.getNumregistros());
		documento=new String[tam];
		nombre=new String[tam];
		salario=new Double[tam];
	}
	
	public int escribirArchivo(String dato,String ruta) {
		
		File f = new File(ruta); // f-> carga el archivo
		
		try {
			boolean cond=f.createNewFile();
			FileWriter fw = new FileWriter(f); // fr-> Crea el flujo hacia f
			PrintWriter pw = new PrintWriter(fw); //pw-> Permite la escritura en el archivo
			
			pw.println(dato); //se escribe el contenido del parámetro dato en el archivo
			fw.close();
			
			
			
			
		} catch (IOException e) {
			return -1;
		} 
		
		return 0;
	}
	
	public String leerArchivo() {
		
		String linea = "";
		String cadena = "";
		
		File f = new File(this.archivodata); // f-> carga el archivo
		
		try {
			FileReader fr = new FileReader(f); // fr-> Crea el flujo desde f
			BufferedReader br = new BufferedReader(fr); //br ->permite la lectura
			
			linea = br.readLine();     //linea toma el valor de la primera linea leída 
			
			String[] parts = linea.split(";");
			String part1 = parts[0].replace("Â",""); 
			String part2 = parts[1].replace("Â",""); 
			String part3 = parts[2].replace("Â",""); 
			
		
			
			int i=0;
			cadena += linea+"\n";
			
			while (linea != null && i<=25) {    //mientras haya datos por leer en el archivo
				linea = br.readLine(); //leer el valor de la siguiente linea
				String[] parts2 = linea.split(";");
				 part1 = parts2[0].replace("Â",""); // 123
				 part2 = parts2[1].replace("Â",""); // 654321
				 part3 = parts2[2].replace("Â",""); // 654321
				
				if(!part1.equals("Documento ") || !part1.equals("Documento" )) {
					double parte3=Double.parseDouble(part3);
				documento[i]=part1.substring(0,part1.length()-1);
				nombre[i]=part2.substring(0,part2.length()-1);
				salario[i]=parte3;
				}
				
				cadena += linea+"\n";       //acumular en cadena lo leido en linea
				
			i++;			
			}
			fr.close();
		} 
		catch (IOException e) {
			return null;
		}
		return cadena;
	}
	
	public String imprimirDatos() {
		String res="Documento:"+"                 Nombre:   "+"                  Salario: \n";
		for(int i=0;i<documento.length;i++) {
			
		res+=documento[i]+";"+nombre[i]+";"+salario[i]+"\n";	
			
		}
	
		
	
	return res;
	}

	public String[] getDocumento() {
		return documento;
	}

	public void setDocumento(String[] documento) {
		this.documento = documento;
	}

	public String[] getNombre() {
		return nombre;
	}

	public void setNombre(String[] nombre) {
		this.nombre = nombre;
	}

	public Double[] getSalario() {
		return salario;
	}

	public void setSalario(Double[] salario) {
		this.salario = salario;
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}
	
	
}
