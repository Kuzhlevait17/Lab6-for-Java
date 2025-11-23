package ru.kuzhleva.lab3.weapons;

public class Automat extends ReloadGun {
        private final int speed;

        public Automat() {
            super();
            setCartridge(5);
            setMagazineCapacity(30);
            this.speed = 30;
        }

        public Automat(int magazineCapacity) {
            super();
            if (magazineCapacity > 0) {
                setCartridge(5);
                setMagazineCapacity(magazineCapacity);
                this.speed = magazineCapacity / 2;
            } else {
                throw new IllegalArgumentException("Вместимость магазина не может быть меньше единицы.");
            }
        }

        public Automat(int magazineCapacity, int speed) {
            super();
            if (speed > 0) {
                setMagazineCapacity(magazineCapacity);
                setCartridge(5);
                this.speed = speed;
            } else {
                throw new IllegalArgumentException("Скорострельность не может быть меньше нуля.");
            }
        }

    public int getSpeed() {
        return speed;
    }

    public void shoot(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Количество секунд должно быть положительным числом.");
        } else {
            int bullets = getCartridge();
            int totalAmount = n * speed;
            for (int i = 0; i < totalAmount; i++) {
                if (bullets > 0) {
                    System.out.println(i+1 +" Бах!");
                } else {
                    System.out.println(i+1 + " Клац!");
                }
                bullets--;
            }
            if (bullets >= 0) {
                setCartridge(bullets);
            } else {
                setCartridge(0);
            }
        }
    }

    @Override
    public void shoot() {
        int bullets = getCartridge();
        for (int i = 0; i < speed; i++) {
            if (bullets > 0) {
                System.out.println(i+1 + " Бах!");
            } else {
                System.out.println(i+1 + " Клац!");
            }
            bullets--;
        }
        if (bullets >= 0) {
            setCartridge(bullets);
        } else {
            setCartridge(0);
        }
    }

    @Override
    public String toString() {
        if (cartridge % 10 == 1 && cartridge % 100 != 11) {
            return "Cтреляет пистолет с " + cartridge + " патроном" + '\n'
                   + "Скорость пистолета: " + speed + '\n'
                   + "Вместимость пистолета: " + magazineCapacity;
        } else {
            return "Стреляет пистолет с " + cartridge + " патронами" + '\n'
                  + "Скорость пистолета: " + speed + '\n'
                   + "Вместимость пистолета: " + magazineCapacity;
        }
    }
}
