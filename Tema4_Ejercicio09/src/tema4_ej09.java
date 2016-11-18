/*Programa que lea c�digos de personas de 8 caracteres de modo que los cuatro
primeros sean num�ricos y contenidos entre 1990-1995, el quinto car�cter sea solo
(H � M) sexo, el sexto un numero que representa el curso 1 � 2 y los caracteres s�ptimo y
octavo pueden tener cualquier valor. Deben rechazarse los c�digos que no cumplan estas condicions
para que deje de pedir c�digos escribimos �00000000� */
import java.util.Scanner;
public class tema4_ej09 {
	public static void main(String[] args) {

		Scanner teclado=new Scanner(System.in);
		String codigo;
		boolean cosa=false;
		int hombresPrimero=0,mujeresPrimero=0,hombresSegundo=0,mujeresSegundo=0,codigoBueno=0;
		
		do{
			System.out.println("Introduce un c�digo de 8 car�cteres: ");
			codigo=teclado.nextLine();
			//paso todo a may�scula para no tener que comprobar tambi�n mausculas y min�sculas
			codigo=codigo.toUpperCase();
			//si introduzco 
			if(codigo.equals("00000000"))
				cosa=true;
			else{
					if(codigo.length()!=8){}//comrpobamos que la longitud es 8, si no es ya no comprobamos lo del else
					else if(codigo.substring(0,3).equals("199"))//las primeras 3 cifras tienen que ser 199
							if(codigo.charAt(3)>='0' && codigo.charAt(3)<='5')//en el cuerto car�cter solo podemos introducir un n�mero entre 0  5 ambos incluidos
								if(codigo.charAt(4)=='H' || codigo.charAt(4)=='M')//el quinto car�cter tiene que ser H o M
									if(codigo.charAt(5)=='1'){ //comprobamos el sexto car�cter
										hombresPrimero=codigo.charAt(4)=='H'?++hombresPrimero:hombresPrimero; //si es hombre aumentamos en uno
										mujeresPrimero=codigo.charAt(4)=='M'?++mujeresPrimero:mujeresPrimero; //si es mujer lo mismo
										codigoBueno++;//aumentamos el registro en 1
										System.out.println("Registrado correctamente!"); 
									} else if(codigo.charAt(5)=='2'){
											hombresSegundo=codigo.charAt(4)=='H'?++hombresSegundo:hombresSegundo;
											mujeresSegundo=codigo.charAt(4)=='M'?++mujeresSegundo:mujeresSegundo;
											codigoBueno++;
											System.out.println("Registrado correctamente!");
									} else {}
			}//fin del primer else
				
		}while(!cosa);
		
		System.out.println("El n�mero de personas m�triculadas es: " +codigoBueno);
		System.out.println("El n�mero de hombres en primero es: " +hombresPrimero +" mujeres: " +mujeresPrimero +" .");
		System.out.println("El n�mero de hombres en segundo es: " +hombresSegundo +" mujeres: " +mujeresSegundo +" .");
	}

	}
