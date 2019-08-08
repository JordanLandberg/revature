package com.revature.f.personal.object;

import java.util.Scanner;

public class MinecraftDriver {

	public static void main(String[] args) {

		Mob cow = new Mob("Cow", "grasslands", 10, false);
		Mob zombie = new Mob("Zombie", "any", 22, true);
		Mob shulker = new Mob("Shulker", "end", 20, true);
		Mob enderman = new Mob("Enderman", "any", 40, false);
		Mob babyZombie = new Mob("Zombie", "any", 20, true);
		Mob pig = new Mob("Pig", "Grasslands", 10, false);
		Mob chicken = new Mob("Chicken", "any", 4, false);
		Mob chickenJockey = new Mob("Chicken Jockey", "any", 20, true);
		Mob spider = new Mob("Spider", "any", 16, false);
		Mob wolf = new Mob("Wolf", "grasslands/taiga", 20, false);
		Mob polarBear = new Mob("Polar Bear", "iceSpikes", 30, false);
		Mob wither = new Mob("Wither", "any", 600, true);
		Mob enderDragon = new Mob("Ender Dragon", "end", 200, true);
		Mob ironGolem = new Mob("Iron Golem", "village", 100, false);
		Mob snowGolem = new Mob("Snow Golem", "any", 4, false);
		Mob cat = new Mob("Cat", "jungle", 10, false);
		Mob donkey = new Mob("Donkey", "plains", 30, false);
		Mob horse = new Mob("Horse", "plains/grasslands", 30, false);
		Mob llama = new Mob("Llama", "mountains/savanna", 30, false);
		Mob parrot = new Mob("Parrot", "jungle", 6, false);

		Mob[] mobArray = new Mob[20];
		mobArray[0] = cow;
		mobArray[1] = zombie;
		mobArray[2] = shulker;
		mobArray[3] = enderman;
		mobArray[4] = babyZombie;
		mobArray[5] = pig;
		mobArray[6] = chicken;
		mobArray[7] = chickenJockey;
		mobArray[8] = spider;
		mobArray[9] = wolf;
		mobArray[10] = polarBear;
		mobArray[11] = wither;
		mobArray[12] = enderDragon;
		mobArray[13] = ironGolem;
		mobArray[14] = snowGolem;
		mobArray[15] = cat;
		mobArray[16] = donkey;
		mobArray[17] = horse;
		mobArray[18] = llama;
		mobArray[19] = parrot;

//		for(int i = 0; i < mobArray.length; i++) {
//			System.out.println(mobArray[i]);
//		}

		Scanner scan = new Scanner(System.in);
		System.out.println("How many mobs do you want to enter? ");
		String input = scan.nextLine();
		int newInput = Integer.parseInt(input);
		int i = 0;
		Mob[] mob = new Mob[newInput];
		while (i < mob.length) {
			System.out.println("Enter mob #" + (i + 1) + "'s name:");
			String mobName = scan.nextLine();
			System.out.println("Enter mob #" + (i + 1) + "'s biome that they can be foud:");
			String mobBiome = scan.nextLine();
			System.out.println("Enter mob #" + (i + 1) + "'s health:");
			String mobHealth = scan.nextLine();
			int newMobHealth = Integer.parseInt(mobHealth);
			System.out.println("Enter if the mob #" + (i + 1) + " is hostile:");
			String mobIsHostile = scan.nextLine();
			boolean newMobIsHostile = Boolean.parseBoolean(mobIsHostile);

			Mob newMob = new Mob();
			newMob.setName(mobName);
			newMob.setBiome(mobBiome);
			newMob.setHealth(newMobHealth);
			newMob.setHostile(newMobIsHostile);

			mob[i] = newMob;

			i++;
		}
		scan.close();

		System.out.println("Thank you for creating " + newInput + " new Mobs. Those mobs were: ");
		for (int num = 0; num < mob.length; num++) {
			if (num == mob.length - 1) {
				System.out.print(mob[num]);
			} else {
				System.out.print(mob[num] + " and ");
			}
		}

	}

}
