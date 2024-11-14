/**
 * Clase concreta que representa al trabajador de tiempo completo
 * @date: 12/11/24
 *
 * 
 *
 *
 */

public class FullTimeEmployee extends Employee{




	/**
	 *DECLARACION DE VARIABLES
	 */
	private double Salario;



   	/**
	 *METODO CONSTRUCTOR DE UN EMPLEADO DE TIEMPO COMPLETO
	 */

	FullTimeEmployee(String name, String correo, String numero, double Salario){

		super(name, correo, numero);
		this.Salario = Salario;
	}	

    	/**
         * DECLARACION DEL METODO ABSTRACTO
         */
	
	@Override
	public double calculateSalary(){

		this.Salario = Salario;
		return Salario;
	}

      	/**
         *METODO MAIN
         */
	public static void main(String[] args){
	
		FullTimeEmployee prueba = new FullTimeEmployee("Pepito","mepegounpayaso@gmail.com","19182023",12000);
		System.out.println(prueba.calculateSalary());

	}


	
}
