import java.util.Scanner;

public class C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantNum = 0;
        int cantImp = 0;
        int sumImp = 0;
        int mayorImp=0;
        int mayorPar = 0;
        System.out.println("Introduce un numero");
        int num = sc.nextInt();
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
        System.out.println("Introduce un numero");
        num = sc.nextInt();
        }

        System.out.println("Se han introducido +"+cantNum+" numeros");
        System.out.println("La media de los numeros impares es de: "+sumImp/cantImp);
        System.out.println("El mayor de los impares es: "+mayorImp);
        System.out.println("EL mayor de los numeros pares es: "+mayorPar);
    }

}
