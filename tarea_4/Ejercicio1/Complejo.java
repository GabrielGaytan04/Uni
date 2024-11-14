import java.lang.Math;

public class Complejo{

 /**
  * Clase para poder realizar operaciones basicas entre numeros complejos
  * Operaciones planeadas:
  *
  * 1. Modulo
  * 2. Conjugado
  * 3. Suma
  **/

   
   /**
    * Declaracion de variables para construir un numero complejo
    **/

   private double Real;
   private double Imaginario;
   
   
  /**
    * METODO CONSTRUCTOR POR OMISION
    **/

   Complejo(){

        this.Real = 0;
        this.Imaginario = 0;
   
   }


   /**
    * METODO CONSTRUCTOR 
    **/

   Complejo(double Real, double Imaginario){
   	
   	this.Real = Real;
   	this.Imaginario = Imaginario;
   
   }

   /**
    * Setters de los atributos 
    **/

   public void setReal(double Real){
	
	this.Real = Real;
   }   

   public void setImaginario(double Imaginario){
	
	this.Imaginario = Imaginario;
   }

   /**
    *Getters de los atributos 
    **/

   public double getReal(){

        return this.Real;
   }
   
   public double getImaginario(){

        return this.Imaginario;
   }

 


   public String get_Real(){

	return "La parte real de tu numero fue: " + this.Real;
   }
   
   public String get_Imaginario(){

	return "La parte imaginaria de tu numero fue: " + this.Imaginario;
   }

 

  /**
   * METODO PARA PODER EXPRESAR AL NUMERO COMO UNA CADENA 
   */


   public String expresion(){

	String expresion;
	expresion = "Tu numero complejo se puede expresar de la forma: " + "("+ this.Real + "," + this.Imaginario + "i" + ")";
	return expresion;
   }

  /**
   * OPERACIONES ENTRE NUMEROS 
   */


   //Modulo  

   public String modulo(){

	double  modulo;
	modulo = Math.sqrt((Real * Real)+(Imaginario * Imaginario));
 	String expresion_modulo;
	expresion_modulo = "El modulo del numero complejo que ingresaste fue: " + modulo;
	return expresion_modulo;

   }

   //Conjugado 

   public  String conjugado(){
	double conjugado;
	conjugado = (Imaginario) * (-1);
	String expresion_conjugado;
	expresion_conjugado = "Tu numero complejo ahora se puede expresar de la forma: " + "(" + Real + "," + conjugado + "i" + ")";
	return expresion_conjugado;
   }

  //Suma 
  public static String suma(Complejo uno, Complejo dos){
	double sumaReal;
	double sumaImaginaria;
	String representacion_suma;
	sumaReal = (uno.Real) + (dos.Real);
	sumaImaginaria = (uno.Imaginario) + (dos.Imaginario);
	representacion_suma = "Resultado_Suma: "+ sumaReal+ "," + sumaImaginaria + "i";
	return representacion_suma;
  }


   /**
    *Metodo main
    **/

   public static void main(String[] args){

	//Declaracion de un atributo tipo complejo
   	Complejo prueba = new Complejo(4,5);
	Complejo secundario = new Complejo(4,6);
	Complejo terciario = new Complejo();
	
	//Revsion de metodos getters 

     
        System.out.println(prueba.expresion()); //Obtener la forma conocida de un complejo
  	System.out.println(prueba.get_Real()); //Impresion de la cadena que te dice la Parte real de tu numero
	System.out.println(prueba.get_Imaginario()); //Impresion de la cadena que te dice la parte imaginaria de tu numero 
	System.out.println(prueba.modulo()); //Impresion modulo
	System.out.println(prueba.conjugado()); //Impresion conjugado
	System.out.println(suma(prueba,secundario)); //Impresion suma
        System.out.println("El valor real por omision de terciario fue: " + terciario.getReal()); //Revisar tercer valor con el metodo por omision


   } //FINAL METODO MAIN
 
} //FINAL DE LA CLASE
