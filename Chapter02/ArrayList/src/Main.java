import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList<String> nameList = new ArrayList<>();
//        nameList.add("길막");
//        nameList.add("야통");
//        nameList.add("연님");
//        nameList.add("무");
//        nameList.add("래기");
//        nameList.add("조");
//        nameList.add("빈집");
//
//        nameList.remove(6);
//        nameList.
//
//        System.out.println(nameList.size());
//        System.out.println(nameList);

        ArrayList<Integer> numList = new ArrayList<>();

        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);
        numList.add(5);

        for (int num : numList) {
            System.out.println(num * num);
        }
    }
}
