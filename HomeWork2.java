import java.util.Arrays;
import java.util.Scanner;

public class HomeWork2{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        // task1();
        // task2();
        // task3();
        task4();
    }
    static void task1(){
        boolean enter = false;
        System.out.print("Введите дробное число: ");
        while(!enter){
            try{
                float num = Float.parseFloat(scanner.nextLine());
                System.out.println(num);
                enter = true;
            }catch(RuntimeException e){
                System.out.println("Повторите, пожалуйста, ввод: ");
            }
        }
    }

    static void task2(){
        try {
            int d = 0;
            int[] arr = new int[8];
            double[] catchedRes1 = new double[arr.length];
            for (int i = 0; i<arr.length; i++){
                catchedRes1[i] = arr[i]/d;
            }
            System.out.println("catchedRes1 = " + Arrays.toString(catchedRes1));
         } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
         }
         
    }

    static void task3() {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
        catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
        public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
        }

    static void task4(){
        boolean enter = false;
        System.out.print("Введите строку: ");
        while(!enter){
            try{
                checkingString(scanner.nextLine());
                System.out.println("Строка введена корректно, спасибо");
                enter = true;
            }catch(StringLengthException e){
                System.out.println(e);
                System.out.println("Повторите, пожалуйста, ввод: ");
            }
        }
    }

    static void checkingString(String str) throws StringLengthException{
        if (str.length() == 0) throw new StringLengthException("Пустые строки вводить нельзя");
    }

}