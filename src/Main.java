public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной мили

        // Рассчитываете количество бонусных миль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран

        int ticketPrice = 215355;
        int miles = ticketPrice / 20;

        System.out.println("Стоимость билета: " + ticketPrice);
        System.out.println("Начислено миль: " + miles);
        System.out.println("Формула: " + ticketPrice + " / 20 = " + miles);




    }
}