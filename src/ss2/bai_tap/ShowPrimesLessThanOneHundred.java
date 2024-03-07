package ss2.bai_tap;

public class ShowPrimesLessThanOneHundred {
    public static void main(String[] arge){
        int number = 2;
        boolean flag;
        while (number < 100){
            flag = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.print(number + ",");

            }
            number++;
        }
    }
}
