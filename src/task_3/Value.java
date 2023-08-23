package task_3;

public class Value {
    public Value(int age, String name, int height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }
    public Value(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Value(int age) {
        this.age = age;
    }

    public Value() {
    }

    public int age;
    protected String name;
    private int height;
    public void Method1 () {
        System.out.println("Это метод №1");
    }
    public static int Method2 () {
        System.out.println("Это метод №2");
        return 0;
    }
    public void Method3 () {
        System.out.println("Это метод №3");
    }
}
