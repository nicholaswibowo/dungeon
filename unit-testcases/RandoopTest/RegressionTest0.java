
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity((-1), (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }

    org.mafagafogigante.dungeon.entity.items.Item.Tag tag0 = org.mafagafogigante.dungeon.entity.items.Item.Tag.DRINKABLE;
    org.junit.Assert.assertTrue("'" + tag0 + "' != '" + org.mafagafogigante.dungeon.entity.items.Item.Tag.DRINKABLE + "'", tag0.equals(org.mafagafogigante.dungeon.entity.items.Item.Tag.DRINKABLE));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }

    org.mafagafogigante.dungeon.game.Numeral numeral0 = org.mafagafogigante.dungeon.game.Numeral.THREE;
    org.junit.Assert.assertTrue("'" + numeral0 + "' != '" + org.mafagafogigante.dungeon.game.Numeral.THREE + "'", numeral0.equals(org.mafagafogigante.dungeon.game.Numeral.THREE));

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }

    org.mafagafogigante.dungeon.util.Messenger.printInvalidNumberFormatOrValue();

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }

    org.mafagafogigante.dungeon.game.Writable writable0 = null;
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications1 = null;
    org.mafagafogigante.dungeon.io.Writer.write(writable0, writingSpecifications1);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }

    org.mafagafogigante.dungeon.achievements.Achievement achievement0 = null;
    org.mafagafogigante.dungeon.date.Date date1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.achievements.UnlockedAchievement unlockedAchievement2 = new org.mafagafogigante.dungeon.achievements.UnlockedAchievement(achievement0, date1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }

    org.mafagafogigante.dungeon.game.Direction direction1 = org.mafagafogigante.dungeon.game.Direction.fromAbbreviation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(direction1);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }

    java.lang.String[] str_array0 = new java.lang.String[] {  };
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.util.Table table1 = new org.mafagafogigante.dungeon.util.Table(str_array0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array0);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }

    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics0 = new org.mafagafogigante.dungeon.stats.BattleStatistics();
    org.mafagafogigante.dungeon.entity.creatures.Creature creature1 = null;
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath2 = null;
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay3 = null;
    // The following exception was thrown during execution in test generation
    try {
    battleStatistics0.addBattle(creature1, causeOfDeath2, partOfDay3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }

    org.mafagafogigante.dungeon.game.Numeral numeral0 = org.mafagafogigante.dungeon.game.Numeral.ONE;
    org.junit.Assert.assertTrue("'" + numeral0 + "' != '" + org.mafagafogigante.dungeon.game.Numeral.ONE + "'", numeral0.equals(org.mafagafogigante.dungeon.game.Numeral.ONE));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }

    org.mafagafogigante.dungeon.logging.DungeonLogger.fine("hi!");

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }

    org.mafagafogigante.dungeon.game.Point point0 = null;
    org.mafagafogigante.dungeon.game.Direction direction1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.game.Point point2 = new org.mafagafogigante.dungeon.game.Point(point0, direction1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }

    org.mafagafogigante.dungeon.date.Date date0 = null;
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay1 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i2 = org.mafagafogigante.dungeon.game.PartOfDay.getSecondsToNext(date0, partOfDay1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }

    org.mafagafogigante.dungeon.commands.IssuedCommand issuedCommand0 = null;
    org.mafagafogigante.dungeon.util.StopWatch stopWatch1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.game.Game.renderTurn(issuedCommand0, stopWatch1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }

    org.mafagafogigante.dungeon.achievements.comparators.UnlockedAchievementComparators unlockedAchievementComparators0 = new org.mafagafogigante.dungeon.achievements.comparators.UnlockedAchievementComparators();

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }

    org.mafagafogigante.dungeon.entity.items.CreatureInventory.SimulationResult simulationResult0 = org.mafagafogigante.dungeon.entity.items.CreatureInventory.SimulationResult.AMOUNT_LIMIT;
    org.junit.Assert.assertTrue("'" + simulationResult0 + "' != '" + org.mafagafogigante.dungeon.entity.items.CreatureInventory.SimulationResult.AMOUNT_LIMIT + "'", simulationResult0.equals(org.mafagafogigante.dungeon.entity.items.CreatureInventory.SimulationResult.AMOUNT_LIMIT));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }

    java.util.Map<org.mafagafogigante.dungeon.game.Id,org.mafagafogigante.dungeon.spells.Spell> map_id_spell0 = org.mafagafogigante.dungeon.spells.SpellData.getSpellMap();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_id_spell0);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }

    org.mafagafogigante.dungeon.gui.GameWindow gameWindow0 = org.mafagafogigante.dungeon.game.Game.getGameWindow();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(gameWindow0);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory creaturePresetFactory0 = null;
    org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] creaturePresetFactory_array1 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] { creaturePresetFactory0 };
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory2 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creaturePresetFactory_array1);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }

    org.mafagafogigante.dungeon.game.GameState gameState0 = org.mafagafogigante.dungeon.game.Game.getGameState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(gameState0);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }

    org.mafagafogigante.dungeon.game.Game game0 = new org.mafagafogigante.dungeon.game.Game();

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }

    org.mafagafogigante.dungeon.game.LocationPreset locationPreset0 = null;
    org.mafagafogigante.dungeon.game.World world1 = null;
    org.mafagafogigante.dungeon.game.Point point2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.game.Location location3 = new org.mafagafogigante.dungeon.game.Location(locationPreset0, world1, point2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }

    org.mafagafogigante.dungeon.entity.items.IntegrityState integrityState0 = org.mafagafogigante.dungeon.entity.items.IntegrityState.DAMAGED;
    java.lang.String str1 = integrityState0.toString();
    org.junit.Assert.assertTrue("'" + integrityState0 + "' != '" + org.mafagafogigante.dungeon.entity.items.IntegrityState.DAMAGED + "'", integrityState0.equals(org.mafagafogigante.dungeon.entity.items.IntegrityState.DAMAGED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Damaged"+ "'", str1.equals("Damaged"));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }

    org.mafagafogigante.dungeon.game.Random random0 = new org.mafagafogigante.dungeon.game.Random();

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }

    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array0 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria1 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array0);
    java.lang.String str2 = visibilityCriteria1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "visibilityCriteria=VisibilityCriteria{[]}"+ "'", str2.equals("visibilityCriteria=VisibilityCriteria{[]}"));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }

    // The following exception was thrown during execution in test generation
    try {
    int i2 = org.mafagafogigante.dungeon.game.Random.nextInteger((int)'a', (int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }

    org.mafagafogigante.dungeon.entity.items.IntegrityState integrityState0 = org.mafagafogigante.dungeon.entity.items.IntegrityState.PERFECT;
    org.junit.Assert.assertTrue("'" + integrityState0 + "' != '" + org.mafagafogigante.dungeon.entity.items.IntegrityState.PERFECT + "'", integrityState0.equals(org.mafagafogigante.dungeon.entity.items.IntegrityState.PERFECT));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }

    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.game.World world1 = new org.mafagafogigante.dungeon.game.World(worldStatistics0);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }

    org.mafagafogigante.dungeon.entity.items.Item.Tag tag0 = org.mafagafogigante.dungeon.entity.items.Item.Tag.FOOD;
    org.junit.Assert.assertTrue("'" + tag0 + "' != '" + org.mafagafogigante.dungeon.entity.items.Item.Tag.FOOD + "'", tag0.equals(org.mafagafogigante.dungeon.entity.items.Item.Tag.FOOD));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }

    org.mafagafogigante.dungeon.achievements.AchievementTrackerWriter achievementTrackerWriter0 = new org.mafagafogigante.dungeon.achievements.AchievementTrackerWriter();

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }

    java.lang.Throwable throwable0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.logging.DungeonLogger.logSevere(throwable0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule0 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makePercentRule();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule0);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }

    org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId attackAlgorithmId0 = org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId.ORC;
    org.junit.Assert.assertTrue("'" + attackAlgorithmId0 + "' != '" + org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId.ORC + "'", attackAlgorithmId0.equals(org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId.ORC));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule1 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeArraySizeRule((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule1);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }

    org.mafagafogigante.dungeon.commands.IssuedCommand issuedCommand0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.commands.PreparedIssuedCommand preparedIssuedCommand1 = org.mafagafogigante.dungeon.commands.IssuedCommandProcessor.prepareIssuedCommand(issuedCommand0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }

    org.mafagafogigante.dungeon.entity.items.CreatureInventory.SimulationResult simulationResult0 = org.mafagafogigante.dungeon.entity.items.CreatureInventory.SimulationResult.SUCCESSFUL;
    org.junit.Assert.assertTrue("'" + simulationResult0 + "' != '" + org.mafagafogigante.dungeon.entity.items.CreatureInventory.SimulationResult.SUCCESSFUL + "'", simulationResult0.equals(org.mafagafogigante.dungeon.entity.items.CreatureInventory.SimulationResult.SUCCESSFUL));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }

    org.mafagafogigante.dungeon.game.LocationPreset locationPreset0 = null;
    org.mafagafogigante.dungeon.game.World world1 = null;
    org.mafagafogigante.dungeon.game.Point point5 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.game.Location location6 = new org.mafagafogigante.dungeon.game.Location(locationPreset0, world1, point5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }

    org.mafagafogigante.dungeon.util.SystemInformation systemInformation0 = new org.mafagafogigante.dungeon.util.SystemInformation();
    java.lang.String str1 = systemInformation0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "User: Nicholas\nTime: 15:42:10\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 19.7 MiB out of the allocated 123.0 MiB\nOS: Windows 10 (amd64) 10.0"+ "'", str1.equals("User: Nicholas\nTime: 15:42:10\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 19.7 MiB out of the allocated 123.0 MiB\nOS: Windows 10 (amd64) 10.0"));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.io.SavesTableWriter.writeSavesFolderTable();
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }

    org.mafagafogigante.dungeon.commands.IssuedCommand issuedCommand0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.commands.IssuedCommandEvaluation issuedCommandEvaluation1 = org.mafagafogigante.dungeon.commands.IssuedCommandProcessor.evaluateIssuedCommand(issuedCommand0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }

    org.mafagafogigante.dungeon.entity.creatures.DummyAttackAlgorithm dummyAttackAlgorithm0 = new org.mafagafogigante.dungeon.entity.creatures.DummyAttackAlgorithm();
    org.mafagafogigante.dungeon.entity.creatures.Creature creature1 = null;
    org.mafagafogigante.dungeon.entity.creatures.Creature creature2 = null;
    // The following exception was thrown during execution in test generation
    try {
    dummyAttackAlgorithm0.renderAttack(creature1, creature2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }

    boolean b1 = org.mafagafogigante.dungeon.util.Percentage.isValidPercentageString("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }

    org.mafagafogigante.dungeon.io.Writer.write("User: Nicholas\nTime: 15:42:10\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 19.7 MiB out of the allocated 123.0 MiB\nOS: Windows 10 (amd64) 10.0");

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }

    org.mafagafogigante.dungeon.logging.DungeonLogger.info("");

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule0 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeIdRule();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule0);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }

    org.mafagafogigante.dungeon.game.DungeonString dungeonString1 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString1.append(str_array6);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString8 = dungeonString1.toColoredStringList();
    int i9 = dungeonString1.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 57);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }

    org.mafagafogigante.dungeon.game.DungeonString dungeonString1 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString1.append(str_array6);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.wiki.WikiSearcher.search(str_array6);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }

    org.mafagafogigante.dungeon.io.Sleeper.sleep((long)' ');

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }

    org.mafagafogigante.dungeon.game.Numeral numeral0 = org.mafagafogigante.dungeon.game.Numeral.TWO;
    org.junit.Assert.assertTrue("'" + numeral0 + "' != '" + org.mafagafogigante.dungeon.game.Numeral.TWO + "'", numeral0.equals(org.mafagafogigante.dungeon.game.Numeral.TWO));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }

    int i1 = org.mafagafogigante.dungeon.game.Random.nextInteger(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }

    org.mafagafogigante.dungeon.game.Numeral numeral1 = org.mafagafogigante.dungeon.game.Numeral.getCorrespondingNumeral((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(numeral1);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer1 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature0);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.game.Location location2 = observer1.getObserverLocation();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }

    org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId attackAlgorithmId0 = org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId.CRITTER;
    org.junit.Assert.assertTrue("'" + attackAlgorithmId0 + "' != '" + org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId.CRITTER + "'", attackAlgorithmId0.equals(org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId.CRITTER));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule0 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeStringRule();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule0);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }

    org.mafagafogigante.dungeon.stats.Statistics statistics0 = null;
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker1 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics0);
    java.util.Comparator<org.mafagafogigante.dungeon.achievements.UnlockedAchievement> comparator_unlockedAchievement2 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<org.mafagafogigante.dungeon.achievements.UnlockedAchievement> list_unlockedAchievement3 = achievementTracker1.getUnlockedAchievements(comparator_unlockedAchievement2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }

    int i1 = org.mafagafogigante.dungeon.util.DungeonMath.safeCastLongToInteger((long)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 35);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }

    org.mafagafogigante.dungeon.entity.items.IntegrityState integrityState0 = org.mafagafogigante.dungeon.entity.items.IntegrityState.SEVERELY_DAMAGED;
    org.junit.Assert.assertTrue("'" + integrityState0 + "' != '" + org.mafagafogigante.dungeon.entity.items.IntegrityState.SEVERELY_DAMAGED + "'", integrityState0.equals(org.mafagafogigante.dungeon.entity.items.IntegrityState.SEVERELY_DAMAGED));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }

    org.mafagafogigante.dungeon.util.Messenger.printMissingArgumentsMessage();

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }

    org.mafagafogigante.dungeon.entity.creatures.Hero hero0 = null;
    org.mafagafogigante.dungeon.entity.creatures.Creature creature1 = null;
    org.mafagafogigante.dungeon.game.Engine.battle(hero0, creature1);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }

    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics0 = new org.mafagafogigante.dungeon.stats.BattleStatistics();
    java.lang.String str1 = battleStatistics0.toString();
    org.mafagafogigante.dungeon.entity.creatures.Creature creature2 = null;
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath3 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery4 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    battleStatisticsQuery4.setType("Damaged");
    battleStatisticsQuery4.setType("");
    boolean b9 = causeOfDeath3.equals((java.lang.Object)battleStatisticsQuery4);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay10 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    // The following exception was thrown during execution in test generation
    try {
    battleStatistics0.addBattle(creature2, causeOfDeath3, partOfDay10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "BattleStatistics{records=CounterMap{map={}}}"+ "'", str1.equals("BattleStatistics{records=CounterMap{map={}}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    org.junit.Assert.assertTrue("'" + partOfDay10 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay10.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }

    org.mafagafogigante.dungeon.game.PartOfDay partOfDay0 = org.mafagafogigante.dungeon.game.PartOfDay.MORNING;
    org.junit.Assert.assertTrue("'" + partOfDay0 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MORNING + "'", partOfDay0.equals(org.mafagafogigante.dungeon.game.PartOfDay.MORNING));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }

    boolean b1 = org.mafagafogigante.dungeon.commands.IssuedCommand.isValidSource("Damaged");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }

    java.lang.String[] str_array2 = new java.lang.String[] { "", "" };
    org.mafagafogigante.dungeon.util.Table table3 = new org.mafagafogigante.dungeon.util.Table(str_array2);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.io.PoemWriter.parsePoemCommand(str_array2);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }

    org.mafagafogigante.dungeon.entity.creatures.HealthState healthState0 = org.mafagafogigante.dungeon.entity.creatures.HealthState.NEAR_DEATH;
    org.junit.Assert.assertTrue("'" + healthState0 + "' != '" + org.mafagafogigante.dungeon.entity.creatures.HealthState.NEAR_DEATH + "'", healthState0.equals(org.mafagafogigante.dungeon.entity.creatures.HealthState.NEAR_DEATH));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.creatures.Creature creature1 = new org.mafagafogigante.dungeon.entity.creatures.Creature(creaturePreset0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }

    java.awt.Color color1 = null;
    org.mafagafogigante.dungeon.game.ColoredString coloredString2 = new org.mafagafogigante.dungeon.game.ColoredString("", color1);
    java.awt.Color color3 = coloredString2.getColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(color3);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer1 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature0);
    // The following exception was thrown during execution in test generation
    try {
    observer1.look();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity0 = null;
    org.mafagafogigante.dungeon.entity.items.Item item1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity2 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity0, item1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table6 = new org.mafagafogigante.dungeon.util.Table(str_array5);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString7 = table6.toColoredStringList();
    java.lang.String[] str_array10 = new java.lang.String[] { "", "" };
    org.mafagafogigante.dungeon.util.Table table11 = new org.mafagafogigante.dungeon.util.Table(str_array10);
    org.mafagafogigante.dungeon.util.Table table12 = new org.mafagafogigante.dungeon.util.Table(str_array10);
    // The following exception was thrown during execution in test generation
    try {
    table6.insertRow(str_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }

    org.mafagafogigante.dungeon.game.GameState gameState0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.game.Game.setGameState(gameState0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }

    org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId attackAlgorithmId0 = org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId.SIMPLE;
    org.junit.Assert.assertTrue("'" + attackAlgorithmId0 + "' != '" + org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId.SIMPLE + "'", attackAlgorithmId0.equals(org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId.SIMPLE));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }

    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery0 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    boolean b2 = battleStatisticsQuery0.equals((java.lang.Object)0.0d);
    battleStatisticsQuery0.setType("BattleStatistics{records=CounterMap{map={}}}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }

    org.mafagafogigante.dungeon.entity.Luminosity luminosity0 = org.mafagafogigante.dungeon.entity.Luminosity.ZERO;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity0);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.util.library.AutomaticShuffledStringLibrary automaticShuffledStringLibrary1 = new org.mafagafogigante.dungeon.util.library.AutomaticShuffledStringLibrary("");
      org.junit.Assert.fail("Expected exception of type org.mafagafogigante.dungeon.io.JsonObjectFactory.IllegalFilenameExtensionException");
    } catch (org.mafagafogigante.dungeon.io.JsonObjectFactory.IllegalFilenameExtensionException e) {
      // Expected exception.
    }

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }

    org.mafagafogigante.dungeon.entity.items.CreatureInventory.SimulationResult simulationResult0 = org.mafagafogigante.dungeon.entity.items.CreatureInventory.SimulationResult.WEIGHT_LIMIT;
    org.junit.Assert.assertTrue("'" + simulationResult0 + "' != '" + org.mafagafogigante.dungeon.entity.items.CreatureInventory.SimulationResult.WEIGHT_LIMIT + "'", simulationResult0.equals(org.mafagafogigante.dungeon.entity.items.CreatureInventory.SimulationResult.WEIGHT_LIMIT));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity(35, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }

    org.mafagafogigante.dungeon.achievements.Achievement achievement0 = null;
    org.mafagafogigante.dungeon.date.Date date4 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date8 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i9 = date4.compareTo(date8);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.achievements.UnlockedAchievement unlockedAchievement10 = new org.mafagafogigante.dungeon.achievements.UnlockedAchievement(achievement0, date4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date7 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i8 = date3.compareTo(date7);
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit10 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.MILLISECOND;
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.date.Date date11 = date3.minus((-1), dungeonTimeUnit10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit10 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.MILLISECOND + "'", dungeonTimeUnit10.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.MILLISECOND));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.game.Engine.rollDateAndRefresh((int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule0 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeIntegerRule();
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule1 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeVariableArrayRule(jsonRule0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule1);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }

    java.lang.String str1 = org.mafagafogigante.dungeon.io.Converter.bytesToHuman((long)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "97 B"+ "'", str1.equals("97 B"));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }

    org.mafagafogigante.dungeon.world.WeatherCondition weatherCondition0 = org.mafagafogigante.dungeon.world.WeatherCondition.CLOUDY;
    org.mafagafogigante.dungeon.world.WeatherCondition weatherCondition1 = org.mafagafogigante.dungeon.world.WeatherCondition.CLEAR;
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.world.WeatherConditionVisibilityCriterion weatherConditionVisibilityCriterion2 = new org.mafagafogigante.dungeon.world.WeatherConditionVisibilityCriterion(weatherCondition0, weatherCondition1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + weatherCondition0 + "' != '" + org.mafagafogigante.dungeon.world.WeatherCondition.CLOUDY + "'", weatherCondition0.equals(org.mafagafogigante.dungeon.world.WeatherCondition.CLOUDY));
    org.junit.Assert.assertTrue("'" + weatherCondition1 + "' != '" + org.mafagafogigante.dungeon.world.WeatherCondition.CLEAR + "'", weatherCondition1.equals(org.mafagafogigante.dungeon.world.WeatherCondition.CLEAR));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }

    org.mafagafogigante.dungeon.game.Numeral numeral0 = org.mafagafogigante.dungeon.game.Numeral.FIVE;
    org.junit.Assert.assertTrue("'" + numeral0 + "' != '" + org.mafagafogigante.dungeon.game.Numeral.FIVE + "'", numeral0.equals(org.mafagafogigante.dungeon.game.Numeral.FIVE));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date7 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i8 = date3.compareTo(date7);
    long long9 = date7.getDay();
    long long10 = date7.getHour();
    long long11 = date7.getDay();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 10L);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }

    boolean b0 = org.mafagafogigante.dungeon.game.Random.nextBoolean();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b0 == false);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }

    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory0 = null;
    org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory corpseItemPresetFactory1 = new org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory(creatureFactory0);
    // The following exception was thrown during execution in test generation
    try {
    java.util.Collection<org.mafagafogigante.dungeon.entity.items.ItemPreset> collection_itemPreset2 = corpseItemPresetFactory1.getItemPresets();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }

    org.mafagafogigante.dungeon.game.PartOfDay partOfDay0 = org.mafagafogigante.dungeon.game.PartOfDay.DAWN;
    org.junit.Assert.assertTrue("'" + partOfDay0 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.DAWN + "'", partOfDay0.equals(org.mafagafogigante.dungeon.game.PartOfDay.DAWN));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }

    org.mafagafogigante.dungeon.entity.creatures.HealthState healthState0 = org.mafagafogigante.dungeon.entity.creatures.HealthState.INJURED;
    org.junit.Assert.assertTrue("'" + healthState0 + "' != '" + org.mafagafogigante.dungeon.entity.creatures.HealthState.INJURED + "'", healthState0.equals(org.mafagafogigante.dungeon.entity.creatures.HealthState.INJURED));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.game.GameState gameState0 = new org.mafagafogigante.dungeon.game.GameState();
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }

    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit0 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.DAY;
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit1 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.MILLISECOND;
    long long2 = dungeonTimeUnit0.as(dungeonTimeUnit1);
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit3 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.MONTH;
    // The following exception was thrown during execution in test generation
    try {
    long long4 = dungeonTimeUnit0.as(dungeonTimeUnit3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit0 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.DAY + "'", dungeonTimeUnit0.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.DAY));
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit1 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.MILLISECOND + "'", dungeonTimeUnit1.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.MILLISECOND));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 86400000L);
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit3 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.MONTH + "'", dungeonTimeUnit3.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.MONTH));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }

    org.mafagafogigante.dungeon.logging.DungeonLogger.fine("0 ms");

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }

    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics0 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    int i2 = explorationStatistics0.getKillCount(id1);
    org.mafagafogigante.dungeon.game.Id id3 = null;
    int i4 = explorationStatistics0.getKillCount(id3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }

    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array0 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria1 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array0);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature2 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer3 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature2);
    boolean b4 = visibilityCriteria1.isMetBy(observer3);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array5 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item6 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item6, item_array5);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString9 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString9.append(str_array14);
    observer3.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item6, dungeonString9);
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)dungeonString9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule0 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makePeriodRule();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule0);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.util.library.AutomaticShuffledStringLibrary automaticShuffledStringLibrary1 = new org.mafagafogigante.dungeon.util.library.AutomaticShuffledStringLibrary("Unarmed : UNARMED");
      org.junit.Assert.fail("Expected exception of type org.mafagafogigante.dungeon.io.JsonObjectFactory.IllegalFilenameExtensionException");
    } catch (org.mafagafogigante.dungeon.io.JsonObjectFactory.IllegalFilenameExtensionException e) {
      // Expected exception.
    }

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }

    org.mafagafogigante.dungeon.achievements.Achievement achievement0 = null;
    org.mafagafogigante.dungeon.date.Date date4 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date8 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i9 = date4.compareTo(date8);
    long long10 = date8.getDay();
    long long11 = date8.getHour();
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.achievements.UnlockedAchievement unlockedAchievement12 = new org.mafagafogigante.dungeon.achievements.UnlockedAchievement(achievement0, date8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }

    org.mafagafogigante.dungeon.achievements.Achievement achievement0 = null;
    org.mafagafogigante.dungeon.date.Date date4 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.achievements.UnlockedAchievement unlockedAchievement5 = new org.mafagafogigante.dungeon.achievements.UnlockedAchievement(achievement0, date4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }

    org.mafagafogigante.dungeon.game.LocationPreset locationPreset0 = null;
    org.mafagafogigante.dungeon.game.World world1 = null;
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics2 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point3 = null;
    org.mafagafogigante.dungeon.game.Id id4 = null;
    explorationStatistics2.createEntryIfNotExists(point3, id4);
    org.mafagafogigante.dungeon.game.Point point9 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id10 = null;
    explorationStatistics2.addVisit(point9, id10);
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics12 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point13 = null;
    org.mafagafogigante.dungeon.game.Id id14 = null;
    explorationStatistics12.createEntryIfNotExists(point13, id14);
    org.mafagafogigante.dungeon.game.Point point19 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id20 = null;
    explorationStatistics12.addVisit(point19, id20);
    int i22 = point19.getZ();
    org.mafagafogigante.dungeon.game.Id id23 = null;
    explorationStatistics2.createEntryIfNotExists(point19, id23);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.game.Location location25 = new org.mafagafogigante.dungeon.game.Location(locationPreset0, world1, point19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == (-1));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage5 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    itemPreset0.setHitRate(percentage5);
    double d7 = percentage5.toDouble();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 1.0d);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }

    org.mafagafogigante.dungeon.game.PartOfDay partOfDay0 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity1 = partOfDay0.getLuminosity();
    org.mafagafogigante.dungeon.world.LuminosityVisibilityCriterion luminosityVisibilityCriterion2 = new org.mafagafogigante.dungeon.world.LuminosityVisibilityCriterion(luminosity1);
    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array3 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria4 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array3);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature5 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer6 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature5);
    boolean b7 = visibilityCriteria4.isMetBy(observer6);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array8 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item9 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item9, item_array8);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString12 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array17 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString12.append(str_array17);
    observer6.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item9, dungeonString12);
    // The following exception was thrown during execution in test generation
    try {
    boolean b20 = luminosityVisibilityCriterion2.isMetBy(observer6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + partOfDay0 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay0.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }

    org.mafagafogigante.dungeon.game.Numeral numeral0 = org.mafagafogigante.dungeon.game.Numeral.FOUR;
    org.junit.Assert.assertTrue("'" + numeral0 + "' != '" + org.mafagafogigante.dungeon.game.Numeral.FOUR + "'", numeral0.equals(org.mafagafogigante.dungeon.game.Numeral.FOUR));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.game.Engine.rollDateAndRefresh(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }

    org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath typeOfCauseOfDeath0 = org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath.WEAPON;
    org.junit.Assert.assertTrue("'" + typeOfCauseOfDeath0 + "' != '" + org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath.WEAPON + "'", typeOfCauseOfDeath0.equals(org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath.WEAPON));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }

    org.mafagafogigante.dungeon.util.SystemInformation systemInformation0 = new org.mafagafogigante.dungeon.util.SystemInformation();
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString1 = systemInformation0.toColoredStringList();
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications2 = null;
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)systemInformation0, writingSpecifications2);
    java.lang.String str4 = systemInformation0.toString();
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications5 = null;
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)systemInformation0, writingSpecifications5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 41.5 MiB out of the allocated 154.5 MiB\nOS: Windows 10 (amd64) 10.0"+ "'", str4.equals("User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 41.5 MiB out of the allocated 154.5 MiB\nOS: Windows 10 (amd64) 10.0"));

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }

    org.mafagafogigante.dungeon.entity.items.LocationInventory locationInventory0 = new org.mafagafogigante.dungeon.entity.items.LocationInventory();
    org.mafagafogigante.dungeon.entity.items.Item item1 = null;
    boolean b2 = locationInventory0.hasItem(item1);
    org.mafagafogigante.dungeon.entity.items.Item item3 = null;
    // The following exception was thrown during execution in test generation
    try {
    locationInventory0.removeItem(item3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.game.Game.exit();
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table6 = new org.mafagafogigante.dungeon.util.Table(str_array5);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString7 = table6.toColoredStringList();
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications8 = null;
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)table6, writingSpecifications8);
    java.lang.String[] str_array12 = new java.lang.String[] { "", "" };
    org.mafagafogigante.dungeon.util.Table table13 = new org.mafagafogigante.dungeon.util.Table(str_array12);
    org.mafagafogigante.dungeon.util.Table table14 = new org.mafagafogigante.dungeon.util.Table(str_array12);
    // The following exception was thrown during execution in test generation
    try {
    table6.insertRow(str_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.items.IntegrityState integrityState2 = org.mafagafogigante.dungeon.entity.items.IntegrityState.getIntegrityState(32, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }

    int i2 = org.mafagafogigante.dungeon.game.Random.nextInteger((int)(short)0, (int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 81);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }

    org.mafagafogigante.dungeon.entity.items.LocationInventory locationInventory0 = new org.mafagafogigante.dungeon.entity.items.LocationInventory();
    org.mafagafogigante.dungeon.entity.items.Item item1 = null;
    // The following exception was thrown during execution in test generation
    try {
    locationInventory0.addItem(item1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }

    org.mafagafogigante.dungeon.game.PartOfDay partOfDay0 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity1 = partOfDay0.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name2 = partOfDay0.getName();
    java.lang.String str3 = name2.getSingular();
    org.junit.Assert.assertTrue("'" + partOfDay0 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay0.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Night"+ "'", str3.equals("Night"));

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }

    org.mafagafogigante.dungeon.game.DungeonString dungeonString0 = new org.mafagafogigante.dungeon.game.DungeonString();

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }

    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array0 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria1 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array0);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature2 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer3 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature2);
    boolean b4 = visibilityCriteria1.isMetBy(observer3);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array5 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item6 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item6, item_array5);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString9 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString9.append(str_array14);
    observer3.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item6, dungeonString9);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array17 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item18 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item18, item_array17);
    java.lang.String[] str_array25 = new java.lang.String[] { "CounterMap{map={}}", "User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 34.4 MiB out of the allocated 123.0 MiB\nOS: Windows 10 (amd64) 10.0", "hi!", "0 ms", "User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 41.5 MiB out of the allocated 154.5 MiB\nOS: Windows 10 (amd64) 10.0" };
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item26 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item18, str_array25);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString28 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    observer3.writeItemSight(list_item26, dungeonString28);
    java.lang.String[] str_array32 = new java.lang.String[] { "", "" };
    org.mafagafogigante.dungeon.util.Table table33 = new org.mafagafogigante.dungeon.util.Table(str_array32);
    org.mafagafogigante.dungeon.util.Table table34 = new org.mafagafogigante.dungeon.util.Table(str_array32);
    dungeonString28.append(str_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array32);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }

    org.mafagafogigante.dungeon.entity.creatures.HealthState healthState0 = org.mafagafogigante.dungeon.entity.creatures.HealthState.BADLY_INJURED;
    java.lang.String str1 = healthState0.toString();
    org.junit.Assert.assertTrue("'" + healthState0 + "' != '" + org.mafagafogigante.dungeon.entity.creatures.HealthState.BADLY_INJURED + "'", healthState0.equals(org.mafagafogigante.dungeon.entity.creatures.HealthState.BADLY_INJURED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Badly Injured"+ "'", str1.equals("Badly Injured"));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.game.Id id1 = new org.mafagafogigante.dungeon.game.Id("Badly Injured");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }

    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics0 = new org.mafagafogigante.dungeon.stats.WorldStatistics();
    int i1 = worldStatistics0.getLocationCount();
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str2 = worldStatistics0.getSpawnCounter();
    int i3 = worldStatistics0.getLocationCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }

    org.mafagafogigante.dungeon.game.DungeonString dungeonString1 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString1.append(str_array6);
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications8 = null;
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)dungeonString1, writingSpecifications8);
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)dungeonString1);
    java.lang.String[] str_array11 = null;
    // The following exception was thrown during execution in test generation
    try {
    dungeonString1.append(str_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }

    java.lang.String[] str_array0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.wiki.WikiSearcher.search(str_array0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.util.Percentage percentage1 = org.mafagafogigante.dungeon.util.Percentage.fromString("User: Nicholas\nTime: 15:42:10\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 19.7 MiB out of the allocated 123.0 MiB\nOS: Windows 10 (amd64) 10.0");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }

    org.mafagafogigante.dungeon.entity.items.LocationInventory locationInventory0 = new org.mafagafogigante.dungeon.entity.items.LocationInventory();
    org.mafagafogigante.dungeon.entity.items.Item item1 = null;
    // The following exception was thrown during execution in test generation
    try {
    locationInventory0.removeItem(item1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }

    java.awt.Color color1 = null;
    org.mafagafogigante.dungeon.game.ColoredString coloredString2 = new org.mafagafogigante.dungeon.game.ColoredString("", color1);
    java.lang.String str3 = coloredString2.getString();
    java.lang.String str4 = coloredString2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ColoredString{string='', color=null}"+ "'", str4.equals("ColoredString{string='', color=null}"));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }

    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array0 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria1 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array0);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature2 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer3 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature2);
    boolean b4 = visibilityCriteria1.isMetBy(observer3);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array5 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item6 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item6, item_array5);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString9 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    observer3.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item6, dungeonString9);
    java.awt.Color color11 = null;
    dungeonString9.setColor(color11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }

    boolean b1 = org.mafagafogigante.dungeon.game.Random.roll((double)35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }

    boolean b1 = org.mafagafogigante.dungeon.util.Percentage.isValidPercentageString("97 B");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }

    org.mafagafogigante.dungeon.world.SkyFactory skyFactory0 = new org.mafagafogigante.dungeon.world.SkyFactory();

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date7 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i8 = date3.compareTo(date7);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay9 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date3);
    java.lang.String str10 = date3.toTimeString();
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit12 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR;
    org.mafagafogigante.dungeon.date.Date date13 = date3.plus(3600, dungeonTimeUnit12);
    org.mafagafogigante.dungeon.date.Date date14 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i15 = date3.compareTo(date14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay9 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay9.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "00:00:00"+ "'", str10.equals("00:00:00"));
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit12 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR + "'", dungeonTimeUnit12.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date13);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }

    org.mafagafogigante.dungeon.game.Direction direction1 = org.mafagafogigante.dungeon.game.Direction.fromAbbreviation("CounterMap{map={}}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(direction1);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }

    org.mafagafogigante.dungeon.util.NonNegativeInteger nonNegativeInteger1 = new org.mafagafogigante.dungeon.util.NonNegativeInteger((java.lang.Integer)81);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.util.library.AutomaticShuffledStringLibrary automaticShuffledStringLibrary1 = new org.mafagafogigante.dungeon.util.library.AutomaticShuffledStringLibrary("35 kg");
      org.junit.Assert.fail("Expected exception of type org.mafagafogigante.dungeon.io.JsonObjectFactory.IllegalFilenameExtensionException");
    } catch (org.mafagafogigante.dungeon.io.JsonObjectFactory.IllegalFilenameExtensionException e) {
      // Expected exception.
    }

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule1 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeArraySizeRule((int)(byte)10);
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule2 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeOptionalRule(jsonRule1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule2);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.entity.Integrity integrity4 = itemPreset0.getIntegrity();
    itemPreset0.setDamage(0);
    org.mafagafogigante.dungeon.game.Id id7 = itemPreset0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id7);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date7 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i8 = date3.compareTo(date7);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay9 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date3);
    long long10 = date3.getYear();
    org.mafagafogigante.dungeon.date.Date date14 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date18 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i19 = date14.compareTo(date18);
    long long20 = date14.getYear();
    int i21 = date3.compareTo(date14);
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit23 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR;
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.date.Date date24 = date3.plus((int)(byte)-1, dungeonTimeUnit23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay9 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay9.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long20 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit23 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR + "'", dungeonTimeUnit23.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }

    org.mafagafogigante.dungeon.world.Sky sky0 = org.mafagafogigante.dungeon.world.SkyFactory.makeDarrowmereSky();
    java.lang.String str1 = sky0.toString();
    org.mafagafogigante.dungeon.entity.creatures.Creature creature2 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer3 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature2);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array4 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item5 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item5, item_array4);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString8 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array13 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString8.append(str_array13);
    observer3.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item5, dungeonString8);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = sky0.describeYourself(observer3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sky0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Sky{astronomicalBodies=[the Sun, a large, golden, spherical body, Mino, a small, dull white spherical body, Sario, a very small, green-tinted, perfectly spherical body]}"+ "'", str1.equals("Sky{astronomicalBodies=[the Sun, a large, golden, spherical body, Mino, a small, dull white spherical body, Sario, a very small, green-tinted, perfectly spherical body]}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }

    org.mafagafogigante.dungeon.world.WeatherCondition weatherCondition0 = org.mafagafogigante.dungeon.world.WeatherCondition.CLOUDY;
    java.lang.String str1 = weatherCondition0.toDescriptiveString();
    org.junit.Assert.assertTrue("'" + weatherCondition0 + "' != '" + org.mafagafogigante.dungeon.world.WeatherCondition.CLOUDY + "'", weatherCondition0.equals(org.mafagafogigante.dungeon.world.WeatherCondition.CLOUDY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "the sky is cloudy"+ "'", str1.equals("the sky is cloudy"));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }

    org.mafagafogigante.dungeon.commands.CommandHistory commandHistory0 = new org.mafagafogigante.dungeon.commands.CommandHistory();
    java.lang.String str2 = commandHistory0.getLastSimilarCommand("");
    org.mafagafogigante.dungeon.commands.IssuedCommand issuedCommand3 = null;
    // The following exception was thrown during execution in test generation
    try {
    commandHistory0.addCommand(issuedCommand3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }

    org.mafagafogigante.dungeon.game.MinimumBoundingRectangle minimumBoundingRectangle2 = new org.mafagafogigante.dungeon.game.MinimumBoundingRectangle(0, (int)(short)0);
    int i3 = minimumBoundingRectangle2.getHeight();
    int i4 = minimumBoundingRectangle2.getHeight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    boolean b3 = integrity2.isMaximum();
    org.mafagafogigante.dungeon.entity.items.Item item4 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity5 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity2, item4);
    // The following exception was thrown during execution in test generation
    try {
    itemIntegrity5.decrementBy((int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemIntegrity5);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }

    org.mafagafogigante.dungeon.entity.items.LocationInventory locationInventory0 = new org.mafagafogigante.dungeon.entity.items.LocationInventory();
    org.mafagafogigante.dungeon.entity.items.Item item1 = null;
    boolean b2 = locationInventory0.hasItem(item1);
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item3 = locationInventory0.getItems();
    org.mafagafogigante.dungeon.entity.items.Item item4 = null;
    // The following exception was thrown during execution in test generation
    try {
    locationInventory0.addItem(item4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item3);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }

    org.mafagafogigante.dungeon.logging.DungeonLogger.info("CreatureHealth{integrity=100/100}");

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.date.Duration duration1 = org.mafagafogigante.dungeon.date.DungeonTimeParser.parsePeriod("0/1");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }

    org.mafagafogigante.dungeon.entity.items.FoodComponent foodComponent2 = new org.mafagafogigante.dungeon.entity.items.FoodComponent((int)(short)1, (int)(byte)10);
    int i3 = foodComponent2.getNutrition();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }

    org.mafagafogigante.dungeon.logging.DungeonLogger.info("0/1");

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.util.Percentage percentage1 = org.mafagafogigante.dungeon.util.Percentage.fromString("Nights");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }

    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array0 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria1 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array0);
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria2 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array0);
    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array3 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria4 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array3);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature5 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer6 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature5);
    boolean b7 = visibilityCriteria4.isMetBy(observer6);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array8 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item9 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item9, item_array8);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString12 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array17 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString12.append(str_array17);
    observer6.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item9, dungeonString12);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array20 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item21 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item21, item_array20);
    java.lang.String[] str_array28 = new java.lang.String[] { "CounterMap{map={}}", "User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 34.4 MiB out of the allocated 123.0 MiB\nOS: Windows 10 (amd64) 10.0", "hi!", "0 ms", "User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 41.5 MiB out of the allocated 154.5 MiB\nOS: Windows 10 (amd64) 10.0" };
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item29 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item21, str_array28);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString31 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    observer6.writeItemSight(list_item29, dungeonString31);
    boolean b33 = visibilityCriteria2.isMetBy(observer6);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.game.Location location34 = observer6.getObserverLocation();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }

    org.mafagafogigante.dungeon.game.PartOfDay partOfDay0 = org.mafagafogigante.dungeon.game.PartOfDay.EVENING;
    java.lang.String str1 = partOfDay0.toString();
    org.junit.Assert.assertTrue("'" + partOfDay0 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.EVENING + "'", partOfDay0.equals(org.mafagafogigante.dungeon.game.PartOfDay.EVENING));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Evening"+ "'", str1.equals("Evening"));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, (-1), 0.0d);
    org.mafagafogigante.dungeon.entity.Weight weight4 = creatureInventory3.getWeight();
    org.mafagafogigante.dungeon.entity.items.Item item5 = null;
    // The following exception was thrown during execution in test generation
    try {
    creatureInventory3.removeItem(item5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight4);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }

    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery0 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement2 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement(battleStatisticsQuery0, (int)(byte)100);
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery3 = battleStatisticsRequirement2.getQuery();
    java.lang.String str4 = battleStatisticsQuery3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(battleStatisticsQuery3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "BattleStatisticsQuery{id=null, type='null', causeOfDeath=null, partOfDay=null}"+ "'", str4.equals("BattleStatisticsQuery{id=null, type='null', causeOfDeath=null, partOfDay=null}"));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }

    org.mafagafogigante.dungeon.stats.Statistics statistics0 = new org.mafagafogigante.dungeon.stats.Statistics();
    statistics0.writeStatistics();
    statistics0.writeStatistics();
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker3 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics0);
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker4 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics0);
    org.mafagafogigante.dungeon.achievements.Achievement achievement5 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = achievementTracker4.hasNotBeenUnlocked(achievement5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }

    // The following exception was thrown during execution in test generation
    try {
    int i1 = org.mafagafogigante.dungeon.game.Random.nextInteger((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }

    org.mafagafogigante.dungeon.game.Game.unsetGameState();

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }

    org.mafagafogigante.dungeon.util.Messenger.printFailedToCreateDirectoryMessage("CounterMap{map={}}");

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }

    boolean b1 = org.mafagafogigante.dungeon.commands.IssuedCommand.isValidSource("BattleStatisticsQuery{id=null, type='null', causeOfDeath=null, partOfDay=null}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }

    org.mafagafogigante.dungeon.util.Percentage percentage1 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b3 = percentage1.equals((java.lang.Object)10.0d);
    double d4 = percentage1.toDouble();
    java.lang.String str5 = percentage1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100.00%"+ "'", str5.equals("100.00%"));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }

    org.mafagafogigante.dungeon.game.Id id0 = null;
    org.mafagafogigante.dungeon.entity.items.BookComponent bookComponent2 = new org.mafagafogigante.dungeon.entity.items.BookComponent(id0, "CreatureHealth{integrity=100/100}");
    java.lang.String str3 = bookComponent2.getText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "CreatureHealth{integrity=100/100}"+ "'", str3.equals("CreatureHealth{integrity=100/100}"));

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }

    org.mafagafogigante.dungeon.entity.creatures.Hero hero0 = null;
    org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster heroSpellcaster1 = new org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster(hero0);
    org.mafagafogigante.dungeon.spells.Spell spell2 = null;
    // The following exception was thrown during execution in test generation
    try {
    heroSpellcaster1.learnSpell(spell2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }

    org.mafagafogigante.dungeon.game.DungeonString dungeonString1 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString1.append(str_array6);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString8 = dungeonString1.toColoredStringList();
    dungeonString1.resetColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString8);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, (-1), 0.0d);
    org.mafagafogigante.dungeon.entity.items.Item item4 = null;
    // The following exception was thrown during execution in test generation
    try {
    creatureInventory3.removeItem(item4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }

    org.mafagafogigante.dungeon.util.Messenger.printFailedToCreateDirectoryMessage("East");

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }

    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics0 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point1 = null;
    org.mafagafogigante.dungeon.game.Id id2 = null;
    explorationStatistics0.createEntryIfNotExists(point1, id2);
    org.mafagafogigante.dungeon.game.Id id4 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i5 = explorationStatistics0.getMaximumNumberOfVisits(id4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }

    org.mafagafogigante.dungeon.entity.items.FoodComponent foodComponent2 = new org.mafagafogigante.dungeon.entity.items.FoodComponent((int)(byte)1, (int)(byte)-1);
    int i3 = foodComponent2.getIntegrityDecrementOnEat();
    int i4 = foodComponent2.getNutrition();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }

    org.mafagafogigante.dungeon.util.Messenger.printFailedToCreateDirectoryMessage("Unarmed");

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date((long)'a', (long)1, (long)81);
    org.mafagafogigante.dungeon.world.Weather weather4 = new org.mafagafogigante.dungeon.world.Weather(date3);
    org.mafagafogigante.dungeon.date.Date date8 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date12 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i13 = date8.compareTo(date12);
    long long14 = date12.getDay();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay15 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    int i16 = org.mafagafogigante.dungeon.game.PartOfDay.getSecondsToNext(date12, partOfDay15);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.world.WeatherCondition weatherCondition17 = weather4.getCurrentCondition(date12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 10L);
    org.junit.Assert.assertTrue("'" + partOfDay15 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay15.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3600);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }

    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array0 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria1 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array0);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature2 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer3 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature2);
    boolean b4 = visibilityCriteria1.isMetBy(observer3);
    // The following exception was thrown during execution in test generation
    try {
    observer3.look();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications2 = new org.mafagafogigante.dungeon.gui.WritingSpecifications(false, (int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, (-1), 0.0d);
    org.mafagafogigante.dungeon.entity.items.Item item4 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.items.CreatureInventory.SimulationResult simulationResult5 = creatureInventory3.simulateItemAddition(item4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    itemPreset0.setIntegrityDecrementOnEat((-1));
    org.mafagafogigante.dungeon.entity.Weight weight4 = itemPreset0.getWeight();
    itemPreset0.setDrinkableHealing((int)(byte)1);
    int i7 = itemPreset0.getDamage();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset8 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity9 = itemPreset8.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity10 = null;
    itemPreset8.setIntegrity(integrity10);
    org.mafagafogigante.dungeon.util.Percentage percentage12 = itemPreset8.getVisibility();
    java.lang.String str13 = itemPreset8.getType();
    org.mafagafogigante.dungeon.entity.items.Item.Tag tag14 = org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE;
    itemPreset8.addTag(tag14);
    itemPreset0.addTag(tag14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    org.junit.Assert.assertTrue("'" + tag14 + "' != '" + org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE + "'", tag14.equals(org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE));

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule1 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeArraySizeRule((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule1);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }

    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics0 = new org.mafagafogigante.dungeon.stats.BattleStatistics();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement1 = null;
    boolean b2 = battleStatistics0.satisfies(battleStatisticsRequirement1);
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery3 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement5 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement(battleStatisticsQuery3, (int)(byte)100);
    boolean b6 = battleStatistics0.satisfies(battleStatisticsRequirement5);
    java.lang.String str7 = battleStatisticsRequirement5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "BattleStatisticsRequirement{query=BattleStatisticsQuery{id=null, type='null', causeOfDeath=null, partOfDay=null}, count=100}"+ "'", str7.equals("BattleStatisticsRequirement{query=BattleStatisticsQuery{id=null, type='null', causeOfDeath=null, partOfDay=null}, count=100}"));

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table6 = new org.mafagafogigante.dungeon.util.Table(str_array5);
    org.mafagafogigante.dungeon.util.Table table7 = new org.mafagafogigante.dungeon.util.Table(str_array5);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.io.PoemWriter.parsePoemCommand(str_array5);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }

    boolean b1 = org.mafagafogigante.dungeon.util.Percentage.isValidPercentageString("visibilityCriteria=VisibilityCriteria{[]}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }

    org.mafagafogigante.dungeon.entity.items.LocationInventory locationInventory0 = new org.mafagafogigante.dungeon.entity.items.LocationInventory();
    org.mafagafogigante.dungeon.entity.items.Item item1 = null;
    boolean b2 = locationInventory0.hasItem(item1);
    org.mafagafogigante.dungeon.entity.items.Item item3 = null;
    // The following exception was thrown during execution in test generation
    try {
    locationInventory0.addItem(item3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule1 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeArraySizeRule(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule1);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    java.lang.String str5 = itemPreset0.getType();
    itemPreset0.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.entity.TagSet<org.mafagafogigante.dungeon.entity.items.Item.Tag> tagset_tag8 = itemPreset0.getTagSet();
    org.mafagafogigante.dungeon.entity.Weight weight10 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    itemPreset0.setWeight(weight10);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset12 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity13 = itemPreset12.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity14 = null;
    itemPreset12.setIntegrity(integrity14);
    org.mafagafogigante.dungeon.util.Percentage percentage17 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    itemPreset12.setHitRate(percentage17);
    itemPreset0.setHitRate(percentage17);
    int i20 = itemPreset0.getIntegrityDecrementOnEat();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tagset_tag8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    itemPreset0.setDrinkableHealing((int)(short)0);
    org.mafagafogigante.dungeon.game.Id id3 = null;
    itemPreset0.setId(id3);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }

    org.mafagafogigante.dungeon.commands.CommandDescription commandDescription2 = new org.mafagafogigante.dungeon.commands.CommandDescription("00:00:00", "the sky is cloudy");
    java.lang.String str3 = commandDescription2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "00:00:00 : the sky is cloudy"+ "'", str3.equals("00:00:00 : the sky is cloudy"));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    java.lang.String str5 = itemPreset0.getType();
    itemPreset0.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.entity.TagSet<org.mafagafogigante.dungeon.entity.items.Item.Tag> tagset_tag8 = itemPreset0.getTagSet();
    org.mafagafogigante.dungeon.entity.Weight weight10 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    itemPreset0.setWeight(weight10);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset12 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity13 = itemPreset12.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity14 = null;
    itemPreset12.setIntegrity(integrity14);
    org.mafagafogigante.dungeon.util.Percentage percentage17 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    itemPreset12.setHitRate(percentage17);
    itemPreset0.setHitRate(percentage17);
    itemPreset0.setUnique(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tagset_tag8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity13);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date7 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i8 = date3.compareTo(date7);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay9 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date3);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay10 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date3);
    long long11 = date3.getHour();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay9 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay9.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    org.junit.Assert.assertTrue("'" + partOfDay10 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay10.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule2 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeBoundDoubleRule((double)(byte)100, (double)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule2);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }

    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array0 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria1 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array0);
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria2 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array0);
    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array3 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria4 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array3);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature5 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer6 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature5);
    boolean b7 = visibilityCriteria4.isMetBy(observer6);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array8 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item9 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item9, item_array8);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString12 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array17 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString12.append(str_array17);
    observer6.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item9, dungeonString12);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array20 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item21 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item21, item_array20);
    java.lang.String[] str_array28 = new java.lang.String[] { "CounterMap{map={}}", "User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 34.4 MiB out of the allocated 123.0 MiB\nOS: Windows 10 (amd64) 10.0", "hi!", "0 ms", "User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 41.5 MiB out of the allocated 154.5 MiB\nOS: Windows 10 (amd64) 10.0" };
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item29 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item21, str_array28);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString31 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    observer6.writeItemSight(list_item29, dungeonString31);
    boolean b33 = visibilityCriteria2.isMetBy(observer6);
    // The following exception was thrown during execution in test generation
    try {
    observer6.look();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }

    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications2 = new org.mafagafogigante.dungeon.gui.WritingSpecifications(false, (int)(byte)10);
    boolean b3 = writingSpecifications2.shouldWait();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }

    org.mafagafogigante.dungeon.io.Sleeper.sleep((long)81);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.date.Duration duration1 = org.mafagafogigante.dungeon.date.DungeonTimeParser.parsePeriod("");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }

    java.lang.String[] str_array3 = new java.lang.String[] { "Damaged", "visibilityCriteria=VisibilityCriteria{[]}", "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str4 = new java.util.ArrayList<java.lang.String>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str4, str_array3);
    org.mafagafogigante.dungeon.io.Split split6 = org.mafagafogigante.dungeon.io.Split.splitOnOn((java.util.List<java.lang.String>)arraylist_str4);
    java.util.List<java.lang.String> list_str7 = split6.getAfter();
    org.mafagafogigante.dungeon.io.Split split8 = org.mafagafogigante.dungeon.io.Split.splitOnOn(list_str7);
    org.mafagafogigante.dungeon.io.Split split9 = org.mafagafogigante.dungeon.io.Split.splitOnOn(list_str7);
    org.mafagafogigante.dungeon.io.Split split10 = org.mafagafogigante.dungeon.io.Split.splitOnOn(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(split6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(split8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(split9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(split10);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }

    org.mafagafogigante.dungeon.stats.Statistics statistics0 = new org.mafagafogigante.dungeon.stats.Statistics();
    statistics0.writeStatistics();
    statistics0.writeStatistics();
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker3 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics0);
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker4 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics0);
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker5 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics0);
    java.util.Comparator<org.mafagafogigante.dungeon.achievements.UnlockedAchievement> comparator_unlockedAchievement6 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<org.mafagafogigante.dungeon.achievements.UnlockedAchievement> list_unlockedAchievement7 = achievementTracker5.getUnlockedAchievements(comparator_unlockedAchievement6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, (-1), 0.0d);
    org.mafagafogigante.dungeon.entity.Weight weight4 = creatureInventory3.getWeight();
    int i5 = creatureInventory3.getItemCount();
    int i6 = creatureInventory3.getItemCount();
    org.mafagafogigante.dungeon.entity.items.Item item7 = null;
    // The following exception was thrown during execution in test generation
    try {
    creatureInventory3.removeItem(item7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }

    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics0 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics1 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point2 = null;
    org.mafagafogigante.dungeon.game.Id id3 = null;
    explorationStatistics1.createEntryIfNotExists(point2, id3);
    org.mafagafogigante.dungeon.game.Point point8 = new org.mafagafogigante.dungeon.game.Point(100, 10, (int)(byte)10);
    org.mafagafogigante.dungeon.game.Id id9 = null;
    explorationStatistics1.addVisit(point8, id9);
    java.lang.String str11 = point8.toString();
    // The following exception was thrown during execution in test generation
    try {
    explorationStatistics0.addKill(point8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{100, 10, 10}"+ "'", str11.equals("{100, 10, 10}"));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }

    org.mafagafogigante.dungeon.stats.Statistics statistics0 = new org.mafagafogigante.dungeon.stats.Statistics();
    statistics0.writeStatistics();
    statistics0.writeStatistics();
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker3 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics0);
    int i4 = achievementTracker3.getUnlockedCount();
    org.mafagafogigante.dungeon.achievements.AchievementStore achievementStore5 = null;
    org.mafagafogigante.dungeon.date.Date date9 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    // The following exception was thrown during execution in test generation
    try {
    achievementTracker3.update(achievementStore5, date9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }

    org.mafagafogigante.dungeon.game.Id id0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.game.Id id1 = org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory.makeCorpseIdFromCreatureId(id0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }

    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances0 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.Direction direction1 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b2 = blockedEntrances0.isBlocked(direction1);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances3 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.Direction direction4 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b5 = blockedEntrances3.isBlocked(direction4);
    boolean b6 = blockedEntrances0.isBlocked(direction4);
    boolean b8 = direction4.equalsIgnoreCase("Unarmed : UNARMED");
    org.junit.Assert.assertTrue("'" + direction1 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction1.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + direction4 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction4.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }

    boolean b1 = org.mafagafogigante.dungeon.commands.IssuedCommand.isValidSource("visibilityCriteria=VisibilityCriteria{[]}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }

    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications2 = new org.mafagafogigante.dungeon.gui.WritingSpecifications(false, (int)(byte)10);
    int i3 = writingSpecifications2.getWait();
    boolean b4 = writingSpecifications2.shouldWait();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    boolean b3 = integrity2.isMaximum();
    org.mafagafogigante.dungeon.entity.items.Item item4 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity5 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity2, item4);
    org.mafagafogigante.dungeon.util.Percentage percentage6 = itemIntegrity5.toPercentage();
    // The following exception was thrown during execution in test generation
    try {
    itemIntegrity5.decrementBy(32);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemIntegrity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage6);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }

    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array0 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria1 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array0);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature2 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer3 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature2);
    boolean b4 = visibilityCriteria1.isMetBy(observer3);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array5 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item6 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item6, item_array5);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString9 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    observer3.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item6, dungeonString9);
    // The following exception was thrown during execution in test generation
    try {
    observer3.look();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    java.lang.String str5 = itemPreset0.getType();
    itemPreset0.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage9 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset0.setVisibility(percentage9);
    org.mafagafogigante.dungeon.game.Id id11 = null;
    itemPreset0.setId(id11);
    itemPreset0.setPutrefactionPeriod((long)(short)1);
    org.mafagafogigante.dungeon.entity.items.Item.Tag tag15 = org.mafagafogigante.dungeon.entity.items.Item.Tag.DECOMPOSES;
    boolean b16 = itemPreset0.hasTag(tag15);
    itemPreset0.setDamage((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    org.junit.Assert.assertTrue("'" + tag15 + "' != '" + org.mafagafogigante.dungeon.entity.items.Item.Tag.DECOMPOSES + "'", tag15.equals(org.mafagafogigante.dungeon.entity.items.Item.Tag.DECOMPOSES));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.game.Id id1 = new org.mafagafogigante.dungeon.game.Id("100.00%");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }

    org.mafagafogigante.dungeon.commands.CommandHistory commandHistory0 = new org.mafagafogigante.dungeon.commands.CommandHistory();
    java.lang.String str2 = commandHistory0.getLastSimilarCommand("");
    java.lang.String str4 = commandHistory0.getLastSimilarCommand("Unarmed : UNARMED");
    java.lang.String str6 = commandHistory0.getLastSimilarCommand("the sky is cloudy");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }

    org.mafagafogigante.dungeon.entity.items.Item[] item_array0 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item1 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item1, item_array0);
    java.lang.String[] str_array8 = new java.lang.String[] { "CounterMap{map={}}", "User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 34.4 MiB out of the allocated 123.0 MiB\nOS: Windows 10 (amd64) 10.0", "hi!", "0 ms", "User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 41.5 MiB out of the allocated 154.5 MiB\nOS: Windows 10 (amd64) 10.0" };
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item9 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item1, str_array8);
    java.lang.String[] str_array15 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table16 = new org.mafagafogigante.dungeon.util.Table(str_array15);
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item17 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems(list_item9, str_array15);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.io.PoemWriter.parsePoemCommand(str_array15);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item17);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }

    // The following exception was thrown during execution in test generation
    try {
    int i2 = org.mafagafogigante.dungeon.game.Random.nextInteger(1, (int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }

    org.mafagafogigante.dungeon.util.Percentage percentage1 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b3 = percentage1.equals((java.lang.Object)10.0d);
    double d4 = percentage1.toDouble();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity5 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage1);
    java.lang.String str6 = luminosity5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Luminosity of 100.00%"+ "'", str6.equals("Luminosity of 100.00%"));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }

    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances0 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    java.lang.String str1 = blockedEntrances0.toString();
    java.lang.String str2 = blockedEntrances0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "None"+ "'", str1.equals("None"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "None"+ "'", str2.equals("None"));

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }

    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery0 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    battleStatisticsQuery0.setType("Damaged");
    battleStatisticsQuery0.setType("hi!");
    java.lang.String str5 = battleStatisticsQuery0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "BattleStatisticsQuery{id=null, type='hi!', causeOfDeath=null, partOfDay=null}"+ "'", str5.equals("BattleStatisticsQuery{id=null, type='hi!', causeOfDeath=null, partOfDay=null}"));

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }

    org.mafagafogigante.dungeon.logging.DungeonLogger.fine("CreatureHealth{integrity=100/100}");

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }

    org.mafagafogigante.dungeon.util.Messenger.printAmbiguousSelectionMessage();

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }

    org.mafagafogigante.dungeon.entity.items.FoodComponent foodComponent2 = new org.mafagafogigante.dungeon.entity.items.FoodComponent((int)(short)100, 35);
    int i3 = foodComponent2.getNutrition();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    itemPreset0.setIntegrityDecrementOnEat((-1));
    org.mafagafogigante.dungeon.entity.Weight weight4 = itemPreset0.getWeight();
    itemPreset0.setDrinkableHealing((int)(byte)1);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset7 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity8 = itemPreset7.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity9 = null;
    itemPreset7.setIntegrity(integrity9);
    org.mafagafogigante.dungeon.util.Percentage percentage11 = itemPreset7.getVisibility();
    java.lang.String str12 = itemPreset7.getType();
    itemPreset7.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage16 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset7.setVisibility(percentage16);
    itemPreset0.setVisibility(percentage16);
    org.mafagafogigante.dungeon.entity.items.Item.Tag tag19 = org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE;
    boolean b20 = itemPreset0.hasTag(tag19);
    // The following exception was thrown during execution in test generation
    try {
    itemPreset0.setSpellId("{32, 0, -1}");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    org.junit.Assert.assertTrue("'" + tag19 + "' != '" + org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE + "'", tag19.equals(org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }

    int i2 = org.mafagafogigante.dungeon.game.Random.nextInteger((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }

    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics0 = new org.mafagafogigante.dungeon.stats.WorldStatistics();
    int i1 = worldStatistics0.getLocationCount();
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str2 = worldStatistics0.getSpawnCounter();
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str3 = worldStatistics0.getSpawnCounter();
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.game.World world4 = new org.mafagafogigante.dungeon.game.World(worldStatistics0);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str3);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }

    java.lang.String[] str_array3 = new java.lang.String[] { "Damaged", "visibilityCriteria=VisibilityCriteria{[]}", "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str4 = new java.util.ArrayList<java.lang.String>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str4, str_array3);
    org.mafagafogigante.dungeon.io.Split split6 = org.mafagafogigante.dungeon.io.Split.splitOnOn((java.util.List<java.lang.String>)arraylist_str4);
    org.mafagafogigante.dungeon.io.Split split7 = org.mafagafogigante.dungeon.io.Split.splitOnOn((java.util.List<java.lang.String>)arraylist_str4);
    java.util.List<java.lang.String> list_str8 = split7.getAfter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(split6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(split7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    java.lang.String str5 = itemPreset0.getType();
    itemPreset0.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage9 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset0.setVisibility(percentage9);
    org.mafagafogigante.dungeon.game.Id id11 = null;
    itemPreset0.setId(id11);
    itemPreset0.setPutrefactionPeriod((long)(short)1);
    int i15 = itemPreset0.getDrinkableHealing();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay16 = org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT;
    org.mafagafogigante.dungeon.game.Name name17 = partOfDay16.getName();
    itemPreset0.setName(name17);
    itemPreset0.setPutrefactionPeriod((long)81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay16 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay16.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name17);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }

    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics0 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point1 = null;
    org.mafagafogigante.dungeon.game.Id id2 = null;
    explorationStatistics0.createEntryIfNotExists(point1, id2);
    org.mafagafogigante.dungeon.game.Point point7 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id8 = null;
    explorationStatistics0.addVisit(point7, id8);
    org.mafagafogigante.dungeon.game.Id id10 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i11 = explorationStatistics0.getMaximumNumberOfVisits(id10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.game.Id id1 = new org.mafagafogigante.dungeon.game.Id("Unarmed");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.util.Percentage percentage2 = itemPreset0.getVisibility();
    java.lang.String str3 = itemPreset0.getType();
    itemPreset0.setDrinkableHealing(10);
    itemPreset0.setIntegrityDecrementPerDose(57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }

    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances0 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.Direction direction1 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b2 = blockedEntrances0.isBlocked(direction1);
    boolean b4 = direction1.equalsIgnoreCase("");
    java.lang.String str5 = direction1.toString();
    boolean b7 = direction1.equalsIgnoreCase("Unarmed");
    org.junit.Assert.assertTrue("'" + direction1 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction1.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "East"+ "'", str5.equals("East"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.items.IntegrityState integrityState2 = org.mafagafogigante.dungeon.entity.items.IntegrityState.getIntegrityState(0, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }

    org.mafagafogigante.dungeon.entity.items.ItemUsageEffect itemUsageEffect1 = new org.mafagafogigante.dungeon.entity.items.ItemUsageEffect((int)'#');

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }

    java.util.Map<java.lang.String,java.util.Comparator<org.mafagafogigante.dungeon.achievements.UnlockedAchievement>> map_str_comparator_unlockedAchievement0 = org.mafagafogigante.dungeon.achievements.comparators.UnlockedAchievementComparators.getComparatorMap();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_comparator_unlockedAchievement0);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }

    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances0 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.Direction direction1 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b3 = direction1.equalsIgnoreCase("");
    blockedEntrances0.block(direction1);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances5 = new org.mafagafogigante.dungeon.game.BlockedEntrances(blockedEntrances0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str6 = blockedEntrances5.toString();
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + direction1 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction1.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }

    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics0 = new org.mafagafogigante.dungeon.stats.BattleStatistics();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement1 = null;
    boolean b2 = battleStatistics0.satisfies(battleStatisticsRequirement1);
    java.lang.String str3 = battleStatistics0.toString();
    org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.CauseOfDeath> countermap_causeOfDeath4 = battleStatistics0.getKillsByCauseOfDeath();
    org.mafagafogigante.dungeon.entity.creatures.Creature creature5 = null;
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath6 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    org.mafagafogigante.dungeon.entity.creatures.HealthState healthState7 = org.mafagafogigante.dungeon.entity.creatures.HealthState.DEAD;
    boolean b8 = causeOfDeath6.equals((java.lang.Object)healthState7);
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery9 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath10 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    battleStatisticsQuery9.setCauseOfDeath(causeOfDeath10);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay12 = org.mafagafogigante.dungeon.game.PartOfDay.AFTERNOON;
    java.lang.String str13 = partOfDay12.toString();
    boolean b14 = causeOfDeath10.equals((java.lang.Object)partOfDay12);
    // The following exception was thrown during execution in test generation
    try {
    battleStatistics0.addBattle(creature5, causeOfDeath6, partOfDay12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "BattleStatistics{records=CounterMap{map={}}}"+ "'", str3.equals("BattleStatistics{records=CounterMap{map={}}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_causeOfDeath4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath6);
    org.junit.Assert.assertTrue("'" + healthState7 + "' != '" + org.mafagafogigante.dungeon.entity.creatures.HealthState.DEAD + "'", healthState7.equals(org.mafagafogigante.dungeon.entity.creatures.HealthState.DEAD));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath10);
    org.junit.Assert.assertTrue("'" + partOfDay12 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.AFTERNOON + "'", partOfDay12.equals(org.mafagafogigante.dungeon.game.PartOfDay.AFTERNOON));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Afternoon"+ "'", str13.equals("Afternoon"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule1 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeStringLengthRule((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule1);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }

    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array0 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria1 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array0);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature2 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer3 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature2);
    boolean b4 = visibilityCriteria1.isMetBy(observer3);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array5 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item6 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item6, item_array5);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString9 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString9.append(str_array14);
    observer3.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item6, dungeonString9);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.game.Location location17 = observer3.getObserverLocation();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }

    int i1 = org.mafagafogigante.dungeon.game.Random.nextInteger((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 38);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule2 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeBoundIntegerRule(35, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule2);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset3 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    itemPreset3.setDrinkableHealing((int)(short)0);
    org.mafagafogigante.dungeon.util.Percentage percentage7 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset3.setVisibility(percentage7);
    double d9 = org.mafagafogigante.dungeon.util.DungeonMath.weightedAverage((double)10.0f, 100.0d, percentage7);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset10 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity11 = itemPreset10.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity12 = null;
    itemPreset10.setIntegrity(integrity12);
    org.mafagafogigante.dungeon.util.Percentage percentage14 = itemPreset10.getVisibility();
    java.lang.String str15 = itemPreset10.getType();
    org.mafagafogigante.dungeon.entity.items.Item.Tag tag16 = org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE;
    itemPreset10.addTag(tag16);
    org.mafagafogigante.dungeon.util.Percentage percentage19 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b21 = percentage19.equals((java.lang.Object)10.0d);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity22 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage19);
    itemPreset10.setVisibility(percentage19);
    boolean b24 = percentage7.biggerThanOrEqualTo(percentage19);
    org.mafagafogigante.dungeon.entity.items.WeaponComponent weaponComponent26 = new org.mafagafogigante.dungeon.entity.items.WeaponComponent((int)(short)10, percentage19, 1);
    org.mafagafogigante.dungeon.util.Percentage percentage27 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.util.Percentage percentage28 = percentage19.multiply(percentage27);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    org.junit.Assert.assertTrue("'" + tag16 + "' != '" + org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE + "'", tag16.equals(org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, (-1), 0.0d);
    org.mafagafogigante.dungeon.entity.Weight weight4 = creatureInventory3.getWeight();
    int i5 = creatureInventory3.getItemCount();
    org.mafagafogigante.dungeon.entity.items.Item item6 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.items.CreatureInventory.SimulationResult simulationResult7 = creatureInventory3.simulateItemAddition(item6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule2 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeBoundIntegerRule(0, 82800);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule2);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }

    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery0 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement2 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement(battleStatisticsQuery0, (int)(byte)100);
    battleStatisticsQuery0.setType("None");

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }

    boolean b1 = org.mafagafogigante.dungeon.util.Percentage.isValidPercentageString("Noon");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.entity.Integrity integrity4 = itemPreset0.getIntegrity();
    itemPreset0.setPutrefactionPeriod((long)(byte)0);
    itemPreset0.setIntegrityDecrementOnEat((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity4);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }

    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory0 = null;
    org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory corpseItemPresetFactory1 = new org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory(creatureFactory0);
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory2 = null;
    org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory corpseItemPresetFactory3 = new org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory(creatureFactory2);
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory4 = null;
    org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory corpseItemPresetFactory5 = new org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory(creatureFactory4);
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory6 = null;
    org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory corpseItemPresetFactory7 = new org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory(creatureFactory6);
    org.mafagafogigante.dungeon.entity.items.ItemPresetFactory[] itemPresetFactory_array8 = new org.mafagafogigante.dungeon.entity.items.ItemPresetFactory[] { corpseItemPresetFactory1, corpseItemPresetFactory3, corpseItemPresetFactory5, corpseItemPresetFactory7 };
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.items.ItemFactory itemFactory9 = new org.mafagafogigante.dungeon.entity.items.ItemFactory(itemPresetFactory_array8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemPresetFactory_array8);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }

    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory0 = null;
    org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory corpseItemPresetFactory1 = new org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory(creatureFactory0);
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory2 = null;
    org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory corpseItemPresetFactory3 = new org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory(creatureFactory2);
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory4 = null;
    org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory corpseItemPresetFactory5 = new org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory(creatureFactory4);
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory6 = null;
    org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory corpseItemPresetFactory7 = new org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory(creatureFactory6);
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory8 = null;
    org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory corpseItemPresetFactory9 = new org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory(creatureFactory8);
    org.mafagafogigante.dungeon.entity.items.ItemPresetFactory[] itemPresetFactory_array10 = new org.mafagafogigante.dungeon.entity.items.ItemPresetFactory[] { corpseItemPresetFactory1, corpseItemPresetFactory3, corpseItemPresetFactory5, corpseItemPresetFactory7, corpseItemPresetFactory9 };
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.items.ItemFactory itemFactory11 = new org.mafagafogigante.dungeon.entity.items.ItemFactory(itemPresetFactory_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemPresetFactory_array10);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    itemPreset0.setIntegrityDecrementOnEat((-1));
    org.mafagafogigante.dungeon.entity.Weight weight4 = itemPreset0.getWeight();
    itemPreset0.setDrinkableHealing((int)(byte)1);
    int i7 = itemPreset0.getDamage();
    itemPreset0.setDrinkableDoses(97);
    int i10 = itemPreset0.getIntegrityDecrementOnHit();
    itemPreset0.setDamage((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    java.lang.String str5 = itemPreset0.getType();
    itemPreset0.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.entity.TagSet<org.mafagafogigante.dungeon.entity.items.Item.Tag> tagset_tag8 = itemPreset0.getTagSet();
    org.mafagafogigante.dungeon.entity.items.Item.Tag tag9 = org.mafagafogigante.dungeon.entity.items.Item.Tag.WEIGHT_PROPORTIONAL_TO_INTEGRITY;
    itemPreset0.addTag(tag9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tagset_tag8);
    org.junit.Assert.assertTrue("'" + tag9 + "' != '" + org.mafagafogigante.dungeon.entity.items.Item.Tag.WEIGHT_PROPORTIONAL_TO_INTEGRITY + "'", tag9.equals(org.mafagafogigante.dungeon.entity.items.Item.Tag.WEIGHT_PROPORTIONAL_TO_INTEGRITY));

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }

    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics0 = new org.mafagafogigante.dungeon.stats.WorldStatistics();
    int i1 = worldStatistics0.getLocationCount();
    int i2 = worldStatistics0.getLocationCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.creatures.Creature creature3 = new org.mafagafogigante.dungeon.entity.creatures.Creature(creaturePreset0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date7 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i8 = date3.compareTo(date7);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay9 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date3);
    long long10 = date3.getMonth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay9 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay9.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 10L);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }

    boolean b1 = org.mafagafogigante.dungeon.commands.IssuedCommand.isValidSource("A few");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }

    org.mafagafogigante.dungeon.entity.items.Item.Tag tag0 = org.mafagafogigante.dungeon.entity.items.Item.Tag.WEAPON;
    org.junit.Assert.assertTrue("'" + tag0 + "' != '" + org.mafagafogigante.dungeon.entity.items.Item.Tag.WEAPON + "'", tag0.equals(org.mafagafogigante.dungeon.entity.items.Item.Tag.WEAPON));

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }

    boolean b1 = org.mafagafogigante.dungeon.util.Percentage.isValidPercentageString("00:00:00 : the sky is cloudy");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }

    org.mafagafogigante.dungeon.entity.items.IntegrityState integrityState2 = org.mafagafogigante.dungeon.entity.items.IntegrityState.getIntegrityState(152, 82800);
    org.junit.Assert.assertTrue("'" + integrityState2 + "' != '" + org.mafagafogigante.dungeon.entity.items.IntegrityState.SEVERELY_DAMAGED + "'", integrityState2.equals(org.mafagafogigante.dungeon.entity.items.IntegrityState.SEVERELY_DAMAGED));

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity2 = itemPreset0.getLuminosity();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset3 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity4 = itemPreset3.getIntegrity();
    itemPreset3.setIntegrityDecrementOnEat((-1));
    org.mafagafogigante.dungeon.entity.Weight weight7 = itemPreset3.getWeight();
    itemPreset3.setDrinkableHealing((int)(byte)1);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset10 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity11 = itemPreset10.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity12 = null;
    itemPreset10.setIntegrity(integrity12);
    org.mafagafogigante.dungeon.util.Percentage percentage14 = itemPreset10.getVisibility();
    java.lang.String str15 = itemPreset10.getType();
    itemPreset10.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage19 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset10.setVisibility(percentage19);
    itemPreset3.setVisibility(percentage19);
    org.mafagafogigante.dungeon.entity.items.Item.Tag tag22 = org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE;
    boolean b23 = itemPreset3.hasTag(tag22);
    itemPreset0.addTag(tag22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    org.junit.Assert.assertTrue("'" + tag22 + "' != '" + org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE + "'", tag22.equals(org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }

    boolean b1 = org.mafagafogigante.dungeon.commands.IssuedCommand.isValidSource("East");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }

    boolean b1 = org.mafagafogigante.dungeon.game.Random.roll((double)(-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    creaturePreset0.setAttack(57);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity5 = creaturePreset0.getLuminosity();
    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset6 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id7 = null;
    creaturePreset6.setWeaponId(id7);
    creaturePreset6.setAttack(57);
    org.mafagafogigante.dungeon.game.Id[] id_array11 = new org.mafagafogigante.dungeon.game.Id[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.game.Id> arraylist_id12 = new java.util.ArrayList<org.mafagafogigante.dungeon.game.Id>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.game.Id>)arraylist_id12, id_array11);
    creaturePreset6.setItems((java.util.List<org.mafagafogigante.dungeon.game.Id>)arraylist_id12);
    creaturePreset0.setItems((java.util.List<org.mafagafogigante.dungeon.game.Id>)arraylist_id12);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.creatures.Creature creature16 = new org.mafagafogigante.dungeon.entity.creatures.Creature(creaturePreset0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(id_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }

    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery0 = null;
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement2 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement(battleStatisticsQuery0, (int)(byte)100);
    java.lang.String str3 = battleStatisticsRequirement2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "BattleStatisticsRequirement{query=null, count=100}"+ "'", str3.equals("BattleStatisticsRequirement{query=null, count=100}"));

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.date.Duration duration1 = org.mafagafogigante.dungeon.date.DungeonTimeParser.parsePeriod("ColoredString{string='', color=null}");
      org.junit.Assert.fail("Expected exception of type org.mafagafogigante.dungeon.date.DungeonTimeParser.InvalidMultiplierException");
    } catch (org.mafagafogigante.dungeon.date.DungeonTimeParser.InvalidMultiplierException e) {
      // Expected exception.
    }

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }

    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit0 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR;
    org.mafagafogigante.dungeon.date.Date date4 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date8 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i9 = date4.compareTo(date8);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay10 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date4);
    long long11 = date4.getYear();
    org.mafagafogigante.dungeon.date.Date date15 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date19 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i20 = date15.compareTo(date19);
    long long21 = date15.getYear();
    int i22 = date4.compareTo(date15);
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit24 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR;
    org.mafagafogigante.dungeon.date.Date date25 = date15.minus(35, dungeonTimeUnit24);
    // The following exception was thrown during execution in test generation
    try {
    long long26 = dungeonTimeUnit0.as(dungeonTimeUnit24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit0 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR + "'", dungeonTimeUnit0.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay10 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay10.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit24 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR + "'", dungeonTimeUnit24.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date25);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }

    org.mafagafogigante.dungeon.stats.Statistics statistics0 = new org.mafagafogigante.dungeon.stats.Statistics();
    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics1 = statistics0.getBattleStatistics();
    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics2 = statistics0.getWorldStatistics();
    statistics0.writeStatistics();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(battleStatistics1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(worldStatistics2);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.util.library.AutomaticShuffledStringLibrary automaticShuffledStringLibrary1 = new org.mafagafogigante.dungeon.util.library.AutomaticShuffledStringLibrary("97 B");
      org.junit.Assert.fail("Expected exception of type org.mafagafogigante.dungeon.io.JsonObjectFactory.IllegalFilenameExtensionException");
    } catch (org.mafagafogigante.dungeon.io.JsonObjectFactory.IllegalFilenameExtensionException e) {
      // Expected exception.
    }

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }

    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery0 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement2 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement(battleStatisticsQuery0, (int)(byte)100);
    java.lang.String str3 = battleStatisticsRequirement2.toString();
    int i4 = battleStatisticsRequirement2.getCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "BattleStatisticsRequirement{query=BattleStatisticsQuery{id=null, type='null', causeOfDeath=null, partOfDay=null}, count=100}"+ "'", str3.equals("BattleStatisticsRequirement{query=BattleStatisticsQuery{id=null, type='null', causeOfDeath=null, partOfDay=null}, count=100}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }

    int i1 = org.mafagafogigante.dungeon.game.Random.nextInteger(46800);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 45056);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }

    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics0 = new org.mafagafogigante.dungeon.stats.BattleStatistics();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement1 = null;
    boolean b2 = battleStatistics0.satisfies(battleStatisticsRequirement1);
    java.lang.String str3 = battleStatistics0.toString();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery4 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement6 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement(battleStatisticsQuery4, (int)(byte)100);
    java.lang.String str7 = battleStatisticsRequirement6.toString();
    boolean b8 = battleStatistics0.satisfies(battleStatisticsRequirement6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "BattleStatistics{records=CounterMap{map={}}}"+ "'", str3.equals("BattleStatistics{records=CounterMap{map={}}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "BattleStatisticsRequirement{query=BattleStatisticsQuery{id=null, type='null', causeOfDeath=null, partOfDay=null}, count=100}"+ "'", str7.equals("BattleStatisticsRequirement{query=BattleStatisticsQuery{id=null, type='null', causeOfDeath=null, partOfDay=null}, count=100}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }

    org.mafagafogigante.dungeon.util.Percentage percentage1 = new org.mafagafogigante.dungeon.util.Percentage((double)' ');

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, (-1), 0.0d);
    org.mafagafogigante.dungeon.entity.Weight weight4 = creatureInventory3.getWeight();
    int i5 = creatureInventory3.getItemCount();
    org.mafagafogigante.dungeon.entity.items.Item item6 = null;
    // The following exception was thrown during execution in test generation
    try {
    creatureInventory3.addItem(item6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test254"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule1 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeArraySizeRule((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule1);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test255"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date7 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i8 = date3.compareTo(date7);
    long long9 = date3.getYear();
    java.lang.String str10 = date3.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "day 10 of month 10 of the year 10"+ "'", str10.equals("day 10 of month 10 of the year 10"));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test256"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    boolean b3 = integrity2.isMaximum();
    org.mafagafogigante.dungeon.entity.items.Item item4 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity5 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity2, item4);
    org.mafagafogigante.dungeon.util.Percentage percentage6 = itemIntegrity5.toPercentage();
    int i7 = itemIntegrity5.getMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemIntegrity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test257"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset2 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    itemPreset2.setDrinkableHealing((int)(short)0);
    org.mafagafogigante.dungeon.util.Percentage percentage6 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset2.setVisibility(percentage6);
    double d8 = org.mafagafogigante.dungeon.util.DungeonMath.weightedAverage((double)10.0f, 100.0d, percentage6);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset9 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity10 = itemPreset9.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity11 = null;
    itemPreset9.setIntegrity(integrity11);
    org.mafagafogigante.dungeon.util.Percentage percentage13 = itemPreset9.getVisibility();
    java.lang.String str14 = itemPreset9.getType();
    org.mafagafogigante.dungeon.entity.items.Item.Tag tag15 = org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE;
    itemPreset9.addTag(tag15);
    org.mafagafogigante.dungeon.util.Percentage percentage18 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b20 = percentage18.equals((java.lang.Object)10.0d);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity21 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage18);
    itemPreset9.setVisibility(percentage18);
    boolean b23 = percentage6.biggerThanOrEqualTo(percentage18);
    java.lang.String str24 = percentage6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    org.junit.Assert.assertTrue("'" + tag15 + "' != '" + org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE + "'", tag15.equals(org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "100.00%"+ "'", str24.equals("100.00%"));

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test258"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity1 = itemPreset0.getLuminosity();
    org.mafagafogigante.dungeon.entity.Weight weight2 = itemPreset0.getWeight();
    org.mafagafogigante.dungeon.entity.Integrity integrity5 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    boolean b6 = integrity5.isMaximum();
    org.mafagafogigante.dungeon.entity.items.Item item7 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity8 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity5, item7);
    itemPreset0.setIntegrity(integrity5);
    java.lang.String str10 = integrity5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemIntegrity8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0/1"+ "'", str10.equals("0/1"));

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test259"); }

    java.lang.String[] str_array3 = new java.lang.String[] { "Damaged", "visibilityCriteria=VisibilityCriteria{[]}", "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str4 = new java.util.ArrayList<java.lang.String>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str4, str_array3);
    org.mafagafogigante.dungeon.io.Split split6 = org.mafagafogigante.dungeon.io.Split.splitOnOn((java.util.List<java.lang.String>)arraylist_str4);
    java.util.List<java.lang.String> list_str7 = split6.getBefore();
    org.mafagafogigante.dungeon.io.Split split8 = org.mafagafogigante.dungeon.io.Split.splitOnOn(list_str7);
    org.mafagafogigante.dungeon.io.Split split9 = org.mafagafogigante.dungeon.io.Split.splitOnOn(list_str7);
    java.util.List<java.lang.String> list_str10 = split9.getBefore();
    org.mafagafogigante.dungeon.io.Split split11 = org.mafagafogigante.dungeon.io.Split.splitOnOn(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(split6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(split8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(split9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(split11);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test260"); }

    org.mafagafogigante.dungeon.achievements.Achievement achievement0 = null;
    org.mafagafogigante.dungeon.date.Date date7 = new org.mafagafogigante.dungeon.date.Date((long)(byte)0, (long)0, (long)81, (long)10, 100L, (long)(short)1);
    java.lang.String str8 = date7.toDateString();
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.achievements.UnlockedAchievement unlockedAchievement9 = new org.mafagafogigante.dungeon.achievements.UnlockedAchievement(achievement0, date7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "day 10 of month 1 of the year 1"+ "'", str8.equals("day 10 of month 1 of the year 1"));

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test261"); }

    org.mafagafogigante.dungeon.entity.items.LocationInventory locationInventory0 = new org.mafagafogigante.dungeon.entity.items.LocationInventory();
    int i1 = locationInventory0.getItemCount();
    org.mafagafogigante.dungeon.entity.items.Item item2 = null;
    // The following exception was thrown during execution in test generation
    try {
    locationInventory0.addItem(item2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test262"); }

    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array0 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria1 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array0);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature2 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer3 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature2);
    boolean b4 = visibilityCriteria1.isMetBy(observer3);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array5 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item6 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item6, item_array5);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString9 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString9.append(str_array14);
    observer3.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item6, dungeonString9);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array17 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item18 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item18, item_array17);
    java.lang.String[] str_array25 = new java.lang.String[] { "CounterMap{map={}}", "User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 34.4 MiB out of the allocated 123.0 MiB\nOS: Windows 10 (amd64) 10.0", "hi!", "0 ms", "User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 41.5 MiB out of the allocated 154.5 MiB\nOS: Windows 10 (amd64) 10.0" };
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item26 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item18, str_array25);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString28 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    observer3.writeItemSight(list_item26, dungeonString28);
    // The following exception was thrown during execution in test generation
    try {
    observer3.look();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item26);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test263"); }

    org.mafagafogigante.dungeon.entity.items.ItemUsageEffect itemUsageEffect1 = new org.mafagafogigante.dungeon.entity.items.ItemUsageEffect((int)(short)10);
    int i2 = itemUsageEffect1.getHealing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 10);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test264"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset3 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    itemPreset3.setDrinkableHealing((int)(short)0);
    org.mafagafogigante.dungeon.util.Percentage percentage7 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset3.setVisibility(percentage7);
    double d9 = org.mafagafogigante.dungeon.util.DungeonMath.weightedAverage((double)10.0f, 100.0d, percentage7);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset10 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity11 = itemPreset10.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity12 = null;
    itemPreset10.setIntegrity(integrity12);
    org.mafagafogigante.dungeon.util.Percentage percentage14 = itemPreset10.getVisibility();
    java.lang.String str15 = itemPreset10.getType();
    org.mafagafogigante.dungeon.entity.items.Item.Tag tag16 = org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE;
    itemPreset10.addTag(tag16);
    org.mafagafogigante.dungeon.util.Percentage percentage19 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b21 = percentage19.equals((java.lang.Object)10.0d);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity22 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage19);
    itemPreset10.setVisibility(percentage19);
    boolean b24 = percentage7.biggerThanOrEqualTo(percentage19);
    org.mafagafogigante.dungeon.entity.items.WeaponComponent weaponComponent26 = new org.mafagafogigante.dungeon.entity.items.WeaponComponent((int)(short)10, percentage19, 1);
    org.mafagafogigante.dungeon.util.Percentage percentage27 = weaponComponent26.getHitRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    org.junit.Assert.assertTrue("'" + tag16 + "' != '" + org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE + "'", tag16.equals(org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage27);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test265"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule0 = null;
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule1 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeVariableArrayRule(jsonRule0);
    org.mafagafogigante.dungeon.schema.JsonRule[] jsonRule_array2 = new org.mafagafogigante.dungeon.schema.JsonRule[] { jsonRule0 };
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule3 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeGroupRule(jsonRule_array2);
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule4 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeGroupRule(jsonRule_array2);
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule5 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeGroupRule(jsonRule_array2);
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule6 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeOptionalRule(jsonRule5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule6);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test266"); }

    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics0 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    int i2 = explorationStatistics0.getKillCount(id1);
    org.mafagafogigante.dungeon.game.Id id3 = null;
    int i4 = explorationStatistics0.getVisitedLocations(id3);
    org.mafagafogigante.dungeon.game.Point point5 = null;
    // The following exception was thrown during execution in test generation
    try {
    explorationStatistics0.addKill(point5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test267"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    java.lang.String str5 = itemPreset0.getType();
    itemPreset0.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage9 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset0.setVisibility(percentage9);
    org.mafagafogigante.dungeon.game.Id id11 = null;
    itemPreset0.setId(id11);
    itemPreset0.setPutrefactionPeriod((long)(short)1);
    int i15 = itemPreset0.getDrinkableHealing();
    int i16 = itemPreset0.getDamage();
    int i17 = itemPreset0.getDrinkableDoses();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test268"); }

    org.mafagafogigante.dungeon.logging.DungeonLogger.fine("Nights");

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test269"); }

    org.mafagafogigante.dungeon.game.Direction direction1 = org.mafagafogigante.dungeon.game.Direction.fromAbbreviation("Dead");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(direction1);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test270"); }

    org.mafagafogigante.dungeon.io.Sleeper.sleep((long)35);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test271"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    boolean b5 = itemPreset0.isUnique();
    org.mafagafogigante.dungeon.game.Id id6 = null;
    itemPreset0.setId(id6);
    // The following exception was thrown during execution in test generation
    try {
    itemPreset0.setSpellId("User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 41.5 MiB out of the allocated 154.5 MiB\nOS: Windows 10 (amd64) 10.0");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test272"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.util.CircularList<java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>> circularlist_comparable_weight1 = new org.mafagafogigante.dungeon.util.CircularList<java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>>((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test273"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule1 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeStringLengthRule((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule1);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test274"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    java.lang.String str5 = itemPreset0.getType();
    itemPreset0.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage9 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset0.setVisibility(percentage9);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity11 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test275"); }

    org.mafagafogigante.dungeon.entity.creatures.Hero hero0 = null;
    org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster heroSpellcaster1 = new org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster(hero0);
    java.util.List<org.mafagafogigante.dungeon.spells.Spell> list_spell2 = heroSpellcaster1.getSpellList();
    java.lang.String[] str_array3 = new java.lang.String[] {  };
    heroSpellcaster1.parseCast(str_array3);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.util.Table table5 = new org.mafagafogigante.dungeon.util.Table(str_array3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_spell2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test276"); }

    org.mafagafogigante.dungeon.entity.items.LocationInventory locationInventory0 = new org.mafagafogigante.dungeon.entity.items.LocationInventory();
    org.mafagafogigante.dungeon.entity.items.Item item1 = null;
    boolean b2 = locationInventory0.hasItem(item1);
    int i3 = locationInventory0.getItemCount();
    org.mafagafogigante.dungeon.entity.items.Item item4 = null;
    // The following exception was thrown during execution in test generation
    try {
    locationInventory0.addItem(item4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test277"); }

    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics0 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point4 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id5 = null;
    explorationStatistics0.createEntryIfNotExists(point4, id5);
    org.mafagafogigante.dungeon.game.Id id7 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i8 = explorationStatistics0.getMaximumNumberOfVisits(id7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test278"); }

    org.mafagafogigante.dungeon.entity.creatures.CritterAttackAlgorithm critterAttackAlgorithm0 = new org.mafagafogigante.dungeon.entity.creatures.CritterAttackAlgorithm();
    org.mafagafogigante.dungeon.entity.creatures.Creature creature1 = null;
    org.mafagafogigante.dungeon.entity.creatures.Creature creature2 = null;
    // The following exception was thrown during execution in test generation
    try {
    critterAttackAlgorithm0.renderAttack(creature1, creature2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test279"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    itemPreset0.setIntegrityDecrementOnEat((-1));
    org.mafagafogigante.dungeon.entity.Weight weight4 = itemPreset0.getWeight();
    org.mafagafogigante.dungeon.util.Percentage percentage5 = itemPreset0.getVisibility();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage5);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test280"); }

    int i2 = org.mafagafogigante.dungeon.game.Random.nextInteger(1, 46800);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 17518);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test281"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.date.Duration duration1 = org.mafagafogigante.dungeon.date.DungeonTimeParser.parsePeriod("A few");
      org.junit.Assert.fail("Expected exception of type org.mafagafogigante.dungeon.date.DungeonTimeParser.InvalidMultiplierException");
    } catch (org.mafagafogigante.dungeon.date.DungeonTimeParser.InvalidMultiplierException e) {
      // Expected exception.
    }

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test282"); }

    org.mafagafogigante.dungeon.game.Direction direction1 = org.mafagafogigante.dungeon.game.Direction.fromAbbreviation("User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 41.5 MiB out of the allocated 154.5 MiB\nOS: Windows 10 (amd64) 10.0");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(direction1);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test283"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    org.mafagafogigante.dungeon.entity.Integrity integrity5 = itemPreset0.getIntegrity();
    java.lang.String str6 = itemPreset0.getText();
    itemPreset0.setIntegrityDecrementPerDose((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test284"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.date.Duration duration1 = org.mafagafogigante.dungeon.date.DungeonTimeParser.parsePeriod("Sky{astronomicalBodies=[the Sun, a large, golden, spherical body, Mino, a small, dull white spherical body, Sario, a very small, green-tinted, perfectly spherical body]}");
      org.junit.Assert.fail("Expected exception of type org.mafagafogigante.dungeon.date.DungeonTimeParser.InvalidMultiplierException");
    } catch (org.mafagafogigante.dungeon.date.DungeonTimeParser.InvalidMultiplierException e) {
      // Expected exception.
    }

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test285"); }

    java.lang.String str1 = org.mafagafogigante.dungeon.io.Converter.bytesToHuman(0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0 B"+ "'", str1.equals("0 B"));

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test286"); }

    org.mafagafogigante.dungeon.game.Numeral numeral1 = org.mafagafogigante.dungeon.game.Numeral.getCorrespondingNumeral(97);
    org.junit.Assert.assertTrue("'" + numeral1 + "' != '" + org.mafagafogigante.dungeon.game.Numeral.MORE_THAN_FIVE + "'", numeral1.equals(org.mafagafogigante.dungeon.game.Numeral.MORE_THAN_FIVE));

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test287"); }

    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics0 = new org.mafagafogigante.dungeon.stats.WorldStatistics();
    int i1 = worldStatistics0.getSpawnCount();
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str2 = worldStatistics0.getLocationCounter();
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str3 = worldStatistics0.getSpawnCounter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str3);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test288"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.date.Duration duration1 = org.mafagafogigante.dungeon.date.DungeonTimeParser.parsePeriod("{32, 0, -1}");
      org.junit.Assert.fail("Expected exception of type org.mafagafogigante.dungeon.date.DungeonTimeParser.InvalidMultiplierException");
    } catch (org.mafagafogigante.dungeon.date.DungeonTimeParser.InvalidMultiplierException e) {
      // Expected exception.
    }

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test289"); }

    org.mafagafogigante.dungeon.util.Percentage percentage2 = null;
    // The following exception was thrown during execution in test generation
    try {
    double d3 = org.mafagafogigante.dungeon.util.DungeonMath.weightedAverage((double)(byte)100, (double)10, percentage2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test290"); }

    org.mafagafogigante.dungeon.game.Numeral numeral0 = org.mafagafogigante.dungeon.game.Numeral.MORE_THAN_FIVE;
    java.lang.String str1 = numeral0.toString();
    java.lang.String str2 = numeral0.toString();
    org.junit.Assert.assertTrue("'" + numeral0 + "' != '" + org.mafagafogigante.dungeon.game.Numeral.MORE_THAN_FIVE + "'", numeral0.equals(org.mafagafogigante.dungeon.game.Numeral.MORE_THAN_FIVE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "A few"+ "'", str1.equals("A few"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A few"+ "'", str2.equals("A few"));

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test291"); }

    int i1 = org.mafagafogigante.dungeon.util.DungeonMath.safeCastLongToInteger((long)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test292"); }

    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics0 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point4 = new org.mafagafogigante.dungeon.game.Point(10, (int)'a', 0);
    int i5 = point4.getY();
    org.mafagafogigante.dungeon.game.Id id6 = null;
    explorationStatistics0.createEntryIfNotExists(point4, id6);
    org.mafagafogigante.dungeon.game.Point point11 = new org.mafagafogigante.dungeon.game.Point((int)'#', (int)(short)0, 35);
    // The following exception was thrown during execution in test generation
    try {
    explorationStatistics0.addKill(point11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 97);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test293"); }

    org.mafagafogigante.dungeon.stats.Statistics statistics0 = new org.mafagafogigante.dungeon.stats.Statistics();
    statistics0.writeStatistics();
    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics2 = statistics0.getWorldStatistics();
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker3 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics0);
    org.mafagafogigante.dungeon.achievements.Achievement achievement4 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b5 = achievementTracker3.hasNotBeenUnlocked(achievement4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(worldStatistics2);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test294"); }

    java.lang.String[] str_array0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.io.PoemWriter.parsePoemCommand(str_array0);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test295"); }

    // The following exception was thrown during execution in test generation
    try {
    int i2 = org.mafagafogigante.dungeon.game.Random.nextInteger((int)(byte)100, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test296"); }

    java.lang.String[] str_array0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.util.Table table1 = new org.mafagafogigante.dungeon.util.Table(str_array0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test297"); }

    org.mafagafogigante.dungeon.io.Sleeper.sleep(1L);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test298"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    java.lang.String str5 = itemPreset0.getType();
    itemPreset0.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.entity.TagSet<org.mafagafogigante.dungeon.entity.items.Item.Tag> tagset_tag8 = itemPreset0.getTagSet();
    org.mafagafogigante.dungeon.entity.Weight weight10 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    itemPreset0.setWeight(weight10);
    org.mafagafogigante.dungeon.game.Id id12 = itemPreset0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tagset_tag8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id12);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test299"); }

    org.mafagafogigante.dungeon.game.Point point3 = new org.mafagafogigante.dungeon.game.Point(100, 10, (int)(byte)10);
    int i4 = point3.getY();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test300"); }

    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics0 = new org.mafagafogigante.dungeon.stats.BattleStatistics();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement1 = null;
    boolean b2 = battleStatistics0.satisfies(battleStatisticsRequirement1);
    java.lang.String str3 = battleStatistics0.toString();
    org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.CauseOfDeath> countermap_causeOfDeath4 = battleStatistics0.getKillsByCauseOfDeath();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery5 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement7 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement(battleStatisticsQuery5, (int)(byte)100);
    boolean b8 = battleStatistics0.satisfies(battleStatisticsRequirement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "BattleStatistics{records=CounterMap{map={}}}"+ "'", str3.equals("BattleStatistics{records=CounterMap{map={}}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_causeOfDeath4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test301"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule0 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeIdRule();
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule2 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeArraySizeRule((int)(short)0);
    java.util.Map<java.lang.String,org.mafagafogigante.dungeon.schema.JsonRule> map_str_jsonRule3 = null;
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule4 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeObjectRule(map_str_jsonRule3);
    org.mafagafogigante.dungeon.schema.JsonRule[] jsonRule_array5 = new org.mafagafogigante.dungeon.schema.JsonRule[] { jsonRule0, jsonRule2, jsonRule4 };
    java.util.ArrayList<org.mafagafogigante.dungeon.schema.JsonRule> arraylist_jsonRule6 = new java.util.ArrayList<org.mafagafogigante.dungeon.schema.JsonRule>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.schema.JsonRule>)arraylist_jsonRule6, jsonRule_array5);
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule8 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeFixedArrayRule((java.util.List<org.mafagafogigante.dungeon.schema.JsonRule>)arraylist_jsonRule6);
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule9 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeVariableArrayRule(jsonRule8);
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule10 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeVariableArrayRule(jsonRule8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule10);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test302"); }

    org.mafagafogigante.dungeon.game.DungeonString dungeonString1 = new org.mafagafogigante.dungeon.game.DungeonString("Noon");

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test303"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset6 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    itemPreset6.setDrinkableHealing((int)(short)0);
    org.mafagafogigante.dungeon.util.Percentage percentage10 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset6.setVisibility(percentage10);
    double d12 = org.mafagafogigante.dungeon.util.DungeonMath.weightedAverage((double)10.0f, 100.0d, percentage10);
    double d13 = org.mafagafogigante.dungeon.util.DungeonMath.weightedAverage(0.0d, (double)(short)0, percentage10);
    itemPreset0.setVisibility(percentage10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test304"); }

    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics0 = new org.mafagafogigante.dungeon.stats.WorldStatistics();
    int i1 = worldStatistics0.getLocationCount();
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str2 = worldStatistics0.getSpawnCounter();
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str3 = worldStatistics0.getSpawnCounter();
    worldStatistics0.addLocation("ColoredString{string='', color=null}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str3);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test305"); }

    org.mafagafogigante.dungeon.game.Numeral numeral1 = org.mafagafogigante.dungeon.game.Numeral.getCorrespondingNumeral(32);
    org.junit.Assert.assertTrue("'" + numeral1 + "' != '" + org.mafagafogigante.dungeon.game.Numeral.MORE_THAN_FIVE + "'", numeral1.equals(org.mafagafogigante.dungeon.game.Numeral.MORE_THAN_FIVE));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test306"); }

    org.mafagafogigante.dungeon.util.CircularList<java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>> circularlist_comparable_weight1 = new org.mafagafogigante.dungeon.util.CircularList<java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>>(100);
    boolean b2 = circularlist_comparable_weight1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test307"); }

    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications2 = new org.mafagafogigante.dungeon.gui.WritingSpecifications(true, 32);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test308"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, (-1), 0.0d);
    org.mafagafogigante.dungeon.entity.Weight weight4 = creatureInventory3.getWeight();
    int i5 = creatureInventory3.getItemCount();
    int i6 = creatureInventory3.getItemCount();
    org.mafagafogigante.dungeon.entity.Weight weight7 = creatureInventory3.getWeightLimit();
    org.mafagafogigante.dungeon.entity.items.Item item8 = null;
    // The following exception was thrown during execution in test generation
    try {
    creatureInventory3.removeItem(item8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight7);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test309"); }

    java.awt.Color color1 = null;
    org.mafagafogigante.dungeon.game.LocationDescription locationDescription2 = new org.mafagafogigante.dungeon.game.LocationDescription('a', color1);
    java.lang.String str3 = locationDescription2.getInfo();
    char char4 = locationDescription2.getSymbol();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "You don't discover anything."+ "'", str3.equals("You don't discover anything."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char4 == 'a');

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test310"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table6 = new org.mafagafogigante.dungeon.util.Table(str_array5);
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications9 = new org.mafagafogigante.dungeon.gui.WritingSpecifications(false, 32);
    boolean b10 = writingSpecifications9.shouldWait();
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)table6, writingSpecifications9);
    java.lang.String[] str_array14 = new java.lang.String[] { "", "" };
    org.mafagafogigante.dungeon.util.Table table15 = new org.mafagafogigante.dungeon.util.Table(str_array14);
    // The following exception was thrown during execution in test generation
    try {
    table6.insertRow(str_array14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test311"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity((int)(byte)1, (int)(byte)0);
    boolean b3 = integrity2.isMaximum();
    org.mafagafogigante.dungeon.entity.items.Item item4 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity5 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity2, item4);
    // The following exception was thrown during execution in test generation
    try {
    itemIntegrity5.decrementBy((int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemIntegrity5);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test312"); }

    org.mafagafogigante.dungeon.world.WeatherCondition weatherCondition0 = org.mafagafogigante.dungeon.world.WeatherCondition.STORM;
    java.lang.String str1 = weatherCondition0.toDescriptiveString();
    org.junit.Assert.assertTrue("'" + weatherCondition0 + "' != '" + org.mafagafogigante.dungeon.world.WeatherCondition.STORM + "'", weatherCondition0.equals(org.mafagafogigante.dungeon.world.WeatherCondition.STORM));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "it is storming"+ "'", str1.equals("it is storming"));

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test313"); }

    org.mafagafogigante.dungeon.game.Direction direction0 = org.mafagafogigante.dungeon.game.Direction.UP;
    java.lang.String str1 = direction0.toString();
    org.junit.Assert.assertTrue("'" + direction0 + "' != '" + org.mafagafogigante.dungeon.game.Direction.UP + "'", direction0.equals(org.mafagafogigante.dungeon.game.Direction.UP));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Up"+ "'", str1.equals("Up"));

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test314"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.util.Percentage percentage2 = itemPreset0.getVisibility();
    java.lang.String str3 = itemPreset0.getType();
    int i4 = itemPreset0.getDamage();
    itemPreset0.setType("Damaged");
    itemPreset0.setType("{32, 0, -1}");
    org.mafagafogigante.dungeon.game.Id id9 = null;
    itemPreset0.setId(id9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test315"); }

    org.mafagafogigante.dungeon.entity.items.LocationInventory locationInventory0 = new org.mafagafogigante.dungeon.entity.items.LocationInventory();
    org.mafagafogigante.dungeon.entity.items.Item item1 = null;
    boolean b2 = locationInventory0.hasItem(item1);
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item3 = locationInventory0.getItems();
    locationInventory0.refreshItems();
    org.mafagafogigante.dungeon.entity.items.Item item5 = null;
    // The following exception was thrown during execution in test generation
    try {
    locationInventory0.addItem(item5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item3);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test316"); }

    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery0 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement2 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement(battleStatisticsQuery0, (int)(byte)100);
    int i3 = battleStatisticsRequirement2.getCount();
    int i4 = battleStatisticsRequirement2.getCount();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery5 = battleStatisticsRequirement2.getQuery();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(battleStatisticsQuery5);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test317"); }

    org.mafagafogigante.dungeon.stats.Statistics statistics0 = null;
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker1 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics0);
    org.mafagafogigante.dungeon.stats.Statistics statistics2 = new org.mafagafogigante.dungeon.stats.Statistics();
    statistics2.writeStatistics();
    statistics2.writeStatistics();
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker5 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics2);
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker6 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics2);
    java.util.Comparator<org.mafagafogigante.dungeon.achievements.UnlockedAchievement> comparator_unlockedAchievement7 = org.mafagafogigante.dungeon.achievements.comparators.UnlockedAchievementComparators.getDefaultComparator();
    java.util.List<org.mafagafogigante.dungeon.achievements.UnlockedAchievement> list_unlockedAchievement8 = achievementTracker6.getUnlockedAchievements(comparator_unlockedAchievement7);
    java.util.List<org.mafagafogigante.dungeon.achievements.UnlockedAchievement> list_unlockedAchievement9 = achievementTracker1.getUnlockedAchievements(comparator_unlockedAchievement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_unlockedAchievement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_unlockedAchievement8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_unlockedAchievement9);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test318"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    java.lang.String str5 = itemPreset0.getType();
    org.mafagafogigante.dungeon.entity.items.Item.Tag tag6 = org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE;
    itemPreset0.addTag(tag6);
    org.mafagafogigante.dungeon.util.Percentage percentage9 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b11 = percentage9.equals((java.lang.Object)10.0d);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity12 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage9);
    itemPreset0.setVisibility(percentage9);
    java.lang.String str14 = itemPreset0.getText();
    itemPreset0.setDrinkableDoses(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    org.junit.Assert.assertTrue("'" + tag6 + "' != '" + org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE + "'", tag6.equals(org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test319"); }

    org.mafagafogigante.dungeon.game.DungeonString dungeonString1 = new org.mafagafogigante.dungeon.game.DungeonString("Nights");

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test320"); }

    org.mafagafogigante.dungeon.entity.Weight weight1 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)100);
    java.lang.String str2 = weight1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100 kg"+ "'", str2.equals("100 kg"));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test321"); }

    org.mafagafogigante.dungeon.game.LocationPreset locationPreset0 = null;
    org.mafagafogigante.dungeon.game.World world1 = null;
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics2 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point3 = null;
    org.mafagafogigante.dungeon.game.Id id4 = null;
    explorationStatistics2.createEntryIfNotExists(point3, id4);
    org.mafagafogigante.dungeon.game.Point point9 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id10 = null;
    explorationStatistics2.addVisit(point9, id10);
    int i12 = point9.getZ();
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.game.Location location13 = new org.mafagafogigante.dungeon.game.Location(locationPreset0, world1, point9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test322"); }

    org.mafagafogigante.dungeon.date.Date date0 = null;
    org.mafagafogigante.dungeon.world.Weather weather1 = new org.mafagafogigante.dungeon.world.Weather(date0);
    org.mafagafogigante.dungeon.date.Date date5 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date9 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i10 = date5.compareTo(date9);
    long long11 = date5.getYear();
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.world.WeatherCondition weatherCondition12 = weather1.getCurrentCondition(date5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 10L);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test323"); }

    org.mafagafogigante.dungeon.entity.creatures.Hero hero0 = null;
    org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster heroSpellcaster1 = new org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster(hero0);
    java.util.List<org.mafagafogigante.dungeon.spells.Spell> list_spell2 = heroSpellcaster1.getSpellList();
    java.lang.String[] str_array3 = new java.lang.String[] {  };
    heroSpellcaster1.parseCast(str_array3);
    org.mafagafogigante.dungeon.spells.Spell spell5 = null;
    // The following exception was thrown during execution in test generation
    try {
    heroSpellcaster1.learnSpell(spell5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_spell2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test324"); }

    org.mafagafogigante.dungeon.entity.Entity[] entity_array0 = new org.mafagafogigante.dungeon.entity.Entity[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.Entity> arraylist_entity1 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.Entity>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.Entity>)arraylist_entity1, entity_array0);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity3 = org.mafagafogigante.dungeon.entity.Luminosity.resultantLuminosity((java.util.Collection<org.mafagafogigante.dungeon.entity.Entity>)arraylist_entity1);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity4 = org.mafagafogigante.dungeon.entity.Luminosity.resultantLuminosity((java.util.Collection<org.mafagafogigante.dungeon.entity.Entity>)arraylist_entity1);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.Entity entity5 = org.mafagafogigante.dungeon.game.Random.select((java.util.List<org.mafagafogigante.dungeon.entity.Entity>)arraylist_entity1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(entity_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity4);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test325"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    java.lang.String str5 = itemPreset0.getType();
    itemPreset0.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.entity.TagSet<org.mafagafogigante.dungeon.entity.items.Item.Tag> tagset_tag8 = itemPreset0.getTagSet();
    org.mafagafogigante.dungeon.entity.Integrity integrity11 = new org.mafagafogigante.dungeon.entity.Integrity((int)(byte)1, (int)(byte)0);
    itemPreset0.setIntegrity(integrity11);
    itemPreset0.setIntegrityDecrementOnEat(82800);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tagset_tag8);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test326"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    java.lang.String str5 = itemPreset0.getType();
    itemPreset0.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage9 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset0.setVisibility(percentage9);
    org.mafagafogigante.dungeon.game.Id id11 = null;
    itemPreset0.setId(id11);
    itemPreset0.setPutrefactionPeriod((long)(short)1);
    org.mafagafogigante.dungeon.util.Percentage percentage15 = itemPreset0.getVisibility();
    org.mafagafogigante.dungeon.entity.Integrity integrity16 = itemPreset0.getIntegrity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity16);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test327"); }

    org.mafagafogigante.dungeon.util.SystemInformation systemInformation0 = new org.mafagafogigante.dungeon.util.SystemInformation();
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString1 = systemInformation0.toColoredStringList();
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications2 = null;
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)systemInformation0, writingSpecifications2);
    java.lang.String str4 = systemInformation0.toString();
    org.mafagafogigante.dungeon.io.Writer.writeAndWait((org.mafagafogigante.dungeon.game.Writable)systemInformation0);
    java.lang.String str6 = systemInformation0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User: Nicholas\nTime: 15:42:34\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 18.2 MiB out of the allocated 117.0 MiB\nOS: Windows 10 (amd64) 10.0"+ "'", str4.equals("User: Nicholas\nTime: 15:42:34\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 18.2 MiB out of the allocated 117.0 MiB\nOS: Windows 10 (amd64) 10.0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User: Nicholas\nTime: 15:42:34\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 18.2 MiB out of the allocated 117.0 MiB\nOS: Windows 10 (amd64) 10.0"+ "'", str6.equals("User: Nicholas\nTime: 15:42:34\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 18.2 MiB out of the allocated 117.0 MiB\nOS: Windows 10 (amd64) 10.0"));

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test328"); }

    boolean b1 = org.mafagafogigante.dungeon.commands.IssuedCommand.isValidSource("DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=null}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test329"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.util.library.AutomaticShuffledStringLibrary automaticShuffledStringLibrary1 = new org.mafagafogigante.dungeon.util.library.AutomaticShuffledStringLibrary("97-01-01 00:00:00");
      org.junit.Assert.fail("Expected exception of type org.mafagafogigante.dungeon.io.JsonObjectFactory.IllegalFilenameExtensionException");
    } catch (org.mafagafogigante.dungeon.io.JsonObjectFactory.IllegalFilenameExtensionException e) {
      // Expected exception.
    }

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test330"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    creaturePreset0.setAttack(57);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity5 = creaturePreset0.getLuminosity();
    int i6 = creaturePreset0.getInventoryItemLimit();
    org.mafagafogigante.dungeon.util.CounterMap<java.util.RandomAccess> countermap_randomAccess7 = new org.mafagafogigante.dungeon.util.CounterMap<java.util.RandomAccess>();
    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset8 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id9 = null;
    creaturePreset8.setWeaponId(id9);
    creaturePreset8.setAttack(57);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity13 = creaturePreset8.getLuminosity();
    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset14 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id15 = null;
    creaturePreset14.setWeaponId(id15);
    creaturePreset14.setAttack(57);
    org.mafagafogigante.dungeon.game.Id[] id_array19 = new org.mafagafogigante.dungeon.game.Id[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.game.Id> arraylist_id20 = new java.util.ArrayList<org.mafagafogigante.dungeon.game.Id>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.game.Id>)arraylist_id20, id_array19);
    creaturePreset14.setItems((java.util.List<org.mafagafogigante.dungeon.game.Id>)arraylist_id20);
    creaturePreset8.setItems((java.util.List<org.mafagafogigante.dungeon.game.Id>)arraylist_id20);
    countermap_randomAccess7.incrementCounter((java.util.RandomAccess)arraylist_id20, (java.lang.Integer)10);
    creaturePreset0.setItems((java.util.List<org.mafagafogigante.dungeon.game.Id>)arraylist_id20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(id_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test331"); }

    org.mafagafogigante.dungeon.util.Percentage percentage1 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    org.mafagafogigante.dungeon.entity.Luminosity luminosity2 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage1);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test332"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date7 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i8 = date3.compareTo(date7);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay9 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date3);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay10 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date3);
    long long11 = date3.getDay();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay9 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay9.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    org.junit.Assert.assertTrue("'" + partOfDay10 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay10.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 10L);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test333"); }

    boolean b1 = org.mafagafogigante.dungeon.util.Percentage.isValidPercentageString("East");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test334"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    creaturePreset0.setAttack(57);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity5 = creaturePreset0.getLuminosity();
    int i6 = creaturePreset0.getInventoryItemLimit();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay7 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity8 = partOfDay7.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name9 = partOfDay7.getName();
    java.lang.String str11 = name9.getQuantifiedName((int)'a');
    java.lang.String str12 = name9.getSingular();
    java.lang.String str13 = name9.getPlural();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset14 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity15 = itemPreset14.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity16 = null;
    itemPreset14.setIntegrity(integrity16);
    org.mafagafogigante.dungeon.entity.Integrity integrity18 = itemPreset14.getIntegrity();
    org.mafagafogigante.dungeon.util.Percentage percentage19 = itemPreset14.getHitRate();
    boolean b20 = name9.equals((java.lang.Object)percentage19);
    creaturePreset0.setName(name9);
    org.mafagafogigante.dungeon.game.Name name22 = creaturePreset0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay7 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay7.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "a few Nights"+ "'", str11.equals("a few Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Night"+ "'", str12.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Nights"+ "'", str13.equals("Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name22);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test335"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule1 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeArraySizeRule(38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule1);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test336"); }

    org.mafagafogigante.dungeon.util.Percentage percentage0 = null;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity1 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage0);
    org.mafagafogigante.dungeon.entity.LightSource lightSource2 = new org.mafagafogigante.dungeon.entity.LightSource(luminosity1);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity3 = lightSource2.getLuminosity();
    lightSource2.enable();
    lightSource2.enable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity3);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test337"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    java.lang.String str5 = itemPreset0.getType();
    itemPreset0.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.entity.TagSet<org.mafagafogigante.dungeon.entity.items.Item.Tag> tagset_tag8 = itemPreset0.getTagSet();
    org.mafagafogigante.dungeon.entity.Integrity integrity11 = new org.mafagafogigante.dungeon.entity.Integrity((int)(byte)1, (int)(byte)0);
    itemPreset0.setIntegrity(integrity11);
    integrity11.decrementBy(5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tagset_tag8);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test338"); }

    org.mafagafogigante.dungeon.game.MinimumBoundingRectangle minimumBoundingRectangle2 = new org.mafagafogigante.dungeon.game.MinimumBoundingRectangle(0, (int)(short)1);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test339"); }

    org.mafagafogigante.dungeon.game.Direction direction0 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b2 = direction0.equalsIgnoreCase("");
    java.lang.String str3 = direction0.toString();
    boolean b5 = direction0.equalsIgnoreCase("CreatureHealth{integrity=100/100}");
    org.junit.Assert.assertTrue("'" + direction0 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction0.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "East"+ "'", str3.equals("East"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test340"); }

    org.mafagafogigante.dungeon.game.Direction direction1 = org.mafagafogigante.dungeon.game.Direction.fromAbbreviation("ColoredString{string='', color=null}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(direction1);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test341"); }

    boolean b1 = org.mafagafogigante.dungeon.util.Percentage.isValidPercentageString("{32, 0, -1}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test342"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    itemPreset0.setIntegrityDecrementOnEat((-1));
    org.mafagafogigante.dungeon.game.Id id4 = itemPreset0.getSpellId();
    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset5 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id6 = null;
    creaturePreset5.setWeaponId(id6);
    creaturePreset5.setAttack((int)(short)100);
    org.mafagafogigante.dungeon.game.Id id10 = creaturePreset5.getWeaponId();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity11 = creaturePreset5.getLuminosity();
    itemPreset0.setLuminosity(luminosity11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity11);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test343"); }

    org.mafagafogigante.dungeon.util.CounterMap<java.util.RandomAccess> countermap_randomAccess0 = new org.mafagafogigante.dungeon.util.CounterMap<java.util.RandomAccess>();
    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset1 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id2 = null;
    creaturePreset1.setWeaponId(id2);
    creaturePreset1.setAttack(57);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity6 = creaturePreset1.getLuminosity();
    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset7 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id8 = null;
    creaturePreset7.setWeaponId(id8);
    creaturePreset7.setAttack(57);
    org.mafagafogigante.dungeon.game.Id[] id_array12 = new org.mafagafogigante.dungeon.game.Id[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.game.Id> arraylist_id13 = new java.util.ArrayList<org.mafagafogigante.dungeon.game.Id>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.game.Id>)arraylist_id13, id_array12);
    creaturePreset7.setItems((java.util.List<org.mafagafogigante.dungeon.game.Id>)arraylist_id13);
    creaturePreset1.setItems((java.util.List<org.mafagafogigante.dungeon.game.Id>)arraylist_id13);
    countermap_randomAccess0.incrementCounter((java.util.RandomAccess)arraylist_id13, (java.lang.Integer)10);
    java.util.Set<java.util.RandomAccess> set_randomAccess19 = countermap_randomAccess0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(id_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_randomAccess19);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test344"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    boolean b3 = integrity2.isMaximum();
    org.mafagafogigante.dungeon.entity.items.Item item4 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity5 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity2, item4);
    int i6 = itemIntegrity5.getMaximum();
    itemIntegrity5.incrementBy(3600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemIntegrity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test345"); }

    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics0 = new org.mafagafogigante.dungeon.stats.WorldStatistics();
    worldStatistics0.addLocation("User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 34.4 MiB out of the allocated 123.0 MiB\nOS: Windows 10 (amd64) 10.0");
    int i3 = worldStatistics0.getSpawnCount();
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str4 = worldStatistics0.getLocationCounter();
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str5 = worldStatistics0.getSpawnCounter();
    java.lang.String str6 = countermap_str5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "CounterMap{map={}}"+ "'", str6.equals("CounterMap{map={}}"));

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test346"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    java.lang.String str5 = itemPreset0.getType();
    itemPreset0.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.entity.TagSet<org.mafagafogigante.dungeon.entity.items.Item.Tag> tagset_tag8 = itemPreset0.getTagSet();
    org.mafagafogigante.dungeon.entity.Integrity integrity11 = new org.mafagafogigante.dungeon.entity.Integrity((int)(byte)1, (int)(byte)0);
    itemPreset0.setIntegrity(integrity11);
    itemPreset0.setUnique(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tagset_tag8);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test347"); }

    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery0 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement2 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement(battleStatisticsQuery0, (int)(byte)100);
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery3 = battleStatisticsRequirement2.getQuery();
    java.lang.String str4 = battleStatisticsRequirement2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(battleStatisticsQuery3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "BattleStatisticsRequirement{query=BattleStatisticsQuery{id=null, type='null', causeOfDeath=null, partOfDay=null}, count=100}"+ "'", str4.equals("BattleStatisticsRequirement{query=BattleStatisticsQuery{id=null, type='null', causeOfDeath=null, partOfDay=null}, count=100}"));

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test348"); }

    org.mafagafogigante.dungeon.entity.creatures.Hero hero0 = null;
    org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster heroSpellcaster1 = new org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster(hero0);
    java.util.List<org.mafagafogigante.dungeon.spells.Spell> list_spell2 = heroSpellcaster1.getSpellList();
    java.util.List<org.mafagafogigante.dungeon.spells.Spell> list_spell3 = heroSpellcaster1.getSpellList();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_spell2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_spell3);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test349"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity2 = itemPreset0.getLuminosity();
    itemPreset0.setDamage(81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity2);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test350"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date7 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i8 = date3.compareTo(date7);
    long long9 = date7.getDay();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay10 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    int i11 = org.mafagafogigante.dungeon.game.PartOfDay.getSecondsToNext(date7, partOfDay10);
    long long12 = date7.getYear();
    org.mafagafogigante.dungeon.date.Date date16 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date20 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i21 = date16.compareTo(date20);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay22 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date16);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay23 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date16);
    int i24 = org.mafagafogigante.dungeon.game.PartOfDay.getSecondsToNext(date7, partOfDay23);
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit26 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR;
    org.mafagafogigante.dungeon.date.Date date27 = date7.minus(82800, dungeonTimeUnit26);
    java.lang.String str28 = date27.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 10L);
    org.junit.Assert.assertTrue("'" + partOfDay10 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay10.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay22 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay22.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    org.junit.Assert.assertTrue("'" + partOfDay23 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay23.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 82800);
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit26 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR + "'", dungeonTimeUnit26.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "-23--4-00 00:00:00"+ "'", str28.equals("-23--4-00 00:00:00"));

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test351"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date7 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i8 = date3.compareTo(date7);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay9 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date3);
    long long10 = date3.getYear();
    org.mafagafogigante.dungeon.date.Date date14 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date18 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i19 = date14.compareTo(date18);
    long long20 = date14.getYear();
    int i21 = date3.compareTo(date14);
    java.lang.String str22 = date14.toDateString();
    org.mafagafogigante.dungeon.world.Weather weather23 = new org.mafagafogigante.dungeon.world.Weather(date14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay9 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay9.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long20 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "day 10 of month 10 of the year 10"+ "'", str22.equals("day 10 of month 10 of the year 10"));

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test352"); }

    org.mafagafogigante.dungeon.spells.Spell[] spell_array0 = new org.mafagafogigante.dungeon.spells.Spell[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.spells.Spell> arraylist_spell1 = new java.util.ArrayList<org.mafagafogigante.dungeon.spells.Spell>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.spells.Spell>)arraylist_spell1, spell_array0);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.spells.Spell spell3 = org.mafagafogigante.dungeon.game.Random.select((java.util.List<org.mafagafogigante.dungeon.spells.Spell>)arraylist_spell1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spell_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test353"); }

    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics0 = new org.mafagafogigante.dungeon.stats.BattleStatistics();
    org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.CauseOfDeath> countermap_causeOfDeath1 = battleStatistics0.getKillsByCauseOfDeath();
    java.util.Set<org.mafagafogigante.dungeon.stats.CauseOfDeath> set_causeOfDeath2 = countermap_causeOfDeath1.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_causeOfDeath1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_causeOfDeath2);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test354"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, (-1), 0.0d);
    org.mafagafogigante.dungeon.entity.Weight weight4 = creatureInventory3.getWeight();
    org.mafagafogigante.dungeon.entity.items.Item item5 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.items.CreatureInventory.SimulationResult simulationResult6 = creatureInventory3.simulateItemAddition(item5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight4);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test355"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule1 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeArraySizeRule(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule1);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test356"); }

    org.mafagafogigante.dungeon.entity.items.LocationInventory locationInventory0 = new org.mafagafogigante.dungeon.entity.items.LocationInventory();
    org.mafagafogigante.dungeon.entity.items.Item item1 = null;
    boolean b2 = locationInventory0.hasItem(item1);
    int i3 = locationInventory0.getItemCount();
    org.mafagafogigante.dungeon.entity.items.Item item4 = null;
    // The following exception was thrown during execution in test generation
    try {
    locationInventory0.removeItem(item4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test357"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    java.lang.String str3 = integrity2.toString();
    java.lang.String str4 = integrity2.toString();
    boolean b5 = integrity2.isMaximum();
    int i6 = integrity2.getMaximum();
    int i7 = integrity2.getMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0/1"+ "'", str3.equals("0/1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0/1"+ "'", str4.equals("0/1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test358"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    creaturePreset0.setAttack(57);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity5 = creaturePreset0.getLuminosity();
    creaturePreset0.setInventoryItemLimit(57);
    org.mafagafogigante.dungeon.util.Percentage percentage9 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b11 = percentage9.equals((java.lang.Object)10.0d);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity12 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage9);
    org.mafagafogigante.dungeon.util.Percentage percentage13 = luminosity12.toPercentage();
    java.lang.String str14 = percentage13.toString();
    creaturePreset0.setVisibility(percentage13);
    java.lang.String str16 = creaturePreset0.getType();
    creaturePreset0.setHealth(5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "100.00%"+ "'", str14.equals("100.00%"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test359"); }

    org.mafagafogigante.dungeon.game.Id id0 = null;
    org.mafagafogigante.dungeon.entity.items.BookComponent bookComponent2 = new org.mafagafogigante.dungeon.entity.items.BookComponent(id0, "it is storming");

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test360"); }

    org.mafagafogigante.dungeon.entity.items.FoodComponent foodComponent2 = new org.mafagafogigante.dungeon.entity.items.FoodComponent((int)(short)1, (int)(byte)10);
    int i3 = foodComponent2.getIntegrityDecrementOnEat();
    int i4 = foodComponent2.getIntegrityDecrementOnEat();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test361"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule2 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeBoundIntegerRule((int)(short)100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule2);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test362"); }

    org.mafagafogigante.dungeon.entity.creatures.Hero hero0 = null;
    org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster heroSpellcaster1 = new org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster(hero0);
    java.util.List<org.mafagafogigante.dungeon.spells.Spell> list_spell2 = heroSpellcaster1.getSpellList();
    org.mafagafogigante.dungeon.spells.Spell spell3 = null;
    // The following exception was thrown during execution in test generation
    try {
    heroSpellcaster1.learnSpell(spell3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_spell2);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test363"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date7 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i8 = date3.compareTo(date7);
    long long9 = date7.getDay();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay10 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    int i11 = org.mafagafogigante.dungeon.game.PartOfDay.getSecondsToNext(date7, partOfDay10);
    long long12 = date7.getYear();
    org.mafagafogigante.dungeon.date.Date date16 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date20 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i21 = date16.compareTo(date20);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay22 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date16);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay23 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date16);
    int i24 = org.mafagafogigante.dungeon.game.PartOfDay.getSecondsToNext(date7, partOfDay23);
    long long25 = date7.getMonth();
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit27 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.date.Date date28 = date7.plus(45056, dungeonTimeUnit27);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 10L);
    org.junit.Assert.assertTrue("'" + partOfDay10 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay10.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay22 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay22.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    org.junit.Assert.assertTrue("'" + partOfDay23 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay23.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 82800);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long25 == 10L);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test364"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date7 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i8 = date3.compareTo(date7);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay9 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date3);
    java.lang.String[] str_array15 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table16 = new org.mafagafogigante.dungeon.util.Table(str_array15);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString17 = table16.toColoredStringList();
    org.mafagafogigante.dungeon.game.ColoredString coloredString18 = org.mafagafogigante.dungeon.game.Random.select(list_coloredString17);
    boolean b19 = date3.equals((java.lang.Object)coloredString18);
    org.mafagafogigante.dungeon.date.Date date23 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date27 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i28 = date23.compareTo(date27);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay29 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date23);
    long long30 = date23.getYear();
    org.mafagafogigante.dungeon.date.Date date34 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date38 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i39 = date34.compareTo(date38);
    long long40 = date34.getYear();
    int i41 = date23.compareTo(date34);
    org.mafagafogigante.dungeon.date.Duration duration42 = new org.mafagafogigante.dungeon.date.Duration(date3, date34);
    org.mafagafogigante.dungeon.date.Date date46 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date50 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i51 = date46.compareTo(date50);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay52 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date46);
    java.lang.String[] str_array58 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table59 = new org.mafagafogigante.dungeon.util.Table(str_array58);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString60 = table59.toColoredStringList();
    org.mafagafogigante.dungeon.game.ColoredString coloredString61 = org.mafagafogigante.dungeon.game.Random.select(list_coloredString60);
    boolean b62 = date46.equals((java.lang.Object)coloredString61);
    org.mafagafogigante.dungeon.date.Date date66 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date70 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i71 = date66.compareTo(date70);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay72 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date66);
    long long73 = date66.getYear();
    org.mafagafogigante.dungeon.date.Date date77 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date81 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i82 = date77.compareTo(date81);
    long long83 = date77.getYear();
    int i84 = date66.compareTo(date77);
    org.mafagafogigante.dungeon.date.Duration duration85 = new org.mafagafogigante.dungeon.date.Duration(date46, date77);
    java.lang.String str86 = duration85.toString();
    int i87 = duration42.compareTo(duration85);
    org.mafagafogigante.dungeon.commands.CommandDescription commandDescription90 = new org.mafagafogigante.dungeon.commands.CommandDescription("", "day 10 of month 1 of the year 1");
    java.lang.String str91 = commandDescription90.getInfo();
    java.lang.String str92 = commandDescription90.getName();
    java.lang.String str93 = commandDescription90.getName();
    boolean b94 = duration85.equals((java.lang.Object)str93);
    java.lang.String str95 = duration85.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay9 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay9.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(coloredString18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay29 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay29.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long30 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long40 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay52 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay52.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(coloredString61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay72 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay72.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long73 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long83 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str86 + "' != '" + "Less than a day"+ "'", str86.equals("Less than a day"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str91 + "' != '" + "day 10 of month 1 of the year 1"+ "'", str91.equals("day 10 of month 1 of the year 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str92 + "' != '" + ""+ "'", str92.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str93 + "' != '" + ""+ "'", str93.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str95 + "' != '" + "Less than a day"+ "'", str95.equals("Less than a day"));

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test365"); }

    org.mafagafogigante.dungeon.game.Id id0 = null;
    org.mafagafogigante.dungeon.entity.items.BookComponent bookComponent2 = new org.mafagafogigante.dungeon.entity.items.BookComponent(id0, "0/1");
    int i3 = bookComponent2.getTimeToRead();
    java.lang.String str4 = bookComponent2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "This book teaches nothing. Text: 0/1"+ "'", str4.equals("This book teaches nothing. Text: 0/1"));

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test366"); }

    org.mafagafogigante.dungeon.game.DungeonString dungeonString1 = new org.mafagafogigante.dungeon.game.DungeonString("DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}");
    org.mafagafogigante.dungeon.io.Writer.writeAndWait((org.mafagafogigante.dungeon.game.Writable)dungeonString1);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test367"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, (-1), 0.0d);
    org.mafagafogigante.dungeon.entity.Weight weight4 = creatureInventory3.getWeight();
    int i5 = creatureInventory3.getItemCount();
    int i6 = creatureInventory3.getItemCount();
    org.mafagafogigante.dungeon.entity.Weight weight7 = creatureInventory3.getWeightLimit();
    org.mafagafogigante.dungeon.entity.Weight weight8 = creatureInventory3.getWeight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight8);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test368"); }

    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics0 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point1 = null;
    org.mafagafogigante.dungeon.game.Id id2 = null;
    explorationStatistics0.createEntryIfNotExists(point1, id2);
    org.mafagafogigante.dungeon.game.Point point7 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id8 = null;
    explorationStatistics0.addVisit(point7, id8);
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics10 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point11 = null;
    org.mafagafogigante.dungeon.game.Id id12 = null;
    explorationStatistics10.createEntryIfNotExists(point11, id12);
    org.mafagafogigante.dungeon.game.Point point17 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id18 = null;
    explorationStatistics10.addVisit(point17, id18);
    int i20 = point17.getZ();
    org.mafagafogigante.dungeon.game.Id id21 = null;
    explorationStatistics0.createEntryIfNotExists(point17, id21);
    org.mafagafogigante.dungeon.game.Direction direction23 = org.mafagafogigante.dungeon.game.Direction.UP;
    org.mafagafogigante.dungeon.game.Point point24 = new org.mafagafogigante.dungeon.game.Point(point17, direction23);
    int i25 = point24.getY();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == (-1));
    org.junit.Assert.assertTrue("'" + direction23 + "' != '" + org.mafagafogigante.dungeon.game.Direction.UP + "'", direction23.equals(org.mafagafogigante.dungeon.game.Direction.UP));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test369"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity((int)(short)1, (int)(short)0);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test370"); }

    org.mafagafogigante.dungeon.game.MinimumBoundingRectangle minimumBoundingRectangle2 = new org.mafagafogigante.dungeon.game.MinimumBoundingRectangle(35, 45056);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test371"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.game.Name name2 = itemPreset0.getName();
    int i3 = itemPreset0.getNutrition();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(name2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test372"); }

    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath0 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    org.mafagafogigante.dungeon.entity.creatures.HealthState healthState1 = org.mafagafogigante.dungeon.entity.creatures.HealthState.DEAD;
    boolean b2 = causeOfDeath0.equals((java.lang.Object)healthState1);
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table9 = new org.mafagafogigante.dungeon.util.Table(str_array8);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString10 = table9.toColoredStringList();
    org.mafagafogigante.dungeon.game.ColoredString coloredString11 = org.mafagafogigante.dungeon.game.Random.select(list_coloredString10);
    boolean b12 = causeOfDeath0.equals((java.lang.Object)list_coloredString10);
    java.lang.String str13 = causeOfDeath0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath0);
    org.junit.Assert.assertTrue("'" + healthState1 + "' != '" + org.mafagafogigante.dungeon.entity.creatures.HealthState.DEAD + "'", healthState1.equals(org.mafagafogigante.dungeon.entity.creatures.HealthState.DEAD));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(coloredString11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Unarmed : UNARMED"+ "'", str13.equals("Unarmed : UNARMED"));

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test373"); }

    org.mafagafogigante.dungeon.game.MinimumBoundingRectangle minimumBoundingRectangle2 = new org.mafagafogigante.dungeon.game.MinimumBoundingRectangle(0, (int)(short)0);
    int i3 = minimumBoundingRectangle2.getHeight();
    int i4 = minimumBoundingRectangle2.getWidth();
    int i5 = minimumBoundingRectangle2.getWidth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test374"); }

    boolean b1 = org.mafagafogigante.dungeon.commands.IssuedCommand.isValidSource("Broken");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test375"); }

    org.mafagafogigante.dungeon.logging.DungeonLogger.info("User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 34.4 MiB out of the allocated 123.0 MiB\nOS: Windows 10 (amd64) 10.0");

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test376"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    java.lang.String str5 = itemPreset0.getType();
    int i6 = itemPreset0.getIntegrityDecrementOnEat();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test377"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date7 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i8 = date3.compareTo(date7);
    long long9 = date7.getDay();
    long long10 = date7.getHour();
    java.lang.String str11 = date7.toTimeString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "00:00:00"+ "'", str11.equals("00:00:00"));

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test378"); }

    org.mafagafogigante.dungeon.game.Id id0 = null;
    org.mafagafogigante.dungeon.entity.items.BookComponent bookComponent2 = new org.mafagafogigante.dungeon.entity.items.BookComponent(id0, "0/1");
    int i3 = bookComponent2.getTimeToRead();
    int i4 = bookComponent2.getTimeToRead();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test379"); }

    org.mafagafogigante.dungeon.achievements.Achievement achievement0 = null;
    org.mafagafogigante.dungeon.date.Date date4 = new org.mafagafogigante.dungeon.date.Date((long)32, (long)(short)10, 0L);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.achievements.UnlockedAchievement unlockedAchievement5 = new org.mafagafogigante.dungeon.achievements.UnlockedAchievement(achievement0, date4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test380"); }

    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory0 = null;
    org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory corpseItemPresetFactory1 = new org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory(creatureFactory0);
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory2 = null;
    org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory corpseItemPresetFactory3 = new org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory(creatureFactory2);
    org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] creaturePresetFactory_array4 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] {  };
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory5 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array4);
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory6 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array4);
    org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory corpseItemPresetFactory7 = new org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory(creatureFactory6);
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory8 = null;
    org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory corpseItemPresetFactory9 = new org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory(creatureFactory8);
    org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] creaturePresetFactory_array10 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] {  };
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory11 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array10);
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory12 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array10);
    org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory corpseItemPresetFactory13 = new org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory(creatureFactory12);
    org.mafagafogigante.dungeon.entity.items.ItemPresetFactory[] itemPresetFactory_array14 = new org.mafagafogigante.dungeon.entity.items.ItemPresetFactory[] { corpseItemPresetFactory1, corpseItemPresetFactory3, corpseItemPresetFactory7, corpseItemPresetFactory9, corpseItemPresetFactory13 };
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.items.ItemFactory itemFactory15 = new org.mafagafogigante.dungeon.entity.items.ItemFactory(itemPresetFactory_array14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creaturePresetFactory_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creaturePresetFactory_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemPresetFactory_array14);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test381"); }

    org.mafagafogigante.dungeon.commands.IssuedCommand issuedCommand1 = new org.mafagafogigante.dungeon.commands.IssuedCommand("a few Nights");
    org.mafagafogigante.dungeon.util.StopWatch stopWatch2 = new org.mafagafogigante.dungeon.util.StopWatch();
    java.util.concurrent.TimeUnit timeUnit3 = null;
    java.lang.String str4 = stopWatch2.toString(timeUnit3);
    java.util.concurrent.TimeUnit timeUnit5 = null;
    java.lang.String str6 = stopWatch2.toString(timeUnit5);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.game.Game.renderTurn(issuedCommand1, stopWatch2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test382"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    creaturePreset0.setAttack(57);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity5 = creaturePreset0.getLuminosity();
    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset6 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id7 = null;
    creaturePreset6.setWeaponId(id7);
    creaturePreset6.setAttack(57);
    org.mafagafogigante.dungeon.game.Id[] id_array11 = new org.mafagafogigante.dungeon.game.Id[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.game.Id> arraylist_id12 = new java.util.ArrayList<org.mafagafogigante.dungeon.game.Id>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.game.Id>)arraylist_id12, id_array11);
    creaturePreset6.setItems((java.util.List<org.mafagafogigante.dungeon.game.Id>)arraylist_id12);
    creaturePreset0.setItems((java.util.List<org.mafagafogigante.dungeon.game.Id>)arraylist_id12);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset16 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity17 = itemPreset16.getIntegrity();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity18 = itemPreset16.getLuminosity();
    org.mafagafogigante.dungeon.util.Percentage percentage20 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset16.setVisibility(percentage20);
    creaturePreset0.setVisibility(percentage20);
    creaturePreset0.setInventoryWeightLimit((double)'4');
    int i25 = creaturePreset0.getHealth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(id_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test383"); }

    org.mafagafogigante.dungeon.game.Point point3 = new org.mafagafogigante.dungeon.game.Point(10, (int)'a', 0);
    int i4 = point3.getY();
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule5 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeIdRule();
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule7 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeArraySizeRule((int)(short)0);
    java.util.Map<java.lang.String,org.mafagafogigante.dungeon.schema.JsonRule> map_str_jsonRule8 = null;
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule9 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeObjectRule(map_str_jsonRule8);
    org.mafagafogigante.dungeon.schema.JsonRule[] jsonRule_array10 = new org.mafagafogigante.dungeon.schema.JsonRule[] { jsonRule5, jsonRule7, jsonRule9 };
    java.util.ArrayList<org.mafagafogigante.dungeon.schema.JsonRule> arraylist_jsonRule11 = new java.util.ArrayList<org.mafagafogigante.dungeon.schema.JsonRule>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.schema.JsonRule>)arraylist_jsonRule11, jsonRule_array10);
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule13 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeFixedArrayRule((java.util.List<org.mafagafogigante.dungeon.schema.JsonRule>)arraylist_jsonRule11);
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule14 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeVariableArrayRule(jsonRule13);
    boolean b15 = point3.equals((java.lang.Object)jsonRule13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test384"); }

    org.mafagafogigante.dungeon.util.SystemInformation systemInformation0 = new org.mafagafogigante.dungeon.util.SystemInformation();
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString1 = systemInformation0.toColoredStringList();
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)systemInformation0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString1);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test385"); }

    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances0 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.Direction direction1 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b3 = direction1.equalsIgnoreCase("");
    blockedEntrances0.block(direction1);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances5 = new org.mafagafogigante.dungeon.game.BlockedEntrances(blockedEntrances0);
    org.mafagafogigante.dungeon.game.Direction direction6 = org.mafagafogigante.dungeon.game.Direction.EAST;
    org.mafagafogigante.dungeon.game.Direction direction7 = direction6.invert();
    blockedEntrances5.block(direction7);
    org.mafagafogigante.dungeon.game.Direction direction9 = org.mafagafogigante.dungeon.game.Direction.EAST;
    java.lang.String str10 = direction9.toString();
    java.lang.String str11 = direction9.toString();
    blockedEntrances5.block(direction9);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = blockedEntrances5.toString();
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + direction1 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction1.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    org.junit.Assert.assertTrue("'" + direction6 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction6.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    org.junit.Assert.assertTrue("'" + direction7 + "' != '" + org.mafagafogigante.dungeon.game.Direction.WEST + "'", direction7.equals(org.mafagafogigante.dungeon.game.Direction.WEST));
    org.junit.Assert.assertTrue("'" + direction9 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction9.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "East"+ "'", str10.equals("East"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "East"+ "'", str11.equals("East"));

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test386"); }

    org.mafagafogigante.dungeon.commands.CommandHistory commandHistory0 = new org.mafagafogigante.dungeon.commands.CommandHistory();
    java.lang.String str2 = commandHistory0.getLastSimilarCommand("");
    java.lang.String str4 = commandHistory0.getLastSimilarCommand("Unarmed : UNARMED");
    org.mafagafogigante.dungeon.commands.CommandHistory.Cursor cursor5 = commandHistory0.getCursor();
    cursor5.moveToEnd();
    cursor5.moveToEnd();
    cursor5.moveToEnd();
    org.mafagafogigante.dungeon.commands.CommandHistory.Cursor cursor9 = cursor5.moveDown();
    java.lang.String str10 = cursor5.getSelectedCommand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cursor5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cursor9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test387"); }

    boolean b1 = org.mafagafogigante.dungeon.commands.IssuedCommand.isValidSource("0 kg");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test388"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature1 = null;
    org.mafagafogigante.dungeon.entity.creatures.CreatureHealth creatureHealth2 = org.mafagafogigante.dungeon.entity.creatures.CreatureHealth.makeCreatureHealth(100, creature1);
    creatureHealth2.incrementBy(57);
    boolean b5 = creatureHealth2.isAlive();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creatureHealth2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test389"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications2 = new org.mafagafogigante.dungeon.gui.WritingSpecifications(false, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test390"); }

    org.mafagafogigante.dungeon.game.Numeral numeral1 = org.mafagafogigante.dungeon.game.Numeral.getCorrespondingNumeral(100);
    org.junit.Assert.assertTrue("'" + numeral1 + "' != '" + org.mafagafogigante.dungeon.game.Numeral.MORE_THAN_FIVE + "'", numeral1.equals(org.mafagafogigante.dungeon.game.Numeral.MORE_THAN_FIVE));

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test391"); }

    org.mafagafogigante.dungeon.util.CircularList<java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>> circularlist_comparable_weight1 = new org.mafagafogigante.dungeon.util.CircularList<java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>>(100);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature2 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory5 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature2, (-1), 0.0d);
    org.mafagafogigante.dungeon.entity.Weight weight6 = creatureInventory5.getWeight();
    circularlist_comparable_weight1.add((java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>)weight6);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight> comparable_weight9 = circularlist_comparable_weight1.get(45056);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight6);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test392"); }

    org.mafagafogigante.dungeon.util.Messenger.printFailedToCreateDirectoryMessage("visibilityCriteria=VisibilityCriteria{[]}");

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test393"); }

    org.mafagafogigante.dungeon.util.Percentage percentage2 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    org.mafagafogigante.dungeon.entity.items.WeaponComponent weaponComponent4 = new org.mafagafogigante.dungeon.entity.items.WeaponComponent(5, percentage2, 46800);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test394"); }

    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array0 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria1 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array0);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature2 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer3 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature2);
    boolean b4 = visibilityCriteria1.isMetBy(observer3);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array5 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item6 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item6, item_array5);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString9 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString9.append(str_array14);
    observer3.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item6, dungeonString9);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array17 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item18 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item18, item_array17);
    java.lang.String[] str_array25 = new java.lang.String[] { "CounterMap{map={}}", "User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 34.4 MiB out of the allocated 123.0 MiB\nOS: Windows 10 (amd64) 10.0", "hi!", "0 ms", "User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 41.5 MiB out of the allocated 154.5 MiB\nOS: Windows 10 (amd64) 10.0" };
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item26 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item18, str_array25);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString28 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    observer3.writeItemSight(list_item26, dungeonString28);
    int i30 = dungeonString28.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 3);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test395"); }

    org.mafagafogigante.dungeon.game.LocationPreset locationPreset0 = null;
    org.mafagafogigante.dungeon.game.World world1 = null;
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics2 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics3 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point4 = null;
    org.mafagafogigante.dungeon.game.Id id5 = null;
    explorationStatistics3.createEntryIfNotExists(point4, id5);
    org.mafagafogigante.dungeon.game.Point point10 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id11 = null;
    explorationStatistics3.addVisit(point10, id11);
    boolean b13 = explorationStatistics2.hasBeenSeen(point10);
    org.mafagafogigante.dungeon.game.Point point17 = new org.mafagafogigante.dungeon.game.Point(10, (int)'a', 0);
    int i18 = point17.getY();
    org.mafagafogigante.dungeon.game.Id id19 = null;
    explorationStatistics2.addVisit(point17, id19);
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics21 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point22 = null;
    org.mafagafogigante.dungeon.game.Id id23 = null;
    explorationStatistics21.createEntryIfNotExists(point22, id23);
    org.mafagafogigante.dungeon.game.Point point28 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id29 = null;
    explorationStatistics21.addVisit(point28, id29);
    boolean b31 = explorationStatistics2.hasBeenSeen(point28);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.game.Location location32 = new org.mafagafogigante.dungeon.game.Location(locationPreset0, world1, point28);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test396"); }

    org.mafagafogigante.dungeon.commands.CommandHistory commandHistory0 = new org.mafagafogigante.dungeon.commands.CommandHistory();
    java.lang.String str2 = commandHistory0.getLastSimilarCommand("");
    java.lang.String str4 = commandHistory0.getLastSimilarCommand("Unarmed : UNARMED");
    org.mafagafogigante.dungeon.commands.CommandHistory.Cursor cursor5 = commandHistory0.getCursor();
    java.lang.String str6 = cursor5.getSelectedCommand();
    org.mafagafogigante.dungeon.commands.CommandHistory.Cursor cursor7 = cursor5.moveDown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cursor5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cursor7);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test397"); }

    org.mafagafogigante.dungeon.game.Point point3 = new org.mafagafogigante.dungeon.game.Point(100, 10, (int)(byte)10);
    java.lang.String str4 = point3.toString();
    int i5 = point3.getZ();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{100, 10, 10}"+ "'", str4.equals("{100, 10, 10}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test398"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity(46800, 81);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test399"); }

    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances0 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.Direction direction1 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b3 = direction1.equalsIgnoreCase("");
    blockedEntrances0.block(direction1);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances5 = new org.mafagafogigante.dungeon.game.BlockedEntrances(blockedEntrances0);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances6 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.Direction direction7 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b8 = blockedEntrances6.isBlocked(direction7);
    boolean b10 = direction7.equalsIgnoreCase("");
    java.lang.String str11 = direction7.toString();
    blockedEntrances5.block(direction7);
    org.mafagafogigante.dungeon.game.Direction direction13 = direction7.invert();
    org.junit.Assert.assertTrue("'" + direction1 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction1.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    org.junit.Assert.assertTrue("'" + direction7 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction7.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "East"+ "'", str11.equals("East"));
    org.junit.Assert.assertTrue("'" + direction13 + "' != '" + org.mafagafogigante.dungeon.game.Direction.WEST + "'", direction13.equals(org.mafagafogigante.dungeon.game.Direction.WEST));

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test400"); }

    org.mafagafogigante.dungeon.entity.Entity[] entity_array0 = new org.mafagafogigante.dungeon.entity.Entity[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.Entity> arraylist_entity1 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.Entity>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.Entity>)arraylist_entity1, entity_array0);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity3 = org.mafagafogigante.dungeon.entity.Luminosity.resultantLuminosity((java.util.Collection<org.mafagafogigante.dungeon.entity.Entity>)arraylist_entity1);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity4 = org.mafagafogigante.dungeon.entity.Luminosity.resultantLuminosity((java.util.Collection<org.mafagafogigante.dungeon.entity.Entity>)arraylist_entity1);
    org.mafagafogigante.dungeon.util.Percentage percentage5 = luminosity4.toPercentage();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(entity_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage5);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test401"); }

    org.mafagafogigante.dungeon.io.Writer.write("Visibility of 100.00%");

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test402"); }

    org.mafagafogigante.dungeon.util.StopWatch stopWatch2 = new org.mafagafogigante.dungeon.util.StopWatch();
    java.lang.String str3 = stopWatch2.toString();
    org.mafagafogigante.dungeon.logging.DungeonLogger.logCommandRenderingReport("BattleStatistics{records=CounterMap{map={}}}", "day 10 of month 1 of the year 1", stopWatch2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 ms"+ "'", str3.equals("0 ms"));

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test403"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    java.lang.String str5 = itemPreset0.getType();
    itemPreset0.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage9 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset0.setVisibility(percentage9);
    org.mafagafogigante.dungeon.game.Id id11 = null;
    itemPreset0.setId(id11);
    itemPreset0.setPutrefactionPeriod((long)(short)1);
    int i15 = itemPreset0.getDrinkableHealing();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay16 = org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT;
    org.mafagafogigante.dungeon.game.Name name17 = partOfDay16.getName();
    itemPreset0.setName(name17);
    org.mafagafogigante.dungeon.entity.Integrity integrity19 = itemPreset0.getIntegrity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay16 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay16.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity19);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test404"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    org.mafagafogigante.dungeon.game.Id id3 = creaturePreset0.getId();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset4 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity5 = itemPreset4.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity6 = null;
    itemPreset4.setIntegrity(integrity6);
    org.mafagafogigante.dungeon.util.Percentage percentage8 = itemPreset4.getVisibility();
    java.lang.String str9 = itemPreset4.getType();
    itemPreset4.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.entity.TagSet<org.mafagafogigante.dungeon.entity.items.Item.Tag> tagset_tag12 = itemPreset4.getTagSet();
    org.mafagafogigante.dungeon.entity.Weight weight14 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    itemPreset4.setWeight(weight14);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset16 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity17 = itemPreset16.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity18 = null;
    itemPreset16.setIntegrity(integrity18);
    org.mafagafogigante.dungeon.util.Percentage percentage21 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    itemPreset16.setHitRate(percentage21);
    itemPreset4.setHitRate(percentage21);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity24 = itemPreset4.getLuminosity();
    creaturePreset0.setLuminosity(luminosity24);
    org.mafagafogigante.dungeon.game.Name name26 = creaturePreset0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tagset_tag12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(name26);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test405"); }

    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array0 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria1 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array0);
    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array2 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria3 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array2);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature4 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer5 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature4);
    boolean b6 = visibilityCriteria3.isMetBy(observer5);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array7 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item8 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item8, item_array7);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString11 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    observer5.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item8, dungeonString11);
    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array13 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria14 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array13);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature15 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer16 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature15);
    boolean b17 = visibilityCriteria14.isMetBy(observer16);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array18 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item19 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item19, item_array18);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString22 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    observer16.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item19, dungeonString22);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString25 = new org.mafagafogigante.dungeon.game.DungeonString("");
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString26 = dungeonString25.toColoredStringList();
    observer5.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item19, dungeonString25);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature28 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory31 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature28, 0, (double)35);
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item32 = creatureInventory31.getItems();
    org.mafagafogigante.dungeon.game.DungeonString dungeonString34 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array39 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString34.append(str_array39);
    java.lang.String[] str_array46 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table47 = new org.mafagafogigante.dungeon.util.Table(str_array46);
    dungeonString34.append(str_array46);
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications51 = new org.mafagafogigante.dungeon.gui.WritingSpecifications(false, 32);
    boolean b52 = writingSpecifications51.shouldWait();
    int i53 = writingSpecifications51.getWait();
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)dungeonString34, writingSpecifications51);
    observer5.writeItemSight(list_item32, dungeonString34);
    boolean b56 = visibilityCriteria1.isMetBy(observer5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test406"); }

    org.mafagafogigante.dungeon.stats.Statistics statistics0 = new org.mafagafogigante.dungeon.stats.Statistics();
    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics1 = statistics0.getBattleStatistics();
    org.mafagafogigante.dungeon.commands.IssuedCommand issuedCommand2 = null;
    // The following exception was thrown during execution in test generation
    try {
    statistics0.addCommand(issuedCommand2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(battleStatistics1);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test407"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.entity.Integrity integrity4 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.util.Percentage percentage5 = itemPreset0.getHitRate();
    itemPreset0.setNutrition((int)(short)1);
    int i8 = itemPreset0.getNutrition();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test408"); }

    boolean b1 = org.mafagafogigante.dungeon.commands.IssuedCommand.isValidSource("97 B");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test409"); }

    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array0 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria1 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array0);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature2 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer3 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature2);
    boolean b4 = visibilityCriteria1.isMetBy(observer3);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array5 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item6 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item6, item_array5);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString9 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString9.append(str_array14);
    observer3.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item6, dungeonString9);
    org.mafagafogigante.dungeon.entity.creatures.Creature[] creature_array17 = new org.mafagafogigante.dungeon.entity.creatures.Creature[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Creature> arraylist_creature18 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Creature>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.Creature>)arraylist_creature18, creature_array17);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString21 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array26 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString21.append(str_array26);
    java.lang.String str28 = dungeonString21.toString();
    org.mafagafogigante.dungeon.game.Point point32 = new org.mafagafogigante.dungeon.game.Point(10, (int)'a', 0);
    java.lang.String[] str_array35 = new java.lang.String[] { "", "" };
    org.mafagafogigante.dungeon.util.Table table36 = new org.mafagafogigante.dungeon.util.Table(str_array35);
    boolean b37 = point32.equals((java.lang.Object)str_array35);
    dungeonString21.append(str_array35);
    observer3.writeCreatureSight((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Creature>)arraylist_creature18, dungeonString21);
    // The following exception was thrown during execution in test generation
    try {
    observer3.look();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creature_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"+ "'", str28.equals("DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test410"); }

    org.mafagafogigante.dungeon.logging.DungeonLogger.warning("CounterMap{map={}}");

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test411"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature1 = null;
    org.mafagafogigante.dungeon.entity.creatures.CreatureHealth creatureHealth2 = org.mafagafogigante.dungeon.entity.creatures.CreatureHealth.makeCreatureHealth(100, creature1);
    creatureHealth2.incrementBy(57);
    creatureHealth2.incrementBy(32);
    boolean b7 = creatureHealth2.isFull();
    boolean b8 = creatureHealth2.isAlive();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creatureHealth2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test412"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    org.mafagafogigante.dungeon.game.Id id3 = creaturePreset0.getId();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset4 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity5 = itemPreset4.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity6 = null;
    itemPreset4.setIntegrity(integrity6);
    org.mafagafogigante.dungeon.util.Percentage percentage8 = itemPreset4.getVisibility();
    java.lang.String str9 = itemPreset4.getType();
    itemPreset4.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.entity.TagSet<org.mafagafogigante.dungeon.entity.items.Item.Tag> tagset_tag12 = itemPreset4.getTagSet();
    org.mafagafogigante.dungeon.entity.Weight weight14 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    itemPreset4.setWeight(weight14);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset16 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity17 = itemPreset16.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity18 = null;
    itemPreset16.setIntegrity(integrity18);
    org.mafagafogigante.dungeon.util.Percentage percentage21 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    itemPreset16.setHitRate(percentage21);
    itemPreset4.setHitRate(percentage21);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity24 = itemPreset4.getLuminosity();
    creaturePreset0.setLuminosity(luminosity24);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity26 = creaturePreset0.getLuminosity();
    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset27 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity28 = creaturePreset27.getLuminosity();
    org.mafagafogigante.dungeon.entity.LightSource lightSource29 = new org.mafagafogigante.dungeon.entity.LightSource(luminosity28);
    creaturePreset0.setLuminosity(luminosity28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tagset_tag12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity28);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test413"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    creaturePreset0.setAttack(57);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity5 = creaturePreset0.getLuminosity();
    int i6 = creaturePreset0.getInventoryItemLimit();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay7 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity8 = partOfDay7.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name9 = partOfDay7.getName();
    java.lang.String str11 = name9.getQuantifiedName((int)'a');
    java.lang.String str12 = name9.getSingular();
    java.lang.String str13 = name9.getPlural();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset14 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity15 = itemPreset14.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity16 = null;
    itemPreset14.setIntegrity(integrity16);
    org.mafagafogigante.dungeon.entity.Integrity integrity18 = itemPreset14.getIntegrity();
    org.mafagafogigante.dungeon.util.Percentage percentage19 = itemPreset14.getHitRate();
    boolean b20 = name9.equals((java.lang.Object)percentage19);
    creaturePreset0.setName(name9);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset22 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity23 = itemPreset22.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity24 = null;
    itemPreset22.setIntegrity(integrity24);
    org.mafagafogigante.dungeon.util.Percentage percentage26 = itemPreset22.getVisibility();
    java.lang.String str27 = itemPreset22.getType();
    itemPreset22.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.entity.TagSet<org.mafagafogigante.dungeon.entity.items.Item.Tag> tagset_tag30 = itemPreset22.getTagSet();
    org.mafagafogigante.dungeon.entity.Weight weight32 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    itemPreset22.setWeight(weight32);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset34 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity35 = itemPreset34.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity36 = null;
    itemPreset34.setIntegrity(integrity36);
    org.mafagafogigante.dungeon.util.Percentage percentage39 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    itemPreset34.setHitRate(percentage39);
    itemPreset22.setHitRate(percentage39);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity42 = itemPreset22.getLuminosity();
    creaturePreset0.setLuminosity(luminosity42);
    creaturePreset0.setType("0 B");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay7 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay7.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "a few Nights"+ "'", str11.equals("a few Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Night"+ "'", str12.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Nights"+ "'", str13.equals("Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tagset_tag30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity42);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test414"); }

    org.mafagafogigante.dungeon.world.WeatherCondition weatherCondition0 = org.mafagafogigante.dungeon.world.WeatherCondition.STORM;
    org.mafagafogigante.dungeon.world.WeatherCondition weatherCondition1 = org.mafagafogigante.dungeon.world.WeatherCondition.RAIN;
    java.lang.String str2 = weatherCondition1.toDescriptiveString();
    java.lang.String str3 = weatherCondition1.toDescriptiveString();
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.world.WeatherConditionVisibilityCriterion weatherConditionVisibilityCriterion4 = new org.mafagafogigante.dungeon.world.WeatherConditionVisibilityCriterion(weatherCondition0, weatherCondition1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + weatherCondition0 + "' != '" + org.mafagafogigante.dungeon.world.WeatherCondition.STORM + "'", weatherCondition0.equals(org.mafagafogigante.dungeon.world.WeatherCondition.STORM));
    org.junit.Assert.assertTrue("'" + weatherCondition1 + "' != '" + org.mafagafogigante.dungeon.world.WeatherCondition.RAIN + "'", weatherCondition1.equals(org.mafagafogigante.dungeon.world.WeatherCondition.RAIN));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "it is raining"+ "'", str2.equals("it is raining"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "it is raining"+ "'", str3.equals("it is raining"));

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test415"); }

    // The following exception was thrown during execution in test generation
    try {
    int i2 = org.mafagafogigante.dungeon.game.Random.nextInteger(32, 5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test416"); }

    org.mafagafogigante.dungeon.stats.Statistics statistics0 = null;
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker1 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics0);
    org.mafagafogigante.dungeon.achievements.AchievementStore achievementStore2 = null;
    org.mafagafogigante.dungeon.date.Date date6 = new org.mafagafogigante.dungeon.date.Date((long)'a', (long)1, (long)81);
    org.mafagafogigante.dungeon.world.Weather weather7 = new org.mafagafogigante.dungeon.world.Weather(date6);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay8 = org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity9 = partOfDay8.getLuminosity();
    int i10 = org.mafagafogigante.dungeon.game.PartOfDay.getSecondsToNext(date6, partOfDay8);
    // The following exception was thrown during execution in test generation
    try {
    achievementTracker1.update(achievementStore2, date6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + partOfDay8 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay8.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 82800);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test417"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, (int)'#', (double)'#');
    org.mafagafogigante.dungeon.entity.items.Item item4 = null;
    // The following exception was thrown during execution in test generation
    try {
    creatureInventory3.addItem(item4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test418"); }

    org.mafagafogigante.dungeon.game.Point point3 = new org.mafagafogigante.dungeon.game.Point(10, (int)'a', 0);
    java.lang.String str4 = point3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{10, 97, 0}"+ "'", str4.equals("{10, 97, 0}"));

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test419"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table6 = new org.mafagafogigante.dungeon.util.Table(str_array5);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString7 = table6.toColoredStringList();
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications8 = null;
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)table6, writingSpecifications8);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString10 = table6.toColoredStringList();
    table6.insertSeparator();
    org.mafagafogigante.dungeon.game.Point point15 = new org.mafagafogigante.dungeon.game.Point(10, (int)'a', 0);
    java.lang.String[] str_array18 = new java.lang.String[] { "", "" };
    org.mafagafogigante.dungeon.util.Table table19 = new org.mafagafogigante.dungeon.util.Table(str_array18);
    boolean b20 = point15.equals((java.lang.Object)str_array18);
    // The following exception was thrown during execution in test generation
    try {
    table6.insertRow(str_array18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test420"); }

    org.mafagafogigante.dungeon.entity.items.FoodComponent foodComponent2 = new org.mafagafogigante.dungeon.entity.items.FoodComponent((-1), 46800);
    int i3 = foodComponent2.getNutrition();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test421"); }

    org.mafagafogigante.dungeon.game.Point point3 = new org.mafagafogigante.dungeon.game.Point(152, (int)(byte)100, 17518);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature5 = null;
    org.mafagafogigante.dungeon.entity.creatures.CreatureHealth creatureHealth6 = org.mafagafogigante.dungeon.entity.creatures.CreatureHealth.makeCreatureHealth(100, creature5);
    boolean b7 = point3.equals((java.lang.Object)creature5);
    int i8 = point3.getY();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creatureHealth6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test422"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity((int)(byte)1, (int)(byte)0);
    boolean b3 = integrity2.isZero();
    java.lang.String str4 = integrity2.toString();
    integrity2.decrementBy(5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0/1"+ "'", str4.equals("0/1"));

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test423"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature1 = null;
    org.mafagafogigante.dungeon.entity.creatures.CreatureHealth creatureHealth2 = org.mafagafogigante.dungeon.entity.creatures.CreatureHealth.makeCreatureHealth(100, creature1);
    boolean b3 = creatureHealth2.isAlive();
    boolean b4 = creatureHealth2.isDead();
    creatureHealth2.decrementBy((int)(short)-1);
    boolean b7 = creatureHealth2.isDead();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creatureHealth2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test424"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    boolean b5 = itemPreset0.isUnique();
    org.mafagafogigante.dungeon.entity.Weight weight7 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    org.mafagafogigante.dungeon.entity.Weight weight8 = org.mafagafogigante.dungeon.entity.Weight.ZERO;
    org.mafagafogigante.dungeon.entity.Weight weight9 = weight7.add(weight8);
    java.lang.String str10 = weight9.toString();
    itemPreset0.setWeight(weight9);
    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset12 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id13 = null;
    creaturePreset12.setWeaponId(id13);
    creaturePreset12.setAttack(57);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity17 = creaturePreset12.getLuminosity();
    int i18 = creaturePreset12.getInventoryItemLimit();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay19 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity20 = partOfDay19.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name21 = partOfDay19.getName();
    java.lang.String str23 = name21.getQuantifiedName((int)'a');
    java.lang.String str24 = name21.getSingular();
    java.lang.String str25 = name21.getPlural();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset26 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity27 = itemPreset26.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity28 = null;
    itemPreset26.setIntegrity(integrity28);
    org.mafagafogigante.dungeon.entity.Integrity integrity30 = itemPreset26.getIntegrity();
    org.mafagafogigante.dungeon.util.Percentage percentage31 = itemPreset26.getHitRate();
    boolean b32 = name21.equals((java.lang.Object)percentage31);
    creaturePreset12.setName(name21);
    org.mafagafogigante.dungeon.util.Percentage percentage35 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b37 = percentage35.equals((java.lang.Object)10.0d);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity38 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage35);
    creaturePreset12.setVisibility(percentage35);
    org.mafagafogigante.dungeon.entity.Weight weight40 = weight9.multiply(percentage35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0 kg"+ "'", str10.equals("0 kg"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay19 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay19.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "a few Nights"+ "'", str23.equals("a few Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Night"+ "'", str24.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Nights"+ "'", str25.equals("Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight40);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test425"); }

    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics0 = new org.mafagafogigante.dungeon.stats.WorldStatistics();
    worldStatistics0.addLocation("User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 34.4 MiB out of the allocated 123.0 MiB\nOS: Windows 10 (amd64) 10.0");
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.game.World world3 = new org.mafagafogigante.dungeon.game.World(worldStatistics0);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test426"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    creaturePreset0.setAttack(57);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity5 = creaturePreset0.getLuminosity();
    org.mafagafogigante.dungeon.entity.creatures.Creature.Tag tag6 = org.mafagafogigante.dungeon.entity.creatures.Creature.Tag.MILKABLE;
    boolean b7 = creaturePreset0.hasTag(tag6);
    org.mafagafogigante.dungeon.entity.creatures.Creature.Tag tag8 = org.mafagafogigante.dungeon.entity.creatures.Creature.Tag.CORPSE;
    boolean b9 = creaturePreset0.hasTag(tag8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity5);
    org.junit.Assert.assertTrue("'" + tag6 + "' != '" + org.mafagafogigante.dungeon.entity.creatures.Creature.Tag.MILKABLE + "'", tag6.equals(org.mafagafogigante.dungeon.entity.creatures.Creature.Tag.MILKABLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    org.junit.Assert.assertTrue("'" + tag8 + "' != '" + org.mafagafogigante.dungeon.entity.creatures.Creature.Tag.CORPSE + "'", tag8.equals(org.mafagafogigante.dungeon.entity.creatures.Creature.Tag.CORPSE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test427"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    java.lang.String str5 = itemPreset0.getType();
    org.mafagafogigante.dungeon.entity.items.Item.Tag tag6 = org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE;
    itemPreset0.addTag(tag6);
    org.mafagafogigante.dungeon.game.Name name8 = itemPreset0.getName();
    itemPreset0.setDamage((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    org.junit.Assert.assertTrue("'" + tag6 + "' != '" + org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE + "'", tag6.equals(org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(name8);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test428"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    java.lang.String str5 = itemPreset0.getType();
    itemPreset0.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.entity.TagSet<org.mafagafogigante.dungeon.entity.items.Item.Tag> tagset_tag8 = itemPreset0.getTagSet();
    org.mafagafogigante.dungeon.entity.Weight weight10 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    itemPreset0.setWeight(weight10);
    org.mafagafogigante.dungeon.util.Percentage percentage13 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset0.setVisibility(percentage13);
    itemPreset0.setUnique(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tagset_tag8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight10);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test429"); }

    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics0 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics1 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point2 = null;
    org.mafagafogigante.dungeon.game.Id id3 = null;
    explorationStatistics1.createEntryIfNotExists(point2, id3);
    org.mafagafogigante.dungeon.game.Point point8 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id9 = null;
    explorationStatistics1.addVisit(point8, id9);
    boolean b11 = explorationStatistics0.hasBeenSeen(point8);
    java.lang.String str12 = point8.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{32, 0, -1}"+ "'", str12.equals("{32, 0, -1}"));

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test430"); }

    org.mafagafogigante.dungeon.achievements.Achievement achievement0 = null;
    org.mafagafogigante.dungeon.date.Date date4 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date8 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i9 = date4.compareTo(date8);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay10 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date4);
    java.lang.String[] str_array16 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table17 = new org.mafagafogigante.dungeon.util.Table(str_array16);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString18 = table17.toColoredStringList();
    org.mafagafogigante.dungeon.game.ColoredString coloredString19 = org.mafagafogigante.dungeon.game.Random.select(list_coloredString18);
    boolean b20 = date4.equals((java.lang.Object)coloredString19);
    org.mafagafogigante.dungeon.date.Date date24 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date28 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i29 = date24.compareTo(date28);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay30 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date24);
    long long31 = date24.getYear();
    org.mafagafogigante.dungeon.date.Date date35 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date39 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i40 = date35.compareTo(date39);
    long long41 = date35.getYear();
    int i42 = date24.compareTo(date35);
    org.mafagafogigante.dungeon.date.Duration duration43 = new org.mafagafogigante.dungeon.date.Duration(date4, date35);
    org.mafagafogigante.dungeon.date.Date date48 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date52 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i53 = date48.compareTo(date52);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay54 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date48);
    long long55 = date48.getYear();
    org.mafagafogigante.dungeon.date.Date date59 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date63 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i64 = date59.compareTo(date63);
    long long65 = date59.getYear();
    int i66 = date48.compareTo(date59);
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit68 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR;
    org.mafagafogigante.dungeon.date.Date date69 = date59.minus(35, dungeonTimeUnit68);
    org.mafagafogigante.dungeon.date.Date date70 = date35.plus(3, dungeonTimeUnit68);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.achievements.UnlockedAchievement unlockedAchievement71 = new org.mafagafogigante.dungeon.achievements.UnlockedAchievement(achievement0, date70);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay10 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay10.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(coloredString19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay30 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay30.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long31 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long41 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay54 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay54.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long55 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long65 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit68 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR + "'", dungeonTimeUnit68.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date70);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test431"); }

    java.awt.Color color1 = null;
    org.mafagafogigante.dungeon.game.LocationDescription locationDescription2 = new org.mafagafogigante.dungeon.game.LocationDescription('a', color1);
    java.awt.Color color3 = locationDescription2.getColor();
    locationDescription2.setInfo("Night");
    java.lang.String str6 = locationDescription2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(color3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "LocationDescription{symbol=a, color=null, info='Night'}"+ "'", str6.equals("LocationDescription{symbol=a, color=null, info='Night'}"));

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test432"); }

    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array0 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria1 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array0);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature2 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer3 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature2);
    boolean b4 = visibilityCriteria1.isMetBy(observer3);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array5 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item6 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item6, item_array5);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString9 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    observer3.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item6, dungeonString9);
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)dungeonString9);
    dungeonString9.resetColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test433"); }

    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery0 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    java.lang.String str1 = battleStatisticsQuery0.toString();
    battleStatisticsQuery0.setType("Badly Injured");
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay4 = org.mafagafogigante.dungeon.game.PartOfDay.DUSK;
    battleStatisticsQuery0.setPartOfDay(partOfDay4);
    battleStatisticsQuery0.setType("Luminosity of 40.00%");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "BattleStatisticsQuery{id=null, type='null', causeOfDeath=null, partOfDay=null}"+ "'", str1.equals("BattleStatisticsQuery{id=null, type='null', causeOfDeath=null, partOfDay=null}"));
    org.junit.Assert.assertTrue("'" + partOfDay4 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.DUSK + "'", partOfDay4.equals(org.mafagafogigante.dungeon.game.PartOfDay.DUSK));

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test434"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    creaturePreset0.setAttack(57);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity5 = creaturePreset0.getLuminosity();
    creaturePreset0.setInventoryItemLimit(57);
    org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId attackAlgorithmId8 = creaturePreset0.getAttackAlgorithmId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(attackAlgorithmId8);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test435"); }

    org.mafagafogigante.dungeon.schema.JsonRule[] jsonRule_array0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule1 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeGroupRule(jsonRule_array0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test436"); }

    org.mafagafogigante.dungeon.game.DungeonString dungeonString1 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString1.append(str_array6);
    java.lang.String[] str_array13 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table14 = new org.mafagafogigante.dungeon.util.Table(str_array13);
    dungeonString1.append(str_array13);
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications16 = null;
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)dungeonString1, writingSpecifications16);
    int i18 = dungeonString1.getLength();
    org.mafagafogigante.dungeon.date.Date date22 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date26 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i27 = date22.compareTo(date26);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay28 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date22);
    java.lang.String[] str_array34 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table35 = new org.mafagafogigante.dungeon.util.Table(str_array34);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString36 = table35.toColoredStringList();
    org.mafagafogigante.dungeon.game.ColoredString coloredString37 = org.mafagafogigante.dungeon.game.Random.select(list_coloredString36);
    boolean b38 = date22.equals((java.lang.Object)coloredString37);
    java.awt.Color color39 = coloredString37.getColor();
    dungeonString1.setColor(color39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 152);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay28 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay28.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(coloredString37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color39);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test437"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    java.lang.String str5 = itemPreset0.getType();
    itemPreset0.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage9 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset0.setVisibility(percentage9);
    org.mafagafogigante.dungeon.game.Id id11 = null;
    itemPreset0.setId(id11);
    itemPreset0.setPutrefactionPeriod((long)(short)1);
    org.mafagafogigante.dungeon.entity.items.Item.Tag tag15 = org.mafagafogigante.dungeon.entity.items.Item.Tag.DECOMPOSES;
    boolean b16 = itemPreset0.hasTag(tag15);
    itemPreset0.setDrinkableHealing((int)(short)10);
    org.mafagafogigante.dungeon.entity.Weight weight19 = itemPreset0.getWeight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    org.junit.Assert.assertTrue("'" + tag15 + "' != '" + org.mafagafogigante.dungeon.entity.items.Item.Tag.DECOMPOSES + "'", tag15.equals(org.mafagafogigante.dungeon.entity.items.Item.Tag.DECOMPOSES));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weight19);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test438"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    boolean b5 = itemPreset0.isUnique();
    org.mafagafogigante.dungeon.entity.Weight weight7 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    org.mafagafogigante.dungeon.entity.Weight weight8 = org.mafagafogigante.dungeon.entity.Weight.ZERO;
    org.mafagafogigante.dungeon.entity.Weight weight9 = weight7.add(weight8);
    java.lang.String str10 = weight9.toString();
    itemPreset0.setWeight(weight9);
    org.mafagafogigante.dungeon.entity.Weight weight12 = itemPreset0.getWeight();
    org.mafagafogigante.dungeon.date.Date date16 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    java.lang.String str17 = date16.toDateString();
    org.mafagafogigante.dungeon.date.Date date21 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date25 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i26 = date21.compareTo(date25);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay27 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date21);
    long long28 = date21.getYear();
    int i29 = date16.compareTo(date21);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.items.Item item30 = new org.mafagafogigante.dungeon.entity.items.Item(itemPreset0, date16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0 kg"+ "'", str10.equals("0 kg"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "day 10 of month 10 of the year 10"+ "'", str17.equals("day 10 of month 10 of the year 10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay27 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay27.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long28 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test439"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date((long)'4', (long)(byte)0, (long)(byte)10);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test440"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer1 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature0);
    org.mafagafogigante.dungeon.entity.creatures.Creature[] creature_array2 = new org.mafagafogigante.dungeon.entity.creatures.Creature[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Creature> arraylist_creature3 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Creature>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.Creature>)arraylist_creature3, creature_array2);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString6 = new org.mafagafogigante.dungeon.game.DungeonString("");
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString7 = dungeonString6.toColoredStringList();
    observer1.writeCreatureSight((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Creature>)arraylist_creature3, dungeonString6);
    java.lang.String str9 = dungeonString6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creature_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "DungeonString{coloredStringList=[ColoredString{string='\nYou don't see anyone here.\n', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"+ "'", str9.equals("DungeonString{coloredStringList=[ColoredString{string='\nYou don't see anyone here.\n', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"));

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test441"); }

    org.mafagafogigante.dungeon.entity.items.IntegrityState integrityState0 = org.mafagafogigante.dungeon.entity.items.IntegrityState.SLIGHTLY_DAMAGED;
    java.lang.String str1 = integrityState0.toString();
    org.junit.Assert.assertTrue("'" + integrityState0 + "' != '" + org.mafagafogigante.dungeon.entity.items.IntegrityState.SLIGHTLY_DAMAGED + "'", integrityState0.equals(org.mafagafogigante.dungeon.entity.items.IntegrityState.SLIGHTLY_DAMAGED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Slightly Damaged"+ "'", str1.equals("Slightly Damaged"));

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test442"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity(57600, (int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test443"); }

    org.mafagafogigante.dungeon.io.Writer.write("52 Nights");

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test444"); }

    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics0 = new org.mafagafogigante.dungeon.stats.BattleStatistics();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement1 = null;
    boolean b2 = battleStatistics0.satisfies(battleStatisticsRequirement1);
    java.lang.String str3 = battleStatistics0.toString();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery4 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement6 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement(battleStatisticsQuery4, (int)(byte)100);
    boolean b7 = battleStatistics0.satisfies(battleStatisticsRequirement6);
    java.lang.String str8 = battleStatistics0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "BattleStatistics{records=CounterMap{map={}}}"+ "'", str3.equals("BattleStatistics{records=CounterMap{map={}}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "BattleStatistics{records=CounterMap{map={}}}"+ "'", str8.equals("BattleStatistics{records=CounterMap{map={}}}"));

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test445"); }

    org.mafagafogigante.dungeon.util.Percentage percentage1 = new org.mafagafogigante.dungeon.util.Percentage(1.0d);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test446"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer1 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature0);
    org.mafagafogigante.dungeon.entity.creatures.Creature[] creature_array2 = new org.mafagafogigante.dungeon.entity.creatures.Creature[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Creature> arraylist_creature3 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Creature>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.Creature>)arraylist_creature3, creature_array2);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString6 = new org.mafagafogigante.dungeon.game.DungeonString("");
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString7 = dungeonString6.toColoredStringList();
    observer1.writeCreatureSight((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Creature>)arraylist_creature3, dungeonString6);
    dungeonString6.resetColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creature_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString7);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test447"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date7 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i8 = date3.compareTo(date7);
    java.lang.String str9 = date3.toTimeString();
    org.mafagafogigante.dungeon.date.Date date14 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date18 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i19 = date14.compareTo(date18);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay20 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date14);
    long long21 = date14.getYear();
    org.mafagafogigante.dungeon.date.Date date25 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date29 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i30 = date25.compareTo(date29);
    long long31 = date25.getYear();
    int i32 = date14.compareTo(date25);
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit34 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR;
    org.mafagafogigante.dungeon.date.Date date35 = date25.minus(35, dungeonTimeUnit34);
    org.mafagafogigante.dungeon.date.Date date36 = date3.plus((int)'a', dungeonTimeUnit34);
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery37 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath38 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    battleStatisticsQuery37.setCauseOfDeath(causeOfDeath38);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay40 = org.mafagafogigante.dungeon.game.PartOfDay.AFTERNOON;
    java.lang.String str41 = partOfDay40.toString();
    boolean b42 = causeOfDeath38.equals((java.lang.Object)partOfDay40);
    int i43 = org.mafagafogigante.dungeon.game.PartOfDay.getSecondsToNext(date3, partOfDay40);
    long long44 = date3.getDay();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "00:00:00"+ "'", str9.equals("00:00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay20 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay20.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long31 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit34 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR + "'", dungeonTimeUnit34.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath38);
    org.junit.Assert.assertTrue("'" + partOfDay40 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.AFTERNOON + "'", partOfDay40.equals(org.mafagafogigante.dungeon.game.PartOfDay.AFTERNOON));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "Afternoon"+ "'", str41.equals("Afternoon"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 46800);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long44 == 10L);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test448"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.util.CircularList<org.mafagafogigante.dungeon.game.PartOfDay> circularlist_partOfDay1 = new org.mafagafogigante.dungeon.util.CircularList<org.mafagafogigante.dungeon.game.PartOfDay>(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test449"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    java.lang.String str5 = itemPreset0.getType();
    itemPreset0.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage9 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset0.setVisibility(percentage9);
    org.mafagafogigante.dungeon.game.Id id11 = null;
    itemPreset0.setId(id11);
    itemPreset0.setPutrefactionPeriod((long)(short)1);
    int i15 = itemPreset0.getDrinkableHealing();
    org.mafagafogigante.dungeon.game.Id id16 = itemPreset0.getId();
    boolean b17 = itemPreset0.isUnique();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test450"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity((int)(byte)1, (int)(byte)0);
    boolean b3 = integrity2.isMaximum();
    org.mafagafogigante.dungeon.entity.items.Item item4 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity5 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity2, item4);
    boolean b6 = itemIntegrity5.isBroken();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemIntegrity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test451"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.game.Id id1 = new org.mafagafogigante.dungeon.game.Id("Noon");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test452"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    java.lang.String str5 = itemPreset0.getType();
    itemPreset0.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.entity.TagSet<org.mafagafogigante.dungeon.entity.items.Item.Tag> tagset_tag8 = itemPreset0.getTagSet();
    org.mafagafogigante.dungeon.entity.Weight weight10 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    itemPreset0.setWeight(weight10);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset12 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity13 = itemPreset12.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity14 = null;
    itemPreset12.setIntegrity(integrity14);
    org.mafagafogigante.dungeon.util.Percentage percentage17 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    itemPreset12.setHitRate(percentage17);
    itemPreset0.setHitRate(percentage17);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity20 = itemPreset0.getLuminosity();
    org.mafagafogigante.dungeon.entity.LightSource lightSource21 = new org.mafagafogigante.dungeon.entity.LightSource(luminosity20);
    org.mafagafogigante.dungeon.entity.LightSource lightSource22 = new org.mafagafogigante.dungeon.entity.LightSource(luminosity20);
    lightSource22.enable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tagset_tag8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity20);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test453"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, 0, (double)(short)10);
    org.mafagafogigante.dungeon.entity.items.Item item4 = null;
    // The following exception was thrown during execution in test generation
    try {
    creatureInventory3.removeItem(item4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test454"); }

    org.mafagafogigante.dungeon.util.Percentage percentage0 = null;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity1 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage0);
    org.mafagafogigante.dungeon.entity.LightSource lightSource2 = new org.mafagafogigante.dungeon.entity.LightSource(luminosity1);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity3 = lightSource2.getLuminosity();
    lightSource2.enable();
    lightSource2.disable();
    lightSource2.disable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity3);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test455"); }

    java.awt.Color color1 = null;
    org.mafagafogigante.dungeon.game.LocationDescription locationDescription2 = new org.mafagafogigante.dungeon.game.LocationDescription('a', color1);
    java.awt.Color color3 = locationDescription2.getColor();
    locationDescription2.setInfo("Night");
    java.lang.String str6 = locationDescription2.getInfo();
    java.lang.String str7 = locationDescription2.getInfo();
    java.lang.String str8 = locationDescription2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(color3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Night"+ "'", str6.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Night"+ "'", str7.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "LocationDescription{symbol=a, color=null, info='Night'}"+ "'", str8.equals("LocationDescription{symbol=a, color=null, info='Night'}"));

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test456"); }

    java.lang.String str1 = org.mafagafogigante.dungeon.io.Converter.bytesToHuman((long)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "100 B"+ "'", str1.equals("100 B"));

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test457"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature1 = null;
    org.mafagafogigante.dungeon.entity.creatures.CreatureHealth creatureHealth2 = org.mafagafogigante.dungeon.entity.creatures.CreatureHealth.makeCreatureHealth(100, creature1);
    creatureHealth2.incrementBy(57);
    creatureHealth2.incrementBy(32);
    boolean b7 = creatureHealth2.isDead();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creatureHealth2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test458"); }

    org.mafagafogigante.dungeon.util.Percentage percentage1 = new org.mafagafogigante.dungeon.util.Percentage((double)86400000L);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test459"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    java.lang.String str3 = integrity2.toString();
    java.lang.String str4 = integrity2.toString();
    boolean b5 = integrity2.isMaximum();
    int i6 = integrity2.getMaximum();
    java.lang.String str7 = integrity2.toString();
    boolean b8 = integrity2.isMaximum();
    boolean b9 = integrity2.isZero();
    java.lang.String str10 = integrity2.toString();
    integrity2.decrementBy((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0/1"+ "'", str3.equals("0/1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0/1"+ "'", str4.equals("0/1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0/1"+ "'", str7.equals("0/1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0/1"+ "'", str10.equals("0/1"));

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test460"); }

    java.lang.String[] str_array3 = new java.lang.String[] { "Damaged", "visibilityCriteria=VisibilityCriteria{[]}", "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str4 = new java.util.ArrayList<java.lang.String>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str4, str_array3);
    org.mafagafogigante.dungeon.io.Split split6 = org.mafagafogigante.dungeon.io.Split.splitOnOn((java.util.List<java.lang.String>)arraylist_str4);
    java.util.List<java.lang.String> list_str7 = split6.getAfter();
    org.mafagafogigante.dungeon.io.Split split8 = org.mafagafogigante.dungeon.io.Split.splitOnOn(list_str7);
    org.mafagafogigante.dungeon.io.Split split9 = org.mafagafogigante.dungeon.io.Split.splitOnOn(list_str7);
    java.util.List<java.lang.String> list_str10 = split9.getAfter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(split6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(split8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(split9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test461"); }

    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances0 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.Direction direction1 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b2 = blockedEntrances0.isBlocked(direction1);
    org.mafagafogigante.dungeon.game.Direction direction3 = org.mafagafogigante.dungeon.game.Direction.WEST;
    boolean b4 = blockedEntrances0.isBlocked(direction3);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances5 = new org.mafagafogigante.dungeon.game.BlockedEntrances(blockedEntrances0);
    java.lang.String str6 = blockedEntrances5.toString();
    org.junit.Assert.assertTrue("'" + direction1 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction1.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + direction3 + "' != '" + org.mafagafogigante.dungeon.game.Direction.WEST + "'", direction3.equals(org.mafagafogigante.dungeon.game.Direction.WEST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "None"+ "'", str6.equals("None"));

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test462"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature1 = null;
    org.mafagafogigante.dungeon.entity.creatures.CreatureHealth creatureHealth2 = org.mafagafogigante.dungeon.entity.creatures.CreatureHealth.makeCreatureHealth(100, creature1);
    int i3 = creatureHealth2.getMaximum();
    boolean b4 = creatureHealth2.isDead();
    creatureHealth2.decrementBy(32);
    // The following exception was thrown during execution in test generation
    try {
    creatureHealth2.decrementBy(97);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creatureHealth2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test463"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule2 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeBoundIntegerRule((int)(short)-1, (int)(short)100);
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule3 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeVariableArrayRule(jsonRule2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule3);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test464"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.game.Id id1 = new org.mafagafogigante.dungeon.game.Id("Evening");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test465"); }

    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery0 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    battleStatisticsQuery0.setType("Damaged");
    battleStatisticsQuery0.setType("hi!");
    battleStatisticsQuery0.setType("User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 41.5 MiB out of the allocated 154.5 MiB\nOS: Windows 10 (amd64) 10.0");

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test466"); }

    org.mafagafogigante.dungeon.game.Id id0 = null;
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath2 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    org.mafagafogigante.dungeon.entity.creatures.HealthState healthState3 = org.mafagafogigante.dungeon.entity.creatures.HealthState.DEAD;
    boolean b4 = causeOfDeath2.equals((java.lang.Object)healthState3);
    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table11 = new org.mafagafogigante.dungeon.util.Table(str_array10);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString12 = table11.toColoredStringList();
    boolean b13 = causeOfDeath2.equals((java.lang.Object)table11);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay14 = org.mafagafogigante.dungeon.game.PartOfDay.NOON;
    org.mafagafogigante.dungeon.stats.BattleRecord battleRecord15 = new org.mafagafogigante.dungeon.stats.BattleRecord(id0, "East", causeOfDeath2, partOfDay14);
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath16 = battleRecord15.getCauseOfDeath();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath2);
    org.junit.Assert.assertTrue("'" + healthState3 + "' != '" + org.mafagafogigante.dungeon.entity.creatures.HealthState.DEAD + "'", healthState3.equals(org.mafagafogigante.dungeon.entity.creatures.HealthState.DEAD));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    org.junit.Assert.assertTrue("'" + partOfDay14 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NOON + "'", partOfDay14.equals(org.mafagafogigante.dungeon.game.PartOfDay.NOON));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath16);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test467"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    creaturePreset0.setAttack((int)(short)100);
    org.mafagafogigante.dungeon.game.Id id5 = creaturePreset0.getWeaponId();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity6 = creaturePreset0.getLuminosity();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity7 = creaturePreset0.getLuminosity();
    creaturePreset0.setInventoryItemLimit(3600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity7);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test468"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.entity.Integrity integrity4 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.util.Percentage percentage5 = itemPreset0.getHitRate();
    itemPreset0.setNutrition((int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    itemPreset0.setSpellId("Luminosity of 40.00%");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage5);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test469"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    itemPreset0.setDrinkableHealing((int)(short)0);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset0.setVisibility(percentage4);
    int i6 = itemPreset0.getDrinkableDoses();
    int i7 = itemPreset0.getIntegrityDecrementOnHit();
    int i8 = itemPreset0.getDrinkableHealing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test470"); }

    org.mafagafogigante.dungeon.entity.Weight weight1 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)45056);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight1);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test471"); }

    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances0 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.Direction direction1 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b2 = blockedEntrances0.isBlocked(direction1);
    org.mafagafogigante.dungeon.game.Direction direction3 = org.mafagafogigante.dungeon.game.Direction.EAST;
    org.mafagafogigante.dungeon.game.Direction direction4 = direction3.invert();
    blockedEntrances0.block(direction3);
    org.junit.Assert.assertTrue("'" + direction1 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction1.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + direction3 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction3.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    org.junit.Assert.assertTrue("'" + direction4 + "' != '" + org.mafagafogigante.dungeon.game.Direction.WEST + "'", direction4.equals(org.mafagafogigante.dungeon.game.Direction.WEST));

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test472"); }

    org.mafagafogigante.dungeon.world.TimeVisibilityCriterion timeVisibilityCriterion2 = new org.mafagafogigante.dungeon.world.TimeVisibilityCriterion(35, 0);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test473"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    boolean b5 = itemPreset0.isUnique();
    boolean b6 = itemPreset0.isUnique();
    itemPreset0.setPutrefactionPeriod((long)32);
    int i9 = itemPreset0.getIntegrityDecrementOnHit();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test474"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule2 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeBoundDoubleRule(100.0d, (double)1000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule2);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test475"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    java.lang.String str5 = itemPreset0.getType();
    itemPreset0.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage9 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset0.setVisibility(percentage9);
    int i11 = itemPreset0.getIntegrityDecrementOnHit();
    org.mafagafogigante.dungeon.date.Date date15 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date19 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i20 = date15.compareTo(date19);
    java.lang.String str21 = date15.toTimeString();
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.items.Item item22 = new org.mafagafogigante.dungeon.entity.items.Item(itemPreset0, date15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "00:00:00"+ "'", str21.equals("00:00:00"));

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test476"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    org.mafagafogigante.dungeon.entity.TagSet<org.mafagafogigante.dungeon.entity.creatures.Creature.Tag> tagset_tag3 = null;
    creaturePreset0.setTagSet(tagset_tag3);
    org.mafagafogigante.dungeon.game.Id id5 = creaturePreset0.getId();
    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset6 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id7 = null;
    creaturePreset6.setWeaponId(id7);
    org.mafagafogigante.dungeon.game.Id id9 = creaturePreset6.getId();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity10 = creaturePreset6.getLuminosity();
    org.mafagafogigante.dungeon.entity.creatures.Drop[] drop_array11 = new org.mafagafogigante.dungeon.entity.creatures.Drop[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop> arraylist_drop12 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop12, drop_array11);
    creaturePreset6.setDropList((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop12);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay15 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity16 = partOfDay15.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name17 = partOfDay15.getName();
    java.lang.String str19 = name17.getQuantifiedName((int)'a');
    java.lang.String str20 = name17.getSingular();
    java.lang.String str21 = name17.toString();
    java.lang.String str22 = name17.getSingular();
    java.lang.String str23 = name17.getPlural();
    java.lang.String str24 = name17.getPlural();
    creaturePreset6.setName(name17);
    creaturePreset0.setName(name17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(drop_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    org.junit.Assert.assertTrue("'" + partOfDay15 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay15.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "a few Nights"+ "'", str19.equals("a few Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Night"+ "'", str20.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Night"+ "'", str21.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Night"+ "'", str22.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Nights"+ "'", str23.equals("Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Nights"+ "'", str24.equals("Nights"));

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test477"); }

    org.mafagafogigante.dungeon.game.Numeral numeral1 = org.mafagafogigante.dungeon.game.Numeral.getCorrespondingNumeral((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(numeral1);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test478"); }

    org.mafagafogigante.dungeon.stats.Statistics statistics0 = new org.mafagafogigante.dungeon.stats.Statistics();
    statistics0.writeStatistics();
    statistics0.writeStatistics();
    statistics0.writeStatistics();
    org.mafagafogigante.dungeon.commands.IssuedCommand issuedCommand5 = new org.mafagafogigante.dungeon.commands.IssuedCommand("BattleStatistics{records=CounterMap{map={}}}");
    org.mafagafogigante.dungeon.commands.PreparedIssuedCommand preparedIssuedCommand6 = org.mafagafogigante.dungeon.commands.IssuedCommandProcessor.prepareIssuedCommand(issuedCommand5);
    statistics0.addCommand(issuedCommand5);
    org.mafagafogigante.dungeon.commands.IssuedCommandEvaluation issuedCommandEvaluation8 = org.mafagafogigante.dungeon.commands.IssuedCommandProcessor.evaluateIssuedCommand(issuedCommand5);
    org.mafagafogigante.dungeon.commands.IssuedCommandEvaluation issuedCommandEvaluation9 = org.mafagafogigante.dungeon.commands.IssuedCommandProcessor.evaluateIssuedCommand(issuedCommand5);
    java.lang.String str10 = issuedCommand5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(preparedIssuedCommand6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(issuedCommandEvaluation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(issuedCommandEvaluation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "BattleStatistics{records=CounterMap{map={}}}"+ "'", str10.equals("BattleStatistics{records=CounterMap{map={}}}"));

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test479"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, 32, (double)'4');
    org.mafagafogigante.dungeon.entity.items.Item item4 = null;
    // The following exception was thrown during execution in test generation
    try {
    creatureInventory3.removeItem(item4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test480"); }

    org.mafagafogigante.dungeon.util.Percentage percentage1 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b3 = percentage1.equals((java.lang.Object)10.0d);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity4 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage1);
    org.mafagafogigante.dungeon.util.Percentage percentage5 = luminosity4.toPercentage();
    java.lang.String str6 = percentage5.toString();
    java.lang.String str7 = percentage5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "100.00%"+ "'", str6.equals("100.00%"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "100.00%"+ "'", str7.equals("100.00%"));

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test481"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    java.lang.String str5 = itemPreset0.getType();
    itemPreset0.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage9 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset0.setVisibility(percentage9);
    org.mafagafogigante.dungeon.game.Id id11 = null;
    itemPreset0.setId(id11);
    org.mafagafogigante.dungeon.game.Name name13 = itemPreset0.getName();
    int i14 = itemPreset0.getDrinkableDoses();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(name13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test482"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule2 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeBoundIntegerRule(17518, 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule2);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test483"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    itemPreset0.setDrinkableHealing((int)(short)0);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset0.setVisibility(percentage4);
    int i6 = itemPreset0.getDrinkableDoses();
    itemPreset0.setIntegrityDecrementOnEat((int)' ');
    itemPreset0.setType("");
    org.mafagafogigante.dungeon.entity.Integrity integrity13 = new org.mafagafogigante.dungeon.entity.Integrity((int)(byte)1, (int)(byte)0);
    boolean b14 = integrity13.isZero();
    integrity13.incrementBy(81);
    boolean b17 = integrity13.isZero();
    itemPreset0.setIntegrity(integrity13);
    boolean b19 = integrity13.isMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test484"); }

    org.mafagafogigante.dungeon.entity.items.FoodComponent foodComponent2 = new org.mafagafogigante.dungeon.entity.items.FoodComponent(100, 34);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test485"); }

    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics0 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point1 = null;
    org.mafagafogigante.dungeon.game.Id id2 = null;
    explorationStatistics0.createEntryIfNotExists(point1, id2);
    org.mafagafogigante.dungeon.game.Id id4 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i5 = explorationStatistics0.getKillCount(id4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test486"); }

    org.mafagafogigante.dungeon.game.Writable writable0 = null;
    org.mafagafogigante.dungeon.io.Writer.write(writable0);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test487"); }

    org.mafagafogigante.dungeon.game.PartOfDay partOfDay0 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity1 = partOfDay0.getLuminosity();
    org.mafagafogigante.dungeon.world.LuminosityVisibilityCriterion luminosityVisibilityCriterion2 = new org.mafagafogigante.dungeon.world.LuminosityVisibilityCriterion(luminosity1);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay3 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity4 = partOfDay3.getLuminosity();
    org.mafagafogigante.dungeon.world.LuminosityVisibilityCriterion luminosityVisibilityCriterion5 = new org.mafagafogigante.dungeon.world.LuminosityVisibilityCriterion(luminosity4);
    org.mafagafogigante.dungeon.util.Percentage percentage7 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b9 = percentage7.equals((java.lang.Object)10.0d);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity10 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage7);
    org.mafagafogigante.dungeon.world.LuminosityVisibilityCriterion luminosityVisibilityCriterion11 = new org.mafagafogigante.dungeon.world.LuminosityVisibilityCriterion(luminosity10);
    org.mafagafogigante.dungeon.util.Percentage percentage13 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b15 = percentage13.equals((java.lang.Object)10.0d);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity16 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage13);
    org.mafagafogigante.dungeon.world.LuminosityVisibilityCriterion luminosityVisibilityCriterion17 = new org.mafagafogigante.dungeon.world.LuminosityVisibilityCriterion(luminosity16);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay18 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity19 = partOfDay18.getLuminosity();
    org.mafagafogigante.dungeon.world.LuminosityVisibilityCriterion luminosityVisibilityCriterion20 = new org.mafagafogigante.dungeon.world.LuminosityVisibilityCriterion(luminosity19);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay21 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity22 = partOfDay21.getLuminosity();
    org.mafagafogigante.dungeon.world.LuminosityVisibilityCriterion luminosityVisibilityCriterion23 = new org.mafagafogigante.dungeon.world.LuminosityVisibilityCriterion(luminosity22);
    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array24 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] { luminosityVisibilityCriterion2, luminosityVisibilityCriterion5, luminosityVisibilityCriterion11, luminosityVisibilityCriterion17, luminosityVisibilityCriterion20, luminosityVisibilityCriterion23 };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria25 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array24);
    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array26 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria27 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array26);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature28 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer29 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature28);
    boolean b30 = visibilityCriteria27.isMetBy(observer29);
    // The following exception was thrown during execution in test generation
    try {
    boolean b31 = visibilityCriteria25.isMetBy(observer29);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + partOfDay0 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay0.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity1);
    org.junit.Assert.assertTrue("'" + partOfDay3 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay3.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    org.junit.Assert.assertTrue("'" + partOfDay18 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay18.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity19);
    org.junit.Assert.assertTrue("'" + partOfDay21 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay21.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test488"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity(100, 0);
    org.mafagafogigante.dungeon.entity.Integrity integrity3 = new org.mafagafogigante.dungeon.entity.Integrity(integrity2);
    integrity2.decrementBy(0);
    integrity2.decrementBy((int)(byte)-1);
    integrity2.decrementBy((int)(byte)0);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test489"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule0 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeUppercaseStringRule();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule0);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test490"); }

    org.mafagafogigante.dungeon.game.PartOfDay partOfDay0 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity1 = partOfDay0.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name2 = partOfDay0.getName();
    java.lang.String str4 = name2.getQuantifiedName((int)'a');
    java.lang.String str5 = name2.getSingular();
    java.lang.String str6 = name2.toString();
    java.lang.String str8 = name2.getQuantifiedName((int)(short)10);
    java.lang.String str9 = name2.getPlural();
    org.junit.Assert.assertTrue("'" + partOfDay0 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay0.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "a few Nights"+ "'", str4.equals("a few Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Night"+ "'", str5.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Night"+ "'", str6.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "a few Nights"+ "'", str8.equals("a few Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nights"+ "'", str9.equals("Nights"));

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test491"); }

    org.mafagafogigante.dungeon.util.CircularList<java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>> circularlist_comparable_weight1 = new org.mafagafogigante.dungeon.util.CircularList<java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>>(100);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature2 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory5 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature2, (-1), 0.0d);
    org.mafagafogigante.dungeon.entity.Weight weight6 = creatureInventory5.getWeight();
    circularlist_comparable_weight1.add((java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>)weight6);
    org.mafagafogigante.dungeon.entity.Weight weight9 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    org.mafagafogigante.dungeon.entity.Weight weight10 = org.mafagafogigante.dungeon.entity.Weight.ZERO;
    org.mafagafogigante.dungeon.entity.Weight weight11 = weight9.add(weight10);
    org.mafagafogigante.dungeon.entity.Weight weight13 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)'#');
    org.mafagafogigante.dungeon.entity.Weight weight14 = weight11.add(weight13);
    circularlist_comparable_weight1.add((java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>)weight11);
    org.mafagafogigante.dungeon.entity.Weight weight16 = org.mafagafogigante.dungeon.entity.Weight.ZERO;
    org.mafagafogigante.dungeon.entity.Weight weight18 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    int i19 = weight16.compareTo(weight18);
    org.mafagafogigante.dungeon.entity.Weight weight20 = weight11.add(weight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight20);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test492"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity1 = itemPreset0.getLuminosity();
    org.mafagafogigante.dungeon.entity.Weight weight2 = itemPreset0.getWeight();
    org.mafagafogigante.dungeon.entity.Integrity integrity5 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    boolean b6 = integrity5.isMaximum();
    org.mafagafogigante.dungeon.entity.items.Item item7 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity8 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity5, item7);
    itemPreset0.setIntegrity(integrity5);
    long long10 = itemPreset0.getPutrefactionPeriod();
    org.mafagafogigante.dungeon.game.Name name11 = itemPreset0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemIntegrity8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(name11);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test493"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    itemPreset0.setIntegrityDecrementOnEat((-1));
    org.mafagafogigante.dungeon.entity.Weight weight4 = itemPreset0.getWeight();
    itemPreset0.setDrinkableHealing((int)(byte)1);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset7 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity8 = itemPreset7.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity9 = null;
    itemPreset7.setIntegrity(integrity9);
    org.mafagafogigante.dungeon.util.Percentage percentage11 = itemPreset7.getVisibility();
    java.lang.String str12 = itemPreset7.getType();
    itemPreset7.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage16 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset7.setVisibility(percentage16);
    itemPreset0.setVisibility(percentage16);
    org.mafagafogigante.dungeon.entity.items.Item.Tag tag19 = org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE;
    boolean b20 = itemPreset0.hasTag(tag19);
    int i21 = itemPreset0.getNutrition();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    org.junit.Assert.assertTrue("'" + tag19 + "' != '" + org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE + "'", tag19.equals(org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test494"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    java.lang.String str5 = itemPreset0.getType();
    itemPreset0.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.entity.TagSet<org.mafagafogigante.dungeon.entity.items.Item.Tag> tagset_tag8 = itemPreset0.getTagSet();
    org.mafagafogigante.dungeon.entity.Entity[] entity_array9 = new org.mafagafogigante.dungeon.entity.Entity[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.Entity> arraylist_entity10 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.Entity>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.Entity>)arraylist_entity10, entity_array9);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity12 = org.mafagafogigante.dungeon.entity.Luminosity.resultantLuminosity((java.util.Collection<org.mafagafogigante.dungeon.entity.Entity>)arraylist_entity10);
    org.mafagafogigante.dungeon.util.Percentage percentage13 = luminosity12.toPercentage();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity14 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage13);
    itemPreset0.setVisibility(percentage13);
    org.mafagafogigante.dungeon.entity.Weight weight17 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)'#');
    org.mafagafogigante.dungeon.entity.Weight weight19 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)'#');
    org.mafagafogigante.dungeon.entity.Weight weight20 = weight17.add(weight19);
    org.mafagafogigante.dungeon.entity.Weight weight22 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    org.mafagafogigante.dungeon.entity.Weight weight23 = org.mafagafogigante.dungeon.entity.Weight.ZERO;
    org.mafagafogigante.dungeon.entity.Weight weight24 = weight22.add(weight23);
    int i25 = weight19.compareTo(weight23);
    java.lang.String str26 = weight19.toString();
    org.mafagafogigante.dungeon.entity.creatures.Creature creature27 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory30 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature27, (-1), 0.0d);
    org.mafagafogigante.dungeon.entity.Weight weight31 = creatureInventory30.getWeight();
    org.mafagafogigante.dungeon.entity.Weight weight32 = weight19.add(weight31);
    itemPreset0.setWeight(weight31);
    org.mafagafogigante.dungeon.game.Id id34 = itemPreset0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tagset_tag8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(entity_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "35 kg"+ "'", str26.equals("35 kg"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id34);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test495"); }

    org.mafagafogigante.dungeon.entity.Weight weight1 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight1);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test496"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.util.Percentage percentage2 = itemPreset0.getVisibility();
    org.mafagafogigante.dungeon.entity.Weight weight3 = itemPreset0.getWeight();
    boolean b4 = itemPreset0.isUnique();
    boolean b5 = itemPreset0.isUnique();
    java.lang.String str6 = itemPreset0.getText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weight3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test497"); }

    org.mafagafogigante.dungeon.util.CounterMap<java.util.RandomAccess> countermap_randomAccess0 = new org.mafagafogigante.dungeon.util.CounterMap<java.util.RandomAccess>();
    boolean b1 = countermap_randomAccess0.isNotEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test498"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    creaturePreset0.setAttack(57);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity5 = creaturePreset0.getLuminosity();
    creaturePreset0.setInventoryItemLimit(57);
    org.mafagafogigante.dungeon.util.Percentage percentage9 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b11 = percentage9.equals((java.lang.Object)10.0d);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity12 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage9);
    org.mafagafogigante.dungeon.util.Percentage percentage13 = luminosity12.toPercentage();
    java.lang.String str14 = percentage13.toString();
    creaturePreset0.setVisibility(percentage13);
    org.mafagafogigante.dungeon.game.Name name16 = creaturePreset0.getName();
    org.mafagafogigante.dungeon.game.Id id17 = null;
    creaturePreset0.setId(id17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "100.00%"+ "'", str14.equals("100.00%"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(name16);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test499"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.game.Id id1 = new org.mafagafogigante.dungeon.game.Id("User: Nicholas\nTime: 15:42:11\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 35.0 MiB out of the allocated 123.0 MiB\nOS: Windows 10 (amd64) 10.0");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test500"); }

    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics0 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point1 = null;
    org.mafagafogigante.dungeon.game.Id id2 = null;
    explorationStatistics0.createEntryIfNotExists(point1, id2);
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics4 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point5 = null;
    org.mafagafogigante.dungeon.game.Id id6 = null;
    explorationStatistics4.createEntryIfNotExists(point5, id6);
    org.mafagafogigante.dungeon.game.Point point11 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id12 = null;
    explorationStatistics4.addVisit(point11, id12);
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics14 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point15 = null;
    org.mafagafogigante.dungeon.game.Id id16 = null;
    explorationStatistics14.createEntryIfNotExists(point15, id16);
    org.mafagafogigante.dungeon.game.Point point21 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id22 = null;
    explorationStatistics14.addVisit(point21, id22);
    int i24 = point21.getZ();
    org.mafagafogigante.dungeon.game.Id id25 = null;
    explorationStatistics4.createEntryIfNotExists(point21, id25);
    org.mafagafogigante.dungeon.game.Id id27 = null;
    explorationStatistics0.addVisit(point21, id27);
    org.mafagafogigante.dungeon.game.Id id29 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i30 = explorationStatistics0.getMaximumNumberOfVisits(id29);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-1));

  }

}
