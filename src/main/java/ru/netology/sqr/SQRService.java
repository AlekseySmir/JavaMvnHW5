package ru.netology.sqr;

public class SQRService {

    public int calcSqr(int lower, int higher) {
        int resultate = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lower && i * i <= higher) {
                resultate = resultate + 1;
            }
        }
        return resultate;
    }
}
