//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурка", 3);
        //cat1.setName("Дуся");
        cat1.getName(); // выводим гетнейм
        System.out.println(cat1.getName());
        //cat1.name = "Сара"; // открытый доступ по внутренним полям
        //cat1.age = -7;// открытый доступ по внутренним полям  используется модификатор private
        cat1.setAge(5);
        cat1.jump();
        System.out.println(cat1.getAge());
        System.out.println(cat1.getName());
        //System.out.println(cat1.setName();); сеттер вывыести на печать нельзя потому что метод войд



    }
}

class Cat {
    private String name;
    private int age;
    private int weight;
    private int ves;
    private int ves1;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {  // прочитать имя
        return name; // геттер возвращает имя то что прочел

    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {  // метод принимает строковое значение нейм
        this.name = name; // устанавливает значение нейм.

    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Возраст отрицательный");
        }
    }

    void jump() {
        System.out.println("Киса прыгает");
    }
}



