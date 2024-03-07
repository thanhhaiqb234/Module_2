package ss2.bai_tap;

public class ShowFirstTwentyPrimes {
    public static void main(String[] arge) {
        int count = 0;
        int number = 2;
        boolean flag;
        while (count < 20) {
            flag = true;
            for (int j = 2; j < number; j++) {
                if (number % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
                System.out.print(number + ",");
            }
            number++;
        }
    }
}