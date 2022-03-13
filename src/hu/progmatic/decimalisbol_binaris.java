package hu.progmatic;

public class decimalisbol_binaris {
    public static void main(String[] args) {
        int decimal = 4242; //negatív számmal nem működik!!
        String binary = "";

        do{
            binary = decimal%2 + binary;
            decimal = decimal/2;
        }while(decimal != 0);

        System.out.println(binary);
    }
}
