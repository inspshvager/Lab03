package Tasks;
import java.util.Arrays;
import java.util.Scanner;
import static Tasks.RandomValue.createRandomValueArray;

public class Task {

    public void task01(){
        int suma = 0, min, max, amount;
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadź minimalną wartość: ");
        min = input.nextInt();
        System.out.println("Wprowadź maksymalną wartość: ");
        max = input.nextInt();
        System.out.println("Wprowadź wielkość tablicy: ");
        amount = input.nextInt();
        int[] resultArray = createRandomValueArray(min,max,amount);
        for(int x : resultArray) suma += resultArray[x];
        System.out.println("Suma = " + suma + "\nŚrednia = " + ((double)suma / amount));
    }

    public void task02(){
        int[] evenArray = { 0, 20, 5, 2, -1, 99};
        int[] oddArray = { -5, 20, 3, 77, 101};
        for(int i = 1; i < evenArray.length; i += 2) System.out.println( (i+1) + " element: " + evenArray[i]);
        for(int i = 1; i < oddArray.length; i += 2) System.out.println( (i+1) + " element: " + oddArray[i]);
    }

    public void task03(){
        String[] stringArray = { "Ala", "ma", "kota" };
        for(String x : stringArray){
            System.out.print(x.toUpperCase() + " ");
        }
    }

    public void task04(){
        Scanner input = new Scanner(System.in);
        String[] fiveWords = new String[5];
        for(int i = 0; i < fiveWords.length; i++){
            System.out.println("Podaj słowo nr. " + (i + 1));
            fiveWords[i] = input.nextLine();
        }
        for(int j = fiveWords.length - 1; j >= 0; j--){
            for(int k = fiveWords[j].length() - 1; k >= 0; k--){
                System.out.print(fiveWords[j].charAt(k));
            }
            System.out.print(" ");
        }
    }

    public void task05(){
        Scanner input = new Scanner(System.in);
        int[] numberArray = new int[8];
        int temp;
        for(int i = 0; i < numberArray.length; i++){
            System.out.println("Podaj liczbę " + (i + 1));
            numberArray[i] = input.nextInt();
        }
        for(int j = 0; j < numberArray.length; j++){
            for(int k = 0; k < numberArray.length; k++){
                if(numberArray[j] < numberArray[k]){
                    temp = numberArray[k];
                    numberArray[k] = numberArray[j];
                    numberArray[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numberArray));
    }

    public void task06(){
        Scanner input = new Scanner(System.in);
        int[] factorialArray = new int[5];
        int factorialNumber = 1;
        for(int i = 0; i < factorialArray.length; i++){
            System.out.println("Podaj liczbę nr. " + (i + 1));
            factorialArray[i] = input.nextInt();
        }
        for(int j = 0; j < factorialArray.length; j++){
            for(int k = 0; k < factorialArray[j]; k++){
                factorialNumber *= (k + 1);
            }
            factorialArray[j] = factorialNumber;
            factorialNumber = 1;
        }
        System.out.println(Arrays.toString(factorialArray));
    }

    public void task07(){
        String[] firstArray = {"Ala", "ma", "kota"};
        String[] secondArray = {"Ala", "ma", "kota"};
        System.out.println(Arrays.equals(firstArray, secondArray) ? "Tablice są takie same." : "Tablice są różne.");
    }
}
