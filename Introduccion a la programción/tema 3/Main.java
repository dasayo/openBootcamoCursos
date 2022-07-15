public class Main {
    public static void main(String[] args) {
        sumatresNumeros(12,15,23);

        Coche miCoche = new Coche();
        miCoche.anadirPuerta();
        System.out.println(miCoche.numeroDePuertas);

    }
    public static int sumatresNumeros(int a, int b,int c){
        return a+b+c;
    }
}

class Coche{
    int numeroDePuertas = 3;

    void anadirPuerta(){
        numeroDePuertas++;
    }
}

