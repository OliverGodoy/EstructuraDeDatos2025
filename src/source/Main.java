package source;

public class Main {
	
	public static void main(String args[]) 
	{
		ListaEnlazada lista = new ListaEnlazada();
		System.out.println("Esta vacio: "+ lista.estaVacia());
		
		lista.addPrimero(7);
		lista.addPrimero(6);
		lista.addPrimero(5);
		lista.addPrimero(4);
		lista.addPrimero(3);
		lista.addPrimero(2);
		lista.addPrimero(1);
		lista.addPrimero(0);
		
		lista.visualizar();
		
		
		
		//System.out.println("Primer elemento: " + lista.obtener(0));
		//System.out.println("Último elemento: " + lista.obtener(lista.size()-1));
		//System.out.println("Tamaño: " + lista.size());
		//System.out.println("Esta vacio: "+ lista.estaVacia());
	}

}
