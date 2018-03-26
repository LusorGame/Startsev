package Calculator;
import java.util.Scanner;
 
public class Calculator {
    static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1,num2,operation);
        System.out.println("Resultat: "+result);
    }
 
    public static int getInt(){
        System.out.println("Vvedite Chislo:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Oshibka. Poprobui snova.");
            scanner.next();//рекурсия
            num = getInt();
        }
        return num;
    }
 
    public static char getOperation(){
        System.out.println("Vvedite operaciu:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Oshibka. Poprobuite eshe raz.");
            scanner.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }
 
    public static int calc(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                if (num2==0) throw new ArithmeticException();
                break;
            default:
                System.out.println("Operacia ne naidena. Poprobui eshe");
                result = calc(num1, num2, getOperation());//рекурсия
        }
        return result;
    }
}