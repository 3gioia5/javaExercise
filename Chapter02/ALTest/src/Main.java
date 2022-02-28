import java.util.ArrayList;

public class Main {
    public static int getSurvivingIndex(int n, int k) {
        ArrayList<Integer> soldiers = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            soldiers.add(i);
        }

        ArrayList<Integer> deadSoldiers = new ArrayList<>();

        while (n >= 2) {
            for (int i = 1; i <= k - 1; i++) {
                soldiers.add(soldiers.get(0));
                soldiers.remove(0);
            }

            deadSoldiers.add(soldiers.get(0));
            soldiers.remove(0);
            n--;
        }

        for (int dead : deadSoldiers) {
            System.out.println(dead + "번 군사가 죽습니다.");
        }

        return soldiers.get(0);
    }

    public static void main(String[] args) {
        System.out.println("김신은 " + getSurvivingIndex(20, 5) + "번 자리에 서있으면 됩니다.");
    }
}