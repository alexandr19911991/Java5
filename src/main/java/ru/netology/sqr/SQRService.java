package ru.netology.sqr;

public class SQRService {

    public int calcSQR(int min, int max) {
        int root = 0;
        for (int i = 10; i <= 99; i++) {
            int range = i * i;
            if (range >= min) {
                continue;
            }
            if (range >= max) {
                break;
            }
            root = root + 1;
        }
        return root;
    }
}