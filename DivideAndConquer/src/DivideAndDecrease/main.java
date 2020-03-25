package DivideAndDecrease;

public class main {

	public static void main(String[] args) {
		DivideAndDecrease asd = new DivideAndDecrease();
		puntosPlano punto1 = new puntosPlano(0,5);
		puntosPlano punto2 = new puntosPlano(12,12);
		puntosPlano punto3 = new puntosPlano(2,5);
		puntosPlano punto4 = new puntosPlano(23,35);
		puntosPlano punto5 = new puntosPlano(8,561);
		puntosPlano punto6 = new puntosPlano(28,0);
		puntosPlano punto7 = new puntosPlano(76,5);
		puntosPlano punto8 = new puntosPlano(8,31);
		puntosPlano punto9 = new puntosPlano(9,12);
		puntosPlano punto10 = new puntosPlano(64,23);
		tupla prueba = new tupla(punto1, punto2);
		puntosPlano [] array = new puntosPlano[10];
		array[0] = punto1;
		array[1] = punto2;
		array[2] = punto3;
		array[3] = punto4;
		array[4] = punto5;
		array[5] = punto6;
		array[6] = punto7;
		array[7] = punto8;
		array[8] = punto9;
		array[9] = punto10;
		asd.ordenarPorX(array, 0, 9); //end es el ultimo elemento, es array.length-1
		for (int i=0; i<10; i++) {
			System.out.print("(" + array[i].getX() + "," + array[i].getY() + ") ");
		}
		System.out.println();
		/**System.out.println((0+array.length-1)/2);
		System.out.println("(" + array[4].getX() + "," + array[4].getY() + ") ");
		System.out.println(asd.finComp(array, 5, 9, 1612));
		System.out.println("(" + array[6].getX() + "," + array[6].getY() + ") ");*/
		asd.masCercanos(array, 0, 2);
		Double d1 = Math.sqrt(33); 
        Double d2 = Math.sqrt(456); 
  
        // function call to compare two double values 
        System.out.println(d1 + "    " + d2);
        if (Double.compare(d1, d2) == 0) { 
  
            System.out.println("d1=d2"); 
        } 
        else if (Double.compare(d1, d2) < 0) { 
  
            System.out.println("d1<d2"); 
        } 
        else { 
  
            System.out.println("d1>d2"); 
        } 
	}

}