package com.patron.decorador.decorator;

import com.patron.decorador.interf.Weapon;

public class ArmoredBullets extends WeaponDecorator {
	
	private float amoredBulletsAtributte;

	public ArmoredBullets(float amoredBulletsAtributte, Weapon weapon) {
		super(weapon);
		this.amoredBulletsAtributte = amoredBulletsAtributte;
	}
	
	public void chooseWeapon() {
		super.chooseWeapon();
		System.out.println("- Armored bullets added " + amoredBulletsAtributte);
	}

}
