package com.dorian.PortalWebBack.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Suscripcion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	public Suscripcion() {
		
	}
}
