public class Main {
    public static void main(String[] args) {

        int amount = 600; // начальная сумма
        int deposit = 1500; // сумма пополнения
        int bonus = deposit / 100; // бонус при пополнении счета от 1000 рублей

        if (deposit < 1000) {
            bonus = 0;
        }
        int total = amount + deposit + bonus; // итого средств на счете после пополнения

        System.out.println(deposit + " Сумма пополнения");
        System.out.println(total + " Всего средств на счете");
        System.out.println(bonus + " Бонусов начислено");
    }
}