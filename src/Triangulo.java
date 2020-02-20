
public class Triangulo implements Figura{

	public int Lado;
	public String tipo;
	public char Caracter;
	
	public Triangulo() {
		super();
		Caracter ='*';
	}
	
	public Triangulo(int lado, String tipo, char caracter) {
		super();
		Lado = lado;
		this.tipo = tipo;
		Caracter = caracter;
	}
	public String nombre(){
		return " Triangulo de tipo: "+this.Lado+" x "+this.Lado;
	}
	public void Dibujar(){
		if (tipo.equals("a")){
			for(int i=0;i<Lado;i++){
				for(int j=Lado;j>i;j--){	
					System.out.print(Caracter);
				}
				System.out.print("\n");
			}
		}else {
			if(tipo.equals("b")){
				for(int i=Lado;i>0;i--){
					for(int j=i;j<i;j++){	
						System.out.print(Caracter);
					}
					System.out.print("\n");
				}
			}else {
				if(tipo.equals("c")){
					for(int i=0;i<Lado+1;i++){
						for(int j=0;j<i;j++){	
							System.out.print(Caracter);
						}
						System.out.print("\n");
					}
				}else {
					if(tipo.equals("d")){
				
					}
				}
			}
		}
	}
	public int Area(){
		int area = (Lado*Lado)/2;
		return area;
	}
	public void setCaracter(char c){
		this.Caracter=c;
	}
	public char getCaracter(){
		return this.Caracter;
	}
}
