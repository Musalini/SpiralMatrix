package main;

public class Main {
    public static void main(String[] args) {
        {
            int[][] spiral = Spiral.spiral(3, 4);

            for (int[] ints : spiral) {
                for (int anInt : ints) {
                    System.out.print(String.format("%4s", anInt));
                }
                System.out.println();
            }
        }
        System.out.println();
        System.out.println();
        {
            int[][] spiral = main.Spiral.spiral(4, 3);

            for (int[] ints : spiral) {
                for (int anInt : ints) {
                    System.out.print(String.format("%4s", anInt));
                }
                System.out.println();
            }
        }
        System.out.println();
        System.out.println();
        {
            int[][] spiral = main.Spiral.spiral(5, 6);

            for (int[] ints : spiral) {
                for (int anInt : ints) {
                    System.out.print(String.format("%4s", anInt));
                }
                System.out.println();
            }
        }
        System.out.println();
        System.out.println();
        {
            int[][] spiral = main.Spiral.spiral(5, 5);

            for (int[] ints : spiral) {
                for (int anInt : ints) {
                    System.out.print(String.format("%4s", anInt));
                }
                System.out.println();
            }
        }


    }
}

