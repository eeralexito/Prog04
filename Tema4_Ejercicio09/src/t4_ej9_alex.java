import java.util.Scanner;

public class t4_ej9_alex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String codigo;
		int h1=0,h2=0,m1=0,m2=0;
		do{
			System.out.println("Introduce el codigo: ");
			codigo=teclado.next();
			codigo=codigo.toUpperCase();
		
			if(!codigo.equals("00000000")){
				if(codigo.substring(0,3).equals("199") && codigo.charAt(3)>='0' && codigo.charAt(3)<='5'){
					if(codigo.charAt(4)=='H' || codigo.charAt(4)=='M'){
						if(codigo.charAt(5)=='1' || codigo.charAt(5)=='2'){
							if(codigo.charAt(4)=='H' && codigo.charAt(5)=='1')
								h1++;
						}
						else
							System.out.println("Curso incorrecto");
						if(codigo.charAt(4)=='M' && codigo.charAt(5)=='1')
								m1++;
							if(codigo.charAt(4)=='H' && codigo.charAt(5)=='2')
								h2++;
							if(codigo.charAt(4)=='M' && codigo.charAt(5)=='2')
								m2++;
					}
					else
						System.out.println("Sexo incorrecto");
				}
				else
					System.out.println("Año incorrecto");
				
				
			}
			else
				System.out.println("Codigo incorrecto");
			}while(codigo.length()!=8 || !codigo.equals("00000000"));
		
		
		System.out.println("Hombres de 1º: "+ h1 +" Hombres de 2º: "+ h2 +" Mujeres de 1º: "+ m1 +" Mujeres de 2º: "+ m2);
		

	
	}

}
