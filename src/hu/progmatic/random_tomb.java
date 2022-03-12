package hu.progmatic;

import java.util.Arrays;

public class random_tomb {

    public static void main(String[] args) {
        int[] randomNums = new int[100];

        for (int i = 0; i < randomNums.length;i++){
            boolean notNewNum;
            
            do {
                notNewNum = false;
                int rnd = (int)(Math.random()*100+1);
                for (int j = 0; j <= i; j++){
                    if (randomNums[j] == rnd){
                        notNewNum = true;
                        break;
                    }
                }
                randomNums[i]=rnd;
            }while(notNewNum);
        }
        System.out.println(Arrays.toString(randomNums));
    }
}
