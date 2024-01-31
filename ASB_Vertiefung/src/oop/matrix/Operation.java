package oop.matrix;

public class Operation
{

    private static int[][] checkUnterschiedVonLength(int[][] matrix)
    {

        int l = 1;
        while (l < matrix.length - 1)
        {
            if (matrix[l].length != matrix[l + 1].length)
            {
                throw new IllegalArgumentException();
            }
            l++;
        }
        return matrix;
    }

    private static int[][] checkInterneLength(int[][] matrix)
    {
        int i = 0;
        while (i < matrix.length)
        {
            if (matrix[i] == null)
            {
                throw new IllegalArgumentException();
            }
            if (matrix[i].length == 0)
            {
                throw new IllegalArgumentException();
            }
            i++;

        }
        return matrix;
    }

    private static int[][] checkHauptArrayLength(int[][] matrix)
    {
        if (matrix == null)
        {
            throw new IllegalArgumentException();
        }
        if (matrix.length == 0)
        {
            throw new IllegalArgumentException();
        }
        return matrix;
    }

    public static int[][] transpose(int[][] matrix)
    {
        // checkHauptArrayLength prueft, ob Der Parameterwert ist null oder Das
        // uebergebene Array hat die Laenge 0.
        checkHauptArrayLength(matrix);

        // checkInterneLength prueft, ob Einer der Werte im uebergebenen Array
        // ist null oder hat eine Referenz auf ein Feld der Laenge 0.
        checkInterneLength(matrix);

        // checkUnterschiedVonLength prueft , ob Das übergebene zweidimensionale
        // Feld ist nicht „rechteckig“.
        checkUnterschiedVonLength(matrix);

        int[][] newMatrix = new int[matrix[0].length][matrix.length];

        int i = 0;
        while (i < newMatrix.length)
        {
            int j = 0;

            while (j < newMatrix[i].length)
            {

                newMatrix[i][j] = matrix[j][i];

                j++;

            }

            i++;
        }

        return newMatrix;
    }

    public static int[][] rotateClockwise(int[][] matrix)
    {

        // checkHauptArrayLength prueft, ob Der Parameterwert ist null oder Das
        // uebergebene Array hat die Laenge 0.
        checkHauptArrayLength(matrix);

        // checkInterneLength prueft, ob Einer der Werte im uebergebenen Array
        // ist null oder hat eine Referenz auf ein Feld der Laenge 0.
        checkInterneLength(matrix);

        // checkUnterschiedVonLength prueft , ob Das übergebene zweidimensionale
        // Feld ist nicht „rechteckig“.
        checkUnterschiedVonLength(matrix);

        int[][] newMatrix = new int[matrix[0].length][matrix.length];

        int i = 0;
        while (i < newMatrix.length)
        {
            int j = newMatrix[i].length - 1;
            int z = 0;

            while (j >= 0)
            {

                newMatrix[i][z] = matrix[j][i];
                z++;
                j--;

            }

            i++;
        }
        return newMatrix;
    }

    public static int[][] rotateCounterClockwise(int[][] matrix)
    {
        // checkHauptArrayLength prueft, ob Der Parameterwert ist null oder Das
        // uebergebene Array hat die Laenge 0.
        checkHauptArrayLength(matrix);

        // checkInterneLength prueft, ob Einer der Werte im uebergebenen Array
        // ist null oder hat eine Referenz auf ein Feld der Laenge 0.
        checkInterneLength(matrix);

        // checkUnterschiedVonLength prueft , ob Das übergebene zweidimensionale
        // Feld ist nicht „rechteckig“.
        checkUnterschiedVonLength(matrix);

        int[][] newMatrix = new int[matrix[0].length][matrix.length];

        for (int i = newMatrix.length - 1, z = 0; i >= 0; i--, z++)
        {

            for (int j = 0; j < newMatrix[i].length; j++)
            {

                newMatrix[z][j] = matrix[j][i];

            }

        }

        return newMatrix;

    }

    public static void main(String[] args)
    {

        int[][] x =
        {
            { 1, 2, 3, 4, 5 },
            { 6, 7, 8, 9, 10 },
            { 11, 12, 13, 14, 15 },
            { 16, 17, 18, 19, 20 } };

        int[][] tx = transpose(x);
        for (int i = 0; i < tx.length; i++)
        {
            for (int j = 0; j < tx[i].length; j++)
            {
                System.out.print(tx[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("==================");
        tx = rotateClockwise(x);
        for (int i = 0; i < tx.length; i++)
        {
            for (int j = 0; j < tx[i].length; j++)
            {
                System.out.print(tx[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("==================");
        tx = rotateCounterClockwise(x);
        for (int i = 0; i < tx.length; i++)
        {
            for (int j = 0; j < tx[i].length; j++)
            {
                System.out.print(tx[i][j] + " ");
            }
            System.out.println();
        }

    }

}
