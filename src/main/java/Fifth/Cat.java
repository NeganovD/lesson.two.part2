package Fifth;


public class Cat {
    // должны быть приватными
//        public String name;
//        public int age;
//        public int weight;
    private String name;
    private int age;
    private int weight;


    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
// добавил геттер и сеттер для параметра вес
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}


