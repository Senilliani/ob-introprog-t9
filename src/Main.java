public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNombre("Lolo");
        cliente.setEdad(35);
        cliente.setTelefono("8228638");
        cliente.setCredito(1500.50);

        System.out.println("El cliente " + cliente.getNombre() + " de edad " + cliente.getEdad() +
                " y telefono " + cliente.getTelefono() + " ha pedido un credito de " + cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Marcos");
        trabajador.setSalario(1800.78);

        System.out.println("El trabajador " + trabajador.getNombre() + " tiene un salario de " + trabajador.getSalario());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona {
    private double credito;

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}