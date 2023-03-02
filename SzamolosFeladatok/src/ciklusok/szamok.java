package ciklusok;

public class szamok {

    public static void main(String[] args) {
        for (int i = 2; i <= 4; i++) {
            for (int x = 2; x <= 4; x++) {
                for (int y = 2; y <= 4; y++) {
                    int szam = i * 100 + x * 10 + y;
                    System.out.println(szam);
                }
            }
        }

    }
}
