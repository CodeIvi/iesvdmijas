import java.util.Scanner;

public class F {

    //NO HE SABIDO HACERLO.
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe la posición del alfil");
    String pos = sc.nextLine();
    
    char letra =pos.charAt(0);
    char numC = pos.charAt(1);
    String numStr = String.valueOf(numC);
    int fila = Integer.parseInt(numStr);
    if(fila<1 || fila>8){
        System.out.println("Valor no válido");
    }
    
    int columna;
    switch (letra) {
        case 'a':
        case 'A':
            columna = 1;
            break;
        case 'b':
        case 'B':
            columna = 2;
            break;
        case 'c':
        case 'C':
            columna = 3;
            break;
        case 'd':
        case 'D':
            columna = 4;
            break;
        case 'e':
        case 'E':
            columna = 5;
            break;
        case 'f':
        case 'F':
            columna = 6;
            break;
        case 'g':
        case 'G':
            columna = 7;
            break;
        case 'h':
        case 'H':
            columna = 8;
            break;
        default:
            columna = -1; // Valor inválido
            System.out.println("Valor no válido");
            break;
    }

    
    for(int i=1;i<8;i++){
        for(int j=1;j<8;j++){
            int suma= fila+columna;
            int resta = fila-columna;
        
            if(i+j==suma){
                switch(i) {
        case 1:
           letra  = 'a';
            break;
        case 2:
            letra = 'b';
            break;
        case 3:
            letra = 'c';
            break;
        case 4:
            letra = 'd';
            break;
        case 5:
            letra = 'e';
            break;
        case 6:
            letra = 'f';
            break;
        case 7:
            letra = 'g';
            break;
        case 8:
            letra = 'h';
            break;
        default:
            System.out.println("Valor no válido");
            break;
    }
    System.out.println(letra+);
        }


        }
    }


        
    

}

    
}
