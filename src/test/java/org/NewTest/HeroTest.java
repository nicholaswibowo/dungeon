package org.NewTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mafagafogigante.dungeon.achievements.AchievementTracker;
import org.mafagafogigante.dungeon.date.Date;
import org.mafagafogigante.dungeon.entity.creatures.CreatureFactory;
import org.mafagafogigante.dungeon.entity.creatures.Hero;
import org.mafagafogigante.dungeon.game.Game;
import org.mafagafogigante.dungeon.game.GameState;
import org.mafagafogigante.dungeon.game.Id;
import org.mafagafogigante.dungeon.game.World;
import org.mafagafogigante.dungeon.io.Loader;
import org.mafagafogigante.dungeon.stats.Statistics;

public class HeroTest {

	private static GameState gameState;
	 
	@Test
	public void HeroCreationTest() {
		Game game = new Game();
		//game.setGameState(Loader.newGame());
		//GameState gameState = Loader.newGame();
		
		Statistics statistics = new Statistics();
		World world = new World(statistics.getWorldStatistics());
		String heroID = "HERO";
		
		CreatureFactory creatureFactory = world.getCreatureFactory();
		
		Hero hero = creatureFactory.makeHero(world.getWorldDate(), world, statistics);
		
		assertEquals("Seth", hero.getName().toString());
		assertEquals("Hero", hero.getType());
		assertEquals("HERO", hero.getId().toString());
		assertEquals(null, hero.getCauseOfDeath());
		assertEquals("CreatureHealth{integrity=50/50}", hero.getHealth().toString());
		assertEquals(4, hero.getAttack());
		assertEquals(null, hero.getWeapon());
		assertEquals("SIMPLE", hero.getAttackAlgorithmId().toString());
		hero.rest();
		hero.writeSpellList();
		//hero.printAllStatus();
		
	}

}
