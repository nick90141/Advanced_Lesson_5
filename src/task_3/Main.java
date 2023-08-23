package task_3;

import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) {

    Value instance = new Value();

    Class<?> value = instance.getClass();

        System.out.println(value.getName());

        Field[] fields = value.getDeclaredFields();
        System.out.println("\nПоля: ");
        for (Field field : fields) {
            System.out.println("Название поля: " + field.getName());
            System.out.println("Тип данных поля: " + field.getType().getName());
            System.out.println("Модификатор доступа: " + Modifier.toString(field.getModifiers()));
        }

        Constructor<?>[] constructors = value.getDeclaredConstructors();
        System.out.println("\nКонструкторы: ");
        for (Constructor<?> constructor : constructors) {
            System.out.println("Название конструктора: " + constructor.getName());
            System.out.println("Количество параметров: " + constructor.getParameterCount());
            System.out.println("Модификатор доступа: " + Modifier.toString(constructor.getModifiers()));
        }

        Method[] methods = value.getDeclaredMethods();
        System.out.println("\nМетоды: ");
        for (Method method : methods) {
            System.out.println("Название метода: " + method.getName());
            System.out.println("Тип возврата метода: " + method.getReturnType().getName());
            System.out.println("Количество параметров: " + method.getParameterCount());
            System.out.println("Модификатор доступа: " + Modifier.toString(method.getModifiers()));
        }
    }
}
