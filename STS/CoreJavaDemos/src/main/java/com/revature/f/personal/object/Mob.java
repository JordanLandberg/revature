package com.revature.f.personal.object;

public class Mob {
	
	private String name;	
	private String biome;
	private int health;
	private boolean isHostile;
	public Mob() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mob(String name, String biome, int health, boolean isHostile) {
		super();
		this.name = name;
		this.biome = biome;
		this.health = health;
		this.isHostile = isHostile;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBiome() {
		return biome;
	}
	public void setBiome(String biome) {
		this.biome = biome;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public boolean isHostile() {
		return isHostile;
	}
	public void setHostile(boolean isHostile) {
		this.isHostile = isHostile;
	}
	@Override
	public String toString() {
		return "Mob [name=" + name + ", biome=" + biome + ", health=" + health + ", isHostile=" + isHostile + "]";
	}
	
	
	
	

}
