/*
 * Autor: Leonardo de Lima Silva 
 * Email: leonardo.silva0494@gmail.com
 * Data: 22/10/2016 
 */

package br.com.cipher.crypt;

import java.util.ArrayList;

public class CipherCrypt {

	public static void main(String[] args) {
		
		// Alfabeto
		ArrayList<String> af = new ArrayList<String>();
		af.add("A");
		af.add("B");
		af.add("C");
		af.add("D");
		af.add("E");
		af.add("F");
		af.add("G");
		af.add("H");
		af.add("I");
		af.add("J");
		af.add("K");
		af.add("L");
		af.add("M");
		af.add("N");
		af.add("O");
		af.add("P");
		af.add("Q");
		af.add("R");
		af.add("S");
		af.add("T");
		af.add("U");
		af.add("V");
		af.add("W");
		af.add("X");
		af.add("Y");
		af.add("Z");
		af.add("a");
		af.add("b");
		af.add("c");
		af.add("d");
		af.add("e");
		af.add("f");
		af.add("g");
		af.add("h");
		af.add("i");
		af.add("j");
		af.add("k");
		af.add("l");
		af.add("m");
		af.add("n");
		af.add("o");
		af.add("p");
		af.add("q");
		af.add("r");
		af.add("s");
		af.add("t");
		af.add("u");
		af.add("v");
		af.add("w");
		af.add("x");
		af.add("y");
		af.add("z");
				
		// Chave de encriptação
		int chave = 15; // Mudando a chave a criptografia muda
		// Mensagem
		String msg = "Uma vez Flamengo, Sempre Flamengo"; // Alterando aqui você muda a frase que vai ser encriptografa.
		String oMsg = msg;
		// Novo Alfabeto
		ArrayList<String> newAf = new ArrayList<String>();
				
		// Separando novo array de Letras
		// Primeiro - Pegamos as letras que estão sobrando e passamos para o novo array;
		int c = 0;
		for(int x = af.size() - chave; x < af.size(); x++){
			newAf.add(c, af.get(x));
			c = c+1;
		}
		// Segundo - Colocamos o restante do alfabeto no novo array;
		for(int x = 0; x < af.size() - chave; x++){
			newAf.add(c, af.get(x));
			c = c+1;
		}
		
		/* DEBBUG 01 
		System.out.print(af.toString());
		System.out.println();
		System.out.print(newAf.toString());
		
		System.out.println(); // APAGAR
		System.out.println(); // APAGAR
		*/
		
		// Tranformamos a mensagem em um array;
		char[] msgC = msg.toCharArray();
		
		/* DEBBUG 02
		for(int k=0; k < msgC.length; k++)
			System.out.print(k+": "+msgC[k]+", ");
		
		System.out.println(); // Eu sei que o \n existe
		System.out.println(); // Eu sei que o \n existe
		
		*/
		
		String crypt = "";
		
		for(int l=0; l<msgC.length; l++){
			
			if(af.contains(Character.toString(msgC[l]))){
				int indice = af.indexOf(Character.toString(msgC[l]));
				crypt += newAf.get(indice);
			} else{
				crypt += Character.toString(msgC[l]);
			}
		}
		
		System.out.println(oMsg+" - "+crypt);
		
		char[] uncrypt = crypt.toCharArray();
		
		String cryptOld = crypt;
		
		crypt = "";
		
		for(int v=0; v<uncrypt.length; v++){
			
			if(newAf.contains(Character.toString(uncrypt[v]))){
				int indice = newAf.indexOf(Character.toString(uncrypt[v]));
				crypt += af.get(indice);
			} else{
				crypt += Character.toString(uncrypt[v]);
			}
			
		}
		
		System.out.println(cryptOld+" - "+crypt);
		
	}
	
}
