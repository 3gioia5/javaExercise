public class Array {
    public static void main(String[] args) {
        int[] intArray = new int[5];

        intArray[0] = 2;
        intArray[1] = 3;
        intArray[2] = 5;
        intArray[3] = 7;
        intArray[4] = 11;

        // System.out.println(intArray[2] + intArray[4]);

//        for (int i = 0; i < intArray.length; i++) {
//            System.out.println(intArray[i]);
//        }

        int[] newArray = new int[10];

//        for (int i = 0; i < newArray.length; i++) {
//            newArray[i] = i + 1;
//            System.out.println(newArray[i]);
//        }

        int count = 1;

//        for (int i : newArray) {
//            newArray[i] = i + count;
//            System.out.println(newArray[i]);
//            count++;
//        }

        String[] fruitsArray = new String[5];

        fruitsArray[0] = "딸기";
        fruitsArray[1] = "수박";
        fruitsArray[2] = "메론";
        fruitsArray[3] = "망고";
        fruitsArray[4] = "귤";

//        for (String fruit : fruitsArray) {
//            System.out.println(fruit);
//        }

        int[][] multiArray = new int[3][4];

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                multiArray[i][j] = (i * 4 + 1) + j;
                System.out.println(multiArray[i][j] + " ");
            }
        }
    }
}
