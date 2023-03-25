import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in); 
    System.out.println("Entrar Dinero ");
    
    float dinero = myObj.nextFloat(); 

    if(dinero >= 120){
        int Arreglo_A = (int)(dinero / 120);
        int Arreglo_B = (int)(dinero / 70);
        System.out.println("Puedes comprar " + Arreglo_A + " del arreglo floral A "  );
        System.out.println("Puedes comprar " + Arreglo_B + " del arreglo floral B "  );
    }
    else{
        int Arreglo_B = (int)(dinero / 70);
        System.out.println("Puedes comprar " + Arreglo_B + " del arreglo floral B "  );
    }
  }
}

