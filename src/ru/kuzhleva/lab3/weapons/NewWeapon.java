package ru.kuzhleva.lab3.weapons;

abstract class NewWeapon {
    //private int ammo;
    protected int ammo;

    public NewWeapon(int ammo) {
        if (ammo < 0) {
            //throw new RuntimeException();
            throw new IllegalArgumentException("Количество патронов не может быть меньше 0.");
        }
        this.ammo = ammo;
    }

    abstract void shoot();

    public int ammo() {
        return ammo;
    }

    public boolean getAmmo() {
        if (ammo == 0) {
            return false;
        }
        ammo--;
        return false;
    }

    public int load(int ammo) {
        if (ammo < 0) {
            throw new RuntimeException();
        }
        int tmp = ammo;
        this.ammo = ammo;
        return tmp;
    }
}
