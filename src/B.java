import java.util.Scanner;

public class B {
    public static void main(String[] args) {
    
    int IVA = 0;
    double promo = 0;
    double precioConIva = 0;
    Scanner sc = new Scanner(System.in);

    System.out.println("Escribe base imponible del producto");
    double BaseImponible = sc.nextDouble();
    sc.nextLine();
    System.out.println("Escribe tipo de IVA (general,reducido o superreducido)");
    String tipoIVA = sc.nextLine();
   
    sc.nextLine();
    System.out.println("Escribe codigo promocional (nopro,mitad,meno5 o 5porc)");
    String promocion = sc.nextLine();
    
    
    if(tipoIVA.equals("general")){
        IVA = 21;
    }else if (tipoIVA.equals("reducido")){
        IVA = 10;
    }else{IVA = 5;};

    precioConIva = BaseImponible+((BaseImponible*IVA)/100);

    if(promocion.equals("nopro")){
        promo = 0;
    }else if(promocion.equals("mitad")){
        promo = precioConIva/2;
    }else if(promocion.equals("meno5")){
        promo = 5;
    }else{
        promo = (precioConIva*5)/100;
    }

  

    System.out.println("Base imponible: "+BaseImponible);
    System.out.println("IVA: "+IVA);
    System.out.println("Precio con IVA: "+precioConIva);
    System.out.println("Cód. promo. ("+promocion+")"+"("+"-"+promo+")");
    System.out.println("Total: "+(precioConIva-promo));
}



}
