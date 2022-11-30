public class Empleado {

    public static void main(String[] args) {

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 20;
        trabajador.nombre = "Teo";
        trabajador.telefono = 1234567;
        trabajador.salario = 100000;

        System.out.println(trabajador.edad);
        System.out.println(trabajador.nombre);
        System.out.println(trabajador.telefono);
        System.out.println(trabajador.salario);

        
    }
    
}

class Persona {

    int edad;
    String nombre;
    int telefono;
}

class Trabajador extends Persona{

    int salario;
}
    

