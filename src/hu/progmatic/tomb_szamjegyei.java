package hu.progmatic;

public class tomb_szamjegyei {
    public static void main(String[] args) {
        int[] numbers = {-1526446364, 1874047238, 1064541050, -815818089, 467498070, -1427103238, 1267273266, -1248819505, 839131004, -1313719080, 1545523494};

        int[] digits = new int[10];

        for(int i = 0; i < numbers.length; i++) {
            int num = numbers[i] < 0 ? -numbers[i] : numbers[i];
            do {
                int digit = num % 10;
                digits[digit]++;
                num = num / 10;
            }while (num != 0);
        }

        for (int i = 0; i < digits.length; i++){
            System.out.println(i + ": " + digits[i] + " db");
        }
    }
}
