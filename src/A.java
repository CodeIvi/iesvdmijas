import java.util.Scanner;

public class A {
    public static void main(String[] args){
        //Creo un Scanner para pedir las notas de los dos examenes.
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe la nota del primer examen");
        Double nota1 = sc.nextDouble();

        System.out.println("Escribe la nota del segundo examen");
        Double nota2 = sc.nextDouble();

        //Realizo la media de las notas
        Double media = (nota1+nota2)/2;

        //Creo una condición donde indico que si la nota es mayor o igual que 5 de un resultado y si no que de otro. Si la nota
        //no es mayor que 5, vuelvo a pedir la nota del examen de recuperación y vuelvo a crear otra condición con if para dar dos
        //resultados según si aprobó o no
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
