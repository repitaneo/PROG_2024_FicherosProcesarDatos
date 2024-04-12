package data;

public class DataProcesor {

	public static void procesarLineaNumerica(String linea, int numeroLinea) {
		
		try {
			float numero = Float.parseFloat(linea);
			if(numero<0) {
				throw new Exception("Numero "+numero+" en linea "+numeroLinea+ " incompatible");
			}
			System.out.println("["+numeroLinea+"] "+numero);
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
	}

}
