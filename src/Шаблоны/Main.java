package Шаблоны;

public class Main {
    public static void main(String[] args) {
        Accumulator<String> acc = new Accumulator<String>("Beginning");
        acc.add(" Hello");
        System.out.println(acc.getAcc());
    }
}
