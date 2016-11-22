import java.util.Scanner;

public class t4_ej10_alex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String frase, letrasVeces="";
		char letra;
		int veces=0;
		do{
			System.out.println("Introduce la frase: ");
			frase=teclado.nextLine();
			frase=frase.toUpperCase();
		}while(frase.length()>60);
		
		for(int i=0;i<frase.length();i++){
			letra=frase.charAt(i);
			if(!(letrasVeces.indexOf(letra)>=0)){
				veces=0;
				for(int k=0;k<frase.length();k++)
					veces=letra==frase.charAt(k)?++veces:veces;
			System.out.println("La letra "+ letra +" frecuencia "+100*((float)veces/frase.length()) +"%");
			letrasVeces+=letra;
			}
		}

			}
		}
			
	


