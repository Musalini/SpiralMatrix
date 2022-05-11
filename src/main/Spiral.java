package main;

class Spiral
{
    static int[][] spiral(int rows, int columns)
    {
        int[][] array = new int [rows][columns];
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = count;
                count++;
            }
        }
        int value = 1;
        int top = 0, bottom = rows - 1, left = 0, right = columns - 1;
        int direction = 1;
        while (top <= bottom && left <= right)
        {
            if (direction == 1) {
                for (int i = left; i <= right; ++i) {
                    array[top][i] = value;
                    value++;
                }
                ++top;
                direction = 2;
            }
            else if (direction == 2) {
                for (int i = top; i <= bottom; ++i) {
                    array[i][right] = value;
                    value++;
                }
                --right;
                direction = 3;
            }
            else if (direction == 3) {
                for (int i = right; i >= left; --i) {
                    array[bottom][i] = value;
                    value++;
                }
                --bottom;
                direction = 4;
            }
            else if (direction == 4) {
                for (int i = bottom; i >= top; --i) {
                    array[i][left] = value;
                    value++;
                }
                ++left;
                direction = 1;
            }
        }
        return array;
    }
}
