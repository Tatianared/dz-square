package ru.natology.sqr.servicesSquare;

public class SQRService {
    public int total(int result) {
        int min = 200;
        int max = 300;
        result = 0;
        for (int i = 10; i <= 99; i++) {
            if ((i * i) > min && (i * i) < max) {
                result++;
            }


        }
        return 0;

    }
}




