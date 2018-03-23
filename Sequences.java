import java.util.Random;
import java.io.*;
import java.util.*;
/**
 * Esta clase genera secuencias genéticas aleatorias
 * @author ALISSON
 *
 */
public class Sequences {
//Funcion que retorna un valor String(A,C,G,T)
	public static String Nucleotide()
	{
		Random rd = new Random();
		
		switch(rd.nextInt(4))
		{
			case 0: return "A";
			case 1: return "B";
			case 3: return "T";
				default: return " ";
		}
	}
	//Funcion que crea la secuencia
	public static String sequence(int num)
	{
		if(num == 1) 
			return Nucleotide();
		else 
			return Nucleotide() + sequence(num-1);
	}
	//Funcion que retorna un número aleatorio 1-1000
	public static String Chromosome()
	{
		Random rd = new Random();
		return "chr" + (rd.nextInt(23) + 1);
	}
	//Funcion que crea el archivo . txt
	public static void createFile()
	{
		
		
			FileWrite file = new FileWriter("sequence.txt"); //Escritor del archivo
			BufferedWriter bw = new BufferedWriter(file); // Buffer del escritor
			int n=1000;
			Random rd = new Random();
			Random rdi = new Random();
			
			try
			{
				for(int i=0; i<1000; i++)
				{
					int num = rd.nextInt(46)+5;
					int ri = rdi.nextInt(1000)+1;
					int fin = ri+num-1;
					bw.write(sequence(num) + "," + Chromosome() + "," + inicio(ri) + "," + fin + "\n");
				}
				bw.flush(); //Guarda la secuencia
			}
			catch (Expetion ex) {}
	}
	
	
}
