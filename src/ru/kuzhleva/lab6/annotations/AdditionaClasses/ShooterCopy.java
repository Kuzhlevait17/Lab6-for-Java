package ru.kuzhleva.lab6.annotations.AdditionaClasses;

import ru.kuzhleva.lab6.annotations.BasicAnnotations.Cache;
import ru.kuzhleva.lab6.annotations.BasicAnnotations.Validate;

/**
 * Класс, представляющий стрелка с возможностью использовать оружие.
 * <p>
 * Класс помечен аннотациями:
 * <ul>
 *     <li> {@link Cache} - список полей, которые кэшируются.</li>
 *     <li> {@link Validate} - список классов, которые проверяются через механизм валидации. </li>
 * </ul>
 * </p>
 * @see Cache
 * @see Validate
 */
@Cache({"name","weaponCopy"})
@Validate({ShooterCopy.class, WeaponCopy.class})
public class ShooterCopy {
    private String name;
    private WeaponCopy weaponCopy;

    /**
     * Создает объект ShooterCopy с указанным именем.
     *
     * @param name Имя стрелка
     */
    public ShooterCopy(String name) {
        this.name = name;
    }

    /**
     * Возвращает имя стрелка.
     *
     * @return Имя стрелка.
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает оружие стрелка.
     *
     * @return объект оружия {@link WeaponCopy}, если оно установлено, иначе {@code null}.
     */
    public WeaponCopy getWeapon() {
        return weaponCopy;
    }

    /**
     * Задает новое имя стрелка.
     *
     * @param name Новое имя стрелка.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Задает новое оружие стрелка
     *
     * @param weaponCopy объект оружия {@link WeaponCopy}
     */
    public void setWeapon(WeaponCopy weaponCopy) {
        this.weaponCopy = weaponCopy;
    }

    /**
     * Производит выстрел.
     * <p>
     * Логика оружия:
     * <ul>
     *     <li> Если оружие есть, выводится имя стрелка и производится выстрел через {@link WeaponCopy#shoot()} </li>
     *     <li> Если оружия нет, выводится имя стрелка и сообщение о том, что стрелок не может участвовать в перестрелке. </li>
     * </ul>
     * </p>
     */
    public void shoot() {
        if (weaponCopy == null) {
            System.out.println(name + " не может участвовать в перестрелке");
        } else {
            System.out.println(name + " ");
            weaponCopy.shoot();
        }
    }

    /**
     * Возвращает строковое представление объекта ShooterCopy
     * <p>
     * Формат: Стрелок имя [с оружием/без оружия].
     * </p>
     *
     * @return строковое представление объекта ShooterCopy
     */
    @Override
    public String toString() {
        return "Стрелок " + name + (weaponCopy != null ? " с оружием " + weaponCopy : " без оружия.");
    }
}
