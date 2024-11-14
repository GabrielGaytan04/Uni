public class Misterio{

	//DECLARACION DE VARIABLES
	int valor;
	//METODO CONSTRUCTOR
	public Misterio(int n){
		valor = n;
	}
	//Metodo mystery
	public void mystery(Misterio n){
		n = new Misterio(10);
	}
	//Metodo mystery2
	public void mystery2(Misterio n){
		n.valor=10;
	}	
	//Metodo main
	public static void main(String[] args){
		Misterio n = new Misterio(100000);
		n.mystery(n);
		System.out.println("El valor de n al aplicar la funcion mystery es:" + n.valor);
		n.mystery2(n);
		System.out.println("El valor de n al aplicar la funcion mystery 2 es:" + n.valor);
	}
}
