package com.patron.decorador.decorator;

import com.patron.decorador.interf.Weapon;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class WeaponDecorator implements Weapon {
	
	private Weapon weapon;

	@Override
	public void chooseWeapon() {
		weapon.chooseWeapon();
	}

}
