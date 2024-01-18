package de.telran;

import module1.lecture1.module1.lecture1.Person;

public class Main {
    public static void main(String[] args) {

        //
// 1 уровень сложности: 1.Класс module1.lecture1.module1.lecture1.Person
//Создать класс module1.lecture1.module1.lecture1.Person, который содержит:
//        переменные fullName, age;
//методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  module1.lecture1.module1.lecture1.Person говорит".
//Добавьте два конструктора  - module1.lecture1.module1.lecture1.Person() и module1.lecture1.module1.lecture1.Person(fullName, age).
//Создайте два объекта этого класса. Один объект инициализируется конструктором module1.lecture1.module1.lecture1.Person(), другой - module1.lecture1.module1.lecture1.Person(fullName, age)
//

            task1();

//2.Класс Phone.
//Создайте класс Phone, который содержит переменные number, model и weight.
//Создайте три экземпляра этого класса.
//Выведите на консоль значения их переменных.
//Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
//Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
//Вызвать эти методы для каждого из объектов.

            task2();
    }
    public static void task1(){

        System.out.println("------------- Task #1 -------------");
        Person person1 = new Person();
        Person person2 = new Person("Николай", 29);

        person1.move();
        person1.talk();

        person2.move();
        person2.talk();
    }

    public static void task2(){

        System.out.println("\n------------- Task #2 -------------");

        Phone phone1 = new Phone("+380670000001","Nokia 3310  ", 99);
        Phone phone2 = new Phone("+380670000002","IPhone XR   ", 199);
        Phone phone3 = new Phone("+380670000003","Motorola C60", 299);

        phone1.printVariable("phone1");
        phone2.printVariable("phone2");
        phone3.printVariable("phone3");

        System.out.println();

        phone1.receiveCall("Николай");
        phone2.receiveCall("Евгений");
        phone3.receiveCall("Машка");

        System.out.println();

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());
    }
}
