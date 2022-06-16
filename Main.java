public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 65536; i++) {// переберем числа в написанном цикле!!!
            char c = (char) i;// преобразуем их в символы и выведем в консоль!!!
            System.out.println(i + " - " + c);
        }
    }
}