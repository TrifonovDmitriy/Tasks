package ru.animals;

public class App {
    public static void main(String[] args) {
/**
 * Создадим животных из каждого класса, для интереса проверим именных и безымянных
 */
        Animal dogBobik = new Dog("Бобик");
        dogBobik.voice();
        dogBobik.eat("Meat");
        dogBobik.eat("травка");

        Animal dog = new Dog();
        dog.voice();

        Animal rabbitPushistik = new Rabbit("Пушистик");
        rabbitPushistik.voice();
        rabbitPushistik.eat("Grass");
        rabbitPushistik.eat("косточки");

        Rabbit rabbit = new Rabbit();
        rabbit.voice();

        Animal tigerNibbler = new Tiger("Зубастик");
        tigerNibbler.voice();
        tigerNibbler.eat("Meat");
        tigerNibbler.eat("зернышки");

        Tiger tiger = new Tiger(); // дата-тип указан Tiger, т.к. если указать Animal, то он не будет понимать метод охотиться
        tiger.voice();

        tiger.hunting(rabbit);
    }
}
