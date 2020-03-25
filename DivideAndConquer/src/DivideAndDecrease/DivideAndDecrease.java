package DivideAndDecrease;

public class DivideAndDecrease {
	
	public DivideAndDecrease(){	
	}
	
	public int inversion(int[] array, int begin, int end) {
		int devolver = 0;
		if (begin<end) {
			if (end-begin==0) {
				return 0;
			}
			if (end-begin==1) {
				if (array[begin]>array[end]) {
					return 1;
				}
				return 0;
			}
			else {
				int mid = (begin + end)/2;			
				devolver = devolver + inversion (array, begin, mid);
				devolver= devolver + inversion (array, mid+1, end);
				if (array[mid]>array[mid+1]) {
					devolver++;
				}
			}
		}
		return devolver;
	}
	
	public void ordenarPorX (puntosPlano[] array, int begin, int end) {
		  if (begin < end) {
		        int partitionIndex = partition(array, begin, end);
		        ordenarPorX(array, begin, partitionIndex-1);
		        ordenarPorX(array, partitionIndex+1, end);
		    }
	}
		
	private int partition(puntosPlano arr[], int begin, int end) {
	    int pivot = arr[end].getX();
	    int i = (begin-1);
	    for (int j = begin; j < end; j++) {
	        if (arr[j].getX() <= pivot) {
	            i++;
	            puntosPlano swapTemp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = swapTemp;
	        }
	    }
	    puntosPlano swapTemp = arr[i+1];
	    arr[i+1] = arr[end];
	    arr[end] = swapTemp;
	    return i+1;
	}
		
	public tupla puntosMasCercanos(puntosPlano[] array, int begin, int end) {
		tupla aux1 = new tupla();
		tupla aux2 = new tupla();
		tupla posible = new tupla();
		double distanciaMasCortaLados = 0;
		if (end-begin == 1) {
			tupla aux = new tupla(array[begin], array[end]);
			System.out.println("(" + aux.getPunto1().getX() + "," + aux.getPunto1().getY() + ")" + " (" + aux.getPunto2().getX() +"," + aux.getPunto2().getY() + ")");
			return aux;
		}
		if (begin>end) {
			int mid = (begin+end)/2;
			aux1 = puntosMasCercanos(array, begin, mid);
			aux2 = puntosMasCercanos(array, mid+1, end);
			if (aux1.distanciaPuntos()<=aux2.distanciaPuntos()) {
				posible = aux1;
				distanciaMasCortaLados = aux1.distanciaPuntos();
			}
			else {
				posible = aux2;
				distanciaMasCortaLados = aux2.distanciaPuntos();
			}
			int inicio = inicioComp (array, begin, mid, distanciaMasCortaLados);
			int fin = finComp (array, mid+1, end, distanciaMasCortaLados);
			
		}
		return posible;
	}
	
	public int inicioComp(puntosPlano[] array, int begin, int end, double distancia) {
		for (int i = end-1; i>=begin; i--) {
			if (array[end].getX()-array[i].getX()>distancia) {
				return i+1;
			}
		}
		return begin;
	}
	
	public int finComp(puntosPlano[] array, int begin, int end, double distancia) {
		for (int i = begin; i<=end; i++) {
			if (array[i].getX()-array[begin].getX()>distancia) {
				return i-1;
			}
		}
		return end;
	}
	
	public void masCercanos (puntosPlano[] array, int begin, int end) {
		tupla masCerca = new tupla (array[begin], array[begin+1]);
		tupla aux = new tupla();
		tupla aux2 = new tupla();
		for (int i=begin; i<end; i++){
			aux.setpunto1(array[i]);
			for (int j=begin+1; j<=end; j++) {
				aux.setPunto2(array[j]);
				Double d1 = aux.distanciaPuntos();
				Double d2 = masCerca.distanciaPuntos();
				//System.out.println("(" + aux.getPunto1().getX() + "," + aux.getPunto1().getY() + ")" + " (" + aux.getPunto2().getX() +"," + aux.getPunto2().getY() + ")");
				if (Double.compare(d1, d2)<0) {
					System.out.println("entro");
					aux2 = aux;
					System.out.println("(" + aux.getPunto1().getX() + "," + aux.getPunto1().getY() + ")" + " (" + aux.getPunto2().getX() +"," + aux.getPunto2().getY() + ")");
				}
			}
		}
		System.out.println("(" + aux2.getPunto1().getX() + "," + aux2.getPunto1().getY() + ")" + " (" + aux2.getPunto2().getX() +"," + aux2.getPunto2().getY() + ")");
		System.out.println(masCerca.distanciaPuntos());
	}
}