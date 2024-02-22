public class Main {
    public static void main(String[] args) {
        System.out.println("Задача номер 1:");
        byte a = 25;
        short b = 250;
        int c = 2500;
        long d = 25000L;
        float e = 25.5f;
        double g = 225.5;
        System.out.println("1)Значение переменной <a> с типом <byte> равно " + a);
        System.out.println("2)Значение переменной <b> с типом <short> равно " + b);
        System.out.println("3)Значение переменной <c> с типом <int> равно " + c);
        System.out.println("4)Значение переменной <d> с типом <long> равно " + d);
        System.out.println("5)Значение переменной <e> с типом <float> равно " + e);
        System.out.println("6)Значение переменной <g> с типом <double> равно " + g);

        System.out.println("Задача номер 2:");
        float z = 27.12f;
        long y = 987678965549L;
        double x = 2.786;
        short w = 569;
        short v = -159;
        int t = 27897;
        byte s = 67;

        System.out.println("Задача номер 3:");
        byte studentsLudPav = 23;
        byte studentsAnnSer = 27;
        byte studentsEktAndr = 30;
        short paper = 480;
        int studentsWorksheets = paper / (studentsEktAndr + studentsAnnSer + studentsLudPav);
        System.out.println("На каждого ученика рассчитано " + studentsWorksheets + " листов бумаги.");

        System.out.println("Задача номер 4:");
        byte outputPerMinute = 16;
        int outputInTwentyMinute = outputPerMinute * 10;
        int productivityInDay = outputInTwentyMinute * 3 * 24;
        int productivityInThreeDay = productivityInDay * 3;
        int productivityPerMonth = productivityInThreeDay * 10;
        System.out.println("1)За 20 минут машина произвела " + outputInTwentyMinute + " штук бутылок.");
        System.out.println("2)За сутки машина произвела " + productivityInDay + " штук бутылок.");
        System.out.println("3)За 3 дня машина произвела " + productivityInThreeDay + " штук бутылок.");
        System.out.println("4)За 1 месяц машина произвела " + productivityPerMonth + " штук бутылок.");

        System.out.println("Задача номер 5:");
        byte totalCans = 120;
        byte cansPerClassroom = 6;
        byte whitePaintForClassroom = 2;
        byte brownPaintForClassroom = 4;
        int totalClasses = totalCans / cansPerClassroom;
        int totalBrownPaints = totalClasses * brownPaintForClassroom;
        int totalWhitePaints = totalClasses * whitePaintForClassroom;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhitePaints +
                " банок белой краски и " + totalBrownPaints + " банок коричневой краски.");

        System.out.println("Задача номер 6:");
        byte allBananas = 5;
        byte weightOfOneBanana = 80;
        short allMlMilk = 200;
        byte weightOneHundredMlMilk = 105;
        byte totalBriquettesIceCream = 2;
        byte weightOfOneBriquette = 100;
        byte allEggs = 4;
        byte weightOfOneEgg = 70;
        int weightBreakfastInGrams = allBananas * weightOfOneBanana + weightOneHundredMlMilk * 2 +
                totalBriquettesIceCream * weightOfOneBriquette + allEggs * weightOfOneEgg;
        float weightBreakfastInKg = weightBreakfastInGrams / 1000f;
        System.out.println("1)Вес завтрака в граммах будет равна " + weightBreakfastInGrams);
        System.out.println("2)Вес завтрака в кг будет равна " + weightBreakfastInKg);

        System.out.println("Задача номер 7:");
        byte allKg = 7;
        float firstDietKg = 250 / 1000f;
        float secondDietKg = 500 / 1000f;
        float dayWithTheFirstDiet = allKg / firstDietKg;
        float dayWithTheSecondDiet = allKg / secondDietKg;
        System.out.println("1)Если будет худеть на 250 грамм, то потребуется "
                + dayWithTheFirstDiet + " дней.");
        System.out.println("2)Если будет худеть на 500 грамм, то потребуется " + dayWithTheSecondDiet + " дней.");

        System.out.println("Задача номер 8:");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryChristina = 76230;
        float newSalaryMasha = salaryMasha + salaryMasha / 10f;
        float newSalaryDenis = salaryDenis + salaryDenis / 10f;
        float newSalaryChristina = salaryChristina + salaryChristina / 10f;
        float incomeDifferenceMasha = newSalaryMasha * 12f - salaryMasha * 12f;
        float incomeDifferenceDenis = newSalaryDenis * 12f - salaryDenis * 12f;
        float incomeDifferenceChristina = newSalaryChristina * 12f - salaryChristina * 12f;
        System.out.println("1)Маша теперь получет " + newSalaryMasha + " рублей. Годовой доход вырос на " +
                incomeDifferenceMasha + " рублей.");
        System.out.println("2)Денис теперь получет " + newSalaryDenis + " рублей. Годовой доход вырос на " +
                incomeDifferenceDenis + " рублей.");
        System.out.println("3)Кристина теперь получет " + newSalaryChristina +
                " рублей. Годовой доход вырос на " + incomeDifferenceChristina + " рублей.");

    }
}