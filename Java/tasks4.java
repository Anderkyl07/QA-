import java.util.Arrays;

public class tasks4 {
    public static void main(String[] args) {
//
//        double[] a = new double[9];
//        a[0] = 3;
//        a[1] = 4;
//        a[2] = 3;
//        a[3] = 76;
//        a[4] = 43;
//        a[5] = 45;
//        a[6] = 2;
//        a[7] = 56;
//        a[8] = 76;
//
//        double[] b = new double[]{1, 2, 3, 4, 5, 6};
//
//        double[] c = {1, 2, 3, 4, 5, 6, 7, 8};
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(b));
//        System.out.println(Arrays.toString(c));
//
//        System.out.println(a.length);
//        System.out.println(b.length);
//        System.out.println(c.length);
//
//
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a.length);
//        }
//
//        for (int i = 0; i < b.length; i++) {
//            System.out.println(b.length);
//        }
//
//
//        for (int i = 0; i < c.length; i++) {
//            System.out.println(c.length);
//        }
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i]);
//        }
//
//        for (int i = 0; i < b.length; i++) {
//            System.out.print(b[i]);
//        }
//
//        for (int i = 0; i < c.length; i++) {
//            System.out.println(c[i]);
//        }
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(Arrays.toString(a));
//        }
//        for (int i = 0; i < b.length; i++) {
//            System.out.println(Arrays.toString(b));
//        }
//        for (int i = 0; i < c.length; i++) {
//            System.out.println(Arrays.toString(c));
//        }
//        double t = 0;
//        for (int i = 0; i < c.length; i++) {
//            System.out.println(c[i]);
//            if (c[i] > t) {
//                t = c[i];
//            }
//            System.out.println(t);
//        }
//        double e = Double.MIN_VALUE;
//        for (int i = 0; i < b.length; i = i + 1) {
//            if (b[i] > e) {
//                e = b[i];
//                System.out.println(e);
//            }
//        }
//        System.out.println(e);
//
//        double k = Double.MIN_VALUE;
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] > k) {
//                k = a[i];
//            }
//            System.out.println(k);
//        }
//
//
//        double[][] d = new double[4][5];
//        d[0][1] = 4;
//        d[1][4] = 5;
//
//        System.out.println(d);
//        System.out.println(Arrays.toString(d[0]));
//        System.out.println(Arrays.toString(d[1]));
//        System.out.println(d[0].length);
//        System.out.println(d[1].length);
//
//
//        double[][] s = {
//                {23, 34, 3, 1, 5, 6, 4, 54, 66},
//                {43, 64, 74, 23, 56, 890, 5434}
//        };
//        System.out.println(s);
//
//        System.out.println(s[0]);
//        System.out.println(s[1]);
//
//        System.out.println(s.length);
//
//        System.out.println(s[0].length);
//        System.out.println(s[1].length);
//
//        System.out.println(Arrays.toString(s[0]));
//        System.out.println(Arrays.toString(s[1]));
//
//        System.out.println(Arrays.toString(s[0]) + Arrays.toString(s[1]));
//
//        System.out.println(s[0][0]);
//        System.out.println(s[0][1]);
//        System.out.println(s[0][2]);
//        System.out.println(s[0][3]);
//        System.out.println(s[0][4]);
//        System.out.println(s[0][5]);
//        System.out.println(s[0][6]);
//        System.out.println(s[1][0]);
//        System.out.println(s[1][2]);
//        System.out.println(s[1][3]);
//        System.out.println(s[1][5]);
//        System.out.println(s[1][6]);
//        System.out.println(s[1][1]);
//        System.out.println(Arrays.deepToString(s));
//
//        double[][][][] g = new double[4][5][6][7];
//        g[0][0][0][0] = 1;
//        g[1][2][3][4] = 2;
//
//        System.out.println(g);
//
//        System.out.println(g[0]);
//        System.out.println(g[1]);
//        System.out.println(g[2]);
//        System.out.println(g[3]);
//        System.out.println(Arrays.deepToString(g));
//
//
//        System.out.println(Arrays.toString(g[0]));
//
//        double[][] f = new double[][]{
//                {23, 34, 3, 1, 5, 6, 4, 54, 66},
//                {43, 64, 74, 23, 56, 890, 5434}
//        };
//        System.out.println(Arrays.toString(f[0]));
//        System.out.println(Arrays.deepToString(f));
//
//
//        int[][][][] h = new int[4][5][6][7];
//
//
//        double[][] j = new double[3][4];
//        j[0][2] = 3;
//        j[0][3] = 17;
//        j[1][0] = 7;
//        j[1][1] = 0;
//        j[1][2] = 1;
//        j[1][3] = 12;
//        j[2][0] = 8;
//        j[2][1] = 1;
//        j[2][2] = 2;
//        j[2][3] = 3;
//
//        System.out.println(j[0].length);
//        System.out.println(j[1].length);
//        System.out.println(j[2].length);
//
//
//        double[][][] q = new double[2][][];
//        q[0] = new double[5][2];
//        q[1] = new double[1][1];
//
//
//        double[][] l = {
//                {23, 34, 3, 1, 5, 6, 4, 54, 66},
//                {43, 64, 74, 23, 56, 890, 5434}
//        };
//        System.out.println(Arrays.deepToString(l));
//
//        System.out.println(l);
//
//        System.out.println(l[0].length);
//        System.out.println(l[1].length);
//
//        System.out.println(Arrays.toString(l));
//
//        System.out.println(Arrays.toString(l[0]));
//        System.out.println(Arrays.toString(l[1]));
//
//        System.out.println(l[1][6]);
//
//        for (int i = 0; i < l.length; i++) {
//            System.out.println("количество значений первого массива = " + l[i].length);
//            for (int m = 0; m < l[i].length; m++) {
//                System.out.println("единица массива " + l[i][m]);
//            }
//
//            int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//
//            for (int j = 0; j < array.length; j++) {
//                if (array[j] % 2 != 0)
//                    System.out.println(array[j]);
//            }
//
//            for (int i = 0; i < array.length; i++) {
//                if (array[i] > 5) {
//                    System.out.println(array[i]);
//                }
//            }
//            for (int i = 0; i < array.length; i++) {
//                array[i] = array[i] * 15;
//            }
//            System.out.println(Arrays.toString(array));
//
//            for (int i = 0; i < array.length; i++) {
//                if (array[i] > 5) {
//                    System.out.println(array[i]);
//                }
//            }
//
//            double[] y = {1, 2, 3, 4};
//            for (double c : y) {
//                System.out.println(c);
//            }
            double[][] u = new double[][]
                    {
                            {1, 2, 3},
                            {4, 5, 6}
                    };
            for (double[] uner : u) {
                for (double uner2 : uner) {
                    System.out.println(uner2);
                }
            }
        }
    }
