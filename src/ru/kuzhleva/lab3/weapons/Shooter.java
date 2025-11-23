package ru.kuzhleva.lab3.weapons;

public class Shooter {
    private String name;
    private Weapon weapon;

    public Shooter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void shoot() {
        if (weapon == null) {
            System.out.println(name + " не может участвовать в перестрелке");
        } else {
            System.out.println(name + " ");
            weapon.shoot();
        }
    }

    @Override
    public String toString() {
        return "Стрелок " + name + (weapon != null ? " с оружием " + weapon : " без оружия.");
    }
}
