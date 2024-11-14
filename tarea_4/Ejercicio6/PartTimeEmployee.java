/**
 * Clase concreta que representa al trabajador de medio tiempo
 * @date: 12/11/24
 *
 * 
 *
 *
 */

public class PartTimeEmployee extends Employee{



        /**
         *DECLARACION DE VARIABLES
         */
        private double Salario;



        /**
         *METODO CONSTRUCTOR DE UN EMPLEADO DE TIEMPO COMPLETO
         */

        PartTimeEmployee(String name, String correo, String numero, double Salario){

                super(name, correo, numero);
                this.Salario = Salario;
        }       

        /**
         * DECLARACION DEL METODO ABSTRACTO
	 *
	 * En el caso de trabajador de tiempo completo deje integro su salario,
	 * pero en el caso del trabajador de medio tiempo, reduje su salario a la mitad solo 
	 * para que fueran diferentes entre si 
	 *
         */

	
        @Override
        public double calculateSalary(){

                this.Salario = Salario/2;
                return Salario;
        }

        /**
         *METODO MAIN
         */
        public static void main(String[] args){

                PartTimeEmployee prueba = new PartTimeEmployee("Pepito","mepegounpayaso@gmail.com","19182023",12000);
                System.out.println(prueba.calculateSalary());

        }



}


