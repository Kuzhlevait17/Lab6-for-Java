package ru.kuzhleva.lab3.weapons;

public class MachineGun extends GunIsAWeapon {
    private static final int defaultCartridge = 10;
    private static final int defaultStorage = 20;

    public MachineGun(int cartridge, int storage) {
        super(cartridge, storage);
    }

    public MachineGun() {
        super(defaultCartridge,defaultStorage);
    }

    @Override
    public void shoot() {
        if (ammo() > 0) {
            System.out.println("Та-та-та!");
            getAmmo();
        } else {
            System.out.println("Клац-клац-клац!");
        }
    }

    @Override
    public String toString() {
        if (ammo() % 10 == 1 && ammo() %100 != 11) {
            return "Автомат с " + ammo() + " патроном.";
        } else {
            return "Автомат с " + ammo() + " патронами.";
        }
    }
}
