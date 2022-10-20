package boletinarrays;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio9 {
	
	static void desplazaDerecha(int[] lista){
        int i,ultimo;
        
        //Cojo el último elemento del array y lo guardo en "ultimo"
        ultimo=lista[lista.length-1];
        //desplazo todos los elementos de derecha a izquierda
        //dejando sin hueco en la primera posición
        for(i=lista.length-1; i>0; i--){
            lista[i]=lista[i-1];
        }
        //pongo en la primera posición "ultimo" que rescaté al principio
        lista[0]=ultimo;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("escribe de cuanto quieres que sea el array");
		Scanner esc= new Scanner (System.in);
		int n= esc.nextInt();
		int array[]= new int[n];
			for(int i =0; i<array.length;i++) {
			
				
				System.out.println("escribe el numero para la posicion "+i+ " del array");
				array[i]=esc.nextInt();
			}
			desplazaDerecha(array);
			System.out.println(Arrays.toString(array));
	}

}
