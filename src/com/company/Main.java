package com.company;

public class Main {
    public static void main(String[] args) {
        Magic magic = new Magic();
        Medic medic = new Medic();
        Warrior warrior = new Warrior();
        HavingSuperAbility[] array = {magic,medic,warrior};
        for (int i = 0; i < array.length; i++) {
            array[i].applySuperAbility("Critical Damage");




        }



    }
}
