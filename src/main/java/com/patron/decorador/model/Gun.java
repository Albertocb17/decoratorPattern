package com.patron.decorador.model;

import com.patron.decorador.interf.Weapon;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Gun implements Weapon {

	private float accuracy;
	private float speed;
	
	@Override
	public void chooseWeapon() {
		System.out.println("The weapon of choice is Gun and it has " + accuracy + " accuracy and " + speed + " speed.");
	}
	
}
