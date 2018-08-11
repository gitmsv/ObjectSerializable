package ua.jvdevpro.smlnk;

import java.io.Serializable;

public class Human implements Serializable {

    /**
     * Для сериализуемого объекта вычисляется его контрольная сумма. Однако при наличии такого статического члена
     * она не вычисляется, а берется заданная.
     */
    private static final long serialVersionUID = 1L;

    String nameHuman;
    int ageHuman;
    char sexHuman;

    public Human(String nameHuman, int ageHuman, char sexHuman) {
        this.nameHuman = nameHuman;
        this.ageHuman = ageHuman;
        this.sexHuman = sexHuman;
    }

    @Override
    public String toString() {
        return (" Name - " + nameHuman + " Age - " + ageHuman + " Sex - " +
                String.valueOf(sexHuman));
    }
}
