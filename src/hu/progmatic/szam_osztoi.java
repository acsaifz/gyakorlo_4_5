package hu.progmatic;

import java.util.Arrays;

public class szam_osztoi {
    public static void main(String[] args) {
        int num = 16;
        String dividersTemp = "";

        for (int i = 1; i < num; i++){
            if (num%i == 0){
                dividersTemp += i + " ";
            }
        }
        dividersTemp += num != 0? num : "";

        String[] dividersStrings = dividersTemp.isEmpty() ? new String[0] : dividersTemp.split(" ");
        int[] dividers = new int[dividersStrings.length];
        for (int i = 0; i < dividersStrings.length; i++){
            dividers[i] = Integer.parseInt(dividersStrings[i]);
        }
        System.out.println(num + " osztói: " + Arrays.toString(dividers));
    }
}
