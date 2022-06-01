package ru.natology.sqr.servicesSquare;

public class SQRService {
    public int total(int square, int result) {
        int min = 200;
        int max = 300;
        result = 0;
        for (int i = 10; i <= 99; i++) {
            square = i * i;
            if (square > min && square < max) {
                result++;

            }

        }
        return result;
    }
}








