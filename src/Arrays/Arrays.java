package Arrays;

public class Arrays {
    public static void main(String[] args) {
        // 1D Arrays
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[5];
        int[] c= new int[]{1, 2, 3, 4, 5};

        // Assigning explicitly
        b[0] = 1;
        b[1] = 2;

        // 2D Arrays
        int[][] e = {{1, 2, 3}, {4, 5, 6}};
        int[][] f = new int[2][3];
        int[][] g = new int[][]{{1, 2, 3}, {4, 5, 6}};

        // 3D Arrays
        int[][][] h = {{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10, 11, 12}}};
        int[][][] i = new int[1][2][3];
        int[][][] j = new int[][][]{{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10, 11, 12}}};

        // Accessing Elements
        System.out.println("First Element: " + a[0]);

        // Updating
        System.out.println("Before Update a[4]: " +  a[4]);
        a[4] = 10;
        System.out.println("After Update a[4]: " +  a[4]);
    }
}
