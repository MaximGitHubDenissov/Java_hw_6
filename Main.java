package Java_hw_6;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in, "Cp866");
        HashSet<Notebook> goods = new HashSet<Notebook>();
        Notebook nb1 = new Notebook("Asus", "Win", 5, 2, 15, "Черный");
        goods.add(nb1);
        Notebook nb2 = new Notebook("Asus", "Linux", 5, 3, 15, "Серый");
        goods.add(nb2);
        Notebook nb3 = new Notebook("Lenovo", "Win", 4, 2, 17, "Черный");
        goods.add(nb3);
        Notebook nb4 = new Notebook("Lenovo", "Linux", 4, 3, 17, "Серый");
        goods.add(nb4);
        Notebook nb5 = new Notebook("HP", "Win", 3, 3, 15, "Белый");
        goods.add(nb5);
        Notebook nb6 = new Notebook("HP", "Linux", 5, 4, 17, "Белый");
        goods.add(nb6);
        HashSet<String> colors = new HashSet<>();
        HashSet<String> brands = new HashSet<>();
        HashSet<String> ostypes = new HashSet<>();
        HashSet<Integer> hds = new HashSet<>();
        HashSet<Integer> oms = new HashSet<>();
        HashSet<Integer> sizes = new HashSet<>();

        for (Notebook item : goods) {
            colors.add(item.getColor());
            brands.add(item.getBrand());
            ostypes.add(item.getOs());
            hds.add(item.getHd());
            oms.add(item.getOm());
            sizes.add(item.getSize());
        }

        // System.out.println(goods.toString());
        System.out.println("Добрый день. Задайте параметры для выбора ноутбука\n" +
                "1 - Бренд\n2 - Операционная система\n3 - Объем жесткого диска\n4 - Объем ОЗУ\n" +
                "5 - Диагональ монитора\n" +
                "6 - Цвет");
        char input = in.next().charAt(0);
        if (input == '1') {
            System.out.println("В наличии следующие бренды:");
            System.out.println(brands.toString());
            System.out.println("Напишите название бренда: ");
            String name = in.next();
            HashSet<Notebook> res = new HashSet<>();
            for (Notebook item : goods) {
                if (item.getBrand().equals(name)) {
                    res.add(item);
                }
            }
            System.out.println("По заданным параметрам есть следующие ноутбуки:");
            System.out.println(res.toString());
        }
        if (input == '2') {
            System.out.println("В наличии следующие операционные системы:");
            System.out.println(ostypes.toString());
            System.out.println("Напишите название операционной системы: ");
            String name = in.next();
            HashSet<Notebook> res = new HashSet<>();
            for (Notebook item : goods) {
                if (item.getOs().equals(name)) {
                    res.add(item);
                }
            }
            System.out.println("По заданным параметрам есть следующие ноутбуки:");
            System.out.println(res.toString());
        }
        if (input == '3') {
            System.out.println("Введите минимальный объем жесткого диска");
            int min = in.nextInt();
            System.out.println("Введите максимальный объем жесткого диска");
            int max = in.nextInt();
            HashSet<Notebook> res = new HashSet<>();
            for (Notebook item : goods) {
                if (item.getHd() >= min && item.getHd() <= max) {
                    res.add(item);
                }
            }
            if (res.size() == 0) {
                System.out.println("К сожалению моделей с такими параметрами нет");
            } else {
                System.out.println("По заданным параметрам есть следующие ноутбуки:");
                System.out.println(res.toString());
            }
        }
        if (input == '4') {
            System.out.println("Введите минимальный объем оперативной памяти");
            int min = in.nextInt();
            System.out.println("Введите максимальный объем оперативной памяти");
            int max = in.nextInt();
            HashSet<Notebook> res = new HashSet<>();
            for (Notebook item : goods) {
                if (item.getOm() >= min && item.getOm() <= max) {
                    res.add(item);
                }
            }
            if (res.size() == 0) {
                System.out.println("К сожалению моделей с такими параметрами нет");
            } else {
                System.out.println("По заданным параметрам есть следующие ноутбуки:");
                System.out.println(res.toString());
            }
        }
        if (input == '5') {
            System.out.println("В наличии ноутбуки со следующей диагональю:");
            System.out.println(sizes.toString());
            System.out.println("Напишите размер диагонали: ");
            int name = in.nextInt();
            HashSet<Notebook> res = new HashSet<>();
            for (Notebook item : goods) {
                if (item.getSize() == name) {
                    res.add(item);
                }
            }
            System.out.println("По заданным параметрам есть следующие ноутбуки:");
            System.out.println(res.toString());

        }
        if (input == '6') {
            System.out.println("В наличии ноутбуки следующих цветов:");
            System.out.println(colors.toString());
            System.out.println("Напишите цвет: ");
            String name = in.next();
            HashSet<Notebook> res = new HashSet<>();
            for (Notebook item : goods) {
                if (item.getColor().equals(name)) {
                    res.add(item);
                }
            }
            System.out.println("По заданным параметрам есть следующие ноутбуки:");
            System.out.println(res.toString());

        }
        in.close();

    }
}
