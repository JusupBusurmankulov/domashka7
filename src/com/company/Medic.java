package com.company;

public class Medic extends Hero{
    @Override
    public void applySuperAbility(String typeSuperAbility) {
        System.out.println("Medic - использовал суперспособность: "+ typeSuperAbility);
    }
}
