public class E {
    public static void main(String[] args) {
        //El primer bucle indica la altura.
        for(int i = 0;i<8;i++){
            //Este for pone los espacior al principio de la pirámide
            for(int j=0;j<8-1-i;j++){
                System.out.print(" ");
            }
            //Este for coloca los asteriscos 
            for(int l=0;l<i+1;l++){
                    System.out.print("*");}
               // Si la fila es par colocará 4 asteriscos que son los centrales y si no dejará 4 espacios en blanco
                    if(i%2 == 0){
                        System.out.print("****");
                }else{System.out.print("    ");
            };
            //Imprime los mismos asteriscos que el segundo bucle, pero a la derecha.
            for(int m=0;m<i+1;m++){
                System.out.print("*");

                
            }
            System.out.println();
            
            }
    
}
}


