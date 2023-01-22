package ru.netology;

public class BinOps {
    public String sum(String a, String b) {
        int x = Integer.parseInt(a.trim());
        int y = Integer.parseInt(b.trim());
        int result = x + y;
        String res = Integer.toBinaryString(result);

        return res;
    }

    public String mult(String a, String b) {
        int x = Integer.parseInt(a.trim());
        int y = Integer.parseInt(b.trim());
        int result = x * y;
        String res = Integer.toBinaryString(result);

        return res;
    }
}

