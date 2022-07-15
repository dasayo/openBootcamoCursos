public class Main {
   /**
 * @param args
 */
public static void main(String[] args) {
    var numeroIf = 5;
    var numeroWhile =0;
    if(numeroIf < 0) System.out.println("es negativo");
    else if( numeroIf>0) System.out.println("es positivo");
    else System.out.println("es 0");

    while(numeroWhile<3){
        System.out.println();
        numeroWhile++;
    }

    do {
        
    } while (numeroWhile<3);
    

    for (int i = 0; i <=3; i++) {
        System.out.println(i);
    }

    var estación = "verano";

    switch(estación){

        case "verano":
            System.out.println("es verano");
            break;
        case "invierno": 
            System.out.println("es invierno");
            break;
        case "otoño":
            System.out.println("es otoño");
            break;
        case "primavera":
            System.out.println("es primavera");
            break;
        
    }

   }
}
