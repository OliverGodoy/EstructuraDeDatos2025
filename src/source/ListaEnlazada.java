package source;

public class ListaEnlazada {
	Nodo cabeza;
	int size;
	
	public ListaEnlazada()
	{
		cabeza = null;
		size = 0;
	}
	
	
	public void addPrimero(Object obj)
	{
		if(cabeza == null)
		{
			cabeza = new Nodo(obj);
		}
		else {
			Nodo temp = cabeza;
			Nodo nuevo = new Nodo(obj);
			nuevo.enlazarSiguiente(temp);
			cabeza = nuevo;
		}
		size++;
	}
	
	
	public void eliminar(int index)
	{
		if(index == 0) {
			cabeza = cabeza.obtenerSiguiente();
		}
		else {
			int contador = 0;
			Nodo temporal = cabeza;
			while(contador < index -1) {
				temporal = temporal.obtenerSiguiente();
				contador++;
			}
			temporal.enlazarSiguiente( 
					temporal.obtenerSiguiente()
					.obtenerSiguiente()
					);
		}
		size--;	
	}
	
	
	public boolean estaVacia()
	{
		return (cabeza == null) ? true : false;
	}
	
	
	public void cortar(int index)
	{
		int contador = 0;
		Nodo temporal = cabeza;
		while(contador < index -1)
		{
			temporal = temporal.obtenerSiguiente();
			contador++;
		}
		temporal.enlazarSiguiente(null);
		size= index;
	}
	
	
	public Object obtener(int index)
	{
		int contador = 0;
		Nodo temporal = cabeza;
		while(contador < index) {
			temporal = temporal.obtenerSiguiente();
			contador++;
		}
		return temporal.obtenerValor();
	}
	
	public int size()
	{
		return size;
	}
	
	 /**
     * recorre la lista y muestra cada dato
     */
    public void visualizar() {
        Nodo n;
        n = cabeza;
        while (n != null) {
            System.out.print(n.valor + " ");
            n = n.siguiente;
        }
    }
	
    //Integrantes Oliver Y Byron
	// Utilizaremos este metodo para odenar un lista
    public void OrdenarLista() {
    	Nodo n;
    	n = cabeza;
    	int mayor = 0;
    	if() {
    		
    	}
    }
	

}
