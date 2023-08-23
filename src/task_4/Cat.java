package task_4;

import java.lang.reflect.Field;

public class Cat {
    public static void main(String[] args) throws Exception {

        Animal animal = new Animal(1, "Кор", 45);

        Class<?> animalClass = animal.getClass();

        Field name = animalClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(animal, "Чуп");

        Field age = animalClass.getDeclaredField("age");
        age.setAccessible(true);
        age.set(animal, 2);

        Field height = animalClass.getDeclaredField("height");
        height.setAccessible(true);
        height.set(animal, 30);


        System.out.println("Имя животного: " + animal.getName() + "\n" + "Возраст животного: " +  animal.getAge() + " года" + "\n" + "Высота животного: " + animal.getHeight() + " см");

    }
}
