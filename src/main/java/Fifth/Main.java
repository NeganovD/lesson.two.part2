package Fifth;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Kuzya", 2, 3);
        System.out.println("Имя кота: " + cat.getName());
        System.out.println("Возраст кота в годах: " + cat.getAge());
        System.out.println("Вес кота в кг: " + cat.getWeight());
    }
}
