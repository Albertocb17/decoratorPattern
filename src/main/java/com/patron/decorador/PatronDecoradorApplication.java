package com.patron.decorador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.patron.decorador.decorator.ArmoredBullets;
import com.patron.decorador.decorator.ExtendedCharger;
import com.patron.decorador.decorator.TelescopicSight;
import com.patron.decorador.interf.Weapon;
import com.patron.decorador.model.Gun;
import com.patron.decorador.model.Shotgun;

@SpringBootApplication
public class PatronDecoradorApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatronDecoradorApplication.class, args);
		
		Weapon weapon = new ExtendedCharger(45, new TelescopicSight(90, new ArmoredBullets(67, new Gun(20,50))));
		weapon.chooseWeapon();
		Weapon weapon2 = new ArmoredBullets(99, new Shotgun(80,30));
		weapon2.chooseWeapon();
		
	}

}
