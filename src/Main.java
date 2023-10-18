public class Main {
    /**
     * В данном случае применяется гибрид Структурной и Процедурной парадигмы, поскольку применяется цикл "for", а также
     * код оформлен в виде процедуры.
     */
    public static void main(String[] args) {
        printTable(15);
    }
    public static void printTable(int num) {
        System.out.println("\nТаблица умножения от 1 до " + num + ":\n");
        for (int i = 1; i <= num; i++) {
            System.out.println("1 * " + i + " = " + i);
        }
    }
}