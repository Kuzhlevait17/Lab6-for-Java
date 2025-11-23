package ru.kuzhleva.lab6.annotations.AdditionaClasses;

/**
 * Абстрактный класс, описывающий оружие с патронами.
 * <p>
 * Определяет базовое состояние оружия, включая количество патронов,
 * методы стрельбы и пополнение магазина патронов.
 * </p>
 */
abstract class WeaponCopy {
    private int ammo;

    /**
     * Создает объект WeaponCopy с количеством патронов.
     *
     * @param ammo Количество патронов при создании
     * @throws RuntimeException если ammo < 0
     */
    public WeaponCopy(int ammo) {
        if (ammo < 0) {
            throw new RuntimeException();
        }
        this.ammo = ammo;
    }

    /**
     * Производит выстрел.
     * <p>
     * Метод должен быть реализован в подклассах, учитывая
     * логику конкретного оружия.
     * </p>
     */
    abstract void shoot();

    /**
     * Возвращает текущее количество патронов в оружии.
     *
     * @return Количество патронов в оружии.
     */
    public int ammo() {
        return ammo;
    }

    /**
     * Уменьшает количество патронов на 1 при выстреле, если патроны есть
     *
     * @return {@code true}, если патроны были и п выстрел произведен; {code false}, если патронов не было.
     */
    public boolean getAmmo() {
        if (ammo == 0) {
            return false;
        }
        ammo--;
        return false;
    }

    /**
     * Загружает оружие указанным количеством патронов.
     *
     * @param ammo количество патронов для загрузки
     * @return количество патронов, которое было в оружии до загрузки.
     * @throws RuntimeException если ammo < 0
     */
    public int load(int ammo) {
        if (ammo < 0) {
            throw new RuntimeException();
        }
        int tmp = ammo;
        this.ammo = ammo;
        return tmp;
    }
}