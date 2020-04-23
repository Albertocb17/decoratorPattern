package com.patron.decorador.decorator;

import com.patron.decorador.interf.Weapon;

public class TelescopicSight extends WeaponDecorator {
	
	private float telescopicSightAtributte;

	public TelescopicSight(float telescopicSightAtributte, Weapon weapon) {
		super(weapon);
		this.telescopicSightAtributte = telescopicSightAtributte;
	}
	
	public void chooseWeapon() {
		super.chooseWeapon();
		System.out.println("- Telescopic sight added " + telescopicSightAtributte);
	}

}
