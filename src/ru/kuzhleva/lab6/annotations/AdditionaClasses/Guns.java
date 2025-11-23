package ru.kuzhleva.lab6.annotations.AdditionaClasses;

import ru.kuzhleva.lab3.weapons.GunIsAWeapon;
import ru.kuzhleva.lab6.annotations.BasicAnnotations.Default;


/**
 * Класс, представляющий оружие типа автомат с возможностью стрельбы.
 * <p>
 * Класс наследует {@link GunIsAWeapon} и помечен аннотацией
 * {@link Default} как класс по умолчанию.
 * </p>
 * @see GunIsAWeapon
 * @see Default
 */
@Default(Guns.class)
public class Guns extends GunIsAWeapon {
    private static final int defaultCartridge = 10;
    private static final int defaultStorage = 20;

    /**
     * Создает объект Guns с указанным количеством патронов и вместительностью.
     *
     * @param cartridge Количество патронов в оружии при создании.
     * @param storage Вместимость оружия(максимальное число патронов).
     */
    public Guns(int cartridge, int storage) {
        super(cartridge, storage);
    }

    /**
     * Создает объект Guns с указанным количеством патронов и вместимостью по умолчанию.
     * <p>
     * Значения по умолчанию:
     *<ul>
     *     <li> defaultCartridge = 10 </li>
     *     <li> defaultStorage = 20 </li>
     *</ul>
     * </p>
     */
    public Guns() {
        super(defaultCartridge,defaultStorage);
    }

    /**
     * Производит выстрел.
     * <p>
     * Если патроны есть, выводит "Та-та-та!" и уменьшает количество патронов.
     * Если патронов нет, выводит "Клац-клац-клац!".
     * </p>
     */
    @Override
    public void shoot() {
        if (ammo() > 0) {
            System.out.println("Та-та-та!");
            getAmmo();
        } else {
            System.out.println("Клац-клац-клац!");
        }
    }

    /**
     * Возвращает строковое представление объекта Guns.
     * <p>
     * Формат: "Автомат с N патроном/патронами", корректно учитывает
     * окончание в зависимости от числа патронов.
     * </p>
     * @return строковое представление объекта Guns.
     */
    @Override
    public String toString() {
        if (ammo() % 10 == 1 && ammo() %100 != 11) {
            return "Автомат с " + ammo() + " патроном.";
        } else {
            return "Автомат с " + ammo() + " патронами.";
        }
    }
}
