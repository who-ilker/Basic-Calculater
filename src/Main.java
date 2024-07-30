import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);
        double n1, n2;
        int option;

        System.out.println(" (+)Sum (1) | (-)Subtraction (2) | (*)Multiplication (3) | (/)Division (4) ");
        System.out.print("Which option do you want to do? : ");
        option = inp.nextInt();
        System.out.print("Number 1: ");
        n1 = inp.nextDouble();
        System.out.print("Number 2: ");
        n2 = inp.nextDouble();

        switch (option){
            case 1:
                System.out.println(n1+"+"+n2+"= "+(n1+n2));
                break;
            case 2:
                System.out.println(n1+"-"+n2+"= "+(n1-n2));
                break;
            case 3:
                System.out.println(n1+"*"+n2+"= "+(n1*n2));
                break;
            case 4:
                System.out.println(n1+"/"+n2+"= "+(n1/n2));
                break;
            default:
                System.out.println("You have entered an invalid option");
        }

    }
}