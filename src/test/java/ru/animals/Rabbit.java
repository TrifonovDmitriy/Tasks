package ru.animals;

public class Rabbit extends Animal {
    private String name;

    /**
     * Конструктор без аргументов (по умолчанию)
     */
    public Rabbit() {
    }

    /**
     * Конструктор с именем
     */
    public Rabbit(String name) {
        this.name = name;
    }

    /**
     * Переопределяем методы
     */
    @Override
    public void voice() {
        if (this.name == null) {
            System.out.println("Кролик фыркает");
        } else System.out.println(this.name + " фыркает!");
    }

    @Override
    public void eat(String food) {
        if (food == "Grass") {
            System.out.println(this.name + " любит травку");
        } else System.out.println(this.name + " не доволен этим: " + food);
    }
}
