package com.company;

public class Warrior extends Hero{
    @Override
    public void applySuperAbility(String typeSuperAbility) {
        System.out.println("Warrior - использовал суперспособность: "+ typeSuperAbility);
    }
}
