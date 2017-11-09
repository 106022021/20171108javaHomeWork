public class practice171108 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("請輸入性別: 1.男性 2.女性");
        int gender = sc.nextInt();

        if (gender == 1) {
            System.out.println("請輸入身高,體重");
            int H1 = sc.nextInt();
            int W1 = sc.nextInt();//現在體重


            double W2 = (H1 - 80) * 0.7;//標準體重


            if ((W1 >= W2 * 0.9) && (W1 <= W2 * 1.1)) {
                System.out.println("正常體重");
            } else if ((W1 > W2 * 1.1) && (W1 < W2 * 1.2)) {
                System.out.println("過重");
            } else if (W1 > W2 * 1.2) {
                System.out.println("肥胖");
            } else if ((W1 < W2 * 0.9) && (W1 > W2 * 0.8)) {
                System.out.println("過輕");
            } else if (W1 < W2 * 0.8) {
                System.out.println("體重不足");
            }
        }
        if (gender == 2) {
            System.out.println("請輸入身高,體重");
            int H1 = sc.nextInt();
            int W1 = sc.nextInt();


            double W2 = (H1 - 70) * 0.6;

            if ((W1 >= W2 * 0.9) && (W1 <= W2 * 1.1)) {
                System.out.println("正常體重");
            } else if ((W1 > W2 * 1.1) && (W1 < W2 * 1.2)) {
                System.out.println("過重");
            } else if (W1 > W2 * 1.2) {
                System.out.println("肥胖");
            } else if ((W1 < W2 * 0.9) && (W1 > W2 * 0.8)) {
                System.out.println("過輕");
            } else if (W1 < W2 * 0.8) {
                System.out.println("體重不足");
            }

        }
    }
}