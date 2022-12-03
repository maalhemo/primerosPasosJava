package primerholamundo;

public class holaconnumeros {
public static void main (String[]args) {
	System.out.println ("Hola mundo ");
	int edad = 36;
	System.out.println("edad = "+edad);
	double salario = 1525.50;
	System.out.println("salario = "+salario);
	double salariomitad = salario / 2;
	System.out.println("la mitad del salario es: "+salariomitad);
	
	double variable1 = 2580.54;
	int variableconvertidaint = (int)variable1;//cast
	System.out.println(variableconvertidaint);

int cantidadPersonas = 3;


if (edad >= 18) {
    System.out.println("Tienes más de 18 años");
    System.out.println("Bienvenido ");
} else {
    if (cantidadPersonas >= 2) {
        System.out.println("No tienes 18 años, pero puedes ingresar, porque estás acompañado");
    } else {
        System.out.println("Lamentablemente no puedes ingresar");
    }
}

}
}
