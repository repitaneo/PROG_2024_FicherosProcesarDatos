package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import data.DataProcesor;

public class FicheroReader {
	
	
	public static void procesarDatos(String fichero) {
		
		try {
			// enlaza con un fichero usando las clases de Java
			BufferedReader ficheroEntrada = new BufferedReader(new FileReader(fichero));
			// leo el codigo a ver si existe
			String linea = ficheroEntrada.readLine();
			// mientras que las lineas existan
			
			int numeroLinea = 0;
			while (linea != null) {
				// Procesamos la línea leída
				DataProcesor.procesarLineaNumerica(linea,numeroLinea);
				
				// leemos otra línea
				linea = ficheroEntrada.readLine();
				numeroLinea++;
			}
			ficheroEntrada.close();
		} catch (IOException e) {
			System.out.println("Problemas: " + e.getMessage());
		} catch (Exception e) {
			//Otros fallos
			e.printStackTrace();
		}
	}

}
