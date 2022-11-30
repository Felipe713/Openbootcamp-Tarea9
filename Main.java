public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.edad = 20;
        cliente.nombre = "Teo";
        cliente.telefono = 1234567;
        cliente.credito = 100;

        System.out.println(cliente.edad);
        System.out.println(cliente.nombre);
        System.out.println(cliente.telefono);
        System.out.println(cliente.credito);

        
    }
    
}

class Persona {

    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona {

    int credito;

}

