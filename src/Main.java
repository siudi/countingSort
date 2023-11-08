import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj największą wartośc");
        int max = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ile liczb będzie miał ciąg");
        int size = scanner.nextInt();
        scanner.nextLine();
        int [] array = new int[size];

        System.out.println("Podaj liczby do posortowania");
        for(int i = 0; i < array.length; i++){
            array[i] = readNumber(max);
        }
        System.out.println();
        countingSortArray(array,max);

        System.out.println("Tablica posortowana");
        for(int element : array) System.out.print(element + " ");



    }

    public static int readNumber(int max){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number <= max) return number;
        else {
            System.out.printf("Wprowadź liczbę nie większą niż %d\n",max);
            return readNumber(max);
        }
    }

    public static void countingSortArray(int[] numberArray, int max){
        int[] temp = new int[max+1];
        int size = numberArray.length;

        for(int i = 0; i < max; i++)temp[i] = 0;
        for(int i = 0; i < size; i++) temp[numberArray[i]]++;
        int k = 0;
        for(int i = 0; i < max + 1; i++){
           for(int j = temp[i]; j >= 1; j--){
               numberArray[k] = i;
               k++;
           }

        }



    }

}