import java.util.Scanner;

public class NUMEROUNO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner pal = new Scanner(System.in);
		String palabra="",nuevo="";
		int j;
		System.out.println("Ingrese la palabra a evaluar");
		palabra=pal.nextLine();
		j=palabra.length();
		char el[]=new char[j];
		
		for(int i=0;i<j;i++) {
			el[j-i-1]=palabra.charAt(i);
			
		}
		
		nuevo=String.valueOf(el);
		if(nuevo.equalsIgnoreCase(palabra)) {System.out.print("Es palíndromo");}
		else {System.out.print("No es palíndromo");}
	}

}
