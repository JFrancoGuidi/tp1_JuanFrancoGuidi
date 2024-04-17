package ar.edu.unju.fi.ejercicio11;

public class Main {
    public static void main(String[] args) {
        int i = 2;
        int j = 40;

        for (; j >= 0; j -= 5, i += 2) {
            if (j < 0) break;
            System.out.print((80 + i * i - 2 * i) + " ");
        }
        for (; j >= -39; j += 5, i -= 2) {
            if (j < 0) break;
            System.out.print((80 + i * i - 2 * i) + " ");
        }
    }
}
