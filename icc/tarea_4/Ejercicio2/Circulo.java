/**
 * CLASE QUE CORRIGE LOS ERRORES DE SINTAXIS DEL EJERCICIO 2 
 * @date: 14/11/24
 * @author: Perez Gaytan Angel Gabriel 
 **/

public class Circulo{

	/**
	 * DECLARACION DE VARIABLES 
	 *
	 */

	private int x;
	private int y;
	private int r;


	/**
         * DECLARACION DEL METODO CONSTRUCTOR.
	 * ERROR 1: En la declaracion del metodo, al asignar el valor de r, 
 	 * no declaraban con la palabra this.r, lo cual genera una confusion
 	 * a la hora de compilar producto de que el compilador de java
 	 * no sabe a que variable esta haciendo referencia 
	 *	
	 * 
	 * nota: no es un error en si, pero tambien se corrige el nombramiento de r en el parametro
         * para evitar confusiones a la hora de asignar el valor.
         */

	public Circulo(int x, int y, int r){ //Aparte si es un constructor necesita tener el mismo nombre y escritura de la clase

		this.x = x;
		this.y = y;
		this.r = r; //CORRECION DEL ERROR 

	}//FINAL DEL METODO CONSTRUCTOR

	/**
	 * METODO CONSTRUCTOR POR OMISION
	 * ERROR 2: Asignacion de los valores de x y y: En lugar de escribirlo como viene 
	 * originalmente en el metodo lo que nosotros teniamos que hacer es 
	 * asignarle a cada variable el valor por omision solicitado 
 	 * Quizas se vea un poco redundante, pero queda mucho mas claro para mi escribirlo de esta forma.
	 */

	public Circulo(){
		this.x=100;
		this.y=100;
		this.r=1;
	}//FINAL METODO POR OMISION

	/**
	 *
	 * SETTERS DE LA CLASE
	 * ERROR 3:En el caso del setter de radio, su metodo no debe de devolver nada. 
	 * sin embargo, en el codigo original se escribia como valor de retorno 
	 * un valor tipo int cuando este deberia ser un tipo void
	 *
	 */

	//SETTER RADIO
	public void setRadio(int r){
		this.r = r;
	}//FINAL SETTER RADIO

	//SETTER CENTRO
	public void setCentro(int x, int y){
		this.x = x;
		this.y = y;
	}//FINAL DE SETTER CENTRO


	/**
	 * GETTER DE LA CLASE 
	 * 
	 * El unico atributo para el habiamos definido un setter  que cuenta con un getter es radio.
	 *
	 *
	 * ERROR 4: nunca definimos el valor del area como un atributo que pudiesemos modificar/
	 * entonces el error 4 consistio en corregir la notacion de el metodo de area como un getter y
	 * reescribirlo como un metodo de clase
	 *
	 */
	//GETTER AREA
	public int getRadio(){
		return r; //ERROR 4: HABIAMOS DEFINIDO RADIO COMO R, NO COMO RADIO 
	}//Final del getter de radio
	
	/**
	 * METODOS DE CLASE
	 * Error 5: El perimetro no deberia de ser un void si nosotros deseamos obtener un valor  
	 * asi que para arreglarlo se necesito agregar el tipo de valor de regreso.
	 *
	 * Adicionalmente, necesitamos declarar el area como un valor double sino marca errpr por nuestros datos de entrada 
	 * y por usar pi en nuestras formulas 
	 */

	//CALCULO DE AREA
	public double  Area(){

		double area;
		area = 3.141592*r*r;
		return area;

	}//FINAL DEL METODO PARA CALCULAR AREA
	
	//CALCULO PERIMETRO
	public double  Perimetro(){
		
		double perimetro;
		perimetro= 3.141592*2*r;
		return perimetro;

	}//FINAL DEL METODO PARA CALCULAR PERIMETRO

	/**
	 * METODO MAIN
	 * PRUEBA DE LOS ATRIBUTOS QUE DEFINIMOS.
	 *
	 */
	public static void main(String[] args){

		//DECLARACION DE OBJETOS TIPO CIRCULO
		Circulo prueba = new Circulo();
		Circulo pruebaDos = new Circulo(2,2,500);

		//PRUEBA DEL GETTER RADIO POR OMISION
		System.out.println("\nPRUEBA DE METODO CONSTRUCTOR POR OMISION");
		System.out.println("El radio por omision es:" + prueba.getRadio());
		
		//PRUEBA DEL GETTER DE RADIO PARAMETRIZADO
		System.out.println("\nPRUEBA DE METODO CONSTRUCTOR PARAMETRIZADO");
                System.out.println("El radio del circulo parametrizado es:" + pruebaDos.getRadio());

		//PRUEBA DEL CALCULO DE PERIMETRO
                System.out.println("\nPRUEBA DEL CALCULO DE PERIMETRO");
                System.out.println("El perimetro del circulo parametrizado es:" + pruebaDos.Perimetro());

		//PRUEBA DEL CALCULO DE AREA
                System.out.println("\nPRUEBA DEL CALCULO DE AREA");
                System.out.println("El area del circulo parametrizado es:" + pruebaDos.Area());


	}//FINAL DEL METODO MAIN



}//FIINAL DE LA CLASE
