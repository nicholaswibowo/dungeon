
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test001"); }

    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics0 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    int i2 = explorationStatistics0.getKillCount(id1);
    org.mafagafogigante.dungeon.game.Id id3 = null;
    int i4 = explorationStatistics0.getMaximumNumberOfVisits(id3);
    org.mafagafogigante.dungeon.game.Id id5 = null;
    int i6 = explorationStatistics0.getKillCount(id5);
    org.mafagafogigante.dungeon.game.Id id7 = null;
    int i8 = explorationStatistics0.getVisitedLocations(id7);
    org.mafagafogigante.dungeon.game.Id id9 = null;
    int i10 = explorationStatistics0.getKillCount(id9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test002"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule0 = null;
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule1 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeVariableArrayRule(jsonRule0);
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule2 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeOptionalRule(jsonRule1);
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule3 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeVariableArrayRule(jsonRule1);
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule4 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeVariableArrayRule(jsonRule1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule4);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test003"); }

    org.mafagafogigante.dungeon.commands.CommandHistory commandHistory0 = new org.mafagafogigante.dungeon.commands.CommandHistory();
    java.lang.String str2 = commandHistory0.getLastSimilarCommand("");
    java.lang.String str4 = commandHistory0.getLastSimilarCommand("Unarmed : UNARMED");
    java.lang.String str6 = commandHistory0.getLastSimilarCommand("User: Nicholas\nTime: 15:35:08\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 5.9 MiB out of the allocated 123.0 MiB\nOS: Windows 10 (amd64) 10.0");
    java.lang.String str8 = commandHistory0.getLastSimilarCommand("BattleEntry{id=null, type='', causeOfDeath=Unarmed : UNARMED, partOfDay=Night}");
    org.mafagafogigante.dungeon.stats.Statistics statistics9 = new org.mafagafogigante.dungeon.stats.Statistics();
    statistics9.writeStatistics();
    statistics9.writeStatistics();
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker12 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics9);
    org.mafagafogigante.dungeon.commands.IssuedCommand issuedCommand14 = new org.mafagafogigante.dungeon.commands.IssuedCommand("10-10-10 00:00:00");
    java.util.List<java.lang.String> list_str15 = issuedCommand14.getTokens();
    statistics9.addCommand(issuedCommand14);
    commandHistory0.addCommand(issuedCommand14);
    java.util.List<java.lang.String> list_str18 = issuedCommand14.getTokens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test004"); }

    org.mafagafogigante.dungeon.util.CircularList<java.lang.Comparable<org.mafagafogigante.dungeon.world.WeatherCondition>> circularlist_comparable_weatherCondition1 = new org.mafagafogigante.dungeon.util.CircularList<java.lang.Comparable<org.mafagafogigante.dungeon.world.WeatherCondition>>(57);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test005"); }

    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery0 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    boolean b2 = battleStatisticsQuery0.equals((java.lang.Object)0.0d);
    org.mafagafogigante.dungeon.game.Id id3 = null;
    battleStatisticsQuery0.setId(id3);
    org.mafagafogigante.dungeon.game.Id id5 = null;
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery7 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath8 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    battleStatisticsQuery7.setCauseOfDeath(causeOfDeath8);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay10 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.stats.BattleRecord battleRecord11 = new org.mafagafogigante.dungeon.stats.BattleRecord(id5, "", causeOfDeath8, partOfDay10);
    java.lang.String str12 = battleRecord11.getType();
    boolean b13 = battleStatisticsQuery0.matches(battleRecord11);
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath14 = battleRecord11.getCauseOfDeath();
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics15 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point19 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id20 = null;
    explorationStatistics15.addVisit(point19, id20);
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics22 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point23 = null;
    org.mafagafogigante.dungeon.game.Id id24 = null;
    explorationStatistics22.createEntryIfNotExists(point23, id24);
    org.mafagafogigante.dungeon.game.Point point29 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id30 = null;
    explorationStatistics22.addVisit(point29, id30);
    int i32 = point29.getX();
    explorationStatistics15.addKill(point29);
    boolean b34 = battleRecord11.equals((java.lang.Object)explorationStatistics15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath8);
    org.junit.Assert.assertTrue("'" + partOfDay10 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay10.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test006"); }

    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics0 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point1 = null;
    org.mafagafogigante.dungeon.game.Id id2 = null;
    explorationStatistics0.createEntryIfNotExists(point1, id2);
    org.mafagafogigante.dungeon.game.Point point7 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id8 = null;
    explorationStatistics0.addVisit(point7, id8);
    org.mafagafogigante.dungeon.game.Point point13 = new org.mafagafogigante.dungeon.game.Point(100, 10, (int)(byte)10);
    int i14 = point13.getZ();
    org.mafagafogigante.dungeon.game.Id id15 = null;
    explorationStatistics0.createEntryIfNotExists(point13, id15);
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics17 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point21 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id22 = null;
    explorationStatistics17.addVisit(point21, id22);
    boolean b24 = explorationStatistics0.hasBeenSeen(point21);
    java.lang.String str25 = point21.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{32, 0, -1}"+ "'", str25.equals("{32, 0, -1}"));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test007"); }

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
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test008"); }

    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics0 = new org.mafagafogigante.dungeon.stats.BattleStatistics();
    org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.CauseOfDeath> countermap_causeOfDeath1 = battleStatistics0.getKillsByCauseOfDeath();
    java.lang.String str2 = battleStatistics0.toString();
    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics3 = new org.mafagafogigante.dungeon.stats.BattleStatistics();
    org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.CauseOfDeath> countermap_causeOfDeath4 = battleStatistics3.getKillsByCauseOfDeath();
    java.lang.String str5 = battleStatistics3.toString();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery6 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    boolean b8 = battleStatisticsQuery6.equals((java.lang.Object)0.0d);
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement10 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement(battleStatisticsQuery6, (int)(byte)100);
    int i11 = battleStatisticsRequirement10.getCount();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery12 = battleStatisticsRequirement10.getQuery();
    boolean b13 = battleStatistics3.satisfies(battleStatisticsRequirement10);
    boolean b14 = battleStatistics0.satisfies(battleStatisticsRequirement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_causeOfDeath1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "BattleStatistics{records=CounterMap{map={}}}"+ "'", str2.equals("BattleStatistics{records=CounterMap{map={}}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_causeOfDeath4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "BattleStatistics{records=CounterMap{map={}}}"+ "'", str5.equals("BattleStatistics{records=CounterMap{map={}}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(battleStatisticsQuery12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test009"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] creaturePresetFactory_array0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] {  };
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory1 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array0);
    org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory corpseItemPresetFactory2 = new org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory(creatureFactory1);
    org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory corpseItemPresetFactory3 = new org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory(creatureFactory1);
    java.util.Collection<org.mafagafogigante.dungeon.entity.items.ItemPreset> collection_itemPreset4 = corpseItemPresetFactory3.getItemPresets();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creaturePresetFactory_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_itemPreset4);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test010"); }

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
    int i12 = itemPreset0.getDamage();
    org.mafagafogigante.dungeon.entity.items.Item.Tag tag13 = null;
    boolean b14 = itemPreset0.hasTag(tag13);
    int i15 = itemPreset0.getIntegrityDecrementPerDose();
    org.mafagafogigante.dungeon.entity.Weight weight16 = itemPreset0.getWeight();
    
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
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight16);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test011"); }

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
    int i16 = creaturePreset0.getAttack();
    org.mafagafogigante.dungeon.game.Id id17 = null;
    creaturePreset0.setId(id17);
    org.mafagafogigante.dungeon.util.Percentage percentage19 = creaturePreset0.getVisibility();
    creaturePreset0.setHealth(23);
    org.mafagafogigante.dungeon.game.Id id22 = creaturePreset0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(id_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id22);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test012"); }

    org.mafagafogigante.dungeon.commands.CommandDescription commandDescription2 = new org.mafagafogigante.dungeon.commands.CommandDescription("", "DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}hi!visibilityCriteria=VisibilityCriteria{[]}visibilityCriteria=VisibilityCriteria{[]}Damagedhi!', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}");
    java.lang.String str3 = commandDescription2.getInfo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}hi!visibilityCriteria=VisibilityCriteria{[]}visibilityCriteria=VisibilityCriteria{[]}Damagedhi!', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"+ "'", str3.equals("DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}hi!visibilityCriteria=VisibilityCriteria{[]}visibilityCriteria=VisibilityCriteria{[]}Damagedhi!', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test013"); }

    org.mafagafogigante.dungeon.world.Sky sky0 = org.mafagafogigante.dungeon.world.SkyFactory.makeDarrowmereSky();
    java.lang.String str1 = sky0.toString();
    java.lang.String str2 = sky0.toString();
    java.lang.String str3 = sky0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sky0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Sky{astronomicalBodies=[the Sun, a large, golden, spherical body, Mino, a small, dull white spherical body, Sario, a very small, green-tinted, perfectly spherical body]}"+ "'", str1.equals("Sky{astronomicalBodies=[the Sun, a large, golden, spherical body, Mino, a small, dull white spherical body, Sario, a very small, green-tinted, perfectly spherical body]}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Sky{astronomicalBodies=[the Sun, a large, golden, spherical body, Mino, a small, dull white spherical body, Sario, a very small, green-tinted, perfectly spherical body]}"+ "'", str2.equals("Sky{astronomicalBodies=[the Sun, a large, golden, spherical body, Mino, a small, dull white spherical body, Sario, a very small, green-tinted, perfectly spherical body]}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Sky{astronomicalBodies=[the Sun, a large, golden, spherical body, Mino, a small, dull white spherical body, Sario, a very small, green-tinted, perfectly spherical body]}"+ "'", str3.equals("Sky{astronomicalBodies=[the Sun, a large, golden, spherical body, Mino, a small, dull white spherical body, Sario, a very small, green-tinted, perfectly spherical body]}"));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test014"); }

    org.mafagafogigante.dungeon.util.ShuffledRange shuffledRange2 = new org.mafagafogigante.dungeon.util.ShuffledRange((int)(short)-1, (int)(byte)0);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test015"); }

    org.mafagafogigante.dungeon.game.Id id0 = null;
    org.mafagafogigante.dungeon.entity.items.BookComponent bookComponent2 = new org.mafagafogigante.dungeon.entity.items.BookComponent(id0, "CreatureHealth{integrity=100/100}");
    boolean b3 = bookComponent2.isDidactic();
    boolean b4 = bookComponent2.isDidactic();
    int i5 = bookComponent2.getTimeToRead();
    java.lang.String str6 = bookComponent2.getText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "CreatureHealth{integrity=100/100}"+ "'", str6.equals("CreatureHealth{integrity=100/100}"));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test016"); }

    org.mafagafogigante.dungeon.util.CircularList<org.mafagafogigante.dungeon.stats.Statistics> circularlist_statistics1 = new org.mafagafogigante.dungeon.util.CircularList<org.mafagafogigante.dungeon.stats.Statistics>(10);
    boolean b2 = circularlist_statistics1.isEmpty();
    org.mafagafogigante.dungeon.stats.Statistics statistics3 = new org.mafagafogigante.dungeon.stats.Statistics();
    statistics3.writeStatistics();
    statistics3.writeStatistics();
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker6 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics3);
    circularlist_statistics1.add(statistics3);
    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics8 = statistics3.getBattleStatistics();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(battleStatistics8);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test017"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule1 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeStringLengthRule(79648);
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule2 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeOptionalRule(jsonRule1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule2);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test018"); }

    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics0 = new org.mafagafogigante.dungeon.stats.BattleStatistics();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement1 = null;
    boolean b2 = battleStatistics0.satisfies(battleStatisticsRequirement1);
    java.lang.String str3 = battleStatistics0.toString();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery4 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    boolean b6 = battleStatisticsQuery4.equals((java.lang.Object)0.0d);
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement8 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement(battleStatisticsQuery4, (int)(byte)100);
    boolean b9 = battleStatistics0.satisfies(battleStatisticsRequirement8);
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery10 = battleStatisticsRequirement8.getQuery();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "BattleStatistics{records=CounterMap{map={}}}"+ "'", str3.equals("BattleStatistics{records=CounterMap{map={}}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(battleStatisticsQuery10);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test019"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity1 = itemPreset0.getLuminosity();
    java.lang.String str2 = itemPreset0.getType();
    org.mafagafogigante.dungeon.util.Percentage percentage4 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b6 = percentage4.equals((java.lang.Object)10.0d);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity7 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage4);
    itemPreset0.setLuminosity(luminosity7);
    org.mafagafogigante.dungeon.util.Percentage percentage9 = itemPreset0.getVisibility();
    boolean b10 = itemPreset0.isUnique();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test020"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, 3, (double)'4');

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test021"); }

    org.mafagafogigante.dungeon.util.Percentage percentage1 = new org.mafagafogigante.dungeon.util.Percentage((double)(short)1);
    org.mafagafogigante.dungeon.entity.Visibility visibility2 = new org.mafagafogigante.dungeon.entity.Visibility(percentage1);
    java.lang.String str3 = visibility2.toString();
    java.lang.String str4 = visibility2.toString();
    org.mafagafogigante.dungeon.util.Percentage percentage5 = visibility2.toPercentage();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery7 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath8 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    battleStatisticsQuery7.setCauseOfDeath(causeOfDeath8);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset10 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity11 = itemPreset10.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity12 = null;
    itemPreset10.setIntegrity(integrity12);
    org.mafagafogigante.dungeon.util.Percentage percentage14 = itemPreset10.getVisibility();
    java.lang.String str15 = itemPreset10.getType();
    itemPreset10.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage19 = new org.mafagafogigante.dungeon.util.Percentage((double)(short)10);
    itemPreset10.setVisibility(percentage19);
    org.mafagafogigante.dungeon.util.Percentage percentage22 = new org.mafagafogigante.dungeon.util.Percentage((double)(short)10);
    int i23 = percentage19.compareTo(percentage22);
    double d24 = percentage19.toDouble();
    boolean b25 = causeOfDeath8.equals((java.lang.Object)percentage19);
    org.mafagafogigante.dungeon.entity.items.WeaponComponent weaponComponent27 = new org.mafagafogigante.dungeon.entity.items.WeaponComponent((int)'#', percentage19, (int)(byte)1);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity28 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage19);
    boolean b29 = visibility2.visibleUnder(luminosity28);
    java.lang.String str30 = visibility2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Visibility of 100.00%"+ "'", str3.equals("Visibility of 100.00%"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Visibility of 100.00%"+ "'", str4.equals("Visibility of 100.00%"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d24 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Visibility of 100.00%"+ "'", str30.equals("Visibility of 100.00%"));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test022"); }

    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics0 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    int i2 = explorationStatistics0.getKillCount(id1);
    org.mafagafogigante.dungeon.game.Id id3 = null;
    int i4 = explorationStatistics0.getMaximumNumberOfVisits(id3);
    org.mafagafogigante.dungeon.game.Id id5 = null;
    int i6 = explorationStatistics0.getKillCount(id5);
    org.mafagafogigante.dungeon.game.Direction direction7 = org.mafagafogigante.dungeon.game.Direction.EAST;
    java.lang.String str8 = direction7.toString();
    org.mafagafogigante.dungeon.game.Point point9 = direction7.getOffset();
    boolean b10 = explorationStatistics0.hasBeenSeen(point9);
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics11 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point12 = null;
    org.mafagafogigante.dungeon.game.Id id13 = null;
    explorationStatistics11.createEntryIfNotExists(point12, id13);
    org.mafagafogigante.dungeon.game.Point point18 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id19 = null;
    explorationStatistics11.addVisit(point18, id19);
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics21 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point22 = null;
    org.mafagafogigante.dungeon.game.Id id23 = null;
    explorationStatistics21.createEntryIfNotExists(point22, id23);
    org.mafagafogigante.dungeon.game.Point point28 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id29 = null;
    explorationStatistics21.addVisit(point28, id29);
    int i31 = point28.getZ();
    org.mafagafogigante.dungeon.game.Id id32 = null;
    explorationStatistics11.createEntryIfNotExists(point28, id32);
    int i34 = point28.getX();
    org.mafagafogigante.dungeon.game.Id id35 = null;
    explorationStatistics0.createEntryIfNotExists(point28, id35);
    org.mafagafogigante.dungeon.game.Point point40 = new org.mafagafogigante.dungeon.game.Point(100, 10, (int)(byte)10);
    int i41 = point40.getZ();
    java.lang.String str42 = point40.toString();
    int i43 = point40.getY();
    int i44 = point40.getY();
    org.mafagafogigante.dungeon.game.Id id45 = null;
    explorationStatistics0.addVisit(point40, id45);
    org.mafagafogigante.dungeon.game.Id id47 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i48 = explorationStatistics0.getKillCount(id47);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    org.junit.Assert.assertTrue("'" + direction7 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction7.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "East"+ "'", str8.equals("East"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{100, 10, 10}"+ "'", str42.equals("{100, 10, 10}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 10);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test023"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    org.mafagafogigante.dungeon.game.Id id3 = null;
    creaturePreset0.setWeaponId(id3);
    org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId attackAlgorithmId5 = creaturePreset0.getAttackAlgorithmId();
    creaturePreset0.setType("None");
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay8 = org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT;
    org.mafagafogigante.dungeon.game.Name name9 = partOfDay8.getName();
    java.lang.String str10 = name9.getSingular();
    creaturePreset0.setName(name9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(attackAlgorithmId5);
    org.junit.Assert.assertTrue("'" + partOfDay8 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay8.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Midnight"+ "'", str10.equals("Midnight"));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test024"); }

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
    java.lang.String str22 = date3.toString();
    long long23 = date3.getDay();
    java.lang.String str24 = date3.toString();
    
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
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "10-10-10 00:00:00"+ "'", str22.equals("10-10-10 00:00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long23 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "10-10-10 00:00:00"+ "'", str24.equals("10-10-10 00:00:00"));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test025"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay1 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity2 = partOfDay1.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name3 = partOfDay1.getName();
    org.mafagafogigante.dungeon.game.QuantificationMode quantificationMode5 = org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER;
    java.lang.String str6 = name3.getQuantifiedName((int)'4', quantificationMode5);
    creaturePreset0.setName(name3);
    org.mafagafogigante.dungeon.game.QuantificationMode quantificationMode9 = org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER;
    java.lang.String str10 = name3.getQuantifiedName(57, quantificationMode9);
    java.lang.String str11 = name3.getPlural();
    java.lang.String str12 = name3.getPlural();
    org.junit.Assert.assertTrue("'" + partOfDay1 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay1.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name3);
    org.junit.Assert.assertTrue("'" + quantificationMode5 + "' != '" + org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER + "'", quantificationMode5.equals(org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "52 Nights"+ "'", str6.equals("52 Nights"));
    org.junit.Assert.assertTrue("'" + quantificationMode9 + "' != '" + org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER + "'", quantificationMode9.equals(org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "57 Nights"+ "'", str10.equals("57 Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Nights"+ "'", str11.equals("Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nights"+ "'", str12.equals("Nights"));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test026"); }

    org.mafagafogigante.dungeon.game.Id id0 = null;
    org.mafagafogigante.dungeon.entity.items.BookComponent bookComponent2 = new org.mafagafogigante.dungeon.entity.items.BookComponent(id0, "CreatureHealth{integrity=100/100}");
    org.mafagafogigante.dungeon.game.Id id3 = bookComponent2.getSpellId();
    java.lang.String str4 = bookComponent2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "This book teaches nothing. Text: CreatureHealth{integrity=100/100}"+ "'", str4.equals("This book teaches nothing. Text: CreatureHealth{integrity=100/100}"));

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test027"); }

    org.mafagafogigante.dungeon.entity.items.ItemUsageEffect itemUsageEffect1 = new org.mafagafogigante.dungeon.entity.items.ItemUsageEffect((int)(short)1);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test028"); }

    org.mafagafogigante.dungeon.io.Writer.write("User: Nicholas\nTime: 15:35:09\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 26.6 MiB out of the allocated 121.0 MiB\nOS: Windows 10 (amd64) 10.0");

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test029"); }

    org.mafagafogigante.dungeon.util.CounterMap<java.lang.Comparable<java.lang.String>> countermap_comparable_str0 = new org.mafagafogigante.dungeon.util.CounterMap<java.lang.Comparable<java.lang.String>>();
    java.util.Set<java.lang.Comparable<java.lang.String>> set_comparable_str1 = countermap_comparable_str0.keySet();
    java.lang.String str2 = countermap_comparable_str0.toString();
    boolean b3 = countermap_comparable_str0.isNotEmpty();
    boolean b4 = countermap_comparable_str0.isNotEmpty();
    java.util.Set<java.lang.Comparable<java.lang.String>> set_comparable_str5 = countermap_comparable_str0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_comparable_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "CounterMap{map={}}"+ "'", str2.equals("CounterMap{map={}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_comparable_str5);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test030"); }

    org.mafagafogigante.dungeon.game.Id id0 = null;
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath2 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    java.lang.String[] str_array6 = new java.lang.String[] { "Damaged", "visibilityCriteria=VisibilityCriteria{[]}", "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str7 = new java.util.ArrayList<java.lang.String>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str7, str_array6);
    org.mafagafogigante.dungeon.io.Split split9 = org.mafagafogigante.dungeon.io.Split.splitOnOn((java.util.List<java.lang.String>)arraylist_str7);
    java.util.List<java.lang.String> list_str10 = split9.getBefore();
    boolean b11 = causeOfDeath2.equals((java.lang.Object)list_str10);
    java.lang.String str12 = causeOfDeath2.toString();
    org.mafagafogigante.dungeon.entity.Weight weight14 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    org.mafagafogigante.dungeon.entity.Weight weight15 = org.mafagafogigante.dungeon.entity.Weight.ZERO;
    org.mafagafogigante.dungeon.entity.Weight weight16 = weight14.add(weight15);
    java.lang.String str17 = weight16.toString();
    boolean b18 = causeOfDeath2.equals((java.lang.Object)str17);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay19 = org.mafagafogigante.dungeon.game.PartOfDay.DUSK;
    org.mafagafogigante.dungeon.game.Name name20 = partOfDay19.getName();
    org.mafagafogigante.dungeon.stats.BattleRecord battleRecord21 = new org.mafagafogigante.dungeon.stats.BattleRecord(id0, "CreatureHealth{integrity=31/32}", causeOfDeath2, partOfDay19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(split9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Unarmed : UNARMED"+ "'", str12.equals("Unarmed : UNARMED"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "0 kg"+ "'", str17.equals("0 kg"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    org.junit.Assert.assertTrue("'" + partOfDay19 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.DUSK + "'", partOfDay19.equals(org.mafagafogigante.dungeon.game.PartOfDay.DUSK));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name20);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test031"); }

    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances0 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.Direction direction1 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b2 = blockedEntrances0.isBlocked(direction1);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances3 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.Direction direction4 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b5 = blockedEntrances3.isBlocked(direction4);
    boolean b6 = blockedEntrances0.isBlocked(direction4);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances7 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.Direction direction8 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b10 = direction8.equalsIgnoreCase("");
    blockedEntrances7.block(direction8);
    blockedEntrances0.block(direction8);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances13 = new org.mafagafogigante.dungeon.game.BlockedEntrances(blockedEntrances0);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances14 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances15 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.Direction direction16 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b17 = blockedEntrances15.isBlocked(direction16);
    boolean b19 = direction16.equalsIgnoreCase("");
    java.lang.String str20 = direction16.toString();
    boolean b21 = blockedEntrances14.isBlocked(direction16);
    java.lang.String str22 = direction16.toString();
    blockedEntrances0.block(direction16);
    org.junit.Assert.assertTrue("'" + direction1 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction1.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + direction4 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction4.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    org.junit.Assert.assertTrue("'" + direction8 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction8.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    org.junit.Assert.assertTrue("'" + direction16 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction16.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "East"+ "'", str20.equals("East"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "East"+ "'", str22.equals("East"));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test032"); }

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
    creaturePreset0.setAttack(32304);
    int i18 = creaturePreset0.getAttack();
    org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId attackAlgorithmId19 = creaturePreset0.getAttackAlgorithmId();
    creaturePreset0.setInventoryWeightLimit((double)7);
    org.mafagafogigante.dungeon.util.Percentage percentage23 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b25 = percentage23.equals((java.lang.Object)10.0d);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity26 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage23);
    org.mafagafogigante.dungeon.entity.LightSource lightSource27 = new org.mafagafogigante.dungeon.entity.LightSource(luminosity26);
    java.lang.String str28 = luminosity26.toString();
    creaturePreset0.setLuminosity(luminosity26);
    org.mafagafogigante.dungeon.game.Id id30 = creaturePreset0.getWeaponId();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity31 = creaturePreset0.getLuminosity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(id_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 32304);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(attackAlgorithmId19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Luminosity of 100.00%"+ "'", str28.equals("Luminosity of 100.00%"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity31);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test033"); }

    org.mafagafogigante.dungeon.util.ShuffledRange shuffledRange2 = new org.mafagafogigante.dungeon.util.ShuffledRange(3, 10);
    shuffledRange2.shuffle();
    int i4 = shuffledRange2.getSize();
    shuffledRange2.shuffle();
    int i6 = shuffledRange2.getSize();
    // The following exception was thrown during execution in test generation
    try {
    int i8 = shuffledRange2.get((int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 7);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test034"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    boolean b3 = integrity2.isMaximum();
    boolean b4 = integrity2.isZero();
    boolean b5 = integrity2.isMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test035"); }

    org.mafagafogigante.dungeon.stats.Statistics statistics0 = new org.mafagafogigante.dungeon.stats.Statistics();
    statistics0.writeStatistics();
    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics2 = statistics0.getBattleStatistics();
    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics3 = statistics0.getBattleStatistics();
    statistics0.writeStatistics();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(battleStatistics2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(battleStatistics3);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test036"); }

    org.mafagafogigante.dungeon.util.CircularList<org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath> circularlist_typeOfCauseOfDeath1 = new org.mafagafogigante.dungeon.util.CircularList<org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath>((int)(byte)1);
    boolean b2 = circularlist_typeOfCauseOfDeath1.isEmpty();
    org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath typeOfCauseOfDeath3 = org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath.SPELL;
    java.lang.String str4 = typeOfCauseOfDeath3.toString();
    circularlist_typeOfCauseOfDeath1.add(typeOfCauseOfDeath3);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath typeOfCauseOfDeath7 = circularlist_typeOfCauseOfDeath1.get(65);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    org.junit.Assert.assertTrue("'" + typeOfCauseOfDeath3 + "' != '" + org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath.SPELL + "'", typeOfCauseOfDeath3.equals(org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath.SPELL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Spell"+ "'", str4.equals("Spell"));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test037"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date7 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i8 = date3.compareTo(date7);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay9 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date3);
    java.lang.String str10 = date3.toTimeString();
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit12 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR;
    org.mafagafogigante.dungeon.date.Date date13 = date3.plus(3600, dungeonTimeUnit12);
    org.mafagafogigante.dungeon.date.Date date17 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date21 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i22 = date17.compareTo(date21);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay23 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date17);
    long long24 = date17.getYear();
    org.mafagafogigante.dungeon.date.Duration duration25 = new org.mafagafogigante.dungeon.date.Duration(date3, date17);
    java.lang.String str26 = duration25.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay9 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay9.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "00:00:00"+ "'", str10.equals("00:00:00"));
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit12 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR + "'", dungeonTimeUnit12.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay23 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay23.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long24 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Less than a day"+ "'", str26.equals("Less than a day"));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test038"); }

    org.mafagafogigante.dungeon.entity.creatures.Hero hero0 = null;
    org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster heroSpellcaster1 = new org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster(hero0);
    java.util.List<org.mafagafogigante.dungeon.spells.Spell> list_spell2 = heroSpellcaster1.getSpellList();
    org.mafagafogigante.dungeon.entity.items.Item[] item_array3 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item4 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item4, item_array3);
    java.lang.String[] str_array11 = new java.lang.String[] { "CounterMap{map={}}", "User: Nicholas\nTime: 15:35:09\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 4.3 MiB out of the allocated 121.0 MiB\nOS: Windows 10 (amd64) 10.0", "hi!", "0 ms", "User: Nicholas\nTime: 15:35:09\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 26.6 MiB out of the allocated 121.0 MiB\nOS: Windows 10 (amd64) 10.0" };
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item12 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item4, str_array11);
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table19 = new org.mafagafogigante.dungeon.util.Table(str_array18);
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item20 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems(list_item12, str_array18);
    heroSpellcaster1.parseCast(str_array18);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString23 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array28 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString23.append(str_array28);
    java.lang.String[] str_array35 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table36 = new org.mafagafogigante.dungeon.util.Table(str_array35);
    dungeonString23.append(str_array35);
    heroSpellcaster1.parseCast(str_array35);
    java.util.List<org.mafagafogigante.dungeon.spells.Spell> list_spell39 = heroSpellcaster1.getSpellList();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_spell2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_spell39);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test039"); }

    org.mafagafogigante.dungeon.entity.items.ItemPresetFactory[] itemPresetFactory_array0 = new org.mafagafogigante.dungeon.entity.items.ItemPresetFactory[] {  };
    org.mafagafogigante.dungeon.entity.items.ItemFactory itemFactory1 = new org.mafagafogigante.dungeon.entity.items.ItemFactory(itemPresetFactory_array0);
    org.mafagafogigante.dungeon.game.Id id2 = null;
    boolean b3 = itemFactory1.canMakeItem(id2);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature4 = null;
    org.mafagafogigante.dungeon.date.Date date8 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    java.lang.String str9 = date8.toDateString();
    org.mafagafogigante.dungeon.world.Weather weather10 = new org.mafagafogigante.dungeon.world.Weather(date8);
    org.mafagafogigante.dungeon.date.Date date14 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date18 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i19 = date14.compareTo(date18);
    long long20 = date18.getDay();
    long long21 = date18.getHour();
    org.mafagafogigante.dungeon.world.WeatherCondition weatherCondition22 = weather10.getCurrentCondition(date18);
    org.mafagafogigante.dungeon.date.Date date26 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit28 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR;
    org.mafagafogigante.dungeon.date.Date date29 = date26.minus((int)(byte)10, dungeonTimeUnit28);
    org.mafagafogigante.dungeon.world.WeatherCondition weatherCondition30 = weather10.getCurrentCondition(date26);
    long long31 = date26.getMonth();
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.items.Item item32 = itemFactory1.makeCorpse(creature4, date26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemPresetFactory_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "day 10 of month 10 of the year 10"+ "'", str9.equals("day 10 of month 10 of the year 10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long20 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == 0L);
    org.junit.Assert.assertTrue("'" + weatherCondition22 + "' != '" + org.mafagafogigante.dungeon.world.WeatherCondition.CLOUDY + "'", weatherCondition22.equals(org.mafagafogigante.dungeon.world.WeatherCondition.CLOUDY));
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit28 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR + "'", dungeonTimeUnit28.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date29);
    org.junit.Assert.assertTrue("'" + weatherCondition30 + "' != '" + org.mafagafogigante.dungeon.world.WeatherCondition.CLOUDY + "'", weatherCondition30.equals(org.mafagafogigante.dungeon.world.WeatherCondition.CLOUDY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long31 == 10L);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test040"); }

    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics0 = new org.mafagafogigante.dungeon.stats.WorldStatistics();
    worldStatistics0.addLocation("User: Nicholas\nTime: 15:35:09\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 4.3 MiB out of the allocated 121.0 MiB\nOS: Windows 10 (amd64) 10.0");
    int i3 = worldStatistics0.getSpawnCount();
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str4 = worldStatistics0.getLocationCounter();
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str5 = worldStatistics0.getLocationCounter();
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str6 = worldStatistics0.getSpawnCounter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str6);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test041"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    org.mafagafogigante.dungeon.game.Id id3 = null;
    creaturePreset0.setWeaponId(id3);
    org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId attackAlgorithmId5 = creaturePreset0.getAttackAlgorithmId();
    int i6 = creaturePreset0.getHealth();
    int i7 = creaturePreset0.getInventoryItemLimit();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(attackAlgorithmId5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test042"); }

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
    org.mafagafogigante.dungeon.entity.creatures.Creature creature13 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory16 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature13, (-1), 0.0d);
    org.mafagafogigante.dungeon.entity.items.Item item17 = null;
    boolean b18 = creatureInventory16.hasItem(item17);
    int i19 = creatureInventory16.getItemLimit();
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item20 = creatureInventory16.getItems();
    java.lang.String[] str_array24 = new java.lang.String[] { "1 ms", "You don't discover anything.", "User: Nicholas\nTime: 15:35:07\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 19.7 MiB out of the allocated 123.0 MiB\nOS: Windows 10 (amd64) 10.0" };
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item25 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems(list_item20, str_array24);
    dungeonString9.append(str_array24);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.io.PoemWriter.parsePoemCommand(str_array24);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
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
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item25);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test043"); }

    org.mafagafogigante.dungeon.entity.creatures.Hero hero0 = null;
    org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster heroSpellcaster1 = new org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster(hero0);
    java.util.List<org.mafagafogigante.dungeon.spells.Spell> list_spell2 = heroSpellcaster1.getSpellList();
    java.util.List<org.mafagafogigante.dungeon.spells.Spell> list_spell3 = heroSpellcaster1.getSpellList();
    java.util.List<org.mafagafogigante.dungeon.spells.Spell> list_spell4 = heroSpellcaster1.getSpellList();
    java.util.List<org.mafagafogigante.dungeon.spells.Spell> list_spell5 = heroSpellcaster1.getSpellList();
    java.util.List<org.mafagafogigante.dungeon.spells.Spell> list_spell6 = heroSpellcaster1.getSpellList();
    org.mafagafogigante.dungeon.spells.Spell spell7 = null;
    // The following exception was thrown during execution in test generation
    try {
    heroSpellcaster1.learnSpell(spell7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_spell2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_spell3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_spell4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_spell5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_spell6);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test044"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] creaturePresetFactory_array0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] {  };
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory1 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array0);
    org.mafagafogigante.dungeon.game.Id id2 = null;
    org.mafagafogigante.dungeon.game.World world3 = null;
    org.mafagafogigante.dungeon.entity.creatures.Creature creature4 = creatureFactory1.makeCreature(id2, world3);
    org.mafagafogigante.dungeon.game.Id id5 = null;
    org.mafagafogigante.dungeon.game.World world6 = null;
    org.mafagafogigante.dungeon.entity.creatures.Creature creature7 = creatureFactory1.makeCreature(id5, world6);
    java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.CreaturePreset> collection_creaturePreset8 = creatureFactory1.getPresets();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creaturePresetFactory_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(creature4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(creature7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_creaturePreset8);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test045"); }

    org.mafagafogigante.dungeon.commands.IssuedCommand issuedCommand1 = new org.mafagafogigante.dungeon.commands.IssuedCommand("0 kg");
    java.util.List<java.lang.String> list_str2 = issuedCommand1.getTokens();
    org.mafagafogigante.dungeon.commands.PreparedIssuedCommand preparedIssuedCommand3 = org.mafagafogigante.dungeon.commands.IssuedCommandProcessor.prepareIssuedCommand(issuedCommand1);
    java.util.List<java.lang.String> list_str4 = issuedCommand1.getTokens();
    java.util.List<java.lang.String> list_str5 = issuedCommand1.getTokens();
    org.mafagafogigante.dungeon.commands.PreparedIssuedCommand preparedIssuedCommand6 = org.mafagafogigante.dungeon.commands.IssuedCommandProcessor.prepareIssuedCommand(issuedCommand1);
    org.mafagafogigante.dungeon.commands.PreparedIssuedCommand preparedIssuedCommand7 = org.mafagafogigante.dungeon.commands.IssuedCommandProcessor.prepareIssuedCommand(issuedCommand1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(preparedIssuedCommand3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(preparedIssuedCommand6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(preparedIssuedCommand7);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test046"); }

    org.mafagafogigante.dungeon.commands.CommandHistory commandHistory0 = new org.mafagafogigante.dungeon.commands.CommandHistory();
    java.lang.String str2 = commandHistory0.getLastSimilarCommand("East");
    org.mafagafogigante.dungeon.commands.CommandHistory.Cursor cursor3 = commandHistory0.getCursor();
    org.mafagafogigante.dungeon.stats.Statistics statistics4 = new org.mafagafogigante.dungeon.stats.Statistics();
    statistics4.writeStatistics();
    statistics4.writeStatistics();
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker7 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics4);
    org.mafagafogigante.dungeon.commands.IssuedCommand issuedCommand9 = new org.mafagafogigante.dungeon.commands.IssuedCommand("10-10-10 00:00:00");
    java.util.List<java.lang.String> list_str10 = issuedCommand9.getTokens();
    statistics4.addCommand(issuedCommand9);
    java.util.List<java.lang.String> list_str12 = issuedCommand9.getTokens();
    commandHistory0.addCommand(issuedCommand9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cursor3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test047"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table6 = new org.mafagafogigante.dungeon.util.Table(str_array5);
    org.mafagafogigante.dungeon.io.Writer.writeAndWait((org.mafagafogigante.dungeon.game.Writable)table6);
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)table6);
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications11 = new org.mafagafogigante.dungeon.gui.WritingSpecifications(false, 97);
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)table6, writingSpecifications11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test048"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    boolean b3 = integrity2.isMaximum();
    org.mafagafogigante.dungeon.entity.items.Item item4 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity5 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity2, item4);
    int i6 = integrity2.getCurrent();
    org.mafagafogigante.dungeon.entity.Integrity integrity7 = new org.mafagafogigante.dungeon.entity.Integrity(integrity2);
    integrity7.incrementBy(32);
    boolean b10 = integrity7.isMaximum();
    org.mafagafogigante.dungeon.entity.Integrity integrity11 = new org.mafagafogigante.dungeon.entity.Integrity(integrity7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemIntegrity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test049"); }

    org.mafagafogigante.dungeon.entity.items.LocationInventory locationInventory0 = new org.mafagafogigante.dungeon.entity.items.LocationInventory();
    int i1 = locationInventory0.getItemCount();
    int i2 = locationInventory0.getItemCount();
    int i3 = locationInventory0.getItemCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test050"); }

    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics0 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point1 = null;
    org.mafagafogigante.dungeon.game.Id id2 = null;
    explorationStatistics0.createEntryIfNotExists(point1, id2);
    org.mafagafogigante.dungeon.game.Point point7 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id8 = null;
    explorationStatistics0.addVisit(point7, id8);
    org.mafagafogigante.dungeon.game.Point point13 = new org.mafagafogigante.dungeon.game.Point(100, 10, (int)(byte)10);
    int i14 = point13.getZ();
    org.mafagafogigante.dungeon.game.Id id15 = null;
    explorationStatistics0.createEntryIfNotExists(point13, id15);
    int i17 = point13.getY();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 10);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test051"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    java.lang.String str5 = itemPreset0.getType();
    itemPreset0.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset8 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity9 = itemPreset8.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity10 = null;
    itemPreset8.setIntegrity(integrity10);
    org.mafagafogigante.dungeon.util.Percentage percentage12 = itemPreset8.getVisibility();
    java.lang.String str13 = itemPreset8.getType();
    org.mafagafogigante.dungeon.entity.items.Item.Tag tag14 = org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE;
    itemPreset8.addTag(tag14);
    itemPreset0.addTag(tag14);
    int i17 = itemPreset0.getDamage();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    org.junit.Assert.assertTrue("'" + tag14 + "' != '" + org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE + "'", tag14.equals(org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test052"); }

    boolean b1 = org.mafagafogigante.dungeon.util.Percentage.isValidPercentageString("Unarmed : UNARMED");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test053"); }

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
    creaturePreset0.setAttack(32304);
    double d18 = creaturePreset0.getInventoryWeightLimit();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay19 = org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity20 = partOfDay19.getLuminosity();
    creaturePreset0.setLuminosity(luminosity20);
    int i22 = creaturePreset0.getAttack();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(id_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);
    org.junit.Assert.assertTrue("'" + partOfDay19 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay19.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 32304);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test054"); }

    org.mafagafogigante.dungeon.commands.CommandHistory commandHistory0 = new org.mafagafogigante.dungeon.commands.CommandHistory();
    java.lang.String str2 = commandHistory0.getLastSimilarCommand("");
    java.lang.String str4 = commandHistory0.getLastSimilarCommand("Unarmed : UNARMED");
    org.mafagafogigante.dungeon.commands.CommandHistory.Cursor cursor5 = commandHistory0.getCursor();
    org.mafagafogigante.dungeon.commands.IssuedCommand issuedCommand7 = new org.mafagafogigante.dungeon.commands.IssuedCommand("0 kg");
    commandHistory0.addCommand(issuedCommand7);
    java.lang.String str9 = issuedCommand7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cursor5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0 kg"+ "'", str9.equals("0 kg"));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test055"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.util.Percentage percentage2 = itemPreset0.getVisibility();
    boolean b3 = itemPreset0.isUnique();
    org.mafagafogigante.dungeon.game.Id id4 = itemPreset0.getSpellId();
    itemPreset0.setIntegrityDecrementPerDose((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id4);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test056"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, 97, 35.0d);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test057"); }

    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics0 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    int i2 = explorationStatistics0.getKillCount(id1);
    org.mafagafogigante.dungeon.game.Id id3 = null;
    int i4 = explorationStatistics0.getKillCount(id3);
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics5 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point6 = null;
    org.mafagafogigante.dungeon.game.Id id7 = null;
    explorationStatistics5.createEntryIfNotExists(point6, id7);
    org.mafagafogigante.dungeon.game.Point point12 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id13 = null;
    explorationStatistics5.addVisit(point12, id13);
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics15 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point16 = null;
    org.mafagafogigante.dungeon.game.Id id17 = null;
    explorationStatistics15.createEntryIfNotExists(point16, id17);
    org.mafagafogigante.dungeon.game.Point point22 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id23 = null;
    explorationStatistics15.addVisit(point22, id23);
    int i25 = point22.getZ();
    org.mafagafogigante.dungeon.game.Id id26 = null;
    explorationStatistics5.createEntryIfNotExists(point22, id26);
    org.mafagafogigante.dungeon.game.Id id28 = null;
    explorationStatistics0.addVisit(point22, id28);
    int i30 = point22.getX();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 32);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test058"); }

    org.mafagafogigante.dungeon.util.ShuffledRange shuffledRange2 = new org.mafagafogigante.dungeon.util.ShuffledRange(3, 10);
    shuffledRange2.shuffle();
    int i4 = shuffledRange2.getSize();
    shuffledRange2.shuffle();
    shuffledRange2.shuffle();
    int i7 = shuffledRange2.getSize();
    int i8 = shuffledRange2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 7);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test059"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity1 = itemPreset0.getLuminosity();
    java.lang.String str2 = itemPreset0.getType();
    org.mafagafogigante.dungeon.util.Percentage percentage4 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b6 = percentage4.equals((java.lang.Object)10.0d);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity7 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage4);
    itemPreset0.setLuminosity(luminosity7);
    org.mafagafogigante.dungeon.util.Percentage percentage9 = itemPreset0.getVisibility();
    itemPreset0.setUnique(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage9);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test060"); }

    org.mafagafogigante.dungeon.stats.Statistics statistics0 = new org.mafagafogigante.dungeon.stats.Statistics();
    statistics0.writeStatistics();
    statistics0.writeStatistics();
    statistics0.writeStatistics();
    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics4 = statistics0.getWorldStatistics();
    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics5 = statistics0.getBattleStatistics();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(worldStatistics4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(battleStatistics5);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test061"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity((int)(byte)1, (int)(byte)0);
    boolean b3 = integrity2.isMaximum();
    integrity2.incrementBy((int)(short)0);
    org.mafagafogigante.dungeon.entity.items.Item item6 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity7 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity2, item6);
    int i8 = itemIntegrity7.getCurrent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemIntegrity7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test062"); }

    org.mafagafogigante.dungeon.util.Percentage percentage1 = new org.mafagafogigante.dungeon.util.Percentage(35.0d);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset2 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity3 = itemPreset2.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity4 = null;
    itemPreset2.setIntegrity(integrity4);
    org.mafagafogigante.dungeon.util.Percentage percentage6 = itemPreset2.getVisibility();
    java.lang.String str7 = itemPreset2.getType();
    org.mafagafogigante.dungeon.entity.items.Item.Tag tag8 = org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE;
    itemPreset2.addTag(tag8);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset10 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity11 = itemPreset10.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity12 = null;
    itemPreset10.setIntegrity(integrity12);
    org.mafagafogigante.dungeon.util.Percentage percentage14 = itemPreset10.getVisibility();
    java.lang.String str15 = itemPreset10.getType();
    itemPreset10.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage19 = new org.mafagafogigante.dungeon.util.Percentage((double)(short)10);
    itemPreset10.setVisibility(percentage19);
    org.mafagafogigante.dungeon.util.Percentage percentage22 = new org.mafagafogigante.dungeon.util.Percentage((double)(short)10);
    int i23 = percentage19.compareTo(percentage22);
    itemPreset2.setVisibility(percentage19);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset25 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity26 = itemPreset25.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity27 = null;
    itemPreset25.setIntegrity(integrity27);
    org.mafagafogigante.dungeon.util.Percentage percentage30 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    itemPreset25.setHitRate(percentage30);
    double d32 = percentage30.toDouble();
    org.mafagafogigante.dungeon.util.Percentage percentage33 = percentage19.multiply(percentage30);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature35 = null;
    org.mafagafogigante.dungeon.entity.creatures.CreatureHealth creatureHealth36 = org.mafagafogigante.dungeon.entity.creatures.CreatureHealth.makeCreatureHealth(100, creature35);
    boolean b37 = creatureHealth36.isAlive();
    boolean b38 = creatureHealth36.isDead();
    creatureHealth36.decrementBy((int)(short)-1);
    boolean b41 = creatureHealth36.isAlive();
    org.mafagafogigante.dungeon.util.Percentage percentage42 = creatureHealth36.toPercentage();
    int i43 = percentage30.compareTo(percentage42);
    int i44 = percentage1.compareTo(percentage42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    org.junit.Assert.assertTrue("'" + tag8 + "' != '" + org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE + "'", tag8.equals(org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d32 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creatureHealth36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test063"); }

    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery0 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    boolean b2 = battleStatisticsQuery0.equals((java.lang.Object)0.0d);
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement4 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement(battleStatisticsQuery0, (int)(byte)100);
    int i5 = battleStatisticsRequirement4.getCount();
    int i6 = battleStatisticsRequirement4.getCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test064"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    java.lang.String str3 = integrity2.toString();
    java.lang.String str4 = integrity2.toString();
    java.lang.String str5 = integrity2.toString();
    java.lang.String str6 = integrity2.toString();
    int i7 = integrity2.getMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0/1"+ "'", str3.equals("0/1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0/1"+ "'", str4.equals("0/1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0/1"+ "'", str5.equals("0/1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0/1"+ "'", str6.equals("0/1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test065"); }

    org.mafagafogigante.dungeon.commands.CommandDescription commandDescription2 = new org.mafagafogigante.dungeon.commands.CommandDescription("", "Midnight");
    java.lang.String str3 = commandDescription2.getName();
    java.lang.String str4 = commandDescription2.getInfo();
    java.lang.String str5 = commandDescription2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Midnight"+ "'", str4.equals("Midnight"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test066"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity(10, (int)(byte)1);
    java.lang.String str3 = integrity2.toString();
    int i4 = integrity2.getMaximum();
    org.mafagafogigante.dungeon.entity.items.Item item5 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity6 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity2, item5);
    int i7 = itemIntegrity6.getCurrent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1/10"+ "'", str3.equals("1/10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemIntegrity6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test067"); }

    org.mafagafogigante.dungeon.world.WeatherCondition weatherCondition0 = org.mafagafogigante.dungeon.world.WeatherCondition.STORM;
    org.mafagafogigante.dungeon.world.WeatherCondition weatherCondition1 = org.mafagafogigante.dungeon.world.WeatherCondition.RAIN;
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.world.WeatherConditionVisibilityCriterion weatherConditionVisibilityCriterion2 = new org.mafagafogigante.dungeon.world.WeatherConditionVisibilityCriterion(weatherCondition0, weatherCondition1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + weatherCondition0 + "' != '" + org.mafagafogigante.dungeon.world.WeatherCondition.STORM + "'", weatherCondition0.equals(org.mafagafogigante.dungeon.world.WeatherCondition.STORM));
    org.junit.Assert.assertTrue("'" + weatherCondition1 + "' != '" + org.mafagafogigante.dungeon.world.WeatherCondition.RAIN + "'", weatherCondition1.equals(org.mafagafogigante.dungeon.world.WeatherCondition.RAIN));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test068"); }

    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery0 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    boolean b2 = battleStatisticsQuery0.equals((java.lang.Object)0.0d);
    org.mafagafogigante.dungeon.game.Id id3 = null;
    battleStatisticsQuery0.setId(id3);
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath5 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    battleStatisticsQuery0.setCauseOfDeath(causeOfDeath5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath5);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test069"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.entity.Integrity integrity6 = new org.mafagafogigante.dungeon.entity.Integrity(100, 0);
    integrity6.decrementBy((int)(byte)100);
    itemPreset0.setIntegrity(integrity6);
    integrity6.decrementBy(79648);
    int i12 = integrity6.getMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test070"); }

    org.mafagafogigante.dungeon.stats.Statistics statistics0 = new org.mafagafogigante.dungeon.stats.Statistics();
    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics1 = statistics0.getBattleStatistics();
    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics2 = statistics0.getWorldStatistics();
    statistics0.writeStatistics();
    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics4 = statistics0.getWorldStatistics();
    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics5 = statistics0.getBattleStatistics();
    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics6 = statistics0.getBattleStatistics();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(battleStatistics1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(worldStatistics2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(worldStatistics4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(battleStatistics5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(battleStatistics6);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test071"); }

    org.mafagafogigante.dungeon.entity.Weight weight1 = org.mafagafogigante.dungeon.entity.Weight.newInstance(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight1);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test072"); }

    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics0 = new org.mafagafogigante.dungeon.stats.BattleStatistics();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement1 = null;
    boolean b2 = battleStatistics0.satisfies(battleStatisticsRequirement1);
    java.lang.String str3 = battleStatistics0.toString();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery4 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    boolean b6 = battleStatisticsQuery4.equals((java.lang.Object)0.0d);
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement8 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement(battleStatisticsQuery4, (int)(byte)100);
    boolean b9 = battleStatistics0.satisfies(battleStatisticsRequirement8);
    org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.CauseOfDeath> countermap_causeOfDeath10 = battleStatistics0.getKillsByCauseOfDeath();
    boolean b11 = countermap_causeOfDeath10.isNotEmpty();
    java.util.Spliterator<org.mafagafogigante.dungeon.stats.CauseOfDeath> spliterator_causeOfDeath12 = countermap_causeOfDeath10.spliterator();
    java.util.Iterator<org.mafagafogigante.dungeon.stats.CauseOfDeath> iterator_causeOfDeath13 = countermap_causeOfDeath10.iterator();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery14 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath15 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    battleStatisticsQuery14.setCauseOfDeath(causeOfDeath15);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset17 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity18 = itemPreset17.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity19 = null;
    itemPreset17.setIntegrity(integrity19);
    org.mafagafogigante.dungeon.util.Percentage percentage21 = itemPreset17.getVisibility();
    java.lang.String str22 = itemPreset17.getType();
    itemPreset17.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage26 = new org.mafagafogigante.dungeon.util.Percentage((double)(short)10);
    itemPreset17.setVisibility(percentage26);
    org.mafagafogigante.dungeon.util.Percentage percentage29 = new org.mafagafogigante.dungeon.util.Percentage((double)(short)10);
    int i30 = percentage26.compareTo(percentage29);
    double d31 = percentage26.toDouble();
    boolean b32 = causeOfDeath15.equals((java.lang.Object)percentage26);
    int i33 = countermap_causeOfDeath10.getCounter(causeOfDeath15);
    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics34 = new org.mafagafogigante.dungeon.stats.BattleStatistics();
    java.lang.String str35 = battleStatistics34.toString();
    org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.CauseOfDeath> countermap_causeOfDeath36 = battleStatistics34.getKillsByCauseOfDeath();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath37 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    java.lang.String[] str_array41 = new java.lang.String[] { "Damaged", "visibilityCriteria=VisibilityCriteria{[]}", "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str42 = new java.util.ArrayList<java.lang.String>();
    boolean b43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str42, str_array41);
    org.mafagafogigante.dungeon.io.Split split44 = org.mafagafogigante.dungeon.io.Split.splitOnOn((java.util.List<java.lang.String>)arraylist_str42);
    java.util.List<java.lang.String> list_str45 = split44.getBefore();
    boolean b46 = causeOfDeath37.equals((java.lang.Object)list_str45);
    java.lang.String str47 = causeOfDeath37.toString();
    org.mafagafogigante.dungeon.entity.Weight weight49 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    org.mafagafogigante.dungeon.entity.Weight weight50 = org.mafagafogigante.dungeon.entity.Weight.ZERO;
    org.mafagafogigante.dungeon.entity.Weight weight51 = weight49.add(weight50);
    java.lang.String str52 = weight51.toString();
    boolean b53 = causeOfDeath37.equals((java.lang.Object)str52);
    countermap_causeOfDeath36.incrementCounter(causeOfDeath37, (java.lang.Integer)52);
    countermap_causeOfDeath10.incrementCounter(causeOfDeath37, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "BattleStatistics{records=CounterMap{map={}}}"+ "'", str3.equals("BattleStatistics{records=CounterMap{map={}}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_causeOfDeath10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_causeOfDeath12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_causeOfDeath13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d31 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "BattleStatistics{records=CounterMap{map={}}}"+ "'", str35.equals("BattleStatistics{records=CounterMap{map={}}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_causeOfDeath36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(split44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "Unarmed : UNARMED"+ "'", str47.equals("Unarmed : UNARMED"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "0 kg"+ "'", str52.equals("0 kg"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test073"); }

    org.mafagafogigante.dungeon.game.LocationPreset locationPreset0 = null;
    org.mafagafogigante.dungeon.game.World world1 = null;
    org.mafagafogigante.dungeon.game.Point point5 = new org.mafagafogigante.dungeon.game.Point((int)'#', (int)(short)0, 3);
    int i6 = point5.getX();
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.game.Location location7 = new org.mafagafogigante.dungeon.game.Location(locationPreset0, world1, point5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 35);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test074"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    creaturePreset0.setAttack(57);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity5 = creaturePreset0.getLuminosity();
    double d6 = creaturePreset0.getInventoryWeightLimit();
    org.mafagafogigante.dungeon.game.Id id7 = creaturePreset0.getWeaponId();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity8 = creaturePreset0.getLuminosity();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity9 = creaturePreset0.getLuminosity();
    java.lang.String str10 = creaturePreset0.getType();
    java.lang.String str11 = creaturePreset0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test075"); }

    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances0 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.Direction direction1 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b2 = blockedEntrances0.isBlocked(direction1);
    java.lang.String str3 = blockedEntrances0.toString();
    org.junit.Assert.assertTrue("'" + direction1 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction1.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "None"+ "'", str3.equals("None"));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test076"); }

    org.mafagafogigante.dungeon.game.Numeral numeral1 = org.mafagafogigante.dungeon.game.Numeral.getCorrespondingNumeral(10);
    java.lang.String str2 = numeral1.toString();
    org.junit.Assert.assertTrue("'" + numeral1 + "' != '" + org.mafagafogigante.dungeon.game.Numeral.MORE_THAN_FIVE + "'", numeral1.equals(org.mafagafogigante.dungeon.game.Numeral.MORE_THAN_FIVE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A few"+ "'", str2.equals("A few"));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test077"); }

    org.mafagafogigante.dungeon.util.Percentage percentage1 = new org.mafagafogigante.dungeon.util.Percentage((double)1L);
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery2 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath3 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    battleStatisticsQuery2.setCauseOfDeath(causeOfDeath3);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset5 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity6 = itemPreset5.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity7 = null;
    itemPreset5.setIntegrity(integrity7);
    org.mafagafogigante.dungeon.util.Percentage percentage9 = itemPreset5.getVisibility();
    java.lang.String str10 = itemPreset5.getType();
    itemPreset5.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage14 = new org.mafagafogigante.dungeon.util.Percentage((double)(short)10);
    itemPreset5.setVisibility(percentage14);
    org.mafagafogigante.dungeon.util.Percentage percentage17 = new org.mafagafogigante.dungeon.util.Percentage((double)(short)10);
    int i18 = percentage14.compareTo(percentage17);
    double d19 = percentage14.toDouble();
    boolean b20 = causeOfDeath3.equals((java.lang.Object)percentage14);
    org.mafagafogigante.dungeon.util.Percentage percentage22 = new org.mafagafogigante.dungeon.util.Percentage((double)1L);
    int i23 = percentage14.compareTo(percentage22);
    java.lang.Object obj24 = null;
    boolean b25 = percentage14.equals(obj24);
    boolean b26 = percentage1.biggerThanOrEqualTo(percentage14);
    org.mafagafogigante.dungeon.entity.Visibility visibility27 = new org.mafagafogigante.dungeon.entity.Visibility(percentage1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test078"); }

    boolean b1 = org.mafagafogigante.dungeon.commands.IssuedCommand.isValidSource("day 10 of month 10 of the year 100");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test079"); }

    org.mafagafogigante.dungeon.commands.IssuedCommand issuedCommand1 = new org.mafagafogigante.dungeon.commands.IssuedCommand("10-10-10 00:00:00");
    java.util.List<java.lang.String> list_str2 = issuedCommand1.getTokens();
    org.mafagafogigante.dungeon.io.Split split3 = org.mafagafogigante.dungeon.io.Split.splitOnOn(list_str2);
    java.util.List<java.lang.String> list_str4 = split3.getAfter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(split3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test080"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    java.lang.String str5 = itemPreset0.getType();
    itemPreset0.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage9 = new org.mafagafogigante.dungeon.util.Percentage((double)(short)10);
    itemPreset0.setVisibility(percentage9);
    org.mafagafogigante.dungeon.game.Id id11 = null;
    itemPreset0.setId(id11);
    itemPreset0.setIntegrityDecrementOnEat((-1));
    org.mafagafogigante.dungeon.util.Percentage percentage15 = itemPreset0.getVisibility();
    org.mafagafogigante.dungeon.entity.Integrity integrity18 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    boolean b19 = integrity18.isMaximum();
    org.mafagafogigante.dungeon.entity.items.Item item20 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity21 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity18, item20);
    int i22 = integrity18.getCurrent();
    itemPreset0.setIntegrity(integrity18);
    int i24 = itemPreset0.getDrinkableDoses();
    org.mafagafogigante.dungeon.entity.TagSet<org.mafagafogigante.dungeon.entity.items.Item.Tag> tagset_tag25 = itemPreset0.getTagSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemIntegrity21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tagset_tag25);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test081"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset2 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity3 = itemPreset2.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity4 = null;
    itemPreset2.setIntegrity(integrity4);
    org.mafagafogigante.dungeon.util.Percentage percentage6 = itemPreset2.getVisibility();
    java.lang.String str7 = itemPreset2.getType();
    itemPreset2.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage11 = new org.mafagafogigante.dungeon.util.Percentage((double)(short)10);
    itemPreset2.setVisibility(percentage11);
    org.mafagafogigante.dungeon.entity.Entity[] entity_array13 = new org.mafagafogigante.dungeon.entity.Entity[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.Entity> arraylist_entity14 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.Entity>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.Entity>)arraylist_entity14, entity_array13);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity16 = org.mafagafogigante.dungeon.entity.Luminosity.resultantLuminosity((java.util.Collection<org.mafagafogigante.dungeon.entity.Entity>)arraylist_entity14);
    org.mafagafogigante.dungeon.util.Percentage percentage17 = luminosity16.toPercentage();
    org.mafagafogigante.dungeon.util.Percentage percentage18 = percentage11.multiply(percentage17);
    org.mafagafogigante.dungeon.util.Percentage percentage22 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b24 = percentage22.equals((java.lang.Object)10.0d);
    java.lang.String str25 = percentage22.toString();
    double d26 = org.mafagafogigante.dungeon.util.DungeonMath.weightedAverage((double)(short)0, (double)(-1), percentage22);
    int i27 = percentage17.compareTo(percentage22);
    double d28 = org.mafagafogigante.dungeon.util.DungeonMath.weightedAverage((double)35, (double)(byte)-1, percentage17);
    java.lang.String str29 = percentage17.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(entity_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "100.00%"+ "'", str25.equals("100.00%"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d26 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d28 == 35.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "0.00%"+ "'", str29.equals("0.00%"));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test082"); }

    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics0 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    int i2 = explorationStatistics0.getKillCount(id1);
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics3 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point7 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id8 = null;
    explorationStatistics3.addVisit(point7, id8);
    org.mafagafogigante.dungeon.game.Id id10 = null;
    explorationStatistics0.createEntryIfNotExists(point7, id10);
    java.lang.String str12 = point7.toString();
    int i13 = point7.getX();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset14 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity15 = itemPreset14.getIntegrity();
    org.mafagafogigante.dungeon.util.Percentage percentage16 = itemPreset14.getVisibility();
    org.mafagafogigante.dungeon.entity.Integrity integrity19 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    java.lang.String str20 = integrity19.toString();
    itemPreset14.setIntegrity(integrity19);
    boolean b22 = integrity19.isZero();
    integrity19.incrementBy(1);
    org.mafagafogigante.dungeon.entity.Integrity integrity25 = new org.mafagafogigante.dungeon.entity.Integrity(integrity19);
    boolean b26 = integrity25.isZero();
    org.mafagafogigante.dungeon.entity.items.Item item27 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity28 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity25, item27);
    boolean b29 = itemIntegrity28.isBroken();
    boolean b30 = point7.equals((java.lang.Object)b29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{32, 0, -1}"+ "'", str12.equals("{32, 0, -1}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "0/1"+ "'", str20.equals("0/1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemIntegrity28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test083"); }

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
    int i16 = creaturePreset0.getAttack();
    org.mafagafogigante.dungeon.game.Id id17 = null;
    creaturePreset0.setId(id17);
    org.mafagafogigante.dungeon.util.Percentage percentage19 = creaturePreset0.getVisibility();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset20 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity21 = itemPreset20.getIntegrity();
    itemPreset20.setIntegrityDecrementOnEat((-1));
    org.mafagafogigante.dungeon.entity.Weight weight24 = itemPreset20.getWeight();
    int i25 = itemPreset20.getNutrition();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity26 = itemPreset20.getLuminosity();
    creaturePreset0.setLuminosity(luminosity26);
    org.mafagafogigante.dungeon.game.Id id28 = null;
    creaturePreset0.setId(id28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(id_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity26);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test084"); }

    org.mafagafogigante.dungeon.entity.Weight weight1 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)'#');
    org.mafagafogigante.dungeon.entity.Weight weight3 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)'#');
    org.mafagafogigante.dungeon.entity.Weight weight4 = weight1.add(weight3);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset5 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity6 = itemPreset5.getIntegrity();
    itemPreset5.setIntegrityDecrementOnEat((-1));
    org.mafagafogigante.dungeon.entity.Weight weight9 = itemPreset5.getWeight();
    itemPreset5.setDrinkableHealing((int)(byte)1);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset12 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity13 = itemPreset12.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity14 = null;
    itemPreset12.setIntegrity(integrity14);
    org.mafagafogigante.dungeon.util.Percentage percentage16 = itemPreset12.getVisibility();
    java.lang.String str17 = itemPreset12.getType();
    itemPreset12.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage21 = new org.mafagafogigante.dungeon.util.Percentage((double)(short)10);
    itemPreset12.setVisibility(percentage21);
    org.mafagafogigante.dungeon.util.Percentage percentage24 = new org.mafagafogigante.dungeon.util.Percentage((double)(short)10);
    int i25 = percentage21.compareTo(percentage24);
    itemPreset5.setVisibility(percentage21);
    org.mafagafogigante.dungeon.entity.Weight weight27 = weight1.multiply(percentage21);
    org.mafagafogigante.dungeon.date.Date date31 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    java.lang.String str32 = date31.toDateString();
    org.mafagafogigante.dungeon.world.Weather weather33 = new org.mafagafogigante.dungeon.world.Weather(date31);
    long long34 = date31.getDay();
    org.mafagafogigante.dungeon.world.Weather weather35 = new org.mafagafogigante.dungeon.world.Weather(date31);
    boolean b36 = percentage21.equals((java.lang.Object)weather35);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset37 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity38 = itemPreset37.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity39 = null;
    itemPreset37.setIntegrity(integrity39);
    org.mafagafogigante.dungeon.util.Percentage percentage41 = itemPreset37.getVisibility();
    java.lang.String str42 = itemPreset37.getType();
    org.mafagafogigante.dungeon.entity.items.Item.Tag tag43 = org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE;
    itemPreset37.addTag(tag43);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset45 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    itemPreset45.setDrinkableHealing((int)(short)10);
    org.mafagafogigante.dungeon.util.Percentage percentage49 = new org.mafagafogigante.dungeon.util.Percentage((double)(short)10);
    itemPreset45.setVisibility(percentage49);
    itemPreset37.setHitRate(percentage49);
    java.lang.String str52 = percentage49.toString();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset53 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity54 = itemPreset53.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity55 = null;
    itemPreset53.setIntegrity(integrity55);
    org.mafagafogigante.dungeon.util.Percentage percentage57 = itemPreset53.getVisibility();
    java.lang.String str58 = itemPreset53.getType();
    itemPreset53.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset61 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity62 = itemPreset61.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity63 = null;
    itemPreset61.setIntegrity(integrity63);
    org.mafagafogigante.dungeon.util.Percentage percentage65 = itemPreset61.getVisibility();
    java.lang.String str66 = itemPreset61.getType();
    org.mafagafogigante.dungeon.entity.items.Item.Tag tag67 = org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE;
    itemPreset61.addTag(tag67);
    itemPreset53.addTag(tag67);
    org.mafagafogigante.dungeon.util.Percentage percentage71 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b73 = percentage71.equals((java.lang.Object)10.0d);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity74 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage71);
    org.mafagafogigante.dungeon.util.Percentage percentage75 = luminosity74.toPercentage();
    itemPreset53.setHitRate(percentage75);
    int i77 = percentage49.compareTo(percentage75);
    org.mafagafogigante.dungeon.util.Percentage percentage78 = percentage21.multiply(percentage75);
    double d79 = percentage75.toDouble();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "day 10 of month 10 of the year 10"+ "'", str32.equals("day 10 of month 10 of the year 10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long34 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str42);
    org.junit.Assert.assertTrue("'" + tag43 + "' != '" + org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE + "'", tag43.equals(org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "100.00%"+ "'", str52.equals("100.00%"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str66);
    org.junit.Assert.assertTrue("'" + tag67 + "' != '" + org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE + "'", tag67.equals(org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d79 == 1.0d);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test085"); }

    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications2 = new org.mafagafogigante.dungeon.gui.WritingSpecifications(false, 46800);
    int i3 = writingSpecifications2.getWait();
    java.lang.String str4 = writingSpecifications2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 46800);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "WritingSpecifications{scrollDown=false}"+ "'", str4.equals("WritingSpecifications{scrollDown=false}"));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test086"); }

    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit0 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.YEAR;
    org.mafagafogigante.dungeon.date.Date date4 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date8 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i9 = date4.compareTo(date8);
    long long10 = date8.getDay();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay11 = org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity12 = partOfDay11.getLuminosity();
    int i13 = org.mafagafogigante.dungeon.game.PartOfDay.getSecondsToNext(date8, partOfDay11);
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit15 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.DAY;
    org.mafagafogigante.dungeon.date.Date date16 = date8.plus(10, dungeonTimeUnit15);
    long long17 = dungeonTimeUnit0.as(dungeonTimeUnit15);
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit0 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.YEAR + "'", dungeonTimeUnit0.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.YEAR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 10L);
    org.junit.Assert.assertTrue("'" + partOfDay11 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay11.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 82800);
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit15 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.DAY + "'", dungeonTimeUnit15.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.DAY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 100L);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test087"); }

    org.mafagafogigante.dungeon.entity.creatures.Hero hero0 = null;
    org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster heroSpellcaster1 = new org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster(hero0);
    org.mafagafogigante.dungeon.spells.Spell spell2 = null;
    boolean b3 = heroSpellcaster1.knowsSpell(spell2);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array4 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item5 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item5, item_array4);
    java.lang.String[] str_array12 = new java.lang.String[] { "CounterMap{map={}}", "User: Nicholas\nTime: 15:35:09\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 4.3 MiB out of the allocated 121.0 MiB\nOS: Windows 10 (amd64) 10.0", "hi!", "0 ms", "User: Nicholas\nTime: 15:35:09\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 26.6 MiB out of the allocated 121.0 MiB\nOS: Windows 10 (amd64) 10.0" };
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item13 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item5, str_array12);
    java.lang.String[] str_array19 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table20 = new org.mafagafogigante.dungeon.util.Table(str_array19);
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item21 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems(list_item13, str_array19);
    org.mafagafogigante.dungeon.util.Table table22 = new org.mafagafogigante.dungeon.util.Table(str_array19);
    heroSpellcaster1.parseCast(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item21);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test088"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature1 = null;
    org.mafagafogigante.dungeon.entity.creatures.CreatureHealth creatureHealth2 = org.mafagafogigante.dungeon.entity.creatures.CreatureHealth.makeCreatureHealth(100, creature1);
    creatureHealth2.incrementBy(57);
    creatureHealth2.decrementBy(10);
    org.mafagafogigante.dungeon.entity.creatures.HealthState healthState7 = creatureHealth2.getHealthState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creatureHealth2);
    org.junit.Assert.assertTrue("'" + healthState7 + "' != '" + org.mafagafogigante.dungeon.entity.creatures.HealthState.UNINJURED + "'", healthState7.equals(org.mafagafogigante.dungeon.entity.creatures.HealthState.UNINJURED));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test089"); }

    org.mafagafogigante.dungeon.util.Percentage percentage1 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b3 = percentage1.equals((java.lang.Object)10.0d);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity4 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage1);
    org.mafagafogigante.dungeon.util.Percentage percentage5 = luminosity4.toPercentage();
    org.mafagafogigante.dungeon.entity.Visibility visibility6 = new org.mafagafogigante.dungeon.entity.Visibility(percentage5);
    java.lang.String str7 = visibility6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Visibility of 100.00%"+ "'", str7.equals("Visibility of 100.00%"));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test090"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset1 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = itemPreset1.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity3 = null;
    itemPreset1.setIntegrity(integrity3);
    org.mafagafogigante.dungeon.util.Percentage percentage5 = itemPreset1.getVisibility();
    java.lang.String str6 = itemPreset1.getType();
    itemPreset1.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage10 = new org.mafagafogigante.dungeon.util.Percentage((double)(short)10);
    itemPreset1.setVisibility(percentage10);
    boolean b12 = org.mafagafogigante.dungeon.game.Random.roll(percentage10);
    org.mafagafogigante.dungeon.entity.items.WeaponComponent weaponComponent14 = new org.mafagafogigante.dungeon.entity.items.WeaponComponent((int)(short)100, percentage10, 1);
    int i15 = weaponComponent14.getIntegrityDecrementOnHit();
    int i16 = weaponComponent14.getDamage();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 100);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test091"); }

    boolean b1 = org.mafagafogigante.dungeon.util.Percentage.isValidPercentageString("it is raining");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test092"); }

    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances0 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances1 = new org.mafagafogigante.dungeon.game.BlockedEntrances(blockedEntrances0);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test093"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, (int)'#', (double)1);
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
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test094"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    java.lang.String str3 = integrity2.toString();
    java.lang.String str4 = integrity2.toString();
    boolean b5 = integrity2.isMaximum();
    int i6 = integrity2.getMaximum();
    org.mafagafogigante.dungeon.entity.items.Item item7 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity8 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity2, item7);
    itemIntegrity8.incrementBy((int)(short)-1);
    java.lang.String str11 = itemIntegrity8.toString();
    java.lang.String str12 = itemIntegrity8.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0/1"+ "'", str3.equals("0/1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0/1"+ "'", str4.equals("0/1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemIntegrity8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "ItemIntegrity{integrity=0/1, item=null}"+ "'", str11.equals("ItemIntegrity{integrity=0/1, item=null}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "ItemIntegrity{integrity=0/1, item=null}"+ "'", str12.equals("ItemIntegrity{integrity=0/1, item=null}"));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test095"); }

    org.mafagafogigante.dungeon.util.Messenger.printFailedToCreateDirectoryMessage("day 1 of month 1 of the year 1");

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test096"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity2 = itemPreset0.getLuminosity();
    org.mafagafogigante.dungeon.util.Percentage percentage4 = new org.mafagafogigante.dungeon.util.Percentage((double)(short)10);
    itemPreset0.setVisibility(percentage4);
    org.mafagafogigante.dungeon.game.Name name6 = itemPreset0.getName();
    int i7 = itemPreset0.getNutrition();
    itemPreset0.setIntegrityDecrementOnEat((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(name6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test097"); }

    java.awt.Color color1 = null;
    org.mafagafogigante.dungeon.game.LocationDescription locationDescription2 = new org.mafagafogigante.dungeon.game.LocationDescription('a', color1);
    java.lang.String str3 = locationDescription2.getInfo();
    java.lang.String str4 = locationDescription2.getInfo();
    locationDescription2.setInfo("0 B");
    locationDescription2.setInfo("ColoredString{string='hi!|visibilityCriteria=VisibilityCriteria{[]} |visibilityCriteria=VisibilityCriteria{[]}|Damaged|hi!\n---|------------------------------------------|-----------------------------------------|-------|---\n', color=java.awt.Color[r=192,g=192,b=192]}");
    locationDescription2.setInfo("User: Nicholas\nTime: 15:38:29\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 46.4 MiB out of the allocated 109.5 MiB\nOS: Windows 10 (amd64) 10.0");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "You don't discover anything."+ "'", str3.equals("You don't discover anything."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "You don't discover anything."+ "'", str4.equals("You don't discover anything."));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test098"); }

    org.mafagafogigante.dungeon.util.Percentage percentage1 = new org.mafagafogigante.dungeon.util.Percentage((double)(short)1);
    org.mafagafogigante.dungeon.entity.Visibility visibility2 = new org.mafagafogigante.dungeon.entity.Visibility(percentage1);
    java.lang.String str3 = visibility2.toString();
    org.mafagafogigante.dungeon.util.Percentage percentage4 = visibility2.toPercentage();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Visibility of 100.00%"+ "'", str3.equals("Visibility of 100.00%"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage4);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test099"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    itemPreset0.setDrinkableHealing((int)(short)10);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = new org.mafagafogigante.dungeon.util.Percentage((double)(short)10);
    itemPreset0.setVisibility(percentage4);
    org.mafagafogigante.dungeon.entity.Integrity integrity6 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Weight weight7 = itemPreset0.getWeight();
    org.mafagafogigante.dungeon.util.Percentage percentage11 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b13 = percentage11.equals((java.lang.Object)10.0d);
    java.lang.String str14 = percentage11.toString();
    double d15 = org.mafagafogigante.dungeon.util.DungeonMath.weightedAverage((double)(short)0, (double)(-1), percentage11);
    itemPreset0.setHitRate(percentage11);
    boolean b17 = itemPreset0.isUnique();
    itemPreset0.setText("ItemIntegrity{integrity=0/1, item=null}");
    boolean b20 = itemPreset0.isUnique();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "100.00%"+ "'", str14.equals("100.00%"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test100"); }

    org.mafagafogigante.dungeon.game.Id id0 = null;
    org.mafagafogigante.dungeon.entity.items.BookComponent bookComponent2 = new org.mafagafogigante.dungeon.entity.items.BookComponent(id0, "CreatureHealth{integrity=100/100}");
    boolean b3 = bookComponent2.isDidactic();
    boolean b4 = bookComponent2.isDidactic();
    int i5 = bookComponent2.getTimeToRead();
    org.mafagafogigante.dungeon.game.Id id6 = bookComponent2.getSpellId();
    java.lang.String str7 = bookComponent2.toString();
    java.lang.String str8 = bookComponent2.getText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "This book teaches nothing. Text: CreatureHealth{integrity=100/100}"+ "'", str7.equals("This book teaches nothing. Text: CreatureHealth{integrity=100/100}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "CreatureHealth{integrity=100/100}"+ "'", str8.equals("CreatureHealth{integrity=100/100}"));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test101"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    boolean b5 = itemPreset0.isUnique();
    long long6 = itemPreset0.getPutrefactionPeriod();
    itemPreset0.setIntegrityDecrementOnEat((int)(short)10);
    org.mafagafogigante.dungeon.game.Id id9 = null;
    itemPreset0.setId(id9);
    long long11 = itemPreset0.getPutrefactionPeriod();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset12 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity13 = itemPreset12.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity14 = null;
    itemPreset12.setIntegrity(integrity14);
    org.mafagafogigante.dungeon.util.Percentage percentage16 = itemPreset12.getVisibility();
    java.lang.String str17 = itemPreset12.getType();
    itemPreset12.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset20 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity21 = itemPreset20.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity22 = null;
    itemPreset20.setIntegrity(integrity22);
    org.mafagafogigante.dungeon.util.Percentage percentage24 = itemPreset20.getVisibility();
    java.lang.String str25 = itemPreset20.getType();
    org.mafagafogigante.dungeon.entity.items.Item.Tag tag26 = org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE;
    itemPreset20.addTag(tag26);
    itemPreset12.addTag(tag26);
    itemPreset12.setPutrefactionPeriod((long)23);
    itemPreset12.setNutrition((int)(byte)1);
    org.mafagafogigante.dungeon.entity.items.Item.Tag tag33 = org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE;
    itemPreset12.addTag(tag33);
    boolean b35 = itemPreset0.hasTag(tag33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    org.junit.Assert.assertTrue("'" + tag26 + "' != '" + org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE + "'", tag26.equals(org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE));
    org.junit.Assert.assertTrue("'" + tag33 + "' != '" + org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE + "'", tag33.equals(org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test102"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    boolean b5 = itemPreset0.isUnique();
    long long6 = itemPreset0.getPutrefactionPeriod();
    itemPreset0.setNutrition(38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test103"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    org.mafagafogigante.dungeon.entity.Integrity integrity5 = itemPreset0.getIntegrity();
    java.lang.String str6 = itemPreset0.getText();
    java.lang.String str7 = itemPreset0.getType();
    int i8 = itemPreset0.getNutrition();
    org.mafagafogigante.dungeon.entity.Weight weight9 = itemPreset0.getWeight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weight9);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test104"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    org.mafagafogigante.dungeon.entity.Integrity integrity5 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.util.Percentage percentage6 = itemPreset0.getVisibility();
    boolean b7 = itemPreset0.isUnique();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test105"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature1 = null;
    org.mafagafogigante.dungeon.entity.creatures.CreatureHealth creatureHealth2 = org.mafagafogigante.dungeon.entity.creatures.CreatureHealth.makeCreatureHealth(100, creature1);
    int i3 = creatureHealth2.getCurrent();
    creatureHealth2.incrementBy(3);
    boolean b6 = creatureHealth2.isAlive();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creatureHealth2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test106"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, (-1), 0.0d);
    org.mafagafogigante.dungeon.entity.Weight weight4 = creatureInventory3.getWeight();
    int i5 = creatureInventory3.getItemCount();
    org.mafagafogigante.dungeon.entity.Weight weight6 = creatureInventory3.getWeightLimit();
    org.mafagafogigante.dungeon.entity.Weight weight7 = creatureInventory3.getWeightLimit();
    creatureInventory3.refreshItems();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight7);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test107"); }

    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery0 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    battleStatisticsQuery0.setType("Damaged");
    battleStatisticsQuery0.setType("");
    java.lang.String str5 = battleStatisticsQuery0.toString();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery6 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    battleStatisticsQuery6.setType("Damaged");
    battleStatisticsQuery6.setType("");
    battleStatisticsQuery6.setType("hi!");
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset13 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity14 = itemPreset13.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity15 = null;
    itemPreset13.setIntegrity(integrity15);
    org.mafagafogigante.dungeon.util.Percentage percentage17 = itemPreset13.getVisibility();
    boolean b18 = itemPreset13.isUnique();
    boolean b19 = battleStatisticsQuery6.equals((java.lang.Object)b18);
    org.mafagafogigante.dungeon.date.Date date23 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    java.lang.String str24 = date23.toDateString();
    org.mafagafogigante.dungeon.world.Weather weather25 = new org.mafagafogigante.dungeon.world.Weather(date23);
    org.mafagafogigante.dungeon.date.Date date29 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date33 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i34 = date29.compareTo(date33);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay35 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date29);
    java.lang.String str36 = date29.toTimeString();
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit38 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR;
    org.mafagafogigante.dungeon.date.Date date39 = date29.plus(3600, dungeonTimeUnit38);
    org.mafagafogigante.dungeon.date.Duration duration40 = new org.mafagafogigante.dungeon.date.Duration(date23, date29);
    java.lang.String str41 = duration40.toString();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery42 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    boolean b44 = battleStatisticsQuery42.equals((java.lang.Object)0.0d);
    org.mafagafogigante.dungeon.game.Id id45 = null;
    battleStatisticsQuery42.setId(id45);
    org.mafagafogigante.dungeon.game.Id id47 = null;
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery49 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath50 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    battleStatisticsQuery49.setCauseOfDeath(causeOfDeath50);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay52 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.stats.BattleRecord battleRecord53 = new org.mafagafogigante.dungeon.stats.BattleRecord(id47, "", causeOfDeath50, partOfDay52);
    boolean b54 = battleStatisticsQuery42.matches(battleRecord53);
    boolean b55 = duration40.equals((java.lang.Object)battleRecord53);
    java.lang.String str56 = battleRecord53.getType();
    boolean b57 = battleStatisticsQuery6.matches(battleRecord53);
    boolean b58 = battleStatisticsQuery0.matches(battleRecord53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "BattleStatisticsQuery{id=null, type='', causeOfDeath=null, partOfDay=null}"+ "'", str5.equals("BattleStatisticsQuery{id=null, type='', causeOfDeath=null, partOfDay=null}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "day 10 of month 10 of the year 10"+ "'", str24.equals("day 10 of month 10 of the year 10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay35 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay35.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "00:00:00"+ "'", str36.equals("00:00:00"));
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit38 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR + "'", dungeonTimeUnit38.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "Less than a day"+ "'", str41.equals("Less than a day"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath50);
    org.junit.Assert.assertTrue("'" + partOfDay52 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay52.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + ""+ "'", str56.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test108"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table6 = new org.mafagafogigante.dungeon.util.Table(str_array5);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString7 = table6.toColoredStringList();
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications8 = null;
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)table6, writingSpecifications8);
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)table6);
    java.lang.String[] str_array16 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table17 = new org.mafagafogigante.dungeon.util.Table(str_array16);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString18 = table17.toColoredStringList();
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications19 = null;
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)table17, writingSpecifications19);
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)table17);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString23 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array28 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString23.append(str_array28);
    java.lang.String[] str_array35 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table36 = new org.mafagafogigante.dungeon.util.Table(str_array35);
    dungeonString23.append(str_array35);
    table17.insertRow(str_array35);
    table6.insertRow(str_array35);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString40 = table6.toColoredStringList();
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString41 = table6.toColoredStringList();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString41);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test109"); }

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
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay23 = org.mafagafogigante.dungeon.game.PartOfDay.AFTERNOON;
    java.lang.String str24 = partOfDay23.toString();
    int i25 = org.mafagafogigante.dungeon.game.PartOfDay.getSecondsToNext(date14, partOfDay23);
    org.mafagafogigante.dungeon.world.Weather weather26 = new org.mafagafogigante.dungeon.world.Weather(date14);
    org.mafagafogigante.dungeon.world.Weather weather27 = new org.mafagafogigante.dungeon.world.Weather(date14);
    
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
    org.junit.Assert.assertTrue("'" + partOfDay23 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.AFTERNOON + "'", partOfDay23.equals(org.mafagafogigante.dungeon.game.PartOfDay.AFTERNOON));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Afternoon"+ "'", str24.equals("Afternoon"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 46800);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test110"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.util.Percentage percentage2 = itemPreset0.getVisibility();
    java.lang.String str3 = itemPreset0.getType();
    int i4 = itemPreset0.getDamage();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset5 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity6 = itemPreset5.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity7 = null;
    itemPreset5.setIntegrity(integrity7);
    org.mafagafogigante.dungeon.util.Percentage percentage9 = itemPreset5.getVisibility();
    java.lang.String str10 = itemPreset5.getType();
    itemPreset5.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.entity.TagSet<org.mafagafogigante.dungeon.entity.items.Item.Tag> tagset_tag13 = itemPreset5.getTagSet();
    org.mafagafogigante.dungeon.entity.Weight weight15 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    itemPreset5.setWeight(weight15);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset17 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity18 = itemPreset17.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity19 = null;
    itemPreset17.setIntegrity(integrity19);
    org.mafagafogigante.dungeon.util.Percentage percentage22 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    itemPreset17.setHitRate(percentage22);
    itemPreset5.setHitRate(percentage22);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity25 = itemPreset5.getLuminosity();
    org.mafagafogigante.dungeon.util.Percentage percentage26 = luminosity25.toPercentage();
    itemPreset0.setLuminosity(luminosity25);
    org.mafagafogigante.dungeon.util.Percentage percentage28 = luminosity25.toPercentage();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tagset_tag13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage28);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test111"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    java.lang.String str5 = itemPreset0.getType();
    itemPreset0.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.entity.TagSet<org.mafagafogigante.dungeon.entity.items.Item.Tag> tagset_tag8 = itemPreset0.getTagSet();
    org.mafagafogigante.dungeon.entity.Weight weight9 = itemPreset0.getWeight();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset10 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity11 = itemPreset10.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity12 = null;
    itemPreset10.setIntegrity(integrity12);
    org.mafagafogigante.dungeon.util.Percentage percentage14 = itemPreset10.getVisibility();
    java.lang.String str15 = itemPreset10.getType();
    org.mafagafogigante.dungeon.entity.items.Item.Tag tag16 = org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE;
    itemPreset10.addTag(tag16);
    itemPreset0.addTag(tag16);
    org.mafagafogigante.dungeon.entity.Entity[] entity_array19 = new org.mafagafogigante.dungeon.entity.Entity[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.Entity> arraylist_entity20 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.Entity>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.Entity>)arraylist_entity20, entity_array19);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity22 = org.mafagafogigante.dungeon.entity.Luminosity.resultantLuminosity((java.util.Collection<org.mafagafogigante.dungeon.entity.Entity>)arraylist_entity20);
    org.mafagafogigante.dungeon.util.Percentage percentage23 = luminosity22.toPercentage();
    itemPreset0.setLuminosity(luminosity22);
    org.mafagafogigante.dungeon.entity.LightSource lightSource25 = new org.mafagafogigante.dungeon.entity.LightSource(luminosity22);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity26 = lightSource25.getLuminosity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tagset_tag8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    org.junit.Assert.assertTrue("'" + tag16 + "' != '" + org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE + "'", tag16.equals(org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(entity_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity26);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test112"); }

    org.mafagafogigante.dungeon.date.Date date6 = new org.mafagafogigante.dungeon.date.Date((long)152, (-1L), (long)79648, (long)82800, (long)(short)100, (long)23);
    org.mafagafogigante.dungeon.date.Date date10 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    java.lang.String str11 = date10.toDateString();
    int i12 = date6.compareTo(date10);
    org.mafagafogigante.dungeon.date.Date date16 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date20 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i21 = date16.compareTo(date20);
    long long22 = date20.getDay();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery23 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    boolean b25 = battleStatisticsQuery23.equals((java.lang.Object)0.0d);
    org.mafagafogigante.dungeon.game.Id id26 = null;
    battleStatisticsQuery23.setId(id26);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay28 = org.mafagafogigante.dungeon.game.PartOfDay.AFTERNOON;
    battleStatisticsQuery23.setPartOfDay(partOfDay28);
    int i30 = org.mafagafogigante.dungeon.game.PartOfDay.getSecondsToNext(date20, partOfDay28);
    int i31 = date6.compareTo(date20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "day 10 of month 10 of the year 10"+ "'", str11.equals("day 10 of month 10 of the year 10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long22 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    org.junit.Assert.assertTrue("'" + partOfDay28 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.AFTERNOON + "'", partOfDay28.equals(org.mafagafogigante.dungeon.game.PartOfDay.AFTERNOON));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 46800);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test113"); }

    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath0 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    boolean b2 = causeOfDeath0.equals((java.lang.Object)3);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset3 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity4 = itemPreset3.getIntegrity();
    org.mafagafogigante.dungeon.util.Percentage percentage5 = itemPreset3.getVisibility();
    boolean b6 = causeOfDeath0.equals((java.lang.Object)itemPreset3);
    itemPreset3.setIntegrityDecrementOnHit(2);
    org.mafagafogigante.dungeon.entity.Integrity integrity11 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    boolean b12 = integrity11.isMaximum();
    boolean b13 = integrity11.isZero();
    boolean b14 = integrity11.isZero();
    itemPreset3.setIntegrity(integrity11);
    integrity11.incrementBy(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test114"); }

    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics0 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    int i2 = explorationStatistics0.getKillCount(id1);
    org.mafagafogigante.dungeon.game.Id id3 = null;
    int i4 = explorationStatistics0.getKillCount(id3);
    org.mafagafogigante.dungeon.game.Id id5 = null;
    int i6 = explorationStatistics0.getKillCount(id5);
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics7 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point8 = null;
    org.mafagafogigante.dungeon.game.Id id9 = null;
    explorationStatistics7.createEntryIfNotExists(point8, id9);
    org.mafagafogigante.dungeon.game.Point point14 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id15 = null;
    explorationStatistics7.addVisit(point14, id15);
    org.mafagafogigante.dungeon.game.Point point20 = new org.mafagafogigante.dungeon.game.Point(100, 10, (int)(byte)10);
    int i21 = point20.getZ();
    org.mafagafogigante.dungeon.game.Id id22 = null;
    explorationStatistics7.createEntryIfNotExists(point20, id22);
    // The following exception was thrown during execution in test generation
    try {
    explorationStatistics0.addKill(point20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 10);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test115"); }

    org.mafagafogigante.dungeon.commands.CommandDescription commandDescription2 = new org.mafagafogigante.dungeon.commands.CommandDescription("", "Midnight");
    java.lang.String str3 = commandDescription2.getInfo();
    java.lang.String str4 = commandDescription2.getInfo();
    java.lang.String str5 = commandDescription2.getInfo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Midnight"+ "'", str3.equals("Midnight"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Midnight"+ "'", str4.equals("Midnight"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Midnight"+ "'", str5.equals("Midnight"));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test116"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay1 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity2 = partOfDay1.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name3 = partOfDay1.getName();
    org.mafagafogigante.dungeon.game.QuantificationMode quantificationMode5 = org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER;
    java.lang.String str6 = name3.getQuantifiedName((int)'4', quantificationMode5);
    creaturePreset0.setName(name3);
    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset8 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id9 = null;
    creaturePreset8.setWeaponId(id9);
    org.mafagafogigante.dungeon.game.Id id11 = creaturePreset8.getId();
    java.lang.String str12 = creaturePreset8.getType();
    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset13 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay14 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity15 = partOfDay14.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name16 = partOfDay14.getName();
    org.mafagafogigante.dungeon.game.QuantificationMode quantificationMode18 = org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER;
    java.lang.String str19 = name16.getQuantifiedName((int)'4', quantificationMode18);
    creaturePreset13.setName(name16);
    org.mafagafogigante.dungeon.entity.creatures.Drop[] drop_array21 = new org.mafagafogigante.dungeon.entity.creatures.Drop[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop> arraylist_drop22 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop22, drop_array21);
    creaturePreset13.setDropList((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop22);
    creaturePreset8.setDropList((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop22);
    creaturePreset0.setDropList((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop22);
    org.junit.Assert.assertTrue("'" + partOfDay1 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay1.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name3);
    org.junit.Assert.assertTrue("'" + quantificationMode5 + "' != '" + org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER + "'", quantificationMode5.equals(org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "52 Nights"+ "'", str6.equals("52 Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    org.junit.Assert.assertTrue("'" + partOfDay14 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay14.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name16);
    org.junit.Assert.assertTrue("'" + quantificationMode18 + "' != '" + org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER + "'", quantificationMode18.equals(org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "52 Nights"+ "'", str19.equals("52 Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(drop_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test117"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, (-1), 0.0d);
    org.mafagafogigante.dungeon.entity.Weight weight4 = creatureInventory3.getWeight();
    int i5 = creatureInventory3.getItemCount();
    creatureInventory3.refreshItems();
    creatureInventory3.refreshItems();
    org.mafagafogigante.dungeon.entity.Weight weight8 = creatureInventory3.getWeight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight8);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test118"); }

    int i2 = org.mafagafogigante.dungeon.game.Random.nextInteger((int)(short)-1, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test119"); }

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
    java.lang.String str13 = dungeonString9.toString();
    java.lang.String str14 = dungeonString9.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "DungeonString{coloredStringList=[ColoredString{string='hi!', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=null}"+ "'", str13.equals("DungeonString{coloredStringList=[ColoredString{string='hi!', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=null}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "DungeonString{coloredStringList=[ColoredString{string='hi!', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=null}"+ "'", str14.equals("DungeonString{coloredStringList=[ColoredString{string='hi!', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=null}"));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test120"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, (-1), 0.0d);
    org.mafagafogigante.dungeon.entity.Weight weight4 = creatureInventory3.getWeight();
    int i5 = creatureInventory3.getItemCount();
    org.mafagafogigante.dungeon.entity.Weight weight6 = creatureInventory3.getWeightLimit();
    creatureInventory3.refreshItems();
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
    org.junit.Assert.assertNotNull(weight6);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test121"); }

    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics0 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    int i2 = explorationStatistics0.getKillCount(id1);
    org.mafagafogigante.dungeon.game.Id id3 = null;
    int i4 = explorationStatistics0.getMaximumNumberOfVisits(id3);
    org.mafagafogigante.dungeon.game.Id id5 = null;
    int i6 = explorationStatistics0.getKillCount(id5);
    org.mafagafogigante.dungeon.game.Direction direction7 = org.mafagafogigante.dungeon.game.Direction.EAST;
    java.lang.String str8 = direction7.toString();
    org.mafagafogigante.dungeon.game.Point point9 = direction7.getOffset();
    boolean b10 = explorationStatistics0.hasBeenSeen(point9);
    org.mafagafogigante.dungeon.game.Direction direction11 = org.mafagafogigante.dungeon.game.Direction.EAST;
    java.lang.String str12 = direction11.toString();
    org.mafagafogigante.dungeon.game.Point point13 = direction11.getOffset();
    // The following exception was thrown during execution in test generation
    try {
    explorationStatistics0.addKill(point13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    org.junit.Assert.assertTrue("'" + direction7 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction7.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "East"+ "'", str8.equals("East"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    org.junit.Assert.assertTrue("'" + direction11 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction11.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "East"+ "'", str12.equals("East"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point13);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test122"); }

    org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.CauseOfDeath>> countermap_countermap_causeOfDeath0 = new org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.CauseOfDeath>>();
    java.util.Set<org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.CauseOfDeath>> set_countermap_causeOfDeath1 = countermap_countermap_causeOfDeath0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_countermap_causeOfDeath1);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test123"); }

    org.mafagafogigante.dungeon.game.Id id0 = null;
    org.mafagafogigante.dungeon.entity.items.BookComponent bookComponent2 = new org.mafagafogigante.dungeon.entity.items.BookComponent(id0, "0 ms");
    boolean b3 = bookComponent2.isDidactic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test124"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.entity.Integrity integrity4 = itemPreset0.getIntegrity();
    itemPreset0.setDamage(0);
    org.mafagafogigante.dungeon.game.Id id7 = itemPreset0.getId();
    org.mafagafogigante.dungeon.util.Percentage percentage9 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b11 = percentage9.equals((java.lang.Object)10.0d);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity12 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage9);
    org.mafagafogigante.dungeon.util.Percentage percentage13 = luminosity12.toPercentage();
    itemPreset0.setLuminosity(luminosity12);
    org.mafagafogigante.dungeon.entity.LightSource lightSource15 = new org.mafagafogigante.dungeon.entity.LightSource(luminosity12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage13);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test125"); }

    org.mafagafogigante.dungeon.entity.items.Item[] item_array0 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item1 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item1, item_array0);
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
    java.lang.String[] str_array28 = new java.lang.String[] { "CounterMap{map={}}", "User: Nicholas\nTime: 15:35:09\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 4.3 MiB out of the allocated 121.0 MiB\nOS: Windows 10 (amd64) 10.0", "hi!", "0 ms", "User: Nicholas\nTime: 15:35:09\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 26.6 MiB out of the allocated 121.0 MiB\nOS: Windows 10 (amd64) 10.0" };
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item29 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item21, str_array28);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString31 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    observer6.writeItemSight(list_item29, dungeonString31);
    java.lang.String[] str_array35 = new java.lang.String[] { "", "" };
    org.mafagafogigante.dungeon.util.Table table36 = new org.mafagafogigante.dungeon.util.Table(str_array35);
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item37 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems(list_item29, str_array35);
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item38 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item1, str_array35);
    org.mafagafogigante.dungeon.util.Table table39 = new org.mafagafogigante.dungeon.util.Table(str_array35);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.io.PoemWriter.parsePoemCommand(str_array35);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
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
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item38);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test126"); }

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
    creaturePreset0.setAttack(32304);
    int i18 = creaturePreset0.getAttack();
    creaturePreset0.setHealth(35);
    creaturePreset0.setAttack((int)'a');
    org.mafagafogigante.dungeon.entity.Luminosity luminosity23 = creaturePreset0.getLuminosity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(id_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 32304);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity23);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test127"); }

    org.mafagafogigante.dungeon.entity.creatures.HealthState healthState0 = org.mafagafogigante.dungeon.entity.creatures.HealthState.UNINJURED;
    java.lang.String str1 = healthState0.toString();
    java.lang.String str2 = healthState0.toString();
    java.lang.String str3 = healthState0.toString();
    org.junit.Assert.assertTrue("'" + healthState0 + "' != '" + org.mafagafogigante.dungeon.entity.creatures.HealthState.UNINJURED + "'", healthState0.equals(org.mafagafogigante.dungeon.entity.creatures.HealthState.UNINJURED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Uninjured"+ "'", str1.equals("Uninjured"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Uninjured"+ "'", str2.equals("Uninjured"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Uninjured"+ "'", str3.equals("Uninjured"));

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test128"); }

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
    java.lang.String[] str_array28 = new java.lang.String[] { "CounterMap{map={}}", "User: Nicholas\nTime: 15:35:09\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 4.3 MiB out of the allocated 121.0 MiB\nOS: Windows 10 (amd64) 10.0", "hi!", "0 ms", "User: Nicholas\nTime: 15:35:09\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 26.6 MiB out of the allocated 121.0 MiB\nOS: Windows 10 (amd64) 10.0" };
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item29 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item21, str_array28);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString31 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    observer6.writeItemSight(list_item29, dungeonString31);
    boolean b33 = visibilityCriteria2.isMetBy(observer6);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature34 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer35 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature34);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array36 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item37 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b38 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item37, item_array36);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString40 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array45 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString40.append(str_array45);
    observer35.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item37, dungeonString40);
    org.mafagafogigante.dungeon.entity.creatures.Creature[] creature_array48 = new org.mafagafogigante.dungeon.entity.creatures.Creature[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Creature> arraylist_creature49 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Creature>();
    boolean b50 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.Creature>)arraylist_creature49, creature_array48);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString52 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array57 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString52.append(str_array57);
    java.lang.String[] str_array64 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table65 = new org.mafagafogigante.dungeon.util.Table(str_array64);
    dungeonString52.append(str_array64);
    dungeonString52.resetColor();
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString68 = dungeonString52.toColoredStringList();
    observer35.writeCreatureSight((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Creature>)arraylist_creature49, dungeonString52);
    boolean b70 = visibilityCriteria2.isMetBy(observer35);
    org.mafagafogigante.dungeon.entity.creatures.Creature[] creature_array71 = new org.mafagafogigante.dungeon.entity.creatures.Creature[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Creature> arraylist_creature72 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Creature>();
    boolean b73 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.Creature>)arraylist_creature72, creature_array71);
    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array74 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria75 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array74);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature76 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer77 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature76);
    boolean b78 = visibilityCriteria75.isMetBy(observer77);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array79 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item80 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b81 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item80, item_array79);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString83 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    observer77.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item80, dungeonString83);
    org.mafagafogigante.dungeon.io.Writer.writeAndWait((org.mafagafogigante.dungeon.game.Writable)dungeonString83);
    observer35.writeCreatureSight((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Creature>)arraylist_creature72, dungeonString83);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.game.Location location87 = observer35.getObserverLocation();
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creature_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creature_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test129"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] creaturePresetFactory_array0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] {  };
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory1 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array0);
    org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory corpseItemPresetFactory2 = new org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory(creatureFactory1);
    org.mafagafogigante.dungeon.game.Id id3 = null;
    org.mafagafogigante.dungeon.game.World world4 = null;
    org.mafagafogigante.dungeon.entity.creatures.Creature creature5 = creatureFactory1.makeCreature(id3, world4);
    org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory corpseItemPresetFactory6 = new org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory(creatureFactory1);
    org.mafagafogigante.dungeon.date.Date date10 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date14 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i15 = date10.compareTo(date14);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay16 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date10);
    long long17 = date10.getYear();
    org.mafagafogigante.dungeon.date.Date date21 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date25 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i26 = date21.compareTo(date25);
    long long27 = date21.getYear();
    int i28 = date10.compareTo(date21);
    java.lang.String str29 = date21.toDateString();
    org.mafagafogigante.dungeon.date.Date date36 = new org.mafagafogigante.dungeon.date.Date(1L, (long)100, (long)(short)1, (long)(byte)100, (long)' ', (long)'#');
    int i37 = date21.compareTo(date36);
    org.mafagafogigante.dungeon.date.Date date42 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date46 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i47 = date42.compareTo(date46);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay48 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date42);
    java.lang.String str49 = date42.toTimeString();
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit51 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR;
    org.mafagafogigante.dungeon.date.Date date52 = date42.plus(3600, dungeonTimeUnit51);
    org.mafagafogigante.dungeon.date.Date date53 = date36.plus(46800, dungeonTimeUnit51);
    java.lang.String str54 = date36.toString();
    long long55 = date36.getMonth();
    org.mafagafogigante.dungeon.game.World world56 = null;
    org.mafagafogigante.dungeon.stats.Statistics statistics57 = new org.mafagafogigante.dungeon.stats.Statistics();
    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics58 = statistics57.getBattleStatistics();
    org.mafagafogigante.dungeon.commands.CommandHistory commandHistory59 = new org.mafagafogigante.dungeon.commands.CommandHistory();
    java.lang.String str61 = commandHistory59.getLastSimilarCommand("");
    java.lang.String str63 = commandHistory59.getLastSimilarCommand("Unarmed : UNARMED");
    org.mafagafogigante.dungeon.commands.CommandHistory.Cursor cursor64 = commandHistory59.getCursor();
    org.mafagafogigante.dungeon.commands.IssuedCommand issuedCommand66 = new org.mafagafogigante.dungeon.commands.IssuedCommand("0 kg");
    commandHistory59.addCommand(issuedCommand66);
    statistics57.addCommand(issuedCommand66);
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker69 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics57);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.creatures.Hero hero70 = creatureFactory1.makeHero(date36, world56, statistics57);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creaturePresetFactory_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(creature5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay16 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay16.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long27 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "day 10 of month 10 of the year 10"+ "'", str29.equals("day 10 of month 10 of the year 10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay48 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay48.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "00:00:00"+ "'", str49.equals("00:00:00"));
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit51 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR + "'", dungeonTimeUnit51.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "1-10-02 00:32:35"+ "'", str54.equals("1-10-02 00:32:35"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long55 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(battleStatistics58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cursor64);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test130"); }

    org.mafagafogigante.dungeon.game.PartOfDay partOfDay0 = org.mafagafogigante.dungeon.game.PartOfDay.NOON;
    org.mafagafogigante.dungeon.game.Name name1 = partOfDay0.getName();
    org.junit.Assert.assertTrue("'" + partOfDay0 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NOON + "'", partOfDay0.equals(org.mafagafogigante.dungeon.game.PartOfDay.NOON));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name1);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test131"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    itemPreset0.setDrinkableHealing((int)(short)10);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = new org.mafagafogigante.dungeon.util.Percentage((double)(short)10);
    itemPreset0.setVisibility(percentage4);
    org.mafagafogigante.dungeon.entity.Integrity integrity6 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Weight weight7 = itemPreset0.getWeight();
    org.mafagafogigante.dungeon.util.Percentage percentage11 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b13 = percentage11.equals((java.lang.Object)10.0d);
    java.lang.String str14 = percentage11.toString();
    double d15 = org.mafagafogigante.dungeon.util.DungeonMath.weightedAverage((double)(short)0, (double)(-1), percentage11);
    itemPreset0.setHitRate(percentage11);
    boolean b17 = itemPreset0.isUnique();
    itemPreset0.setText("ItemIntegrity{integrity=0/1, item=null}");
    org.mafagafogigante.dungeon.entity.Luminosity luminosity20 = itemPreset0.getLuminosity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "100.00%"+ "'", str14.equals("100.00%"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity20);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test132"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    boolean b5 = itemPreset0.isUnique();
    long long6 = itemPreset0.getPutrefactionPeriod();
    org.mafagafogigante.dungeon.entity.TagSet<org.mafagafogigante.dungeon.entity.items.Item.Tag> tagset_tag7 = itemPreset0.getTagSet();
    org.mafagafogigante.dungeon.entity.Weight weight8 = itemPreset0.getWeight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tagset_tag7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weight8);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test133"); }

    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery1 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath2 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    battleStatisticsQuery1.setCauseOfDeath(causeOfDeath2);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset4 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity5 = itemPreset4.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity6 = null;
    itemPreset4.setIntegrity(integrity6);
    org.mafagafogigante.dungeon.util.Percentage percentage8 = itemPreset4.getVisibility();
    java.lang.String str9 = itemPreset4.getType();
    itemPreset4.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage13 = new org.mafagafogigante.dungeon.util.Percentage((double)(short)10);
    itemPreset4.setVisibility(percentage13);
    org.mafagafogigante.dungeon.util.Percentage percentage16 = new org.mafagafogigante.dungeon.util.Percentage((double)(short)10);
    int i17 = percentage13.compareTo(percentage16);
    double d18 = percentage13.toDouble();
    boolean b19 = causeOfDeath2.equals((java.lang.Object)percentage13);
    org.mafagafogigante.dungeon.entity.items.WeaponComponent weaponComponent21 = new org.mafagafogigante.dungeon.entity.items.WeaponComponent((int)'#', percentage13, (int)(byte)1);
    int i22 = weaponComponent21.getDamage();
    int i23 = weaponComponent21.getDamage();
    int i24 = weaponComponent21.getDamage();
    int i25 = weaponComponent21.getIntegrityDecrementOnHit();
    int i26 = weaponComponent21.getDamage();
    org.mafagafogigante.dungeon.util.Percentage percentage27 = weaponComponent21.getHitRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage27);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test134"); }

    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery0 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    boolean b2 = battleStatisticsQuery0.equals((java.lang.Object)0.0d);
    org.mafagafogigante.dungeon.game.Id id3 = null;
    battleStatisticsQuery0.setId(id3);
    org.mafagafogigante.dungeon.game.Id id5 = null;
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery7 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath8 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    battleStatisticsQuery7.setCauseOfDeath(causeOfDeath8);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay10 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.stats.BattleRecord battleRecord11 = new org.mafagafogigante.dungeon.stats.BattleRecord(id5, "", causeOfDeath8, partOfDay10);
    java.lang.String str12 = battleRecord11.getType();
    boolean b13 = battleStatisticsQuery0.matches(battleRecord11);
    org.mafagafogigante.dungeon.game.Id id14 = battleRecord11.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath8);
    org.junit.Assert.assertTrue("'" + partOfDay10 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay10.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id14);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test135"); }

    org.mafagafogigante.dungeon.game.MinimumBoundingRectangle minimumBoundingRectangle2 = new org.mafagafogigante.dungeon.game.MinimumBoundingRectangle((int)' ', (int)(short)-1);
    int i3 = minimumBoundingRectangle2.getWidth();
    int i4 = minimumBoundingRectangle2.getHeight();
    int i5 = minimumBoundingRectangle2.getWidth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 32);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test136"); }

    org.mafagafogigante.dungeon.util.CounterMap<java.lang.Comparable<java.lang.String>> countermap_comparable_str0 = new org.mafagafogigante.dungeon.util.CounterMap<java.lang.Comparable<java.lang.String>>();
    int i2 = countermap_comparable_str0.getCounter((java.lang.Comparable<java.lang.String>)"Spell");
    java.util.Set<java.lang.Comparable<java.lang.String>> set_comparable_str3 = countermap_comparable_str0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_comparable_str3);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test137"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.util.Percentage percentage1 = org.mafagafogigante.dungeon.util.Percentage.fromString("day 1 of month 1 of the year 1");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test138"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, 32, (double)0L);
    org.mafagafogigante.dungeon.entity.Weight weight4 = creatureInventory3.getWeightLimit();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery6 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath7 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    battleStatisticsQuery6.setCauseOfDeath(causeOfDeath7);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset9 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity10 = itemPreset9.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity11 = null;
    itemPreset9.setIntegrity(integrity11);
    org.mafagafogigante.dungeon.util.Percentage percentage13 = itemPreset9.getVisibility();
    java.lang.String str14 = itemPreset9.getType();
    itemPreset9.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage18 = new org.mafagafogigante.dungeon.util.Percentage((double)(short)10);
    itemPreset9.setVisibility(percentage18);
    org.mafagafogigante.dungeon.util.Percentage percentage21 = new org.mafagafogigante.dungeon.util.Percentage((double)(short)10);
    int i22 = percentage18.compareTo(percentage21);
    double d23 = percentage18.toDouble();
    boolean b24 = causeOfDeath7.equals((java.lang.Object)percentage18);
    org.mafagafogigante.dungeon.entity.items.WeaponComponent weaponComponent26 = new org.mafagafogigante.dungeon.entity.items.WeaponComponent((int)'#', percentage18, (int)(byte)1);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity27 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage18);
    org.mafagafogigante.dungeon.entity.Weight weight28 = weight4.multiply(percentage18);
    org.mafagafogigante.dungeon.game.Id id29 = null;
    org.mafagafogigante.dungeon.entity.items.BookComponent bookComponent31 = new org.mafagafogigante.dungeon.entity.items.BookComponent(id29, "User: Nicholas\nTime: 15:35:09\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 26.6 MiB out of the allocated 121.0 MiB\nOS: Windows 10 (amd64) 10.0");
    java.lang.String str32 = bookComponent31.getText();
    boolean b33 = bookComponent31.isDidactic();
    boolean b34 = bookComponent31.isDidactic();
    boolean b35 = bookComponent31.isDidactic();
    boolean b36 = weight28.equals((java.lang.Object)b35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d23 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "User: Nicholas\nTime: 15:35:09\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 26.6 MiB out of the allocated 121.0 MiB\nOS: Windows 10 (amd64) 10.0"+ "'", str32.equals("User: Nicholas\nTime: 15:35:09\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 26.6 MiB out of the allocated 121.0 MiB\nOS: Windows 10 (amd64) 10.0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test139"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    org.mafagafogigante.dungeon.entity.Integrity integrity5 = itemPreset0.getIntegrity();
    java.lang.String str6 = itemPreset0.getText();
    itemPreset0.setDamage(52);
    org.mafagafogigante.dungeon.util.Percentage percentage9 = itemPreset0.getVisibility();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage9);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test140"); }

    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics0 = new org.mafagafogigante.dungeon.stats.BattleStatistics();
    java.lang.String str1 = battleStatistics0.toString();
    org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.CauseOfDeath> countermap_causeOfDeath2 = battleStatistics0.getKillsByCauseOfDeath();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath3 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    java.lang.String[] str_array7 = new java.lang.String[] { "Damaged", "visibilityCriteria=VisibilityCriteria{[]}", "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str8 = new java.util.ArrayList<java.lang.String>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str8, str_array7);
    org.mafagafogigante.dungeon.io.Split split10 = org.mafagafogigante.dungeon.io.Split.splitOnOn((java.util.List<java.lang.String>)arraylist_str8);
    java.util.List<java.lang.String> list_str11 = split10.getBefore();
    boolean b12 = causeOfDeath3.equals((java.lang.Object)list_str11);
    java.lang.String str13 = causeOfDeath3.toString();
    org.mafagafogigante.dungeon.entity.Weight weight15 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    org.mafagafogigante.dungeon.entity.Weight weight16 = org.mafagafogigante.dungeon.entity.Weight.ZERO;
    org.mafagafogigante.dungeon.entity.Weight weight17 = weight15.add(weight16);
    java.lang.String str18 = weight17.toString();
    boolean b19 = causeOfDeath3.equals((java.lang.Object)str18);
    countermap_causeOfDeath2.incrementCounter(causeOfDeath3, (java.lang.Integer)52);
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery22 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath23 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    java.lang.String[] str_array27 = new java.lang.String[] { "Damaged", "visibilityCriteria=VisibilityCriteria{[]}", "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str28 = new java.util.ArrayList<java.lang.String>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str28, str_array27);
    org.mafagafogigante.dungeon.io.Split split30 = org.mafagafogigante.dungeon.io.Split.splitOnOn((java.util.List<java.lang.String>)arraylist_str28);
    java.util.List<java.lang.String> list_str31 = split30.getBefore();
    boolean b32 = causeOfDeath23.equals((java.lang.Object)list_str31);
    battleStatisticsQuery22.setCauseOfDeath(causeOfDeath23);
    countermap_causeOfDeath2.incrementCounter(causeOfDeath23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "BattleStatistics{records=CounterMap{map={}}}"+ "'", str1.equals("BattleStatistics{records=CounterMap{map={}}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_causeOfDeath2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(split10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Unarmed : UNARMED"+ "'", str13.equals("Unarmed : UNARMED"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "0 kg"+ "'", str18.equals("0 kg"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(split30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test141"); }

    org.mafagafogigante.dungeon.entity.Weight weight1 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)'#');
    org.mafagafogigante.dungeon.entity.Weight weight3 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)'#');
    org.mafagafogigante.dungeon.entity.Weight weight4 = weight1.add(weight3);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset5 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity6 = itemPreset5.getIntegrity();
    itemPreset5.setIntegrityDecrementOnEat((-1));
    org.mafagafogigante.dungeon.entity.Weight weight9 = itemPreset5.getWeight();
    itemPreset5.setDrinkableHealing((int)(byte)1);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset12 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity13 = itemPreset12.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity14 = null;
    itemPreset12.setIntegrity(integrity14);
    org.mafagafogigante.dungeon.util.Percentage percentage16 = itemPreset12.getVisibility();
    java.lang.String str17 = itemPreset12.getType();
    itemPreset12.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage21 = new org.mafagafogigante.dungeon.util.Percentage((double)(short)10);
    itemPreset12.setVisibility(percentage21);
    org.mafagafogigante.dungeon.util.Percentage percentage24 = new org.mafagafogigante.dungeon.util.Percentage((double)(short)10);
    int i25 = percentage21.compareTo(percentage24);
    itemPreset5.setVisibility(percentage21);
    org.mafagafogigante.dungeon.entity.Weight weight27 = weight1.multiply(percentage21);
    org.mafagafogigante.dungeon.date.Date date31 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    java.lang.String str32 = date31.toDateString();
    org.mafagafogigante.dungeon.world.Weather weather33 = new org.mafagafogigante.dungeon.world.Weather(date31);
    long long34 = date31.getDay();
    org.mafagafogigante.dungeon.world.Weather weather35 = new org.mafagafogigante.dungeon.world.Weather(date31);
    boolean b36 = percentage21.equals((java.lang.Object)weather35);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature37 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer38 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature37);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array39 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item40 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item40, item_array39);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString43 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array48 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString43.append(str_array48);
    observer38.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item40, dungeonString43);
    org.mafagafogigante.dungeon.entity.creatures.Creature[] creature_array51 = new org.mafagafogigante.dungeon.entity.creatures.Creature[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Creature> arraylist_creature52 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Creature>();
    boolean b53 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.Creature>)arraylist_creature52, creature_array51);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString55 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array60 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString55.append(str_array60);
    java.lang.String[] str_array67 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table68 = new org.mafagafogigante.dungeon.util.Table(str_array67);
    dungeonString55.append(str_array67);
    dungeonString55.resetColor();
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString71 = dungeonString55.toColoredStringList();
    observer38.writeCreatureSight((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Creature>)arraylist_creature52, dungeonString55);
    boolean b73 = percentage21.equals((java.lang.Object)dungeonString55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "day 10 of month 10 of the year 10"+ "'", str32.equals("day 10 of month 10 of the year 10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long34 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creature_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);

  }

}
