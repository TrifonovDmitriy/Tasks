package ru.animals;

public class Tiger extends Animal implements Hunter {
    private String name;

    /**
     * Конструктор без аргументов (по умолчанию)
     */
    public Tiger() {
    }

    /**
     * Конструктор с именем
     */
    public Tiger(String name) {
        this.name = name;
    }

    /**
     * Переопределяем методы
     */
    @Override
    public void hunting(Rabbit obj) {
        System.out.println("Тигр поймал кролика");
    }

    @Override
    public void voice() {
        if (this.name == null) {
            System.out.println("Тигр рычит");
        } else System.out.println(this.name + " рычит!");
    }

    @Override
    public void eat(String food) {
        if (food == "Meat") {
            System.out.println(this.name + " любит есть мясо");
        } else System.out.println(this.name + " не доволен этим: " + food);
    }

}
