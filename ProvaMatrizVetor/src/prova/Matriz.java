package prova;

public class Matriz {
    public static void main(String[] args) {
        double[][] matriz = new double[4][4];

        for (int L = 0; L < 4; L++) {
            for (int C = 0; C < 4; C++) {
                if (L > C) {
                    matriz[L][C] = (2.0 * L - C) / 4.0;
                } else if (L == C) {
                    matriz[L][C] = 1.5;
                } else {
                    matriz[L][C] = 3.0 * C;
                }
            }
        }

        for (int L = 0; L < 4; L++) {
            for (int C = 0; C < 4; C++) {
                System.out.print(matriz[L][C] + "\t");
            }
            System.out.println();
        }
    }
}