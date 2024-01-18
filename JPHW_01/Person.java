package module1.lecture1.module1.lecture1;

//
// 1 уровень сложности: 1.Класс module1.lecture1.module1.lecture1.Person
//Создать класс module1.lecture1.module1.lecture1.Person, который содержит:
//        переменные fullName, age;
//методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  module1.lecture1.module1.lecture1.Person говорит".
//Добавьте два конструктора  - module1.lecture1.module1.lecture1.Person() и module1.lecture1.module1.lecture1.Person(fullName, age).
//Создайте два объекта этого класса. Один объект инициализируется конструктором module1.lecture1.module1.lecture1.Person(), другой - module1.lecture1.module1.lecture1.Person(fullName, age)

public class Person {

    private String fullName;
    private int age;

    public Person() {
        this.fullName = "default";
        this.age = 0;
    }

    public Person(java.lang.String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println("Говорит такой то "+fullName+ ". Мой возраст "+ age+"лет");
    }

    public  void  talk() {
        System.out.println("Говорит такой то "+fullName+ ". Мой возраст "+ age+"лет");

    }
}
