package ru.natology.sqr.servicesSquare;

public class SQRService {
    public int total(int square, int result) {
        int min = 200;
        int max = 300;
        int i;
        for (i = 10; i < 99; i++) {
            square = i * i;
            if (square >= min && square <= max) {
                return result++;
            }

        }
        return -1;
    }
}