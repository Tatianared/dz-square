package ru.natology.sqr.servicesSquare;

public class SQRService {
    public int total(int i, int result) {
        int min = 200;
        int max = 300;
        result = 0;
        for (i = 10; i <= 99; i++) {
            if ((i * i) > min && (i * i) < max) {
                result++;

            }

        }
        return result;
    }
}








