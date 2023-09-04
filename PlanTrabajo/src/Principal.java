import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String arg[]) {
		Procesos misProcesos= new Procesos();
		
		misProcesos.nombre();
		
		misProcesos.numero(1000);
		
		int random = misProcesos.random();
		System.out.println("Su numero aleatorio es: " +random);
		
		int arregloN[]= new int[5];
		for (int i = 0; i < arregloN.length; i++) {
			arregloN[i] = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero en la posicion " +i));
		}
		int maximoValor = misProcesos.maximoValor(arregloN);
		System.out.println("El numero mayor del arreglo es: " + maximoValor);
		
		ArrayList<Integer> listaNumeros=new ArrayList<Integer>();
		String mensaje = "Opciones\n";
		mensaje+="Opcion 1: Ingresar numero\n";
		mensaje+="Opcion 2 : Finalizar ingresos\n";
		int opcion=Integer.parseInt(JOptionPane.showInputDialog(mensaje));
		do {
			listaNumeros.add(Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero")));
			opcion=Integer.parseInt(JOptionPane.showInputDialog(mensaje));
		} while (opcion != 2);
		int valorMaximo = misProcesos.maxValorArrayList(listaNumeros);
		System.out.println("Este es el numero mayor de su ArrayList " + valorMaximo);
			
		int arreglo1[] = new int[5];
        int arreglo2[] = new int[5];
        for (int i = 0; i < arreglo1.length; i++) {
            arreglo1[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero para la suma en la posicion " + i));
        }
        for (int i = 0; i < arreglo2.length; i++) {
            arreglo2[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero para la suma en la posicion " + i));
        }
        int sumaArreglos[] = misProcesos.sumaArreglos(arreglo1, arreglo2);
        System.out.print("La suma de los numeros ingresados en cada arreglo es de: ");
        for (int num : sumaArreglos) {
            System.out.print(num + " ");
        }

        misProcesos.diccionario();
        
        misProcesos.estudiantes();
		
	}
	
}
