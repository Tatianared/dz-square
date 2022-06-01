package ru.natology.sqr.servicesSquare;

public class SQRService {
    public int total(int min, int max, int square, int result) {
        min = 200;
        max = 300;
        result = 0;
        for (int i = 10; i <= 99; i++) {
            square = i * i;
            if (square >= min && square <= max) {
                result++;

            }

        }
        return result;
    }
}








