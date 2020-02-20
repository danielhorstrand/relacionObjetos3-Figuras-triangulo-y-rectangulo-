import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner (System.in);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		Scanner sc = new Scanner (System.in);
		
		Pantalla pantalla = new Pantalla();
		
		int opcion=0;
		
		while (opcion!=6){
		System.out.println("¿Que opcion deseas realizar?\n1)Añadir figura:\n2)Modificar figura:\n3)Mostrar Pantalla:\n4)Area Pantalla:\n5)Listar Figuras:\n6)salir");
		opcion=in.nextInt();
		
		switch (opcion){
		
		case 1:
			System.out.println("¿Que figura desea añadir?");
			String figura= br.readLine();
			if(figura.equals("triangulo")){
				System.out.println("¿Que lado va a tener?");
				int lado=in.nextInt();
				System.out.println("¿Que tipo de es? (a,b,c,d)");
				String tipo = br.readLine();
				System.out.println("¿Que caracter es?");
				char caracter = in.next().charAt(0);
				Figura fig = new Triangulo(lado,tipo,caracter);
				pantalla.añadeFigura(fig);
			}else {
				if(figura.equals("rectangulo")){
					System.out.println("¿Que base va a tener?");
					int base=in.nextInt();
					System.out.println("Que altura va a tener?");
					int altura = in.nextInt();
					System.out.println("¿Que caracter es?");
					char caracter = in.next().charAt(0);
					Figura fig = new Rectangulo(base,altura,caracter);
					pantalla.añadeFigura(fig);
				}else {
					System.out.println("error.");
				}
			}
			break;
		case 2:
			System.out.println("Añade el nuevo caracter: ");
			char caracter = (char) sc.nextInt();
			pantalla.modificaFigura(caracter);
			break;
		case 3:
			pantalla.listaFigura();
			break;
		case 4:
			pantalla.areaPantalla();
			break;
		case 5:
			pantalla.muestraPantalla();
			break;
		}
	}
	}
}