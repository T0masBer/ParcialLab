import java.util.Scanner;




public class ParcialLab {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float num1;
        float num2;
        float res;
        int option;
        option = 1;


        while ( option != 0){


            System.out.println("Que operacion desea realizar");
            System.out.println("1)Suma");
            System.out.println("2)Resta");
            System.out.println("3)Multiplicacion");
            System.out.println("4)Division");
            System.out.println("Para salir ingrese 0");
            option = sc.nextInt();



            if ( option == 1){

                System.out.println("Ingrese el primer numero");
                num1=sc.nextFloat();
                System.out.println("Ingrese el segundo numero");
                num2=sc.nextFloat();
                res = num1 + num2;
                System.out.println("El resultado de la suma es:");
                System.out.println(res);

            } else if ( option == 2 ) {

                System.out.println("Ingrese el primer numero");
                num1= sc.nextFloat();
                System.out.println("Ingrese el segundo numero");
                num2= sc.nextFloat();
                res = num1 - num2;
                System.out.println("El resultado de la resta es:");
                System.out.println(res);

            } else if ( option == 3) {

                System.out.println("Ingrese el primer numero");
                num1= sc.nextFloat();
                System.out.println("Ingrese el segundo numero");
                num2= sc.nextFloat();
                res = num1 * num2;
                System.out.println("El resultado de la multiplicacion es:");
                System.out.println(res);


            } else if ( option == 4) {

                System.out.println("Ingrese el primer numero");
                num1= sc.nextFloat();
                System.out.println("Ingrese el segundo numero");
                num2= sc.nextFloat();
                res = num1 / num2;

                if (num2 == 0){
                    System.out.println("No es posible divir por 0");
                }else {
                    System.out.println("El resultado de la division es:");
                    System.out.println(res);
                }

            }
        }
        System.out.println("Gracias por utilizar esta calculadora, hasta luego");


    }
}
