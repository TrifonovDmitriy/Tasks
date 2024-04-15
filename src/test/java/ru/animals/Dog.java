package ru.animals;

public class Dog extends Animal {
    private String name;

    /**
     * Конструктор без аргументов (по умолчанию)
     */
    public Dog() {
    }

    /**
     * Конструктор с именем
     */
    public Dog(String name) {
        this.name = name;
    }

    /**
     * Переопределяем методы
     */
    @Override
    public void voice() {
        if (this.name == null) {
            System.out.println("Собачка лает: Гав-гав!");
        } else System.out.println(this.name + " лает: Гав-гав!");
    }

    @Override
    public void eat(String food) {
        if (food == "Meat") {
            System.out.println(this.name + " любит есть мясо");
        } else System.out.println(this.name + " не доволен этим: " + food);
    }
}
