package org.RandoopTest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test001"); }

    java.lang.String[] str_array2 = new java.lang.String[] { "", "" };
    org.mafagafogigante.dungeon.util.Table table3 = new org.mafagafogigante.dungeon.util.Table(str_array2);
    org.mafagafogigante.dungeon.util.Table table4 = new org.mafagafogigante.dungeon.util.Table(str_array2);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString6 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array11 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString6.append(str_array11);
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table19 = new org.mafagafogigante.dungeon.util.Table(str_array18);
    dungeonString6.append(str_array18);
    org.mafagafogigante.dungeon.util.Table table21 = new org.mafagafogigante.dungeon.util.Table(str_array18);
    // The following exception was thrown during execution in test generation
    try {
    table4.insertRow(str_array18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test002"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule0 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeIdRule();
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule2 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeArraySizeRule((int)(short)0);
    java.util.Map<java.lang.String,org.mafagafogigante.dungeon.schema.JsonRule> map_str_jsonRule3 = null;
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule4 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeObjectRule(map_str_jsonRule3);
    org.mafagafogigante.dungeon.schema.JsonRule[] jsonRule_array5 = new org.mafagafogigante.dungeon.schema.JsonRule[] { jsonRule0, jsonRule2, jsonRule4 };
    java.util.ArrayList<org.mafagafogigante.dungeon.schema.JsonRule> arraylist_jsonRule6 = new java.util.ArrayList<org.mafagafogigante.dungeon.schema.JsonRule>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.schema.JsonRule>)arraylist_jsonRule6, jsonRule_array5);
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule8 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeFixedArrayRule((java.util.List<org.mafagafogigante.dungeon.schema.JsonRule>)arraylist_jsonRule6);
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule9 = org.mafagafogigante.dungeon.game.Random.select((java.util.List<org.mafagafogigante.dungeon.schema.JsonRule>)arraylist_jsonRule6);
    
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

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test003"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    itemPreset0.setPutrefactionPeriod((long)32);
    int i3 = itemPreset0.getDrinkableDoses();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test004"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.game.Id id1 = new org.mafagafogigante.dungeon.game.Id("BattleEntry{id=null, type='', causeOfDeath=Unarmed : UNARMED, partOfDay=Night}");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test005"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature1 = null;
    org.mafagafogigante.dungeon.entity.creatures.CreatureHealth creatureHealth2 = org.mafagafogigante.dungeon.entity.creatures.CreatureHealth.makeCreatureHealth(100, creature1);
    creatureHealth2.incrementBy(57);
    creatureHealth2.incrementBy(32);
    java.lang.String str7 = creatureHealth2.toString();
    boolean b8 = creatureHealth2.isFull();
    int i9 = creatureHealth2.getCurrent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creatureHealth2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "CreatureHealth{integrity=100/100}"+ "'", str7.equals("CreatureHealth{integrity=100/100}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test006"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.creatures.CreatureHealth creatureHealth2 = org.mafagafogigante.dungeon.entity.creatures.CreatureHealth.makeCreatureHealth(0, creature1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test007"); }

    java.awt.Color color1 = null;
    org.mafagafogigante.dungeon.game.LocationDescription locationDescription2 = new org.mafagafogigante.dungeon.game.LocationDescription('4', color1);
    java.awt.Color color3 = locationDescription2.getColor();
    java.lang.String str4 = locationDescription2.toString();
    java.lang.String str5 = locationDescription2.toString();
    locationDescription2.setInfo("User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 41.5 MiB out of the allocated 154.5 MiB\nOS: Windows 10 (amd64) 10.0");
    java.lang.String str8 = locationDescription2.getInfo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(color3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "LocationDescription{symbol=4, color=null, info='You don't discover anything.'}"+ "'", str4.equals("LocationDescription{symbol=4, color=null, info='You don't discover anything.'}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "LocationDescription{symbol=4, color=null, info='You don't discover anything.'}"+ "'", str5.equals("LocationDescription{symbol=4, color=null, info='You don't discover anything.'}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 41.5 MiB out of the allocated 154.5 MiB\nOS: Windows 10 (amd64) 10.0"+ "'", str8.equals("User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 41.5 MiB out of the allocated 154.5 MiB\nOS: Windows 10 (amd64) 10.0"));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test008"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity1 = itemPreset0.getLuminosity();
    org.mafagafogigante.dungeon.entity.LightSource lightSource2 = new org.mafagafogigante.dungeon.entity.LightSource(luminosity1);
    java.lang.String str3 = lightSource2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Enabled LightSource of luminosity of 0.00%"+ "'", str3.equals("Enabled LightSource of luminosity of 0.00%"));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test009"); }

    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array0 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria1 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array0);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature2 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer3 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature2);
    boolean b4 = visibilityCriteria1.isMetBy(observer3);
    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array5 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria6 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array5);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature7 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer8 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature7);
    boolean b9 = visibilityCriteria6.isMetBy(observer8);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array10 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item11 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item11, item_array10);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString14 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array19 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString14.append(str_array19);
    observer8.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item11, dungeonString14);
    org.mafagafogigante.dungeon.entity.creatures.Creature[] creature_array22 = new org.mafagafogigante.dungeon.entity.creatures.Creature[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Creature> arraylist_creature23 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Creature>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.Creature>)arraylist_creature23, creature_array22);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString26 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array31 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString26.append(str_array31);
    java.lang.String str33 = dungeonString26.toString();
    org.mafagafogigante.dungeon.game.Point point37 = new org.mafagafogigante.dungeon.game.Point(10, (int)'a', 0);
    java.lang.String[] str_array40 = new java.lang.String[] { "", "" };
    org.mafagafogigante.dungeon.util.Table table41 = new org.mafagafogigante.dungeon.util.Table(str_array40);
    boolean b42 = point37.equals((java.lang.Object)str_array40);
    dungeonString26.append(str_array40);
    observer8.writeCreatureSight((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Creature>)arraylist_creature23, dungeonString26);
    boolean b45 = visibilityCriteria1.isMetBy(observer8);
    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array46 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria47 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array46);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature48 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer49 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature48);
    boolean b50 = visibilityCriteria47.isMetBy(observer49);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array51 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item52 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b53 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item52, item_array51);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString55 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array60 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString55.append(str_array60);
    observer49.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item52, dungeonString55);
    org.mafagafogigante.dungeon.entity.creatures.Creature[] creature_array63 = new org.mafagafogigante.dungeon.entity.creatures.Creature[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Creature> arraylist_creature64 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Creature>();
    boolean b65 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.Creature>)arraylist_creature64, creature_array63);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString67 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array72 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString67.append(str_array72);
    java.lang.String str74 = dungeonString67.toString();
    org.mafagafogigante.dungeon.game.Point point78 = new org.mafagafogigante.dungeon.game.Point(10, (int)'a', 0);
    java.lang.String[] str_array81 = new java.lang.String[] { "", "" };
    org.mafagafogigante.dungeon.util.Table table82 = new org.mafagafogigante.dungeon.util.Table(str_array81);
    boolean b83 = point78.equals((java.lang.Object)str_array81);
    dungeonString67.append(str_array81);
    observer49.writeCreatureSight((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Creature>)arraylist_creature64, dungeonString67);
    boolean b86 = visibilityCriteria1.isMetBy(observer49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creature_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"+ "'", str33.equals("DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creature_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str74 + "' != '" + "DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"+ "'", str74.equals("DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test010"); }

    org.mafagafogigante.dungeon.game.DungeonString dungeonString1 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString1.append(str_array6);
    java.awt.Color color8 = null;
    dungeonString1.setColor(color8);
    dungeonString1.resetColor();
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString11 = dungeonString1.toColoredStringList();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString11);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test011"); }

    org.mafagafogigante.dungeon.game.Id id0 = null;
    org.mafagafogigante.dungeon.entity.items.BookComponent bookComponent2 = new org.mafagafogigante.dungeon.entity.items.BookComponent(id0, "WritingSpecifications{scrollDown=false}");

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test012"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity((int)(byte)1, (int)(byte)0);
    boolean b3 = integrity2.isMaximum();
    org.mafagafogigante.dungeon.entity.items.Item item4 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity5 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity2, item4);
    itemIntegrity5.incrementBy((int)(byte)0);
    itemIntegrity5.incrementBy((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage10 = itemIntegrity5.toPercentage();
    itemIntegrity5.decrementBy(0);
    java.lang.String str13 = itemIntegrity5.toString();
    int i14 = itemIntegrity5.getMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemIntegrity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "ItemIntegrity{integrity=1/1, item=null}"+ "'", str13.equals("ItemIntegrity{integrity=1/1, item=null}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test013"); }

    org.mafagafogigante.dungeon.game.MinimumBoundingRectangle minimumBoundingRectangle2 = new org.mafagafogigante.dungeon.game.MinimumBoundingRectangle(0, (int)(short)0);
    int i3 = minimumBoundingRectangle2.getHeight();
    int i4 = minimumBoundingRectangle2.getWidth();
    int i5 = minimumBoundingRectangle2.getHeight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test014"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity((int)(byte)1, (int)(byte)0);
    boolean b3 = integrity2.isMaximum();
    org.mafagafogigante.dungeon.entity.items.Item item4 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity5 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity2, item4);
    itemIntegrity5.incrementBy((int)(byte)0);
    itemIntegrity5.incrementBy((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage10 = itemIntegrity5.toPercentage();
    java.lang.String str11 = itemIntegrity5.toString();
    boolean b12 = itemIntegrity5.isBroken();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemIntegrity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "ItemIntegrity{integrity=1/1, item=null}"+ "'", str11.equals("ItemIntegrity{integrity=1/1, item=null}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test015"); }

    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics0 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics1 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point2 = null;
    org.mafagafogigante.dungeon.game.Id id3 = null;
    explorationStatistics1.createEntryIfNotExists(point2, id3);
    org.mafagafogigante.dungeon.game.Point point8 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id9 = null;
    explorationStatistics1.addVisit(point8, id9);
    boolean b11 = explorationStatistics0.hasBeenSeen(point8);
    org.mafagafogigante.dungeon.game.Point point15 = new org.mafagafogigante.dungeon.game.Point(10, (int)'a', 0);
    int i16 = point15.getY();
    org.mafagafogigante.dungeon.game.Id id17 = null;
    explorationStatistics0.addVisit(point15, id17);
    org.mafagafogigante.dungeon.game.Id id19 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i20 = explorationStatistics0.getVisitedLocations(id19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 97);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test016"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    long long4 = date3.getMonth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 10L);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test017"); }

    org.mafagafogigante.dungeon.game.PartOfDay partOfDay0 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity1 = partOfDay0.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name2 = partOfDay0.getName();
    org.mafagafogigante.dungeon.game.QuantificationMode quantificationMode4 = org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER;
    java.lang.String str5 = name2.getQuantifiedName((int)'4', quantificationMode4);
    java.lang.String str7 = name2.getQuantifiedName(3600);
    org.mafagafogigante.dungeon.util.Percentage percentage9 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b11 = percentage9.equals((java.lang.Object)10.0d);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity12 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage9);
    org.mafagafogigante.dungeon.util.Percentage percentage13 = luminosity12.toPercentage();
    boolean b14 = name2.equals((java.lang.Object)percentage13);
    java.lang.String str15 = name2.getSingular();
    org.junit.Assert.assertTrue("'" + partOfDay0 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay0.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name2);
    org.junit.Assert.assertTrue("'" + quantificationMode4 + "' != '" + org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER + "'", quantificationMode4.equals(org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "52 Nights"+ "'", str5.equals("52 Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "a few Nights"+ "'", str7.equals("a few Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Night"+ "'", str15.equals("Night"));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test018"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    boolean b3 = integrity2.isMaximum();
    org.mafagafogigante.dungeon.entity.items.Item item4 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity5 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity2, item4);
    int i6 = itemIntegrity5.getMaximum();
    org.mafagafogigante.dungeon.util.Percentage percentage7 = itemIntegrity5.toPercentage();
    // The following exception was thrown during execution in test generation
    try {
    itemIntegrity5.decrementBy((int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemIntegrity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage7);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test019"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset1 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = itemPreset1.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity3 = null;
    itemPreset1.setIntegrity(integrity3);
    org.mafagafogigante.dungeon.util.Percentage percentage5 = itemPreset1.getVisibility();
    java.lang.String str6 = itemPreset1.getType();
    itemPreset1.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.entity.TagSet<org.mafagafogigante.dungeon.entity.items.Item.Tag> tagset_tag9 = itemPreset1.getTagSet();
    org.mafagafogigante.dungeon.entity.Weight weight11 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    itemPreset1.setWeight(weight11);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset13 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity14 = itemPreset13.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity15 = null;
    itemPreset13.setIntegrity(integrity15);
    org.mafagafogigante.dungeon.util.Percentage percentage18 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    itemPreset13.setHitRate(percentage18);
    itemPreset1.setHitRate(percentage18);
    org.mafagafogigante.dungeon.entity.items.WeaponComponent weaponComponent22 = new org.mafagafogigante.dungeon.entity.items.WeaponComponent(97, percentage18, 3);
    int i23 = weaponComponent22.getDamage();
    int i24 = weaponComponent22.getIntegrityDecrementOnHit();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tagset_tag9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test020"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    creaturePreset0.setAttack((int)(short)100);
    org.mafagafogigante.dungeon.game.Id id5 = creaturePreset0.getWeaponId();
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.creatures.Creature creature6 = new org.mafagafogigante.dungeon.entity.creatures.Creature(creaturePreset0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id5);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test021"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    itemPreset0.setIntegrityDecrementOnEat((-1));
    org.mafagafogigante.dungeon.entity.Weight weight4 = itemPreset0.getWeight();
    int i5 = itemPreset0.getNutrition();
    itemPreset0.setDrinkableDoses(1);
    itemPreset0.setDrinkableHealing(2);
    itemPreset0.setIntegrityDecrementOnEat(57600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test022"); }

    org.mafagafogigante.dungeon.stats.Statistics statistics0 = new org.mafagafogigante.dungeon.stats.Statistics();
    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics1 = statistics0.getBattleStatistics();
    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics2 = statistics0.getWorldStatistics();
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str3 = worldStatistics2.getLocationCounter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(battleStatistics1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(worldStatistics2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str3);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test023"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    itemPreset0.setIntegrityDecrementOnEat((-1));
    org.mafagafogigante.dungeon.entity.Weight weight4 = itemPreset0.getWeight();
    java.lang.String str5 = itemPreset0.getText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test024"); }

    org.mafagafogigante.dungeon.entity.items.IntegrityState integrityState2 = org.mafagafogigante.dungeon.entity.items.IntegrityState.getIntegrityState(90, 57600);
    org.junit.Assert.assertTrue("'" + integrityState2 + "' != '" + org.mafagafogigante.dungeon.entity.items.IntegrityState.SEVERELY_DAMAGED + "'", integrityState2.equals(org.mafagafogigante.dungeon.entity.items.IntegrityState.SEVERELY_DAMAGED));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test025"); }

    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery0 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    battleStatisticsQuery0.setType("Damaged");
    battleStatisticsQuery0.setType("hi!");
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement6 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement(battleStatisticsQuery0, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test026"); }

    // The following exception was thrown during execution in test generation
    try {
    int i2 = org.mafagafogigante.dungeon.game.Random.nextInteger((int)'#', 2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test027"); }

    org.mafagafogigante.dungeon.game.DungeonString dungeonString1 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString1.append(str_array6);
    java.awt.Color color8 = null;
    dungeonString1.setColor(color8);
    java.lang.String str10 = dungeonString1.toString();
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString11 = dungeonString1.toColoredStringList();
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString12 = dungeonString1.toColoredStringList();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=null}"+ "'", str10.equals("DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=null}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString12);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test028"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] creaturePresetFactory_array0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] {  };
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory1 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array0);
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory2 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array0);
    org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory corpseItemPresetFactory3 = new org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory(creatureFactory2);
    org.mafagafogigante.dungeon.game.Id id4 = null;
    org.mafagafogigante.dungeon.game.World world5 = null;
    org.mafagafogigante.dungeon.entity.creatures.Creature creature6 = creatureFactory2.makeCreature(id4, world5);
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery7 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    battleStatisticsQuery7.setType("Damaged");
    battleStatisticsQuery7.setType("");
    org.mafagafogigante.dungeon.game.Id id12 = null;
    battleStatisticsQuery7.setId(id12);
    org.mafagafogigante.dungeon.date.Date date17 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date21 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i22 = date17.compareTo(date21);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay23 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date17);
    java.lang.String[] str_array29 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table30 = new org.mafagafogigante.dungeon.util.Table(str_array29);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString31 = table30.toColoredStringList();
    org.mafagafogigante.dungeon.game.ColoredString coloredString32 = org.mafagafogigante.dungeon.game.Random.select(list_coloredString31);
    boolean b33 = date17.equals((java.lang.Object)coloredString32);
    org.mafagafogigante.dungeon.date.Date date37 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date41 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i42 = date37.compareTo(date41);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay43 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date37);
    long long44 = date37.getYear();
    org.mafagafogigante.dungeon.date.Date date48 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date52 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i53 = date48.compareTo(date52);
    long long54 = date48.getYear();
    int i55 = date37.compareTo(date48);
    org.mafagafogigante.dungeon.date.Duration duration56 = new org.mafagafogigante.dungeon.date.Duration(date17, date48);
    org.mafagafogigante.dungeon.date.Date date61 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date65 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i66 = date61.compareTo(date65);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay67 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date61);
    long long68 = date61.getYear();
    org.mafagafogigante.dungeon.date.Date date72 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date76 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i77 = date72.compareTo(date76);
    long long78 = date72.getYear();
    int i79 = date61.compareTo(date72);
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit81 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR;
    org.mafagafogigante.dungeon.date.Date date82 = date72.minus(35, dungeonTimeUnit81);
    org.mafagafogigante.dungeon.date.Date date83 = date48.plus(3, dungeonTimeUnit81);
    boolean b84 = battleStatisticsQuery7.equals((java.lang.Object)date48);
    org.mafagafogigante.dungeon.game.World world85 = null;
    org.mafagafogigante.dungeon.stats.Statistics statistics86 = new org.mafagafogigante.dungeon.stats.Statistics();
    statistics86.writeStatistics();
    statistics86.writeStatistics();
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.creatures.Hero hero89 = creatureFactory2.makeHero(date48, world85, statistics86);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creaturePresetFactory_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(creature6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay23 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay23.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(coloredString32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay43 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay43.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long44 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long54 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay67 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay67.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long68 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long78 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 0);
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit81 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR + "'", dungeonTimeUnit81.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test029"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date((long)97, (long)(byte)-1, (long)'#');
    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics4 = new org.mafagafogigante.dungeon.stats.BattleStatistics();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement5 = null;
    boolean b6 = battleStatistics4.satisfies(battleStatisticsRequirement5);
    java.lang.String str7 = battleStatistics4.toString();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery8 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement10 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement(battleStatisticsQuery8, (int)(byte)100);
    boolean b11 = battleStatistics4.satisfies(battleStatisticsRequirement10);
    org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.CauseOfDeath> countermap_causeOfDeath12 = battleStatistics4.getKillsByCauseOfDeath();
    org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.CauseOfDeath> countermap_causeOfDeath13 = battleStatistics4.getKillsByCauseOfDeath();
    boolean b14 = date3.equals((java.lang.Object)countermap_causeOfDeath13);
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit16 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.YEAR;
    org.mafagafogigante.dungeon.date.Date date17 = date3.plus(45056, dungeonTimeUnit16);
    java.lang.String str18 = date3.toDateString();
    long long19 = date3.getDay();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "BattleStatistics{records=CounterMap{map={}}}"+ "'", str7.equals("BattleStatistics{records=CounterMap{map={}}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_causeOfDeath12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_causeOfDeath13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit16 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.YEAR + "'", dungeonTimeUnit16.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.YEAR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "day 10 of month 1 of the year 97"+ "'", str18.equals("day 10 of month 1 of the year 97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == 10L);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test030"); }

    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics0 = new org.mafagafogigante.dungeon.stats.WorldStatistics();
    int i1 = worldStatistics0.getSpawnCount();
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str2 = worldStatistics0.getSpawnCounter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str2);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test031"); }

    org.mafagafogigante.dungeon.game.LocationPreset locationPreset0 = null;
    org.mafagafogigante.dungeon.game.World world1 = null;
    org.mafagafogigante.dungeon.game.Point point5 = new org.mafagafogigante.dungeon.game.Point(10, (int)'a', 0);
    int i6 = point5.getY();
    int i7 = point5.getX();
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.game.Location location8 = new org.mafagafogigante.dungeon.game.Location(locationPreset0, world1, point5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test032"); }

    org.mafagafogigante.dungeon.entity.Entity[] entity_array0 = new org.mafagafogigante.dungeon.entity.Entity[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.Entity> arraylist_entity1 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.Entity>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.Entity>)arraylist_entity1, entity_array0);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity3 = org.mafagafogigante.dungeon.entity.Luminosity.resultantLuminosity((java.util.Collection<org.mafagafogigante.dungeon.entity.Entity>)arraylist_entity1);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = luminosity3.toPercentage();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity5 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage4);
    org.mafagafogigante.dungeon.util.Percentage percentage6 = luminosity5.toPercentage();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(entity_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage6);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test033"); }

    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics0 = new org.mafagafogigante.dungeon.stats.WorldStatistics();
    int i1 = worldStatistics0.getLocationCount();
    int i2 = worldStatistics0.getSpawnCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test034"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table6 = new org.mafagafogigante.dungeon.util.Table(str_array5);
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications9 = new org.mafagafogigante.dungeon.gui.WritingSpecifications(false, 32);
    boolean b10 = writingSpecifications9.shouldWait();
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)table6, writingSpecifications9);
    boolean b12 = writingSpecifications9.shouldWait();
    boolean b13 = writingSpecifications9.shouldWait();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test035"); }

    org.mafagafogigante.dungeon.util.Percentage percentage3 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    double d4 = org.mafagafogigante.dungeon.util.DungeonMath.weightedAverage((double)3600, (double)(byte)-1, percentage3);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity5 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == (-1.0d));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test036"); }

    org.mafagafogigante.dungeon.logging.DungeonLogger.info("0 ms");

  }

//  @Test
//  public void test037() throws Throwable {
//
//    if (debug) { System.out.format("%n%s%n","RegressionTest1.test037"); }
//
//    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
//    org.mafagafogigante.dungeon.game.Id id1 = null;
//    creaturePreset0.setWeaponId(id1);
//    creaturePreset0.setAttack(57);
//    org.mafagafogigante.dungeon.entity.Luminosity luminosity5 = creaturePreset0.getLuminosity();
//    creaturePreset0.setInventoryItemLimit(57);
//    org.mafagafogigante.dungeon.game.Id id8 = creaturePreset0.getId();
//    creaturePreset0.setType("Noon");
//    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset11 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
//    org.mafagafogigante.dungeon.game.Id id12 = null;
//    creaturePreset11.setWeaponId(id12);
//    org.mafagafogigante.dungeon.game.Id id14 = creaturePreset11.getId();
//    org.mafagafogigante.dungeon.entity.Luminosity luminosity15 = creaturePreset11.getLuminosity();
//    org.mafagafogigante.dungeon.entity.creatures.Drop[] drop_array16 = new org.mafagafogigante.dungeon.entity.creatures.Drop[] {  };
//    java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop> arraylist_drop17 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop>();
//    boolean b18 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop17, drop_array16);
//    creaturePreset11.setDropList((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop17);
//    creaturePreset0.setDropList((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop17);
//    org.mafagafogigante.dungeon.game.Name name21 = creaturePreset0.getName();
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNotNull(luminosity5);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNull(id8);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNull(id14);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNotNull(luminosity15);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNotNull(drop_array16);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertTrue(b18 == false);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNull(name21);
//
//  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test038"); }

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
    org.mafagafogigante.dungeon.entity.Integrity integrity14 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Weight weight15 = org.mafagafogigante.dungeon.entity.Weight.ZERO;
    org.mafagafogigante.dungeon.entity.Weight weight17 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    int i18 = weight15.compareTo(weight17);
    itemPreset0.setWeight(weight17);
    org.mafagafogigante.dungeon.util.CircularList<java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>> circularlist_comparable_weight21 = new org.mafagafogigante.dungeon.util.CircularList<java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>>(100);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature22 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory25 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature22, (-1), 0.0d);
    org.mafagafogigante.dungeon.entity.Weight weight26 = creatureInventory25.getWeight();
    circularlist_comparable_weight21.add((java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>)weight26);
    org.mafagafogigante.dungeon.entity.Weight weight29 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    org.mafagafogigante.dungeon.entity.Weight weight30 = org.mafagafogigante.dungeon.entity.Weight.ZERO;
    org.mafagafogigante.dungeon.entity.Weight weight31 = weight29.add(weight30);
    org.mafagafogigante.dungeon.entity.Weight weight33 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)'#');
    org.mafagafogigante.dungeon.entity.Weight weight34 = weight31.add(weight33);
    circularlist_comparable_weight21.add((java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>)weight31);
    int i36 = weight17.compareTo(weight31);
    
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
    org.junit.Assert.assertNull(integrity14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test039"); }

    org.mafagafogigante.dungeon.util.Percentage percentage1 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset2 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity3 = itemPreset2.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity4 = null;
    itemPreset2.setIntegrity(integrity4);
    org.mafagafogigante.dungeon.util.Percentage percentage6 = itemPreset2.getVisibility();
    java.lang.String str7 = itemPreset2.getType();
    itemPreset2.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage11 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset2.setVisibility(percentage11);
    boolean b13 = org.mafagafogigante.dungeon.game.Random.roll(percentage11);
    org.mafagafogigante.dungeon.util.Percentage percentage14 = percentage1.multiply(percentage11);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset15 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity16 = itemPreset15.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity17 = null;
    itemPreset15.setIntegrity(integrity17);
    org.mafagafogigante.dungeon.util.Percentage percentage19 = itemPreset15.getVisibility();
    java.lang.String str20 = itemPreset15.getType();
    itemPreset15.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage24 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset15.setVisibility(percentage24);
    org.mafagafogigante.dungeon.util.Percentage percentage27 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    int i28 = percentage24.compareTo(percentage27);
    double d29 = percentage24.toDouble();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity30 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage24);
    int i31 = percentage1.compareTo(percentage24);
    double d32 = percentage1.toDouble();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d29 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d32 == 1.0d);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test040"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity1 = itemPreset0.getLuminosity();
    java.lang.String str2 = itemPreset0.getType();
    int i3 = itemPreset0.getIntegrityDecrementOnHit();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test041"); }

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
    org.mafagafogigante.dungeon.entity.creatures.Creature creature16 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory19 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature16, (-1), 0.0d);
    org.mafagafogigante.dungeon.entity.Weight weight20 = creatureInventory19.getWeight();
    circularlist_comparable_weight1.add((java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>)weight20);
    org.mafagafogigante.dungeon.entity.Weight weight22 = org.mafagafogigante.dungeon.entity.Weight.ZERO;
    org.mafagafogigante.dungeon.entity.Weight weight24 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    int i25 = weight22.compareTo(weight24);
    circularlist_comparable_weight1.add((java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>)weight22);
    
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
    org.junit.Assert.assertNotNull(weight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test042"); }

    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications2 = new org.mafagafogigante.dungeon.gui.WritingSpecifications(true, (int)' ');
    java.lang.String str3 = writingSpecifications2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "WritingSpecifications{scrollDown=true}"+ "'", str3.equals("WritingSpecifications{scrollDown=true}"));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test043"); }

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
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay17 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity18 = partOfDay17.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name19 = partOfDay17.getName();
    java.lang.String str21 = name19.getQuantifiedName((int)'a');
    java.lang.String str22 = name19.getSingular();
    java.lang.String str23 = name19.getPlural();
    itemPreset0.setName(name19);
    itemPreset0.setIntegrityDecrementOnEat(81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    org.junit.Assert.assertTrue("'" + tag15 + "' != '" + org.mafagafogigante.dungeon.entity.items.Item.Tag.DECOMPOSES + "'", tag15.equals(org.mafagafogigante.dungeon.entity.items.Item.Tag.DECOMPOSES));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    org.junit.Assert.assertTrue("'" + partOfDay17 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay17.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "a few Nights"+ "'", str21.equals("a few Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Night"+ "'", str22.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Nights"+ "'", str23.equals("Nights"));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test044"); }

    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics0 = new org.mafagafogigante.dungeon.stats.BattleStatistics();
    org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.CauseOfDeath> countermap_causeOfDeath1 = battleStatistics0.getKillsByCauseOfDeath();
    org.mafagafogigante.dungeon.entity.creatures.Creature creature2 = null;
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath3 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery4 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    battleStatisticsQuery4.setType("Damaged");
    battleStatisticsQuery4.setType("");
    boolean b9 = causeOfDeath3.equals((java.lang.Object)battleStatisticsQuery4);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay10 = org.mafagafogigante.dungeon.game.PartOfDay.AFTERNOON;
    java.lang.String str11 = partOfDay10.toString();
    java.lang.String str12 = partOfDay10.toString();
    // The following exception was thrown during execution in test generation
    try {
    battleStatistics0.addBattle(creature2, causeOfDeath3, partOfDay10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_causeOfDeath1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    org.junit.Assert.assertTrue("'" + partOfDay10 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.AFTERNOON + "'", partOfDay10.equals(org.mafagafogigante.dungeon.game.PartOfDay.AFTERNOON));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Afternoon"+ "'", str11.equals("Afternoon"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Afternoon"+ "'", str12.equals("Afternoon"));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test045"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule2 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeBoundIntegerRule(57600, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule2);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test046"); }

    java.awt.Color color1 = null;
    org.mafagafogigante.dungeon.game.LocationDescription locationDescription2 = new org.mafagafogigante.dungeon.game.LocationDescription('a', color1);
    java.awt.Color color3 = locationDescription2.getColor();
    locationDescription2.setInfo("Less than a day");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(color3);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test047"); }

    boolean b1 = org.mafagafogigante.dungeon.commands.IssuedCommand.isValidSource("DungeonString{coloredStringList=[], currentColor=java.awt.Color[r=192,g=192,b=192]}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test048"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay3 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity4 = partOfDay3.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name5 = partOfDay3.getName();
    org.mafagafogigante.dungeon.game.QuantificationMode quantificationMode7 = org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER;
    java.lang.String str8 = name5.getQuantifiedName((int)'4', quantificationMode7);
    creaturePreset0.setName(name5);
    org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId attackAlgorithmId10 = org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId.DUMMY;
    creaturePreset0.setAttackAlgorithmId(attackAlgorithmId10);
    org.mafagafogigante.dungeon.game.Name name12 = creaturePreset0.getName();
    org.mafagafogigante.dungeon.entity.items.Item[] item_array13 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item14 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item14, item_array13);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString17 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array22 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString17.append(str_array22);
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item24 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item14, str_array22);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString26 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array31 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString26.append(str_array31);
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item33 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item14, str_array31);
    boolean b34 = name12.equals((java.lang.Object)arraylist_item14);
    org.junit.Assert.assertTrue("'" + partOfDay3 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay3.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name5);
    org.junit.Assert.assertTrue("'" + quantificationMode7 + "' != '" + org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER + "'", quantificationMode7.equals(org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "52 Nights"+ "'", str8.equals("52 Nights"));
    org.junit.Assert.assertTrue("'" + attackAlgorithmId10 + "' != '" + org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId.DUMMY + "'", attackAlgorithmId10.equals(org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId.DUMMY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test049"); }

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
    org.mafagafogigante.dungeon.date.Date date25 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date29 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i30 = date25.compareTo(date29);
    long long31 = date25.getYear();
    int i32 = date3.compareTo(date25);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay33 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date3);
    java.lang.Object obj34 = null;
    boolean b35 = date3.equals(obj34);
    
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
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long31 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay33 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay33.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test050"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.entity.Weight weight2 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)'#');
    java.lang.String str3 = weight2.toString();
    creaturePreset0.setWeight(weight2);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity5 = creaturePreset0.getLuminosity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "35 kg"+ "'", str3.equals("35 kg"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity5);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test051"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications2 = new org.mafagafogigante.dungeon.gui.WritingSpecifications(true, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test052"); }

    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement2 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement(battleStatisticsQuery0, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test053"); }

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
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay16 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity17 = partOfDay16.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name18 = partOfDay16.getName();
    java.lang.String str20 = name18.getQuantifiedName((int)'a');
    creaturePreset0.setName(name18);
    org.mafagafogigante.dungeon.entity.Weight weight22 = creaturePreset0.getWeight();
    java.util.List<org.mafagafogigante.dungeon.game.Id> list_id23 = creaturePreset0.getItems();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(id_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    org.junit.Assert.assertTrue("'" + partOfDay16 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay16.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "a few Nights"+ "'", str20.equals("a few Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_id23);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test054"); }

    org.mafagafogigante.dungeon.game.Point point3 = new org.mafagafogigante.dungeon.game.Point(0, (int)(short)-1, (int)(short)0);
    java.lang.String str4 = point3.toString();
    int i5 = point3.getX();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{0, -1, 0}"+ "'", str4.equals("{0, -1, 0}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test055"); }

    org.mafagafogigante.dungeon.stats.Statistics statistics0 = new org.mafagafogigante.dungeon.stats.Statistics();
    statistics0.writeStatistics();
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker2 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics0);
    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics3 = statistics0.getBattleStatistics();
    statistics0.writeStatistics();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(battleStatistics3);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test056"); }

    org.mafagafogigante.dungeon.game.PartOfDay partOfDay0 = org.mafagafogigante.dungeon.game.PartOfDay.NOON;
    java.lang.String str1 = partOfDay0.toString();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity2 = partOfDay0.getLuminosity();
    org.junit.Assert.assertTrue("'" + partOfDay0 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NOON + "'", partOfDay0.equals(org.mafagafogigante.dungeon.game.PartOfDay.NOON));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Noon"+ "'", str1.equals("Noon"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity2);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test057"); }

    int i1 = org.mafagafogigante.dungeon.util.DungeonMath.safeCastLongToInteger((long)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 32);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test058"); }

    org.mafagafogigante.dungeon.game.DungeonString dungeonString1 = new org.mafagafogigante.dungeon.game.DungeonString("");
    java.lang.String str2 = dungeonString1.toString();
    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array4 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria5 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array4);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature6 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer7 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature6);
    boolean b8 = visibilityCriteria5.isMetBy(observer7);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array9 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item10 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item10, item_array9);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString13 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    observer7.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item10, dungeonString13);
    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array15 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria16 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array15);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature17 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer18 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature17);
    boolean b19 = visibilityCriteria16.isMetBy(observer18);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array20 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item21 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item21, item_array20);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString24 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    observer18.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item21, dungeonString24);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString27 = new org.mafagafogigante.dungeon.game.DungeonString("");
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString28 = dungeonString27.toColoredStringList();
    observer7.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item21, dungeonString27);
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications32 = new org.mafagafogigante.dungeon.gui.WritingSpecifications(false, 32);
    boolean b33 = writingSpecifications32.shouldWait();
    int i34 = writingSpecifications32.getWait();
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)dungeonString27, writingSpecifications32);
    org.mafagafogigante.dungeon.date.Date date41 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date45 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i46 = date41.compareTo(date45);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay47 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date41);
    java.lang.String[] str_array53 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table54 = new org.mafagafogigante.dungeon.util.Table(str_array53);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString55 = table54.toColoredStringList();
    org.mafagafogigante.dungeon.game.ColoredString coloredString56 = org.mafagafogigante.dungeon.game.Random.select(list_coloredString55);
    boolean b57 = date41.equals((java.lang.Object)coloredString56);
    java.awt.Color color58 = coloredString56.getColor();
    org.mafagafogigante.dungeon.game.ColoredString coloredString59 = new org.mafagafogigante.dungeon.game.ColoredString("User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 41.5 MiB out of the allocated 154.5 MiB\nOS: Windows 10 (amd64) 10.0", color58);
    org.mafagafogigante.dungeon.game.ColoredString coloredString60 = new org.mafagafogigante.dungeon.game.ColoredString("Unarmed : UNARMED", color58);
    dungeonString27.setColor(color58);
    org.mafagafogigante.dungeon.game.ColoredString coloredString62 = new org.mafagafogigante.dungeon.game.ColoredString("Night", color58);
    dungeonString1.setColor(color58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "DungeonString{coloredStringList=[], currentColor=java.awt.Color[r=192,g=192,b=192]}"+ "'", str2.equals("DungeonString{coloredStringList=[], currentColor=java.awt.Color[r=192,g=192,b=192]}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay47 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay47.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(coloredString56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color58);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test059"); }

    org.mafagafogigante.dungeon.game.PartOfDay partOfDay0 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity1 = partOfDay0.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name2 = partOfDay0.getName();
    org.mafagafogigante.dungeon.game.QuantificationMode quantificationMode4 = org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER;
    java.lang.String str5 = name2.getQuantifiedName((int)'4', quantificationMode4);
    java.lang.String str7 = name2.getQuantifiedName(3600);
    org.mafagafogigante.dungeon.util.Percentage percentage9 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b11 = percentage9.equals((java.lang.Object)10.0d);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity12 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage9);
    org.mafagafogigante.dungeon.util.Percentage percentage13 = luminosity12.toPercentage();
    boolean b14 = name2.equals((java.lang.Object)percentage13);
    java.lang.String str15 = name2.getPlural();
    org.junit.Assert.assertTrue("'" + partOfDay0 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay0.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name2);
    org.junit.Assert.assertTrue("'" + quantificationMode4 + "' != '" + org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER + "'", quantificationMode4.equals(org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "52 Nights"+ "'", str5.equals("52 Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "a few Nights"+ "'", str7.equals("a few Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Nights"+ "'", str15.equals("Nights"));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test060"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity1 = creaturePreset0.getLuminosity();
    int i2 = creaturePreset0.getAttack();
    int i3 = creaturePreset0.getAttack();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test061"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, 32, (double)'4');
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
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test062"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    itemPreset0.setIntegrityDecrementOnEat((-1));
    itemPreset0.setPutrefactionPeriod((-1L));
    itemPreset0.setDrinkableDoses((int)(short)10);
    itemPreset0.setPutrefactionPeriod((long)3600);
    itemPreset0.setPutrefactionPeriod((long)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test063"); }

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
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset19 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity20 = itemPreset19.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity21 = null;
    itemPreset19.setIntegrity(integrity21);
    org.mafagafogigante.dungeon.util.Percentage percentage23 = itemPreset19.getVisibility();
    java.lang.String str24 = itemPreset19.getType();
    org.mafagafogigante.dungeon.entity.items.Item.Tag tag25 = org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE;
    itemPreset19.addTag(tag25);
    itemPreset0.addTag(tag25);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    org.junit.Assert.assertTrue("'" + tag25 + "' != '" + org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE + "'", tag25.equals(org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test064"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    java.lang.String str5 = itemPreset0.getType();
    itemPreset0.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.entity.TagSet<org.mafagafogigante.dungeon.entity.items.Item.Tag> tagset_tag8 = itemPreset0.getTagSet();
    itemPreset0.setIntegrityDecrementPerDose(32);
    int i11 = itemPreset0.getIntegrityDecrementPerDose();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tagset_tag8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 32);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test065"); }

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
    org.mafagafogigante.dungeon.game.Id id23 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i24 = explorationStatistics0.getMaximumNumberOfVisits(id23);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == (-1));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test066"); }

    org.mafagafogigante.dungeon.entity.items.LocationInventory locationInventory0 = new org.mafagafogigante.dungeon.entity.items.LocationInventory();
    org.mafagafogigante.dungeon.entity.items.Item item1 = null;
    boolean b2 = locationInventory0.hasItem(item1);
    int i3 = locationInventory0.getItemCount();
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item4 = locationInventory0.getItems();
    org.mafagafogigante.dungeon.entity.items.Item item5 = null;
    // The following exception was thrown during execution in test generation
    try {
    locationInventory0.removeItem(item5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item4);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test067"); }

    org.mafagafogigante.dungeon.commands.CommandHistory commandHistory0 = new org.mafagafogigante.dungeon.commands.CommandHistory();
    java.lang.String str2 = commandHistory0.getLastSimilarCommand("");
    java.lang.String str4 = commandHistory0.getLastSimilarCommand("Unarmed : UNARMED");
    org.mafagafogigante.dungeon.commands.CommandHistory.Cursor cursor5 = commandHistory0.getCursor();
    java.lang.String str6 = cursor5.getSelectedCommand();
    org.mafagafogigante.dungeon.commands.CommandHistory.Cursor cursor7 = cursor5.moveUp();
    org.mafagafogigante.dungeon.commands.CommandHistory.Cursor cursor8 = cursor7.moveUp();
    org.mafagafogigante.dungeon.commands.CommandHistory.Cursor cursor9 = cursor7.moveUp();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cursor8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cursor9);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test068"); }

    org.mafagafogigante.dungeon.commands.CommandDescription commandDescription2 = new org.mafagafogigante.dungeon.commands.CommandDescription("0 B", "User: Nicholas\nTime: 15:42:34\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 18.2 MiB out of the allocated 117.0 MiB\nOS: Windows 10 (amd64) 10.0");
    java.lang.String str3 = commandDescription2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 b"+ "'", str3.equals("0 b"));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test069"); }

    org.mafagafogigante.dungeon.commands.CommandDescription commandDescription2 = new org.mafagafogigante.dungeon.commands.CommandDescription("", "day 10 of month 1 of the year 1");
    java.lang.String str3 = commandDescription2.getInfo();
    java.lang.String str4 = commandDescription2.getInfo();
    java.lang.String str5 = commandDescription2.getName();
    java.lang.String str6 = commandDescription2.getInfo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "day 10 of month 1 of the year 1"+ "'", str3.equals("day 10 of month 1 of the year 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "day 10 of month 1 of the year 1"+ "'", str4.equals("day 10 of month 1 of the year 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "day 10 of month 1 of the year 1"+ "'", str6.equals("day 10 of month 1 of the year 1"));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test070"); }

    org.mafagafogigante.dungeon.stats.Statistics statistics0 = new org.mafagafogigante.dungeon.stats.Statistics();
    statistics0.writeStatistics();
    statistics0.writeStatistics();
    statistics0.writeStatistics();
    org.mafagafogigante.dungeon.commands.IssuedCommand issuedCommand5 = new org.mafagafogigante.dungeon.commands.IssuedCommand("BattleStatistics{records=CounterMap{map={}}}");
    org.mafagafogigante.dungeon.commands.PreparedIssuedCommand preparedIssuedCommand6 = org.mafagafogigante.dungeon.commands.IssuedCommandProcessor.prepareIssuedCommand(issuedCommand5);
    statistics0.addCommand(issuedCommand5);
    org.mafagafogigante.dungeon.commands.IssuedCommandEvaluation issuedCommandEvaluation8 = org.mafagafogigante.dungeon.commands.IssuedCommandProcessor.evaluateIssuedCommand(issuedCommand5);
    org.mafagafogigante.dungeon.commands.IssuedCommandEvaluation issuedCommandEvaluation9 = org.mafagafogigante.dungeon.commands.IssuedCommandProcessor.evaluateIssuedCommand(issuedCommand5);
    java.lang.String str10 = issuedCommand5.getStringRepresentation();
    
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
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test071"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule1 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeArraySizeRule((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule1);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test072"); }

    org.mafagafogigante.dungeon.game.DungeonString dungeonString1 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString1.append(str_array6);
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications8 = null;
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)dungeonString1, writingSpecifications8);
    java.lang.String[] str_array14 = new java.lang.String[] { "User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 34.4 MiB out of the allocated 123.0 MiB\nOS: Windows 10 (amd64) 10.0", "97 B", "DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}", "Unarmed : UNARMED" };
    dungeonString1.append(str_array14);
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications18 = new org.mafagafogigante.dungeon.gui.WritingSpecifications(false, 32);
    boolean b19 = writingSpecifications18.shouldWait();
    java.lang.String str20 = writingSpecifications18.toString();
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)dungeonString1, writingSpecifications18);
    boolean b22 = writingSpecifications18.shouldWait();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "WritingSpecifications{scrollDown=false}"+ "'", str20.equals("WritingSpecifications{scrollDown=false}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test073"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.util.Percentage percentage1 = org.mafagafogigante.dungeon.util.Percentage.fromString("CreatureHealth{integrity=100/100}");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test074"); }

    org.mafagafogigante.dungeon.game.Point point3 = new org.mafagafogigante.dungeon.game.Point(100, 10, (int)(byte)10);
    java.lang.String str4 = point3.toString();
    org.mafagafogigante.dungeon.game.Direction direction5 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b7 = direction5.equalsIgnoreCase("Damaged");
    org.mafagafogigante.dungeon.game.Point point8 = new org.mafagafogigante.dungeon.game.Point(point3, direction5);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances9 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.Direction direction10 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b12 = direction10.equalsIgnoreCase("");
    blockedEntrances9.block(direction10);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances14 = new org.mafagafogigante.dungeon.game.BlockedEntrances(blockedEntrances9);
    org.mafagafogigante.dungeon.game.Direction direction15 = org.mafagafogigante.dungeon.game.Direction.EAST;
    org.mafagafogigante.dungeon.game.Direction direction16 = direction15.invert();
    blockedEntrances14.block(direction16);
    org.mafagafogigante.dungeon.game.Direction direction18 = org.mafagafogigante.dungeon.game.Direction.EAST;
    java.lang.String str19 = direction18.toString();
    java.lang.String str20 = direction18.toString();
    blockedEntrances14.block(direction18);
    org.mafagafogigante.dungeon.game.Point point22 = new org.mafagafogigante.dungeon.game.Point(point3, direction18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{100, 10, 10}"+ "'", str4.equals("{100, 10, 10}"));
    org.junit.Assert.assertTrue("'" + direction5 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction5.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    org.junit.Assert.assertTrue("'" + direction10 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction10.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    org.junit.Assert.assertTrue("'" + direction15 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction15.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    org.junit.Assert.assertTrue("'" + direction16 + "' != '" + org.mafagafogigante.dungeon.game.Direction.WEST + "'", direction16.equals(org.mafagafogigante.dungeon.game.Direction.WEST));
    org.junit.Assert.assertTrue("'" + direction18 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction18.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "East"+ "'", str19.equals("East"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "East"+ "'", str20.equals("East"));

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test075"); }

    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances0 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.Direction direction1 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b2 = blockedEntrances0.isBlocked(direction1);
    org.mafagafogigante.dungeon.game.Direction direction3 = org.mafagafogigante.dungeon.game.Direction.WEST;
    boolean b4 = blockedEntrances0.isBlocked(direction3);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances5 = new org.mafagafogigante.dungeon.game.BlockedEntrances(blockedEntrances0);
    org.mafagafogigante.dungeon.game.Direction direction6 = org.mafagafogigante.dungeon.game.Direction.NORTH;
    boolean b7 = blockedEntrances5.isBlocked(direction6);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances8 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.Direction direction9 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b11 = direction9.equalsIgnoreCase("");
    blockedEntrances8.block(direction9);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances13 = new org.mafagafogigante.dungeon.game.BlockedEntrances(blockedEntrances8);
    org.mafagafogigante.dungeon.game.Direction direction14 = org.mafagafogigante.dungeon.game.Direction.EAST;
    org.mafagafogigante.dungeon.game.Direction direction15 = direction14.invert();
    blockedEntrances13.block(direction15);
    org.mafagafogigante.dungeon.game.Direction direction17 = org.mafagafogigante.dungeon.game.Direction.EAST;
    java.lang.String str18 = direction17.toString();
    java.lang.String str19 = direction17.toString();
    blockedEntrances13.block(direction17);
    boolean b22 = direction17.equalsIgnoreCase("it is raining");
    blockedEntrances5.block(direction17);
    org.junit.Assert.assertTrue("'" + direction1 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction1.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + direction3 + "' != '" + org.mafagafogigante.dungeon.game.Direction.WEST + "'", direction3.equals(org.mafagafogigante.dungeon.game.Direction.WEST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    org.junit.Assert.assertTrue("'" + direction6 + "' != '" + org.mafagafogigante.dungeon.game.Direction.NORTH + "'", direction6.equals(org.mafagafogigante.dungeon.game.Direction.NORTH));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    org.junit.Assert.assertTrue("'" + direction9 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction9.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    org.junit.Assert.assertTrue("'" + direction14 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction14.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    org.junit.Assert.assertTrue("'" + direction15 + "' != '" + org.mafagafogigante.dungeon.game.Direction.WEST + "'", direction15.equals(org.mafagafogigante.dungeon.game.Direction.WEST));
    org.junit.Assert.assertTrue("'" + direction17 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction17.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "East"+ "'", str18.equals("East"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "East"+ "'", str19.equals("East"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test076"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    creaturePreset0.setAttack(57);
    org.mafagafogigante.dungeon.game.Id[] id_array5 = new org.mafagafogigante.dungeon.game.Id[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.game.Id> arraylist_id6 = new java.util.ArrayList<org.mafagafogigante.dungeon.game.Id>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.game.Id>)arraylist_id6, id_array5);
    creaturePreset0.setItems((java.util.List<org.mafagafogigante.dungeon.game.Id>)arraylist_id6);
    org.mafagafogigante.dungeon.game.Id id9 = creaturePreset0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(id_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id9);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test077"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer1 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature0);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array2 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item3 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item3, item_array2);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString6 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array11 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString6.append(str_array11);
    observer1.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item3, dungeonString6);
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)dungeonString6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test078"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay3 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity4 = partOfDay3.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name5 = partOfDay3.getName();
    org.mafagafogigante.dungeon.game.QuantificationMode quantificationMode7 = org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER;
    java.lang.String str8 = name5.getQuantifiedName((int)'4', quantificationMode7);
    creaturePreset0.setName(name5);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay10 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    boolean b11 = name5.equals((java.lang.Object)partOfDay10);
    java.lang.String str12 = name5.getPlural();
    org.junit.Assert.assertTrue("'" + partOfDay3 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay3.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name5);
    org.junit.Assert.assertTrue("'" + quantificationMode7 + "' != '" + org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER + "'", quantificationMode7.equals(org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "52 Nights"+ "'", str8.equals("52 Nights"));
    org.junit.Assert.assertTrue("'" + partOfDay10 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay10.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nights"+ "'", str12.equals("Nights"));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test079"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, 32, (double)'4');
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
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test080"); }

    java.lang.String str1 = org.mafagafogigante.dungeon.io.Converter.bytesToHuman((long)3600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3.5 KiB"+ "'", str1.equals("3.5 KiB"));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test081"); }

    org.mafagafogigante.dungeon.util.CircularList<java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>> circularlist_comparable_weight1 = new org.mafagafogigante.dungeon.util.CircularList<java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>>(100);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature2 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory5 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature2, (-1), 0.0d);
    org.mafagafogigante.dungeon.entity.Weight weight6 = creatureInventory5.getWeight();
    circularlist_comparable_weight1.add((java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>)weight6);
    org.mafagafogigante.dungeon.entity.Weight weight9 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    org.mafagafogigante.dungeon.entity.Weight weight10 = org.mafagafogigante.dungeon.entity.Weight.ZERO;
    org.mafagafogigante.dungeon.entity.Weight weight11 = weight9.add(weight10);
    circularlist_comparable_weight1.add((java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>)weight11);
    int i13 = circularlist_comparable_weight1.size();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight> comparable_weight15 = circularlist_comparable_weight1.get(82800);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 2);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test082"); }

    org.mafagafogigante.dungeon.logging.DungeonLogger.warning("User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 41.5 MiB out of the allocated 154.5 MiB\nOS: Windows 10 (amd64) 10.0");

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test083"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    java.lang.String str3 = integrity2.toString();
    java.lang.String str4 = integrity2.toString();
    java.lang.String str5 = integrity2.toString();
    java.lang.String str6 = integrity2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0/1"+ "'", str3.equals("0/1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0/1"+ "'", str4.equals("0/1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0/1"+ "'", str5.equals("0/1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0/1"+ "'", str6.equals("0/1"));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test084"); }

    org.mafagafogigante.dungeon.util.Percentage percentage1 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b3 = percentage1.equals((java.lang.Object)10.0d);
    double d4 = percentage1.toDouble();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity5 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage1);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset6 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity7 = itemPreset6.getIntegrity();
    itemPreset6.setIntegrityDecrementOnEat((-1));
    org.mafagafogigante.dungeon.entity.Weight weight10 = itemPreset6.getWeight();
    itemPreset6.setDrinkableHealing((int)(byte)1);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset13 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity14 = itemPreset13.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity15 = null;
    itemPreset13.setIntegrity(integrity15);
    org.mafagafogigante.dungeon.util.Percentage percentage17 = itemPreset13.getVisibility();
    java.lang.String str18 = itemPreset13.getType();
    itemPreset13.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage22 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset13.setVisibility(percentage22);
    itemPreset6.setVisibility(percentage22);
    boolean b25 = percentage1.biggerThanOrEqualTo(percentage22);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset27 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity28 = itemPreset27.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity29 = null;
    itemPreset27.setIntegrity(integrity29);
    org.mafagafogigante.dungeon.util.Percentage percentage31 = itemPreset27.getVisibility();
    java.lang.String str32 = itemPreset27.getType();
    itemPreset27.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.entity.TagSet<org.mafagafogigante.dungeon.entity.items.Item.Tag> tagset_tag35 = itemPreset27.getTagSet();
    org.mafagafogigante.dungeon.entity.Weight weight37 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    itemPreset27.setWeight(weight37);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset39 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity40 = itemPreset39.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity41 = null;
    itemPreset39.setIntegrity(integrity41);
    org.mafagafogigante.dungeon.util.Percentage percentage44 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    itemPreset39.setHitRate(percentage44);
    itemPreset27.setHitRate(percentage44);
    org.mafagafogigante.dungeon.entity.items.WeaponComponent weaponComponent48 = new org.mafagafogigante.dungeon.entity.items.WeaponComponent(97, percentage44, 3);
    org.mafagafogigante.dungeon.util.Percentage percentage49 = weaponComponent48.getHitRate();
    int i50 = percentage22.compareTo(percentage49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tagset_tag35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test085"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] creaturePresetFactory_array0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] {  };
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory1 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array0);
    org.mafagafogigante.dungeon.date.Date date5 = new org.mafagafogigante.dungeon.date.Date((long)'a', (long)1, (long)81);
    org.mafagafogigante.dungeon.world.Weather weather6 = new org.mafagafogigante.dungeon.world.Weather(date5);
    org.mafagafogigante.dungeon.game.World world7 = null;
    org.mafagafogigante.dungeon.entity.creatures.Creature creature8 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory11 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature8, (-1), 0.0d);
    org.mafagafogigante.dungeon.entity.Weight weight12 = creatureInventory11.getWeight();
    int i13 = creatureInventory11.getItemCount();
    int i14 = creatureInventory11.getItemCount();
    org.mafagafogigante.dungeon.entity.Weight weight15 = creatureInventory11.getWeightLimit();
    org.mafagafogigante.dungeon.stats.Statistics statistics16 = new org.mafagafogigante.dungeon.stats.Statistics();
    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics17 = statistics16.getBattleStatistics();
    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics18 = statistics16.getWorldStatistics();
    boolean b19 = weight15.equals((java.lang.Object)statistics16);
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics20 = statistics16.getExplorationStatistics();
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.creatures.Hero hero21 = creatureFactory1.makeHero(date5, world7, statistics16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creaturePresetFactory_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(battleStatistics17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(worldStatistics18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(explorationStatistics20);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test086"); }

    boolean b1 = org.mafagafogigante.dungeon.commands.IssuedCommand.isValidSource("97 Nights");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

//  @Test
//  public void test087() throws Throwable {
//
//    if (debug) { System.out.format("%n%s%n","RegressionTest1.test087"); }
//
//    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
//    org.mafagafogigante.dungeon.game.Id id1 = null;
//    creaturePreset0.setWeaponId(id1);
//    creaturePreset0.setAttack(57);
//    org.mafagafogigante.dungeon.entity.Luminosity luminosity5 = creaturePreset0.getLuminosity();
//    creaturePreset0.setInventoryItemLimit(57);
//    org.mafagafogigante.dungeon.entity.creatures.Drop[] drop_array8 = new org.mafagafogigante.dungeon.entity.creatures.Drop[] {  };
//    java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop> arraylist_drop9 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop>();
//    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop9, drop_array8);
//    creaturePreset0.setDropList((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop9);
//    int i12 = creaturePreset0.getInventoryItemLimit();
//    org.mafagafogigante.dungeon.entity.TagSet<org.mafagafogigante.dungeon.entity.creatures.Creature.Tag> tagset_tag13 = null;
//    creaturePreset0.setTagSet(tagset_tag13);
//    org.mafagafogigante.dungeon.util.Percentage percentage16 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
//    boolean b18 = percentage16.equals((java.lang.Object)10.0d);
//    double d19 = percentage16.toDouble();
//    org.mafagafogigante.dungeon.entity.Luminosity luminosity20 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage16);
//    org.mafagafogigante.dungeon.entity.Visibility visibility21 = new org.mafagafogigante.dungeon.entity.Visibility(percentage16);
//    org.mafagafogigante.dungeon.util.Percentage percentage22 = visibility21.toPercentage();
//    org.mafagafogigante.dungeon.util.Percentage percentage23 = visibility21.toPercentage();
//    creaturePreset0.setVisibility(percentage23);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNotNull(luminosity5);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNotNull(drop_array8);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertTrue(b10 == false);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertTrue(i12 == 57);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertTrue(b18 == false);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertTrue(d19 == 1.0d);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNotNull(percentage22);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNotNull(percentage23);
//
//  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test088"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    creaturePreset0.setAttack(57);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity5 = creaturePreset0.getLuminosity();
    creaturePreset0.setInventoryItemLimit(57);
    org.mafagafogigante.dungeon.game.Id id8 = creaturePreset0.getId();
    creaturePreset0.setType("Noon");
    org.mafagafogigante.dungeon.game.Name name11 = creaturePreset0.getName();
    creaturePreset0.setInventoryWeightLimit((double)43200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(name11);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test089"); }

    org.mafagafogigante.dungeon.logging.DungeonLogger.info("day 10 of month 10 of the year 10");

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test090"); }

    org.mafagafogigante.dungeon.game.DungeonString dungeonString1 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString1.append(str_array6);
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications8 = null;
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)dungeonString1, writingSpecifications8);
    java.lang.String[] str_array14 = new java.lang.String[] { "User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 34.4 MiB out of the allocated 123.0 MiB\nOS: Windows 10 (amd64) 10.0", "97 B", "DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}", "Unarmed : UNARMED" };
    dungeonString1.append(str_array14);
    java.lang.String[] str_array18 = new java.lang.String[] { "", "" };
    org.mafagafogigante.dungeon.util.Table table19 = new org.mafagafogigante.dungeon.util.Table(str_array18);
    org.mafagafogigante.dungeon.util.Table table20 = new org.mafagafogigante.dungeon.util.Table(str_array18);
    dungeonString1.append(str_array18);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString22 = dungeonString1.toColoredStringList();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString22);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test091"); }

    org.mafagafogigante.dungeon.world.WeatherCondition weatherCondition0 = org.mafagafogigante.dungeon.world.WeatherCondition.OVERCAST;
    org.mafagafogigante.dungeon.world.WeatherCondition weatherCondition1 = org.mafagafogigante.dungeon.world.WeatherCondition.OVERCAST;
    org.mafagafogigante.dungeon.world.WeatherConditionVisibilityCriterion weatherConditionVisibilityCriterion2 = new org.mafagafogigante.dungeon.world.WeatherConditionVisibilityCriterion(weatherCondition0, weatherCondition1);
    org.mafagafogigante.dungeon.world.WeatherCondition weatherCondition3 = org.mafagafogigante.dungeon.world.WeatherCondition.OVERCAST;
    org.mafagafogigante.dungeon.world.WeatherCondition weatherCondition4 = org.mafagafogigante.dungeon.world.WeatherCondition.OVERCAST;
    org.mafagafogigante.dungeon.world.WeatherConditionVisibilityCriterion weatherConditionVisibilityCriterion5 = new org.mafagafogigante.dungeon.world.WeatherConditionVisibilityCriterion(weatherCondition3, weatherCondition4);
    org.mafagafogigante.dungeon.world.WeatherConditionVisibilityCriterion weatherConditionVisibilityCriterion6 = new org.mafagafogigante.dungeon.world.WeatherConditionVisibilityCriterion(weatherCondition1, weatherCondition4);
    org.junit.Assert.assertTrue("'" + weatherCondition0 + "' != '" + org.mafagafogigante.dungeon.world.WeatherCondition.OVERCAST + "'", weatherCondition0.equals(org.mafagafogigante.dungeon.world.WeatherCondition.OVERCAST));
    org.junit.Assert.assertTrue("'" + weatherCondition1 + "' != '" + org.mafagafogigante.dungeon.world.WeatherCondition.OVERCAST + "'", weatherCondition1.equals(org.mafagafogigante.dungeon.world.WeatherCondition.OVERCAST));
    org.junit.Assert.assertTrue("'" + weatherCondition3 + "' != '" + org.mafagafogigante.dungeon.world.WeatherCondition.OVERCAST + "'", weatherCondition3.equals(org.mafagafogigante.dungeon.world.WeatherCondition.OVERCAST));
    org.junit.Assert.assertTrue("'" + weatherCondition4 + "' != '" + org.mafagafogigante.dungeon.world.WeatherCondition.OVERCAST + "'", weatherCondition4.equals(org.mafagafogigante.dungeon.world.WeatherCondition.OVERCAST));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test092"); }

    org.mafagafogigante.dungeon.entity.items.IntegrityState integrityState2 = org.mafagafogigante.dungeon.entity.items.IntegrityState.getIntegrityState((int)(byte)-1, 100);
    java.lang.String str3 = integrityState2.toString();
    org.junit.Assert.assertTrue("'" + integrityState2 + "' != '" + org.mafagafogigante.dungeon.entity.items.IntegrityState.BROKEN + "'", integrityState2.equals(org.mafagafogigante.dungeon.entity.items.IntegrityState.BROKEN));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Broken"+ "'", str3.equals("Broken"));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test093"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature1 = null;
    org.mafagafogigante.dungeon.entity.creatures.CreatureHealth creatureHealth2 = org.mafagafogigante.dungeon.entity.creatures.CreatureHealth.makeCreatureHealth(100, creature1);
    int i3 = creatureHealth2.getMaximum();
    int i4 = creatureHealth2.getCurrent();
    boolean b5 = creatureHealth2.isDead();
    boolean b6 = creatureHealth2.isAlive();
    creatureHealth2.incrementBy((int)(short)-1);
    boolean b9 = creatureHealth2.isAlive();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creatureHealth2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test094"); }

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
    org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId attackAlgorithmId25 = creaturePreset0.getAttackAlgorithmId();
    creaturePreset0.setType("DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=null}");
    
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
    org.junit.Assert.assertNull(attackAlgorithmId25);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test095"); }

    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics0 = new org.mafagafogigante.dungeon.stats.WorldStatistics();
    worldStatistics0.addLocation("User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 34.4 MiB out of the allocated 123.0 MiB\nOS: Windows 10 (amd64) 10.0");
    int i3 = worldStatistics0.getSpawnCount();
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str4 = worldStatistics0.getLocationCounter();
    worldStatistics0.addSpawn("Evening");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str4);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test096"); }

    org.mafagafogigante.dungeon.util.SystemInformation systemInformation0 = new org.mafagafogigante.dungeon.util.SystemInformation();
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString1 = systemInformation0.toColoredStringList();
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications2 = null;
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)systemInformation0, writingSpecifications2);
    org.mafagafogigante.dungeon.io.Writer.writeAndWait((org.mafagafogigante.dungeon.game.Writable)systemInformation0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString1);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test097"); }

    org.mafagafogigante.dungeon.game.PartOfDay partOfDay0 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity1 = partOfDay0.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name2 = partOfDay0.getName();
    java.lang.String str4 = name2.getQuantifiedName((int)'a');
    java.lang.String str5 = name2.getSingular();
    java.lang.String str6 = name2.getPlural();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset7 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity8 = itemPreset7.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity9 = null;
    itemPreset7.setIntegrity(integrity9);
    org.mafagafogigante.dungeon.entity.Integrity integrity11 = itemPreset7.getIntegrity();
    org.mafagafogigante.dungeon.util.Percentage percentage12 = itemPreset7.getHitRate();
    boolean b13 = name2.equals((java.lang.Object)percentage12);
    java.lang.String str14 = name2.getPlural();
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
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nights"+ "'", str6.equals("Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Nights"+ "'", str14.equals("Nights"));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test098"); }

    org.mafagafogigante.dungeon.util.Percentage percentage3 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b5 = percentage3.equals((java.lang.Object)10.0d);
    double d6 = percentage3.toDouble();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity7 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage3);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset8 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity9 = itemPreset8.getIntegrity();
    itemPreset8.setIntegrityDecrementOnEat((-1));
    org.mafagafogigante.dungeon.entity.Weight weight12 = itemPreset8.getWeight();
    itemPreset8.setDrinkableHealing((int)(byte)1);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset15 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity16 = itemPreset15.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity17 = null;
    itemPreset15.setIntegrity(integrity17);
    org.mafagafogigante.dungeon.util.Percentage percentage19 = itemPreset15.getVisibility();
    java.lang.String str20 = itemPreset15.getType();
    itemPreset15.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage24 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset15.setVisibility(percentage24);
    itemPreset8.setVisibility(percentage24);
    boolean b27 = percentage3.biggerThanOrEqualTo(percentage24);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset31 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    itemPreset31.setDrinkableHealing((int)(short)0);
    org.mafagafogigante.dungeon.util.Percentage percentage35 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset31.setVisibility(percentage35);
    double d37 = org.mafagafogigante.dungeon.util.DungeonMath.weightedAverage((double)10.0f, 100.0d, percentage35);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset38 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity39 = itemPreset38.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity40 = null;
    itemPreset38.setIntegrity(integrity40);
    org.mafagafogigante.dungeon.util.Percentage percentage42 = itemPreset38.getVisibility();
    java.lang.String str43 = itemPreset38.getType();
    org.mafagafogigante.dungeon.entity.items.Item.Tag tag44 = org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE;
    itemPreset38.addTag(tag44);
    org.mafagafogigante.dungeon.util.Percentage percentage47 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b49 = percentage47.equals((java.lang.Object)10.0d);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity50 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage47);
    itemPreset38.setVisibility(percentage47);
    boolean b52 = percentage35.biggerThanOrEqualTo(percentage47);
    org.mafagafogigante.dungeon.entity.items.WeaponComponent weaponComponent54 = new org.mafagafogigante.dungeon.entity.items.WeaponComponent((int)(short)10, percentage47, 1);
    org.mafagafogigante.dungeon.util.Percentage percentage55 = percentage3.multiply(percentage47);
    double d56 = org.mafagafogigante.dungeon.util.DungeonMath.weightedAverage((double)10.0f, (double)46800, percentage3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d37 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str43);
    org.junit.Assert.assertTrue("'" + tag44 + "' != '" + org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE + "'", tag44.equals(org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d56 == 46800.0d);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test099"); }

    java.awt.Color color1 = null;
    org.mafagafogigante.dungeon.game.LocationDescription locationDescription2 = new org.mafagafogigante.dungeon.game.LocationDescription('a', color1);
    java.awt.Color color3 = locationDescription2.getColor();
    locationDescription2.setInfo("Night");
    java.lang.String str6 = locationDescription2.getInfo();
    java.lang.String str7 = locationDescription2.getInfo();
    java.lang.String str8 = locationDescription2.getInfo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(color3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Night"+ "'", str6.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Night"+ "'", str7.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Night"+ "'", str8.equals("Night"));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test100"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    org.mafagafogigante.dungeon.entity.TagSet<org.mafagafogigante.dungeon.entity.creatures.Creature.Tag> tagset_tag3 = null;
    creaturePreset0.setTagSet(tagset_tag3);
    org.mafagafogigante.dungeon.game.Id id5 = creaturePreset0.getWeaponId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id5);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test101"); }

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
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay13 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity14 = partOfDay13.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name15 = partOfDay13.getName();
    java.lang.String str17 = name15.getQuantifiedName((int)'a');
    java.lang.String str18 = name15.getSingular();
    java.lang.String str19 = name15.toString();
    java.lang.String str21 = name15.getQuantifiedName((int)(short)10);
    java.lang.String str22 = name15.getSingular();
    itemPreset0.setName(name15);
    org.mafagafogigante.dungeon.game.Id id24 = itemPreset0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tagset_tag8);
    org.junit.Assert.assertTrue("'" + partOfDay13 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay13.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "a few Nights"+ "'", str17.equals("a few Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Night"+ "'", str18.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Night"+ "'", str19.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "a few Nights"+ "'", str21.equals("a few Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Night"+ "'", str22.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id24);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test102"); }

    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances0 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.Direction direction1 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b2 = blockedEntrances0.isBlocked(direction1);
    org.mafagafogigante.dungeon.game.Direction direction3 = org.mafagafogigante.dungeon.game.Direction.WEST;
    boolean b4 = blockedEntrances0.isBlocked(direction3);
    boolean b6 = direction3.equalsIgnoreCase("Uninjured");
    org.junit.Assert.assertTrue("'" + direction1 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction1.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + direction3 + "' != '" + org.mafagafogigante.dungeon.game.Direction.WEST + "'", direction3.equals(org.mafagafogigante.dungeon.game.Direction.WEST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test103"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date7 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i8 = date3.compareTo(date7);
    org.mafagafogigante.dungeon.date.Date date13 = new org.mafagafogigante.dungeon.date.Date((long)32, (long)(short)10, 0L);
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit15 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.SECOND;
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit16 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.MILLISECOND;
    long long17 = dungeonTimeUnit15.as(dungeonTimeUnit16);
    org.mafagafogigante.dungeon.date.Date date18 = date13.minus((int)(short)100, dungeonTimeUnit15);
    org.mafagafogigante.dungeon.date.Date date19 = date3.minus((int)'4', dungeonTimeUnit15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit15 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.SECOND + "'", dungeonTimeUnit15.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.SECOND));
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit16 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.MILLISECOND + "'", dungeonTimeUnit16.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.MILLISECOND));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 1000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date19);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test104"); }

    org.mafagafogigante.dungeon.game.Id id0 = null;
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery2 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath3 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    battleStatisticsQuery2.setCauseOfDeath(causeOfDeath3);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay5 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.stats.BattleRecord battleRecord6 = new org.mafagafogigante.dungeon.stats.BattleRecord(id0, "", causeOfDeath3, partOfDay5);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset7 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity8 = itemPreset7.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity9 = null;
    itemPreset7.setIntegrity(integrity9);
    org.mafagafogigante.dungeon.util.Percentage percentage11 = itemPreset7.getVisibility();
    java.lang.String str12 = itemPreset7.getType();
    itemPreset7.setIntegrityDecrementOnHit((int)(short)100);
    boolean b15 = battleRecord6.equals((java.lang.Object)itemPreset7);
    org.mafagafogigante.dungeon.game.Id id16 = battleRecord6.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath3);
    org.junit.Assert.assertTrue("'" + partOfDay5 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay5.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id16);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test105"); }

    // The following exception was thrown during execution in test generation
    try {
    int i2 = org.mafagafogigante.dungeon.game.Random.nextInteger((int)'a', (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test106"); }

    org.mafagafogigante.dungeon.util.Percentage percentage1 = new org.mafagafogigante.dungeon.util.Percentage((double)1L);
    java.lang.String str2 = percentage1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.00%"+ "'", str2.equals("100.00%"));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test107"); }

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
    java.lang.String str23 = lightSource22.toString();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Enabled LightSource of luminosity of 0.00%"+ "'", str23.equals("Enabled LightSource of luminosity of 0.00%"));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test108"); }

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
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay17 = org.mafagafogigante.dungeon.game.PartOfDay.AFTERNOON;
    java.lang.String str18 = partOfDay17.toString();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity19 = partOfDay17.getLuminosity();
    itemPreset0.setLuminosity(luminosity19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    org.junit.Assert.assertTrue("'" + tag15 + "' != '" + org.mafagafogigante.dungeon.entity.items.Item.Tag.DECOMPOSES + "'", tag15.equals(org.mafagafogigante.dungeon.entity.items.Item.Tag.DECOMPOSES));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    org.junit.Assert.assertTrue("'" + partOfDay17 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.AFTERNOON + "'", partOfDay17.equals(org.mafagafogigante.dungeon.game.PartOfDay.AFTERNOON));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Afternoon"+ "'", str18.equals("Afternoon"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity19);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test109"); }

    org.mafagafogigante.dungeon.entity.items.IntegrityState integrityState2 = org.mafagafogigante.dungeon.entity.items.IntegrityState.getIntegrityState((int)(byte)0, 32);
    org.junit.Assert.assertTrue("'" + integrityState2 + "' != '" + org.mafagafogigante.dungeon.entity.items.IntegrityState.BROKEN + "'", integrityState2.equals(org.mafagafogigante.dungeon.entity.items.IntegrityState.BROKEN));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test110"); }

    org.mafagafogigante.dungeon.date.Date date6 = new org.mafagafogigante.dungeon.date.Date((long)(short)-1, (long)(byte)-1, (long)32, (long)152, (long)46800, (long)(byte)10);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test111"); }

    org.mafagafogigante.dungeon.io.Writer.write("");

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test112"); }

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
    java.lang.String[] str_array22 = new java.lang.String[] { "Damaged", "visibilityCriteria=VisibilityCriteria{[]}", "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str23 = new java.util.ArrayList<java.lang.String>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str23, str_array22);
    org.mafagafogigante.dungeon.io.Split split25 = org.mafagafogigante.dungeon.io.Split.splitOnOn((java.util.List<java.lang.String>)arraylist_str23);
    org.mafagafogigante.dungeon.io.Split split26 = org.mafagafogigante.dungeon.io.Split.splitOnOn((java.util.List<java.lang.String>)arraylist_str23);
    countermap_randomAccess0.incrementCounter((java.util.RandomAccess)arraylist_str23, (java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(id_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(split25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(split26);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test113"); }

    org.mafagafogigante.dungeon.logging.DungeonLogger.warning("Slightly Damaged");

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test114"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature1 = null;
    org.mafagafogigante.dungeon.entity.creatures.CreatureHealth creatureHealth2 = org.mafagafogigante.dungeon.entity.creatures.CreatureHealth.makeCreatureHealth(100, creature1);
    boolean b3 = creatureHealth2.isAlive();
    java.lang.String str4 = creatureHealth2.toString();
    creatureHealth2.decrementBy((int)(byte)10);
    org.mafagafogigante.dungeon.entity.creatures.HealthState healthState7 = creatureHealth2.getHealthState();
    int i8 = creatureHealth2.getCurrent();
    boolean b9 = creatureHealth2.isFull();
    boolean b10 = creatureHealth2.isAlive();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creatureHealth2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "CreatureHealth{integrity=100/100}"+ "'", str4.equals("CreatureHealth{integrity=100/100}"));
    org.junit.Assert.assertTrue("'" + healthState7 + "' != '" + org.mafagafogigante.dungeon.entity.creatures.HealthState.UNINJURED + "'", healthState7.equals(org.mafagafogigante.dungeon.entity.creatures.HealthState.UNINJURED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test115"); }

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
    java.lang.String str43 = duration42.toString();
    java.lang.Object obj44 = null;
    boolean b45 = duration42.equals(obj44);
    
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
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "Less than a day"+ "'", str43.equals("Less than a day"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test116"); }

    boolean b1 = org.mafagafogigante.dungeon.game.Random.roll(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test117"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule0 = null;
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule1 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeVariableArrayRule(jsonRule0);
    org.mafagafogigante.dungeon.schema.JsonRule[] jsonRule_array2 = new org.mafagafogigante.dungeon.schema.JsonRule[] { jsonRule0 };
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule3 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeGroupRule(jsonRule_array2);
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule4 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeGroupRule(jsonRule_array2);
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule5 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeGroupRule(jsonRule_array2);
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule6 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeGroupRule(jsonRule_array2);
    
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
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test118"); }

    org.mafagafogigante.dungeon.logging.DungeonLogger.fine("Noon");

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test119"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] creaturePresetFactory_array0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] {  };
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory1 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array0);
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory2 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array0);
    org.mafagafogigante.dungeon.game.Id id3 = null;
    org.mafagafogigante.dungeon.game.World world4 = null;
    org.mafagafogigante.dungeon.entity.creatures.Creature creature5 = creatureFactory2.makeCreature(id3, world4);
    org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory corpseItemPresetFactory6 = new org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory(creatureFactory2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creaturePresetFactory_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(creature5);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test120"); }

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
    int i19 = itemPreset0.getIntegrityDecrementOnHit();
    itemPreset0.setIntegrityDecrementOnEat((int)'4');
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test121"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    itemPreset0.setIntegrityDecrementOnEat((-1));
    org.mafagafogigante.dungeon.entity.Weight weight4 = itemPreset0.getWeight();
    itemPreset0.setDrinkableHealing((int)(byte)1);
    int i7 = itemPreset0.getDamage();
    itemPreset0.setDrinkableDoses(97);
    int i10 = itemPreset0.getIntegrityDecrementOnHit();
    // The following exception was thrown during execution in test generation
    try {
    itemPreset0.setSpellId("Afternoon");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test122"); }

    java.awt.Color color1 = null;
    org.mafagafogigante.dungeon.game.LocationDescription locationDescription2 = new org.mafagafogigante.dungeon.game.LocationDescription('a', color1);
    java.awt.Color color3 = locationDescription2.getColor();
    locationDescription2.setInfo("Night");
    locationDescription2.setInfo("00:00:00");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(color3);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test123"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    creaturePreset0.setAttack(57);
    int i5 = creaturePreset0.getAttack();
    int i6 = creaturePreset0.getInventoryItemLimit();
    java.util.List<org.mafagafogigante.dungeon.game.Id> list_id7 = creaturePreset0.getItems();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_id7);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test124"); }

    org.mafagafogigante.dungeon.date.Date date6 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date10 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i11 = date6.compareTo(date10);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay12 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date6);
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table19 = new org.mafagafogigante.dungeon.util.Table(str_array18);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString20 = table19.toColoredStringList();
    org.mafagafogigante.dungeon.game.ColoredString coloredString21 = org.mafagafogigante.dungeon.game.Random.select(list_coloredString20);
    boolean b22 = date6.equals((java.lang.Object)coloredString21);
    java.awt.Color color23 = coloredString21.getColor();
    org.mafagafogigante.dungeon.game.ColoredString coloredString24 = new org.mafagafogigante.dungeon.game.ColoredString("User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 41.5 MiB out of the allocated 154.5 MiB\nOS: Windows 10 (amd64) 10.0", color23);
    org.mafagafogigante.dungeon.game.ColoredString coloredString25 = new org.mafagafogigante.dungeon.game.ColoredString("Unarmed : UNARMED", color23);
    org.mafagafogigante.dungeon.game.LocationDescription locationDescription26 = new org.mafagafogigante.dungeon.game.LocationDescription('4', color23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay12 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay12.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(coloredString21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color23);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test125"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] creaturePresetFactory_array0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] {  };
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory1 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array0);
    org.mafagafogigante.dungeon.game.Id id2 = null;
    org.mafagafogigante.dungeon.game.World world3 = null;
    org.mafagafogigante.dungeon.entity.creatures.Creature creature4 = creatureFactory1.makeCreature(id2, world3);
    org.mafagafogigante.dungeon.date.Date date8 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date12 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i13 = date8.compareTo(date12);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay14 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date8);
    long long15 = date8.getYear();
    org.mafagafogigante.dungeon.date.Date date19 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date23 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i24 = date19.compareTo(date23);
    long long25 = date19.getYear();
    int i26 = date8.compareTo(date19);
    org.mafagafogigante.dungeon.date.Date date30 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date34 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i35 = date30.compareTo(date34);
    long long36 = date30.getYear();
    int i37 = date8.compareTo(date30);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay38 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date8);
    org.mafagafogigante.dungeon.game.World world39 = null;
    org.mafagafogigante.dungeon.stats.Statistics statistics40 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.creatures.Hero hero41 = creatureFactory1.makeHero(date8, world39, statistics40);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creaturePresetFactory_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(creature4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay14 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay14.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long25 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long36 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay38 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay38.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test126"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    org.mafagafogigante.dungeon.entity.Integrity integrity5 = itemPreset0.getIntegrity();
    java.lang.String str6 = itemPreset0.getText();
    org.mafagafogigante.dungeon.game.Name name7 = null;
    itemPreset0.setName(name7);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset9 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity10 = itemPreset9.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity11 = null;
    itemPreset9.setIntegrity(integrity11);
    org.mafagafogigante.dungeon.util.Percentage percentage13 = itemPreset9.getVisibility();
    java.lang.String str14 = itemPreset9.getType();
    itemPreset9.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage18 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset9.setVisibility(percentage18);
    boolean b20 = org.mafagafogigante.dungeon.game.Random.roll(percentage18);
    itemPreset0.setVisibility(percentage18);
    long long22 = itemPreset0.getPutrefactionPeriod();
    itemPreset0.setIntegrityDecrementOnEat(82800);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long22 == 0L);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test127"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    creaturePreset0.setAttack(57);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity5 = creaturePreset0.getLuminosity();
    int i6 = creaturePreset0.getInventoryItemLimit();
    org.mafagafogigante.dungeon.game.Id id7 = null;
    creaturePreset0.setWeaponId(id7);
    creaturePreset0.setInventoryItemLimit(0);
    org.mafagafogigante.dungeon.game.Id id11 = creaturePreset0.getWeaponId();
    org.mafagafogigante.dungeon.game.Id id12 = creaturePreset0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id12);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test128"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date((long)1, (long)'a', 817201000L);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay4 = org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT;
    org.mafagafogigante.dungeon.game.Name name5 = partOfDay4.getName();
    int i6 = org.mafagafogigante.dungeon.game.PartOfDay.getSecondsToNext(date3, partOfDay4);
    org.junit.Assert.assertTrue("'" + partOfDay4 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay4.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 82800);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test129"); }

    org.mafagafogigante.dungeon.entity.items.Item[] item_array0 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item1 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item1, item_array0);
    java.lang.String[] str_array8 = new java.lang.String[] { "CounterMap{map={}}", "User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 34.4 MiB out of the allocated 123.0 MiB\nOS: Windows 10 (amd64) 10.0", "hi!", "0 ms", "User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 41.5 MiB out of the allocated 154.5 MiB\nOS: Windows 10 (amd64) 10.0" };
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item9 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item1, str_array8);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.items.Item item10 = org.mafagafogigante.dungeon.game.Random.select(list_item9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
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

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test130"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, 57, (double)34);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test131"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    java.lang.String str5 = itemPreset0.getType();
    itemPreset0.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.entity.TagSet<org.mafagafogigante.dungeon.entity.items.Item.Tag> tagset_tag8 = itemPreset0.getTagSet();
    itemPreset0.setIntegrityDecrementPerDose(32);
    boolean b11 = itemPreset0.isUnique();
    int i12 = itemPreset0.getDamage();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tagset_tag8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test132"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.util.library.AutomaticShuffledStringLibrary automaticShuffledStringLibrary1 = new org.mafagafogigante.dungeon.util.library.AutomaticShuffledStringLibrary("User: Nicholas\nTime: 15:43:14\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 18.7 MiB out of the allocated 109.5 MiB\nOS: Windows 10 (amd64) 10.0");
      org.junit.Assert.fail("Expected exception of type org.mafagafogigante.dungeon.io.JsonObjectFactory.IllegalFilenameExtensionException");
    } catch (org.mafagafogigante.dungeon.io.JsonObjectFactory.IllegalFilenameExtensionException e) {
      // Expected exception.
    }

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test133"); }

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
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay17 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity18 = partOfDay17.getLuminosity();
    org.mafagafogigante.dungeon.entity.LightSource lightSource19 = new org.mafagafogigante.dungeon.entity.LightSource(luminosity18);
    creaturePreset0.setLuminosity(luminosity18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(id_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 57);
    org.junit.Assert.assertTrue("'" + partOfDay17 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay17.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity18);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test134"); }

    org.mafagafogigante.dungeon.util.CircularList<java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>> circularlist_comparable_weight1 = new org.mafagafogigante.dungeon.util.CircularList<java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>>((int)'4');

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test135"); }

    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics0 = new org.mafagafogigante.dungeon.stats.WorldStatistics();
    int i1 = worldStatistics0.getLocationCount();
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str2 = worldStatistics0.getLocationCounter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str2);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test136"); }

    org.mafagafogigante.dungeon.game.Numeral numeral1 = org.mafagafogigante.dungeon.game.Numeral.getCorrespondingNumeral(1);
    java.lang.String str2 = numeral1.toString();
    org.junit.Assert.assertTrue("'" + numeral1 + "' != '" + org.mafagafogigante.dungeon.game.Numeral.ONE + "'", numeral1.equals(org.mafagafogigante.dungeon.game.Numeral.ONE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "One"+ "'", str2.equals("One"));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test137"); }

    org.mafagafogigante.dungeon.entity.items.IntegrityState integrityState2 = org.mafagafogigante.dungeon.entity.items.IntegrityState.getIntegrityState((int)(byte)-1, (int)' ');
    java.lang.String str3 = integrityState2.toString();
    java.lang.String str4 = integrityState2.toString();
    org.junit.Assert.assertTrue("'" + integrityState2 + "' != '" + org.mafagafogigante.dungeon.entity.items.IntegrityState.BROKEN + "'", integrityState2.equals(org.mafagafogigante.dungeon.entity.items.IntegrityState.BROKEN));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Broken"+ "'", str3.equals("Broken"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Broken"+ "'", str4.equals("Broken"));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test138"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.util.Percentage percentage2 = itemPreset0.getVisibility();
    java.lang.String str3 = itemPreset0.getType();
    itemPreset0.setDrinkableHealing(10);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay6 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity7 = partOfDay6.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name8 = partOfDay6.getName();
    java.lang.String str10 = name8.getQuantifiedName((int)'a');
    java.lang.String str11 = name8.getSingular();
    java.lang.String str12 = name8.toString();
    java.lang.String str13 = name8.getSingular();
    itemPreset0.setName(name8);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset15 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity16 = itemPreset15.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity17 = null;
    itemPreset15.setIntegrity(integrity17);
    org.mafagafogigante.dungeon.util.Percentage percentage19 = itemPreset15.getVisibility();
    java.lang.String str20 = itemPreset15.getType();
    itemPreset15.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage24 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset15.setVisibility(percentage24);
    org.mafagafogigante.dungeon.game.Id id26 = null;
    itemPreset15.setId(id26);
    itemPreset15.setPutrefactionPeriod((long)(short)1);
    org.mafagafogigante.dungeon.entity.items.Item.Tag tag30 = org.mafagafogigante.dungeon.entity.items.Item.Tag.DECOMPOSES;
    boolean b31 = itemPreset15.hasTag(tag30);
    itemPreset0.addTag(tag30);
    itemPreset0.setPutrefactionPeriod((long)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    org.junit.Assert.assertTrue("'" + partOfDay6 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay6.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "a few Nights"+ "'", str10.equals("a few Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Night"+ "'", str11.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Night"+ "'", str12.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Night"+ "'", str13.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    org.junit.Assert.assertTrue("'" + tag30 + "' != '" + org.mafagafogigante.dungeon.entity.items.Item.Tag.DECOMPOSES + "'", tag30.equals(org.mafagafogigante.dungeon.entity.items.Item.Tag.DECOMPOSES));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test139"); }

    org.mafagafogigante.dungeon.game.Point point3 = new org.mafagafogigante.dungeon.game.Point(10, (int)'a', 0);
    int i4 = point3.getX();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test140"); }

    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics0 = new org.mafagafogigante.dungeon.stats.BattleStatistics();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement1 = null;
    boolean b2 = battleStatistics0.satisfies(battleStatisticsRequirement1);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature3 = null;
    org.mafagafogigante.dungeon.game.Id id4 = null;
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath6 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    org.mafagafogigante.dungeon.entity.creatures.HealthState healthState7 = org.mafagafogigante.dungeon.entity.creatures.HealthState.DEAD;
    boolean b8 = causeOfDeath6.equals((java.lang.Object)healthState7);
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table15 = new org.mafagafogigante.dungeon.util.Table(str_array14);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString16 = table15.toColoredStringList();
    boolean b17 = causeOfDeath6.equals((java.lang.Object)table15);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay18 = org.mafagafogigante.dungeon.game.PartOfDay.NOON;
    org.mafagafogigante.dungeon.stats.BattleRecord battleRecord19 = new org.mafagafogigante.dungeon.stats.BattleRecord(id4, "East", causeOfDeath6, partOfDay18);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset20 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity21 = itemPreset20.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity22 = null;
    itemPreset20.setIntegrity(integrity22);
    org.mafagafogigante.dungeon.entity.Integrity integrity24 = itemPreset20.getIntegrity();
    org.mafagafogigante.dungeon.util.Percentage percentage25 = itemPreset20.getHitRate();
    itemPreset20.setNutrition((int)(short)1);
    boolean b28 = battleRecord19.equals((java.lang.Object)itemPreset20);
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath29 = battleRecord19.getCauseOfDeath();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay30 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity31 = partOfDay30.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name32 = partOfDay30.getName();
    // The following exception was thrown during execution in test generation
    try {
    battleStatistics0.addBattle(creature3, causeOfDeath29, partOfDay30);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath6);
    org.junit.Assert.assertTrue("'" + healthState7 + "' != '" + org.mafagafogigante.dungeon.entity.creatures.HealthState.DEAD + "'", healthState7.equals(org.mafagafogigante.dungeon.entity.creatures.HealthState.DEAD));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    org.junit.Assert.assertTrue("'" + partOfDay18 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NOON + "'", partOfDay18.equals(org.mafagafogigante.dungeon.game.PartOfDay.NOON));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath29);
    org.junit.Assert.assertTrue("'" + partOfDay30 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay30.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name32);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test141"); }

    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances0 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances1 = new org.mafagafogigante.dungeon.game.BlockedEntrances(blockedEntrances0);
    java.lang.String str2 = blockedEntrances0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "None"+ "'", str2.equals("None"));

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test142"); }

    org.mafagafogigante.dungeon.logging.DungeonLogger.fine("35 Nights");

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test143"); }

    org.mafagafogigante.dungeon.util.CircularList<java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>> circularlist_comparable_weight1 = new org.mafagafogigante.dungeon.util.CircularList<java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>>(100);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature2 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory5 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature2, (-1), 0.0d);
    org.mafagafogigante.dungeon.entity.Weight weight6 = creatureInventory5.getWeight();
    circularlist_comparable_weight1.add((java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>)weight6);
    org.mafagafogigante.dungeon.entity.Weight weight9 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    org.mafagafogigante.dungeon.entity.Weight weight10 = org.mafagafogigante.dungeon.entity.Weight.ZERO;
    org.mafagafogigante.dungeon.entity.Weight weight11 = weight9.add(weight10);
    circularlist_comparable_weight1.add((java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>)weight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight11);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test144"); }

    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics0 = new org.mafagafogigante.dungeon.stats.WorldStatistics();
    int i1 = worldStatistics0.getLocationCount();
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str2 = worldStatistics0.getSpawnCounter();
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str3 = worldStatistics0.getSpawnCounter();
    int i4 = worldStatistics0.getLocationCount();
    worldStatistics0.addLocation("");
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str7 = worldStatistics0.getSpawnCounter();
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str8 = worldStatistics0.getSpawnCounter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str8);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test145"); }

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
    org.mafagafogigante.dungeon.util.Percentage percentage15 = itemPreset0.getHitRate();
    itemPreset0.setPutrefactionPeriod((long)152);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage15);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test146"); }

    org.mafagafogigante.dungeon.util.Percentage percentage3 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset4 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity5 = itemPreset4.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity6 = null;
    itemPreset4.setIntegrity(integrity6);
    org.mafagafogigante.dungeon.util.Percentage percentage8 = itemPreset4.getVisibility();
    java.lang.String str9 = itemPreset4.getType();
    itemPreset4.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage13 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset4.setVisibility(percentage13);
    boolean b15 = org.mafagafogigante.dungeon.game.Random.roll(percentage13);
    org.mafagafogigante.dungeon.util.Percentage percentage16 = percentage3.multiply(percentage13);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset17 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity18 = itemPreset17.getIntegrity();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity19 = itemPreset17.getLuminosity();
    org.mafagafogigante.dungeon.util.Percentage percentage21 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset17.setVisibility(percentage21);
    org.mafagafogigante.dungeon.util.Percentage percentage23 = percentage16.multiply(percentage21);
    double d24 = org.mafagafogigante.dungeon.util.DungeonMath.weightedAverage(0.0d, (double)17518, percentage16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d24 == 17518.0d);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test147"); }

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
    org.mafagafogigante.dungeon.entity.Weight weight17 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    org.mafagafogigante.dungeon.entity.Weight weight18 = org.mafagafogigante.dungeon.entity.Weight.ZERO;
    org.mafagafogigante.dungeon.entity.Weight weight19 = weight17.add(weight18);
    org.mafagafogigante.dungeon.entity.Weight weight21 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)'#');
    org.mafagafogigante.dungeon.entity.Weight weight22 = weight19.add(weight21);
    circularlist_comparable_weight1.add((java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>)weight19);
    int i24 = circularlist_comparable_weight1.size();
    java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight> comparable_weight25 = null;
    circularlist_comparable_weight1.add(comparable_weight25);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight> comparable_weight28 = circularlist_comparable_weight1.get(45056);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
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
    org.junit.Assert.assertNotNull(weight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test148"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity(38, 2);
    int i3 = integrity2.getMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 38);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test149"); }

    java.awt.Color color1 = null;
    org.mafagafogigante.dungeon.game.LocationDescription locationDescription2 = new org.mafagafogigante.dungeon.game.LocationDescription('a', color1);
    java.lang.String str3 = locationDescription2.getInfo();
    java.awt.Color color4 = locationDescription2.getColor();
    java.lang.String str5 = locationDescription2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "You don't discover anything."+ "'", str3.equals("You don't discover anything."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(color4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "LocationDescription{symbol=a, color=null, info='You don't discover anything.'}"+ "'", str5.equals("LocationDescription{symbol=a, color=null, info='You don't discover anything.'}"));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test150"); }

    org.mafagafogigante.dungeon.stats.Statistics statistics0 = new org.mafagafogigante.dungeon.stats.Statistics();
    statistics0.writeStatistics();
    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics2 = statistics0.getWorldStatistics();
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str3 = worldStatistics2.getSpawnCounter();
    java.lang.String str4 = countermap_str3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(worldStatistics2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "CounterMap{map={}}"+ "'", str4.equals("CounterMap{map={}}"));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test151"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.util.Percentage percentage2 = itemPreset0.getVisibility();
    java.lang.String str3 = itemPreset0.getType();
    int i4 = itemPreset0.getDamage();
    itemPreset0.setType("Damaged");
    org.mafagafogigante.dungeon.util.Percentage percentage7 = itemPreset0.getVisibility();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage7);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test152"); }

    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics0 = new org.mafagafogigante.dungeon.stats.BattleStatistics();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement1 = null;
    boolean b2 = battleStatistics0.satisfies(battleStatisticsRequirement1);
    java.lang.String str3 = battleStatistics0.toString();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery4 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement6 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement(battleStatisticsQuery4, (int)(byte)100);
    boolean b7 = battleStatistics0.satisfies(battleStatisticsRequirement6);
    org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.CauseOfDeath> countermap_causeOfDeath8 = battleStatistics0.getKillsByCauseOfDeath();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery9 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement11 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement(battleStatisticsQuery9, (int)(byte)100);
    int i12 = battleStatisticsRequirement11.getCount();
    int i13 = battleStatisticsRequirement11.getCount();
    int i14 = battleStatisticsRequirement11.getCount();
    boolean b15 = battleStatistics0.satisfies(battleStatisticsRequirement11);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature16 = null;
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery17 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath18 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    battleStatisticsQuery17.setCauseOfDeath(causeOfDeath18);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay20 = org.mafagafogigante.dungeon.game.PartOfDay.AFTERNOON;
    java.lang.String str21 = partOfDay20.toString();
    boolean b22 = causeOfDeath18.equals((java.lang.Object)partOfDay20);
    org.mafagafogigante.dungeon.date.Date date26 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date30 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i31 = date26.compareTo(date30);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay32 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date26);
    long long33 = date26.getYear();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay34 = org.mafagafogigante.dungeon.game.PartOfDay.AFTERNOON;
    int i35 = org.mafagafogigante.dungeon.game.PartOfDay.getSecondsToNext(date26, partOfDay34);
    // The following exception was thrown during execution in test generation
    try {
    battleStatistics0.addBattle(creature16, causeOfDeath18, partOfDay34);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "BattleStatistics{records=CounterMap{map={}}}"+ "'", str3.equals("BattleStatistics{records=CounterMap{map={}}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_causeOfDeath8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath18);
    org.junit.Assert.assertTrue("'" + partOfDay20 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.AFTERNOON + "'", partOfDay20.equals(org.mafagafogigante.dungeon.game.PartOfDay.AFTERNOON));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Afternoon"+ "'", str21.equals("Afternoon"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay32 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay32.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long33 == 10L);
    org.junit.Assert.assertTrue("'" + partOfDay34 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.AFTERNOON + "'", partOfDay34.equals(org.mafagafogigante.dungeon.game.PartOfDay.AFTERNOON));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 46800);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test153"); }

    org.mafagafogigante.dungeon.util.ShuffledRange shuffledRange2 = new org.mafagafogigante.dungeon.util.ShuffledRange(81, 46800);
    int i4 = shuffledRange2.get(0);
    int i5 = shuffledRange2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 20601);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 46719);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test154"); }

    org.mafagafogigante.dungeon.entity.items.ItemUsageEffect itemUsageEffect1 = new org.mafagafogigante.dungeon.entity.items.ItemUsageEffect(10);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test155"); }

    org.mafagafogigante.dungeon.game.Point point3 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    int i4 = point3.getY();
    int i5 = point3.getZ();
    int i6 = point3.getX();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test156"); }

    org.mafagafogigante.dungeon.game.Point point3 = new org.mafagafogigante.dungeon.game.Point(100, 10, (int)(byte)10);
    java.lang.String str4 = point3.toString();
    org.mafagafogigante.dungeon.game.Direction direction5 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b7 = direction5.equalsIgnoreCase("Damaged");
    org.mafagafogigante.dungeon.game.Point point8 = new org.mafagafogigante.dungeon.game.Point(point3, direction5);
    java.lang.String str9 = point8.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{100, 10, 10}"+ "'", str4.equals("{100, 10, 10}"));
    org.junit.Assert.assertTrue("'" + direction5 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction5.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{101, 10, 10}"+ "'", str9.equals("{101, 10, 10}"));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test157"); }

    org.mafagafogigante.dungeon.game.Id id0 = null;
    org.mafagafogigante.dungeon.entity.items.BookComponent bookComponent2 = new org.mafagafogigante.dungeon.entity.items.BookComponent(id0, " : day 10 of month 1 of the year 1");
    int i3 = bookComponent2.getTimeToRead();
    java.lang.String str4 = bookComponent2.getText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " : day 10 of month 1 of the year 1"+ "'", str4.equals(" : day 10 of month 1 of the year 1"));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test158"); }

    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath0 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    org.mafagafogigante.dungeon.entity.creatures.HealthState healthState1 = org.mafagafogigante.dungeon.entity.creatures.HealthState.DEAD;
    boolean b2 = causeOfDeath0.equals((java.lang.Object)healthState1);
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table9 = new org.mafagafogigante.dungeon.util.Table(str_array8);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString10 = table9.toColoredStringList();
    boolean b11 = causeOfDeath0.equals((java.lang.Object)table9);
    java.lang.String str12 = causeOfDeath0.toString();
    
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
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Unarmed : UNARMED"+ "'", str12.equals("Unarmed : UNARMED"));

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test159"); }

    org.mafagafogigante.dungeon.game.LocationPreset locationPreset0 = null;
    org.mafagafogigante.dungeon.game.World world1 = null;
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics2 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point3 = null;
    org.mafagafogigante.dungeon.game.Id id4 = null;
    explorationStatistics2.createEntryIfNotExists(point3, id4);
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics6 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point7 = null;
    org.mafagafogigante.dungeon.game.Id id8 = null;
    explorationStatistics6.createEntryIfNotExists(point7, id8);
    org.mafagafogigante.dungeon.game.Point point13 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id14 = null;
    explorationStatistics6.addVisit(point13, id14);
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics16 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point17 = null;
    org.mafagafogigante.dungeon.game.Id id18 = null;
    explorationStatistics16.createEntryIfNotExists(point17, id18);
    org.mafagafogigante.dungeon.game.Point point23 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id24 = null;
    explorationStatistics16.addVisit(point23, id24);
    int i26 = point23.getZ();
    org.mafagafogigante.dungeon.game.Id id27 = null;
    explorationStatistics6.createEntryIfNotExists(point23, id27);
    org.mafagafogigante.dungeon.game.Id id29 = null;
    explorationStatistics2.addVisit(point23, id29);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.game.Location location31 = new org.mafagafogigante.dungeon.game.Location(locationPreset0, world1, point23);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == (-1));

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test160"); }

    boolean b1 = org.mafagafogigante.dungeon.game.Random.roll((double)57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test161"); }

    boolean b1 = org.mafagafogigante.dungeon.util.Percentage.isValidPercentageString("Dead");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test162"); }

    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics0 = new org.mafagafogigante.dungeon.stats.WorldStatistics();
    int i1 = worldStatistics0.getLocationCount();
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str2 = worldStatistics0.getSpawnCounter();
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str3 = worldStatistics0.getSpawnCounter();
    int i4 = worldStatistics0.getLocationCount();
    int i5 = worldStatistics0.getSpawnCount();
    int i6 = worldStatistics0.getSpawnCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test163"); }

    org.mafagafogigante.dungeon.entity.items.ItemPresetFactory[] itemPresetFactory_array0 = new org.mafagafogigante.dungeon.entity.items.ItemPresetFactory[] {  };
    org.mafagafogigante.dungeon.entity.items.ItemFactory itemFactory1 = new org.mafagafogigante.dungeon.entity.items.ItemFactory(itemPresetFactory_array0);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature2 = null;
    org.mafagafogigante.dungeon.date.Date date6 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date10 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i11 = date6.compareTo(date10);
    long long12 = date6.getYear();
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics13 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Id id14 = null;
    int i15 = explorationStatistics13.getMaximumNumberOfVisits(id14);
    org.mafagafogigante.dungeon.game.Id id16 = null;
    int i17 = explorationStatistics13.getVisitedLocations(id16);
    boolean b18 = date6.equals((java.lang.Object)id16);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.items.Item item19 = itemFactory1.makeCorpse(creature2, date6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemPresetFactory_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test164"); }

    org.mafagafogigante.dungeon.util.Percentage percentage1 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b3 = percentage1.equals((java.lang.Object)10.0d);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity4 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage1);
    org.mafagafogigante.dungeon.util.Percentage percentage5 = luminosity4.toPercentage();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity6 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage5);
    java.lang.String str7 = luminosity6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Luminosity of 100.00%"+ "'", str7.equals("Luminosity of 100.00%"));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test165"); }

    org.mafagafogigante.dungeon.date.Date date5 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date9 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i10 = date5.compareTo(date9);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay11 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date5);
    java.lang.String[] str_array17 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table18 = new org.mafagafogigante.dungeon.util.Table(str_array17);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString19 = table18.toColoredStringList();
    org.mafagafogigante.dungeon.game.ColoredString coloredString20 = org.mafagafogigante.dungeon.game.Random.select(list_coloredString19);
    boolean b21 = date5.equals((java.lang.Object)coloredString20);
    java.awt.Color color22 = coloredString20.getColor();
    org.mafagafogigante.dungeon.game.LocationDescription locationDescription23 = new org.mafagafogigante.dungeon.game.LocationDescription('a', color22);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString24 = new org.mafagafogigante.dungeon.game.DungeonString("Evening", color22);
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)dungeonString24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay11 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay11.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(coloredString20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color22);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test166"); }

    org.mafagafogigante.dungeon.date.Date date5 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date9 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i10 = date5.compareTo(date9);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay11 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date5);
    java.lang.String[] str_array17 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table18 = new org.mafagafogigante.dungeon.util.Table(str_array17);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString19 = table18.toColoredStringList();
    org.mafagafogigante.dungeon.game.ColoredString coloredString20 = org.mafagafogigante.dungeon.game.Random.select(list_coloredString19);
    boolean b21 = date5.equals((java.lang.Object)coloredString20);
    java.awt.Color color22 = coloredString20.getColor();
    org.mafagafogigante.dungeon.game.ColoredString coloredString23 = new org.mafagafogigante.dungeon.game.ColoredString("User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 41.5 MiB out of the allocated 154.5 MiB\nOS: Windows 10 (amd64) 10.0", color22);
    org.mafagafogigante.dungeon.game.ColoredString coloredString24 = new org.mafagafogigante.dungeon.game.ColoredString("Up", color22);
    java.lang.String str25 = coloredString24.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay11 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay11.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(coloredString20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "ColoredString{string='Up', color=java.awt.Color[r=192,g=192,b=192]}"+ "'", str25.equals("ColoredString{string='Up', color=java.awt.Color[r=192,g=192,b=192]}"));

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test167"); }

    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics0 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point1 = null;
    org.mafagafogigante.dungeon.game.Id id2 = null;
    explorationStatistics0.createEntryIfNotExists(point1, id2);
    org.mafagafogigante.dungeon.game.Point point7 = new org.mafagafogigante.dungeon.game.Point(10, (int)'a', 0);
    java.lang.String[] str_array10 = new java.lang.String[] { "", "" };
    org.mafagafogigante.dungeon.util.Table table11 = new org.mafagafogigante.dungeon.util.Table(str_array10);
    boolean b12 = point7.equals((java.lang.Object)str_array10);
    org.mafagafogigante.dungeon.game.Id id13 = null;
    explorationStatistics0.addVisit(point7, id13);
    org.mafagafogigante.dungeon.game.Point point18 = new org.mafagafogigante.dungeon.game.Point(100, 10, (int)(byte)10);
    boolean b19 = explorationStatistics0.hasBeenSeen(point18);
    org.mafagafogigante.dungeon.game.Id id20 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i21 = explorationStatistics0.getKillCount(id20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test168"); }

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
    int i27 = weaponComponent26.getDamage();
    int i28 = weaponComponent26.getIntegrityDecrementOnHit();
    int i29 = weaponComponent26.getIntegrityDecrementOnHit();
    
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
    org.junit.Assert.assertTrue(i27 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test169"); }

    org.mafagafogigante.dungeon.game.DungeonString dungeonString1 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString1.append(str_array6);
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications8 = null;
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)dungeonString1, writingSpecifications8);
    java.awt.Color color10 = null;
    dungeonString1.setColor(color10);
    org.mafagafogigante.dungeon.date.Date date15 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date19 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i20 = date15.compareTo(date19);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay21 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date15);
    java.lang.String[] str_array27 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table28 = new org.mafagafogigante.dungeon.util.Table(str_array27);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString29 = table28.toColoredStringList();
    org.mafagafogigante.dungeon.game.ColoredString coloredString30 = org.mafagafogigante.dungeon.game.Random.select(list_coloredString29);
    boolean b31 = date15.equals((java.lang.Object)coloredString30);
    java.awt.Color color32 = coloredString30.getColor();
    dungeonString1.setColor(color32);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString34 = dungeonString1.toColoredStringList();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay21 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay21.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(coloredString30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString34);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test170"); }

    org.mafagafogigante.dungeon.entity.items.ItemUsageEffect itemUsageEffect1 = new org.mafagafogigante.dungeon.entity.items.ItemUsageEffect(152);
    int i2 = itemUsageEffect1.getHealing();
    int i3 = itemUsageEffect1.getHealing();
    int i4 = itemUsageEffect1.getHealing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 152);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 152);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 152);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test171"); }

    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications2 = new org.mafagafogigante.dungeon.gui.WritingSpecifications(false, 3600);

  }

//  @Test
//  public void test172() throws Throwable {
//
//    if (debug) { System.out.format("%n%s%n","RegressionTest1.test172"); }
//
//    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
//    org.mafagafogigante.dungeon.game.Id id1 = null;
//    creaturePreset0.setWeaponId(id1);
//    creaturePreset0.setAttack(57);
//    org.mafagafogigante.dungeon.entity.Luminosity luminosity5 = creaturePreset0.getLuminosity();
//    int i6 = creaturePreset0.getInventoryItemLimit();
//    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset7 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
//    org.mafagafogigante.dungeon.game.Id id8 = null;
//    creaturePreset7.setWeaponId(id8);
//    creaturePreset7.setAttack(57);
//    org.mafagafogigante.dungeon.entity.Luminosity luminosity12 = creaturePreset7.getLuminosity();
//    creaturePreset7.setInventoryItemLimit(57);
//    org.mafagafogigante.dungeon.entity.creatures.Drop[] drop_array15 = new org.mafagafogigante.dungeon.entity.creatures.Drop[] {  };
//    java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop> arraylist_drop16 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop>();
//    boolean b17 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop16, drop_array15);
//    creaturePreset7.setDropList((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop16);
//    creaturePreset0.setDropList((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop16);
//    java.util.List<org.mafagafogigante.dungeon.entity.creatures.Drop> list_drop20 = creaturePreset0.getDropList();
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNotNull(luminosity5);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertTrue(i6 == 0);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNotNull(luminosity12);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNotNull(drop_array15);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertTrue(b17 == false);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNotNull(list_drop20);
//
//  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test173"); }

    org.mafagafogigante.dungeon.io.Writer.write("Slightly Damaged");

  }

//  @Test
//  public void test174() throws Throwable {
//
//    if (debug) { System.out.format("%n%s%n","RegressionTest1.test174"); }
//
//    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
//    org.mafagafogigante.dungeon.game.Id id1 = null;
//    creaturePreset0.setWeaponId(id1);
//    creaturePreset0.setAttack(57);
//    org.mafagafogigante.dungeon.entity.Luminosity luminosity5 = creaturePreset0.getLuminosity();
//    creaturePreset0.setInventoryItemLimit(57);
//    org.mafagafogigante.dungeon.game.Id id8 = creaturePreset0.getId();
//    creaturePreset0.setType("Noon");
//    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset11 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
//    org.mafagafogigante.dungeon.game.Id id12 = null;
//    creaturePreset11.setWeaponId(id12);
//    org.mafagafogigante.dungeon.game.Id id14 = creaturePreset11.getId();
//    org.mafagafogigante.dungeon.entity.Luminosity luminosity15 = creaturePreset11.getLuminosity();
//    org.mafagafogigante.dungeon.entity.creatures.Drop[] drop_array16 = new org.mafagafogigante.dungeon.entity.creatures.Drop[] {  };
//    java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop> arraylist_drop17 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop>();
//    boolean b18 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop17, drop_array16);
//    creaturePreset11.setDropList((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop17);
//    creaturePreset0.setDropList((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop17);
//    creaturePreset0.setInventoryWeightLimit((double)(byte)1);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNotNull(luminosity5);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNull(id8);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNull(id14);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNotNull(luminosity15);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNotNull(drop_array16);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertTrue(b18 == false);
//
//  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test175"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] creaturePresetFactory_array0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] {  };
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory1 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array0);
    org.mafagafogigante.dungeon.game.Id id2 = null;
    org.mafagafogigante.dungeon.game.World world3 = null;
    org.mafagafogigante.dungeon.entity.creatures.Creature creature4 = creatureFactory1.makeCreature(id2, world3);
    org.mafagafogigante.dungeon.date.Date date8 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date12 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i13 = date8.compareTo(date12);
    long long14 = date12.getDay();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay15 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    int i16 = org.mafagafogigante.dungeon.game.PartOfDay.getSecondsToNext(date12, partOfDay15);
    long long17 = date12.getYear();
    org.mafagafogigante.dungeon.date.Date date21 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date25 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i26 = date21.compareTo(date25);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay27 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date21);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay28 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date21);
    int i29 = org.mafagafogigante.dungeon.game.PartOfDay.getSecondsToNext(date12, partOfDay28);
    long long30 = date12.getMonth();
    org.mafagafogigante.dungeon.game.World world31 = null;
    org.mafagafogigante.dungeon.stats.Statistics statistics32 = new org.mafagafogigante.dungeon.stats.Statistics();
    statistics32.writeStatistics();
    statistics32.writeStatistics();
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker35 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics32);
    statistics32.writeStatistics();
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.creatures.Hero hero37 = creatureFactory1.makeHero(date12, world31, statistics32);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creaturePresetFactory_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(creature4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 10L);
    org.junit.Assert.assertTrue("'" + partOfDay15 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay15.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay27 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay27.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    org.junit.Assert.assertTrue("'" + partOfDay28 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay28.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 82800);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long30 == 10L);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test176"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature1 = null;
    org.mafagafogigante.dungeon.entity.creatures.CreatureHealth creatureHealth2 = org.mafagafogigante.dungeon.entity.creatures.CreatureHealth.makeCreatureHealth(100, creature1);
    int i3 = creatureHealth2.getMaximum();
    boolean b4 = creatureHealth2.isDead();
    java.lang.String str5 = creatureHealth2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creatureHealth2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "CreatureHealth{integrity=100/100}"+ "'", str5.equals("CreatureHealth{integrity=100/100}"));

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test177"); }

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
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics18 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point19 = null;
    org.mafagafogigante.dungeon.game.Id id20 = null;
    explorationStatistics18.createEntryIfNotExists(point19, id20);
    org.mafagafogigante.dungeon.game.Point point25 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id26 = null;
    explorationStatistics18.addVisit(point25, id26);
    boolean b28 = explorationStatistics17.hasBeenSeen(point25);
    org.mafagafogigante.dungeon.game.Point point32 = new org.mafagafogigante.dungeon.game.Point(10, (int)'a', 0);
    int i33 = point32.getY();
    org.mafagafogigante.dungeon.game.Id id34 = null;
    explorationStatistics17.addVisit(point32, id34);
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics36 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point37 = null;
    org.mafagafogigante.dungeon.game.Id id38 = null;
    explorationStatistics36.createEntryIfNotExists(point37, id38);
    org.mafagafogigante.dungeon.game.Point point43 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id44 = null;
    explorationStatistics36.addVisit(point43, id44);
    boolean b46 = explorationStatistics17.hasBeenSeen(point43);
    org.mafagafogigante.dungeon.game.Id id47 = null;
    explorationStatistics0.createEntryIfNotExists(point43, id47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test178"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.game.Id id1 = new org.mafagafogigante.dungeon.game.Id("97 B");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test179"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule0 = null;
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule1 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeVariableArrayRule(jsonRule0);
    org.mafagafogigante.dungeon.schema.JsonRule[] jsonRule_array2 = new org.mafagafogigante.dungeon.schema.JsonRule[] { jsonRule0 };
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule3 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeGroupRule(jsonRule_array2);
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule4 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeOptionalRule(jsonRule3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule4);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test180"); }

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
    int i16 = creaturePreset0.getHealth();
    org.mafagafogigante.dungeon.game.Name name17 = creaturePreset0.getName();
    org.mafagafogigante.dungeon.game.Name name18 = creaturePreset0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(id_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(name17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(name18);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test181"); }

    org.mafagafogigante.dungeon.commands.IssuedCommand issuedCommand1 = new org.mafagafogigante.dungeon.commands.IssuedCommand("a few Nights");
    java.lang.String str2 = issuedCommand1.getStringRepresentation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a few Nights"+ "'", str2.equals("a few Nights"));

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test182"); }

    org.mafagafogigante.dungeon.game.DungeonString dungeonString1 = new org.mafagafogigante.dungeon.game.DungeonString("DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}");
    dungeonString1.resetColor();
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString3 = dungeonString1.toColoredStringList();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString3);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test183"); }

    org.mafagafogigante.dungeon.util.Percentage percentage1 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b3 = percentage1.equals((java.lang.Object)10.0d);
    double d4 = percentage1.toDouble();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity5 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage1);
    org.mafagafogigante.dungeon.entity.Visibility visibility6 = new org.mafagafogigante.dungeon.entity.Visibility(percentage1);
    java.lang.String str7 = visibility6.toString();
    org.mafagafogigante.dungeon.util.Percentage percentage9 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b11 = percentage9.equals((java.lang.Object)10.0d);
    double d12 = percentage9.toDouble();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity13 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage9);
    boolean b14 = visibility6.visibleUnder(luminosity13);
    org.mafagafogigante.dungeon.world.LuminosityVisibilityCriterion luminosityVisibilityCriterion15 = new org.mafagafogigante.dungeon.world.LuminosityVisibilityCriterion(luminosity13);
    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array16 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria17 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array16);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature18 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer19 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature18);
    boolean b20 = visibilityCriteria17.isMetBy(observer19);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array21 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item22 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item22, item_array21);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString25 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array30 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString25.append(str_array30);
    observer19.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item22, dungeonString25);
    org.mafagafogigante.dungeon.entity.creatures.Creature[] creature_array33 = new org.mafagafogigante.dungeon.entity.creatures.Creature[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Creature> arraylist_creature34 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Creature>();
    boolean b35 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.Creature>)arraylist_creature34, creature_array33);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString37 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array42 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString37.append(str_array42);
    java.lang.String str44 = dungeonString37.toString();
    org.mafagafogigante.dungeon.game.Point point48 = new org.mafagafogigante.dungeon.game.Point(10, (int)'a', 0);
    java.lang.String[] str_array51 = new java.lang.String[] { "", "" };
    org.mafagafogigante.dungeon.util.Table table52 = new org.mafagafogigante.dungeon.util.Table(str_array51);
    boolean b53 = point48.equals((java.lang.Object)str_array51);
    dungeonString37.append(str_array51);
    observer19.writeCreatureSight((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Creature>)arraylist_creature34, dungeonString37);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array56 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item57 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b58 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item57, item_array56);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString60 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array65 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString60.append(str_array65);
    java.lang.String str67 = dungeonString60.toString();
    org.mafagafogigante.dungeon.game.Point point71 = new org.mafagafogigante.dungeon.game.Point(10, (int)'a', 0);
    java.lang.String[] str_array74 = new java.lang.String[] { "", "" };
    org.mafagafogigante.dungeon.util.Table table75 = new org.mafagafogigante.dungeon.util.Table(str_array74);
    boolean b76 = point71.equals((java.lang.Object)str_array74);
    dungeonString60.append(str_array74);
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item78 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item57, str_array74);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString80 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array85 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString80.append(str_array85);
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications87 = null;
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)dungeonString80, writingSpecifications87);
    observer19.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item57, dungeonString80);
    // The following exception was thrown during execution in test generation
    try {
    boolean b90 = luminosityVisibilityCriterion15.isMetBy(observer19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Visibility of 100.00%"+ "'", str7.equals("Visibility of 100.00%"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creature_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"+ "'", str44.equals("DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str67 + "' != '" + "DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"+ "'", str67.equals("DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array85);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test184"); }

    org.mafagafogigante.dungeon.util.CircularList<java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>> circularlist_comparable_weight1 = new org.mafagafogigante.dungeon.util.CircularList<java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>>(100);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature2 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory5 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature2, (-1), 0.0d);
    org.mafagafogigante.dungeon.entity.Weight weight6 = creatureInventory5.getWeight();
    circularlist_comparable_weight1.add((java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>)weight6);
    org.mafagafogigante.dungeon.entity.Weight weight9 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    org.mafagafogigante.dungeon.entity.Weight weight10 = org.mafagafogigante.dungeon.entity.Weight.ZERO;
    org.mafagafogigante.dungeon.entity.Weight weight11 = weight9.add(weight10);
    circularlist_comparable_weight1.add((java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>)weight11);
    int i13 = circularlist_comparable_weight1.size();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight> comparable_weight15 = circularlist_comparable_weight1.get((int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 2);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test185"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, 0, (double)35);
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item4 = creatureInventory3.getItems();
    creatureInventory3.refreshItems();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item4);

  }

//  @Test
//  public void test186() throws Throwable {
//
//    if (debug) { System.out.format("%n%s%n","RegressionTest1.test186"); }
//
//    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
//    org.mafagafogigante.dungeon.game.Id id1 = null;
//    creaturePreset0.setWeaponId(id1);
//    org.mafagafogigante.dungeon.game.Id id3 = creaturePreset0.getId();
//    org.mafagafogigante.dungeon.entity.Luminosity luminosity4 = creaturePreset0.getLuminosity();
//    org.mafagafogigante.dungeon.entity.creatures.Drop[] drop_array5 = new org.mafagafogigante.dungeon.entity.creatures.Drop[] {  };
//    java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop> arraylist_drop6 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop>();
//    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop6, drop_array5);
//    creaturePreset0.setDropList((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop6);
//    org.mafagafogigante.dungeon.game.PartOfDay partOfDay9 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
//    org.mafagafogigante.dungeon.entity.Luminosity luminosity10 = partOfDay9.getLuminosity();
//    org.mafagafogigante.dungeon.game.Name name11 = partOfDay9.getName();
//    java.lang.String str13 = name11.getQuantifiedName((int)'a');
//    java.lang.String str14 = name11.getPlural();
//    creaturePreset0.setName(name11);
//    java.util.List<org.mafagafogigante.dungeon.game.Id> list_id16 = creaturePreset0.getItems();
//    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset17 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
//    org.mafagafogigante.dungeon.game.Id id18 = null;
//    creaturePreset17.setWeaponId(id18);
//    creaturePreset17.setAttack(57);
//    org.mafagafogigante.dungeon.entity.Luminosity luminosity22 = creaturePreset17.getLuminosity();
//    creaturePreset17.setInventoryItemLimit(57);
//    org.mafagafogigante.dungeon.entity.creatures.Creature.Tag tag25 = org.mafagafogigante.dungeon.entity.creatures.Creature.Tag.CORPSE;
//    boolean b26 = creaturePreset17.hasTag(tag25);
//    boolean b27 = creaturePreset0.hasTag(tag25);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNull(id3);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNotNull(luminosity4);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNotNull(drop_array5);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertTrue(b7 == false);
//    org.junit.Assert.assertTrue("'" + partOfDay9 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay9.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNotNull(luminosity10);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNotNull(name11);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "a few Nights"+ "'", str13.equals("a few Nights"));
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Nights"+ "'", str14.equals("Nights"));
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNull(list_id16);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNotNull(luminosity22);
//    org.junit.Assert.assertTrue("'" + tag25 + "' != '" + org.mafagafogigante.dungeon.entity.creatures.Creature.Tag.CORPSE + "'", tag25.equals(org.mafagafogigante.dungeon.entity.creatures.Creature.Tag.CORPSE));
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertTrue(b26 == false);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertTrue(b27 == false);
//
//  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test187"); }

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
    org.mafagafogigante.dungeon.util.Percentage percentage19 = itemPreset0.getVisibility();
    int i20 = itemPreset0.getDrinkableDoses();
    itemPreset0.setPutrefactionPeriod((long)(byte)-1);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test188"); }

    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics0 = new org.mafagafogigante.dungeon.stats.BattleStatistics();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement1 = null;
    boolean b2 = battleStatistics0.satisfies(battleStatisticsRequirement1);
    java.lang.String str3 = battleStatistics0.toString();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery4 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement6 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement(battleStatisticsQuery4, (int)(byte)100);
    boolean b7 = battleStatistics0.satisfies(battleStatisticsRequirement6);
    org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.CauseOfDeath> countermap_causeOfDeath8 = battleStatistics0.getKillsByCauseOfDeath();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery9 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement11 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement(battleStatisticsQuery9, (int)(byte)100);
    int i12 = battleStatisticsRequirement11.getCount();
    int i13 = battleStatisticsRequirement11.getCount();
    int i14 = battleStatisticsRequirement11.getCount();
    boolean b15 = battleStatistics0.satisfies(battleStatisticsRequirement11);
    int i16 = battleStatisticsRequirement11.getCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "BattleStatistics{records=CounterMap{map={}}}"+ "'", str3.equals("BattleStatistics{records=CounterMap{map={}}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_causeOfDeath8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 100);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test189"); }

    org.mafagafogigante.dungeon.game.PartOfDay partOfDay0 = org.mafagafogigante.dungeon.game.PartOfDay.DUSK;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity1 = partOfDay0.getLuminosity();
    org.junit.Assert.assertTrue("'" + partOfDay0 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.DUSK + "'", partOfDay0.equals(org.mafagafogigante.dungeon.game.PartOfDay.DUSK));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity1);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test190"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    creaturePreset0.setAttack(57);
    org.mafagafogigante.dungeon.util.CounterMap<java.util.RandomAccess> countermap_randomAccess5 = new org.mafagafogigante.dungeon.util.CounterMap<java.util.RandomAccess>();
    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset6 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id7 = null;
    creaturePreset6.setWeaponId(id7);
    creaturePreset6.setAttack(57);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity11 = creaturePreset6.getLuminosity();
    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset12 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id13 = null;
    creaturePreset12.setWeaponId(id13);
    creaturePreset12.setAttack(57);
    org.mafagafogigante.dungeon.game.Id[] id_array17 = new org.mafagafogigante.dungeon.game.Id[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.game.Id> arraylist_id18 = new java.util.ArrayList<org.mafagafogigante.dungeon.game.Id>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.game.Id>)arraylist_id18, id_array17);
    creaturePreset12.setItems((java.util.List<org.mafagafogigante.dungeon.game.Id>)arraylist_id18);
    creaturePreset6.setItems((java.util.List<org.mafagafogigante.dungeon.game.Id>)arraylist_id18);
    countermap_randomAccess5.incrementCounter((java.util.RandomAccess)arraylist_id18, (java.lang.Integer)10);
    creaturePreset0.setItems((java.util.List<org.mafagafogigante.dungeon.game.Id>)arraylist_id18);
    java.lang.String str25 = creaturePreset0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(id_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test191"); }

    org.mafagafogigante.dungeon.entity.items.FoodComponent foodComponent2 = new org.mafagafogigante.dungeon.entity.items.FoodComponent((int)(short)0, 0);
    int i3 = foodComponent2.getIntegrityDecrementOnEat();
    int i4 = foodComponent2.getNutrition();
    int i5 = foodComponent2.getIntegrityDecrementOnEat();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test192"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset4 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    itemPreset4.setDrinkableHealing((int)(short)0);
    org.mafagafogigante.dungeon.util.Percentage percentage8 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset4.setVisibility(percentage8);
    double d10 = org.mafagafogigante.dungeon.util.DungeonMath.weightedAverage((double)10.0f, 100.0d, percentage8);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset11 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity12 = itemPreset11.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity13 = null;
    itemPreset11.setIntegrity(integrity13);
    org.mafagafogigante.dungeon.util.Percentage percentage15 = itemPreset11.getVisibility();
    java.lang.String str16 = itemPreset11.getType();
    org.mafagafogigante.dungeon.entity.items.Item.Tag tag17 = org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE;
    itemPreset11.addTag(tag17);
    org.mafagafogigante.dungeon.util.Percentage percentage20 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b22 = percentage20.equals((java.lang.Object)10.0d);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity23 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage20);
    itemPreset11.setVisibility(percentage20);
    boolean b25 = percentage8.biggerThanOrEqualTo(percentage20);
    java.lang.String str26 = percentage20.toString();
    double d27 = org.mafagafogigante.dungeon.util.DungeonMath.weightedAverage((double)22041, 17518.0d, percentage20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    org.junit.Assert.assertTrue("'" + tag17 + "' != '" + org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE + "'", tag17.equals(org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "100.00%"+ "'", str26.equals("100.00%"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d27 == 17518.0d);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test193"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.util.Percentage percentage1 = org.mafagafogigante.dungeon.util.Percentage.fromString("ColoredString{string='Unarmed : UNARMED', color=java.awt.Color[r=192,g=192,b=192]}");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test194"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    creaturePreset0.setAttack(57);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity5 = creaturePreset0.getLuminosity();
    java.lang.String str6 = creaturePreset0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test195"); }

    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics0 = new org.mafagafogigante.dungeon.stats.WorldStatistics();
    int i1 = worldStatistics0.getLocationCount();
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str2 = worldStatistics0.getSpawnCounter();
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str3 = worldStatistics0.getSpawnCounter();
    int i4 = worldStatistics0.getLocationCount();
    worldStatistics0.addLocation("");
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str7 = worldStatistics0.getSpawnCounter();
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str8 = worldStatistics0.getLocationCounter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str8);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test196"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    java.lang.String str5 = itemPreset0.getType();
    itemPreset0.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage9 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset0.setVisibility(percentage9);
    itemPreset0.setType("visibilityCriteria=VisibilityCriteria{[]}");
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset13 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity14 = itemPreset13.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity15 = null;
    itemPreset13.setIntegrity(integrity15);
    org.mafagafogigante.dungeon.util.Percentage percentage17 = itemPreset13.getVisibility();
    java.lang.String str18 = itemPreset13.getType();
    itemPreset13.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.entity.TagSet<org.mafagafogigante.dungeon.entity.items.Item.Tag> tagset_tag21 = itemPreset13.getTagSet();
    org.mafagafogigante.dungeon.entity.Weight weight23 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    itemPreset13.setWeight(weight23);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset25 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity26 = itemPreset25.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity27 = null;
    itemPreset25.setIntegrity(integrity27);
    org.mafagafogigante.dungeon.util.Percentage percentage30 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    itemPreset25.setHitRate(percentage30);
    itemPreset13.setHitRate(percentage30);
    org.mafagafogigante.dungeon.entity.Integrity integrity35 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    java.lang.String str36 = integrity35.toString();
    java.lang.String str37 = integrity35.toString();
    boolean b38 = integrity35.isMaximum();
    int i39 = integrity35.getMaximum();
    java.lang.String str40 = integrity35.toString();
    itemPreset13.setIntegrity(integrity35);
    itemPreset0.setIntegrity(integrity35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tagset_tag21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "0/1"+ "'", str36.equals("0/1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "0/1"+ "'", str37.equals("0/1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "0/1"+ "'", str40.equals("0/1"));

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test197"); }

    org.mafagafogigante.dungeon.entity.Weight weight1 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    org.mafagafogigante.dungeon.entity.Weight weight2 = org.mafagafogigante.dungeon.entity.Weight.ZERO;
    org.mafagafogigante.dungeon.entity.Weight weight3 = weight1.add(weight2);
    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics4 = new org.mafagafogigante.dungeon.stats.BattleStatistics();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement5 = null;
    boolean b6 = battleStatistics4.satisfies(battleStatisticsRequirement5);
    java.lang.String str7 = battleStatistics4.toString();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery8 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement10 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement(battleStatisticsQuery8, (int)(byte)100);
    boolean b11 = battleStatistics4.satisfies(battleStatisticsRequirement10);
    org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.CauseOfDeath> countermap_causeOfDeath12 = battleStatistics4.getKillsByCauseOfDeath();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery13 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement15 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement(battleStatisticsQuery13, (int)(byte)100);
    int i16 = battleStatisticsRequirement15.getCount();
    java.lang.String str17 = battleStatisticsRequirement15.toString();
    boolean b18 = battleStatistics4.satisfies(battleStatisticsRequirement15);
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery19 = battleStatisticsRequirement15.getQuery();
    boolean b20 = weight3.equals((java.lang.Object)battleStatisticsRequirement15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "BattleStatistics{records=CounterMap{map={}}}"+ "'", str7.equals("BattleStatistics{records=CounterMap{map={}}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_causeOfDeath12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "BattleStatisticsRequirement{query=BattleStatisticsQuery{id=null, type='null', causeOfDeath=null, partOfDay=null}, count=100}"+ "'", str17.equals("BattleStatisticsRequirement{query=BattleStatisticsQuery{id=null, type='null', causeOfDeath=null, partOfDay=null}, count=100}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(battleStatisticsQuery19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test198"); }

    org.mafagafogigante.dungeon.game.Id id0 = null;
    org.mafagafogigante.dungeon.entity.items.BookComponent bookComponent2 = new org.mafagafogigante.dungeon.entity.items.BookComponent(id0, "0/1");
    org.mafagafogigante.dungeon.game.Id id3 = bookComponent2.getSpellId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id3);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test199"); }

    org.mafagafogigante.dungeon.util.Messenger.printFailedToCreateDirectoryMessage("0 B");

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test200"); }

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
    int i27 = weaponComponent26.getDamage();
    int i28 = weaponComponent26.getDamage();
    
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
    org.junit.Assert.assertTrue(i27 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 10);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test201"); }

    // The following exception was thrown during execution in test generation
    try {
    boolean b1 = org.mafagafogigante.dungeon.util.Percentage.isValidPercentageString("");
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test202"); }

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
    org.mafagafogigante.dungeon.entity.Integrity integrity22 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    java.lang.String str23 = integrity22.toString();
    java.lang.String str24 = integrity22.toString();
    boolean b25 = integrity22.isMaximum();
    int i26 = integrity22.getMaximum();
    java.lang.String str27 = integrity22.toString();
    itemPreset0.setIntegrity(integrity22);
    long long29 = itemPreset0.getPutrefactionPeriod();
    
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
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "0/1"+ "'", str23.equals("0/1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "0/1"+ "'", str24.equals("0/1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "0/1"+ "'", str27.equals("0/1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long29 == 0L);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test203"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset2 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity3 = itemPreset2.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity4 = null;
    itemPreset2.setIntegrity(integrity4);
    org.mafagafogigante.dungeon.util.Percentage percentage6 = itemPreset2.getVisibility();
    java.lang.String str7 = itemPreset2.getType();
    itemPreset2.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.entity.TagSet<org.mafagafogigante.dungeon.entity.items.Item.Tag> tagset_tag10 = itemPreset2.getTagSet();
    org.mafagafogigante.dungeon.entity.Integrity integrity13 = new org.mafagafogigante.dungeon.entity.Integrity((int)(byte)1, (int)(byte)0);
    itemPreset2.setIntegrity(integrity13);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay15 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity16 = partOfDay15.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name17 = partOfDay15.getName();
    java.lang.String str19 = name17.getQuantifiedName((int)'a');
    java.lang.String str20 = name17.getSingular();
    java.lang.String str21 = name17.toString();
    java.lang.String str23 = name17.getQuantifiedName((int)(short)10);
    java.lang.String str24 = name17.getSingular();
    itemPreset2.setName(name17);
    org.mafagafogigante.dungeon.util.Percentage percentage27 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b29 = percentage27.equals((java.lang.Object)10.0d);
    double d30 = percentage27.toDouble();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity31 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage27);
    org.mafagafogigante.dungeon.entity.Visibility visibility32 = new org.mafagafogigante.dungeon.entity.Visibility(percentage27);
    org.mafagafogigante.dungeon.util.Percentage percentage33 = visibility32.toPercentage();
    itemPreset2.setVisibility(percentage33);
    double d35 = org.mafagafogigante.dungeon.util.DungeonMath.weightedAverage((double)(short)1, (double)28, percentage33);
    boolean b36 = org.mafagafogigante.dungeon.game.Random.roll(percentage33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tagset_tag10);
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
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "a few Nights"+ "'", str23.equals("a few Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Night"+ "'", str24.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d30 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d35 == 28.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test204"); }

    org.mafagafogigante.dungeon.date.Date date0 = null;
    org.mafagafogigante.dungeon.world.Weather weather1 = new org.mafagafogigante.dungeon.world.Weather(date0);
    org.mafagafogigante.dungeon.date.Date date5 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date9 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i10 = date5.compareTo(date9);
    long long11 = date9.getDay();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay12 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    int i13 = org.mafagafogigante.dungeon.game.PartOfDay.getSecondsToNext(date9, partOfDay12);
    long long14 = date9.getYear();
    long long15 = date9.getHour();
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.world.WeatherCondition weatherCondition16 = weather1.getCurrentCondition(date9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 10L);
    org.junit.Assert.assertTrue("'" + partOfDay12 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay12.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 0L);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test205"); }

    // The following exception was thrown during execution in test generation
    try {
    int i2 = org.mafagafogigante.dungeon.game.Random.nextInteger(1, (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test206"); }

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
    java.lang.String str16 = itemPreset0.getText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test207"); }

    org.mafagafogigante.dungeon.util.Percentage percentage1 = new org.mafagafogigante.dungeon.util.Percentage((double)100);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset2 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity3 = itemPreset2.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity4 = null;
    itemPreset2.setIntegrity(integrity4);
    org.mafagafogigante.dungeon.util.Percentage percentage6 = itemPreset2.getVisibility();
    java.lang.String str7 = itemPreset2.getType();
    itemPreset2.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage11 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset2.setVisibility(percentage11);
    boolean b13 = org.mafagafogigante.dungeon.game.Random.roll(percentage11);
    int i14 = percentage1.compareTo(percentage11);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity15 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage1);
    java.lang.String str16 = percentage1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "100.00%"+ "'", str16.equals("100.00%"));

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test208"); }

    org.mafagafogigante.dungeon.game.PartOfDay partOfDay0 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity1 = partOfDay0.getLuminosity();
    org.mafagafogigante.dungeon.world.LuminosityVisibilityCriterion luminosityVisibilityCriterion2 = new org.mafagafogigante.dungeon.world.LuminosityVisibilityCriterion(luminosity1);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature3 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer4 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature3);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array5 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item6 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item6, item_array5);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString9 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString9.append(str_array14);
    observer4.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item6, dungeonString9);
    // The following exception was thrown during execution in test generation
    try {
    boolean b17 = luminosityVisibilityCriterion2.isMetBy(observer4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + partOfDay0 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay0.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test209"); }

    org.mafagafogigante.dungeon.logging.DungeonLogger.fine("East");

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test210"); }

    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath0 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
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
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset17 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity18 = itemPreset17.getIntegrity();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity19 = itemPreset17.getLuminosity();
    org.mafagafogigante.dungeon.util.Percentage percentage21 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset17.setVisibility(percentage21);
    creaturePreset1.setVisibility(percentage21);
    java.lang.String str24 = creaturePreset1.getType();
    boolean b25 = causeOfDeath0.equals((java.lang.Object)creaturePreset1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(id_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test211"); }

    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances0 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.Direction direction1 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b3 = direction1.equalsIgnoreCase("Damaged");
    java.lang.String str4 = direction1.toString();
    java.lang.String str5 = direction1.toString();
    boolean b6 = blockedEntrances0.isBlocked(direction1);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances7 = new org.mafagafogigante.dungeon.game.BlockedEntrances(blockedEntrances0);
    org.junit.Assert.assertTrue("'" + direction1 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction1.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "East"+ "'", str4.equals("East"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "East"+ "'", str5.equals("East"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test212"); }

    org.mafagafogigante.dungeon.game.PartOfDay partOfDay0 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity1 = partOfDay0.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name2 = partOfDay0.getName();
    org.mafagafogigante.dungeon.game.QuantificationMode quantificationMode4 = org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER;
    java.lang.String str5 = name2.getQuantifiedName((int)'4', quantificationMode4);
    java.lang.String str7 = name2.getQuantifiedName(3600);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset9 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity10 = itemPreset9.getIntegrity();
    org.mafagafogigante.dungeon.util.Percentage percentage11 = itemPreset9.getVisibility();
    java.lang.String str12 = itemPreset9.getType();
    itemPreset9.setDrinkableHealing(10);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay15 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity16 = partOfDay15.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name17 = partOfDay15.getName();
    java.lang.String str19 = name17.getQuantifiedName((int)'a');
    java.lang.String str20 = name17.getSingular();
    java.lang.String str21 = name17.toString();
    java.lang.String str22 = name17.getSingular();
    itemPreset9.setName(name17);
    org.mafagafogigante.dungeon.game.QuantificationMode quantificationMode25 = org.mafagafogigante.dungeon.game.QuantificationMode.WORD;
    java.lang.String str26 = name17.getQuantifiedName(81, quantificationMode25);
    java.lang.String str27 = name2.getQuantifiedName((int)(short)1, quantificationMode25);
    org.junit.Assert.assertTrue("'" + partOfDay0 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay0.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name2);
    org.junit.Assert.assertTrue("'" + quantificationMode4 + "' != '" + org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER + "'", quantificationMode4.equals(org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "52 Nights"+ "'", str5.equals("52 Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "a few Nights"+ "'", str7.equals("a few Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
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
    org.junit.Assert.assertTrue("'" + quantificationMode25 + "' != '" + org.mafagafogigante.dungeon.game.QuantificationMode.WORD + "'", quantificationMode25.equals(org.mafagafogigante.dungeon.game.QuantificationMode.WORD));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "a few Nights"+ "'", str26.equals("a few Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "one Night"+ "'", str27.equals("one Night"));

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test213"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, (-1), 0.0d);
    org.mafagafogigante.dungeon.entity.Weight weight4 = creatureInventory3.getWeight();
    int i5 = creatureInventory3.getItemCount();
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item6 = creatureInventory3.getItems();
    org.mafagafogigante.dungeon.entity.Weight weight7 = creatureInventory3.getWeight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight7);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test214"); }

    org.mafagafogigante.dungeon.game.Point point3 = new org.mafagafogigante.dungeon.game.Point(82800, 5, (int)(byte)-1);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test215"); }

    java.awt.Color color1 = null;
    org.mafagafogigante.dungeon.game.ColoredString coloredString2 = new org.mafagafogigante.dungeon.game.ColoredString("", color1);
    java.lang.String str3 = coloredString2.getString();
    java.awt.Color color4 = coloredString2.getColor();
    java.lang.String str5 = coloredString2.getString();
    java.lang.String str6 = coloredString2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(color4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ColoredString{string='', color=null}"+ "'", str6.equals("ColoredString{string='', color=null}"));

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test216"); }

    boolean b1 = org.mafagafogigante.dungeon.util.Percentage.isValidPercentageString("ColoredString{string='', color=null}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test217"); }

    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery0 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    battleStatisticsQuery0.setType("Damaged");
    battleStatisticsQuery0.setType("");
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset5 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity6 = itemPreset5.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity7 = null;
    itemPreset5.setIntegrity(integrity7);
    org.mafagafogigante.dungeon.util.Percentage percentage9 = itemPreset5.getVisibility();
    java.lang.String str10 = itemPreset5.getType();
    itemPreset5.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage14 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset5.setVisibility(percentage14);
    boolean b16 = org.mafagafogigante.dungeon.game.Random.roll(percentage14);
    boolean b17 = battleStatisticsQuery0.equals((java.lang.Object)b16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test218"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.util.Percentage percentage1 = org.mafagafogigante.dungeon.util.Percentage.fromString("Unarmed");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test219"); }

    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery0 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    battleStatisticsQuery0.setType("Damaged");
    battleStatisticsQuery0.setType("");
    org.mafagafogigante.dungeon.date.Date date8 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date12 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i13 = date8.compareTo(date12);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay14 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date8);
    battleStatisticsQuery0.setPartOfDay(partOfDay14);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity16 = partOfDay14.getLuminosity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay14 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay14.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity16);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test220"); }

    org.mafagafogigante.dungeon.commands.IssuedCommand issuedCommand1 = new org.mafagafogigante.dungeon.commands.IssuedCommand("BattleStatistics{records=CounterMap{map={}}}");
    org.mafagafogigante.dungeon.commands.PreparedIssuedCommand preparedIssuedCommand2 = org.mafagafogigante.dungeon.commands.IssuedCommandProcessor.prepareIssuedCommand(issuedCommand1);
    java.lang.String str3 = issuedCommand1.getStringRepresentation();
    java.lang.String str4 = issuedCommand1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(preparedIssuedCommand2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "BattleStatistics{records=CounterMap{map={}}}"+ "'", str3.equals("BattleStatistics{records=CounterMap{map={}}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "BattleStatistics{records=CounterMap{map={}}}"+ "'", str4.equals("BattleStatistics{records=CounterMap{map={}}}"));

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test221"); }

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
    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array11 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria12 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array11);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature13 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer14 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature13);
    boolean b15 = visibilityCriteria12.isMetBy(observer14);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array16 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item17 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item17, item_array16);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString20 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    observer14.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item17, dungeonString20);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString23 = new org.mafagafogigante.dungeon.game.DungeonString("");
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString24 = dungeonString23.toColoredStringList();
    observer3.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item17, dungeonString23);
    java.util.List<org.mafagafogigante.dungeon.entity.creatures.Creature> list_creature26 = null;
    org.mafagafogigante.dungeon.game.DungeonString dungeonString28 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array33 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString28.append(str_array33);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString35 = dungeonString28.toColoredStringList();
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString36 = dungeonString28.toColoredStringList();
    // The following exception was thrown during execution in test generation
    try {
    observer3.writeCreatureSight(list_creature26, dungeonString28);
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
    org.junit.Assert.assertNotNull(visibilityCriterion_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString36);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test222"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, (-1), 0.0d);
    org.mafagafogigante.dungeon.entity.Weight weight4 = creatureInventory3.getWeight();
    int i5 = creatureInventory3.getItemCount();
    int i6 = creatureInventory3.getItemCount();
    org.mafagafogigante.dungeon.entity.Weight weight7 = creatureInventory3.getWeightLimit();
    org.mafagafogigante.dungeon.stats.Statistics statistics8 = new org.mafagafogigante.dungeon.stats.Statistics();
    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics9 = statistics8.getBattleStatistics();
    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics10 = statistics8.getWorldStatistics();
    boolean b11 = weight7.equals((java.lang.Object)statistics8);
    java.lang.String str12 = weight7.toString();
    org.mafagafogigante.dungeon.entity.Weight weight14 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    org.mafagafogigante.dungeon.entity.Weight weight15 = org.mafagafogigante.dungeon.entity.Weight.ZERO;
    org.mafagafogigante.dungeon.entity.Weight weight16 = weight14.add(weight15);
    org.mafagafogigante.dungeon.entity.Weight weight18 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)'#');
    org.mafagafogigante.dungeon.entity.Weight weight19 = weight16.add(weight18);
    org.mafagafogigante.dungeon.entity.Weight weight20 = weight7.add(weight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(battleStatistics9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(worldStatistics10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "0 kg"+ "'", str12.equals("0 kg"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight20);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test223"); }

    org.mafagafogigante.dungeon.stats.Statistics statistics0 = new org.mafagafogigante.dungeon.stats.Statistics();
    statistics0.writeStatistics();
    statistics0.writeStatistics();
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker3 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics0);
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker4 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics0);
    org.mafagafogigante.dungeon.achievements.AchievementStore achievementStore5 = null;
    org.mafagafogigante.dungeon.date.Date date6 = null;
    // The following exception was thrown during execution in test generation
    try {
    achievementTracker4.update(achievementStore5, date6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test224"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay3 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity4 = partOfDay3.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name5 = partOfDay3.getName();
    org.mafagafogigante.dungeon.game.QuantificationMode quantificationMode7 = org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER;
    java.lang.String str8 = name5.getQuantifiedName((int)'4', quantificationMode7);
    creaturePreset0.setName(name5);
    int i10 = creaturePreset0.getInventoryItemLimit();
    org.junit.Assert.assertTrue("'" + partOfDay3 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay3.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name5);
    org.junit.Assert.assertTrue("'" + quantificationMode7 + "' != '" + org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER + "'", quantificationMode7.equals(org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "52 Nights"+ "'", str8.equals("52 Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test225"); }

    org.mafagafogigante.dungeon.game.Direction direction0 = org.mafagafogigante.dungeon.game.Direction.EAST;
    java.lang.String str1 = direction0.toString();
    org.mafagafogigante.dungeon.game.Direction direction2 = direction0.invert();
    java.lang.String str3 = direction0.toString();
    org.junit.Assert.assertTrue("'" + direction0 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction0.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "East"+ "'", str1.equals("East"));
    org.junit.Assert.assertTrue("'" + direction2 + "' != '" + org.mafagafogigante.dungeon.game.Direction.WEST + "'", direction2.equals(org.mafagafogigante.dungeon.game.Direction.WEST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "East"+ "'", str3.equals("East"));

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test226"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table6 = new org.mafagafogigante.dungeon.util.Table(str_array5);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString7 = table6.toColoredStringList();
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications8 = null;
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)table6, writingSpecifications8);
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)table6);
    table6.insertSeparator();
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString12 = table6.toColoredStringList();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString12);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test227"); }

    java.lang.String[] str_array0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.achievements.AchievementTrackerWriter.parseCommand(str_array0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test228"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer1 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature0);
    org.mafagafogigante.dungeon.entity.creatures.Creature[] creature_array2 = new org.mafagafogigante.dungeon.entity.creatures.Creature[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Creature> arraylist_creature3 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Creature>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.Creature>)arraylist_creature3, creature_array2);
    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array5 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria6 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array5);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature7 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer8 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature7);
    boolean b9 = visibilityCriteria6.isMetBy(observer8);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array10 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item11 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item11, item_array10);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString14 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array19 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString14.append(str_array19);
    observer8.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item11, dungeonString14);
    java.lang.String str22 = dungeonString14.toString();
    observer1.writeCreatureSight((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Creature>)arraylist_creature3, dungeonString14);
    // The following exception was thrown during execution in test generation
    try {
    observer1.look();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creature_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"+ "'", str22.equals("DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"));

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test229"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.util.library.AutomaticShuffledStringLibrary automaticShuffledStringLibrary1 = new org.mafagafogigante.dungeon.util.library.AutomaticShuffledStringLibrary("01:00:00");
      org.junit.Assert.fail("Expected exception of type org.mafagafogigante.dungeon.io.JsonObjectFactory.IllegalFilenameExtensionException");
    } catch (org.mafagafogigante.dungeon.io.JsonObjectFactory.IllegalFilenameExtensionException e) {
      // Expected exception.
    }

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test230"); }

    org.mafagafogigante.dungeon.game.Point point3 = new org.mafagafogigante.dungeon.game.Point((int)(short)100, (int)(short)0, (int)(byte)-1);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test231"); }

    org.mafagafogigante.dungeon.entity.Weight weight1 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    org.mafagafogigante.dungeon.entity.Weight weight2 = org.mafagafogigante.dungeon.entity.Weight.ZERO;
    org.mafagafogigante.dungeon.entity.Weight weight3 = weight1.add(weight2);
    org.mafagafogigante.dungeon.entity.Weight weight5 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    org.mafagafogigante.dungeon.entity.Weight weight6 = org.mafagafogigante.dungeon.entity.Weight.ZERO;
    org.mafagafogigante.dungeon.entity.Weight weight7 = weight5.add(weight6);
    org.mafagafogigante.dungeon.entity.Weight weight9 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)'#');
    org.mafagafogigante.dungeon.entity.Weight weight10 = weight7.add(weight9);
    int i11 = weight2.compareTo(weight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test232"); }

    org.mafagafogigante.dungeon.io.Sleeper.sleep(0L);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test233"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    itemPreset0.setIntegrityDecrementOnEat((-1));
    itemPreset0.setPutrefactionPeriod((-1L));
    itemPreset0.setDrinkableDoses((int)(short)10);
    java.lang.String str8 = itemPreset0.getText();
    org.mafagafogigante.dungeon.util.Percentage percentage10 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b12 = percentage10.equals((java.lang.Object)10.0d);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity13 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage10);
    org.mafagafogigante.dungeon.util.Percentage percentage14 = luminosity13.toPercentage();
    itemPreset0.setLuminosity(luminosity13);
    org.mafagafogigante.dungeon.world.LuminosityVisibilityCriterion luminosityVisibilityCriterion16 = new org.mafagafogigante.dungeon.world.LuminosityVisibilityCriterion(luminosity13);
    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array17 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria18 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array17);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature19 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer20 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature19);
    boolean b21 = visibilityCriteria18.isMetBy(observer20);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array22 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item23 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item23, item_array22);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString26 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array31 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString26.append(str_array31);
    observer20.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item23, dungeonString26);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array34 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item35 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item35, item_array34);
    java.lang.String[] str_array42 = new java.lang.String[] { "CounterMap{map={}}", "User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 34.4 MiB out of the allocated 123.0 MiB\nOS: Windows 10 (amd64) 10.0", "hi!", "0 ms", "User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 41.5 MiB out of the allocated 154.5 MiB\nOS: Windows 10 (amd64) 10.0" };
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item43 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item35, str_array42);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString45 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    observer20.writeItemSight(list_item43, dungeonString45);
    // The following exception was thrown during execution in test generation
    try {
    boolean b47 = luminosityVisibilityCriterion16.isMetBy(observer20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item43);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test234"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    boolean b3 = integrity2.isMaximum();
    org.mafagafogigante.dungeon.entity.items.Item item4 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity5 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity2, item4);
    org.mafagafogigante.dungeon.util.Percentage percentage6 = itemIntegrity5.toPercentage();
    boolean b7 = itemIntegrity5.isBroken();
    boolean b8 = itemIntegrity5.isPerfect();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemIntegrity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test235"); }

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
    java.lang.String str25 = direction23.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == (-1));
    org.junit.Assert.assertTrue("'" + direction23 + "' != '" + org.mafagafogigante.dungeon.game.Direction.UP + "'", direction23.equals(org.mafagafogigante.dungeon.game.Direction.UP));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Up"+ "'", str25.equals("Up"));

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test236"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    boolean b3 = integrity2.isMaximum();
    org.mafagafogigante.dungeon.entity.items.Item item4 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity5 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity2, item4);
    int i6 = integrity2.getCurrent();
    integrity2.decrementBy(46800);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemIntegrity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test237"); }

    org.mafagafogigante.dungeon.entity.items.ItemPresetFactory[] itemPresetFactory_array0 = new org.mafagafogigante.dungeon.entity.items.ItemPresetFactory[] {  };
    org.mafagafogigante.dungeon.entity.items.ItemFactory itemFactory1 = new org.mafagafogigante.dungeon.entity.items.ItemFactory(itemPresetFactory_array0);
    org.mafagafogigante.dungeon.game.Id id2 = null;
    org.mafagafogigante.dungeon.date.Date date3 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.items.Item item4 = itemFactory1.makeItem(id2, date3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemPresetFactory_array0);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test238"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date7 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i8 = date3.compareTo(date7);
    long long9 = date7.getDay();
    long long10 = date7.getDay();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 10L);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test239"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature1 = null;
    org.mafagafogigante.dungeon.entity.creatures.CreatureHealth creatureHealth2 = org.mafagafogigante.dungeon.entity.creatures.CreatureHealth.makeCreatureHealth(100, creature1);
    creatureHealth2.incrementBy(57);
    creatureHealth2.incrementBy(32);
    java.lang.String str7 = creatureHealth2.toString();
    boolean b8 = creatureHealth2.isFull();
    org.mafagafogigante.dungeon.util.Percentage percentage9 = creatureHealth2.toPercentage();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creatureHealth2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "CreatureHealth{integrity=100/100}"+ "'", str7.equals("CreatureHealth{integrity=100/100}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage9);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test240"); }

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
    int i19 = itemPreset0.getIntegrityDecrementOnEat();
    java.lang.String str20 = itemPreset0.getText();
    int i21 = itemPreset0.getNutrition();
    
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
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test241"); }

    java.lang.String[] str_array3 = new java.lang.String[] { "Damaged", "visibilityCriteria=VisibilityCriteria{[]}", "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str4 = new java.util.ArrayList<java.lang.String>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str4, str_array3);
    org.mafagafogigante.dungeon.io.Split split6 = org.mafagafogigante.dungeon.io.Split.splitOnOn((java.util.List<java.lang.String>)arraylist_str4);
    java.util.List<java.lang.String> list_str7 = split6.getAfter();
    java.util.List<java.lang.String> list_str8 = split6.getAfter();
    java.util.List<java.lang.String> list_str9 = split6.getAfter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(split6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test242"); }

    org.mafagafogigante.dungeon.date.Date date5 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date9 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i10 = date5.compareTo(date9);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay11 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date5);
    java.lang.String[] str_array17 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table18 = new org.mafagafogigante.dungeon.util.Table(str_array17);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString19 = table18.toColoredStringList();
    org.mafagafogigante.dungeon.game.ColoredString coloredString20 = org.mafagafogigante.dungeon.game.Random.select(list_coloredString19);
    boolean b21 = date5.equals((java.lang.Object)coloredString20);
    java.awt.Color color22 = coloredString20.getColor();
    org.mafagafogigante.dungeon.game.ColoredString coloredString23 = new org.mafagafogigante.dungeon.game.ColoredString("User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 41.5 MiB out of the allocated 154.5 MiB\nOS: Windows 10 (amd64) 10.0", color22);
    org.mafagafogigante.dungeon.game.ColoredString coloredString24 = new org.mafagafogigante.dungeon.game.ColoredString("Unarmed : UNARMED", color22);
    java.lang.String str25 = coloredString24.toString();
    java.lang.String str26 = coloredString24.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay11 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay11.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(coloredString20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "ColoredString{string='Unarmed : UNARMED', color=java.awt.Color[r=192,g=192,b=192]}"+ "'", str25.equals("ColoredString{string='Unarmed : UNARMED', color=java.awt.Color[r=192,g=192,b=192]}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "ColoredString{string='Unarmed : UNARMED', color=java.awt.Color[r=192,g=192,b=192]}"+ "'", str26.equals("ColoredString{string='Unarmed : UNARMED', color=java.awt.Color[r=192,g=192,b=192]}"));

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test243"); }

    org.mafagafogigante.dungeon.game.MinimumBoundingRectangle minimumBoundingRectangle2 = new org.mafagafogigante.dungeon.game.MinimumBoundingRectangle(57, (int)(byte)-1);
    int i3 = minimumBoundingRectangle2.getHeight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test244"); }

    org.mafagafogigante.dungeon.game.Id id0 = null;
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery2 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath3 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    battleStatisticsQuery2.setCauseOfDeath(causeOfDeath3);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay5 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.stats.BattleRecord battleRecord6 = new org.mafagafogigante.dungeon.stats.BattleRecord(id0, "", causeOfDeath3, partOfDay5);
    java.lang.String str7 = battleRecord6.getType();
    org.mafagafogigante.dungeon.game.Id id8 = battleRecord6.getId();
    org.mafagafogigante.dungeon.game.Id id9 = battleRecord6.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath3);
    org.junit.Assert.assertTrue("'" + partOfDay5 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay5.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id9);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test245"); }

    org.mafagafogigante.dungeon.util.Percentage percentage1 = new org.mafagafogigante.dungeon.util.Percentage((-1.0d));
    org.mafagafogigante.dungeon.stats.Statistics statistics2 = new org.mafagafogigante.dungeon.stats.Statistics();
    statistics2.writeStatistics();
    statistics2.writeStatistics();
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker5 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics2);
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker6 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics2);
    java.util.Comparator<org.mafagafogigante.dungeon.achievements.UnlockedAchievement> comparator_unlockedAchievement7 = org.mafagafogigante.dungeon.achievements.comparators.UnlockedAchievementComparators.getDefaultComparator();
    java.util.List<org.mafagafogigante.dungeon.achievements.UnlockedAchievement> list_unlockedAchievement8 = achievementTracker6.getUnlockedAchievements(comparator_unlockedAchievement7);
    boolean b9 = percentage1.equals((java.lang.Object)achievementTracker6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_unlockedAchievement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_unlockedAchievement8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test246"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, (int)'a', (double)(short)0);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test247"); }

    org.mafagafogigante.dungeon.util.CounterMap<java.util.RandomAccess> countermap_randomAccess0 = new org.mafagafogigante.dungeon.util.CounterMap<java.util.RandomAccess>();
    java.lang.String[] str_array4 = new java.lang.String[] { "Damaged", "visibilityCriteria=VisibilityCriteria{[]}", "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    org.mafagafogigante.dungeon.io.Split split7 = org.mafagafogigante.dungeon.io.Split.splitOnOn((java.util.List<java.lang.String>)arraylist_str5);
    org.mafagafogigante.dungeon.io.Split split8 = org.mafagafogigante.dungeon.io.Split.splitOnOn((java.util.List<java.lang.String>)arraylist_str5);
    countermap_randomAccess0.incrementCounter((java.util.RandomAccess)arraylist_str5, (java.lang.Integer)3600);
    java.util.Spliterator<java.util.RandomAccess> spliterator_randomAccess11 = countermap_randomAccess0.spliterator();
    java.util.Iterator<java.util.RandomAccess> iterator_randomAccess12 = countermap_randomAccess0.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(split7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(split8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_randomAccess11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_randomAccess12);

  }

//  @Test
//  public void test248() throws Throwable {
//
//    if (debug) { System.out.format("%n%s%n","RegressionTest1.test248"); }
//
//    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
//    org.mafagafogigante.dungeon.game.Id id1 = null;
//    creaturePreset0.setWeaponId(id1);
//    creaturePreset0.setAttack((int)(short)100);
//    java.util.List<org.mafagafogigante.dungeon.entity.creatures.Drop> list_drop5 = creaturePreset0.getDropList();
//    creaturePreset0.setType("East");
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNull(list_drop5);
//
//  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test249"); }

    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics0 = new org.mafagafogigante.dungeon.stats.BattleStatistics();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement1 = null;
    boolean b2 = battleStatistics0.satisfies(battleStatisticsRequirement1);
    java.lang.String str3 = battleStatistics0.toString();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery4 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement6 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement(battleStatisticsQuery4, (int)(byte)100);
    boolean b7 = battleStatistics0.satisfies(battleStatisticsRequirement6);
    org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.CauseOfDeath> countermap_causeOfDeath8 = battleStatistics0.getKillsByCauseOfDeath();
    org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.CauseOfDeath> countermap_causeOfDeath9 = battleStatistics0.getKillsByCauseOfDeath();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery10 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement12 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement(battleStatisticsQuery10, (int)(byte)100);
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery13 = battleStatisticsRequirement12.getQuery();
    boolean b14 = battleStatistics0.satisfies(battleStatisticsRequirement12);
    int i15 = battleStatisticsRequirement12.getCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "BattleStatistics{records=CounterMap{map={}}}"+ "'", str3.equals("BattleStatistics{records=CounterMap{map={}}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_causeOfDeath8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_causeOfDeath9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(battleStatisticsQuery13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test250"); }

    org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.WorldStatistics> countermap_worldStatistics0 = new org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.WorldStatistics>();
    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics1 = new org.mafagafogigante.dungeon.stats.WorldStatistics();
    int i2 = worldStatistics1.getLocationCount();
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str3 = worldStatistics1.getSpawnCounter();
    countermap_worldStatistics0.incrementCounter(worldStatistics1);
    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics5 = new org.mafagafogigante.dungeon.stats.WorldStatistics();
    int i6 = worldStatistics5.getLocationCount();
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str7 = worldStatistics5.getSpawnCounter();
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str8 = worldStatistics5.getSpawnCounter();
    int i9 = worldStatistics5.getLocationCount();
    worldStatistics5.addLocation("");
    countermap_worldStatistics0.incrementCounter(worldStatistics5);
    worldStatistics5.addSpawn("DungeonString{coloredStringList=[ColoredString{string='\nYou don't see anyone here.\n', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test251"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature1 = null;
    org.mafagafogigante.dungeon.entity.creatures.CreatureHealth creatureHealth2 = org.mafagafogigante.dungeon.entity.creatures.CreatureHealth.makeCreatureHealth(100, creature1);
    int i3 = creatureHealth2.getMaximum();
    int i4 = creatureHealth2.getCurrent();
    boolean b5 = creatureHealth2.isDead();
    int i6 = creatureHealth2.getCurrent();
    int i7 = creatureHealth2.getMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creatureHealth2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test252"); }

    org.mafagafogigante.dungeon.util.Percentage percentage1 = org.mafagafogigante.dungeon.util.Percentage.fromString("100");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage1);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test253"); }

    org.mafagafogigante.dungeon.game.Point point3 = new org.mafagafogigante.dungeon.game.Point(1, (int)(byte)-1, 57);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test254"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    boolean b5 = itemPreset0.isUnique();
    boolean b6 = itemPreset0.isUnique();
    itemPreset0.setNutrition(46800);
    long long9 = itemPreset0.getPutrefactionPeriod();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test255"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    creaturePreset0.setAttack(57);
    org.mafagafogigante.dungeon.game.Id[] id_array5 = new org.mafagafogigante.dungeon.game.Id[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.game.Id> arraylist_id6 = new java.util.ArrayList<org.mafagafogigante.dungeon.game.Id>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.game.Id>)arraylist_id6, id_array5);
    creaturePreset0.setItems((java.util.List<org.mafagafogigante.dungeon.game.Id>)arraylist_id6);
    org.mafagafogigante.dungeon.util.Percentage percentage9 = creaturePreset0.getVisibility();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity10 = creaturePreset0.getLuminosity();
    int i11 = creaturePreset0.getHealth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(id_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test256"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date((long)'a', (long)1, (long)81);
    org.mafagafogigante.dungeon.world.Weather weather4 = new org.mafagafogigante.dungeon.world.Weather(date3);
    org.mafagafogigante.dungeon.date.Date date8 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date12 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i13 = date8.compareTo(date12);
    java.lang.String str14 = date8.toTimeString();
    org.mafagafogigante.dungeon.date.Date date19 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date23 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i24 = date19.compareTo(date23);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay25 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date19);
    long long26 = date19.getYear();
    org.mafagafogigante.dungeon.date.Date date30 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date34 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i35 = date30.compareTo(date34);
    long long36 = date30.getYear();
    int i37 = date19.compareTo(date30);
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit39 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR;
    org.mafagafogigante.dungeon.date.Date date40 = date30.minus(35, dungeonTimeUnit39);
    org.mafagafogigante.dungeon.date.Date date41 = date8.plus((int)'a', dungeonTimeUnit39);
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit43 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR;
    org.mafagafogigante.dungeon.date.Date date44 = date41.plus(81, dungeonTimeUnit43);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.world.WeatherCondition weatherCondition45 = weather4.getCurrentCondition(date44);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "00:00:00"+ "'", str14.equals("00:00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay25 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay25.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long26 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long36 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit39 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR + "'", dungeonTimeUnit39.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date41);
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit43 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR + "'", dungeonTimeUnit43.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date44);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test257"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    creaturePreset0.setAttack((int)(short)100);
    org.mafagafogigante.dungeon.game.Id id5 = creaturePreset0.getWeaponId();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity6 = creaturePreset0.getLuminosity();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity7 = creaturePreset0.getLuminosity();
    creaturePreset0.setAttack(0);
    org.mafagafogigante.dungeon.util.Percentage percentage10 = creaturePreset0.getVisibility();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage10);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test258"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule2 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeBoundDoubleRule(0.0d, (double)(-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule2);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test259"); }

    org.mafagafogigante.dungeon.entity.creatures.Hero hero0 = null;
    org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster heroSpellcaster1 = new org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster(hero0);
    java.util.List<org.mafagafogigante.dungeon.spells.Spell> list_spell2 = heroSpellcaster1.getSpellList();
    java.lang.String[] str_array3 = new java.lang.String[] {  };
    heroSpellcaster1.parseCast(str_array3);
    java.lang.String[] str_array5 = null;
    // The following exception was thrown during execution in test generation
    try {
    heroSpellcaster1.parseCast(str_array5);
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
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test260"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity((int)(byte)1, (int)(byte)0);
    boolean b3 = integrity2.isMaximum();
    org.mafagafogigante.dungeon.entity.items.Item item4 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity5 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity2, item4);
    itemIntegrity5.incrementBy((int)(byte)0);
    itemIntegrity5.incrementBy((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage10 = itemIntegrity5.toPercentage();
    itemIntegrity5.decrementBy(0);
    org.mafagafogigante.dungeon.util.Percentage percentage13 = itemIntegrity5.toPercentage();
    boolean b14 = itemIntegrity5.isBroken();
    org.mafagafogigante.dungeon.util.Percentage percentage15 = itemIntegrity5.toPercentage();
    java.lang.String str16 = itemIntegrity5.toString();
    itemIntegrity5.incrementBy(82800);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemIntegrity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "ItemIntegrity{integrity=1/1, item=null}"+ "'", str16.equals("ItemIntegrity{integrity=1/1, item=null}"));

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test261"); }

    org.mafagafogigante.dungeon.date.Date date6 = new org.mafagafogigante.dungeon.date.Date((long)(byte)0, (long)0, (long)81, (long)10, 100L, (long)(short)1);
    java.lang.String str7 = date6.toDateString();
    org.mafagafogigante.dungeon.date.Date date11 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date15 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i16 = date11.compareTo(date15);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay17 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date11);
    long long18 = date11.getYear();
    org.mafagafogigante.dungeon.date.Duration duration19 = new org.mafagafogigante.dungeon.date.Duration(date6, date11);
    long long20 = duration19.getSeconds();
    long long21 = duration19.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "day 10 of month 1 of the year 1"+ "'", str7.equals("day 10 of month 1 of the year 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay17 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay17.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long20 == 85496399L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == 85496399L);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test262"); }

    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory0 = null;
    org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory corpseItemPresetFactory1 = new org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory(creatureFactory0);
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory2 = null;
    org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory corpseItemPresetFactory3 = new org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory(creatureFactory2);
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory4 = null;
    org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory corpseItemPresetFactory5 = new org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory(creatureFactory4);
    org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] creaturePresetFactory_array6 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] {  };
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory7 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array6);
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory8 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array6);
    org.mafagafogigante.dungeon.game.Id id9 = null;
    org.mafagafogigante.dungeon.game.World world10 = null;
    org.mafagafogigante.dungeon.entity.creatures.Creature creature11 = creatureFactory8.makeCreature(id9, world10);
    org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory corpseItemPresetFactory12 = new org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory(creatureFactory8);
    org.mafagafogigante.dungeon.entity.items.ItemPresetFactory[] itemPresetFactory_array13 = new org.mafagafogigante.dungeon.entity.items.ItemPresetFactory[] { corpseItemPresetFactory1, corpseItemPresetFactory3, corpseItemPresetFactory5, corpseItemPresetFactory12 };
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.items.ItemFactory itemFactory14 = new org.mafagafogigante.dungeon.entity.items.ItemFactory(itemPresetFactory_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creaturePresetFactory_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(creature11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemPresetFactory_array13);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test263"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    boolean b3 = integrity2.isMaximum();
    org.mafagafogigante.dungeon.entity.items.Item item4 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity5 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity2, item4);
    org.mafagafogigante.dungeon.util.Percentage percentage6 = itemIntegrity5.toPercentage();
    boolean b7 = itemIntegrity5.isPerfect();
    boolean b8 = itemIntegrity5.isPerfect();
    java.lang.String str9 = itemIntegrity5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemIntegrity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ItemIntegrity{integrity=0/1, item=null}"+ "'", str9.equals("ItemIntegrity{integrity=0/1, item=null}"));

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test264"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    creaturePreset0.setAttack(57);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity5 = creaturePreset0.getLuminosity();
    int i6 = creaturePreset0.getInventoryItemLimit();
    org.mafagafogigante.dungeon.game.Id id7 = null;
    creaturePreset0.setWeaponId(id7);
    creaturePreset0.setInventoryItemLimit(0);
    org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId attackAlgorithmId11 = creaturePreset0.getAttackAlgorithmId();
    org.mafagafogigante.dungeon.entity.Weight weight12 = creaturePreset0.getWeight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(attackAlgorithmId11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weight12);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test265"); }

    org.mafagafogigante.dungeon.game.DungeonString dungeonString1 = new org.mafagafogigante.dungeon.game.DungeonString("Damaged");
    dungeonString1.resetColor();

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test266"); }

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
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay16 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity17 = partOfDay16.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name18 = partOfDay16.getName();
    java.lang.String str20 = name18.getQuantifiedName((int)'a');
    creaturePreset0.setName(name18);
    java.lang.String str22 = name18.getSingular();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(id_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    org.junit.Assert.assertTrue("'" + partOfDay16 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay16.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "a few Nights"+ "'", str20.equals("a few Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Night"+ "'", str22.equals("Night"));

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test267"); }

    // The following exception was thrown during execution in test generation
    try {
    int i2 = org.mafagafogigante.dungeon.game.Random.nextInteger((int)'a', (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test268"); }

    org.mafagafogigante.dungeon.entity.Weight weight3 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)'#');
    org.mafagafogigante.dungeon.entity.Weight weight5 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)'#');
    org.mafagafogigante.dungeon.entity.Weight weight6 = weight3.add(weight5);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset7 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity8 = itemPreset7.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity9 = null;
    itemPreset7.setIntegrity(integrity9);
    org.mafagafogigante.dungeon.util.Percentage percentage11 = itemPreset7.getVisibility();
    java.lang.String str12 = itemPreset7.getType();
    itemPreset7.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage16 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset7.setVisibility(percentage16);
    org.mafagafogigante.dungeon.util.Percentage percentage19 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    int i20 = percentage16.compareTo(percentage19);
    org.mafagafogigante.dungeon.entity.Weight weight21 = weight6.multiply(percentage16);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset22 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity23 = itemPreset22.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity24 = null;
    itemPreset22.setIntegrity(integrity24);
    org.mafagafogigante.dungeon.util.Percentage percentage26 = itemPreset22.getVisibility();
    org.mafagafogigante.dungeon.entity.Integrity integrity27 = itemPreset22.getIntegrity();
    java.lang.String str28 = itemPreset22.getText();
    org.mafagafogigante.dungeon.game.Name name29 = null;
    itemPreset22.setName(name29);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset31 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity32 = itemPreset31.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity33 = null;
    itemPreset31.setIntegrity(integrity33);
    org.mafagafogigante.dungeon.util.Percentage percentage35 = itemPreset31.getVisibility();
    java.lang.String str36 = itemPreset31.getType();
    itemPreset31.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage40 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset31.setVisibility(percentage40);
    boolean b42 = org.mafagafogigante.dungeon.game.Random.roll(percentage40);
    itemPreset22.setVisibility(percentage40);
    boolean b44 = percentage16.biggerThanOrEqualTo(percentage40);
    double d45 = org.mafagafogigante.dungeon.util.DungeonMath.weightedAverage((double)86313600000L, (double)38, percentage16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d45 == 38.0d);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test269"); }

    org.mafagafogigante.dungeon.util.CircularList<java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>> circularlist_comparable_weight1 = new org.mafagafogigante.dungeon.util.CircularList<java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>>(100);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature2 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory5 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature2, (-1), 0.0d);
    org.mafagafogigante.dungeon.entity.Weight weight6 = creatureInventory5.getWeight();
    circularlist_comparable_weight1.add((java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>)weight6);
    org.mafagafogigante.dungeon.entity.Weight weight9 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)'#');
    org.mafagafogigante.dungeon.entity.Weight weight11 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)'#');
    org.mafagafogigante.dungeon.entity.Weight weight12 = weight9.add(weight11);
    org.mafagafogigante.dungeon.entity.Weight weight14 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    org.mafagafogigante.dungeon.entity.Weight weight15 = org.mafagafogigante.dungeon.entity.Weight.ZERO;
    org.mafagafogigante.dungeon.entity.Weight weight16 = weight14.add(weight15);
    int i17 = weight11.compareTo(weight15);
    org.mafagafogigante.dungeon.entity.Weight weight18 = weight6.add(weight15);
    org.mafagafogigante.dungeon.entity.Weight weight20 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset21 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity22 = itemPreset21.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity23 = null;
    itemPreset21.setIntegrity(integrity23);
    org.mafagafogigante.dungeon.util.Percentage percentage25 = itemPreset21.getVisibility();
    boolean b26 = itemPreset21.isUnique();
    org.mafagafogigante.dungeon.entity.Weight weight28 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    org.mafagafogigante.dungeon.entity.Weight weight29 = org.mafagafogigante.dungeon.entity.Weight.ZERO;
    org.mafagafogigante.dungeon.entity.Weight weight30 = weight28.add(weight29);
    java.lang.String str31 = weight30.toString();
    itemPreset21.setWeight(weight30);
    int i33 = weight20.compareTo(weight30);
    org.mafagafogigante.dungeon.entity.Weight weight35 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    org.mafagafogigante.dungeon.entity.Weight weight36 = org.mafagafogigante.dungeon.entity.Weight.ZERO;
    org.mafagafogigante.dungeon.entity.Weight weight37 = weight35.add(weight36);
    int i38 = weight20.compareTo(weight37);
    org.mafagafogigante.dungeon.entity.Weight weight39 = weight6.add(weight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "0 kg"+ "'", str31.equals("0 kg"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight39);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test270"); }

    org.mafagafogigante.dungeon.world.WeatherCondition weatherCondition0 = org.mafagafogigante.dungeon.world.WeatherCondition.RAIN;
    java.lang.String str1 = weatherCondition0.toDescriptiveString();
    org.mafagafogigante.dungeon.world.WeatherCondition weatherCondition2 = org.mafagafogigante.dungeon.world.WeatherCondition.CLEAR;
    org.mafagafogigante.dungeon.world.WeatherCondition weatherCondition3 = org.mafagafogigante.dungeon.world.WeatherCondition.RAIN;
    java.lang.String str4 = weatherCondition3.toDescriptiveString();
    org.mafagafogigante.dungeon.world.WeatherConditionVisibilityCriterion weatherConditionVisibilityCriterion5 = new org.mafagafogigante.dungeon.world.WeatherConditionVisibilityCriterion(weatherCondition2, weatherCondition3);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.world.WeatherConditionVisibilityCriterion weatherConditionVisibilityCriterion6 = new org.mafagafogigante.dungeon.world.WeatherConditionVisibilityCriterion(weatherCondition0, weatherCondition2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + weatherCondition0 + "' != '" + org.mafagafogigante.dungeon.world.WeatherCondition.RAIN + "'", weatherCondition0.equals(org.mafagafogigante.dungeon.world.WeatherCondition.RAIN));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "it is raining"+ "'", str1.equals("it is raining"));
    org.junit.Assert.assertTrue("'" + weatherCondition2 + "' != '" + org.mafagafogigante.dungeon.world.WeatherCondition.CLEAR + "'", weatherCondition2.equals(org.mafagafogigante.dungeon.world.WeatherCondition.CLEAR));
    org.junit.Assert.assertTrue("'" + weatherCondition3 + "' != '" + org.mafagafogigante.dungeon.world.WeatherCondition.RAIN + "'", weatherCondition3.equals(org.mafagafogigante.dungeon.world.WeatherCondition.RAIN));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "it is raining"+ "'", str4.equals("it is raining"));

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test271"); }

    org.mafagafogigante.dungeon.entity.creatures.Hero hero0 = null;
    org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster heroSpellcaster1 = new org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster(hero0);
    java.util.List<org.mafagafogigante.dungeon.spells.Spell> list_spell2 = heroSpellcaster1.getSpellList();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table9 = new org.mafagafogigante.dungeon.util.Table(str_array8);
    heroSpellcaster1.parseCast(str_array8);
    org.mafagafogigante.dungeon.spells.Spell spell11 = null;
    // The following exception was thrown during execution in test generation
    try {
    heroSpellcaster1.learnSpell(spell11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_spell2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test272"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay1 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity2 = partOfDay1.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name3 = partOfDay1.getName();
    org.mafagafogigante.dungeon.game.QuantificationMode quantificationMode5 = org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER;
    java.lang.String str6 = name3.getQuantifiedName((int)'4', quantificationMode5);
    creaturePreset0.setName(name3);
    java.lang.String str8 = name3.toString();
    org.junit.Assert.assertTrue("'" + partOfDay1 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay1.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name3);
    org.junit.Assert.assertTrue("'" + quantificationMode5 + "' != '" + org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER + "'", quantificationMode5.equals(org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "52 Nights"+ "'", str6.equals("52 Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Night"+ "'", str8.equals("Night"));

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test273"); }

    org.mafagafogigante.dungeon.entity.items.ItemPresetFactory[] itemPresetFactory_array0 = new org.mafagafogigante.dungeon.entity.items.ItemPresetFactory[] {  };
    org.mafagafogigante.dungeon.entity.items.ItemFactory itemFactory1 = new org.mafagafogigante.dungeon.entity.items.ItemFactory(itemPresetFactory_array0);
    org.mafagafogigante.dungeon.game.Id id2 = null;
    org.mafagafogigante.dungeon.date.Date date6 = new org.mafagafogigante.dungeon.date.Date((long)'a', (long)(short)-1, 1L);
    java.lang.String str7 = date6.toString();
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.items.Item item8 = itemFactory1.makeItem(id2, date6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemPresetFactory_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "97-01-01 00:00:00"+ "'", str7.equals("97-01-01 00:00:00"));

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test274"); }

    org.mafagafogigante.dungeon.stats.Statistics statistics0 = new org.mafagafogigante.dungeon.stats.Statistics();
    statistics0.writeStatistics();
    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics2 = statistics0.getWorldStatistics();
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker3 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics0);
    java.util.Comparator<org.mafagafogigante.dungeon.achievements.UnlockedAchievement> comparator_unlockedAchievement4 = org.mafagafogigante.dungeon.achievements.comparators.UnlockedAchievementComparators.getDefaultComparator();
    java.util.List<org.mafagafogigante.dungeon.achievements.UnlockedAchievement> list_unlockedAchievement5 = achievementTracker3.getUnlockedAchievements(comparator_unlockedAchievement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(worldStatistics2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_unlockedAchievement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_unlockedAchievement5);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test275"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date7 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i8 = date3.compareTo(date7);
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit10 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.MILLISECOND;
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.date.Date date11 = date7.minus(0, dungeonTimeUnit10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit10 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.MILLISECOND + "'", dungeonTimeUnit10.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.MILLISECOND));

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test276"); }

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
    org.mafagafogigante.dungeon.entity.LightSource lightSource27 = new org.mafagafogigante.dungeon.entity.LightSource(luminosity26);
    lightSource27.disable();
    java.lang.String str29 = lightSource27.toString();
    
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
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "Disabled LightSource of luminosity of 0.00%"+ "'", str29.equals("Disabled LightSource of luminosity of 0.00%"));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test277"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    creaturePreset0.setAttack(57);
    org.mafagafogigante.dungeon.util.CounterMap<java.util.RandomAccess> countermap_randomAccess5 = new org.mafagafogigante.dungeon.util.CounterMap<java.util.RandomAccess>();
    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset6 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id7 = null;
    creaturePreset6.setWeaponId(id7);
    creaturePreset6.setAttack(57);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity11 = creaturePreset6.getLuminosity();
    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset12 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id13 = null;
    creaturePreset12.setWeaponId(id13);
    creaturePreset12.setAttack(57);
    org.mafagafogigante.dungeon.game.Id[] id_array17 = new org.mafagafogigante.dungeon.game.Id[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.game.Id> arraylist_id18 = new java.util.ArrayList<org.mafagafogigante.dungeon.game.Id>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.game.Id>)arraylist_id18, id_array17);
    creaturePreset12.setItems((java.util.List<org.mafagafogigante.dungeon.game.Id>)arraylist_id18);
    creaturePreset6.setItems((java.util.List<org.mafagafogigante.dungeon.game.Id>)arraylist_id18);
    countermap_randomAccess5.incrementCounter((java.util.RandomAccess)arraylist_id18, (java.lang.Integer)10);
    creaturePreset0.setItems((java.util.List<org.mafagafogigante.dungeon.game.Id>)arraylist_id18);
    org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId attackAlgorithmId25 = null;
    creaturePreset0.setAttackAlgorithmId(attackAlgorithmId25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(id_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test278"); }

    org.mafagafogigante.dungeon.stats.Statistics statistics0 = new org.mafagafogigante.dungeon.stats.Statistics();
    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics1 = statistics0.getBattleStatistics();
    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics2 = new org.mafagafogigante.dungeon.stats.BattleStatistics();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement3 = null;
    boolean b4 = battleStatistics2.satisfies(battleStatisticsRequirement3);
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery5 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement7 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement(battleStatisticsQuery5, (int)(byte)100);
    boolean b8 = battleStatistics2.satisfies(battleStatisticsRequirement7);
    boolean b9 = battleStatistics1.satisfies(battleStatisticsRequirement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(battleStatistics1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test279"); }

    org.mafagafogigante.dungeon.game.Id id0 = null;
    org.mafagafogigante.dungeon.entity.items.BookComponent bookComponent2 = new org.mafagafogigante.dungeon.entity.items.BookComponent(id0, " : day 10 of month 1 of the year 1");
    java.lang.String str3 = bookComponent2.getText();
    org.mafagafogigante.dungeon.game.Id id4 = bookComponent2.getSpellId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " : day 10 of month 1 of the year 1"+ "'", str3.equals(" : day 10 of month 1 of the year 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id4);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test280"); }

    org.mafagafogigante.dungeon.util.Messenger.printFailedToCreateDirectoryMessage("User: Nicholas\nTime: 15:42:11\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 35.0 MiB out of the allocated 123.0 MiB\nOS: Windows 10 (amd64) 10.0");

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test281"); }

    org.mafagafogigante.dungeon.io.Writer.write("Less than a day");

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test282"); }

    org.mafagafogigante.dungeon.util.NonNegativeInteger nonNegativeInteger1 = new org.mafagafogigante.dungeon.util.NonNegativeInteger((java.lang.Integer)152);
    java.lang.String str2 = nonNegativeInteger1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "152"+ "'", str2.equals("152"));

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test283"); }

    // The following exception was thrown during execution in test generation
    try {
    int i2 = org.mafagafogigante.dungeon.game.Random.nextInteger((int)' ', 5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test284"); }

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
    org.mafagafogigante.dungeon.entity.TagSet<org.mafagafogigante.dungeon.entity.items.Item.Tag> tagset_tag15 = itemPreset0.getTagSet();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset19 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    itemPreset19.setDrinkableHealing((int)(short)0);
    org.mafagafogigante.dungeon.util.Percentage percentage23 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset19.setVisibility(percentage23);
    double d25 = org.mafagafogigante.dungeon.util.DungeonMath.weightedAverage((double)10.0f, 100.0d, percentage23);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset26 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity27 = itemPreset26.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity28 = null;
    itemPreset26.setIntegrity(integrity28);
    org.mafagafogigante.dungeon.util.Percentage percentage30 = itemPreset26.getVisibility();
    java.lang.String str31 = itemPreset26.getType();
    org.mafagafogigante.dungeon.entity.items.Item.Tag tag32 = org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE;
    itemPreset26.addTag(tag32);
    org.mafagafogigante.dungeon.util.Percentage percentage35 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b37 = percentage35.equals((java.lang.Object)10.0d);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity38 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage35);
    itemPreset26.setVisibility(percentage35);
    boolean b40 = percentage23.biggerThanOrEqualTo(percentage35);
    org.mafagafogigante.dungeon.entity.items.WeaponComponent weaponComponent42 = new org.mafagafogigante.dungeon.entity.items.WeaponComponent((int)(short)10, percentage35, 1);
    itemPreset0.setVisibility(percentage35);
    org.mafagafogigante.dungeon.util.Percentage percentage45 = new org.mafagafogigante.dungeon.util.Percentage((double)100);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset46 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity47 = itemPreset46.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity48 = null;
    itemPreset46.setIntegrity(integrity48);
    org.mafagafogigante.dungeon.util.Percentage percentage50 = itemPreset46.getVisibility();
    java.lang.String str51 = itemPreset46.getType();
    itemPreset46.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage55 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset46.setVisibility(percentage55);
    boolean b57 = org.mafagafogigante.dungeon.game.Random.roll(percentage55);
    int i58 = percentage45.compareTo(percentage55);
    itemPreset0.setHitRate(percentage45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tagset_tag15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d25 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str31);
    org.junit.Assert.assertTrue("'" + tag32 + "' != '" + org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE + "'", tag32.equals(org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test285"); }

    org.mafagafogigante.dungeon.util.Messenger.printFailedToCreateDirectoryMessage("ColoredString{string='', color=null}");

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test286"); }

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
    int i27 = weaponComponent26.getDamage();
    int i28 = weaponComponent26.getIntegrityDecrementOnHit();
    org.mafagafogigante.dungeon.util.Percentage percentage29 = weaponComponent26.getHitRate();
    
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
    org.junit.Assert.assertTrue(i27 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage29);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test287"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity((int)'#', 5);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test288"); }

    org.mafagafogigante.dungeon.util.ShuffledRange shuffledRange2 = new org.mafagafogigante.dungeon.util.ShuffledRange(0, (int)'4');
    shuffledRange2.shuffle();

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test289"); }

    org.mafagafogigante.dungeon.entity.items.FoodComponent foodComponent2 = new org.mafagafogigante.dungeon.entity.items.FoodComponent((int)(short)0, 90);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test290"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, (-1), 0.0d);
    org.mafagafogigante.dungeon.entity.Weight weight4 = creatureInventory3.getWeight();
    int i5 = creatureInventory3.getItemCount();
    int i6 = creatureInventory3.getItemCount();
    org.mafagafogigante.dungeon.entity.Weight weight7 = creatureInventory3.getWeightLimit();
    org.mafagafogigante.dungeon.stats.Statistics statistics8 = new org.mafagafogigante.dungeon.stats.Statistics();
    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics9 = statistics8.getBattleStatistics();
    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics10 = statistics8.getWorldStatistics();
    boolean b11 = weight7.equals((java.lang.Object)statistics8);
    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics12 = statistics8.getWorldStatistics();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(battleStatistics9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(worldStatistics10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(worldStatistics12);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test291"); }

    org.mafagafogigante.dungeon.commands.CommandHistory commandHistory0 = new org.mafagafogigante.dungeon.commands.CommandHistory();
    java.lang.String str2 = commandHistory0.getLastSimilarCommand("");
    java.lang.String str4 = commandHistory0.getLastSimilarCommand("Unarmed : UNARMED");
    org.mafagafogigante.dungeon.commands.CommandHistory.Cursor cursor5 = commandHistory0.getCursor();
    java.lang.String str6 = cursor5.getSelectedCommand();
    org.mafagafogigante.dungeon.commands.CommandHistory.Cursor cursor7 = cursor5.moveUp();
    org.mafagafogigante.dungeon.commands.CommandHistory.Cursor cursor8 = cursor5.moveUp();
    cursor5.moveToEnd();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cursor8);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test292"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity(28, (int)(byte)1);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test293"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule2 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeBoundIntegerRule((int)(byte)0, (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule2);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test294"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature1 = null;
    org.mafagafogigante.dungeon.entity.creatures.CreatureHealth creatureHealth2 = org.mafagafogigante.dungeon.entity.creatures.CreatureHealth.makeCreatureHealth(100, creature1);
    int i3 = creatureHealth2.getMaximum();
    int i4 = creatureHealth2.getCurrent();
    boolean b5 = creatureHealth2.isDead();
    boolean b6 = creatureHealth2.isAlive();
    boolean b7 = creatureHealth2.isAlive();
    boolean b8 = creatureHealth2.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creatureHealth2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test295"); }

    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery0 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath1 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    battleStatisticsQuery0.setCauseOfDeath(causeOfDeath1);
    org.mafagafogigante.dungeon.date.Date date9 = new org.mafagafogigante.dungeon.date.Date(1L, (long)100, (long)(short)1, (long)(byte)100, (long)' ', (long)'#');
    boolean b10 = battleStatisticsQuery0.equals((java.lang.Object)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test296"); }

    org.mafagafogigante.dungeon.stats.Statistics statistics0 = new org.mafagafogigante.dungeon.stats.Statistics();
    statistics0.writeStatistics();
    statistics0.writeStatistics();
    statistics0.writeStatistics();
    org.mafagafogigante.dungeon.commands.IssuedCommand issuedCommand5 = new org.mafagafogigante.dungeon.commands.IssuedCommand("BattleStatistics{records=CounterMap{map={}}}");
    org.mafagafogigante.dungeon.commands.PreparedIssuedCommand preparedIssuedCommand6 = org.mafagafogigante.dungeon.commands.IssuedCommandProcessor.prepareIssuedCommand(issuedCommand5);
    statistics0.addCommand(issuedCommand5);
    org.mafagafogigante.dungeon.commands.IssuedCommandEvaluation issuedCommandEvaluation8 = org.mafagafogigante.dungeon.commands.IssuedCommandProcessor.evaluateIssuedCommand(issuedCommand5);
    org.mafagafogigante.dungeon.commands.IssuedCommandEvaluation issuedCommandEvaluation9 = org.mafagafogigante.dungeon.commands.IssuedCommandProcessor.evaluateIssuedCommand(issuedCommand5);
    java.lang.String str10 = issuedCommandEvaluation9.toString();
    java.lang.String str11 = issuedCommandEvaluation9.toString();
    boolean b12 = issuedCommandEvaluation9.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(preparedIssuedCommand6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(issuedCommandEvaluation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(issuedCommandEvaluation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "IssuedCommandEvaluation{valid=false, suggestions=[achievements, destroy, tutorial]}"+ "'", str10.equals("IssuedCommandEvaluation{valid=false, suggestions=[achievements, destroy, tutorial]}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "IssuedCommandEvaluation{valid=false, suggestions=[achievements, destroy, tutorial]}"+ "'", str11.equals("IssuedCommandEvaluation{valid=false, suggestions=[achievements, destroy, tutorial]}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test297"); }

    org.mafagafogigante.dungeon.world.TimeVisibilityCriterion timeVisibilityCriterion2 = new org.mafagafogigante.dungeon.world.TimeVisibilityCriterion((int)'4', (int)(short)10);
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
    org.mafagafogigante.dungeon.entity.creatures.Creature creature20 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory23 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature20, 0, (double)35);
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item24 = creatureInventory23.getItems();
    org.mafagafogigante.dungeon.game.DungeonString dungeonString26 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array31 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString26.append(str_array31);
    java.lang.String str33 = dungeonString26.toString();
    observer6.writeItemSight(list_item24, dungeonString26);
    // The following exception was thrown during execution in test generation
    try {
    boolean b35 = timeVisibilityCriterion2.isMetBy(observer6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
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
    org.junit.Assert.assertNotNull(list_item24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"+ "'", str33.equals("DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"));

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test298"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.util.Percentage percentage1 = org.mafagafogigante.dungeon.util.Percentage.fromString("a few Nights");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test299"); }

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
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset19 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity20 = itemPreset19.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity21 = null;
    itemPreset19.setIntegrity(integrity21);
    org.mafagafogigante.dungeon.util.Percentage percentage23 = itemPreset19.getVisibility();
    java.lang.String str24 = itemPreset19.getType();
    itemPreset19.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage28 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset19.setVisibility(percentage28);
    org.mafagafogigante.dungeon.util.Percentage percentage31 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    int i32 = percentage28.compareTo(percentage31);
    itemPreset0.setHitRate(percentage28);
    org.mafagafogigante.dungeon.date.Date date40 = new org.mafagafogigante.dungeon.date.Date((long)(byte)0, (long)0, (long)81, (long)10, 100L, (long)(short)1);
    java.lang.String str41 = date40.toDateString();
    long long42 = date40.getTime();
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.items.Item item43 = new org.mafagafogigante.dungeon.entity.items.Item(itemPreset0, date40);
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
    org.junit.Assert.assertTrue(i15 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay16 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay16.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "day 10 of month 1 of the year 1"+ "'", str41.equals("day 10 of month 1 of the year 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long42 == 817201000L);

  }

//  @Test
//  public void test300() throws Throwable {
//
//    if (debug) { System.out.format("%n%s%n","RegressionTest1.test300"); }
//
//    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
//    org.mafagafogigante.dungeon.game.Id id1 = null;
//    creaturePreset0.setWeaponId(id1);
//    creaturePreset0.setAttack(57);
//    org.mafagafogigante.dungeon.entity.Luminosity luminosity5 = creaturePreset0.getLuminosity();
//    creaturePreset0.setInventoryItemLimit(57);
//    org.mafagafogigante.dungeon.entity.creatures.Drop[] drop_array8 = new org.mafagafogigante.dungeon.entity.creatures.Drop[] {  };
//    java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop> arraylist_drop9 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop>();
//    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop9, drop_array8);
//    creaturePreset0.setDropList((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop9);
//    creaturePreset0.setInventoryWeightLimit((double)(byte)0);
//    org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId attackAlgorithmId14 = creaturePreset0.getAttackAlgorithmId();
//    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset15 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
//    org.mafagafogigante.dungeon.game.Id id16 = null;
//    creaturePreset15.setWeaponId(id16);
//    creaturePreset15.setAttack(57);
//    org.mafagafogigante.dungeon.entity.Luminosity luminosity20 = creaturePreset15.getLuminosity();
//    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset21 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
//    org.mafagafogigante.dungeon.game.Id id22 = null;
//    creaturePreset21.setWeaponId(id22);
//    creaturePreset21.setAttack(57);
//    org.mafagafogigante.dungeon.game.Id[] id_array26 = new org.mafagafogigante.dungeon.game.Id[] {  };
//    java.util.ArrayList<org.mafagafogigante.dungeon.game.Id> arraylist_id27 = new java.util.ArrayList<org.mafagafogigante.dungeon.game.Id>();
//    boolean b28 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.game.Id>)arraylist_id27, id_array26);
//    creaturePreset21.setItems((java.util.List<org.mafagafogigante.dungeon.game.Id>)arraylist_id27);
//    creaturePreset15.setItems((java.util.List<org.mafagafogigante.dungeon.game.Id>)arraylist_id27);
//    org.mafagafogigante.dungeon.game.PartOfDay partOfDay31 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
//    org.mafagafogigante.dungeon.entity.Luminosity luminosity32 = partOfDay31.getLuminosity();
//    org.mafagafogigante.dungeon.game.Name name33 = partOfDay31.getName();
//    java.lang.String str35 = name33.getQuantifiedName((int)'a');
//    creaturePreset15.setName(name33);
//    creaturePreset0.setName(name33);
//    org.mafagafogigante.dungeon.game.PartOfDay partOfDay38 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
//    org.mafagafogigante.dungeon.entity.Luminosity luminosity39 = partOfDay38.getLuminosity();
//    org.mafagafogigante.dungeon.game.Name name40 = partOfDay38.getName();
//    java.lang.String str42 = name40.getQuantifiedName((int)'a');
//    java.lang.String str43 = name40.getSingular();
//    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset45 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
//    org.mafagafogigante.dungeon.entity.Integrity integrity46 = itemPreset45.getIntegrity();
//    org.mafagafogigante.dungeon.util.Percentage percentage47 = itemPreset45.getVisibility();
//    java.lang.String str48 = itemPreset45.getType();
//    itemPreset45.setDrinkableHealing(10);
//    org.mafagafogigante.dungeon.game.PartOfDay partOfDay51 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
//    org.mafagafogigante.dungeon.entity.Luminosity luminosity52 = partOfDay51.getLuminosity();
//    org.mafagafogigante.dungeon.game.Name name53 = partOfDay51.getName();
//    java.lang.String str55 = name53.getQuantifiedName((int)'a');
//    java.lang.String str56 = name53.getSingular();
//    java.lang.String str57 = name53.toString();
//    java.lang.String str58 = name53.getSingular();
//    itemPreset45.setName(name53);
//    org.mafagafogigante.dungeon.game.QuantificationMode quantificationMode61 = org.mafagafogigante.dungeon.game.QuantificationMode.WORD;
//    java.lang.String str62 = name53.getQuantifiedName(81, quantificationMode61);
//    java.lang.String str63 = name40.getQuantifiedName(152, quantificationMode61);
//    creaturePreset0.setName(name40);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNotNull(luminosity5);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNotNull(drop_array8);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertTrue(b10 == false);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNull(attackAlgorithmId14);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNotNull(luminosity20);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNotNull(id_array26);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertTrue(b28 == false);
//    org.junit.Assert.assertTrue("'" + partOfDay31 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay31.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNotNull(luminosity32);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNotNull(name33);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "a few Nights"+ "'", str35.equals("a few Nights"));
//    org.junit.Assert.assertTrue("'" + partOfDay38 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay38.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNotNull(luminosity39);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNotNull(name40);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "a few Nights"+ "'", str42.equals("a few Nights"));
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "Night"+ "'", str43.equals("Night"));
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNull(integrity46);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNull(percentage47);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNull(str48);
//    org.junit.Assert.assertTrue("'" + partOfDay51 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay51.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNotNull(luminosity52);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNotNull(name53);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "a few Nights"+ "'", str55.equals("a few Nights"));
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "Night"+ "'", str56.equals("Night"));
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "Night"+ "'", str57.equals("Night"));
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "Night"+ "'", str58.equals("Night"));
//    org.junit.Assert.assertTrue("'" + quantificationMode61 + "' != '" + org.mafagafogigante.dungeon.game.QuantificationMode.WORD + "'", quantificationMode61.equals(org.mafagafogigante.dungeon.game.QuantificationMode.WORD));
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertTrue("'" + str62 + "' != '" + "a few Nights"+ "'", str62.equals("a few Nights"));
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertTrue("'" + str63 + "' != '" + "a few Nights"+ "'", str63.equals("a few Nights"));
//
//  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test301"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.util.Percentage percentage2 = itemPreset0.getVisibility();
    java.lang.String str3 = itemPreset0.getType();
    int i4 = itemPreset0.getDamage();
    itemPreset0.setDamage((int)(byte)0);
    
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
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test302"); }

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
    itemPreset0.setIntegrityDecrementPerDose((int)' ');
    
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
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test303"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.date.Duration duration1 = org.mafagafogigante.dungeon.date.DungeonTimeParser.parsePeriod("ItemIntegrity{integrity=1/1, item=null}");
      org.junit.Assert.fail("Expected exception of type org.mafagafogigante.dungeon.date.DungeonTimeParser.InvalidMultiplierException");
    } catch (org.mafagafogigante.dungeon.date.DungeonTimeParser.InvalidMultiplierException e) {
      // Expected exception.
    }

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test304"); }

    org.mafagafogigante.dungeon.game.Point point3 = new org.mafagafogigante.dungeon.game.Point(46800, 3600, 38);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test305"); }

    org.mafagafogigante.dungeon.entity.items.IntegrityState integrityState2 = org.mafagafogigante.dungeon.entity.items.IntegrityState.getIntegrityState(0, (int)'#');
    org.junit.Assert.assertTrue("'" + integrityState2 + "' != '" + org.mafagafogigante.dungeon.entity.items.IntegrityState.BROKEN + "'", integrityState2.equals(org.mafagafogigante.dungeon.entity.items.IntegrityState.BROKEN));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test306"); }

    org.mafagafogigante.dungeon.util.Percentage percentage0 = null;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity1 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage0);
    org.mafagafogigante.dungeon.entity.LightSource lightSource2 = new org.mafagafogigante.dungeon.entity.LightSource(luminosity1);
    org.mafagafogigante.dungeon.entity.LightSource lightSource3 = new org.mafagafogigante.dungeon.entity.LightSource(luminosity1);
    java.lang.String str4 = lightSource3.toString();
    lightSource3.enable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Enabled LightSource of luminosity of null"+ "'", str4.equals("Enabled LightSource of luminosity of null"));

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test307"); }

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
    int i40 = dungeonString21.getLength();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 85);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test308"); }

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
    org.mafagafogigante.dungeon.entity.Weight weight17 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    org.mafagafogigante.dungeon.entity.Weight weight18 = org.mafagafogigante.dungeon.entity.Weight.ZERO;
    org.mafagafogigante.dungeon.entity.Weight weight19 = weight17.add(weight18);
    org.mafagafogigante.dungeon.entity.Weight weight21 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)'#');
    org.mafagafogigante.dungeon.entity.Weight weight22 = weight19.add(weight21);
    circularlist_comparable_weight1.add((java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>)weight19);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight> comparable_weight25 = circularlist_comparable_weight1.get(32);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
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
    org.junit.Assert.assertNotNull(weight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight22);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test309"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity(100, 0);
    org.mafagafogigante.dungeon.util.Percentage percentage3 = integrity2.toPercentage();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage3);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test310"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, (-1), 0.0d);
    org.mafagafogigante.dungeon.entity.Weight weight4 = creatureInventory3.getWeight();
    int i5 = creatureInventory3.getItemCount();
    int i6 = creatureInventory3.getItemCount();
    org.mafagafogigante.dungeon.entity.Weight weight7 = creatureInventory3.getWeightLimit();
    org.mafagafogigante.dungeon.stats.Statistics statistics8 = new org.mafagafogigante.dungeon.stats.Statistics();
    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics9 = statistics8.getBattleStatistics();
    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics10 = statistics8.getWorldStatistics();
    boolean b11 = weight7.equals((java.lang.Object)statistics8);
    java.lang.String str12 = weight7.toString();
    java.lang.String str13 = weight7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(battleStatistics9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(worldStatistics10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "0 kg"+ "'", str12.equals("0 kg"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "0 kg"+ "'", str13.equals("0 kg"));

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test311"); }

    org.mafagafogigante.dungeon.game.DungeonString dungeonString1 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString1.append(str_array6);
    java.awt.Color color8 = null;
    dungeonString1.setColor(color8);
    java.lang.String str10 = dungeonString1.toString();
    java.lang.String[] str_array16 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table17 = new org.mafagafogigante.dungeon.util.Table(str_array16);
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications20 = new org.mafagafogigante.dungeon.gui.WritingSpecifications(false, 32);
    boolean b21 = writingSpecifications20.shouldWait();
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)table17, writingSpecifications20);
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)dungeonString1, writingSpecifications20);
    org.mafagafogigante.dungeon.io.Writer.writeAndWait((org.mafagafogigante.dungeon.game.Writable)dungeonString1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=null}"+ "'", str10.equals("DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=null}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test312"); }

    org.mafagafogigante.dungeon.game.Id id0 = null;
    org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath typeOfCauseOfDeath2 = null;
    org.mafagafogigante.dungeon.game.Id id3 = null;
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath4 = new org.mafagafogigante.dungeon.stats.CauseOfDeath(typeOfCauseOfDeath2, id3);
    org.mafagafogigante.dungeon.date.Date date8 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date12 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i13 = date8.compareTo(date12);
    long long14 = date12.getDay();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay15 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    int i16 = org.mafagafogigante.dungeon.game.PartOfDay.getSecondsToNext(date12, partOfDay15);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay17 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date12);
    org.mafagafogigante.dungeon.stats.BattleRecord battleRecord18 = new org.mafagafogigante.dungeon.stats.BattleRecord(id0, "it is raining", causeOfDeath4, partOfDay17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 10L);
    org.junit.Assert.assertTrue("'" + partOfDay15 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay15.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3600);
    org.junit.Assert.assertTrue("'" + partOfDay17 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay17.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test313"); }

    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics0 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point1 = null;
    org.mafagafogigante.dungeon.game.Id id2 = null;
    explorationStatistics0.createEntryIfNotExists(point1, id2);
    org.mafagafogigante.dungeon.game.Point point7 = new org.mafagafogigante.dungeon.game.Point(152, (int)(byte)100, 17518);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature9 = null;
    org.mafagafogigante.dungeon.entity.creatures.CreatureHealth creatureHealth10 = org.mafagafogigante.dungeon.entity.creatures.CreatureHealth.makeCreatureHealth(100, creature9);
    boolean b11 = point7.equals((java.lang.Object)creature9);
    boolean b12 = explorationStatistics0.hasBeenSeen(point7);
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics13 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Id id14 = null;
    int i15 = explorationStatistics13.getMaximumNumberOfVisits(id14);
    org.mafagafogigante.dungeon.game.Id id16 = null;
    int i17 = explorationStatistics13.getVisitedLocations(id16);
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics18 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point19 = null;
    org.mafagafogigante.dungeon.game.Id id20 = null;
    explorationStatistics18.createEntryIfNotExists(point19, id20);
    org.mafagafogigante.dungeon.game.Point point25 = new org.mafagafogigante.dungeon.game.Point(10, (int)'a', 0);
    java.lang.String[] str_array28 = new java.lang.String[] { "", "" };
    org.mafagafogigante.dungeon.util.Table table29 = new org.mafagafogigante.dungeon.util.Table(str_array28);
    boolean b30 = point25.equals((java.lang.Object)str_array28);
    org.mafagafogigante.dungeon.game.Id id31 = null;
    explorationStatistics18.addVisit(point25, id31);
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics33 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point34 = null;
    org.mafagafogigante.dungeon.game.Id id35 = null;
    explorationStatistics33.createEntryIfNotExists(point34, id35);
    org.mafagafogigante.dungeon.game.Point point40 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id41 = null;
    explorationStatistics33.addVisit(point40, id41);
    java.lang.String str43 = point40.toString();
    int i44 = point40.getZ();
    org.mafagafogigante.dungeon.game.Id id45 = null;
    explorationStatistics18.addVisit(point40, id45);
    org.mafagafogigante.dungeon.game.Id id47 = null;
    explorationStatistics13.addVisit(point40, id47);
    org.mafagafogigante.dungeon.game.Id id49 = null;
    explorationStatistics0.createEntryIfNotExists(point40, id49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creatureHealth10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{32, 0, -1}"+ "'", str43.equals("{32, 0, -1}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == (-1));

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test314"); }

    org.mafagafogigante.dungeon.util.StopWatch stopWatch2 = new org.mafagafogigante.dungeon.util.StopWatch();
    java.util.concurrent.TimeUnit timeUnit3 = null;
    java.lang.String str4 = stopWatch2.toString(timeUnit3);
    java.lang.String str5 = stopWatch2.toString();
    org.mafagafogigante.dungeon.logging.DungeonLogger.logCommandRenderingReport("the sky is cloudy", "v6.2.0", stopWatch2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0 ms"+ "'", str5.equals("0 ms"));

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test315"); }

    org.mafagafogigante.dungeon.commands.IssuedCommand issuedCommand1 = new org.mafagafogigante.dungeon.commands.IssuedCommand("BattleStatistics{records=CounterMap{map={}}}");
    org.mafagafogigante.dungeon.commands.PreparedIssuedCommand preparedIssuedCommand2 = org.mafagafogigante.dungeon.commands.IssuedCommandProcessor.prepareIssuedCommand(issuedCommand1);
    java.lang.String str3 = issuedCommand1.getStringRepresentation();
    java.util.List<java.lang.String> list_str4 = issuedCommand1.getTokens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(preparedIssuedCommand2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "BattleStatistics{records=CounterMap{map={}}}"+ "'", str3.equals("BattleStatistics{records=CounterMap{map={}}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test316"); }

    org.mafagafogigante.dungeon.util.CounterMap<java.util.RandomAccess> countermap_randomAccess0 = new org.mafagafogigante.dungeon.util.CounterMap<java.util.RandomAccess>();
    java.lang.String[] str_array4 = new java.lang.String[] { "Damaged", "visibilityCriteria=VisibilityCriteria{[]}", "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    org.mafagafogigante.dungeon.io.Split split7 = org.mafagafogigante.dungeon.io.Split.splitOnOn((java.util.List<java.lang.String>)arraylist_str5);
    org.mafagafogigante.dungeon.io.Split split8 = org.mafagafogigante.dungeon.io.Split.splitOnOn((java.util.List<java.lang.String>)arraylist_str5);
    countermap_randomAccess0.incrementCounter((java.util.RandomAccess)arraylist_str5, (java.lang.Integer)3600);
    java.util.Iterator<java.util.RandomAccess> iterator_randomAccess11 = countermap_randomAccess0.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(split7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(split8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_randomAccess11);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test317"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    creaturePreset0.setAttack(57);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity5 = creaturePreset0.getLuminosity();
    creaturePreset0.setInventoryItemLimit(57);
    org.mafagafogigante.dungeon.game.Id id8 = creaturePreset0.getId();
    org.mafagafogigante.dungeon.game.Id id9 = creaturePreset0.getId();
    org.mafagafogigante.dungeon.entity.TagSet<org.mafagafogigante.dungeon.entity.creatures.Creature.Tag> tagset_tag10 = null;
    creaturePreset0.setTagSet(tagset_tag10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id9);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test318"); }

    org.mafagafogigante.dungeon.commands.CommandDescription commandDescription2 = new org.mafagafogigante.dungeon.commands.CommandDescription("", "day 10 of month 1 of the year 1");
    java.lang.String str3 = commandDescription2.getInfo();
    java.lang.String str4 = commandDescription2.getName();
    java.lang.String str5 = commandDescription2.getName();
    java.lang.String str6 = commandDescription2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "day 10 of month 1 of the year 1"+ "'", str3.equals("day 10 of month 1 of the year 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + " : day 10 of month 1 of the year 1"+ "'", str6.equals(" : day 10 of month 1 of the year 1"));

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test319"); }

    org.mafagafogigante.dungeon.game.DungeonString dungeonString1 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString1.append(str_array6);
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications8 = null;
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)dungeonString1, writingSpecifications8);
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)dungeonString1);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString12 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array17 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString12.append(str_array17);
    java.awt.Color color19 = null;
    dungeonString12.setColor(color19);
    org.mafagafogigante.dungeon.date.Date date25 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date29 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i30 = date25.compareTo(date29);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay31 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date25);
    java.lang.String[] str_array37 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table38 = new org.mafagafogigante.dungeon.util.Table(str_array37);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString39 = table38.toColoredStringList();
    org.mafagafogigante.dungeon.game.ColoredString coloredString40 = org.mafagafogigante.dungeon.game.Random.select(list_coloredString39);
    boolean b41 = date25.equals((java.lang.Object)coloredString40);
    java.awt.Color color42 = coloredString40.getColor();
    org.mafagafogigante.dungeon.game.ColoredString coloredString43 = new org.mafagafogigante.dungeon.game.ColoredString("User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 41.5 MiB out of the allocated 154.5 MiB\nOS: Windows 10 (amd64) 10.0", color42);
    dungeonString12.setColor(color42);
    dungeonString1.setColor(color42);
    dungeonString1.resetColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay31 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay31.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(coloredString40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color42);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test320"); }

    org.mafagafogigante.dungeon.logging.DungeonLogger.info("WritingSpecifications{scrollDown=true}");

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test321"); }

    org.mafagafogigante.dungeon.game.LocationPreset locationPreset0 = null;
    org.mafagafogigante.dungeon.game.World world1 = null;
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics2 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point6 = new org.mafagafogigante.dungeon.game.Point(10, (int)'a', 0);
    int i7 = point6.getY();
    org.mafagafogigante.dungeon.game.Id id8 = null;
    explorationStatistics2.createEntryIfNotExists(point6, id8);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.game.Location location10 = new org.mafagafogigante.dungeon.game.Location(locationPreset0, world1, point6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test322"); }

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
    int i13 = itemPreset0.getDrinkableHealing();
    long long14 = itemPreset0.getPutrefactionPeriod();
    org.mafagafogigante.dungeon.date.Date date18 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date22 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i23 = date18.compareTo(date22);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay24 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date18);
    long long25 = date18.getYear();
    org.mafagafogigante.dungeon.date.Date date29 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date33 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i34 = date29.compareTo(date33);
    long long35 = date29.getYear();
    int i36 = date18.compareTo(date29);
    org.mafagafogigante.dungeon.date.Date date40 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date44 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i45 = date40.compareTo(date44);
    long long46 = date40.getYear();
    int i47 = date18.compareTo(date40);
    java.lang.String str48 = date18.toTimeString();
    java.lang.String str49 = date18.toTimeString();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay50 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date18);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.items.Item item51 = new org.mafagafogigante.dungeon.entity.items.Item(itemPreset0, date18);
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
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay24 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay24.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long25 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long35 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long46 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "00:00:00"+ "'", str48.equals("00:00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "00:00:00"+ "'", str49.equals("00:00:00"));
    org.junit.Assert.assertTrue("'" + partOfDay50 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay50.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test323"); }

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
    org.mafagafogigante.dungeon.game.Id id16 = battleRecord15.getId();
    
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
    org.junit.Assert.assertNull(id16);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test324"); }

    org.mafagafogigante.dungeon.stats.Statistics statistics0 = new org.mafagafogigante.dungeon.stats.Statistics();
    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics1 = statistics0.getBattleStatistics();
    java.lang.String str2 = battleStatistics1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(battleStatistics1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "BattleStatistics{records=CounterMap{map={}}}"+ "'", str2.equals("BattleStatistics{records=CounterMap{map={}}}"));

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test325"); }

    org.mafagafogigante.dungeon.game.Id id0 = null;
    org.mafagafogigante.dungeon.entity.items.BookComponent bookComponent2 = new org.mafagafogigante.dungeon.entity.items.BookComponent(id0, " : day 10 of month 1 of the year 1");
    java.lang.String str3 = bookComponent2.getText();
    java.lang.String str4 = bookComponent2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " : day 10 of month 1 of the year 1"+ "'", str3.equals(" : day 10 of month 1 of the year 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "This book teaches nothing. Text:  : day 10 of month 1 of the year 1"+ "'", str4.equals("This book teaches nothing. Text:  : day 10 of month 1 of the year 1"));

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test326"); }

    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics0 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point1 = null;
    org.mafagafogigante.dungeon.game.Id id2 = null;
    explorationStatistics0.createEntryIfNotExists(point1, id2);
    org.mafagafogigante.dungeon.game.Point point7 = new org.mafagafogigante.dungeon.game.Point(10, (int)'a', 0);
    java.lang.String[] str_array10 = new java.lang.String[] { "", "" };
    org.mafagafogigante.dungeon.util.Table table11 = new org.mafagafogigante.dungeon.util.Table(str_array10);
    boolean b12 = point7.equals((java.lang.Object)str_array10);
    org.mafagafogigante.dungeon.game.Id id13 = null;
    explorationStatistics0.addVisit(point7, id13);
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics15 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point16 = null;
    org.mafagafogigante.dungeon.game.Id id17 = null;
    explorationStatistics15.createEntryIfNotExists(point16, id17);
    org.mafagafogigante.dungeon.game.Point point22 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id23 = null;
    explorationStatistics15.addVisit(point22, id23);
    java.lang.String str25 = point22.toString();
    int i26 = point22.getZ();
    org.mafagafogigante.dungeon.game.Id id27 = null;
    explorationStatistics0.addVisit(point22, id27);
    org.mafagafogigante.dungeon.game.Id id29 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i30 = explorationStatistics0.getKillCount(id29);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{32, 0, -1}"+ "'", str25.equals("{32, 0, -1}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == (-1));

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test327"); }

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
    itemPreset0.setDrinkableDoses(10);
    
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

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test328"); }

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
    itemPreset0.setIntegrityDecrementOnEat((-1));
    org.mafagafogigante.dungeon.util.Percentage percentage15 = itemPreset0.getHitRate();
    int i16 = itemPreset0.getDrinkableDoses();
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
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test329"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, (-1), 0.0d);
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item4 = creatureInventory3.getItems();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item4);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test330"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.world.TimeVisibilityCriterion timeVisibilityCriterion2 = new org.mafagafogigante.dungeon.world.TimeVisibilityCriterion((int)(byte)10, 32);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test331"); }

    org.mafagafogigante.dungeon.entity.items.LocationInventory locationInventory0 = new org.mafagafogigante.dungeon.entity.items.LocationInventory();
    org.mafagafogigante.dungeon.entity.items.Item item1 = null;
    boolean b2 = locationInventory0.hasItem(item1);
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item3 = locationInventory0.getItems();
    int i4 = locationInventory0.getItemCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test332"); }

    org.mafagafogigante.dungeon.util.Percentage percentage0 = null;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity1 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage0);
    org.mafagafogigante.dungeon.entity.LightSource lightSource2 = new org.mafagafogigante.dungeon.entity.LightSource(luminosity1);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity3 = lightSource2.getLuminosity();
    java.lang.String str4 = lightSource2.toString();
    lightSource2.disable();
    java.lang.String str6 = lightSource2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Enabled LightSource of luminosity of null"+ "'", str4.equals("Enabled LightSource of luminosity of null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Disabled LightSource of luminosity of null"+ "'", str6.equals("Disabled LightSource of luminosity of null"));

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test333"); }

    org.mafagafogigante.dungeon.game.PartOfDay partOfDay0 = org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT;
    java.lang.String str1 = partOfDay0.toString();
    org.junit.Assert.assertTrue("'" + partOfDay0 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay0.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Midnight"+ "'", str1.equals("Midnight"));

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test334"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule0 = null;
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule1 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeVariableArrayRule(jsonRule0);
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule2 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeVariableArrayRule(jsonRule1);
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule3 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeVariableArrayRule(jsonRule2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule3);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test335"); }

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
    org.mafagafogigante.dungeon.util.Percentage percentage21 = new org.mafagafogigante.dungeon.util.Percentage((double)100);
    int i22 = percentage17.compareTo(percentage21);
    
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
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test336"); }

    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances0 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.Direction direction1 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b2 = blockedEntrances0.isBlocked(direction1);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances3 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.Direction direction4 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b6 = direction4.equalsIgnoreCase("");
    blockedEntrances3.block(direction4);
    blockedEntrances0.block(direction4);
    org.junit.Assert.assertTrue("'" + direction1 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction1.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + direction4 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction4.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test337"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity((int)(byte)1, (int)(byte)0);
    boolean b3 = integrity2.isMaximum();
    org.mafagafogigante.dungeon.entity.items.Item item4 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity5 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity2, item4);
    itemIntegrity5.incrementBy((int)(byte)0);
    itemIntegrity5.incrementBy((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage10 = itemIntegrity5.toPercentage();
    itemIntegrity5.decrementBy(0);
    org.mafagafogigante.dungeon.util.Percentage percentage13 = itemIntegrity5.toPercentage();
    int i14 = itemIntegrity5.getCurrent();
    // The following exception was thrown during execution in test generation
    try {
    itemIntegrity5.decrementBy(46800);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemIntegrity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test338"); }

    org.mafagafogigante.dungeon.achievements.Achievement achievement0 = null;
    org.mafagafogigante.dungeon.date.Date date4 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date8 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i9 = date4.compareTo(date8);
    long long10 = date8.getDay();
    java.lang.String str11 = date8.toTimeString();
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
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "00:00:00"+ "'", str11.equals("00:00:00"));

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test339"); }

    org.mafagafogigante.dungeon.game.DungeonString dungeonString1 = new org.mafagafogigante.dungeon.game.DungeonString("{100, 10, 10}");

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test340"); }

    boolean b1 = org.mafagafogigante.dungeon.commands.IssuedCommand.isValidSource("00:00:00");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test341"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    java.lang.String str3 = integrity2.toString();
    java.lang.String str4 = integrity2.toString();
    boolean b5 = integrity2.isMaximum();
    int i6 = integrity2.getMaximum();
    integrity2.decrementBy(97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0/1"+ "'", str3.equals("0/1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0/1"+ "'", str4.equals("0/1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test342"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    itemPreset0.setDrinkableHealing((int)(short)0);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset0.setVisibility(percentage4);
    int i6 = itemPreset0.getDrinkableDoses();
    org.mafagafogigante.dungeon.game.Id id7 = itemPreset0.getSpellId();
    itemPreset0.setDrinkableHealing(43200);
    org.mafagafogigante.dungeon.entity.Integrity integrity12 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    boolean b13 = integrity12.isMaximum();
    org.mafagafogigante.dungeon.entity.items.Item item14 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity15 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity12, item14);
    int i16 = itemIntegrity15.getMaximum();
    org.mafagafogigante.dungeon.util.Percentage percentage17 = itemIntegrity15.toPercentage();
    itemPreset0.setHitRate(percentage17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemIntegrity15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage17);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test343"); }

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
    java.lang.String str23 = creaturePreset0.getType();
    org.mafagafogigante.dungeon.util.Percentage percentage24 = creaturePreset0.getVisibility();
    org.mafagafogigante.dungeon.entity.Weight weight26 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)'#');
    org.mafagafogigante.dungeon.entity.Weight weight28 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)'#');
    org.mafagafogigante.dungeon.entity.Weight weight29 = weight26.add(weight28);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature30 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory33 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature30, (-1), 0.0d);
    org.mafagafogigante.dungeon.entity.Weight weight34 = creatureInventory33.getWeight();
    int i35 = creatureInventory33.getItemCount();
    int i36 = creatureInventory33.getItemCount();
    org.mafagafogigante.dungeon.entity.Weight weight37 = creatureInventory33.getWeightLimit();
    org.mafagafogigante.dungeon.stats.Statistics statistics38 = new org.mafagafogigante.dungeon.stats.Statistics();
    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics39 = statistics38.getBattleStatistics();
    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics40 = statistics38.getWorldStatistics();
    boolean b41 = weight37.equals((java.lang.Object)statistics38);
    org.mafagafogigante.dungeon.entity.Weight weight42 = weight26.add(weight37);
    org.mafagafogigante.dungeon.util.SystemInformation systemInformation43 = new org.mafagafogigante.dungeon.util.SystemInformation();
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString44 = systemInformation43.toColoredStringList();
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications45 = null;
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)systemInformation43, writingSpecifications45);
    java.lang.String str47 = systemInformation43.toString();
    java.lang.String str48 = systemInformation43.toString();
    java.lang.String str49 = systemInformation43.toString();
    boolean b50 = weight42.equals((java.lang.Object)str49);
    creaturePreset0.setWeight(weight42);
    
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
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(battleStatistics39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(worldStatistics40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "User: Nicholas\nTime: 15:44:00\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 36.8 MiB out of the allocated 109.5 MiB\nOS: Windows 10 (amd64) 10.0"+ "'", str47.equals("User: Nicholas\nTime: 15:44:00\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 36.8 MiB out of the allocated 109.5 MiB\nOS: Windows 10 (amd64) 10.0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "User: Nicholas\nTime: 15:44:00\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 36.8 MiB out of the allocated 109.5 MiB\nOS: Windows 10 (amd64) 10.0"+ "'", str48.equals("User: Nicholas\nTime: 15:44:00\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 36.8 MiB out of the allocated 109.5 MiB\nOS: Windows 10 (amd64) 10.0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "User: Nicholas\nTime: 15:44:00\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 36.8 MiB out of the allocated 109.5 MiB\nOS: Windows 10 (amd64) 10.0"+ "'", str49.equals("User: Nicholas\nTime: 15:44:00\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 36.8 MiB out of the allocated 109.5 MiB\nOS: Windows 10 (amd64) 10.0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test344"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date7 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i8 = date3.compareTo(date7);
    long long9 = date7.getDay();
    long long10 = date7.getHour();
    long long11 = date7.getMonth();
    long long12 = date7.getMonth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 10L);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test345"); }

    org.mafagafogigante.dungeon.stats.Statistics statistics0 = new org.mafagafogigante.dungeon.stats.Statistics();
    statistics0.writeStatistics();
    statistics0.writeStatistics();
    statistics0.writeStatistics();
    org.mafagafogigante.dungeon.commands.IssuedCommand issuedCommand5 = new org.mafagafogigante.dungeon.commands.IssuedCommand("BattleStatistics{records=CounterMap{map={}}}");
    org.mafagafogigante.dungeon.commands.PreparedIssuedCommand preparedIssuedCommand6 = org.mafagafogigante.dungeon.commands.IssuedCommandProcessor.prepareIssuedCommand(issuedCommand5);
    statistics0.addCommand(issuedCommand5);
    java.lang.String str8 = issuedCommand5.toString();
    org.mafagafogigante.dungeon.commands.IssuedCommandEvaluation issuedCommandEvaluation9 = org.mafagafogigante.dungeon.commands.IssuedCommandProcessor.evaluateIssuedCommand(issuedCommand5);
    org.mafagafogigante.dungeon.commands.PreparedIssuedCommand preparedIssuedCommand10 = org.mafagafogigante.dungeon.commands.IssuedCommandProcessor.prepareIssuedCommand(issuedCommand5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(preparedIssuedCommand6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "BattleStatistics{records=CounterMap{map={}}}"+ "'", str8.equals("BattleStatistics{records=CounterMap{map={}}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(issuedCommandEvaluation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(preparedIssuedCommand10);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test346"); }

    org.mafagafogigante.dungeon.commands.IssuedCommand issuedCommand1 = new org.mafagafogigante.dungeon.commands.IssuedCommand("100");
    org.mafagafogigante.dungeon.commands.PreparedIssuedCommand preparedIssuedCommand2 = org.mafagafogigante.dungeon.commands.IssuedCommandProcessor.prepareIssuedCommand(issuedCommand1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(preparedIssuedCommand2);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test347"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] creaturePresetFactory_array0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] {  };
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory1 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array0);
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory2 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array0);
    org.mafagafogigante.dungeon.game.Id id3 = null;
    org.mafagafogigante.dungeon.game.World world4 = null;
    org.mafagafogigante.dungeon.entity.creatures.Creature creature5 = creatureFactory2.makeCreature(id3, world4);
    java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.CreaturePreset> collection_creaturePreset6 = creatureFactory2.getPresets();
    java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.CreaturePreset> collection_creaturePreset7 = creatureFactory2.getPresets();
    org.mafagafogigante.dungeon.date.Date date11 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date15 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i16 = date11.compareTo(date15);
    java.lang.String str17 = date11.toTimeString();
    org.mafagafogigante.dungeon.date.Date date22 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date26 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i27 = date22.compareTo(date26);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay28 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date22);
    long long29 = date22.getYear();
    org.mafagafogigante.dungeon.date.Date date33 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date37 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i38 = date33.compareTo(date37);
    long long39 = date33.getYear();
    int i40 = date22.compareTo(date33);
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit42 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR;
    org.mafagafogigante.dungeon.date.Date date43 = date33.minus(35, dungeonTimeUnit42);
    org.mafagafogigante.dungeon.date.Date date44 = date11.plus((int)'a', dungeonTimeUnit42);
    org.mafagafogigante.dungeon.game.World world45 = null;
    org.mafagafogigante.dungeon.entity.creatures.Creature creature46 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory49 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature46, (-1), 0.0d);
    org.mafagafogigante.dungeon.entity.Weight weight50 = creatureInventory49.getWeight();
    int i51 = creatureInventory49.getItemCount();
    int i52 = creatureInventory49.getItemCount();
    org.mafagafogigante.dungeon.entity.Weight weight53 = creatureInventory49.getWeightLimit();
    org.mafagafogigante.dungeon.stats.Statistics statistics54 = new org.mafagafogigante.dungeon.stats.Statistics();
    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics55 = statistics54.getBattleStatistics();
    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics56 = statistics54.getWorldStatistics();
    boolean b57 = weight53.equals((java.lang.Object)statistics54);
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics58 = statistics54.getExplorationStatistics();
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.creatures.Hero hero59 = creatureFactory2.makeHero(date11, world45, statistics54);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creaturePresetFactory_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(creature5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_creaturePreset6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_creaturePreset7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "00:00:00"+ "'", str17.equals("00:00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay28 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay28.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long29 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long39 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit42 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR + "'", dungeonTimeUnit42.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(battleStatistics55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(worldStatistics56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(explorationStatistics58);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test348"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature1 = null;
    org.mafagafogigante.dungeon.entity.creatures.CreatureHealth creatureHealth2 = org.mafagafogigante.dungeon.entity.creatures.CreatureHealth.makeCreatureHealth(1, creature1);
    boolean b3 = creatureHealth2.isFull();
    int i4 = creatureHealth2.getMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creatureHealth2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test349"); }

    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics0 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point1 = null;
    org.mafagafogigante.dungeon.game.Id id2 = null;
    explorationStatistics0.createEntryIfNotExists(point1, id2);
    org.mafagafogigante.dungeon.game.Point point7 = new org.mafagafogigante.dungeon.game.Point(10, (int)'a', 0);
    java.lang.String[] str_array10 = new java.lang.String[] { "", "" };
    org.mafagafogigante.dungeon.util.Table table11 = new org.mafagafogigante.dungeon.util.Table(str_array10);
    boolean b12 = point7.equals((java.lang.Object)str_array10);
    org.mafagafogigante.dungeon.game.Id id13 = null;
    explorationStatistics0.addVisit(point7, id13);
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics15 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point16 = null;
    org.mafagafogigante.dungeon.game.Id id17 = null;
    explorationStatistics15.createEntryIfNotExists(point16, id17);
    org.mafagafogigante.dungeon.game.Point point22 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id23 = null;
    explorationStatistics15.addVisit(point22, id23);
    java.lang.String str25 = point22.toString();
    int i26 = point22.getZ();
    org.mafagafogigante.dungeon.game.Id id27 = null;
    explorationStatistics0.addVisit(point22, id27);
    org.mafagafogigante.dungeon.game.Point point32 = new org.mafagafogigante.dungeon.game.Point(10, (int)'a', 0);
    java.lang.String[] str_array35 = new java.lang.String[] { "", "" };
    org.mafagafogigante.dungeon.util.Table table36 = new org.mafagafogigante.dungeon.util.Table(str_array35);
    boolean b37 = point32.equals((java.lang.Object)str_array35);
    java.lang.String str38 = point32.toString();
    org.mafagafogigante.dungeon.game.Id id39 = null;
    explorationStatistics0.createEntryIfNotExists(point32, id39);
    org.mafagafogigante.dungeon.game.Id id41 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i42 = explorationStatistics0.getKillCount(id41);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{32, 0, -1}"+ "'", str25.equals("{32, 0, -1}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{10, 97, 0}"+ "'", str38.equals("{10, 97, 0}"));

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test350"); }

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
    itemPreset0.setIntegrityDecrementOnEat((-1));
    org.mafagafogigante.dungeon.util.Percentage percentage15 = itemPreset0.getHitRate();
    java.lang.String str16 = itemPreset0.getType();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset17 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    itemPreset17.setPutrefactionPeriod((long)32);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset20 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity21 = itemPreset20.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity22 = null;
    itemPreset20.setIntegrity(integrity22);
    org.mafagafogigante.dungeon.util.Percentage percentage24 = itemPreset20.getVisibility();
    java.lang.String str25 = itemPreset20.getType();
    itemPreset20.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage29 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset20.setVisibility(percentage29);
    org.mafagafogigante.dungeon.game.Id id31 = null;
    itemPreset20.setId(id31);
    itemPreset20.setPutrefactionPeriod((long)(short)1);
    org.mafagafogigante.dungeon.entity.items.Item.Tag tag35 = org.mafagafogigante.dungeon.entity.items.Item.Tag.DECOMPOSES;
    boolean b36 = itemPreset20.hasTag(tag35);
    boolean b37 = itemPreset17.hasTag(tag35);
    boolean b38 = itemPreset0.hasTag(tag35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    org.junit.Assert.assertTrue("'" + tag35 + "' != '" + org.mafagafogigante.dungeon.entity.items.Item.Tag.DECOMPOSES + "'", tag35.equals(org.mafagafogigante.dungeon.entity.items.Item.Tag.DECOMPOSES));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test351"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    boolean b5 = itemPreset0.isUnique();
    org.mafagafogigante.dungeon.game.Id id6 = null;
    itemPreset0.setId(id6);
    int i8 = itemPreset0.getIntegrityDecrementOnHit();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test352"); }

    org.mafagafogigante.dungeon.game.PartOfDay partOfDay0 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity1 = partOfDay0.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name2 = partOfDay0.getName();
    java.lang.String str4 = name2.getQuantifiedName((int)'a');
    java.lang.String str5 = name2.getSingular();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset7 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity8 = itemPreset7.getIntegrity();
    org.mafagafogigante.dungeon.util.Percentage percentage9 = itemPreset7.getVisibility();
    java.lang.String str10 = itemPreset7.getType();
    itemPreset7.setDrinkableHealing(10);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay13 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity14 = partOfDay13.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name15 = partOfDay13.getName();
    java.lang.String str17 = name15.getQuantifiedName((int)'a');
    java.lang.String str18 = name15.getSingular();
    java.lang.String str19 = name15.toString();
    java.lang.String str20 = name15.getSingular();
    itemPreset7.setName(name15);
    org.mafagafogigante.dungeon.game.QuantificationMode quantificationMode23 = org.mafagafogigante.dungeon.game.QuantificationMode.WORD;
    java.lang.String str24 = name15.getQuantifiedName(81, quantificationMode23);
    java.lang.String str25 = name2.getQuantifiedName(152, quantificationMode23);
    java.lang.String str27 = name2.getQuantifiedName((int)'#');
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
    org.junit.Assert.assertNull(integrity8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertTrue("'" + partOfDay13 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay13.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "a few Nights"+ "'", str17.equals("a few Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Night"+ "'", str18.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Night"+ "'", str19.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Night"+ "'", str20.equals("Night"));
    org.junit.Assert.assertTrue("'" + quantificationMode23 + "' != '" + org.mafagafogigante.dungeon.game.QuantificationMode.WORD + "'", quantificationMode23.equals(org.mafagafogigante.dungeon.game.QuantificationMode.WORD));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "a few Nights"+ "'", str24.equals("a few Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "a few Nights"+ "'", str25.equals("a few Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "a few Nights"+ "'", str27.equals("a few Nights"));

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test353"); }

    org.mafagafogigante.dungeon.io.Writer.write("35 kg");

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test354"); }

    java.util.List<java.lang.String> list_str0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.io.Split split1 = org.mafagafogigante.dungeon.io.Split.splitOnOn(list_str0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test355"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    itemPreset0.setIntegrityDecrementOnEat((-1));
    org.mafagafogigante.dungeon.entity.Weight weight4 = itemPreset0.getWeight();
    itemPreset0.setDrinkableHealing((int)(byte)1);
    int i7 = itemPreset0.getDamage();
    org.mafagafogigante.dungeon.entity.Weight weight8 = itemPreset0.getWeight();
    org.mafagafogigante.dungeon.game.Id id9 = itemPreset0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id9);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test356"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.util.library.AutomaticShuffledStringLibrary automaticShuffledStringLibrary1 = new org.mafagafogigante.dungeon.util.library.AutomaticShuffledStringLibrary("Spell : null");
      org.junit.Assert.fail("Expected exception of type org.mafagafogigante.dungeon.io.JsonObjectFactory.IllegalFilenameExtensionException");
    } catch (org.mafagafogigante.dungeon.io.JsonObjectFactory.IllegalFilenameExtensionException e) {
      // Expected exception.
    }

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test357"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    boolean b3 = integrity2.isMaximum();
    org.mafagafogigante.dungeon.entity.items.Item item4 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity5 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity2, item4);
    org.mafagafogigante.dungeon.util.Percentage percentage6 = itemIntegrity5.toPercentage();
    boolean b7 = itemIntegrity5.isBroken();
    java.lang.String str8 = itemIntegrity5.toString();
    boolean b9 = itemIntegrity5.isBroken();
    org.mafagafogigante.dungeon.util.Percentage percentage10 = itemIntegrity5.toPercentage();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemIntegrity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ItemIntegrity{integrity=0/1, item=null}"+ "'", str8.equals("ItemIntegrity{integrity=0/1, item=null}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage10);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test358"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule2 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeBoundIntegerRule(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule2);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test359"); }

    org.mafagafogigante.dungeon.util.ShuffledRange shuffledRange2 = new org.mafagafogigante.dungeon.util.ShuffledRange(0, 81);
    // The following exception was thrown during execution in test generation
    try {
    int i4 = shuffledRange2.get(100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test360"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date7 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i8 = date3.compareTo(date7);
    long long9 = date7.getDay();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay10 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    int i11 = org.mafagafogigante.dungeon.game.PartOfDay.getSecondsToNext(date7, partOfDay10);
    java.lang.String str12 = date7.toTimeString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 10L);
    org.junit.Assert.assertTrue("'" + partOfDay10 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay10.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "00:00:00"+ "'", str12.equals("00:00:00"));

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test361"); }

    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath0 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery1 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    battleStatisticsQuery1.setType("Damaged");
    battleStatisticsQuery1.setType("");
    boolean b6 = causeOfDeath0.equals((java.lang.Object)battleStatisticsQuery1);
    org.mafagafogigante.dungeon.game.Id id7 = null;
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery9 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath10 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    battleStatisticsQuery9.setCauseOfDeath(causeOfDeath10);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay12 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.stats.BattleRecord battleRecord13 = new org.mafagafogigante.dungeon.stats.BattleRecord(id7, "", causeOfDeath10, partOfDay12);
    boolean b14 = battleStatisticsQuery1.matches(battleRecord13);
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath15 = battleRecord13.getCauseOfDeath();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay16 = battleRecord13.getPartOfDay();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay17 = battleRecord13.getPartOfDay();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath10);
    org.junit.Assert.assertTrue("'" + partOfDay12 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay12.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath15);
    org.junit.Assert.assertTrue("'" + partOfDay16 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay16.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    org.junit.Assert.assertTrue("'" + partOfDay17 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay17.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test362"); }

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
    java.lang.String str37 = date36.toTimeString();
    
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
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "01:00:00"+ "'", str37.equals("01:00:00"));

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test363"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.util.Percentage percentage1 = org.mafagafogigante.dungeon.util.Percentage.fromString("This book teaches nothing. Text: Night");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test364"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity1 = itemPreset0.getLuminosity();
    org.mafagafogigante.dungeon.entity.Weight weight2 = itemPreset0.getWeight();
    org.mafagafogigante.dungeon.entity.Integrity integrity5 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    boolean b6 = integrity5.isMaximum();
    org.mafagafogigante.dungeon.entity.items.Item item7 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity8 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity5, item7);
    itemPreset0.setIntegrity(integrity5);
    int i10 = integrity5.getCurrent();
    boolean b11 = integrity5.isMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemIntegrity8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test365"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity2 = itemPreset0.getLuminosity();
    org.mafagafogigante.dungeon.util.Percentage percentage4 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset0.setVisibility(percentage4);
    org.mafagafogigante.dungeon.util.Percentage percentage6 = itemPreset0.getHitRate();
    int i7 = itemPreset0.getDamage();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test366"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, (int)(short)-1, (double)(short)-1);
    int i4 = creatureInventory3.getItemLimit();
    creatureInventory3.refreshItems();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test367"); }

    org.mafagafogigante.dungeon.commands.CommandHistory commandHistory0 = new org.mafagafogigante.dungeon.commands.CommandHistory();
    java.lang.String str2 = commandHistory0.getLastSimilarCommand("East");
    org.mafagafogigante.dungeon.commands.IssuedCommand issuedCommand4 = new org.mafagafogigante.dungeon.commands.IssuedCommand("BattleStatistics{records=CounterMap{map={}}}");
    org.mafagafogigante.dungeon.commands.PreparedIssuedCommand preparedIssuedCommand5 = org.mafagafogigante.dungeon.commands.IssuedCommandProcessor.prepareIssuedCommand(issuedCommand4);
    commandHistory0.addCommand(issuedCommand4);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str8 = commandHistory0.getLastSimilarCommand("Up");
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(preparedIssuedCommand5);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test368"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.util.Percentage percentage2 = itemPreset0.getVisibility();
    java.lang.String str3 = itemPreset0.getType();
    itemPreset0.setDrinkableHealing(10);
    org.mafagafogigante.dungeon.game.Id id6 = itemPreset0.getId();
    org.mafagafogigante.dungeon.entity.Weight weight8 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset9 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity10 = itemPreset9.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity11 = null;
    itemPreset9.setIntegrity(integrity11);
    org.mafagafogigante.dungeon.util.Percentage percentage13 = itemPreset9.getVisibility();
    boolean b14 = itemPreset9.isUnique();
    org.mafagafogigante.dungeon.entity.Weight weight16 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    org.mafagafogigante.dungeon.entity.Weight weight17 = org.mafagafogigante.dungeon.entity.Weight.ZERO;
    org.mafagafogigante.dungeon.entity.Weight weight18 = weight16.add(weight17);
    java.lang.String str19 = weight18.toString();
    itemPreset9.setWeight(weight18);
    int i21 = weight8.compareTo(weight18);
    org.mafagafogigante.dungeon.util.Percentage percentage23 = new org.mafagafogigante.dungeon.util.Percentage((double)10L);
    org.mafagafogigante.dungeon.entity.Weight weight24 = weight8.multiply(percentage23);
    itemPreset0.setWeight(weight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "0 kg"+ "'", str19.equals("0 kg"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight24);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test369"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    java.lang.String str5 = itemPreset0.getType();
    itemPreset0.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage9 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset0.setVisibility(percentage9);
    itemPreset0.setType("visibilityCriteria=VisibilityCriteria{[]}");
    int i13 = itemPreset0.getIntegrityDecrementPerDose();
    int i14 = itemPreset0.getIntegrityDecrementPerDose();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test370"); }

    org.mafagafogigante.dungeon.stats.Statistics statistics0 = new org.mafagafogigante.dungeon.stats.Statistics();
    statistics0.writeStatistics();
    statistics0.writeStatistics();
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker3 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics0);
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker4 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics0);
    int i5 = achievementTracker4.getUnlockedCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

//  @Test
//  public void test371() throws Throwable {
//
//    if (debug) { System.out.format("%n%s%n","RegressionTest1.test371"); }
//
//    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
//    org.mafagafogigante.dungeon.game.Id id1 = null;
//    creaturePreset0.setWeaponId(id1);
//    creaturePreset0.setAttack(57);
//    org.mafagafogigante.dungeon.entity.Luminosity luminosity5 = creaturePreset0.getLuminosity();
//    creaturePreset0.setInventoryItemLimit(57);
//    org.mafagafogigante.dungeon.entity.creatures.Drop[] drop_array8 = new org.mafagafogigante.dungeon.entity.creatures.Drop[] {  };
//    java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop> arraylist_drop9 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop>();
//    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop9, drop_array8);
//    creaturePreset0.setDropList((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop9);
//    org.mafagafogigante.dungeon.util.Percentage percentage12 = creaturePreset0.getVisibility();
//    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset13 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
//    org.mafagafogigante.dungeon.game.Id id14 = null;
//    creaturePreset13.setWeaponId(id14);
//    org.mafagafogigante.dungeon.game.Id id16 = creaturePreset13.getId();
//    org.mafagafogigante.dungeon.entity.Luminosity luminosity17 = creaturePreset13.getLuminosity();
//    org.mafagafogigante.dungeon.entity.creatures.Drop[] drop_array18 = new org.mafagafogigante.dungeon.entity.creatures.Drop[] {  };
//    java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop> arraylist_drop19 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop>();
//    boolean b20 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop19, drop_array18);
//    creaturePreset13.setDropList((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop19);
//    creaturePreset0.setDropList((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop19);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNotNull(luminosity5);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNotNull(drop_array8);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertTrue(b10 == false);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNull(percentage12);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNull(id16);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNotNull(luminosity17);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNotNull(drop_array18);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertTrue(b20 == false);
//
//  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test372"); }

    org.mafagafogigante.dungeon.entity.items.FoodComponent foodComponent2 = new org.mafagafogigante.dungeon.entity.items.FoodComponent((int)(short)1, (int)(byte)10);
    int i3 = foodComponent2.getIntegrityDecrementOnEat();
    int i4 = foodComponent2.getNutrition();
    int i5 = foodComponent2.getIntegrityDecrementOnEat();
    int i6 = foodComponent2.getIntegrityDecrementOnEat();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test373"); }

    org.mafagafogigante.dungeon.commands.CommandDescription commandDescription2 = new org.mafagafogigante.dungeon.commands.CommandDescription("BattleStatistics{records=CounterMap{map={}}}", "0 ms");

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test374"); }

    org.mafagafogigante.dungeon.game.DungeonString dungeonString1 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString1.append(str_array6);
    java.lang.String[] str_array13 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table14 = new org.mafagafogigante.dungeon.util.Table(str_array13);
    dungeonString1.append(str_array13);
    org.mafagafogigante.dungeon.util.Table table16 = new org.mafagafogigante.dungeon.util.Table(str_array13);
    org.mafagafogigante.dungeon.wiki.WikiSearcher.search(str_array13);
    org.mafagafogigante.dungeon.wiki.WikiSearcher.search(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test375"); }

    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics0 = new org.mafagafogigante.dungeon.stats.BattleStatistics();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement1 = null;
    boolean b2 = battleStatistics0.satisfies(battleStatisticsRequirement1);
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery3 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement5 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement(battleStatisticsQuery3, (int)(byte)100);
    boolean b6 = battleStatistics0.satisfies(battleStatisticsRequirement5);
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery7 = battleStatisticsRequirement5.getQuery();
    int i8 = battleStatisticsRequirement5.getCount();
    java.lang.String str9 = battleStatisticsRequirement5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(battleStatisticsQuery7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "BattleStatisticsRequirement{query=BattleStatisticsQuery{id=null, type='null', causeOfDeath=null, partOfDay=null}, count=100}"+ "'", str9.equals("BattleStatisticsRequirement{query=BattleStatisticsQuery{id=null, type='null', causeOfDeath=null, partOfDay=null}, count=100}"));

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test376"); }

    org.mafagafogigante.dungeon.game.DungeonString dungeonString1 = new org.mafagafogigante.dungeon.game.DungeonString("User: Nicholas\nTime: 15:42:10\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 19.7 MiB out of the allocated 123.0 MiB\nOS: Windows 10 (amd64) 10.0");

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test377"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date((long)97, (long)(byte)-1, (long)'#');
    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics4 = new org.mafagafogigante.dungeon.stats.BattleStatistics();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement5 = null;
    boolean b6 = battleStatistics4.satisfies(battleStatisticsRequirement5);
    java.lang.String str7 = battleStatistics4.toString();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery8 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement10 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement(battleStatisticsQuery8, (int)(byte)100);
    boolean b11 = battleStatistics4.satisfies(battleStatisticsRequirement10);
    org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.CauseOfDeath> countermap_causeOfDeath12 = battleStatistics4.getKillsByCauseOfDeath();
    org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.CauseOfDeath> countermap_causeOfDeath13 = battleStatistics4.getKillsByCauseOfDeath();
    boolean b14 = date3.equals((java.lang.Object)countermap_causeOfDeath13);
    org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath typeOfCauseOfDeath15 = org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath.SPELL;
    java.lang.String str16 = typeOfCauseOfDeath15.toString();
    java.lang.String str17 = typeOfCauseOfDeath15.toString();
    org.mafagafogigante.dungeon.game.Id id18 = null;
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath19 = new org.mafagafogigante.dungeon.stats.CauseOfDeath(typeOfCauseOfDeath15, id18);
    // The following exception was thrown during execution in test generation
    try {
    int i20 = countermap_causeOfDeath13.getCounter(causeOfDeath19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "BattleStatistics{records=CounterMap{map={}}}"+ "'", str7.equals("BattleStatistics{records=CounterMap{map={}}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_causeOfDeath12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_causeOfDeath13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    org.junit.Assert.assertTrue("'" + typeOfCauseOfDeath15 + "' != '" + org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath.SPELL + "'", typeOfCauseOfDeath15.equals(org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath.SPELL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Spell"+ "'", str16.equals("Spell"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Spell"+ "'", str17.equals("Spell"));

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test378"); }

    boolean b1 = org.mafagafogigante.dungeon.game.Random.roll((double)57600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test379"); }

    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances0 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.Direction direction1 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b3 = direction1.equalsIgnoreCase("");
    blockedEntrances0.block(direction1);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances5 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.Direction direction6 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b7 = blockedEntrances5.isBlocked(direction6);
    org.mafagafogigante.dungeon.game.Direction direction8 = org.mafagafogigante.dungeon.game.Direction.WEST;
    boolean b9 = blockedEntrances5.isBlocked(direction8);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances10 = new org.mafagafogigante.dungeon.game.BlockedEntrances(blockedEntrances5);
    org.mafagafogigante.dungeon.game.Direction direction11 = org.mafagafogigante.dungeon.game.Direction.NORTH;
    boolean b12 = blockedEntrances10.isBlocked(direction11);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances13 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.Direction direction14 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b15 = blockedEntrances13.isBlocked(direction14);
    boolean b17 = direction14.equalsIgnoreCase("");
    blockedEntrances10.block(direction14);
    org.mafagafogigante.dungeon.game.Point point19 = direction14.getOffset();
    boolean b20 = blockedEntrances0.isBlocked(direction14);
    org.junit.Assert.assertTrue("'" + direction1 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction1.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    org.junit.Assert.assertTrue("'" + direction6 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction6.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    org.junit.Assert.assertTrue("'" + direction8 + "' != '" + org.mafagafogigante.dungeon.game.Direction.WEST + "'", direction8.equals(org.mafagafogigante.dungeon.game.Direction.WEST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    org.junit.Assert.assertTrue("'" + direction11 + "' != '" + org.mafagafogigante.dungeon.game.Direction.NORTH + "'", direction11.equals(org.mafagafogigante.dungeon.game.Direction.NORTH));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    org.junit.Assert.assertTrue("'" + direction14 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction14.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test380"); }

    org.mafagafogigante.dungeon.game.PartOfDay partOfDay0 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity1 = partOfDay0.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name2 = partOfDay0.getName();
    java.lang.String str4 = name2.getQuantifiedName((int)'a');
    java.lang.String str5 = name2.getSingular();
    java.lang.String str6 = name2.toString();
    java.lang.String str7 = name2.getSingular();
    java.lang.String str8 = name2.getPlural();
    java.lang.String str9 = name2.getPlural();
    java.lang.String str11 = name2.getQuantifiedName(20601);
    java.lang.String str12 = name2.getPlural();
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
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Night"+ "'", str7.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nights"+ "'", str8.equals("Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nights"+ "'", str9.equals("Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "a few Nights"+ "'", str11.equals("a few Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nights"+ "'", str12.equals("Nights"));

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test381"); }

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
    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array11 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria12 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array11);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature13 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer14 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature13);
    boolean b15 = visibilityCriteria12.isMetBy(observer14);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array16 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item17 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item17, item_array16);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString20 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    observer14.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item17, dungeonString20);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString23 = new org.mafagafogigante.dungeon.game.DungeonString("");
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString24 = dungeonString23.toColoredStringList();
    observer3.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item17, dungeonString23);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature26 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory29 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature26, 0, (double)35);
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item30 = creatureInventory29.getItems();
    org.mafagafogigante.dungeon.game.DungeonString dungeonString32 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array37 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString32.append(str_array37);
    java.lang.String[] str_array44 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table45 = new org.mafagafogigante.dungeon.util.Table(str_array44);
    dungeonString32.append(str_array44);
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications49 = new org.mafagafogigante.dungeon.gui.WritingSpecifications(false, 32);
    boolean b50 = writingSpecifications49.shouldWait();
    int i51 = writingSpecifications49.getWait();
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)dungeonString32, writingSpecifications49);
    observer3.writeItemSight(list_item30, dungeonString32);
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
    org.junit.Assert.assertNotNull(visibilityCriterion_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 32);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test382"); }

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
    org.mafagafogigante.dungeon.entity.creatures.Creature creature17 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory20 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature17, 0, (double)35);
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item21 = creatureInventory20.getItems();
    org.mafagafogigante.dungeon.game.DungeonString dungeonString23 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array28 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString23.append(str_array28);
    java.lang.String str30 = dungeonString23.toString();
    observer3.writeItemSight(list_item21, dungeonString23);
    org.mafagafogigante.dungeon.entity.creatures.Hero hero32 = null;
    org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster heroSpellcaster33 = new org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster(hero32);
    java.util.List<org.mafagafogigante.dungeon.spells.Spell> list_spell34 = heroSpellcaster33.getSpellList();
    java.lang.String[] str_array35 = new java.lang.String[] {  };
    heroSpellcaster33.parseCast(str_array35);
    org.mafagafogigante.dungeon.spells.Spell spell37 = null;
    boolean b38 = heroSpellcaster33.knowsSpell(spell37);
    org.mafagafogigante.dungeon.entity.creatures.Hero hero39 = null;
    org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster heroSpellcaster40 = new org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster(hero39);
    java.util.List<org.mafagafogigante.dungeon.spells.Spell> list_spell41 = heroSpellcaster40.getSpellList();
    java.lang.String[] str_array47 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table48 = new org.mafagafogigante.dungeon.util.Table(str_array47);
    heroSpellcaster40.parseCast(str_array47);
    heroSpellcaster33.parseCast(str_array47);
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item51 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems(list_item21, str_array47);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.achievements.AchievementTrackerWriter.parseCommand(str_array47);
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
    org.junit.Assert.assertNotNull(list_item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"+ "'", str30.equals("DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_spell34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_spell41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item51);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test383"); }

    org.mafagafogigante.dungeon.game.Point point3 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    int i4 = point3.getY();
    int i5 = point3.getX();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 32);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test384"); }

    org.mafagafogigante.dungeon.util.CounterMap<java.util.RandomAccess> countermap_randomAccess0 = new org.mafagafogigante.dungeon.util.CounterMap<java.util.RandomAccess>();
    java.lang.String[] str_array4 = new java.lang.String[] { "Damaged", "visibilityCriteria=VisibilityCriteria{[]}", "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    org.mafagafogigante.dungeon.io.Split split7 = org.mafagafogigante.dungeon.io.Split.splitOnOn((java.util.List<java.lang.String>)arraylist_str5);
    org.mafagafogigante.dungeon.io.Split split8 = org.mafagafogigante.dungeon.io.Split.splitOnOn((java.util.List<java.lang.String>)arraylist_str5);
    countermap_randomAccess0.incrementCounter((java.util.RandomAccess)arraylist_str5, (java.lang.Integer)3600);
    java.util.Spliterator<java.util.RandomAccess> spliterator_randomAccess11 = countermap_randomAccess0.spliterator();
    java.util.Set<java.util.RandomAccess> set_randomAccess12 = countermap_randomAccess0.keySet();
    java.util.Spliterator<java.util.RandomAccess> spliterator_randomAccess13 = countermap_randomAccess0.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(split7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(split8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_randomAccess11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_randomAccess12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_randomAccess13);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test385"); }

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
    org.mafagafogigante.dungeon.entity.TagSet<org.mafagafogigante.dungeon.entity.items.Item.Tag> tagset_tag15 = itemPreset0.getTagSet();
    org.mafagafogigante.dungeon.entity.Integrity integrity18 = new org.mafagafogigante.dungeon.entity.Integrity((int)(byte)1, (int)(byte)0);
    boolean b19 = integrity18.isMaximum();
    itemPreset0.setIntegrity(integrity18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tagset_tag15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test386"); }

    org.mafagafogigante.dungeon.stats.Statistics statistics0 = new org.mafagafogigante.dungeon.stats.Statistics();
    statistics0.writeStatistics();
    statistics0.writeStatistics();
    statistics0.writeStatistics();
    org.mafagafogigante.dungeon.commands.IssuedCommand issuedCommand5 = new org.mafagafogigante.dungeon.commands.IssuedCommand("BattleStatistics{records=CounterMap{map={}}}");
    org.mafagafogigante.dungeon.commands.PreparedIssuedCommand preparedIssuedCommand6 = org.mafagafogigante.dungeon.commands.IssuedCommandProcessor.prepareIssuedCommand(issuedCommand5);
    statistics0.addCommand(issuedCommand5);
    org.mafagafogigante.dungeon.util.StopWatch stopWatch8 = new org.mafagafogigante.dungeon.util.StopWatch();
    java.util.concurrent.TimeUnit timeUnit9 = null;
    java.lang.String str10 = stopWatch8.toString(timeUnit9);
    java.lang.String str11 = stopWatch8.toString();
    java.util.concurrent.TimeUnit timeUnit12 = null;
    java.lang.String str13 = stopWatch8.toString(timeUnit12);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.game.Game.renderTurn(issuedCommand5, stopWatch8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(preparedIssuedCommand6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0 ms"+ "'", str11.equals("0 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test387"); }

    org.mafagafogigante.dungeon.util.Percentage percentage1 = new org.mafagafogigante.dungeon.util.Percentage((double)10L);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity2 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage1);

  }

//  @Test
//  public void test388() throws Throwable {
//
//    if (debug) { System.out.format("%n%s%n","RegressionTest1.test388"); }
//
//    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
//    org.mafagafogigante.dungeon.game.Id id1 = null;
//    creaturePreset0.setWeaponId(id1);
//    creaturePreset0.setAttack(57);
//    org.mafagafogigante.dungeon.entity.Luminosity luminosity5 = creaturePreset0.getLuminosity();
//    creaturePreset0.setInventoryItemLimit(57);
//    org.mafagafogigante.dungeon.game.Id id8 = creaturePreset0.getId();
//    java.util.List<org.mafagafogigante.dungeon.entity.creatures.Drop> list_drop9 = null;
//    creaturePreset0.setDropList(list_drop9);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNotNull(luminosity5);
//    
//    // Regression assertion (captures the current behavior of the code)
//    org.junit.Assert.assertNull(id8);
//
//  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test389"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.world.TimeVisibilityCriterion timeVisibilityCriterion2 = new org.mafagafogigante.dungeon.world.TimeVisibilityCriterion((int)'a', 57);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test390"); }

    org.mafagafogigante.dungeon.stats.Statistics statistics0 = new org.mafagafogigante.dungeon.stats.Statistics();
    statistics0.writeStatistics();
    statistics0.writeStatistics();
    statistics0.writeStatistics();
    org.mafagafogigante.dungeon.commands.IssuedCommand issuedCommand5 = new org.mafagafogigante.dungeon.commands.IssuedCommand("BattleStatistics{records=CounterMap{map={}}}");
    org.mafagafogigante.dungeon.commands.PreparedIssuedCommand preparedIssuedCommand6 = org.mafagafogigante.dungeon.commands.IssuedCommandProcessor.prepareIssuedCommand(issuedCommand5);
    statistics0.addCommand(issuedCommand5);
    org.mafagafogigante.dungeon.commands.IssuedCommandEvaluation issuedCommandEvaluation8 = org.mafagafogigante.dungeon.commands.IssuedCommandProcessor.evaluateIssuedCommand(issuedCommand5);
    org.mafagafogigante.dungeon.commands.IssuedCommandEvaluation issuedCommandEvaluation9 = org.mafagafogigante.dungeon.commands.IssuedCommandProcessor.evaluateIssuedCommand(issuedCommand5);
    boolean b10 = issuedCommandEvaluation9.isValid();
    boolean b11 = issuedCommandEvaluation9.isValid();
    boolean b12 = issuedCommandEvaluation9.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(preparedIssuedCommand6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(issuedCommandEvaluation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(issuedCommandEvaluation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test391"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.util.CircularList<java.lang.Comparable<java.lang.String>> circularlist_comparable_str1 = new org.mafagafogigante.dungeon.util.CircularList<java.lang.Comparable<java.lang.String>>((int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test392"); }

    org.mafagafogigante.dungeon.entity.items.ItemPresetFactory[] itemPresetFactory_array0 = new org.mafagafogigante.dungeon.entity.items.ItemPresetFactory[] {  };
    org.mafagafogigante.dungeon.entity.items.ItemFactory itemFactory1 = new org.mafagafogigante.dungeon.entity.items.ItemFactory(itemPresetFactory_array0);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature2 = null;
    org.mafagafogigante.dungeon.date.Date date6 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    java.lang.String str7 = date6.toDateString();
    org.mafagafogigante.dungeon.date.Date date11 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date15 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i16 = date11.compareTo(date15);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay17 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date11);
    long long18 = date11.getYear();
    int i19 = date6.compareTo(date11);
    java.lang.String str20 = date11.toTimeString();
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.items.Item item21 = itemFactory1.makeCorpse(creature2, date11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemPresetFactory_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "day 10 of month 10 of the year 10"+ "'", str7.equals("day 10 of month 10 of the year 10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay17 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay17.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "00:00:00"+ "'", str20.equals("00:00:00"));

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test393"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, (-1), 0.0d);
    org.mafagafogigante.dungeon.entity.Weight weight4 = creatureInventory3.getWeight();
    org.mafagafogigante.dungeon.entity.Weight weight5 = creatureInventory3.getWeightLimit();
    org.mafagafogigante.dungeon.entity.items.Item item6 = null;
    // The following exception was thrown during execution in test generation
    try {
    creatureInventory3.removeItem(item6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight5);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test394"); }

    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics0 = new org.mafagafogigante.dungeon.stats.BattleStatistics();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement1 = null;
    boolean b2 = battleStatistics0.satisfies(battleStatisticsRequirement1);
    java.lang.String str3 = battleStatistics0.toString();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery4 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement6 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement(battleStatisticsQuery4, (int)(byte)100);
    boolean b7 = battleStatistics0.satisfies(battleStatisticsRequirement6);
    org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.CauseOfDeath> countermap_causeOfDeath8 = battleStatistics0.getKillsByCauseOfDeath();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery9 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement11 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement(battleStatisticsQuery9, (int)(byte)100);
    int i12 = battleStatisticsRequirement11.getCount();
    java.lang.String str13 = battleStatisticsRequirement11.toString();
    boolean b14 = battleStatistics0.satisfies(battleStatisticsRequirement11);
    java.lang.String str15 = battleStatisticsRequirement11.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "BattleStatistics{records=CounterMap{map={}}}"+ "'", str3.equals("BattleStatistics{records=CounterMap{map={}}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_causeOfDeath8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "BattleStatisticsRequirement{query=BattleStatisticsQuery{id=null, type='null', causeOfDeath=null, partOfDay=null}, count=100}"+ "'", str13.equals("BattleStatisticsRequirement{query=BattleStatisticsQuery{id=null, type='null', causeOfDeath=null, partOfDay=null}, count=100}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "BattleStatisticsRequirement{query=BattleStatisticsQuery{id=null, type='null', causeOfDeath=null, partOfDay=null}, count=100}"+ "'", str15.equals("BattleStatisticsRequirement{query=BattleStatisticsQuery{id=null, type='null', causeOfDeath=null, partOfDay=null}, count=100}"));

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test395"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date((long)97, (long)(byte)-1, (long)'#');
    long long4 = date3.getTime();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay5 = org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT;
    org.mafagafogigante.dungeon.game.Name name6 = partOfDay5.getName();
    int i7 = org.mafagafogigante.dungeon.game.PartOfDay.getSecondsToNext(date3, partOfDay5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 830217600000L);
    org.junit.Assert.assertTrue("'" + partOfDay5 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay5.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 82800);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test396"); }

    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath0 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery1 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    battleStatisticsQuery1.setType("Damaged");
    battleStatisticsQuery1.setType("");
    boolean b6 = causeOfDeath0.equals((java.lang.Object)battleStatisticsQuery1);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay7 = org.mafagafogigante.dungeon.game.PartOfDay.AFTERNOON;
    battleStatisticsQuery1.setPartOfDay(partOfDay7);
    java.lang.String str9 = partOfDay7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    org.junit.Assert.assertTrue("'" + partOfDay7 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.AFTERNOON + "'", partOfDay7.equals(org.mafagafogigante.dungeon.game.PartOfDay.AFTERNOON));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Afternoon"+ "'", str9.equals("Afternoon"));

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test397"); }

    org.mafagafogigante.dungeon.entity.creatures.Hero hero0 = null;
    org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster heroSpellcaster1 = new org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster(hero0);
    org.mafagafogigante.dungeon.spells.Spell spell2 = null;
    boolean b3 = heroSpellcaster1.knowsSpell(spell2);
    org.mafagafogigante.dungeon.spells.Spell spell4 = null;
    boolean b5 = heroSpellcaster1.knowsSpell(spell4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test398"); }

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
    org.mafagafogigante.dungeon.game.Direction direction25 = direction23.invert();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == (-1));
    org.junit.Assert.assertTrue("'" + direction23 + "' != '" + org.mafagafogigante.dungeon.game.Direction.UP + "'", direction23.equals(org.mafagafogigante.dungeon.game.Direction.UP));
    org.junit.Assert.assertTrue("'" + direction25 + "' != '" + org.mafagafogigante.dungeon.game.Direction.DOWN + "'", direction25.equals(org.mafagafogigante.dungeon.game.Direction.DOWN));

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test399"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity1 = itemPreset0.getLuminosity();
    org.mafagafogigante.dungeon.entity.Integrity integrity4 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    java.lang.String str5 = integrity4.toString();
    itemPreset0.setIntegrity(integrity4);
    int i7 = integrity4.getCurrent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0/1"+ "'", str5.equals("0/1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test400"); }

    org.mafagafogigante.dungeon.entity.items.ItemPresetFactory[] itemPresetFactory_array0 = new org.mafagafogigante.dungeon.entity.items.ItemPresetFactory[] {  };
    org.mafagafogigante.dungeon.entity.items.ItemFactory itemFactory1 = new org.mafagafogigante.dungeon.entity.items.ItemFactory(itemPresetFactory_array0);
    org.mafagafogigante.dungeon.game.Id id2 = null;
    org.mafagafogigante.dungeon.date.Date date9 = new org.mafagafogigante.dungeon.date.Date(1L, (long)100, (long)(short)1, (long)(byte)100, (long)' ', (long)'#');
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.items.Item item10 = itemFactory1.makeItem(id2, date9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemPresetFactory_array0);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test401"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.util.Percentage percentage2 = itemPreset0.getVisibility();
    java.lang.String str3 = itemPreset0.getType();
    org.mafagafogigante.dungeon.game.Name name4 = itemPreset0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(name4);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test402"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    java.lang.String str3 = integrity2.toString();
    java.lang.String str4 = integrity2.toString();
    boolean b5 = integrity2.isMaximum();
    int i6 = integrity2.getMaximum();
    int i7 = integrity2.getCurrent();
    org.mafagafogigante.dungeon.entity.items.Item item8 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity9 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity2, item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0/1"+ "'", str3.equals("0/1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0/1"+ "'", str4.equals("0/1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemIntegrity9);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test403"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date7 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i8 = date3.compareTo(date7);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay9 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date3);
    java.lang.String[] str_array15 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table16 = new org.mafagafogigante.dungeon.util.Table(str_array15);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString17 = table16.toColoredStringList();
    org.mafagafogigante.dungeon.game.ColoredString coloredString18 = org.mafagafogigante.dungeon.game.Random.select(list_coloredString17);
    boolean b19 = date3.equals((java.lang.Object)coloredString18);
    java.awt.Color color20 = coloredString18.getColor();
    java.lang.String str21 = coloredString18.toString();
    
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
    org.junit.Assert.assertNotNull(color20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "ColoredString{string='hi!|visibilityCriteria=VisibilityCriteria{[]} |visibilityCriteria=VisibilityCriteria{[]}|Damaged|hi!\n---|------------------------------------------|-----------------------------------------|-------|---\n', color=java.awt.Color[r=192,g=192,b=192]}"+ "'", str21.equals("ColoredString{string='hi!|visibilityCriteria=VisibilityCriteria{[]} |visibilityCriteria=VisibilityCriteria{[]}|Damaged|hi!\n---|------------------------------------------|-----------------------------------------|-------|---\n', color=java.awt.Color[r=192,g=192,b=192]}"));

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test404"); }

    org.mafagafogigante.dungeon.entity.items.Item[] item_array0 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item1 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item1, item_array0);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString4 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString4.append(str_array9);
    java.lang.String str11 = dungeonString4.toString();
    org.mafagafogigante.dungeon.game.Point point15 = new org.mafagafogigante.dungeon.game.Point(10, (int)'a', 0);
    java.lang.String[] str_array18 = new java.lang.String[] { "", "" };
    org.mafagafogigante.dungeon.util.Table table19 = new org.mafagafogigante.dungeon.util.Table(str_array18);
    boolean b20 = point15.equals((java.lang.Object)str_array18);
    dungeonString4.append(str_array18);
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item22 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item1, str_array18);
    org.mafagafogigante.dungeon.util.Table table23 = new org.mafagafogigante.dungeon.util.Table(str_array18);
    org.mafagafogigante.dungeon.wiki.WikiSearcher.search(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"+ "'", str11.equals("DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item22);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test405"); }

    org.mafagafogigante.dungeon.util.Percentage percentage0 = null;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity1 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage0);
    org.mafagafogigante.dungeon.entity.LightSource lightSource2 = new org.mafagafogigante.dungeon.entity.LightSource(luminosity1);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity3 = lightSource2.getLuminosity();
    lightSource2.enable();
    lightSource2.disable();
    java.lang.String str6 = lightSource2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Disabled LightSource of luminosity of null"+ "'", str6.equals("Disabled LightSource of luminosity of null"));

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test406"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.game.Id id1 = new org.mafagafogigante.dungeon.game.Id("Sky{astronomicalBodies=[the Sun, a large, golden, spherical body, Mino, a small, dull white spherical body, Sario, a very small, green-tinted, perfectly spherical body]}");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test407"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity((int)(byte)1, (int)(byte)0);
    boolean b3 = integrity2.isMaximum();
    org.mafagafogigante.dungeon.entity.items.Item item4 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity5 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity2, item4);
    itemIntegrity5.incrementBy((int)(byte)0);
    itemIntegrity5.incrementBy((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage10 = itemIntegrity5.toPercentage();
    itemIntegrity5.decrementBy(0);
    org.mafagafogigante.dungeon.util.Percentage percentage13 = itemIntegrity5.toPercentage();
    boolean b14 = itemIntegrity5.isBroken();
    org.mafagafogigante.dungeon.util.Percentage percentage15 = itemIntegrity5.toPercentage();
    boolean b16 = itemIntegrity5.isPerfect();
    java.lang.String str17 = itemIntegrity5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemIntegrity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ItemIntegrity{integrity=1/1, item=null}"+ "'", str17.equals("ItemIntegrity{integrity=1/1, item=null}"));

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test408"); }

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
    int i19 = itemPreset0.getIntegrityDecrementOnEat();
    java.lang.String str20 = itemPreset0.getText();
    org.mafagafogigante.dungeon.game.Id id21 = itemPreset0.getId();
    
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
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id21);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test409"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, 32, (double)'4');
    org.mafagafogigante.dungeon.entity.Weight weight4 = creatureInventory3.getWeight();
    int i5 = creatureInventory3.getItemCount();
    org.mafagafogigante.dungeon.entity.items.Item item6 = null;
    // The following exception was thrown during execution in test generation
    try {
    creatureInventory3.removeItem(item6);
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
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test410"); }

    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array0 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria1 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array0);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature2 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer3 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature2);
    boolean b4 = visibilityCriteria1.isMetBy(observer3);
    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array5 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria6 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array5);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature7 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer8 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature7);
    boolean b9 = visibilityCriteria6.isMetBy(observer8);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array10 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item11 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item11, item_array10);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString14 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array19 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString14.append(str_array19);
    observer8.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item11, dungeonString14);
    org.mafagafogigante.dungeon.entity.creatures.Creature[] creature_array22 = new org.mafagafogigante.dungeon.entity.creatures.Creature[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Creature> arraylist_creature23 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Creature>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.Creature>)arraylist_creature23, creature_array22);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString26 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array31 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString26.append(str_array31);
    java.lang.String str33 = dungeonString26.toString();
    org.mafagafogigante.dungeon.game.Point point37 = new org.mafagafogigante.dungeon.game.Point(10, (int)'a', 0);
    java.lang.String[] str_array40 = new java.lang.String[] { "", "" };
    org.mafagafogigante.dungeon.util.Table table41 = new org.mafagafogigante.dungeon.util.Table(str_array40);
    boolean b42 = point37.equals((java.lang.Object)str_array40);
    dungeonString26.append(str_array40);
    observer8.writeCreatureSight((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Creature>)arraylist_creature23, dungeonString26);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString46 = new org.mafagafogigante.dungeon.game.DungeonString("");
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString47 = dungeonString46.toColoredStringList();
    observer3.writeCreatureSight((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Creature>)arraylist_creature23, dungeonString46);
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications51 = new org.mafagafogigante.dungeon.gui.WritingSpecifications(false, 46800);
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)dungeonString46, writingSpecifications51);
    org.mafagafogigante.dungeon.io.Writer.writeAndWait((org.mafagafogigante.dungeon.game.Writable)dungeonString46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creature_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"+ "'", str33.equals("DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString47);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test411"); }

    org.mafagafogigante.dungeon.logging.DungeonLogger.warning("User: Nicholas\nTime: 15:42:11\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 35.0 MiB out of the allocated 123.0 MiB\nOS: Windows 10 (amd64) 10.0");

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test412"); }

    org.mafagafogigante.dungeon.io.Sleeper.sleep(10L);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test413"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.game.Id id1 = new org.mafagafogigante.dungeon.game.Id("User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 34.4 MiB out of the allocated 123.0 MiB\nOS: Windows 10 (amd64) 10.0");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test414"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature1 = null;
    org.mafagafogigante.dungeon.entity.creatures.CreatureHealth creatureHealth2 = org.mafagafogigante.dungeon.entity.creatures.CreatureHealth.makeCreatureHealth(100, creature1);
    int i3 = creatureHealth2.getMaximum();
    int i4 = creatureHealth2.getCurrent();
    int i5 = creatureHealth2.getCurrent();
    int i6 = creatureHealth2.getMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creatureHealth2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test415"); }

    org.mafagafogigante.dungeon.logging.DungeonLogger.fine("LocationDescription{symbol=a, color=null, info='You don't discover anything.'}");

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test416"); }

    org.mafagafogigante.dungeon.stats.Statistics statistics0 = new org.mafagafogigante.dungeon.stats.Statistics();
    statistics0.writeStatistics();
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker2 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics0);
    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics3 = statistics0.getBattleStatistics();
    org.mafagafogigante.dungeon.entity.creatures.Creature creature4 = null;
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath5 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    org.mafagafogigante.dungeon.date.Date date9 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date13 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i14 = date9.compareTo(date13);
    long long15 = date13.getDay();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay16 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date13);
    // The following exception was thrown during execution in test generation
    try {
    battleStatistics3.addBattle(creature4, causeOfDeath5, partOfDay16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(battleStatistics3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 10L);
    org.junit.Assert.assertTrue("'" + partOfDay16 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay16.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test417"); }

    org.mafagafogigante.dungeon.util.CounterMap<java.util.Collection<org.mafagafogigante.dungeon.schema.JsonRule>> countermap_collection_jsonRule0 = new org.mafagafogigante.dungeon.util.CounterMap<java.util.Collection<org.mafagafogigante.dungeon.schema.JsonRule>>();
    java.lang.String str1 = countermap_collection_jsonRule0.toString();
    java.util.Spliterator<java.util.Collection<org.mafagafogigante.dungeon.schema.JsonRule>> spliterator_collection_jsonRule2 = countermap_collection_jsonRule0.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "CounterMap{map={}}"+ "'", str1.equals("CounterMap{map={}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_collection_jsonRule2);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test418"); }

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
    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array11 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria12 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array11);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature13 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer14 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature13);
    boolean b15 = visibilityCriteria12.isMetBy(observer14);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array16 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item17 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item17, item_array16);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString20 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    observer14.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item17, dungeonString20);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString23 = new org.mafagafogigante.dungeon.game.DungeonString("");
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString24 = dungeonString23.toColoredStringList();
    observer3.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item17, dungeonString23);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature26 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer27 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature26);
    org.mafagafogigante.dungeon.entity.creatures.Creature[] creature_array28 = new org.mafagafogigante.dungeon.entity.creatures.Creature[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Creature> arraylist_creature29 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Creature>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.Creature>)arraylist_creature29, creature_array28);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString32 = new org.mafagafogigante.dungeon.game.DungeonString("");
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString33 = dungeonString32.toColoredStringList();
    observer27.writeCreatureSight((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Creature>)arraylist_creature29, dungeonString32);
    java.util.Spliterator<org.mafagafogigante.dungeon.entity.creatures.Creature> spliterator_creature35 = arraylist_creature29.spliterator();
    org.mafagafogigante.dungeon.entity.creatures.Creature creature36 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer37 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature36);
    org.mafagafogigante.dungeon.entity.creatures.Creature[] creature_array38 = new org.mafagafogigante.dungeon.entity.creatures.Creature[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Creature> arraylist_creature39 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Creature>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.Creature>)arraylist_creature39, creature_array38);
    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array41 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria42 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array41);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature43 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer44 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature43);
    boolean b45 = visibilityCriteria42.isMetBy(observer44);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array46 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item47 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b48 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item47, item_array46);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString50 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array55 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString50.append(str_array55);
    observer44.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item47, dungeonString50);
    java.lang.String str58 = dungeonString50.toString();
    observer37.writeCreatureSight((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Creature>)arraylist_creature39, dungeonString50);
    observer3.writeCreatureSight((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Creature>)arraylist_creature29, dungeonString50);
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
    org.junit.Assert.assertNotNull(visibilityCriterion_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creature_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_creature35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creature_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"+ "'", str58.equals("DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"));

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test419"); }

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
    org.mafagafogigante.dungeon.entity.Integrity integrity22 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    java.lang.String str23 = integrity22.toString();
    java.lang.String str24 = integrity22.toString();
    boolean b25 = integrity22.isMaximum();
    int i26 = integrity22.getMaximum();
    java.lang.String str27 = integrity22.toString();
    itemPreset0.setIntegrity(integrity22);
    boolean b29 = integrity22.isZero();
    integrity22.incrementBy((int)(byte)0);
    
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
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "0/1"+ "'", str23.equals("0/1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "0/1"+ "'", str24.equals("0/1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "0/1"+ "'", str27.equals("0/1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test420"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    itemPreset0.setPutrefactionPeriod(1L);
    itemPreset0.setIntegrityDecrementOnHit((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test421"); }

    org.mafagafogigante.dungeon.commands.IssuedCommand issuedCommand1 = new org.mafagafogigante.dungeon.commands.IssuedCommand("BattleStatistics{records=CounterMap{map={}}}");
    java.util.List<java.lang.String> list_str2 = issuedCommand1.getTokens();
    org.mafagafogigante.dungeon.util.StopWatch stopWatch3 = new org.mafagafogigante.dungeon.util.StopWatch();
    java.util.concurrent.TimeUnit timeUnit4 = null;
    java.lang.String str5 = stopWatch3.toString(timeUnit4);
    java.lang.String str6 = stopWatch3.toString();
    java.util.concurrent.TimeUnit timeUnit7 = null;
    java.lang.String str8 = stopWatch3.toString(timeUnit7);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.game.Game.renderTurn(issuedCommand1, stopWatch3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1 ms"+ "'", str6.equals("1 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test422"); }

    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics0 = new org.mafagafogigante.dungeon.stats.WorldStatistics();
    int i1 = worldStatistics0.getSpawnCount();
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str2 = worldStatistics0.getLocationCounter();
    int i3 = worldStatistics0.getSpawnCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test423"); }

    org.mafagafogigante.dungeon.entity.creatures.HealthState healthState0 = org.mafagafogigante.dungeon.entity.creatures.HealthState.BARELY_INJURED;
    java.lang.String str1 = healthState0.toString();
    org.junit.Assert.assertTrue("'" + healthState0 + "' != '" + org.mafagafogigante.dungeon.entity.creatures.HealthState.BARELY_INJURED + "'", healthState0.equals(org.mafagafogigante.dungeon.entity.creatures.HealthState.BARELY_INJURED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Barely Injured"+ "'", str1.equals("Barely Injured"));

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test424"); }

    org.mafagafogigante.dungeon.entity.items.ItemPresetFactory[] itemPresetFactory_array0 = new org.mafagafogigante.dungeon.entity.items.ItemPresetFactory[] {  };
    org.mafagafogigante.dungeon.entity.items.ItemFactory itemFactory1 = new org.mafagafogigante.dungeon.entity.items.ItemFactory(itemPresetFactory_array0);
    org.mafagafogigante.dungeon.entity.items.ItemFactory itemFactory2 = new org.mafagafogigante.dungeon.entity.items.ItemFactory(itemPresetFactory_array0);
    org.mafagafogigante.dungeon.game.Id id3 = null;
    org.mafagafogigante.dungeon.date.Date date4 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.items.Item item5 = itemFactory2.makeItem(id3, date4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemPresetFactory_array0);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test425"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    itemPreset0.setIntegrityDecrementOnEat((-1));
    org.mafagafogigante.dungeon.entity.Weight weight4 = itemPreset0.getWeight();
    itemPreset0.setDrinkableHealing((int)(byte)1);
    java.lang.String str7 = itemPreset0.getText();
    org.mafagafogigante.dungeon.util.Percentage percentage8 = itemPreset0.getVisibility();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage8);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test426"); }

    org.mafagafogigante.dungeon.commands.IssuedCommand issuedCommand1 = new org.mafagafogigante.dungeon.commands.IssuedCommand("BattleStatistics{records=CounterMap{map={}}}");
    java.lang.String str2 = issuedCommand1.toString();
    java.lang.String str3 = issuedCommand1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "BattleStatistics{records=CounterMap{map={}}}"+ "'", str2.equals("BattleStatistics{records=CounterMap{map={}}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "BattleStatistics{records=CounterMap{map={}}}"+ "'", str3.equals("BattleStatistics{records=CounterMap{map={}}}"));

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test427"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature1 = null;
    org.mafagafogigante.dungeon.entity.creatures.CreatureHealth creatureHealth2 = org.mafagafogigante.dungeon.entity.creatures.CreatureHealth.makeCreatureHealth(100, creature1);
    int i3 = creatureHealth2.getMaximum();
    int i4 = creatureHealth2.getCurrent();
    boolean b5 = creatureHealth2.isFull();
    int i6 = creatureHealth2.getCurrent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creatureHealth2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test428"); }

    java.lang.String str1 = org.mafagafogigante.dungeon.io.Converter.bytesToHuman((long)82800);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "80.9 KiB"+ "'", str1.equals("80.9 KiB"));

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test429"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.util.library.AutomaticShuffledStringLibrary automaticShuffledStringLibrary1 = new org.mafagafogigante.dungeon.util.library.AutomaticShuffledStringLibrary("00:00:00");
      org.junit.Assert.fail("Expected exception of type org.mafagafogigante.dungeon.io.JsonObjectFactory.IllegalFilenameExtensionException");
    } catch (org.mafagafogigante.dungeon.io.JsonObjectFactory.IllegalFilenameExtensionException e) {
      // Expected exception.
    }

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test430"); }

    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics0 = new org.mafagafogigante.dungeon.stats.WorldStatistics();
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str1 = worldStatistics0.getLocationCounter();
    int i2 = worldStatistics0.getSpawnCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test431"); }

    java.lang.String str1 = org.mafagafogigante.dungeon.io.Converter.bytesToHuman(830217600000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "773.2 GiB"+ "'", str1.equals("773.2 GiB"));

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test432"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    itemPreset0.setIntegrityDecrementOnEat((-1));
    org.mafagafogigante.dungeon.game.Id id4 = itemPreset0.getSpellId();
    int i5 = itemPreset0.getDrinkableDoses();
    java.lang.String str6 = itemPreset0.getText();
    org.mafagafogigante.dungeon.entity.Integrity integrity9 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    java.lang.String str10 = integrity9.toString();
    java.lang.String str11 = integrity9.toString();
    boolean b12 = integrity9.isMaximum();
    int i13 = integrity9.getMaximum();
    org.mafagafogigante.dungeon.entity.Integrity integrity14 = new org.mafagafogigante.dungeon.entity.Integrity(integrity9);
    boolean b15 = integrity9.isMaximum();
    int i16 = integrity9.getCurrent();
    itemPreset0.setIntegrity(integrity9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0/1"+ "'", str10.equals("0/1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0/1"+ "'", str11.equals("0/1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test433"); }

    org.mafagafogigante.dungeon.game.Point point3 = new org.mafagafogigante.dungeon.game.Point(10, (int)'a', 0);
    java.lang.String[] str_array6 = new java.lang.String[] { "", "" };
    org.mafagafogigante.dungeon.util.Table table7 = new org.mafagafogigante.dungeon.util.Table(str_array6);
    boolean b8 = point3.equals((java.lang.Object)str_array6);
    java.lang.String str9 = point3.toString();
    int i10 = point3.getY();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{10, 97, 0}"+ "'", str9.equals("{10, 97, 0}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test434"); }

    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath0 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery1 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    battleStatisticsQuery1.setType("Damaged");
    battleStatisticsQuery1.setType("");
    boolean b6 = causeOfDeath0.equals((java.lang.Object)battleStatisticsQuery1);
    org.mafagafogigante.dungeon.game.Id id7 = null;
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery9 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath10 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    battleStatisticsQuery9.setCauseOfDeath(causeOfDeath10);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay12 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.stats.BattleRecord battleRecord13 = new org.mafagafogigante.dungeon.stats.BattleRecord(id7, "", causeOfDeath10, partOfDay12);
    boolean b14 = battleStatisticsQuery1.matches(battleRecord13);
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath15 = battleRecord13.getCauseOfDeath();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath16 = battleRecord13.getCauseOfDeath();
    java.lang.String str17 = battleRecord13.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath10);
    org.junit.Assert.assertTrue("'" + partOfDay12 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay12.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "BattleEntry{id=null, type='', causeOfDeath=Unarmed : UNARMED, partOfDay=Night}"+ "'", str17.equals("BattleEntry{id=null, type='', causeOfDeath=Unarmed : UNARMED, partOfDay=Night}"));

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test435"); }

    boolean b1 = org.mafagafogigante.dungeon.util.Percentage.isValidPercentageString("User: Nicholas\nTime: 15:43:14\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 18.7 MiB out of the allocated 109.5 MiB\nOS: Windows 10 (amd64) 10.0");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test436"); }

    org.mafagafogigante.dungeon.commands.IssuedCommand issuedCommand1 = new org.mafagafogigante.dungeon.commands.IssuedCommand("BattleStatistics{records=CounterMap{map={}}}");
    java.lang.String str2 = issuedCommand1.toString();
    org.mafagafogigante.dungeon.commands.PreparedIssuedCommand preparedIssuedCommand3 = org.mafagafogigante.dungeon.commands.IssuedCommandProcessor.prepareIssuedCommand(issuedCommand1);
    org.mafagafogigante.dungeon.util.StopWatch stopWatch4 = new org.mafagafogigante.dungeon.util.StopWatch();
    java.util.concurrent.TimeUnit timeUnit5 = null;
    java.lang.String str6 = stopWatch4.toString(timeUnit5);
    java.util.concurrent.TimeUnit timeUnit7 = null;
    java.lang.String str8 = stopWatch4.toString(timeUnit7);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.game.Game.renderTurn(issuedCommand1, stopWatch4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "BattleStatistics{records=CounterMap{map={}}}"+ "'", str2.equals("BattleStatistics{records=CounterMap{map={}}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(preparedIssuedCommand3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test437"); }

    org.mafagafogigante.dungeon.entity.items.FoodComponent foodComponent2 = new org.mafagafogigante.dungeon.entity.items.FoodComponent((int)(short)0, 0);
    int i3 = foodComponent2.getNutrition();
    int i4 = foodComponent2.getNutrition();
    int i5 = foodComponent2.getNutrition();
    int i6 = foodComponent2.getNutrition();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test438"); }

    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances0 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.Direction direction1 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b3 = direction1.equalsIgnoreCase("");
    blockedEntrances0.block(direction1);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances5 = new org.mafagafogigante.dungeon.game.BlockedEntrances(blockedEntrances0);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances6 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.Direction direction7 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b9 = direction7.equalsIgnoreCase("");
    blockedEntrances6.block(direction7);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances11 = new org.mafagafogigante.dungeon.game.BlockedEntrances(blockedEntrances6);
    org.mafagafogigante.dungeon.game.Direction direction12 = org.mafagafogigante.dungeon.game.Direction.EAST;
    org.mafagafogigante.dungeon.game.Direction direction13 = direction12.invert();
    blockedEntrances11.block(direction13);
    org.mafagafogigante.dungeon.game.Direction direction15 = org.mafagafogigante.dungeon.game.Direction.EAST;
    java.lang.String str16 = direction15.toString();
    java.lang.String str17 = direction15.toString();
    blockedEntrances11.block(direction15);
    boolean b19 = blockedEntrances0.isBlocked(direction15);
    org.junit.Assert.assertTrue("'" + direction1 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction1.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    org.junit.Assert.assertTrue("'" + direction7 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction7.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    org.junit.Assert.assertTrue("'" + direction12 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction12.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    org.junit.Assert.assertTrue("'" + direction13 + "' != '" + org.mafagafogigante.dungeon.game.Direction.WEST + "'", direction13.equals(org.mafagafogigante.dungeon.game.Direction.WEST));
    org.junit.Assert.assertTrue("'" + direction15 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction15.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "East"+ "'", str16.equals("East"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "East"+ "'", str17.equals("East"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test439"); }

    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics0 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics1 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point2 = null;
    org.mafagafogigante.dungeon.game.Id id3 = null;
    explorationStatistics1.createEntryIfNotExists(point2, id3);
    org.mafagafogigante.dungeon.game.Point point8 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id9 = null;
    explorationStatistics1.addVisit(point8, id9);
    boolean b11 = explorationStatistics0.hasBeenSeen(point8);
    org.mafagafogigante.dungeon.game.Point point15 = new org.mafagafogigante.dungeon.game.Point(100, 10, (int)(byte)10);
    java.lang.String str16 = point15.toString();
    org.mafagafogigante.dungeon.game.Direction direction17 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b19 = direction17.equalsIgnoreCase("Damaged");
    org.mafagafogigante.dungeon.game.Point point20 = new org.mafagafogigante.dungeon.game.Point(point15, direction17);
    boolean b21 = explorationStatistics0.hasBeenSeen(point20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{100, 10, 10}"+ "'", str16.equals("{100, 10, 10}"));
    org.junit.Assert.assertTrue("'" + direction17 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction17.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test440"); }

    org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.WorldStatistics> countermap_worldStatistics0 = new org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.WorldStatistics>();
    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics1 = new org.mafagafogigante.dungeon.stats.WorldStatistics();
    int i2 = worldStatistics1.getLocationCount();
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str3 = worldStatistics1.getSpawnCounter();
    countermap_worldStatistics0.incrementCounter(worldStatistics1);
    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics5 = new org.mafagafogigante.dungeon.stats.WorldStatistics();
    int i6 = worldStatistics5.getLocationCount();
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str7 = worldStatistics5.getSpawnCounter();
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str8 = worldStatistics5.getSpawnCounter();
    int i9 = worldStatistics5.getLocationCount();
    worldStatistics5.addLocation("");
    countermap_worldStatistics0.incrementCounter(worldStatistics5);
    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics13 = new org.mafagafogigante.dungeon.stats.WorldStatistics();
    int i14 = worldStatistics13.getLocationCount();
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str15 = worldStatistics13.getSpawnCounter();
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str16 = worldStatistics13.getSpawnCounter();
    int i17 = countermap_worldStatistics0.getCounter(worldStatistics13);
    java.util.Set<org.mafagafogigante.dungeon.stats.WorldStatistics> set_worldStatistics18 = countermap_worldStatistics0.keySet();
    java.util.Iterator<org.mafagafogigante.dungeon.stats.WorldStatistics> iterator_worldStatistics19 = countermap_worldStatistics0.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_worldStatistics18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_worldStatistics19);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test441"); }

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
    org.mafagafogigante.dungeon.entity.Weight weight17 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    org.mafagafogigante.dungeon.entity.Weight weight18 = org.mafagafogigante.dungeon.entity.Weight.ZERO;
    org.mafagafogigante.dungeon.entity.Weight weight19 = weight17.add(weight18);
    java.lang.String str20 = weight19.toString();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset21 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity22 = itemPreset21.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity23 = null;
    itemPreset21.setIntegrity(integrity23);
    org.mafagafogigante.dungeon.util.Percentage percentage25 = itemPreset21.getVisibility();
    java.lang.String str26 = itemPreset21.getType();
    itemPreset21.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage30 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset21.setVisibility(percentage30);
    org.mafagafogigante.dungeon.util.Percentage percentage33 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    int i34 = percentage30.compareTo(percentage33);
    org.mafagafogigante.dungeon.entity.Weight weight35 = weight19.multiply(percentage30);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset36 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Weight weight37 = itemPreset36.getWeight();
    org.mafagafogigante.dungeon.entity.Weight weight39 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    org.mafagafogigante.dungeon.entity.Weight weight40 = org.mafagafogigante.dungeon.entity.Weight.ZERO;
    org.mafagafogigante.dungeon.entity.Weight weight41 = weight39.add(weight40);
    java.lang.String str42 = weight41.toString();
    itemPreset36.setWeight(weight41);
    org.mafagafogigante.dungeon.entity.Weight weight44 = weight19.add(weight41);
    circularlist_comparable_weight1.add((java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>)weight44);
    
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
    org.junit.Assert.assertNotNull(weight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "0 kg"+ "'", str20.equals("0 kg"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weight37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "0 kg"+ "'", str42.equals("0 kg"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight44);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test442"); }

    org.mafagafogigante.dungeon.util.Percentage percentage1 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b3 = percentage1.equals((java.lang.Object)10.0d);
    double d4 = percentage1.toDouble();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity5 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage1);
    org.mafagafogigante.dungeon.entity.Visibility visibility6 = new org.mafagafogigante.dungeon.entity.Visibility(percentage1);
    java.lang.String str7 = visibility6.toString();
    org.mafagafogigante.dungeon.util.Percentage percentage9 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b11 = percentage9.equals((java.lang.Object)10.0d);
    double d12 = percentage9.toDouble();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity13 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage9);
    boolean b14 = visibility6.visibleUnder(luminosity13);
    org.mafagafogigante.dungeon.util.Percentage percentage15 = visibility6.toPercentage();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Visibility of 100.00%"+ "'", str7.equals("Visibility of 100.00%"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage15);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test443"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule2 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeBoundDoubleRule((double)830217600000L, (double)830217600000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule2);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test444"); }

    org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.WorldStatistics> countermap_worldStatistics0 = new org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.WorldStatistics>();
    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics1 = new org.mafagafogigante.dungeon.stats.WorldStatistics();
    int i2 = worldStatistics1.getLocationCount();
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str3 = worldStatistics1.getSpawnCounter();
    countermap_worldStatistics0.incrementCounter(worldStatistics1);
    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics5 = new org.mafagafogigante.dungeon.stats.WorldStatistics();
    int i6 = worldStatistics5.getLocationCount();
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str7 = worldStatistics5.getSpawnCounter();
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str8 = worldStatistics5.getSpawnCounter();
    int i9 = worldStatistics5.getLocationCount();
    worldStatistics5.addLocation("");
    countermap_worldStatistics0.incrementCounter(worldStatistics5);
    java.lang.String str13 = countermap_worldStatistics0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test445"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature1 = null;
    org.mafagafogigante.dungeon.entity.creatures.CreatureHealth creatureHealth2 = org.mafagafogigante.dungeon.entity.creatures.CreatureHealth.makeCreatureHealth(100, creature1);
    boolean b3 = creatureHealth2.isAlive();
    boolean b4 = creatureHealth2.isDead();
    creatureHealth2.decrementBy((int)(short)-1);
    org.mafagafogigante.dungeon.entity.creatures.HealthState healthState7 = creatureHealth2.getHealthState();
    org.mafagafogigante.dungeon.util.Percentage percentage8 = creatureHealth2.toPercentage();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creatureHealth2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    org.junit.Assert.assertTrue("'" + healthState7 + "' != '" + org.mafagafogigante.dungeon.entity.creatures.HealthState.UNINJURED + "'", healthState7.equals(org.mafagafogigante.dungeon.entity.creatures.HealthState.UNINJURED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage8);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test446"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date((long)32, (long)(short)10, 0L);
    org.mafagafogigante.dungeon.date.Date date8 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date12 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i13 = date8.compareTo(date12);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay14 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date8);
    java.lang.String[] str_array20 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table21 = new org.mafagafogigante.dungeon.util.Table(str_array20);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString22 = table21.toColoredStringList();
    org.mafagafogigante.dungeon.game.ColoredString coloredString23 = org.mafagafogigante.dungeon.game.Random.select(list_coloredString22);
    boolean b24 = date8.equals((java.lang.Object)coloredString23);
    org.mafagafogigante.dungeon.date.Date date28 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date32 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i33 = date28.compareTo(date32);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay34 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date28);
    long long35 = date28.getYear();
    org.mafagafogigante.dungeon.date.Date date39 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date43 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i44 = date39.compareTo(date43);
    long long45 = date39.getYear();
    int i46 = date28.compareTo(date39);
    org.mafagafogigante.dungeon.date.Duration duration47 = new org.mafagafogigante.dungeon.date.Duration(date8, date39);
    org.mafagafogigante.dungeon.date.Date date52 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date56 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i57 = date52.compareTo(date56);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay58 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date52);
    long long59 = date52.getYear();
    org.mafagafogigante.dungeon.date.Date date63 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date67 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i68 = date63.compareTo(date67);
    long long69 = date63.getYear();
    int i70 = date52.compareTo(date63);
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit72 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR;
    org.mafagafogigante.dungeon.date.Date date73 = date63.minus(35, dungeonTimeUnit72);
    org.mafagafogigante.dungeon.date.Date date74 = date39.plus(3, dungeonTimeUnit72);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.date.Date date75 = date3.plus((int)(short)-1, dungeonTimeUnit72);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay14 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay14.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(coloredString23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay34 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay34.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long35 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long45 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay58 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay58.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long59 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long69 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit72 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR + "'", dungeonTimeUnit72.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date74);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test447"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay1 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity2 = partOfDay1.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name3 = partOfDay1.getName();
    org.mafagafogigante.dungeon.game.QuantificationMode quantificationMode5 = org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER;
    java.lang.String str6 = name3.getQuantifiedName((int)'4', quantificationMode5);
    creaturePreset0.setName(name3);
    int i8 = creaturePreset0.getHealth();
    creaturePreset0.setInventoryWeightLimit((double)17518);
    org.mafagafogigante.dungeon.game.Name name11 = creaturePreset0.getName();
    org.junit.Assert.assertTrue("'" + partOfDay1 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay1.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name3);
    org.junit.Assert.assertTrue("'" + quantificationMode5 + "' != '" + org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER + "'", quantificationMode5.equals(org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "52 Nights"+ "'", str6.equals("52 Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name11);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test448"); }

    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics0 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics1 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point2 = null;
    org.mafagafogigante.dungeon.game.Id id3 = null;
    explorationStatistics1.createEntryIfNotExists(point2, id3);
    org.mafagafogigante.dungeon.game.Point point8 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id9 = null;
    explorationStatistics1.addVisit(point8, id9);
    boolean b11 = explorationStatistics0.hasBeenSeen(point8);
    org.mafagafogigante.dungeon.game.Point point15 = new org.mafagafogigante.dungeon.game.Point(10, (int)'a', 0);
    int i16 = point15.getY();
    org.mafagafogigante.dungeon.game.Id id17 = null;
    explorationStatistics0.addVisit(point15, id17);
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics19 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point20 = null;
    org.mafagafogigante.dungeon.game.Id id21 = null;
    explorationStatistics19.createEntryIfNotExists(point20, id21);
    org.mafagafogigante.dungeon.game.Point point26 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id27 = null;
    explorationStatistics19.addVisit(point26, id27);
    boolean b29 = explorationStatistics0.hasBeenSeen(point26);
    java.lang.String str30 = point26.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{32, 0, -1}"+ "'", str30.equals("{32, 0, -1}"));

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test449"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    creaturePreset0.setAttack(57);
    org.mafagafogigante.dungeon.util.CounterMap<java.util.RandomAccess> countermap_randomAccess5 = new org.mafagafogigante.dungeon.util.CounterMap<java.util.RandomAccess>();
    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset6 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id7 = null;
    creaturePreset6.setWeaponId(id7);
    creaturePreset6.setAttack(57);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity11 = creaturePreset6.getLuminosity();
    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset12 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id13 = null;
    creaturePreset12.setWeaponId(id13);
    creaturePreset12.setAttack(57);
    org.mafagafogigante.dungeon.game.Id[] id_array17 = new org.mafagafogigante.dungeon.game.Id[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.game.Id> arraylist_id18 = new java.util.ArrayList<org.mafagafogigante.dungeon.game.Id>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.game.Id>)arraylist_id18, id_array17);
    creaturePreset12.setItems((java.util.List<org.mafagafogigante.dungeon.game.Id>)arraylist_id18);
    creaturePreset6.setItems((java.util.List<org.mafagafogigante.dungeon.game.Id>)arraylist_id18);
    countermap_randomAccess5.incrementCounter((java.util.RandomAccess)arraylist_id18, (java.lang.Integer)10);
    creaturePreset0.setItems((java.util.List<org.mafagafogigante.dungeon.game.Id>)arraylist_id18);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity25 = creaturePreset0.getLuminosity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(id_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity25);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test450"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    itemPreset0.setIntegrityDecrementOnEat((-1));
    org.mafagafogigante.dungeon.game.Id id4 = itemPreset0.getSpellId();
    itemPreset0.setDrinkableHealing(85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id4);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test451"); }

    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array0 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria1 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array0);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature2 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer3 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature2);
    boolean b4 = visibilityCriteria1.isMetBy(observer3);
    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array5 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria6 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array5);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature7 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer8 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature7);
    boolean b9 = visibilityCriteria6.isMetBy(observer8);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array10 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item11 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item11, item_array10);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString14 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array19 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString14.append(str_array19);
    observer8.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item11, dungeonString14);
    org.mafagafogigante.dungeon.entity.creatures.Creature[] creature_array22 = new org.mafagafogigante.dungeon.entity.creatures.Creature[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Creature> arraylist_creature23 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Creature>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.Creature>)arraylist_creature23, creature_array22);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString26 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array31 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString26.append(str_array31);
    java.lang.String str33 = dungeonString26.toString();
    org.mafagafogigante.dungeon.game.Point point37 = new org.mafagafogigante.dungeon.game.Point(10, (int)'a', 0);
    java.lang.String[] str_array40 = new java.lang.String[] { "", "" };
    org.mafagafogigante.dungeon.util.Table table41 = new org.mafagafogigante.dungeon.util.Table(str_array40);
    boolean b42 = point37.equals((java.lang.Object)str_array40);
    dungeonString26.append(str_array40);
    observer8.writeCreatureSight((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Creature>)arraylist_creature23, dungeonString26);
    boolean b45 = visibilityCriteria1.isMetBy(observer8);
    java.lang.String str46 = visibilityCriteria1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creature_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"+ "'", str33.equals("DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "visibilityCriteria=VisibilityCriteria{[]}"+ "'", str46.equals("visibilityCriteria=VisibilityCriteria{[]}"));

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test452"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    itemPreset0.setIntegrityDecrementOnEat((-1));
    org.mafagafogigante.dungeon.util.Percentage percentage5 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b7 = percentage5.equals((java.lang.Object)10.0d);
    double d8 = percentage5.toDouble();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity9 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage5);
    org.mafagafogigante.dungeon.entity.Visibility visibility10 = new org.mafagafogigante.dungeon.entity.Visibility(percentage5);
    java.lang.String str11 = visibility10.toString();
    org.mafagafogigante.dungeon.util.Percentage percentage13 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b15 = percentage13.equals((java.lang.Object)10.0d);
    double d16 = percentage13.toDouble();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity17 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage13);
    boolean b18 = visibility10.visibleUnder(luminosity17);
    itemPreset0.setLuminosity(luminosity17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Visibility of 100.00%"+ "'", str11.equals("Visibility of 100.00%"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test453"); }

    org.mafagafogigante.dungeon.game.LocationPreset locationPreset0 = null;
    org.mafagafogigante.dungeon.game.World world1 = null;
    org.mafagafogigante.dungeon.game.Point point5 = new org.mafagafogigante.dungeon.game.Point(5, 90, (int)'#');
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.game.Location location6 = new org.mafagafogigante.dungeon.game.Location(locationPreset0, world1, point5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test454"); }

    org.mafagafogigante.dungeon.game.MinimumBoundingRectangle minimumBoundingRectangle2 = new org.mafagafogigante.dungeon.game.MinimumBoundingRectangle((int)' ', (int)(short)-1);
    int i3 = minimumBoundingRectangle2.getWidth();
    int i4 = minimumBoundingRectangle2.getHeight();
    int i5 = minimumBoundingRectangle2.getWidth();
    int i6 = minimumBoundingRectangle2.getWidth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test455"); }

    org.mafagafogigante.dungeon.stats.Statistics statistics0 = new org.mafagafogigante.dungeon.stats.Statistics();
    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics1 = statistics0.getBattleStatistics();
    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics2 = statistics0.getBattleStatistics();
    java.lang.String str3 = battleStatistics2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(battleStatistics1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(battleStatistics2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "BattleStatistics{records=CounterMap{map={}}}"+ "'", str3.equals("BattleStatistics{records=CounterMap{map={}}}"));

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test456"); }

    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery0 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    battleStatisticsQuery0.setType("Damaged");
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath3 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery4 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    battleStatisticsQuery4.setType("Damaged");
    battleStatisticsQuery4.setType("");
    boolean b9 = causeOfDeath3.equals((java.lang.Object)battleStatisticsQuery4);
    org.mafagafogigante.dungeon.game.Id id10 = null;
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery12 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath13 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    battleStatisticsQuery12.setCauseOfDeath(causeOfDeath13);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay15 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.stats.BattleRecord battleRecord16 = new org.mafagafogigante.dungeon.stats.BattleRecord(id10, "", causeOfDeath13, partOfDay15);
    boolean b17 = battleStatisticsQuery4.matches(battleRecord16);
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath18 = battleRecord16.getCauseOfDeath();
    boolean b19 = battleStatisticsQuery0.matches(battleRecord16);
    java.lang.String str20 = battleRecord16.toString();
    org.mafagafogigante.dungeon.game.Id id21 = battleRecord16.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath13);
    org.junit.Assert.assertTrue("'" + partOfDay15 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay15.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "BattleEntry{id=null, type='', causeOfDeath=Unarmed : UNARMED, partOfDay=Night}"+ "'", str20.equals("BattleEntry{id=null, type='', causeOfDeath=Unarmed : UNARMED, partOfDay=Night}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id21);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test457"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.util.library.AutomaticShuffledStringLibrary automaticShuffledStringLibrary1 = new org.mafagafogigante.dungeon.util.library.AutomaticShuffledStringLibrary("ColoredString{string='Up', color=java.awt.Color[r=192,g=192,b=192]}");
      org.junit.Assert.fail("Expected exception of type org.mafagafogigante.dungeon.io.JsonObjectFactory.IllegalFilenameExtensionException");
    } catch (org.mafagafogigante.dungeon.io.JsonObjectFactory.IllegalFilenameExtensionException e) {
      // Expected exception.
    }

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test458"); }

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
    org.mafagafogigante.dungeon.util.Percentage percentage17 = creaturePreset0.getVisibility();
    org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId attackAlgorithmId18 = creaturePreset0.getAttackAlgorithmId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(id_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(attackAlgorithmId18);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test459"); }

    org.mafagafogigante.dungeon.stats.Statistics statistics0 = new org.mafagafogigante.dungeon.stats.Statistics();
    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics1 = statistics0.getBattleStatistics();
    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics2 = statistics0.getWorldStatistics();
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str3 = worldStatistics2.getSpawnCounter();
    int i4 = worldStatistics2.getLocationCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(battleStatistics1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(worldStatistics2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test460"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    java.lang.String str5 = itemPreset0.getType();
    itemPreset0.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.entity.TagSet<org.mafagafogigante.dungeon.entity.items.Item.Tag> tagset_tag8 = itemPreset0.getTagSet();
    itemPreset0.setIntegrityDecrementPerDose(32);
    boolean b11 = itemPreset0.isUnique();
    int i12 = itemPreset0.getDrinkableDoses();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tagset_tag8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test461"); }

    org.mafagafogigante.dungeon.util.Percentage percentage1 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b3 = percentage1.equals((java.lang.Object)10.0d);
    double d4 = percentage1.toDouble();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity5 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage1);
    org.mafagafogigante.dungeon.entity.Visibility visibility6 = new org.mafagafogigante.dungeon.entity.Visibility(percentage1);
    org.mafagafogigante.dungeon.util.Percentage percentage7 = visibility6.toPercentage();
    org.mafagafogigante.dungeon.util.Percentage percentage8 = visibility6.toPercentage();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset9 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity10 = itemPreset9.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity11 = null;
    itemPreset9.setIntegrity(integrity11);
    org.mafagafogigante.dungeon.util.Percentage percentage13 = itemPreset9.getVisibility();
    java.lang.String str14 = itemPreset9.getType();
    itemPreset9.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage18 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset9.setVisibility(percentage18);
    org.mafagafogigante.dungeon.util.Percentage percentage21 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    int i22 = percentage18.compareTo(percentage21);
    double d23 = percentage18.toDouble();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity24 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage18);
    boolean b25 = visibility6.visibleUnder(luminosity24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage8);
    
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
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test462"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    boolean b3 = integrity2.isMaximum();
    org.mafagafogigante.dungeon.entity.items.Item item4 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity5 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity2, item4);
    org.mafagafogigante.dungeon.util.Percentage percentage6 = itemIntegrity5.toPercentage();
    boolean b7 = itemIntegrity5.isPerfect();
    boolean b8 = itemIntegrity5.isBroken();
    // The following exception was thrown during execution in test generation
    try {
    itemIntegrity5.decrementBy(90);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test463"); }

    boolean b1 = org.mafagafogigante.dungeon.game.Random.roll((double)90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test464"); }

    org.mafagafogigante.dungeon.entity.items.LocationInventory locationInventory0 = new org.mafagafogigante.dungeon.entity.items.LocationInventory();
    int i1 = locationInventory0.getItemCount();
    org.mafagafogigante.dungeon.entity.items.Item item2 = null;
    // The following exception was thrown during execution in test generation
    try {
    locationInventory0.removeItem(item2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test465"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, (-1), 0.0d);
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
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test466"); }

    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances0 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.Direction direction1 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b3 = direction1.equalsIgnoreCase("");
    blockedEntrances0.block(direction1);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances5 = new org.mafagafogigante.dungeon.game.BlockedEntrances(blockedEntrances0);
    org.mafagafogigante.dungeon.game.Direction direction6 = org.mafagafogigante.dungeon.game.Direction.EAST;
    org.mafagafogigante.dungeon.game.Direction direction7 = direction6.invert();
    blockedEntrances5.block(direction7);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = blockedEntrances5.toString();
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + direction1 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction1.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    org.junit.Assert.assertTrue("'" + direction6 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction6.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    org.junit.Assert.assertTrue("'" + direction7 + "' != '" + org.mafagafogigante.dungeon.game.Direction.WEST + "'", direction7.equals(org.mafagafogigante.dungeon.game.Direction.WEST));

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test467"); }

    org.mafagafogigante.dungeon.entity.items.ItemUsageEffect itemUsageEffect1 = new org.mafagafogigante.dungeon.entity.items.ItemUsageEffect(0);
    int i2 = itemUsageEffect1.getHealing();
    int i3 = itemUsageEffect1.getHealing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test468"); }

    org.mafagafogigante.dungeon.entity.creatures.Hero hero0 = null;
    org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster heroSpellcaster1 = new org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster(hero0);
    java.util.List<org.mafagafogigante.dungeon.spells.Spell> list_spell2 = heroSpellcaster1.getSpellList();
    org.mafagafogigante.dungeon.spells.Spell spell3 = null;
    boolean b4 = heroSpellcaster1.knowsSpell(spell3);
    java.util.List<org.mafagafogigante.dungeon.spells.Spell> list_spell5 = heroSpellcaster1.getSpellList();
    java.lang.String[] str_array11 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table12 = new org.mafagafogigante.dungeon.util.Table(str_array11);
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications15 = new org.mafagafogigante.dungeon.gui.WritingSpecifications(false, 32);
    boolean b16 = writingSpecifications15.shouldWait();
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)table12, writingSpecifications15);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array18 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item19 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item19, item_array18);
    java.lang.String[] str_array26 = new java.lang.String[] { "CounterMap{map={}}", "User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 34.4 MiB out of the allocated 123.0 MiB\nOS: Windows 10 (amd64) 10.0", "hi!", "0 ms", "User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 41.5 MiB out of the allocated 154.5 MiB\nOS: Windows 10 (amd64) 10.0" };
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item27 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item19, str_array26);
    java.lang.String[] str_array33 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table34 = new org.mafagafogigante.dungeon.util.Table(str_array33);
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item35 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems(list_item27, str_array33);
    table12.insertRow(str_array33);
    heroSpellcaster1.parseCast(str_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_spell2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_spell5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item35);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test469"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, (-1), 0.0d);
    org.mafagafogigante.dungeon.entity.Weight weight4 = creatureInventory3.getWeight();
    int i5 = creatureInventory3.getItemCount();
    int i6 = creatureInventory3.getItemCount();
    org.mafagafogigante.dungeon.entity.Weight weight7 = creatureInventory3.getWeightLimit();
    org.mafagafogigante.dungeon.entity.Weight weight9 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    org.mafagafogigante.dungeon.entity.Weight weight10 = org.mafagafogigante.dungeon.entity.Weight.ZERO;
    org.mafagafogigante.dungeon.entity.Weight weight11 = weight9.add(weight10);
    java.lang.String str12 = weight11.toString();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset13 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity14 = itemPreset13.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity15 = null;
    itemPreset13.setIntegrity(integrity15);
    org.mafagafogigante.dungeon.util.Percentage percentage17 = itemPreset13.getVisibility();
    java.lang.String str18 = itemPreset13.getType();
    itemPreset13.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage22 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset13.setVisibility(percentage22);
    org.mafagafogigante.dungeon.util.Percentage percentage25 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    int i26 = percentage22.compareTo(percentage25);
    org.mafagafogigante.dungeon.entity.Weight weight27 = weight11.multiply(percentage22);
    int i28 = weight7.compareTo(weight27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "0 kg"+ "'", str12.equals("0 kg"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test470"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] creaturePresetFactory_array0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] {  };
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory1 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array0);
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory2 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array0);
    org.mafagafogigante.dungeon.game.Id id3 = null;
    org.mafagafogigante.dungeon.game.World world4 = null;
    org.mafagafogigante.dungeon.entity.creatures.Creature creature5 = creatureFactory2.makeCreature(id3, world4);
    org.mafagafogigante.dungeon.game.Id id6 = null;
    org.mafagafogigante.dungeon.game.World world7 = null;
    org.mafagafogigante.dungeon.entity.creatures.Creature creature8 = creatureFactory2.makeCreature(id6, world7);
    org.mafagafogigante.dungeon.game.Id id9 = null;
    org.mafagafogigante.dungeon.game.World world10 = null;
    org.mafagafogigante.dungeon.entity.creatures.Creature creature11 = creatureFactory2.makeCreature(id9, world10);
    org.mafagafogigante.dungeon.date.Date date15 = new org.mafagafogigante.dungeon.date.Date((long)32, (long)(short)10, 0L);
    org.mafagafogigante.dungeon.game.World world16 = null;
    org.mafagafogigante.dungeon.stats.Statistics statistics17 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.creatures.Hero hero18 = creatureFactory2.makeHero(date15, world16, statistics17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creaturePresetFactory_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(creature5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(creature8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(creature11);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test471"); }

    org.mafagafogigante.dungeon.world.Sky sky0 = org.mafagafogigante.dungeon.world.SkyFactory.makeDarrowmereSky();
    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array1 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria2 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array1);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature3 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer4 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature3);
    boolean b5 = visibilityCriteria2.isMetBy(observer4);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array6 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item7 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item7, item_array6);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString10 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    observer4.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item7, dungeonString10);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array12 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item13 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item13, item_array12);
    java.lang.String[] str_array20 = new java.lang.String[] { "CounterMap{map={}}", "User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 34.4 MiB out of the allocated 123.0 MiB\nOS: Windows 10 (amd64) 10.0", "hi!", "0 ms", "User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 41.5 MiB out of the allocated 154.5 MiB\nOS: Windows 10 (amd64) 10.0" };
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item21 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item13, str_array20);
    java.lang.String[] str_array27 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table28 = new org.mafagafogigante.dungeon.util.Table(str_array27);
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item29 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems(list_item21, str_array27);
    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array30 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria31 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array30);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature32 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer33 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature32);
    boolean b34 = visibilityCriteria31.isMetBy(observer33);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array35 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item36 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item36, item_array35);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString39 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array44 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString39.append(str_array44);
    observer33.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item36, dungeonString39);
    java.lang.String str47 = dungeonString39.toString();
    observer4.writeItemSight(list_item29, dungeonString39);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str49 = sky0.describeYourself(observer4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sky0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"+ "'", str47.equals("DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"));

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test472"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] creaturePresetFactory_array0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] {  };
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory1 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array0);
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory2 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array0);
    org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory corpseItemPresetFactory3 = new org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory(creatureFactory2);
    java.util.Collection<org.mafagafogigante.dungeon.entity.items.ItemPreset> collection_itemPreset4 = corpseItemPresetFactory3.getItemPresets();
    java.util.Collection<org.mafagafogigante.dungeon.entity.items.ItemPreset> collection_itemPreset5 = corpseItemPresetFactory3.getItemPresets();
    org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] creaturePresetFactory_array6 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] {  };
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory7 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array6);
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory8 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array6);
    org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory corpseItemPresetFactory9 = new org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory(creatureFactory8);
    org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] creaturePresetFactory_array10 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] {  };
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory11 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array10);
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory12 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array10);
    org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory corpseItemPresetFactory13 = new org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory(creatureFactory12);
    org.mafagafogigante.dungeon.entity.items.ItemPresetFactory[] itemPresetFactory_array14 = new org.mafagafogigante.dungeon.entity.items.ItemPresetFactory[] { corpseItemPresetFactory3, corpseItemPresetFactory9, corpseItemPresetFactory13 };
    org.mafagafogigante.dungeon.entity.items.ItemFactory itemFactory15 = new org.mafagafogigante.dungeon.entity.items.ItemFactory(itemPresetFactory_array14);
    org.mafagafogigante.dungeon.game.Id id16 = null;
    org.mafagafogigante.dungeon.date.Date date20 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date24 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i25 = date20.compareTo(date24);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay26 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date20);
    java.lang.String[] str_array32 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table33 = new org.mafagafogigante.dungeon.util.Table(str_array32);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString34 = table33.toColoredStringList();
    org.mafagafogigante.dungeon.game.ColoredString coloredString35 = org.mafagafogigante.dungeon.game.Random.select(list_coloredString34);
    boolean b36 = date20.equals((java.lang.Object)coloredString35);
    org.mafagafogigante.dungeon.date.Date date40 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date44 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i45 = date40.compareTo(date44);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay46 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date40);
    long long47 = date40.getYear();
    org.mafagafogigante.dungeon.date.Date date51 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date55 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i56 = date51.compareTo(date55);
    long long57 = date51.getYear();
    int i58 = date40.compareTo(date51);
    org.mafagafogigante.dungeon.date.Duration duration59 = new org.mafagafogigante.dungeon.date.Duration(date20, date51);
    org.mafagafogigante.dungeon.date.Date date64 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date68 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i69 = date64.compareTo(date68);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay70 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date64);
    long long71 = date64.getYear();
    org.mafagafogigante.dungeon.date.Date date75 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date79 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i80 = date75.compareTo(date79);
    long long81 = date75.getYear();
    int i82 = date64.compareTo(date75);
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit84 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR;
    org.mafagafogigante.dungeon.date.Date date85 = date75.minus(35, dungeonTimeUnit84);
    org.mafagafogigante.dungeon.date.Date date86 = date51.plus(3, dungeonTimeUnit84);
    long long87 = date86.getMonth();
    org.mafagafogigante.dungeon.world.Weather weather88 = new org.mafagafogigante.dungeon.world.Weather(date86);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.items.Item item89 = itemFactory15.makeItem(id16, date86);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creaturePresetFactory_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_itemPreset4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_itemPreset5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creaturePresetFactory_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creaturePresetFactory_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemPresetFactory_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay26 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay26.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(coloredString35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay46 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay46.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long47 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long57 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay70 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay70.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long71 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long81 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 0);
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit84 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR + "'", dungeonTimeUnit84.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long87 == 10L);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test473"); }

    org.mafagafogigante.dungeon.util.ShuffledRange shuffledRange2 = new org.mafagafogigante.dungeon.util.ShuffledRange(81, 46800);
    int i3 = shuffledRange2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 46719);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test474"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    itemPreset0.setDrinkableHealing((int)(short)0);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset0.setVisibility(percentage4);
    int i6 = itemPreset0.getDrinkableDoses();
    itemPreset0.setIntegrityDecrementOnEat((int)' ');
    org.mafagafogigante.dungeon.util.Percentage percentage9 = null;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity10 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage9);
    org.mafagafogigante.dungeon.entity.LightSource lightSource11 = new org.mafagafogigante.dungeon.entity.LightSource(luminosity10);
    org.mafagafogigante.dungeon.entity.LightSource lightSource12 = new org.mafagafogigante.dungeon.entity.LightSource(luminosity10);
    itemPreset0.setLuminosity(luminosity10);
    org.mafagafogigante.dungeon.date.Date date17 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date21 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i22 = date17.compareTo(date21);
    java.lang.String str23 = date17.toTimeString();
    org.mafagafogigante.dungeon.date.Date date28 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date32 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i33 = date28.compareTo(date32);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay34 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date28);
    long long35 = date28.getYear();
    org.mafagafogigante.dungeon.date.Date date39 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date43 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i44 = date39.compareTo(date43);
    long long45 = date39.getYear();
    int i46 = date28.compareTo(date39);
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit48 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR;
    org.mafagafogigante.dungeon.date.Date date49 = date39.minus(35, dungeonTimeUnit48);
    org.mafagafogigante.dungeon.date.Date date50 = date17.plus((int)'a', dungeonTimeUnit48);
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit52 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR;
    org.mafagafogigante.dungeon.date.Date date53 = date50.plus(81, dungeonTimeUnit52);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.items.Item item54 = new org.mafagafogigante.dungeon.entity.items.Item(itemPreset0, date50);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "00:00:00"+ "'", str23.equals("00:00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay34 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay34.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long35 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long45 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit48 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR + "'", dungeonTimeUnit48.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date50);
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit52 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR + "'", dungeonTimeUnit52.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date53);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test475"); }

    org.mafagafogigante.dungeon.entity.items.LocationInventory locationInventory0 = new org.mafagafogigante.dungeon.entity.items.LocationInventory();
    org.mafagafogigante.dungeon.entity.items.Item item1 = null;
    boolean b2 = locationInventory0.hasItem(item1);
    int i3 = locationInventory0.getItemCount();
    org.mafagafogigante.dungeon.entity.items.Item item4 = null;
    boolean b5 = locationInventory0.hasItem(item4);
    org.mafagafogigante.dungeon.entity.items.Item item6 = null;
    // The following exception was thrown during execution in test generation
    try {
    locationInventory0.removeItem(item6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test476"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date((long)97, (long)(byte)-1, (long)'#');
    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics4 = new org.mafagafogigante.dungeon.stats.BattleStatistics();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement5 = null;
    boolean b6 = battleStatistics4.satisfies(battleStatisticsRequirement5);
    java.lang.String str7 = battleStatistics4.toString();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery8 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement10 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement(battleStatisticsQuery8, (int)(byte)100);
    boolean b11 = battleStatistics4.satisfies(battleStatisticsRequirement10);
    org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.CauseOfDeath> countermap_causeOfDeath12 = battleStatistics4.getKillsByCauseOfDeath();
    org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.CauseOfDeath> countermap_causeOfDeath13 = battleStatistics4.getKillsByCauseOfDeath();
    boolean b14 = date3.equals((java.lang.Object)countermap_causeOfDeath13);
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit16 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.YEAR;
    org.mafagafogigante.dungeon.date.Date date17 = date3.plus(45056, dungeonTimeUnit16);
    org.mafagafogigante.dungeon.date.Date date21 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date25 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i26 = date21.compareTo(date25);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay27 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date21);
    long long28 = date21.getYear();
    org.mafagafogigante.dungeon.date.Date date32 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date36 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i37 = date32.compareTo(date36);
    long long38 = date32.getYear();
    int i39 = date21.compareTo(date32);
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit41 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR;
    org.mafagafogigante.dungeon.date.Date date42 = date32.minus(35, dungeonTimeUnit41);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay43 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity44 = partOfDay43.getLuminosity();
    int i45 = org.mafagafogigante.dungeon.game.PartOfDay.getSecondsToNext(date42, partOfDay43);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.date.Duration duration46 = new org.mafagafogigante.dungeon.date.Duration(date3, date42);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "BattleStatistics{records=CounterMap{map={}}}"+ "'", str7.equals("BattleStatistics{records=CounterMap{map={}}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_causeOfDeath12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_causeOfDeath13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit16 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.YEAR + "'", dungeonTimeUnit16.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.YEAR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay27 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay27.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long28 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long38 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit41 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR + "'", dungeonTimeUnit41.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date42);
    org.junit.Assert.assertTrue("'" + partOfDay43 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay43.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 43200);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test477"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity((int)(byte)1, (int)(byte)0);
    boolean b3 = integrity2.isZero();
    boolean b4 = integrity2.isMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test478"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule2 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeBoundIntegerRule((int)(short)-1, 17518);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule2);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test479"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature1 = null;
    org.mafagafogigante.dungeon.entity.creatures.CreatureHealth creatureHealth2 = org.mafagafogigante.dungeon.entity.creatures.CreatureHealth.makeCreatureHealth(100, creature1);
    boolean b3 = creatureHealth2.isAlive();
    java.lang.String str4 = creatureHealth2.toString();
    creatureHealth2.decrementBy((int)(byte)10);
    org.mafagafogigante.dungeon.entity.creatures.HealthState healthState7 = creatureHealth2.getHealthState();
    creatureHealth2.incrementBy(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creatureHealth2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "CreatureHealth{integrity=100/100}"+ "'", str4.equals("CreatureHealth{integrity=100/100}"));
    org.junit.Assert.assertTrue("'" + healthState7 + "' != '" + org.mafagafogigante.dungeon.entity.creatures.HealthState.UNINJURED + "'", healthState7.equals(org.mafagafogigante.dungeon.entity.creatures.HealthState.UNINJURED));

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test480"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, 100, (double)(-1));
    org.mafagafogigante.dungeon.entity.items.Item item4 = null;
    boolean b5 = creatureInventory3.hasItem(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test481"); }

    org.mafagafogigante.dungeon.util.ShuffledRange shuffledRange2 = new org.mafagafogigante.dungeon.util.ShuffledRange(0, 81);
    int i3 = shuffledRange2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 81);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test482"); }

    org.mafagafogigante.dungeon.game.DungeonString dungeonString1 = new org.mafagafogigante.dungeon.game.DungeonString("ColoredString{string='User: Nicholas\nTime: 15:42:10\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 19.7 MiB out of the allocated 123.0 MiB\nOS: Windows 10 (amd64) 10.0', color=null}");

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test483"); }

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
    org.mafagafogigante.dungeon.entity.TagSet<org.mafagafogigante.dungeon.entity.creatures.Creature.Tag> tagset_tag26 = null;
    creaturePreset0.setTagSet(tagset_tag26);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity28 = creaturePreset0.getLuminosity();
    java.lang.String str29 = creaturePreset0.getType();
    
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
    org.junit.Assert.assertNotNull(luminosity28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str29);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test484"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity2 = itemPreset0.getLuminosity();
    org.mafagafogigante.dungeon.util.Percentage percentage4 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset0.setVisibility(percentage4);
    itemPreset0.setUnique(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity2);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test485"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, 100, (double)(-1));
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
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test486"); }

    org.mafagafogigante.dungeon.game.Direction direction1 = org.mafagafogigante.dungeon.game.Direction.fromAbbreviation("Badly Injured");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(direction1);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test487"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    int i5 = itemPreset0.getIntegrityDecrementOnEat();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test488"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    itemPreset0.setDrinkableHealing((int)(short)0);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset0.setVisibility(percentage4);
    int i6 = itemPreset0.getDrinkableDoses();
    int i7 = itemPreset0.getIntegrityDecrementOnHit();
    itemPreset0.setType("0 ms");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test489"); }

    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery0 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    battleStatisticsQuery0.setType("Damaged");
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath3 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery4 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    battleStatisticsQuery4.setType("Damaged");
    battleStatisticsQuery4.setType("");
    boolean b9 = causeOfDeath3.equals((java.lang.Object)battleStatisticsQuery4);
    org.mafagafogigante.dungeon.game.Id id10 = null;
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery12 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath13 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    battleStatisticsQuery12.setCauseOfDeath(causeOfDeath13);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay15 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.stats.BattleRecord battleRecord16 = new org.mafagafogigante.dungeon.stats.BattleRecord(id10, "", causeOfDeath13, partOfDay15);
    boolean b17 = battleStatisticsQuery4.matches(battleRecord16);
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath18 = battleRecord16.getCauseOfDeath();
    boolean b19 = battleStatisticsQuery0.matches(battleRecord16);
    org.mafagafogigante.dungeon.game.Id id20 = battleRecord16.getId();
    org.mafagafogigante.dungeon.game.Id id21 = battleRecord16.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath13);
    org.junit.Assert.assertTrue("'" + partOfDay15 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay15.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id21);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test490"); }

    org.mafagafogigante.dungeon.logging.DungeonLogger.warning("LocationDescription{symbol=a, color=null, info='Night'}");

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test491"); }

    org.mafagafogigante.dungeon.stats.Statistics statistics0 = new org.mafagafogigante.dungeon.stats.Statistics();
    statistics0.writeStatistics();
    statistics0.writeStatistics();
    statistics0.writeStatistics();
    org.mafagafogigante.dungeon.commands.IssuedCommand issuedCommand5 = new org.mafagafogigante.dungeon.commands.IssuedCommand("BattleStatistics{records=CounterMap{map={}}}");
    org.mafagafogigante.dungeon.commands.PreparedIssuedCommand preparedIssuedCommand6 = org.mafagafogigante.dungeon.commands.IssuedCommandProcessor.prepareIssuedCommand(issuedCommand5);
    statistics0.addCommand(issuedCommand5);
    org.mafagafogigante.dungeon.commands.IssuedCommandEvaluation issuedCommandEvaluation8 = org.mafagafogigante.dungeon.commands.IssuedCommandProcessor.evaluateIssuedCommand(issuedCommand5);
    org.mafagafogigante.dungeon.commands.IssuedCommandEvaluation issuedCommandEvaluation9 = org.mafagafogigante.dungeon.commands.IssuedCommandProcessor.evaluateIssuedCommand(issuedCommand5);
    boolean b10 = issuedCommandEvaluation9.isValid();
    java.lang.String str11 = issuedCommandEvaluation9.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(preparedIssuedCommand6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(issuedCommandEvaluation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(issuedCommandEvaluation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "IssuedCommandEvaluation{valid=false, suggestions=[achievements, destroy, tutorial]}"+ "'", str11.equals("IssuedCommandEvaluation{valid=false, suggestions=[achievements, destroy, tutorial]}"));

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test492"); }

    org.mafagafogigante.dungeon.entity.items.LocationInventory locationInventory0 = new org.mafagafogigante.dungeon.entity.items.LocationInventory();
    locationInventory0.refreshItems();

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test493"); }

    org.mafagafogigante.dungeon.date.Date date5 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date9 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i10 = date5.compareTo(date9);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay11 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date5);
    java.lang.String[] str_array17 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table18 = new org.mafagafogigante.dungeon.util.Table(str_array17);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString19 = table18.toColoredStringList();
    org.mafagafogigante.dungeon.game.ColoredString coloredString20 = org.mafagafogigante.dungeon.game.Random.select(list_coloredString19);
    boolean b21 = date5.equals((java.lang.Object)coloredString20);
    java.awt.Color color22 = coloredString20.getColor();
    org.mafagafogigante.dungeon.game.LocationDescription locationDescription23 = new org.mafagafogigante.dungeon.game.LocationDescription('a', color22);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString24 = new org.mafagafogigante.dungeon.game.DungeonString("day 10 of month 1 of the year 97", color22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay11 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay11.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(coloredString20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color22);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test494"); }

    org.mafagafogigante.dungeon.entity.items.FoodComponent foodComponent2 = new org.mafagafogigante.dungeon.entity.items.FoodComponent((int)(short)10, 57);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test495"); }

    org.mafagafogigante.dungeon.io.Sleeper.sleep((long)3600);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test496"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature1 = null;
    org.mafagafogigante.dungeon.entity.creatures.CreatureHealth creatureHealth2 = org.mafagafogigante.dungeon.entity.creatures.CreatureHealth.makeCreatureHealth(100, creature1);
    int i3 = creatureHealth2.getMaximum();
    int i4 = creatureHealth2.getMaximum();
    java.lang.String str5 = creatureHealth2.toString();
    creatureHealth2.incrementBy(32);
    int i8 = creatureHealth2.getCurrent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creatureHealth2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "CreatureHealth{integrity=100/100}"+ "'", str5.equals("CreatureHealth{integrity=100/100}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test497"); }

    org.mafagafogigante.dungeon.util.StopWatch stopWatch0 = new org.mafagafogigante.dungeon.util.StopWatch();
    java.lang.String str1 = stopWatch0.toString();
    java.util.concurrent.TimeUnit timeUnit2 = null;
    java.lang.String str3 = stopWatch0.toString(timeUnit2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0 ms"+ "'", str1.equals("0 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test498"); }

    org.mafagafogigante.dungeon.world.WeatherCondition weatherCondition0 = org.mafagafogigante.dungeon.world.WeatherCondition.CLEAR;
    org.mafagafogigante.dungeon.world.WeatherCondition weatherCondition1 = org.mafagafogigante.dungeon.world.WeatherCondition.RAIN;
    java.lang.String str2 = weatherCondition1.toDescriptiveString();
    org.mafagafogigante.dungeon.world.WeatherConditionVisibilityCriterion weatherConditionVisibilityCriterion3 = new org.mafagafogigante.dungeon.world.WeatherConditionVisibilityCriterion(weatherCondition0, weatherCondition1);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature4 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer5 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature4);
    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array6 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria7 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array6);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature8 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer9 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature8);
    boolean b10 = visibilityCriteria7.isMetBy(observer9);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array11 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item12 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item12, item_array11);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString15 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    observer9.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item12, dungeonString15);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString17 = null;
    observer5.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item12, dungeonString17);
    // The following exception was thrown during execution in test generation
    try {
    boolean b19 = weatherConditionVisibilityCriterion3.isMetBy(observer5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + weatherCondition0 + "' != '" + org.mafagafogigante.dungeon.world.WeatherCondition.CLEAR + "'", weatherCondition0.equals(org.mafagafogigante.dungeon.world.WeatherCondition.CLEAR));
    org.junit.Assert.assertTrue("'" + weatherCondition1 + "' != '" + org.mafagafogigante.dungeon.world.WeatherCondition.RAIN + "'", weatherCondition1.equals(org.mafagafogigante.dungeon.world.WeatherCondition.RAIN));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "it is raining"+ "'", str2.equals("it is raining"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test499"); }

    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances0 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances1 = new org.mafagafogigante.dungeon.game.BlockedEntrances(blockedEntrances0);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances2 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.Direction direction3 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b5 = direction3.equalsIgnoreCase("Damaged");
    java.lang.String str6 = direction3.toString();
    java.lang.String str7 = direction3.toString();
    boolean b8 = blockedEntrances2.isBlocked(direction3);
    blockedEntrances1.block(direction3);
    org.junit.Assert.assertTrue("'" + direction3 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction3.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "East"+ "'", str6.equals("East"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "East"+ "'", str7.equals("East"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test500"); }

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
    org.mafagafogigante.dungeon.entity.Weight weight17 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    org.mafagafogigante.dungeon.entity.Weight weight18 = org.mafagafogigante.dungeon.entity.Weight.ZERO;
    org.mafagafogigante.dungeon.entity.Weight weight19 = weight17.add(weight18);
    org.mafagafogigante.dungeon.entity.Weight weight21 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)'#');
    org.mafagafogigante.dungeon.entity.Weight weight22 = weight19.add(weight21);
    circularlist_comparable_weight1.add((java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>)weight19);
    int i24 = circularlist_comparable_weight1.size();
    java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight> comparable_weight25 = null;
    circularlist_comparable_weight1.add(comparable_weight25);
    int i27 = circularlist_comparable_weight1.size();
    
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
    org.junit.Assert.assertNotNull(weight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 4);

  }

}
