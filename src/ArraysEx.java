import java.util.ArrayList;

public class ArraysEx {
    public static void main(String[] args) {
        // 1D ArraysEx
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[5];
        int[] c= new int[]{1, 2, 3, 4, 5};

        // Assigning explicitly
        b[0] = 1;
        b[1] = 2;

        // 2D ArraysEx
        int[][] g = new int[][]{{1, 2, 3}, {4, 5, 6}};

        // Accessing Elements
        System.out.println(a[0]);

        // Updating
        System.out.println(a[4]);
        a[4] = 10;
        System.out.println(a[4]);

        // Array List
        ArrayList<String> stringArrayList = new ArrayList<>(java.util.Arrays.asList("1", "2", "3"));

        ArrayList<String> stringArrayList2 = new ArrayList<>();
        stringArrayList2.add("cookie");
        stringArrayList2.add("biscuit");
        stringArrayList2.add("jam");

        System.out.println(stringArrayList2);
        System.out.println(a);

        System.out.println(stringArrayList2.get(0));
        System.out.println(stringArrayList2.add("peanut butter"));

        System.out.println(stringArrayList2.contains("cookie"));
    }
}
