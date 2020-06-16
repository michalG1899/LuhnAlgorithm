package pl.luhnalgorithm.luhn_algorithm;

public class Luhn {

    private static final String NUMBER = "92480";

    public static int findControlDigit () {
        char[] chars = NUMBER.toCharArray();
        int[] ints = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            ints[i] = Integer.parseInt(String.valueOf(chars[i]));
        }

        int[] ints2 = new int[ints.length];
        for (int i = ints.length - 1 ; i >= 0 ; i--) {
            if (i % 2 == 0) {
                ints2[i] = ints[i] * 2;
                if (ints2[i] > 9) {
                    ints2[i] = ints2[i] % 10 + 1;
                }
            } else {
                ints2[i] = ints[i];
            }
        }

        int sum = 0;
        int controlDigit;
        for (int i = 0; i < ints2.length; i++) {
            sum = sum + ints2[i];

        }

        sum %= 10;
        sum = 10 - sum;
        controlDigit = sum % 10;

        return controlDigit;
    }

    public static boolean luhnAlgorithmCheck(int controlDigit) {
        char[] chars = NUMBER.toCharArray();
        int[] ints = new int[chars.length + 1];

        for (int i = 0; i < chars.length; i++) {
            ints[i] = Integer.parseInt(String.valueOf(chars[i]));
        }
        ints[chars.length] = controlDigit;

        int[] ints2 = new int[ints.length];
        for (int i = ints.length - 1 ; i >= 0 ; i--) {
            if (i % 2 == 0) {
                ints2[i] = ints[i] * 2;
                if (ints2[i] > 9) {
                    ints2[i] = ints2[i] % 10 + 1;
                }
            } else {
                ints2[i] = ints[i];
            }
        }

        int suma = 0;
        for (int i : ints2) {
            suma = suma + i;
        }
        if (suma % 10 == 0){
            return true;
        } else
            return false;
    }


}
