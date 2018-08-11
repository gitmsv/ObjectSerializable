package ua.jvdevpro.smlnk;

import java.io.Serializable;

/**
 * Описание класса — группы людей
 */

public class GroupHuman implements Serializable {

    private Human[] groupHuman;
    private static final long serialVersionUID = 1L;

    GroupHuman() {
        groupHuman = new Human[0];

    }

    // Добавление человека в группу;

    public void addHuman(String name, int age, char sex) {
        Human[] c = new Human[groupHuman.length + 1];
        System.arraycopy(groupHuman, 0, c, 0, groupHuman.length);
        c[c.length - 1] = new Human(name, age, sex);
        groupHuman = c;
    }

    // Вывод информации о всей группе;

    public void printgroup() {
        for (Human k : groupHuman) {
            System.out.println(k);
        }
    }
}

