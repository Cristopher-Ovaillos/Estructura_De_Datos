package lineales.estaticas;

public class Pila {
	
		 private Object[] arreglo;
		 private int tope;
		 private static final int TAMANIO = 10;

		 //CONSTRUCTOR
		 // contructor vacio
		 public Pila() {
		  this.arreglo = new Object[TAMANIO];
		  this.tope = -1;
		 }
		//METODO APILAR

		 public boolean apilar(Object nuevoElem) {
		  // Pone el elemento nuevoElem en el tope de la pila. Devuelve verdadero si el elemento se pudo apilar y falso en caso contrario.
		  boolean exito;
		  if (this.tope + 1 >= this.TAMANIO) {
		   //error: pila llena
		   exito = false;
		  } else {
		   //pone el elemento en el tope de la pila e incrementa tope
		   this.tope++;
		   this.arreglo[tope] = nuevoElem;
		   exito = true;
		  }
		  return exito;
		 }
		//METODO DESAPILAR

		 public boolean desapilar() {
		  /*
		   Saca el elemento tope de la pila. Verdadero si la pila no estaba vacia de lo contrario falso
		   */
		  boolean respuesta;
		  //si el elemento de la posicion tope del arreglo es null es porque esta vacia.
		  if (esVacia()) {
		   respuesta = false;
		  } else {
		   //devuelve verdadera si el elemento en la pos tope no esta vacia
		   this.arreglo[this.tope] = null;
		   this.tope--;
		   respuesta = true;
		  }
		  return respuesta;
		 }

		 //METODO obtenerTope
		 public Object obtenerTope() {
		  // Devuelve el elemento en el tope de la pila. Precondición: la pila no está vacía
		  Object elemTope;
		  if (esVacia()) {

		   elemTope = null;
		  } else {
		   elemTope = this.arreglo[this.tope];
		  }
		  return elemTope;
		 }

		 //METODO esVacia
		 public boolean esVacia() {
		  // Devuelve verdadero si la pila no tiene elementos y falso en caso contrario
		  boolean valorLogico;
		  //si e igual -1 es porque es vacia
		  valorLogico = this.tope == -1;
		  return valorLogico;
		 }

		 // METODO vacias
		 public void vaciar() {
		// Saca todos los elementos de la pila.
		  int it;
		  for (it = this.tope; it >= 0; it--) {
		   this.arreglo[it] = null;
		  }
		  this.tope=-1;
		 }

		 //METODO clone
		 @Override
		 public Pila clone() {
		  // Devuelve una copia exacta de los datos en la estructura original

		  //osea uso esta clase para crear un objeto de la clase Pila.
		  Pila duplicado = new Pila();
		  //si no hago esto el tope seria -1.
		  duplicado.tope = this.tope;
		  //conocemos el tamaño del arreglo entonces un for 
		  for (int i = 0; i <= this.tope; i++) {
		   duplicado.arreglo[i] = this.arreglo[i];
		  }
		//retorno
		  return duplicado;
		 }

		 //
		 @Override
		 public String toString() {
		  String texto;
		  texto = "";
		if(this.tope==-1){
		 texto="PILA VACIA";
		}else{
		 texto = "{";
		  for (int l = 0; l <= this.tope; l++) {
		   texto = texto + this.arreglo[l];

		   if (l < this.tope) {
		    texto += ",";
		   }
		   
		  }
		  texto = texto + "}";
		}
		 
		  return texto;
		 }
}
