package ru.kuzhleva.lab3.weapons;

public class GunIsARealWeapon extends NewWeapon{
    private final int magazineCapacity;
    public GunIsARealWeapon() {
        super(5);
        this.magazineCapacity = 10;
        // В изначальной задаче 1.5.1 количество патронов 5.
        // Так как в 2.1.5 не указывается максимальное количество патронов по умолчанию, то я его устанавливаю как 10.
    }

    private static int adjustAmmo(int cartridge, int magazineCapacity) {
        if (cartridge > magazineCapacity) {
            return magazineCapacity;
        }
        return cartridge;
    }

    public GunIsARealWeapon(int cartridge, int magazineCapacity) {
        super(adjustAmmo(cartridge,magazineCapacity));
        if (magazineCapacity <= 0) {
            throw new IllegalArgumentException("Обойма не может быть отрицательным числом или равна нулю.");
        }
        this.magazineCapacity = magazineCapacity;
    }

    public GunIsARealWeapon(int magazineCapacity) {
        super(5);
        this.magazineCapacity = magazineCapacity;
    }


    // У пистолета можно узнать максимальную вместимость
    public int getMagazineCapacity() {
        return magazineCapacity;
    }

    public int reload(int newCartridge) {
        if (newCartridge < 0) {
            throw new IllegalArgumentException("Количество патронов не может быть меньше 0.");
        }
        int excess = 0;
        if (newCartridge > magazineCapacity) {
            load(magazineCapacity);
            excess = newCartridge - magazineCapacity;
        } else {
            load(newCartridge);
        }
        return excess;
    }

    public int unload() {
        int current = ammo;
        ammo = 0;
        return current;
    }

    public void printStatus() {
        System.out.println("Текущее количество патронов: " + ammo() + "/" + magazineCapacity);
    }

    public boolean isLoaded() {
        return ammo() > 0;
    }

    public boolean isEmpty() {
        return ammo() == 0;
    }

    public void loaded() {
        if (isLoaded()) {
            if (ammo() % 10 == 1  && ammo() % 100 != 11) {
                System.out.println("Магазин заряжен на " + ammo() + " патрон.");
            } else {
                System.out.println("Магазин заряжен на " + ammo() + " патронов.");
            }
        } else {
            System.out.println("Магазин разряжен.");
        }
    }

    public void shoot() {
        if (ammo() > 0) {
            System.out.println("Бах!");
            getAmmo();
        } else {
            System.out.println("Клац!");
        }
    }

    @Override
    public String toString() {
        if (ammo() % 10 == 1 && ammo() % 100 != 11) {
            return "Пистолет с " + ammo() + " патроном.";
        } else {
            return "Пистолет с " + ammo() + " патронами.";
        }
    }
}
