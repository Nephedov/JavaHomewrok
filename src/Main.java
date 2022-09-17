import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int cost = 95698; // Эту переменную береем будто откуда-то извне.
        int bonusMiles = cost / 20;

        System.out.println(cost + "руб Стоимость билета.");
        System.out.println(bonusMiles + " Бонусных миль.");
    }
}
