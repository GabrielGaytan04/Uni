/**
 * Clase abstracta para catalogar empleados.
 * @author: Gab Gaytan 
 * @date: 11/11/2024
 *
 **/

public abstract class Employee{
	
	/**
	 * DECLARACION DE ATRIBUTOS
	 *
	 */
	

	protected String name;
	protected String email;
	protected String number;

	/**
	 * METODO CONSTRUCTOR POR OMISION 
	 *
	 */

	public Employee(){

		this.name = null;
		this.email = null;
		this.number = null;
	}

        /**
         * METODO CONSTRUCTOR PARAMETRIZADO
         *
         */

	public Employee(String name, String email, String number){

		this.name = name;
		this.email = email;
		this.number = number;
	}
	
	/**
	 *METODO ABSTRACTO
	 *
	 **/
	
	 abstract double calculateSalary();

}
