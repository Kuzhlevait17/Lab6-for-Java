package ru.kuzhleva.lab3.weapons;

public class GunIsAWeapon extends Weapon {
   // private int cartridge;
    private final int magazineCapacity;

//    public ru.kuzhleva.Lab3.weapons.GunIsAWeapon() {
//        this.cartridge = 5;
//        this.magazineCapacity = 10;
//        // Так как в задаче не написана максимальная вместимость,
//        // а в изначальной задаче в пистолете 5 патронов если не указано
//        // иначе, я выбрала 10.
//}
//    // Пистолет имеет максимальное количество патронов, которое нельзя изменить после его создания.
//    public ru.kuzhleva.Lab3.weapons.GunIsAWeapon(int cartridge, int magazineCapacity) {
//        if (cartridge >= 0) {
//            this.cartridge = cartridge;
//            if (magazineCapacity > 0) {
//                this.magazineCapacity = magazineCapacity;
//            } else {
//                throw new IllegalArgumentException("Вместимость пистолета не может быть равна нулю или отрицательной.");
//            }
//        } else {
//            throw new IllegalArgumentException("Количество патронов не может быть отрицательным.");
//        }
//    }
//    public void setCartridge(int cartridge) {
//        this.cartridge = cartridge;
//    }
//    public ru.kuzhleva.Lab3.weapons.OtherWeapon(int cartridge) {
//        if (cartridge >= 0) {
//            this.cartridge = cartridge;
//        } else {
//            System.out.println("Ошибка! Количество патронов не может быть отрицательным числом.");
//            this.cartridge = 0;
//        }
//    }
//    public int Reload(int newCartridge) {
//        int excess = 0;
//        if (newCartridge >= 0) {
//            this.cartridge = newCartridge;
//        } else {
//            throw new IllegalArgumentException("Количество заряжаемых патронов не может быть меньше 0");
//        }
//        if (newCartridge > magazineCapacity) {
//            this.cartridge = magazineCapacity;
//            excess = magazineCapacity - newCartridge;
//        }
//
//        return excess;
//    }
//    public void shoot() {
//        if (cartridge > 0) {
//            System.out.println("Бах!");
//            cartridge--;
//        } else {
//            System.out.println("Клац!");
//        }
//    }
//    public int unload() {
//        int current = this.cartridge;
//        this.cartridge = 0;
//        return current;
//    }
//    public void printStatus() {
//        if (cartridge != 0) {
//            System.out.println("Текущее количество заряженных патронов: " + cartridge + "/" + magazineCapacity);
//        } else {
//            System.out.println("Магазин разряжен.");
//            System.out.println("Текущее количество патронов: 0/"+ magazineCapacity);
//        }
//    }
//    public boolean isLoaded() {
//        return cartridge > 0;
//    }
//    public boolean isEmpty() {
//        return cartridge == 0;
//    }
//    public void loaded() {
//        if (isLoaded()) {
//            if (cartridge%10==1 && cartridge%100!=11) {
//                System.out.println("Магазин заряжен на " + cartridge + " патрон" );
//            } else {
//                System.out.println("Магазин заряжен на  " + cartridge + " патронов");
//            }
//        } else {
//            System.out.println("Магазин разряжен.");
//        }
//    }
//    @Override
//    public String toString() {
//        if (cartridge % 10 == 1 && cartridge % 100 != 11) {
//            return "Cтреляет пистолет с " + cartridge + " патроном";
//        } else {
//            return "Стреляет пистолет с " + cartridge + " патронами";
//        }
//    }

    public GunIsAWeapon() {
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

    public GunIsAWeapon(int cartridge, int magazineCapacity) {
        super(adjustAmmo(cartridge,magazineCapacity));
        if (magazineCapacity <= 0) {
            throw new IllegalArgumentException("Обойма не может быть отрицательным числом или равна нулю.");
        }
        this.magazineCapacity = magazineCapacity;
    }

    public GunIsAWeapon(int magazineCapacity) {
        super(5);
        this.magazineCapacity = magazineCapacity;
    }

    public int getMagazineCapacity() {
        return magazineCapacity;
    }

    public int reload(int newCartridge) {
        if (newCartridge <= 0) {
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
        int current = ammo();
        load(0);
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

