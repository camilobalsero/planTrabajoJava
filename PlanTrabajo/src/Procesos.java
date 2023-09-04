import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Random;
import javax.swing.JOptionPane;

public class Procesos {
	public void nombre() {
		String nombre = JOptionPane.showInputDialog(null,"Ingrese su nombre completo");
		System.out.println("Hola" + nombre);
	}
	
	public void numero(int numero) {
		if(numero > 10) {
			System.out.println("El numero es mayor a 10 y fue: " + numero);
		}else {
			System.out.println("El numero fue menor a 10 por lo tanto no se podra mostrar");
		}
	}
	
	public int random() {
		Random random = new Random();
		return random.nextInt(100)+1;
	}
	
	public int maximoValor(int arreglo[]) {
		int maximo = arreglo[0];
		for (int i = 0; i < arreglo.length; i++) {
			if(arreglo[i] > maximo) {
				maximo=arreglo[i];
			}
		}
		return maximo;
	}
	
	public int maxValorArrayList(ArrayList<Integer> listaNumeros) {
		int maximo = listaNumeros.get(0);
		for (int i = 0; i < listaNumeros.size(); i++) {
			if (listaNumeros.get(i) > maximo) {
				maximo=listaNumeros.get(i);
			}
		}
		return maximo;
	}
	
	public int[] sumaArreglos(int[] arreglo1, int[] arreglo2) {
        int resultado[] = new int[arreglo1.length];

        for (int i = 0; i < arreglo1.length; i++) {
            resultado[i] = arreglo1[i] + arreglo2[i];
        }
        return resultado;
    }

	public void diccionario() {
	    Hashtable<String, String> diccionario = new Hashtable<String, String>();
	    diccionario.put("Hi", "Hola");
	    diccionario.put("Wolf", "Lobo");
	    diccionario.put("Dog", "Perro");
	    diccionario.put("English", "Ingles");
	    diccionario.put("House", "Casa");
	    diccionario.put("Work", "Trabajar");
	    String mensaje= "<<<<<<<DICCIONARIO INGLES>>>>>>> \n";
	    mensaje+= "Hi \n";
	    mensaje+= "Wolf \n";
	    mensaje+= "Dog \n";
	    mensaje+= "English \n";
	    mensaje+= "House \n";
	    mensaje+= "Work \n";
	    String opc = JOptionPane.showInputDialog(mensaje);
	    System.out.println(" En español la palabra significa: " + diccionario.get(opc));
	}
	
	public void estudiantes() {
    	HashMap<String, ArrayList<Double>> alumnos = new HashMap<String, ArrayList<Double>>();
    	String menu = ":)OPCIONES:)\n";
    	menu+="1. Agregar estudiantes\n";
    	menu+="2. Consultar Notas\n";
    	menu+="3. Salir\n";
    	menu+="Ingrese una opción";
    	int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
    	String nombre;
    	ArrayList<Double> notasL;
    	do {
			switch (opcion) {
			case 1:
				int cantidadE = Integer.parseInt(JOptionPane.showInputDialog("Cuantos estudiantes desea ingresar"));
				for (int i = 0; i < cantidadE; i++) {
					nombre = JOptionPane.showInputDialog("Ingrese el nombre de el alumno");
					notasL = new ArrayList<Double>();
					int cantidadN = Integer.parseInt(JOptionPane.showInputDialog("Cuantas notas desea ingresar para " + nombre));
			    	double nota;
				
			    	for (int j = 0; j < cantidadN; j++) {
						nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota " + (j+1) + " para " + nombre));
						notasL.add(nota);
					}
					alumnos.put(nombre, notasL);
					System.out.println(nombre + " = " + notasL);
				}
				opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
				break;
				
			case 2:
				String nombreCons=JOptionPane.showInputDialog("Ingrese el nombre del estudiante a consultar");
				if (alumnos.containsKey(nombreCons)) {
					ArrayList<Double> notasTemp = alumnos.get(nombreCons);
					System.out.println("Nombre: "+nombreCons);
					
					double sum=0;
					System.out.println("Lista de notas: ");
					for (int i = 0; i < notasTemp.size(); i++) {
						System.out.print(notasTemp.get(i)+",");
						sum+=notasTemp.get(i);
					}
					
					double prom=sum/notasTemp.size();
					System.out.println("\nEl Promedio es: "+prom);
				}else {
					System.out.println("No se encuentra el estudiante: "+nombreCons);
				}
				opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
				break;

			default:
				break;
			}
		} while (opcion != 3);
    }
	
}
