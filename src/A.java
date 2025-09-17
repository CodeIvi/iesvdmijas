import java.util.Scanner;

public class A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe la nota del primer examen");
        Double nota1 = sc.nextDouble();

        System.out.println("Escribe la nota del segundo examen");
        Double nota2 = sc.nextDouble();

        Double media = (nota1+nota2)/2;

        if(media>= 5){
            System.out.println("Estas aprobado, tu nota media es de"+ media);
        }else{
            System.out.println("¿Cual ha sido la nota de recuperación?");
            Double recuperacion = sc.nextDouble();
            if(recuperacion >=5){
                System.out.println("Apto, su nota es de un 5");
            
            }else{
                System.out.println("No Apto, su nota es de "+media);

            }
        }
        sc.close();
    }

}
