package ru.kuzhleva.lab3.weapons;

public class Gun {
    private int cartridge;

    public Gun() {
        this.cartridge = 5;
    }

    public void setCartridge(int cartridge) {
        this.cartridge = cartridge;
    }

    public Gun(int cartridge) {
        if (cartridge >= 0) {
            this.cartridge = cartridge;
        } else {
            System.out.println("Ошибка! Количество патронов не может быть отрицательным числом.");
            this.cartridge = 0;
        }
    }

    public void shoot() {
        if (cartridge > 0) {
            System.out.println("Бах!");
            cartridge--;
        } else {
            System.out.println("Клац!");
        }
    }

    @Override
    public String toString() {
        if (cartridge % 10 == 1 && cartridge % 100 != 11) {
            return "Cтреляет пистолет с " + cartridge + " патроном";
        } else {
            return "Стреляет пистолет с " + cartridge + " патронами";
        }
    }
}
