
public class EjerciciosConNumerosComplejos {
	public static void main(String[] args) {
		
		Complejos z1=new Complejos(10,20);
		Complejos z2=new Complejos(20,50);
		Complejos z3=new Complejos(10,20);
		
		
		//MUESTRA TOSTRING DE Z1 Z2 Y Z3 
		
		System.out.println(z1.toString()+ z2.toString()+ z3.toString());
		
		//SI SON IGUALES O NO Z1 Y Z2
		
		if (z1.equals(z2)) {
			
			System.out.println(z1+" y"+z2+"SON IGUALES");
		}
		else {
			System.out.println(z1+" y"+z2+"NO SON IGUALES");
			
		}
		
		//SI SON IGUALES Z1 Y Z3
if (z1.equals(z3)) {
			
			System.out.println(z1+" y"+z3+"SON IGUALES");
		}
		else {
			System.out.println(z1+" y"+z3+"NO SON IGUALES");
			
		}

		//METODO SUMA 
		System.out.println("LA SUMA DE DOS NUMEROS COMPLEJOS Z1 Y Z3 ES ...");
		System.out.println(z1.suma(z3));
		
		
	}

}
