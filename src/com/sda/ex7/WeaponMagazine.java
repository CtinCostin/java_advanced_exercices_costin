package com.sda.ex7;

import java.util.ArrayList;
import java.util.List;

public class WeaponMagazine {

    private int size;
    private List<String> magazine;

    public WeaponMagazine(int size) {
        this.size = size;
        this.magazine = new ArrayList<>();
    }

    public void loadBullet(String bullet) {
        if (magazine.size() < size) {
            this.magazine.add(bullet);
        } else {
            System.out.println("The magazine is overloaded ! ");
        }

    }

    public boolean isLoaded() {
//        if(this.magazine.size() > 0){
//            return true;
//        }else {
//    }
        return this.magazine.size() > 0;
    }

    public void shot() {
        if (this.isLoaded()) {
            System.out.println("Take care , the next bullet is loaded");
            System.out.println(magazine.get(this.magazine.size() - 1));
            magazine.remove(this.magazine.size() - 1);
        } else {
            System.out.println("Empty magazine");
        }

    }
}
