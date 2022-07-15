public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(20);
        cliente.setNombre("Alejandro");
        cliente.setTelefono("234123451");
        cliente.setCredito(2000000);

        System.out.println(cliente);

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Stephania");
        trabajador.setEdad(20);
        trabajador.setTelefono("345123123");
        trabajador.setSalario((float)1122315.56);

        System.out.println(trabajador);
    }
}

class Persona{
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

class Cliente extends Persona{
    private int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    @Override
    public String toString() {
        String str = "Nombre: "+getNombre()+".\n"+
                     "Edad: "+getEdad()+" años.\n"+
                     "Telefono: "+getTelefono()+".\n"+
                     "Credito: "+getCredito()+".";
        return str;
    } 
}

class Trabajador extends Persona{
    private float salario;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    @Override
    public String toString() {
        String str = "Nombre: "+getNombre()+".\n"+
                     "Edad: "+getEdad()+" años.\n"+
                     "Telefono: "+getTelefono()+".\n"+
                     "Trabajo: "+getSalario()+".";
        return str;
    } 
}