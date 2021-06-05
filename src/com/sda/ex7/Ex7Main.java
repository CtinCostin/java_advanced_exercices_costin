package com.sda.ex7;

/**
 * Create a class imitating a weapon magazine.
 * The class should be able to define the size of the magazine using the constructor.
 * Implement the methods:loadBullet(String bullet)→ adding a cartridge to the magazine,
 * does not allow loading more cartridges than the capacity of the magazine
 * is Loaded()→ returns information
 * about whether the weapon is loaded (at least one cartridge)
 * or not shot()→ each call shots one bullet
 * (prints string value in console) -the last loaded cartridge -and prepares the next one,
 * loaded before the last one, if there are no more cartridges,
 * it prints "empty magazine" in the console
 */

public class Ex7Main {

    public static void main(String[] args) {

        WeaponMagazine weaponMagazine = new WeaponMagazine(5);
        weaponMagazine.loadBullet("Bullet 1");
        weaponMagazine.loadBullet("Bullet 2");
        weaponMagazine.loadBullet("Bullet 3");
        weaponMagazine.loadBullet("Bullet 4");
        weaponMagazine.loadBullet("Bullet 5");
        weaponMagazine.loadBullet("Bullet 6");

        for (int i = 0; i < 8; i++) {
            weaponMagazine.shot();
        }

    }
}
