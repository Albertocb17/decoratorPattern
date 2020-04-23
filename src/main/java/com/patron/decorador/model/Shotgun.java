package com.patron.decorador.model;

import com.patron.decorador.interf.Weapon;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Shotgun implements Weapon {
	
	private float damage;
	private float distance;
	
	@Override
	public void chooseWeapon() {
		System.out.println("The weapon of choice is Shotgun and it has " + damage + " damage and " + distance + " distance.");
	}

}
