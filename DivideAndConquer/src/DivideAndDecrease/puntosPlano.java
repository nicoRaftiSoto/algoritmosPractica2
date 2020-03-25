package DivideAndDecrease;

public class puntosPlano {
	int x;
	int y;

	public puntosPlano(){
		this.x = 0;
		this.y = 0;
	}
	public puntosPlano(int xa, int ya) {
		this.x = xa;
		this.y = ya;
	}
	
	public void setX(int aux) {
		this.x = aux;
	}
	
	public void setY(int aux) {
		this.y = aux;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
}