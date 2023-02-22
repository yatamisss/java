package com.generation.primerproyectojava;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class PrimerproyectojavaApplication 
{

	// esto es un comentario
	/*esto es un 
	 * bloque de 
	 * comentarios
	 */

	 /*como se escribian las funciones en javaScript
	  * function nomFuncion(parametros){
		contenido de la funcion en caso de ser necesario un return 
	  }
	 */

	 /* como se definen variables en js
	 var nomvar = contenido;
	 let nomVar = contenido;
	 const nomConst = contenido;
	  */

	  /*definicion de variables en Java 
	  tipos de variables que existen en Java 
	   * String -> son las cadenas de caracteres (se escriben en comillas dobles)
	   * int -> son los numeros enteros 
	   * double -> son los numeros decimales
	   * boolean -> son los true o false 
	   * char -> caracteres pero de un solo valos ('A', 'D', 'M') (se escribe con comilla simple)
	   */

	   /* operadores matematicos en JS
		* +,-,/,*,%,**
		 en java son exactamente igual 
	    */

		/*operadores logicos en JS
		 * && (AND), || (OR), ! (negacion de)
		 * en JAVA son exactamentes iguales
		 */

		 /* operadores de comparacion (o de asignacion) JS
		  * > (mayor que), < (menor que), == (igual que), ! (distinto de), === (igual estricto), !==(distinto estricto)
          * en Java el igual estricto y el distinto extrico no existen, solo se comparan y por defecto 
		  es una comparacion estricta 
		 */
		/*como pedir por teclado datos al usuario 
		 * en JS -> prompt ("mensaje")
		 *en JAVA -> primero debemos IMPORTAR la libreria que nos permite ocupar la funcionalidad de 
		 pedirle un dato al usuario (import java.util.scanner;)
		 *luego de importarla debemos inicializarla (Scanner teclado = new Scanner (System.in))
		 *finalmente para utilizar este scanner debemos llamarlo (datoTeclado = teclado.nextLine();)
		 */


	//definicion de funciones en Java
	// para definir una funcion en java puede ser private o public
	//existen dos tipos de funciones las que retornan y las que no
	//EJEMPLO DE FUNCION DE RETORNO 
	public static int suma (int numero1, int numero2){
		int sumaNumero = numero1 + numero2;
		return sumaNumero;
	}
	public static String tuEdad(int edad, char newChar){
		return "tu edad es: " + edad + ", y tu char seleccionado es: " + newChar;
		}

	//EJEMPLO DE FUNCION QUE NO RETORNA
	public static void mostrarTuNombre (String nombre){
	//este es el simil de java con el console.log()
	//podemos escrinir "sout" para que aparezca el System.out...
		System.out.println("tu nombre es: " + nombre);

	}
	
	public static void main(String[] args) {
	// distintas formas de declarar variables en Java 
	int numero = 5;
	String newString = "esto es un string";
	double newDouble = 2.5;
	boolean newBoolean = true;
	char newChar = 'A';

	//aqui dentro del main se llama a la funcion 
	mostrarTuNombre ("yatamis");
	System.out.println (tuEdad(21, 'N'));
    //declaracion de la variable scanner 
    Scanner teclado = new Scanner(System.in);
	System.out.println("ingrese algo en la consola: esto");
	String datoTeclado = teclado.nextLine();
	System.out.println("el dato ingresado por el usuario fue" + datoTeclado);
	//dato freak el teclado se puede cerrar 
	teclado.close();

	}

}
