public class Main {
    public static void main(String[] args) {

    int savings = 29000;
    int savingsTotal = 0;

    for (int i = 1; i <12; i++) {
        savingsTotal = savingsTotal + savings;
        System.out.println("Месяц " + i + ", сумма накоплений равна " + savingsTotal + " рубелй");
    }


    }
}