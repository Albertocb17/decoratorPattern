package com.patron.decorador.decorator;

import com.patron.decorador.interf.Weapon;

import lombok.Getter;

@Getter
public class ExtendedCharger extends WeaponDecorator {
	
	private float extendedChargerAtributte;

	public ExtendedCharger(float extendedChargerAtributte, Weapon weapon) {
		super(weapon);
		this.extendedChargerAtributte = extendedChargerAtributte;
	}
	
	public void chooseWeapon() {
		super.chooseWeapon();
		System.out.println("- Extended charger added " + extendedChargerAtributte);
	}

}
