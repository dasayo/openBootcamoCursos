public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(12);
        persona.setNombre("Stephania");
        persona.setTelefono("123123123");
        System.out.println(persona);

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

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        String str = "Mi nombre es: "+ getNombre()+".\n"+
                     "Tengo: "+getEdad()+" años.\n"+
                     "Mi numero de telefono es: "+ getTelefono()+".";
        return str;
    }
    
}