import java.util.Scanner;

public class D {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String pos = "";

    System.out.println("Escribe un número de 2 o más dígitos");
    int num = sc.nextInt();

    System.out.println("Escribe un dígito que se encuentre dentro del número");
    int dig = sc.nextInt();
   
      String numStr=String.valueOf(num);
      String digStr = String.valueOf(dig);
    for(int i = 0;i<numStr.length();i++){
      char c = numStr.charAt(i);
      String numC = String.valueOf(c);
      if(digStr.equals(numC)){
         pos = String.valueOf(i+1);

      }
      if(pos.equals("")){
         pos = "ERROR";
      }
    }
    System.out.println("La posición del dígito es: "+pos);


   }
    
}
