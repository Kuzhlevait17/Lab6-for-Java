package ru.kuzhleva.lab6.annotations.AdditionaClasses;

import ru.kuzhleva.lab6.annotations.BasicAnnotations.Mode;
import ru.kuzhleva.lab6.annotations.BasicAnnotations.ToString;

/**
 * Класс, представляющий оружие типа пистолет с возможностью стрельбы.
 * <p>
 * Класс помечен аннотацией {@link ToString} для использования в механизме
 * формирования строкового представления.
 * </p>
 * @see ToString
 */
@ToString
public class OtherWeapon {
    @ToString(Mode.NO)
    private int cartridge;
    private final int magazineCapacity;

    /**
     * Создает объект OtherWeapon с указанным количеством патронов и вместимостью по умолчанию.
     * <p>
     * Значения по умолчанию:
     *<ul>
     *     <li> cartridge = 5 </li>
     *     <li> magazineCapacity = 10 </li>
     *</ul>
     * </p>
     */
    public OtherWeapon() {
        this.cartridge = 5;
        this.magazineCapacity = 10;
    }

    /**
     * Создает объект OtherWeapon с указанным количеством патронов и вместительностью.
     *
     * @param cartridge Количество патронов в оружии при создании.
     * @param magazineCapacity Вместимость оружия(максимальное число патронов).
     */
    public OtherWeapon(int cartridge, int magazineCapacity) {
        if (cartridge >= 0) {
            this.cartridge = cartridge;
            if (magazineCapacity > 0) {
                this.magazineCapacity = magazineCapacity;
            } else {
                throw new IllegalArgumentException("Вместимость пистолета не может быть равна нулю или отрицательной.");
            }
        } else {
            throw new IllegalArgumentException("Количество патронов не может быть отрицательным.");
        }
    }

    /**
     * Создает объект OtherWeapon с указанной вместительностью.
     * <p>
     * Количество патронов задается по умолчанию:
     * <ul>
     *     <li> cartridge = 5 </li>
     * </ul>
     * </p>
     *
     * @param magazineCapacity Вместимость магазина пистолета.
     */
    public OtherWeapon(int magazineCapacity) {
        this.cartridge = 5;
        this.magazineCapacity = magazineCapacity;
    }


    /**
     * Возвращает вместимость пистолета(количество патронов в пистолете).
     *
     * @return Вместимость созданного пистолета.
     */
    public int getMagazineCapacity() {
        return magazineCapacity;
    }

    /**
     * Производит выстрел.
     * <p>
     * Если патроны есть, выводит "Бах!" и уменьшает количество патронов.
     * Если патронов нет, выводит "Клац!".
     * </p>
     */
    public void shoot() {
        if (cartridge > 0) {
            System.out.println("Бах!");
            cartridge--;
        } else {
            System.out.println("Клац!");
        }
    }

    /**
     * Возвращает строковое представление объекта OtherWeapon.
     * <p>
     * Формат: "Стреляет пистолет с N патроном/патронами", корректно учитывает
     * окончание в зависимости от числа патронов.
     * </p>
     *
     * @return строковое представление объекта OtherWeapon.
     */
    @Override
    public String toString() {
        if (cartridge % 10 == 1 && cartridge % 100 != 11) {
            return "Cтреляет пистолет с " + cartridge + " патроном";
        } else {
            return "Стреляет пистолет с " + cartridge + " патронами";
        }
    }
}
