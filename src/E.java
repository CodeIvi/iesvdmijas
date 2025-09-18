public class E {
    public static void main(String[] args) {
        
        for(int i = 0;i<8;i++){
            for(int j=0;j<8-1-i;j++){
                System.out.print(" ");
            }
            for(int l=0;l<i+1;l++){
                    System.out.print("*");}

                    if(i%2 == 0){
                        System.out.print("****");
                }else{System.out.print("    ");
            };
            for(int m=0;m<i+1;m++){
                System.out.print("*");

                
            }
            System.out.println();
            
            }
    
}
}


