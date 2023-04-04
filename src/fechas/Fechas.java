import java.util.Scanner;

public class Fechas{

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduce el dia:");
    int dia = sc.nextInt();
    
        System.out.println("Introduce el mes:");
    int mes = sc.nextInt();
    
            System.out.println("Introduce el mes:");
    int año = sc.nextInt();
    
    if ( mes == 1 || mes == 2 || mes == 3){
        System.out.println("La fecha introducida corresponde al primer trimestre del año");
    }else{
        System.out.println("la fecha introducida no corresponde al primer trimestre del año");
    }
    }

}