import java.util.Scanner;

public class C {

    public static void main(String[] args) {
        //Creo todas las variables necesarias para realizar el ejercicio
        Scanner sc = new Scanner(System.in);
        int cantNum = 0;
        int cantImp = 0;
        int sumImp = 0;
        int mayorImp=0;
        int mayorPar = 0;
        System.out.println("Introduce un numero");
        int num = sc.nextInt();

        //Creo un bucle donde incluyo condiciones para agrupas los resultados en las diferentes
        //variables, al igual que sumo en los contadores la cantidad de números introducidos y los numeros pares
        while(num >= 0){
          
            sc.nextLine();
            cantNum++;
            
            if(num%2 != 0){
                cantImp++;
                sumImp+=num;
                if(num>mayorImp){
                    mayorImp=num;
                }
            }else{
                if(num>mayorPar){
                    mayorPar=num;
                }
            }
            //Vuelvo a pedir que se introduzca un número
        System.out.println("Introduce un numero");
        num = sc.nextInt();
        }
        //Muesto los datos por consola
        System.out.println("Se han introducido +"+cantNum+" numeros");
        System.out.println("La media de los numeros impares es de: "+sumImp/cantImp);
        System.out.println("El mayor de los impares es: "+mayorImp);
        System.out.println("EL mayor de los numeros pares es: "+mayorPar);

        sc.close();
    }
    

}
