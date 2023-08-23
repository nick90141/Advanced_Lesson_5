package task_2;

import java.lang.reflect.Member;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите название класса про который нужно получить информацию (например - java.util.(Название класса)): ");
        String name = in.nextLine();

        try {
        Class<?> clazz = Class.forName(name);
        System.out.println(clazz.getName());
        printMembers(clazz.getFields());
        printMembers(clazz.getConstructors());
        printMembers(clazz.getMethods());
        } catch (ClassNotFoundException e) {
            System.out.println("Неизвестный класс:" + args[0]);
        }
    }
    private static void printMembers(Member[] mems) {
        for (int i = 0; i < mems.length; i++) {
            if (mems[i].getDeclaringClass() == Object.class)
                continue;
            String decl = mems[i].toString();
            System.out.print("   ");
            System.out.println(decl);
        }
    }
}
