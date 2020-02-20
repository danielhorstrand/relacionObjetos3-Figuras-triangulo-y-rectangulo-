import java.util.ArrayList;

public class Pantalla {

	ArrayList<Figura> figuras= new ArrayList<Figura>();
	
	public void añadeFigura(Figura figura){
		figuras.add(figura);
	}
	public void modificaFigura(char c){
		
		for (Figura figuras1:figuras){
			figuras1.setCaracter(c);
		}

	}
	public void listaFigura(){
		for (Figura figuras1:figuras){
			System.out.println(figuras1.nombre());
		}
	}
	public int areaPantalla(){
		int areatotal= 0;
		for (Figura figura1:figuras){
			areatotal= areatotal+figura1.Area();
		}
		System.out.println(areatotal);
		return areatotal;
	}
	public void muestraPantalla(){
		for (Figura figuras1:figuras){
			System.out.println(figuras1.nombre()+" con un area de: "+figuras1.Area());
		}
	}
}
