package com.company;

public class Magic extends Hero implements HavingSuperAbility{
    @Override
    public void applySuperAbility(String typeSuperAbility) {
        System.out.println("Magic - использовал суперспособность: "+ typeSuperAbility);

    }

}
