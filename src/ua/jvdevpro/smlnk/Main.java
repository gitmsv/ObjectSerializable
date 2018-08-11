package ua.jvdevpro.smlnk;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        // Создание и наполнение группы;

        GroupHuman FML2018 = new GroupHuman();
        FML2018.addHuman("Sergey", 36, 'м');
        FML2018.addHuman("Maksim", 9, 'м');
        FML2018.addHuman("Alena", 29, 'ж');

        System.out.println();
        System.out.println("Вывод данных объекта GroupHuman: ");
        System.out.println();

        FML2018.printgroup();

        // Создание объектного потока для записи;
        try {
            ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream("fil"));

            // Запись объекта в файл;
            OOS.writeObject(FML2018);

        } catch (IOException e) {
            System.out.println("ERROR save group !!!");
        }

        // Создание объектного потока - чтение;

        GroupHuman FMLY2018 = null;

        try (ObjectInputStream OIS = new ObjectInputStream(new FileInputStream("fil"))) {

            // Считывание объекта;
            FMLY2018 = (GroupHuman) OIS.readObject();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("ERROR load group !!!");
        }

        System.out.println();
        System.out.println("Вывод данных считанного объекта: ");
        System.out.println();
        FMLY2018.printgroup(); // Убедимся, что объект верно считан;
    }
}










