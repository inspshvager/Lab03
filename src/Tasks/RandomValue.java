package Tasks;

import java.util.Random;

public class RandomValue {

    public static int[] createRandomValueArray(int min, int max, int amount){
        if(min >= max){
            System.out.println("Wartość minimalna nie może być większa od maksymalnej.");
            return null;
        }
        if(amount <= 0){
            System.out.println("Ilość elementów tablicy nie może być mniejsza od zera.");
            return null;
        }
        int[] newRandomValueArray = new int[amount];
        Random randomValue = new Random();
        for(int i = 0; i < amount; i++){
            newRandomValueArray[i] = randomValue.nextInt(max - min - 1) + min;
        }
        return newRandomValueArray;
    }
}
