package hu.progmatic;

public class binarisbol_decimalis {
    public static void main(String[] args) {
        long binary = 110010011;
        int decimal = 0;
        int exponent = 0;
        do {
            if (binary % 10 != 0) {
                decimal += (int)Math.pow(2,exponent);
            }
            binary = binary/10;
            exponent++;
        }while(binary != 0);
        System.out.println(decimal);
    }
}
