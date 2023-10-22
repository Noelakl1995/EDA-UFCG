package Exos;

import java.util.Scanner;

public class Vector {

	public static void main(String[] args) {
		String [] estado = new String[10];
		estado[0] = "AC";
		estado[1] = "BA";
		estado[2] = "AM";
		estado[3] = "PE";
		estado[4] = "PB";
		estado[5] = "RJ";
		estado[6] = "CE";
		estado[7] = "SP";
		estado[8] = "RN";
		estado[9] = "MG";
		
		for(int i = 0; i < estado.length; i++) {
			System.out.println("Estado " + i + ":" + estado[i]);
		}
		
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual sigla voce quer buscar");
        String Siglabusca = leitor.nextLine();
        
        System.out.println(Siglabusca);
        boolean encontrou = false;
        for(int i = 0; i < estado.length; i++) {
        	String elemento = estado[i];
        	if(elemento.equalsIgnoreCase(Siglabusca)) {  
        		encontrou = true;
        		break;
        	
        	}
        }
        
        if (encontrou) {
        	System.out.println("Achoooou!");
        }else {
        	System.out.println("Nao Achoooou");
        }
	}

}
