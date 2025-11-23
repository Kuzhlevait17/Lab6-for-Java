package ru.kuzhleva.main;

import ru.kuzhleva.lab3.weapons.GunIsAWeapon;
import ru.kuzhleva.lab3.weapons.MachineGun;
import ru.kuzhleva.lab3.weapons.Shooter;

public class Block25 {

    public void makeShoot(Shooter shooter) {
        shooter.shoot();
    }

    public void setName(Shooter shooter,String name) {
        shooter.setName(name);
    }

    public void setGun(Shooter shooter, int cartridge, int storage) {
        shooter.setWeapon(new GunIsAWeapon(cartridge,storage));
    }

    public void setAutomat(Shooter shooter, int cartridge, int storage) {
        shooter.setWeapon(new MachineGun(cartridge,storage));
    }

    public String toString(Shooter shooter) {
        return "Стрелок " + shooter.getName() + (shooter.getWeapon()!= null ? " с оружием " + shooter.getWeapon() : " без оружия.");
    }
}
