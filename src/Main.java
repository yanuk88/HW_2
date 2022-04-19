public class Main {
    public static void main(String[] args) {

    //exercise 1
    byte one = 33;
    short two = 333;
    int three = 3333333;
    long four = 3333333333333L;
    float five = 33.333f;
    double six = 33.333333333d;
    char seven = 36;
    boolean eight = two >= 666;
    System.out.println(eight);


    //exercise 2
        float boxerOne = 78.2f;
        float boxerTwo = 82.7f;
        float totalWeight = boxerOne + boxerTwo;
        float weightDifference = boxerTwo - boxerOne;
        System.out.println("Общий вес " + totalWeight);
        System.out.println("Разница веса " + weightDifference);

    //exercise 3
        byte banana = 80;
        byte milk = 105;
        byte iceCream = 100;
        byte egg = 70;
        var total = banana * 5 + milk * 2 + iceCream * 2 + egg * 4;
        float Kg = total / 1000;

        System.out.println("Вес коктейля " + total);
        System.out.println("Вес коктейля в кг " + Kg);

        //exercise 4
        byte goal = 7;
        float diet1 = 0.25f;
        float diet2 = 0.5f;
        float daysForDiet1 = goal / diet1;
        float daysForDiet2 = goal / diet2;

        System.out.println("Дней для похудания при первой диете " + daysForDiet1);
        System.out.println("Дней для похудания при второй диете " + daysForDiet2);

        //exercise 5
        int mashaCurrentMonthlyWage = 67760;
        int denisCurrentMonthlyWage = 83690;
        int kristinaCurrentMonthlyWage = 76230;

        double mashaPromotionMonthlyWage = mashaCurrentMonthlyWage * 1.1;
        double denisPromotionMonthlyWage = denisCurrentMonthlyWage * 1.1;
        double kristinaPromotionMonthlyWage = kristinaCurrentMonthlyWage * 1.1;

        int mashaCurrentlyAnnualSalary = mashaCurrentMonthlyWage * 12;
        int denisCurrentlyAnnualSalary = denisCurrentMonthlyWage *12;
        int kristinaCurrentlyAnnualSalary = kristinaCurrentMonthlyWage * 12;

        double mashaPromotionAnnualSalary = mashaPromotionMonthlyWage * 12;
        double denisPromotionAnnualSalary = denisPromotionMonthlyWage * 12;
        double kristinaPromotionAnnualSalary = kristinaPromotionMonthlyWage * 12;

        double mashaAnnualSalaryDifference = mashaPromotionAnnualSalary - mashaCurrentlyAnnualSalary;
        double denisAnnualSalaryDifference = denisPromotionAnnualSalary - denisCurrentlyAnnualSalary;
        double kristinaAnnualSalaryDifference = kristinaPromotionAnnualSalary - kristinaCurrentlyAnnualSalary;

        System.out.println("Маша теперь получает " + mashaPromotionMonthlyWage + " рублей." + "Годовой доход вырос на " + mashaAnnualSalaryDifference + " рублей.");
        System.out.println("Денис теперь получает " + denisPromotionMonthlyWage + " рублей." + "Годовой доход вырос на " + denisAnnualSalaryDifference + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaPromotionMonthlyWage + " рублей." + "Годовой доход вырос на " + kristinaAnnualSalaryDifference + " рублей.");



    }

}