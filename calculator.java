import java.util.*;
class calculator{
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number a:");
        int a = sc.nextInt();
        System.out.println("Enter the number b:");
        int b = sc.nextInt();
        
        System.out.println("Choose Operation");
        System.out.println("1 : Addition (+)");
        System.out.println("2 : Subtraction (-)");
        System.out.println("3 : Multiplication (*)");
        System.out.println("4 : Division (/)");
        System.out.println("5 : Modulo (%)");

        System.out.print("Enter operation number: ");
        int operation =sc.nextInt();

        switch(operation){
            case 1 : 
            System.out.println("Result = " +(a+b));
            break;
            case 2 : 
            System.out.println("Result ="+(a-b));
            break;
             case 3:
                System.out.println("Result = " + (a * b));
                break;

            case 4:
                if (b != 0) {
                    System.out.println("Result = " + (a / b));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;

            case 5:
                if (b != 0) {
                    System.out.println("Result = " + (a % b));
                } else {
                    System.out.println("Modulo by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid operation.");
        }
        sc.close();
        
    }
}