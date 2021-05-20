package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        DichotomyServiceImpl dichotomyService = new DichotomyServiceImpl();
        DichotomyData dichotomyData = new DichotomyData(-100, 100);
        dichotomyService.calculationDichotomyMethod(dichotomyData);

        System.out.println(dichotomyService.rootIntervalIsolation());
        System.out.println(Arrays.toString(dichotomyService.resultOfCalculation()));

    }
}
