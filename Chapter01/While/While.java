public class While {
    public static void main(String[] args) {
        int sum = 0, i = 1;

        while (sum <= 10000) {
            sum += i;
            i ++;
        }

        System.out.println(sum);
        System.out.println(i - 1);
    }
}
