package DivideAndDecrease;

public class tupla {
	puntosPlano punto1 = null;
	puntosPlano punto2 = null;
	
	public tupla() {
		this.punto1 = null;
		this.punto2 = null;
	}
	
	public tupla(puntosPlano aux1, puntosPlano aux2) {
		punto1 = aux1;
		punto2 = aux2;
	}
	
	public void setpunto1(puntosPlano aux) {
		this.punto1 = aux;
	}
	
	public void setPunto2(puntosPlano aux) {
		this.punto2 = aux;
	}
	
	public puntosPlano getPunto1() {
		return punto1;
	}
	
	public puntosPlano getPunto2() {
		return punto2;
	}
	
	public double distanciaPuntos() {
		return Math.sqrt(Math.pow(Math.abs(punto1.getX()-punto2.getX()), 2) + Math.pow(Math.abs(punto1.getY()-punto2.getY()), 2));
	}
}