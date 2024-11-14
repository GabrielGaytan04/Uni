import java.util.Scanner;

public class BankAccount{

	/**
	 * DECLARACION DE ATRIBUTOS
	 */
	private int accountNumber;
	private double balance;
	private String ownerName;

	/**
         * METODO CONSTRUCTOR POR OMISION
         */

	public BankAccount(){
		
		this.accountNumber = 0000000000;
		this.balance = 0.0;
		this.ownerName = null;
	}
	/**
         * METODO CONSTRUCCTOR PARAMETRIZADO
         */

	public BankAccount(int accountNumber, double balance, String ownerName){

		this.accountNumber = accountNumber;
		this.balance = balance;
		this.ownerName = ownerName;
	}

	/**
         * SETTERS DE LOS ATRIBUTOS
         */
	//setter de accountNumber
	public void setAccountNumber(int num){
		this.accountNumber = num;
	}

	//setter de balance
	public void setBalance(double bal){
		this.balance = bal;
		if(this.balance < 0){
		System.out.println("Saldo no valido, favor de ingresar una cantida mayor a 0");
		}
	}

	//setter de ownerName 
	public void setOwnerName(String nam){
		this.ownerName = nam;
	}

 	/**
         * GETTERS DE LOS ATRIBUTOS
         */

	//getter de accountNumber 
	public int getAccountNumber(){
		return this.accountNumber;
	}

	//getter de balance
	public double getBalance(){
		return this.balance;
	}
	//getter de ownerName
	public String  getOwnerName(){
		return this.ownerName;
	}
	/**
         * METODO MAIN 
         */
	public static void main(String[] args){
		
		//PRUEBA DEL METODO POR OMISION
		BankAccount prueba = new BankAccount();
		System.out.println("PRUEBA DEL METODO POR OMISION");
		System.out.println("El numero de cuenta predeterminado es: " + prueba.accountNumber);
		System.out.println("El balance  predeterminado de la cuenta es: " + prueba.balance);
                System.out.println("El nombre predeterminado del usuario  es: " + prueba.ownerName);

		//PRUEBA DEL METODO CONSTRUCTOR PARAMETRIZADO
                System.out.println("\nPRUEBA DEL METODO CONSTRUCTOR");
		BankAccount segundaPrueba = new BankAccount(1234567890,100.0,"pablo");
    		System.out.println("El numero de cuenta de un usuario es: " + segundaPrueba.accountNumber);
                System.out.println("El balance  del usuario es: " + segundaPrueba.balance);
                System.out.println("El nombre del usuario es: " + segundaPrueba.ownerName);

		//PRUEBA DE LOS SETTERS
		prueba.setAccountNumber(567280398);
		prueba.setBalance(2758.76);
		prueba.setOwnerName("Mario");

		//PRUEBA DE LOS GETTERS
                System.out.println("\nPRUEBA DE LOS GETTERS");
		System.out.println("Se modificaron los valores del objeto prueba");
		System.out.println("Numero de cuenta: " + prueba.getAccountNumber());
		System.out.println("Balance de la cuenta: " + prueba.getBalance());
		System.out.println("Nombre del propietario: " + prueba.getOwnerName());

		/**
		 * Prueba de caso adicional
		 * Solucion si es que el usuario trata de ingresar una cantidad negativa 
		 */
		System.out.println("\nSOLUCION CASO ADICIONAL");
		BankAccount casoAdicional = new BankAccount();
		casoAdicional.setBalance(100.0);
                System.out.println("El saldo ingresado fue: " + casoAdicional.getBalance());

 		
	}
} //FINAL DE LA CLASE
