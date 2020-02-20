
public class Rectangulo implements Figura{

	public int Base;
	public int Altura;
	public char Caracter;
	
	
	public Rectangulo(char caracter) {
		super();
		Caracter ='*';
	}

	public Rectangulo(int base, int altura, char caracter) {
		super();
		Base = base;
		Altura = altura;
		Caracter = caracter;
	}

	public String nombre(){
		return " Rectangulo de tipo: "+this.Base+" x "+this.Altura;
	}
	public void Dibujar(){
		for(int i=0;i<Altura;i++){
			for(int j=0;j<Base;j++){
				System.out.print(Caracter);
			}
			System.out.print("\n");
		}
	}
	public int Area(){
		int area = Base*Altura;
		return area;
	}
	public void setCaracter(char c){
		this.Caracter=c;
	}
	public char getCaracter(){
		return this.Caracter;
	}
}
