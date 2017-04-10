
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test001"); }

    org.mafagafogigante.dungeon.entity.items.IntegrityState integrityState0 = org.mafagafogigante.dungeon.entity.items.IntegrityState.BROKEN;
    java.lang.String str1 = integrityState0.toString();
    java.lang.String str2 = integrityState0.toString();
    org.junit.Assert.assertTrue("'" + integrityState0 + "' != '" + org.mafagafogigante.dungeon.entity.items.IntegrityState.BROKEN + "'", integrityState0.equals(org.mafagafogigante.dungeon.entity.items.IntegrityState.BROKEN));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Broken"+ "'", str1.equals("Broken"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Broken"+ "'", str2.equals("Broken"));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test002"); }

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
    org.mafagafogigante.dungeon.util.Percentage percentage25 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b27 = percentage25.equals((java.lang.Object)10.0d);
    double d28 = percentage25.toDouble();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity29 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage25);
    org.mafagafogigante.dungeon.entity.Visibility visibility30 = new org.mafagafogigante.dungeon.entity.Visibility(percentage25);
    org.mafagafogigante.dungeon.util.Percentage percentage31 = visibility30.toPercentage();
    itemPreset0.setVisibility(percentage31);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity33 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage31);
    java.lang.String str34 = luminosity33.toString();
    org.mafagafogigante.dungeon.util.Percentage percentage35 = luminosity33.toPercentage();
    
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
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d28 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "Luminosity of 100.00%"+ "'", str34.equals("Luminosity of 100.00%"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage35);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test003"); }

    org.mafagafogigante.dungeon.world.TimeVisibilityCriterion timeVisibilityCriterion2 = new org.mafagafogigante.dungeon.world.TimeVisibilityCriterion(85, 2);
    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array3 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria4 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array3);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature5 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer6 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature5);
    boolean b7 = visibilityCriteria4.isMetBy(observer6);
    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array8 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria9 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array8);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature10 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer11 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature10);
    boolean b12 = visibilityCriteria9.isMetBy(observer11);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array13 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item14 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item14, item_array13);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString17 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array22 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString17.append(str_array22);
    observer11.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item14, dungeonString17);
    org.mafagafogigante.dungeon.entity.creatures.Creature[] creature_array25 = new org.mafagafogigante.dungeon.entity.creatures.Creature[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Creature> arraylist_creature26 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Creature>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.Creature>)arraylist_creature26, creature_array25);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString29 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array34 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString29.append(str_array34);
    java.lang.String str36 = dungeonString29.toString();
    org.mafagafogigante.dungeon.game.Point point40 = new org.mafagafogigante.dungeon.game.Point(10, (int)'a', 0);
    java.lang.String[] str_array43 = new java.lang.String[] { "", "" };
    org.mafagafogigante.dungeon.util.Table table44 = new org.mafagafogigante.dungeon.util.Table(str_array43);
    boolean b45 = point40.equals((java.lang.Object)str_array43);
    dungeonString29.append(str_array43);
    observer11.writeCreatureSight((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Creature>)arraylist_creature26, dungeonString29);
    boolean b48 = visibilityCriteria4.isMetBy(observer11);
    // The following exception was thrown during execution in test generation
    try {
    boolean b49 = timeVisibilityCriterion2.isMetBy(observer11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creature_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"+ "'", str36.equals("DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test004"); }

    org.mafagafogigante.dungeon.stats.Statistics statistics0 = new org.mafagafogigante.dungeon.stats.Statistics();
    statistics0.writeStatistics();
    statistics0.writeStatistics();
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker3 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics0);
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker4 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics0);
    java.util.Comparator<org.mafagafogigante.dungeon.achievements.UnlockedAchievement> comparator_unlockedAchievement5 = org.mafagafogigante.dungeon.achievements.comparators.UnlockedAchievementComparators.getDefaultComparator();
    java.util.List<org.mafagafogigante.dungeon.achievements.UnlockedAchievement> list_unlockedAchievement6 = achievementTracker4.getUnlockedAchievements(comparator_unlockedAchievement5);
    int i7 = achievementTracker4.getUnlockedCount();
    int i8 = achievementTracker4.getUnlockedCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_unlockedAchievement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_unlockedAchievement6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test005"); }

    org.mafagafogigante.dungeon.entity.creatures.Hero hero0 = null;
    org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster heroSpellcaster1 = new org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster(hero0);
    java.util.List<org.mafagafogigante.dungeon.spells.Spell> list_spell2 = heroSpellcaster1.getSpellList();
    java.lang.String[] str_array3 = new java.lang.String[] {  };
    heroSpellcaster1.parseCast(str_array3);
    java.util.List<org.mafagafogigante.dungeon.spells.Spell> list_spell5 = heroSpellcaster1.getSpellList();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_spell2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_spell5);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test006"); }

    org.mafagafogigante.dungeon.util.CircularList<java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>> circularlist_comparable_weight1 = new org.mafagafogigante.dungeon.util.CircularList<java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>>(100);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature2 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory5 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature2, (-1), 0.0d);
    org.mafagafogigante.dungeon.entity.Weight weight6 = creatureInventory5.getWeight();
    circularlist_comparable_weight1.add((java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>)weight6);
    int i8 = circularlist_comparable_weight1.size();
    boolean b9 = circularlist_comparable_weight1.isEmpty();
    java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight> comparable_weight11 = circularlist_comparable_weight1.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparable_weight11);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test007"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.util.Percentage percentage2 = itemPreset0.getVisibility();
    org.mafagafogigante.dungeon.entity.Weight weight3 = itemPreset0.getWeight();
    boolean b4 = itemPreset0.isUnique();
    org.mafagafogigante.dungeon.game.Name name5 = itemPreset0.getName();
    itemPreset0.setType("User: Nicholas\nTime: 15:42:14\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 43.1 MiB out of the allocated 149.0 MiB\nOS: Windows 10 (amd64) 10.0");
    java.lang.String str8 = itemPreset0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weight3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(name5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User: Nicholas\nTime: 15:42:14\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 43.1 MiB out of the allocated 149.0 MiB\nOS: Windows 10 (amd64) 10.0"+ "'", str8.equals("User: Nicholas\nTime: 15:42:14\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 43.1 MiB out of the allocated 149.0 MiB\nOS: Windows 10 (amd64) 10.0"));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test008"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date7 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i8 = date3.compareTo(date7);
    java.lang.String str9 = date3.toTimeString();
    org.mafagafogigante.dungeon.date.Date date13 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date17 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i18 = date13.compareTo(date17);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay19 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date13);
    long long20 = date13.getYear();
    org.mafagafogigante.dungeon.date.Date date24 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date28 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i29 = date24.compareTo(date28);
    long long30 = date24.getYear();
    int i31 = date13.compareTo(date24);
    java.lang.String str32 = date24.toDateString();
    int i33 = date3.compareTo(date24);
    long long34 = date3.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "00:00:00"+ "'", str9.equals("00:00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay19 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay19.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long20 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long30 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "day 10 of month 10 of the year 10"+ "'", str32.equals("day 10 of month 10 of the year 10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long34 == 10L);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test009"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity((int)(byte)1, (int)(byte)0);
    boolean b3 = integrity2.isMaximum();
    org.mafagafogigante.dungeon.entity.items.Item item4 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity5 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity2, item4);
    itemIntegrity5.incrementBy((int)(byte)0);
    itemIntegrity5.incrementBy(38);
    int i10 = itemIntegrity5.getMaximum();
    itemIntegrity5.incrementBy(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemIntegrity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test010"); }

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
    boolean b13 = blockedEntrances0.isBlocked(direction11);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances14 = new org.mafagafogigante.dungeon.game.BlockedEntrances(blockedEntrances0);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test011"); }

    org.mafagafogigante.dungeon.entity.items.FoodComponent foodComponent2 = new org.mafagafogigante.dungeon.entity.items.FoodComponent(82800, (int)' ');
    int i3 = foodComponent2.getNutrition();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 82800);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test012"); }

    org.mafagafogigante.dungeon.game.DungeonString dungeonString3 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString3.append(str_array8);
    java.lang.String[] str_array15 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table16 = new org.mafagafogigante.dungeon.util.Table(str_array15);
    dungeonString3.append(str_array15);
    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array18 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria19 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array18);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature20 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer21 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature20);
    boolean b22 = visibilityCriteria19.isMetBy(observer21);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array23 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item24 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item24, item_array23);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString27 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    observer21.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item24, dungeonString27);
    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array29 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria30 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array29);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature31 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer32 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature31);
    boolean b33 = visibilityCriteria30.isMetBy(observer32);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array34 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item35 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item35, item_array34);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString38 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    observer32.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item35, dungeonString38);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString41 = new org.mafagafogigante.dungeon.game.DungeonString("");
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString42 = dungeonString41.toColoredStringList();
    observer21.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item35, dungeonString41);
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications46 = new org.mafagafogigante.dungeon.gui.WritingSpecifications(false, 32);
    boolean b47 = writingSpecifications46.shouldWait();
    int i48 = writingSpecifications46.getWait();
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)dungeonString41, writingSpecifications46);
    org.mafagafogigante.dungeon.date.Date date55 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date59 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i60 = date55.compareTo(date59);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay61 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date55);
    java.lang.String[] str_array67 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table68 = new org.mafagafogigante.dungeon.util.Table(str_array67);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString69 = table68.toColoredStringList();
    org.mafagafogigante.dungeon.game.ColoredString coloredString70 = org.mafagafogigante.dungeon.game.Random.select(list_coloredString69);
    boolean b71 = date55.equals((java.lang.Object)coloredString70);
    java.awt.Color color72 = coloredString70.getColor();
    org.mafagafogigante.dungeon.game.ColoredString coloredString73 = new org.mafagafogigante.dungeon.game.ColoredString("User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 41.5 MiB out of the allocated 154.5 MiB\nOS: Windows 10 (amd64) 10.0", color72);
    org.mafagafogigante.dungeon.game.ColoredString coloredString74 = new org.mafagafogigante.dungeon.game.ColoredString("Unarmed : UNARMED", color72);
    dungeonString41.setColor(color72);
    dungeonString3.setColor(color72);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString77 = new org.mafagafogigante.dungeon.game.DungeonString("the sky is cloudy", color72);
    org.mafagafogigante.dungeon.game.LocationDescription locationDescription78 = new org.mafagafogigante.dungeon.game.LocationDescription('a', color72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay61 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay61.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(coloredString70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color72);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test013"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.util.library.AutomaticShuffledStringLibrary automaticShuffledStringLibrary1 = new org.mafagafogigante.dungeon.util.library.AutomaticShuffledStringLibrary("Luminosity of 0.00%");
      org.junit.Assert.fail("Expected exception of type org.mafagafogigante.dungeon.io.JsonObjectFactory.IllegalFilenameExtensionException");
    } catch (org.mafagafogigante.dungeon.io.JsonObjectFactory.IllegalFilenameExtensionException e) {
      // Expected exception.
    }

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test014"); }

    java.lang.String str1 = org.mafagafogigante.dungeon.io.Converter.bytesToHuman((long)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10 B"+ "'", str1.equals("10 B"));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test015"); }

    org.mafagafogigante.dungeon.entity.Weight weight1 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset2 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity3 = itemPreset2.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity4 = null;
    itemPreset2.setIntegrity(integrity4);
    org.mafagafogigante.dungeon.util.Percentage percentage6 = itemPreset2.getVisibility();
    boolean b7 = itemPreset2.isUnique();
    org.mafagafogigante.dungeon.entity.Weight weight9 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    org.mafagafogigante.dungeon.entity.Weight weight10 = org.mafagafogigante.dungeon.entity.Weight.ZERO;
    org.mafagafogigante.dungeon.entity.Weight weight11 = weight9.add(weight10);
    java.lang.String str12 = weight11.toString();
    itemPreset2.setWeight(weight11);
    int i14 = weight1.compareTo(weight11);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset16 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity17 = itemPreset16.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity18 = null;
    itemPreset16.setIntegrity(integrity18);
    org.mafagafogigante.dungeon.util.Percentage percentage20 = itemPreset16.getVisibility();
    java.lang.String str21 = itemPreset16.getType();
    itemPreset16.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage25 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset16.setVisibility(percentage25);
    org.mafagafogigante.dungeon.game.Id id27 = null;
    itemPreset16.setId(id27);
    itemPreset16.setPutrefactionPeriod((long)(short)1);
    org.mafagafogigante.dungeon.entity.TagSet<org.mafagafogigante.dungeon.entity.items.Item.Tag> tagset_tag31 = itemPreset16.getTagSet();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset35 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    itemPreset35.setDrinkableHealing((int)(short)0);
    org.mafagafogigante.dungeon.util.Percentage percentage39 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset35.setVisibility(percentage39);
    double d41 = org.mafagafogigante.dungeon.util.DungeonMath.weightedAverage((double)10.0f, 100.0d, percentage39);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset42 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity43 = itemPreset42.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity44 = null;
    itemPreset42.setIntegrity(integrity44);
    org.mafagafogigante.dungeon.util.Percentage percentage46 = itemPreset42.getVisibility();
    java.lang.String str47 = itemPreset42.getType();
    org.mafagafogigante.dungeon.entity.items.Item.Tag tag48 = org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE;
    itemPreset42.addTag(tag48);
    org.mafagafogigante.dungeon.util.Percentage percentage51 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b53 = percentage51.equals((java.lang.Object)10.0d);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity54 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage51);
    itemPreset42.setVisibility(percentage51);
    boolean b56 = percentage39.biggerThanOrEqualTo(percentage51);
    org.mafagafogigante.dungeon.entity.items.WeaponComponent weaponComponent58 = new org.mafagafogigante.dungeon.entity.items.WeaponComponent((int)(short)10, percentage51, 1);
    itemPreset16.setVisibility(percentage51);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity60 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage51);
    org.mafagafogigante.dungeon.entity.items.WeaponComponent weaponComponent62 = new org.mafagafogigante.dungeon.entity.items.WeaponComponent((int)'a', percentage51, (int)'a');
    org.mafagafogigante.dungeon.entity.Weight weight63 = weight11.multiply(percentage51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "0 kg"+ "'", str12.equals("0 kg"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tagset_tag31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d41 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str47);
    org.junit.Assert.assertTrue("'" + tag48 + "' != '" + org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE + "'", tag48.equals(org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight63);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test016"); }

    org.mafagafogigante.dungeon.util.Percentage percentage3 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b5 = percentage3.equals((java.lang.Object)10.0d);
    double d6 = percentage3.toDouble();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity7 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage3);
    org.mafagafogigante.dungeon.entity.Visibility visibility8 = new org.mafagafogigante.dungeon.entity.Visibility(percentage3);
    org.mafagafogigante.dungeon.util.Percentage percentage9 = visibility8.toPercentage();
    org.mafagafogigante.dungeon.util.Percentage percentage10 = visibility8.toPercentage();
    org.mafagafogigante.dungeon.util.Percentage percentage11 = visibility8.toPercentage();
    org.mafagafogigante.dungeon.stats.Statistics statistics12 = new org.mafagafogigante.dungeon.stats.Statistics();
    statistics12.writeStatistics();
    statistics12.writeStatistics();
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker15 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics12);
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker16 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics12);
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker17 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics12);
    int i18 = achievementTracker17.getUnlockedCount();
    boolean b19 = percentage11.equals((java.lang.Object)i18);
    double d20 = org.mafagafogigante.dungeon.util.DungeonMath.weightedAverage((double)57600, (-1.0d), percentage11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == (-1.0d));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test017"); }

    boolean b1 = org.mafagafogigante.dungeon.commands.IssuedCommand.isValidSource("1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test018"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule2 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeBoundDoubleRule((double)28, (double)830217600000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule2);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test019"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule2 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeBoundDoubleRule((double)57600, (double)86313600000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule2);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test020"); }

    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery0 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    java.lang.String str1 = battleStatisticsQuery0.toString();
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics2 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point3 = null;
    org.mafagafogigante.dungeon.game.Id id4 = null;
    explorationStatistics2.createEntryIfNotExists(point3, id4);
    org.mafagafogigante.dungeon.game.Point point9 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id10 = null;
    explorationStatistics2.addVisit(point9, id10);
    boolean b12 = battleStatisticsQuery0.equals((java.lang.Object)explorationStatistics2);
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
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics49 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point50 = null;
    org.mafagafogigante.dungeon.game.Id id51 = null;
    explorationStatistics49.createEntryIfNotExists(point50, id51);
    org.mafagafogigante.dungeon.game.Point point56 = new org.mafagafogigante.dungeon.game.Point(10, (int)'a', 0);
    java.lang.String[] str_array59 = new java.lang.String[] { "", "" };
    org.mafagafogigante.dungeon.util.Table table60 = new org.mafagafogigante.dungeon.util.Table(str_array59);
    boolean b61 = point56.equals((java.lang.Object)str_array59);
    org.mafagafogigante.dungeon.game.Id id62 = null;
    explorationStatistics49.addVisit(point56, id62);
    org.mafagafogigante.dungeon.game.Id id64 = null;
    explorationStatistics13.addVisit(point56, id64);
    int i66 = point56.getZ();
    // The following exception was thrown during execution in test generation
    try {
    explorationStatistics2.addKill(point56);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "BattleStatisticsQuery{id=null, type='null', causeOfDeath=null, partOfDay=null}"+ "'", str1.equals("BattleStatisticsQuery{id=null, type='null', causeOfDeath=null, partOfDay=null}"));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test021"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date7 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i8 = date3.compareTo(date7);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay9 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date3);
    java.lang.String str10 = date3.toTimeString();
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit12 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR;
    org.mafagafogigante.dungeon.date.Date date13 = date3.plus(3600, dungeonTimeUnit12);
    long long14 = date3.getHour();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay9 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay9.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "00:00:00"+ "'", str10.equals("00:00:00"));
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit12 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR + "'", dungeonTimeUnit12.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 0L);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test022"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay3 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity4 = partOfDay3.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name5 = partOfDay3.getName();
    org.mafagafogigante.dungeon.game.QuantificationMode quantificationMode7 = org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER;
    java.lang.String str8 = name5.getQuantifiedName((int)'4', quantificationMode7);
    creaturePreset0.setName(name5);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay11 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity12 = partOfDay11.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name13 = partOfDay11.getName();
    org.mafagafogigante.dungeon.game.QuantificationMode quantificationMode15 = org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER;
    java.lang.String str16 = name13.getQuantifiedName((int)'4', quantificationMode15);
    java.lang.String str17 = name5.getQuantifiedName(18614, quantificationMode15);
    org.junit.Assert.assertTrue("'" + partOfDay3 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay3.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name5);
    org.junit.Assert.assertTrue("'" + quantificationMode7 + "' != '" + org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER + "'", quantificationMode7.equals(org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "52 Nights"+ "'", str8.equals("52 Nights"));
    org.junit.Assert.assertTrue("'" + partOfDay11 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay11.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name13);
    org.junit.Assert.assertTrue("'" + quantificationMode15 + "' != '" + org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER + "'", quantificationMode15.equals(org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "52 Nights"+ "'", str16.equals("52 Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "18614 Nights"+ "'", str17.equals("18614 Nights"));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test023"); }

    org.mafagafogigante.dungeon.logging.DungeonLogger.warning("Midnight");

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test024"); }

    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances1 = new org.mafagafogigante.dungeon.game.BlockedEntrances(blockedEntrances0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test025"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature1 = null;
    org.mafagafogigante.dungeon.entity.creatures.CreatureHealth creatureHealth2 = org.mafagafogigante.dungeon.entity.creatures.CreatureHealth.makeCreatureHealth(100, creature1);
    creatureHealth2.incrementBy(57);
    creatureHealth2.incrementBy(32);
    boolean b7 = creatureHealth2.isFull();
    creatureHealth2.decrementBy(2);
    boolean b10 = creatureHealth2.isFull();
    org.mafagafogigante.dungeon.util.Percentage percentage11 = creatureHealth2.toPercentage();
    org.mafagafogigante.dungeon.entity.creatures.HealthState healthState12 = creatureHealth2.getHealthState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creatureHealth2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage11);
    org.junit.Assert.assertTrue("'" + healthState12 + "' != '" + org.mafagafogigante.dungeon.entity.creatures.HealthState.UNINJURED + "'", healthState12.equals(org.mafagafogigante.dungeon.entity.creatures.HealthState.UNINJURED));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test026"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    java.lang.String str5 = itemPreset0.getType();
    itemPreset0.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage9 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset0.setVisibility(percentage9);
    org.mafagafogigante.dungeon.util.Percentage percentage12 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    int i13 = percentage9.compareTo(percentage12);
    org.mafagafogigante.dungeon.util.Percentage percentage15 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    boolean b16 = org.mafagafogigante.dungeon.game.Random.roll(percentage15);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset19 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    itemPreset19.setDrinkableHealing((int)(short)0);
    org.mafagafogigante.dungeon.util.Percentage percentage23 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset19.setVisibility(percentage23);
    double d25 = org.mafagafogigante.dungeon.util.DungeonMath.weightedAverage((double)10.0f, 100.0d, percentage23);
    java.lang.String str26 = percentage23.toString();
    org.mafagafogigante.dungeon.util.Percentage percentage27 = percentage15.multiply(percentage23);
    boolean b28 = percentage12.biggerThanOrEqualTo(percentage27);
    double d29 = percentage27.toDouble();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d25 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "100.00%"+ "'", str26.equals("100.00%"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d29 == 1.0d);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test027"); }

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
    org.mafagafogigante.dungeon.util.CircularList<java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>> circularlist_comparable_weight23 = new org.mafagafogigante.dungeon.util.CircularList<java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>>(100);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature24 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory27 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature24, (-1), 0.0d);
    org.mafagafogigante.dungeon.entity.Weight weight28 = creatureInventory27.getWeight();
    circularlist_comparable_weight23.add((java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>)weight28);
    org.mafagafogigante.dungeon.entity.Weight weight31 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)'#');
    org.mafagafogigante.dungeon.entity.Weight weight33 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)'#');
    org.mafagafogigante.dungeon.entity.Weight weight34 = weight31.add(weight33);
    org.mafagafogigante.dungeon.entity.Weight weight36 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    org.mafagafogigante.dungeon.entity.Weight weight37 = org.mafagafogigante.dungeon.entity.Weight.ZERO;
    org.mafagafogigante.dungeon.entity.Weight weight38 = weight36.add(weight37);
    int i39 = weight33.compareTo(weight37);
    org.mafagafogigante.dungeon.entity.Weight weight40 = weight28.add(weight37);
    circularlist_comparable_weight1.add((java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>)weight37);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight> comparable_weight43 = circularlist_comparable_weight1.get(100);
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
    org.junit.Assert.assertNotNull(weight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight40);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test028"); }

    org.mafagafogigante.dungeon.util.NonNegativeInteger nonNegativeInteger1 = new org.mafagafogigante.dungeon.util.NonNegativeInteger((java.lang.Integer)35);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test029"); }

    org.mafagafogigante.dungeon.game.Point point3 = new org.mafagafogigante.dungeon.game.Point(90, (int)' ', 34);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test030"); }

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
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics12 = statistics8.getExplorationStatistics();
    org.mafagafogigante.dungeon.game.Id id13 = null;
    int i14 = explorationStatistics12.getKillCount(id13);
    org.mafagafogigante.dungeon.game.Id id15 = null;
    int i16 = explorationStatistics12.getKillCount(id15);
    org.mafagafogigante.dungeon.game.Id id17 = null;
    int i18 = explorationStatistics12.getVisitedLocations(id17);
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics19 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point20 = null;
    org.mafagafogigante.dungeon.game.Id id21 = null;
    explorationStatistics19.createEntryIfNotExists(point20, id21);
    org.mafagafogigante.dungeon.game.Point point26 = new org.mafagafogigante.dungeon.game.Point(10, (int)'a', 0);
    java.lang.String[] str_array29 = new java.lang.String[] { "", "" };
    org.mafagafogigante.dungeon.util.Table table30 = new org.mafagafogigante.dungeon.util.Table(str_array29);
    boolean b31 = point26.equals((java.lang.Object)str_array29);
    org.mafagafogigante.dungeon.game.Id id32 = null;
    explorationStatistics19.addVisit(point26, id32);
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics34 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point35 = null;
    org.mafagafogigante.dungeon.game.Id id36 = null;
    explorationStatistics34.createEntryIfNotExists(point35, id36);
    org.mafagafogigante.dungeon.game.Point point41 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id42 = null;
    explorationStatistics34.addVisit(point41, id42);
    java.lang.String str44 = point41.toString();
    int i45 = point41.getZ();
    org.mafagafogigante.dungeon.game.Id id46 = null;
    explorationStatistics19.addVisit(point41, id46);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset48 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity49 = itemPreset48.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity50 = null;
    itemPreset48.setIntegrity(integrity50);
    org.mafagafogigante.dungeon.util.Percentage percentage52 = itemPreset48.getVisibility();
    org.mafagafogigante.dungeon.entity.Integrity integrity53 = itemPreset48.getIntegrity();
    java.lang.String str54 = itemPreset48.getText();
    java.lang.String str55 = itemPreset48.getType();
    org.mafagafogigante.dungeon.entity.Integrity integrity58 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    boolean b59 = integrity58.isMaximum();
    integrity58.incrementBy((int)(short)0);
    org.mafagafogigante.dungeon.util.Percentage percentage62 = integrity58.toPercentage();
    itemPreset48.setHitRate(percentage62);
    org.mafagafogigante.dungeon.game.Id id65 = new org.mafagafogigante.dungeon.game.Id("100");
    java.lang.String str66 = id65.toString();
    itemPreset48.setId(id65);
    explorationStatistics12.addVisit(point41, id65);
    int i69 = point41.getX();
    
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
    org.junit.Assert.assertNotNull(explorationStatistics12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{32, 0, -1}"+ "'", str44.equals("{32, 0, -1}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "100"+ "'", str66.equals("100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 32);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test031"); }

    org.mafagafogigante.dungeon.entity.creatures.Hero hero0 = null;
    org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster heroSpellcaster1 = new org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster(hero0);
    java.util.List<org.mafagafogigante.dungeon.spells.Spell> list_spell2 = heroSpellcaster1.getSpellList();
    org.mafagafogigante.dungeon.spells.Spell spell3 = null;
    boolean b4 = heroSpellcaster1.knowsSpell(spell3);
    java.util.List<org.mafagafogigante.dungeon.spells.Spell> list_spell5 = heroSpellcaster1.getSpellList();
    org.mafagafogigante.dungeon.spells.Spell spell6 = null;
    // The following exception was thrown during execution in test generation
    try {
    heroSpellcaster1.learnSpell(spell6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_spell2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_spell5);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test032"); }

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
    org.mafagafogigante.dungeon.game.DungeonString dungeonString24 = new org.mafagafogigante.dungeon.game.DungeonString("ItemIntegrity{integrity=1/1, item=null}", color22);
    
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
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test033"); }

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
    java.lang.String str19 = countermap_worldStatistics0.toString();
    
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

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test034"); }

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
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset16 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity17 = itemPreset16.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity18 = null;
    itemPreset16.setIntegrity(integrity18);
    org.mafagafogigante.dungeon.entity.Integrity integrity20 = itemPreset16.getIntegrity();
    org.mafagafogigante.dungeon.util.Percentage percentage21 = itemPreset16.getHitRate();
    itemPreset16.setNutrition((int)(short)1);
    boolean b24 = battleRecord15.equals((java.lang.Object)itemPreset16);
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath25 = battleRecord15.getCauseOfDeath();
    java.lang.String str26 = battleRecord15.toString();
    
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
    org.junit.Assert.assertNull(integrity17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "BattleEntry{id=null, type='East', causeOfDeath=Unarmed : UNARMED, partOfDay=Noon}"+ "'", str26.equals("BattleEntry{id=null, type='East', causeOfDeath=Unarmed : UNARMED, partOfDay=Noon}"));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test035"); }

    org.mafagafogigante.dungeon.date.Date date7 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date11 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i12 = date7.compareTo(date11);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay13 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date7);
    java.lang.String[] str_array19 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table20 = new org.mafagafogigante.dungeon.util.Table(str_array19);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString21 = table20.toColoredStringList();
    org.mafagafogigante.dungeon.game.ColoredString coloredString22 = org.mafagafogigante.dungeon.game.Random.select(list_coloredString21);
    boolean b23 = date7.equals((java.lang.Object)coloredString22);
    java.awt.Color color24 = coloredString22.getColor();
    org.mafagafogigante.dungeon.game.LocationDescription locationDescription25 = new org.mafagafogigante.dungeon.game.LocationDescription('a', color24);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString26 = new org.mafagafogigante.dungeon.game.DungeonString("Evening", color24);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString27 = new org.mafagafogigante.dungeon.game.DungeonString("", color24);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString28 = new org.mafagafogigante.dungeon.game.DungeonString("BattleEntry{id=null, type='', causeOfDeath=Unarmed : UNARMED, partOfDay=Night}", color24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay13 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay13.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(coloredString22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color24);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test036"); }

    org.mafagafogigante.dungeon.stats.Statistics statistics0 = new org.mafagafogigante.dungeon.stats.Statistics();
    statistics0.writeStatistics();
    statistics0.writeStatistics();
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker3 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics0);
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker4 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics0);
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker5 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics0);
    java.util.Comparator<org.mafagafogigante.dungeon.achievements.UnlockedAchievement> comparator_unlockedAchievement6 = org.mafagafogigante.dungeon.achievements.comparators.UnlockedAchievementComparators.getDefaultComparator();
    java.util.List<org.mafagafogigante.dungeon.achievements.UnlockedAchievement> list_unlockedAchievement7 = achievementTracker5.getUnlockedAchievements(comparator_unlockedAchievement6);
    int i8 = achievementTracker5.getUnlockedCount();
    java.util.Comparator<org.mafagafogigante.dungeon.achievements.UnlockedAchievement> comparator_unlockedAchievement9 = org.mafagafogigante.dungeon.achievements.comparators.UnlockedAchievementComparators.getDefaultComparator();
    java.util.List<org.mafagafogigante.dungeon.achievements.UnlockedAchievement> list_unlockedAchievement10 = achievementTracker5.getUnlockedAchievements(comparator_unlockedAchievement9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_unlockedAchievement6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_unlockedAchievement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_unlockedAchievement9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_unlockedAchievement10);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test037"); }

    org.mafagafogigante.dungeon.game.LocationPreset locationPreset0 = null;
    org.mafagafogigante.dungeon.game.World world1 = null;
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics2 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point6 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id7 = null;
    explorationStatistics2.createEntryIfNotExists(point6, id7);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.game.Location location9 = new org.mafagafogigante.dungeon.game.Location(locationPreset0, world1, point6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test038"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, (-1), 0.0d);
    org.mafagafogigante.dungeon.entity.Weight weight4 = creatureInventory3.getWeight();
    int i5 = creatureInventory3.getItemCount();
    int i6 = creatureInventory3.getItemCount();
    int i7 = creatureInventory3.getItemLimit();
    org.mafagafogigante.dungeon.entity.items.Item item8 = null;
    // The following exception was thrown during execution in test generation
    try {
    creatureInventory3.addItem(item8);
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
    org.junit.Assert.assertTrue(i7 == (-1));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test039"); }

    org.mafagafogigante.dungeon.util.Percentage percentage1 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b3 = percentage1.equals((java.lang.Object)10.0d);
    double d4 = percentage1.toDouble();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity5 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage1);
    org.mafagafogigante.dungeon.entity.Visibility visibility6 = new org.mafagafogigante.dungeon.entity.Visibility(percentage1);
    org.mafagafogigante.dungeon.util.Percentage percentage7 = visibility6.toPercentage();
    java.lang.String str8 = visibility6.toString();
    org.mafagafogigante.dungeon.util.Percentage percentage9 = visibility6.toPercentage();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Visibility of 100.00%"+ "'", str8.equals("Visibility of 100.00%"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage9);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test040"); }

    org.mafagafogigante.dungeon.game.DungeonString dungeonString1 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString1.append(str_array6);
    java.lang.String[] str_array13 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table14 = new org.mafagafogigante.dungeon.util.Table(str_array13);
    dungeonString1.append(str_array13);
    org.mafagafogigante.dungeon.util.Table table16 = new org.mafagafogigante.dungeon.util.Table(str_array13);
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)table16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test041"); }

    org.mafagafogigante.dungeon.util.CounterMap<java.lang.Comparable<java.lang.String>> countermap_comparable_str0 = new org.mafagafogigante.dungeon.util.CounterMap<java.lang.Comparable<java.lang.String>>();
    java.lang.String str1 = countermap_comparable_str0.toString();
    java.lang.String str2 = countermap_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "CounterMap{map={}}"+ "'", str1.equals("CounterMap{map={}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "CounterMap{map={}}"+ "'", str2.equals("CounterMap{map={}}"));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test042"); }

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
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications30 = new org.mafagafogigante.dungeon.gui.WritingSpecifications(false, 32);
    boolean b31 = writingSpecifications30.shouldWait();
    int i32 = writingSpecifications30.getWait();
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)dungeonString25, writingSpecifications30);
    org.mafagafogigante.dungeon.date.Date date39 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date43 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i44 = date39.compareTo(date43);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay45 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date39);
    java.lang.String[] str_array51 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table52 = new org.mafagafogigante.dungeon.util.Table(str_array51);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString53 = table52.toColoredStringList();
    org.mafagafogigante.dungeon.game.ColoredString coloredString54 = org.mafagafogigante.dungeon.game.Random.select(list_coloredString53);
    boolean b55 = date39.equals((java.lang.Object)coloredString54);
    java.awt.Color color56 = coloredString54.getColor();
    org.mafagafogigante.dungeon.game.ColoredString coloredString57 = new org.mafagafogigante.dungeon.game.ColoredString("User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 41.5 MiB out of the allocated 154.5 MiB\nOS: Windows 10 (amd64) 10.0", color56);
    org.mafagafogigante.dungeon.game.ColoredString coloredString58 = new org.mafagafogigante.dungeon.game.ColoredString("Unarmed : UNARMED", color56);
    dungeonString25.setColor(color56);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString60 = new org.mafagafogigante.dungeon.game.DungeonString("WritingSpecifications{scrollDown=true}", color56);
    org.mafagafogigante.dungeon.game.LocationDescription locationDescription61 = new org.mafagafogigante.dungeon.game.LocationDescription('#', color56);
    
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
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay45 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay45.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(coloredString54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color56);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test043"); }

    java.awt.Color color1 = null;
    org.mafagafogigante.dungeon.game.ColoredString coloredString2 = new org.mafagafogigante.dungeon.game.ColoredString("", color1);
    java.lang.String str3 = coloredString2.getString();
    java.awt.Color color4 = coloredString2.getColor();
    java.lang.String str5 = coloredString2.getString();
    java.awt.Color color6 = coloredString2.getColor();
    java.lang.String str7 = coloredString2.getString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(color4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(color6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test044"); }

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
    org.mafagafogigante.dungeon.util.Percentage percentage16 = luminosity13.toPercentage();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage16);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test045"); }

    org.mafagafogigante.dungeon.util.SystemInformation systemInformation0 = new org.mafagafogigante.dungeon.util.SystemInformation();
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString1 = systemInformation0.toColoredStringList();
    java.lang.String str2 = systemInformation0.toString();
    java.lang.String str3 = systemInformation0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "User: Nicholas\nTime: 15:46:30\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 41.4 MiB out of the allocated 109.5 MiB\nOS: Windows 10 (amd64) 10.0"+ "'", str2.equals("User: Nicholas\nTime: 15:46:30\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 41.4 MiB out of the allocated 109.5 MiB\nOS: Windows 10 (amd64) 10.0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User: Nicholas\nTime: 15:46:30\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 41.4 MiB out of the allocated 109.5 MiB\nOS: Windows 10 (amd64) 10.0"+ "'", str3.equals("User: Nicholas\nTime: 15:46:30\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 41.4 MiB out of the allocated 109.5 MiB\nOS: Windows 10 (amd64) 10.0"));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test046"); }

    org.mafagafogigante.dungeon.stats.Statistics statistics0 = new org.mafagafogigante.dungeon.stats.Statistics();
    statistics0.writeStatistics();
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker2 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics0);
    org.mafagafogigante.dungeon.achievements.AchievementStore achievementStore3 = null;
    org.mafagafogigante.dungeon.date.Date date10 = new org.mafagafogigante.dungeon.date.Date(1L, (long)82800, 10L, (long)(short)100, (long)(short)100, 86313600000L);
    long long11 = date10.getHour();
    // The following exception was thrown during execution in test generation
    try {
    achievementTracker2.update(achievementStore3, date10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 1L);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test047"); }

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
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset14 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity15 = itemPreset14.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity16 = null;
    itemPreset14.setIntegrity(integrity16);
    org.mafagafogigante.dungeon.util.Percentage percentage18 = itemPreset14.getVisibility();
    java.lang.String str19 = itemPreset14.getType();
    org.mafagafogigante.dungeon.entity.items.Item.Tag tag20 = org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE;
    itemPreset14.addTag(tag20);
    itemPreset12.addTag(tag20);
    org.mafagafogigante.dungeon.entity.items.Item.Tag tag23 = org.mafagafogigante.dungeon.entity.items.Item.Tag.BOOK;
    itemPreset12.addTag(tag23);
    itemPreset0.addTag(tag23);
    // The following exception was thrown during execution in test generation
    try {
    itemPreset0.setSpellId("{101, 10, 10}");
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
    org.junit.Assert.assertNotNull(tagset_tag8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    org.junit.Assert.assertTrue("'" + tag20 + "' != '" + org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE + "'", tag20.equals(org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE));
    org.junit.Assert.assertTrue("'" + tag23 + "' != '" + org.mafagafogigante.dungeon.entity.items.Item.Tag.BOOK + "'", tag23.equals(org.mafagafogigante.dungeon.entity.items.Item.Tag.BOOK));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test048"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity((int)(byte)1, (int)(byte)0);
    boolean b3 = integrity2.isMaximum();
    org.mafagafogigante.dungeon.entity.items.Item item4 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity5 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity2, item4);
    itemIntegrity5.incrementBy((int)(byte)0);
    itemIntegrity5.incrementBy((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage10 = itemIntegrity5.toPercentage();
    itemIntegrity5.decrementBy(0);
    java.lang.String str13 = itemIntegrity5.toString();
    boolean b14 = itemIntegrity5.isBroken();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemIntegrity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "ItemIntegrity{integrity=1/1, item=null}"+ "'", str13.equals("ItemIntegrity{integrity=1/1, item=null}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test049"); }

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
    org.mafagafogigante.dungeon.entity.creatures.Creature[] creature_array54 = new org.mafagafogigante.dungeon.entity.creatures.Creature[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Creature> arraylist_creature55 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Creature>();
    boolean b56 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.Creature>)arraylist_creature55, creature_array54);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString58 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array63 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString58.append(str_array63);
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications65 = null;
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)dungeonString58, writingSpecifications65);
    observer3.writeCreatureSight((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Creature>)arraylist_creature55, dungeonString58);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.creatures.Creature creature68 = org.mafagafogigante.dungeon.game.Random.select((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Creature>)arraylist_creature55);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creature_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array63);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test050"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.util.Percentage percentage2 = itemPreset0.getVisibility();
    org.mafagafogigante.dungeon.entity.Weight weight3 = itemPreset0.getWeight();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity4 = itemPreset0.getLuminosity();
    int i5 = itemPreset0.getIntegrityDecrementOnHit();
    itemPreset0.setNutrition(82800);
    itemPreset0.setIntegrityDecrementOnEat(152);
    itemPreset0.setDamage(113);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weight3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test051"); }

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
    org.mafagafogigante.dungeon.entity.Luminosity luminosity27 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage19);
    org.mafagafogigante.dungeon.util.Percentage percentage31 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b33 = percentage31.equals((java.lang.Object)10.0d);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity34 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage31);
    org.mafagafogigante.dungeon.util.Percentage percentage35 = luminosity34.toPercentage();
    java.lang.String str36 = percentage35.toString();
    double d37 = org.mafagafogigante.dungeon.util.DungeonMath.weightedAverage((double)(-1), (double)(short)-1, percentage35);
    java.lang.String str38 = percentage35.toString();
    int i39 = percentage19.compareTo(percentage35);
    
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
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "100.00%"+ "'", str36.equals("100.00%"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d37 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "100.00%"+ "'", str38.equals("100.00%"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test052"); }

    org.mafagafogigante.dungeon.util.ShuffledRange shuffledRange2 = new org.mafagafogigante.dungeon.util.ShuffledRange((int)(byte)10, 35);
    shuffledRange2.shuffle();

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test053"); }

    boolean b1 = org.mafagafogigante.dungeon.util.Percentage.isValidPercentageString("Luminosity of 40.00%");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test054"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.util.Percentage percentage2 = itemPreset0.getVisibility();
    int i3 = itemPreset0.getNutrition();
    itemPreset0.setUnique(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test055"); }

    org.mafagafogigante.dungeon.entity.items.ItemPresetFactory[] itemPresetFactory_array0 = new org.mafagafogigante.dungeon.entity.items.ItemPresetFactory[] {  };
    org.mafagafogigante.dungeon.entity.items.ItemFactory itemFactory1 = new org.mafagafogigante.dungeon.entity.items.ItemFactory(itemPresetFactory_array0);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature2 = null;
    org.mafagafogigante.dungeon.date.Date date6 = new org.mafagafogigante.dungeon.date.Date((long)97, (long)(byte)-1, (long)'#');
    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics7 = new org.mafagafogigante.dungeon.stats.BattleStatistics();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement8 = null;
    boolean b9 = battleStatistics7.satisfies(battleStatisticsRequirement8);
    java.lang.String str10 = battleStatistics7.toString();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery11 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement13 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement(battleStatisticsQuery11, (int)(byte)100);
    boolean b14 = battleStatistics7.satisfies(battleStatisticsRequirement13);
    org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.CauseOfDeath> countermap_causeOfDeath15 = battleStatistics7.getKillsByCauseOfDeath();
    org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.CauseOfDeath> countermap_causeOfDeath16 = battleStatistics7.getKillsByCauseOfDeath();
    boolean b17 = date6.equals((java.lang.Object)countermap_causeOfDeath16);
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit19 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.YEAR;
    org.mafagafogigante.dungeon.date.Date date20 = date6.plus(45056, dungeonTimeUnit19);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.items.Item item21 = itemFactory1.makeCorpse(creature2, date20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemPresetFactory_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "BattleStatistics{records=CounterMap{map={}}}"+ "'", str10.equals("BattleStatistics{records=CounterMap{map={}}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_causeOfDeath15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_causeOfDeath16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit19 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.YEAR + "'", dungeonTimeUnit19.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.YEAR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date20);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test056"); }

    org.mafagafogigante.dungeon.game.DungeonString dungeonString1 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString1.append(str_array6);
    java.lang.String[] str_array13 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table14 = new org.mafagafogigante.dungeon.util.Table(str_array13);
    dungeonString1.append(str_array13);
    org.mafagafogigante.dungeon.util.Table table16 = new org.mafagafogigante.dungeon.util.Table(str_array13);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString17 = table16.toColoredStringList();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString17);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test057"); }

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
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset29 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity30 = itemPreset29.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity31 = null;
    itemPreset29.setIntegrity(integrity31);
    org.mafagafogigante.dungeon.util.Percentage percentage33 = itemPreset29.getVisibility();
    org.mafagafogigante.dungeon.entity.Integrity integrity34 = itemPreset29.getIntegrity();
    java.lang.String str35 = itemPreset29.getText();
    org.mafagafogigante.dungeon.game.Name name36 = null;
    itemPreset29.setName(name36);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset38 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity39 = itemPreset38.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity40 = null;
    itemPreset38.setIntegrity(integrity40);
    org.mafagafogigante.dungeon.util.Percentage percentage42 = itemPreset38.getVisibility();
    java.lang.String str43 = itemPreset38.getType();
    itemPreset38.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage47 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset38.setVisibility(percentage47);
    boolean b49 = org.mafagafogigante.dungeon.game.Random.roll(percentage47);
    itemPreset29.setVisibility(percentage47);
    boolean b51 = point21.equals((java.lang.Object)itemPreset29);
    itemPreset29.setIntegrityDecrementPerDose((-1));
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay54 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity55 = partOfDay54.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name56 = partOfDay54.getName();
    org.mafagafogigante.dungeon.game.QuantificationMode quantificationMode58 = org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER;
    java.lang.String str59 = name56.getQuantifiedName((int)'4', quantificationMode58);
    java.lang.String str61 = name56.getQuantifiedName(3600);
    itemPreset29.setName(name56);
    itemPreset29.setNutrition(57600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    org.junit.Assert.assertTrue("'" + partOfDay54 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay54.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name56);
    org.junit.Assert.assertTrue("'" + quantificationMode58 + "' != '" + org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER + "'", quantificationMode58.equals(org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "52 Nights"+ "'", str59.equals("52 Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "a few Nights"+ "'", str61.equals("a few Nights"));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test058"); }

    java.awt.Color color1 = null;
    org.mafagafogigante.dungeon.game.LocationDescription locationDescription2 = new org.mafagafogigante.dungeon.game.LocationDescription('a', color1);
    java.lang.String str3 = locationDescription2.getInfo();
    java.awt.Color color4 = locationDescription2.getColor();
    char char5 = locationDescription2.getSymbol();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "You don't discover anything."+ "'", str3.equals("You don't discover anything."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(color4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char5 == 'a');

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test059"); }

    org.mafagafogigante.dungeon.commands.CommandDescription commandDescription2 = new org.mafagafogigante.dungeon.commands.CommandDescription("", "day 10 of month 1 of the year 1");
    java.lang.String str3 = commandDescription2.getInfo();
    java.lang.String str4 = commandDescription2.getInfo();
    java.lang.String str5 = commandDescription2.getInfo();
    java.lang.String str6 = commandDescription2.getInfo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "day 10 of month 1 of the year 1"+ "'", str3.equals("day 10 of month 1 of the year 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "day 10 of month 1 of the year 1"+ "'", str4.equals("day 10 of month 1 of the year 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "day 10 of month 1 of the year 1"+ "'", str5.equals("day 10 of month 1 of the year 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "day 10 of month 1 of the year 1"+ "'", str6.equals("day 10 of month 1 of the year 1"));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test060"); }

    org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.WorldStatistics> countermap_worldStatistics0 = new org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.WorldStatistics>();
    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics1 = null;
    countermap_worldStatistics0.incrementCounter(worldStatistics1, (java.lang.Integer)90);
    boolean b4 = countermap_worldStatistics0.isNotEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test061"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] creaturePresetFactory_array0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] {  };
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory1 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array0);
    org.mafagafogigante.dungeon.game.Id id2 = null;
    org.mafagafogigante.dungeon.game.World world3 = null;
    org.mafagafogigante.dungeon.entity.creatures.Creature creature4 = creatureFactory1.makeCreature(id2, world3);
    org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory corpseItemPresetFactory5 = new org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory(creatureFactory1);
    java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.CreaturePreset> collection_creaturePreset6 = creatureFactory1.getPresets();
    java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.CreaturePreset> collection_creaturePreset7 = creatureFactory1.getPresets();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creaturePresetFactory_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(creature4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_creaturePreset6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_creaturePreset7);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test062"); }

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
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset22 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity23 = itemPreset22.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity24 = null;
    itemPreset22.setIntegrity(integrity24);
    org.mafagafogigante.dungeon.util.Percentage percentage26 = itemPreset22.getVisibility();
    java.lang.String str27 = itemPreset22.getType();
    itemPreset22.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage31 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset22.setVisibility(percentage31);
    org.mafagafogigante.dungeon.game.Id id33 = null;
    itemPreset22.setId(id33);
    itemPreset22.setPutrefactionPeriod((long)(short)1);
    int i37 = itemPreset22.getDrinkableHealing();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay38 = org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT;
    org.mafagafogigante.dungeon.game.Name name39 = partOfDay38.getName();
    itemPreset22.setName(name39);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset41 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity42 = itemPreset41.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity43 = null;
    itemPreset41.setIntegrity(integrity43);
    org.mafagafogigante.dungeon.util.Percentage percentage45 = itemPreset41.getVisibility();
    java.lang.String str46 = itemPreset41.getType();
    itemPreset41.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage50 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset41.setVisibility(percentage50);
    org.mafagafogigante.dungeon.util.Percentage percentage53 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    int i54 = percentage50.compareTo(percentage53);
    itemPreset22.setHitRate(percentage50);
    creaturePreset0.setVisibility(percentage50);
    
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
    org.junit.Assert.assertNull(integrity23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay38 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay38.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test063"); }

    org.mafagafogigante.dungeon.commands.CommandHistory commandHistory0 = new org.mafagafogigante.dungeon.commands.CommandHistory();
    java.lang.String str2 = commandHistory0.getLastSimilarCommand("East");
    org.mafagafogigante.dungeon.commands.CommandHistory.Cursor cursor3 = commandHistory0.getCursor();
    org.mafagafogigante.dungeon.commands.CommandHistory.Cursor cursor4 = cursor3.moveUp();
    org.mafagafogigante.dungeon.commands.CommandHistory.Cursor cursor5 = cursor4.moveUp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cursor3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cursor4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cursor5);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test064"); }

    org.mafagafogigante.dungeon.stats.Statistics statistics0 = new org.mafagafogigante.dungeon.stats.Statistics();
    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics1 = statistics0.getBattleStatistics();
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics2 = statistics0.getExplorationStatistics();
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances3 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.Direction direction4 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b5 = blockedEntrances3.isBlocked(direction4);
    boolean b7 = direction4.equalsIgnoreCase("");
    java.lang.String str8 = direction4.toString();
    org.mafagafogigante.dungeon.game.Point point9 = direction4.getOffset();
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics10 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.entity.creatures.Creature creature11 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory14 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature11, (-1), 0.0d);
    org.mafagafogigante.dungeon.entity.Weight weight15 = creatureInventory14.getWeight();
    int i16 = creatureInventory14.getItemCount();
    int i17 = creatureInventory14.getItemCount();
    org.mafagafogigante.dungeon.entity.Weight weight18 = creatureInventory14.getWeightLimit();
    org.mafagafogigante.dungeon.stats.Statistics statistics19 = new org.mafagafogigante.dungeon.stats.Statistics();
    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics20 = statistics19.getBattleStatistics();
    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics21 = statistics19.getWorldStatistics();
    boolean b22 = weight18.equals((java.lang.Object)statistics19);
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics23 = statistics19.getExplorationStatistics();
    org.mafagafogigante.dungeon.game.Id id24 = null;
    int i25 = explorationStatistics23.getKillCount(id24);
    org.mafagafogigante.dungeon.game.Id id26 = null;
    int i27 = explorationStatistics23.getKillCount(id26);
    org.mafagafogigante.dungeon.game.Id id28 = null;
    int i29 = explorationStatistics23.getVisitedLocations(id28);
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics30 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point31 = null;
    org.mafagafogigante.dungeon.game.Id id32 = null;
    explorationStatistics30.createEntryIfNotExists(point31, id32);
    org.mafagafogigante.dungeon.game.Point point37 = new org.mafagafogigante.dungeon.game.Point(10, (int)'a', 0);
    java.lang.String[] str_array40 = new java.lang.String[] { "", "" };
    org.mafagafogigante.dungeon.util.Table table41 = new org.mafagafogigante.dungeon.util.Table(str_array40);
    boolean b42 = point37.equals((java.lang.Object)str_array40);
    org.mafagafogigante.dungeon.game.Id id43 = null;
    explorationStatistics30.addVisit(point37, id43);
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics45 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point46 = null;
    org.mafagafogigante.dungeon.game.Id id47 = null;
    explorationStatistics45.createEntryIfNotExists(point46, id47);
    org.mafagafogigante.dungeon.game.Point point52 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id53 = null;
    explorationStatistics45.addVisit(point52, id53);
    java.lang.String str55 = point52.toString();
    int i56 = point52.getZ();
    org.mafagafogigante.dungeon.game.Id id57 = null;
    explorationStatistics30.addVisit(point52, id57);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset59 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity60 = itemPreset59.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity61 = null;
    itemPreset59.setIntegrity(integrity61);
    org.mafagafogigante.dungeon.util.Percentage percentage63 = itemPreset59.getVisibility();
    org.mafagafogigante.dungeon.entity.Integrity integrity64 = itemPreset59.getIntegrity();
    java.lang.String str65 = itemPreset59.getText();
    java.lang.String str66 = itemPreset59.getType();
    org.mafagafogigante.dungeon.entity.Integrity integrity69 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    boolean b70 = integrity69.isMaximum();
    integrity69.incrementBy((int)(short)0);
    org.mafagafogigante.dungeon.util.Percentage percentage73 = integrity69.toPercentage();
    itemPreset59.setHitRate(percentage73);
    org.mafagafogigante.dungeon.game.Id id76 = new org.mafagafogigante.dungeon.game.Id("100");
    java.lang.String str77 = id76.toString();
    itemPreset59.setId(id76);
    explorationStatistics23.addVisit(point52, id76);
    int i80 = explorationStatistics10.getVisitedLocations(id76);
    explorationStatistics2.addVisit(point9, id76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(battleStatistics1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(explorationStatistics2);
    org.junit.Assert.assertTrue("'" + direction4 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction4.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "East"+ "'", str8.equals("East"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(battleStatistics20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(worldStatistics21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(explorationStatistics23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{32, 0, -1}"+ "'", str55.equals("{32, 0, -1}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str77 + "' != '" + "100"+ "'", str77.equals("100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test065"); }

    org.mafagafogigante.dungeon.entity.items.FoodComponent foodComponent2 = new org.mafagafogigante.dungeon.entity.items.FoodComponent(44105, 28);
    int i3 = foodComponent2.getNutrition();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 44105);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test066"); }

    org.mafagafogigante.dungeon.game.Direction direction0 = org.mafagafogigante.dungeon.game.Direction.UP;
    boolean b2 = direction0.equalsIgnoreCase("97-01-01 00:00:00");
    org.mafagafogigante.dungeon.game.Direction direction3 = direction0.invert();
    java.lang.String str4 = direction3.toString();
    org.mafagafogigante.dungeon.game.Direction direction5 = direction3.invert();
    org.junit.Assert.assertTrue("'" + direction0 + "' != '" + org.mafagafogigante.dungeon.game.Direction.UP + "'", direction0.equals(org.mafagafogigante.dungeon.game.Direction.UP));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + direction3 + "' != '" + org.mafagafogigante.dungeon.game.Direction.DOWN + "'", direction3.equals(org.mafagafogigante.dungeon.game.Direction.DOWN));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Down"+ "'", str4.equals("Down"));
    org.junit.Assert.assertTrue("'" + direction5 + "' != '" + org.mafagafogigante.dungeon.game.Direction.UP + "'", direction5.equals(org.mafagafogigante.dungeon.game.Direction.UP));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test067"); }

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
    java.lang.String str16 = luminosity13.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Luminosity of 100.00%"+ "'", str16.equals("Luminosity of 100.00%"));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test068"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    creaturePreset0.setAttack(57);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity5 = creaturePreset0.getLuminosity();
    creaturePreset0.setInventoryItemLimit(57);
    org.mafagafogigante.dungeon.entity.creatures.Drop[] drop_array8 = new org.mafagafogigante.dungeon.entity.creatures.Drop[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop> arraylist_drop9 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop9, drop_array8);
    creaturePreset0.setDropList((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop9);
    creaturePreset0.setInventoryWeightLimit((double)(byte)0);
    org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId attackAlgorithmId14 = creaturePreset0.getAttackAlgorithmId();
    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset15 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id16 = null;
    creaturePreset15.setWeaponId(id16);
    creaturePreset15.setAttack(57);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity20 = creaturePreset15.getLuminosity();
    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset21 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id22 = null;
    creaturePreset21.setWeaponId(id22);
    creaturePreset21.setAttack(57);
    org.mafagafogigante.dungeon.game.Id[] id_array26 = new org.mafagafogigante.dungeon.game.Id[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.game.Id> arraylist_id27 = new java.util.ArrayList<org.mafagafogigante.dungeon.game.Id>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.game.Id>)arraylist_id27, id_array26);
    creaturePreset21.setItems((java.util.List<org.mafagafogigante.dungeon.game.Id>)arraylist_id27);
    creaturePreset15.setItems((java.util.List<org.mafagafogigante.dungeon.game.Id>)arraylist_id27);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay31 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity32 = partOfDay31.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name33 = partOfDay31.getName();
    java.lang.String str35 = name33.getQuantifiedName((int)'a');
    creaturePreset15.setName(name33);
    creaturePreset0.setName(name33);
    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset38 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id39 = null;
    creaturePreset38.setWeaponId(id39);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay41 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity42 = partOfDay41.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name43 = partOfDay41.getName();
    org.mafagafogigante.dungeon.game.QuantificationMode quantificationMode45 = org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER;
    java.lang.String str46 = name43.getQuantifiedName((int)'4', quantificationMode45);
    creaturePreset38.setName(name43);
    org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId attackAlgorithmId48 = org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId.DUMMY;
    creaturePreset38.setAttackAlgorithmId(attackAlgorithmId48);
    creaturePreset0.setAttackAlgorithmId(attackAlgorithmId48);
    org.mafagafogigante.dungeon.game.Name name51 = creaturePreset0.getName();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity52 = creaturePreset0.getLuminosity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(drop_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(attackAlgorithmId14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(id_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    org.junit.Assert.assertTrue("'" + partOfDay31 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay31.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "a few Nights"+ "'", str35.equals("a few Nights"));
    org.junit.Assert.assertTrue("'" + partOfDay41 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay41.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name43);
    org.junit.Assert.assertTrue("'" + quantificationMode45 + "' != '" + org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER + "'", quantificationMode45.equals(org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "52 Nights"+ "'", str46.equals("52 Nights"));
    org.junit.Assert.assertTrue("'" + attackAlgorithmId48 + "' != '" + org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId.DUMMY + "'", attackAlgorithmId48.equals(org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId.DUMMY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity52);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test069"); }

    org.mafagafogigante.dungeon.game.Id id0 = null;
    org.mafagafogigante.dungeon.entity.items.BookComponent bookComponent2 = new org.mafagafogigante.dungeon.entity.items.BookComponent(id0, "Night");
    org.mafagafogigante.dungeon.game.Id id3 = bookComponent2.getSpellId();
    java.lang.String str4 = bookComponent2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "This book teaches nothing. Text: Night"+ "'", str4.equals("This book teaches nothing. Text: Night"));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test070"); }

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
    org.mafagafogigante.dungeon.entity.LightSource lightSource15 = new org.mafagafogigante.dungeon.entity.LightSource(luminosity13);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity16 = lightSource15.getLuminosity();
    
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
    org.junit.Assert.assertNotNull(luminosity16);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test071"); }

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
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics12 = statistics8.getExplorationStatistics();
    org.mafagafogigante.dungeon.game.Id id13 = null;
    int i14 = explorationStatistics12.getKillCount(id13);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances15 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.Direction direction16 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b17 = blockedEntrances15.isBlocked(direction16);
    org.mafagafogigante.dungeon.game.Point point18 = direction16.getOffset();
    // The following exception was thrown during execution in test generation
    try {
    explorationStatistics12.addKill(point18);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(battleStatistics9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(worldStatistics10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(explorationStatistics12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    org.junit.Assert.assertTrue("'" + direction16 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction16.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point18);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test072"); }

    org.mafagafogigante.dungeon.game.MinimumBoundingRectangle minimumBoundingRectangle2 = new org.mafagafogigante.dungeon.game.MinimumBoundingRectangle((int)' ', (int)(short)-1);
    int i3 = minimumBoundingRectangle2.getWidth();
    int i4 = minimumBoundingRectangle2.getHeight();
    int i5 = minimumBoundingRectangle2.getHeight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test073"); }

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
    org.mafagafogigante.dungeon.date.Date date20 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date24 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i25 = date20.compareTo(date24);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay26 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date20);
    long long27 = date20.getYear();
    org.mafagafogigante.dungeon.date.Date date31 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date35 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i36 = date31.compareTo(date35);
    long long37 = date31.getYear();
    int i38 = date20.compareTo(date31);
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit40 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR;
    org.mafagafogigante.dungeon.date.Date date41 = date31.minus(35, dungeonTimeUnit40);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.items.Item item42 = new org.mafagafogigante.dungeon.entity.items.Item(itemPreset0, date41);
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
    org.junit.Assert.assertNull(percentage15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay26 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay26.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long27 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long37 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit40 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR + "'", dungeonTimeUnit40.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date41);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test074"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.util.Percentage percentage2 = itemPreset0.getVisibility();
    org.mafagafogigante.dungeon.entity.Weight weight3 = itemPreset0.getWeight();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity4 = itemPreset0.getLuminosity();
    int i5 = itemPreset0.getIntegrityDecrementOnHit();
    itemPreset0.setNutrition(82800);
    int i8 = itemPreset0.getIntegrityDecrementOnEat();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weight3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test075"); }

    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery0 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    java.lang.String str1 = battleStatisticsQuery0.toString();
    org.mafagafogigante.dungeon.game.Id id2 = null;
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery4 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath5 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    battleStatisticsQuery4.setCauseOfDeath(causeOfDeath5);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay7 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.stats.BattleRecord battleRecord8 = new org.mafagafogigante.dungeon.stats.BattleRecord(id2, "", causeOfDeath5, partOfDay7);
    java.lang.String str9 = battleRecord8.getType();
    org.mafagafogigante.dungeon.game.Id id10 = battleRecord8.getId();
    boolean b11 = battleStatisticsQuery0.matches(battleRecord8);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay12 = battleRecord8.getPartOfDay();
    java.lang.String str13 = battleRecord8.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "BattleStatisticsQuery{id=null, type='null', causeOfDeath=null, partOfDay=null}"+ "'", str1.equals("BattleStatisticsQuery{id=null, type='null', causeOfDeath=null, partOfDay=null}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath5);
    org.junit.Assert.assertTrue("'" + partOfDay7 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay7.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    org.junit.Assert.assertTrue("'" + partOfDay12 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay12.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test076"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, 0, (double)(short)10);
    org.mafagafogigante.dungeon.entity.Weight weight4 = creatureInventory3.getWeight();
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item5 = creatureInventory3.getItems();
    org.mafagafogigante.dungeon.entity.items.Item item6 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory.SimulationResult simulationResult7 = creatureInventory3.simulateItemAddition(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item5);
    org.junit.Assert.assertTrue("'" + simulationResult7 + "' != '" + org.mafagafogigante.dungeon.entity.items.CreatureInventory.SimulationResult.AMOUNT_LIMIT + "'", simulationResult7.equals(org.mafagafogigante.dungeon.entity.items.CreatureInventory.SimulationResult.AMOUNT_LIMIT));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test077"); }

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
    org.mafagafogigante.dungeon.entity.items.Item[] item_array40 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item41 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b42 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item41, item_array40);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString44 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array49 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString44.append(str_array49);
    java.lang.String str51 = dungeonString44.toString();
    org.mafagafogigante.dungeon.game.Point point55 = new org.mafagafogigante.dungeon.game.Point(10, (int)'a', 0);
    java.lang.String[] str_array58 = new java.lang.String[] { "", "" };
    org.mafagafogigante.dungeon.util.Table table59 = new org.mafagafogigante.dungeon.util.Table(str_array58);
    boolean b60 = point55.equals((java.lang.Object)str_array58);
    dungeonString44.append(str_array58);
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item62 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item41, str_array58);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString64 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array69 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString64.append(str_array69);
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications71 = null;
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)dungeonString64, writingSpecifications71);
    observer3.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item41, dungeonString64);
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)dungeonString64);
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications77 = new org.mafagafogigante.dungeon.gui.WritingSpecifications(false, 32);
    boolean b78 = writingSpecifications77.shouldWait();
    int i79 = writingSpecifications77.getWait();
    int i80 = writingSpecifications77.getWait();
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)dungeonString64, writingSpecifications77);
    int i82 = dungeonString64.getLength();
    
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
    org.junit.Assert.assertNotNull(item_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"+ "'", str51.equals("DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 57);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test078"); }

    org.mafagafogigante.dungeon.logging.DungeonLogger.info("Less than a day");

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test079"); }

    java.lang.String str1 = org.mafagafogigante.dungeon.io.Converter.bytesToHuman((long)35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "35 B"+ "'", str1.equals("35 B"));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test080"); }

    org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.world.Weather> countermap_weather0 = new org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.world.Weather>();
    java.util.Set<org.mafagafogigante.dungeon.world.Weather> set_weather1 = countermap_weather0.keySet();
    org.mafagafogigante.dungeon.date.Date date5 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date9 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i10 = date5.compareTo(date9);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay11 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date5);
    long long12 = date5.getYear();
    long long13 = date5.getMonth();
    long long14 = date5.getDay();
    org.mafagafogigante.dungeon.world.Weather weather15 = new org.mafagafogigante.dungeon.world.Weather(date5);
    int i16 = countermap_weather0.getCounter(weather15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_weather1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay11 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay11.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test081"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    creaturePreset0.setHealth(10);
    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset5 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id6 = null;
    creaturePreset5.setWeaponId(id6);
    creaturePreset5.setAttack(57);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity10 = creaturePreset5.getLuminosity();
    int i11 = creaturePreset5.getInventoryItemLimit();
    org.mafagafogigante.dungeon.game.Id id12 = null;
    creaturePreset5.setWeaponId(id12);
    creaturePreset5.setInventoryItemLimit(0);
    org.mafagafogigante.dungeon.game.Id id16 = creaturePreset5.getWeaponId();
    org.mafagafogigante.dungeon.entity.creatures.Creature.Tag tag17 = org.mafagafogigante.dungeon.entity.creatures.Creature.Tag.CORPSE;
    boolean b18 = creaturePreset5.hasTag(tag17);
    boolean b19 = creaturePreset0.hasTag(tag17);
    org.mafagafogigante.dungeon.entity.Weight weight20 = creaturePreset0.getWeight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id16);
    org.junit.Assert.assertTrue("'" + tag17 + "' != '" + org.mafagafogigante.dungeon.entity.creatures.Creature.Tag.CORPSE + "'", tag17.equals(org.mafagafogigante.dungeon.entity.creatures.Creature.Tag.CORPSE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weight20);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test082"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    creaturePreset0.setAttack(57);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity5 = creaturePreset0.getLuminosity();
    int i6 = creaturePreset0.getInventoryItemLimit();
    org.mafagafogigante.dungeon.game.Id id7 = null;
    creaturePreset0.setWeaponId(id7);
    creaturePreset0.setInventoryItemLimit(97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test083"); }

    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications2 = new org.mafagafogigante.dungeon.gui.WritingSpecifications(false, 82800);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test084"); }

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
    observer19.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item22, dungeonString25);
    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array27 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria28 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array27);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature29 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer30 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature29);
    boolean b31 = visibilityCriteria28.isMetBy(observer30);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array32 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item33 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b34 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item33, item_array32);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString36 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    observer30.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item33, dungeonString36);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString39 = new org.mafagafogigante.dungeon.game.DungeonString("");
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString40 = dungeonString39.toColoredStringList();
    observer19.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item33, dungeonString39);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array42 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item43 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b44 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item43, item_array42);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString46 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array51 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString46.append(str_array51);
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item53 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item43, str_array51);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString55 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array60 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString55.append(str_array60);
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications62 = null;
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)dungeonString55, writingSpecifications62);
    java.awt.Color color64 = null;
    dungeonString55.setColor(color64);
    observer19.writeItemSight(list_item53, dungeonString55);
    // The following exception was thrown during execution in test generation
    try {
    boolean b67 = luminosityVisibilityCriterion15.isMetBy(observer19);
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
    org.junit.Assert.assertNotNull(visibilityCriterion_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array60);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test085"); }

    org.mafagafogigante.dungeon.entity.Weight weight1 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)'#');
    java.lang.String str2 = weight1.toString();
    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset3 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id4 = null;
    creaturePreset3.setWeaponId(id4);
    org.mafagafogigante.dungeon.game.Id id6 = creaturePreset3.getId();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity7 = creaturePreset3.getLuminosity();
    org.mafagafogigante.dungeon.entity.creatures.Drop[] drop_array8 = new org.mafagafogigante.dungeon.entity.creatures.Drop[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop> arraylist_drop9 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop9, drop_array8);
    creaturePreset3.setDropList((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop9);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay12 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity13 = partOfDay12.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name14 = partOfDay12.getName();
    java.lang.String str16 = name14.getQuantifiedName((int)'a');
    java.lang.String str17 = name14.getPlural();
    creaturePreset3.setName(name14);
    java.util.List<org.mafagafogigante.dungeon.game.Id> list_id19 = creaturePreset3.getItems();
    java.util.List<org.mafagafogigante.dungeon.game.Id> list_id20 = creaturePreset3.getItems();
    boolean b21 = weight1.equals((java.lang.Object)list_id20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "35 kg"+ "'", str2.equals("35 kg"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(drop_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    org.junit.Assert.assertTrue("'" + partOfDay12 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay12.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "a few Nights"+ "'", str16.equals("a few Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Nights"+ "'", str17.equals("Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_id19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_id20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test086"); }

    org.mafagafogigante.dungeon.date.Date date6 = new org.mafagafogigante.dungeon.date.Date((long)(byte)0, (long)0, (long)81, (long)10, 100L, (long)(short)1);
    java.lang.String str7 = date6.toDateString();
    org.mafagafogigante.dungeon.date.Date date11 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date15 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i16 = date11.compareTo(date15);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay17 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date11);
    long long18 = date11.getYear();
    org.mafagafogigante.dungeon.date.Duration duration19 = new org.mafagafogigante.dungeon.date.Duration(date6, date11);
    long long20 = date11.getTime();
    org.mafagafogigante.dungeon.date.Date date24 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date28 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i29 = date24.compareTo(date28);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay30 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date24);
    long long31 = date24.getYear();
    long long32 = date24.getMonth();
    long long33 = date24.getDay();
    int i34 = date11.compareTo(date24);
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit36 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR;
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit37 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.MINUTE;
    long long38 = dungeonTimeUnit36.as(dungeonTimeUnit37);
    org.mafagafogigante.dungeon.date.Date date39 = date24.minus((int)'a', dungeonTimeUnit37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "day 10 of month 1 of the year 1"+ "'", str7.equals("day 10 of month 1 of the year 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay17 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay17.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long20 == 86313600000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay30 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay30.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long31 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long32 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long33 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit36 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR + "'", dungeonTimeUnit36.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR));
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit37 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.MINUTE + "'", dungeonTimeUnit37.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.MINUTE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long38 == 60L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date39);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test087"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature1 = null;
    org.mafagafogigante.dungeon.entity.creatures.CreatureHealth creatureHealth2 = org.mafagafogigante.dungeon.entity.creatures.CreatureHealth.makeCreatureHealth(100, creature1);
    boolean b3 = creatureHealth2.isAlive();
    java.lang.String str4 = creatureHealth2.toString();
    creatureHealth2.decrementBy((int)(byte)10);
    int i7 = creatureHealth2.getCurrent();
    // The following exception was thrown during execution in test generation
    try {
    creatureHealth2.decrementBy(17518);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creatureHealth2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "CreatureHealth{integrity=100/100}"+ "'", str4.equals("CreatureHealth{integrity=100/100}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 90);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test088"); }

    org.mafagafogigante.dungeon.io.Sleeper.sleep((long)(byte)1);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test089"); }

    org.mafagafogigante.dungeon.util.ShuffledRange shuffledRange2 = new org.mafagafogigante.dungeon.util.ShuffledRange((int)(byte)0, 46800);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test090"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.game.Id id1 = new org.mafagafogigante.dungeon.game.Id("DungeonString{coloredStringList=[ColoredString{string='\nYou don't see anyone here.\n', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test091"); }

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
    java.lang.String str15 = itemIntegrity5.toString();
    // The following exception was thrown during execution in test generation
    try {
    itemIntegrity5.decrementBy(20601);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "ItemIntegrity{integrity=1/1, item=null}"+ "'", str15.equals("ItemIntegrity{integrity=1/1, item=null}"));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test092"); }

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
    itemPreset0.setNutrition((int)(byte)0);
    
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

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test093"); }

    org.mafagafogigante.dungeon.game.PartOfDay partOfDay0 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    java.lang.String str1 = partOfDay0.toString();
    org.junit.Assert.assertTrue("'" + partOfDay0 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay0.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Night"+ "'", str1.equals("Night"));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test094"); }

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
    org.mafagafogigante.dungeon.entity.creatures.Creature[] creature_array54 = new org.mafagafogigante.dungeon.entity.creatures.Creature[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Creature> arraylist_creature55 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Creature>();
    boolean b56 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.Creature>)arraylist_creature55, creature_array54);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString58 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array63 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString58.append(str_array63);
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications65 = null;
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)dungeonString58, writingSpecifications65);
    observer3.writeCreatureSight((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Creature>)arraylist_creature55, dungeonString58);
    java.lang.String str68 = dungeonString58.toString();
    org.mafagafogigante.dungeon.entity.items.Item[] item_array69 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item70 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b71 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item70, item_array69);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString73 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array78 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString73.append(str_array78);
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item80 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item70, str_array78);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString82 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array87 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString82.append(str_array87);
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item89 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item70, str_array87);
    java.lang.String[] str_array93 = new java.lang.String[] { "User: Nicholas\nTime: 15:42:21\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 42.1 MiB out of the allocated 132.0 MiB\nOS: Windows 10 (amd64) 10.0", "None", "ColoredString{string='hi!|visibilityCriteria=VisibilityCriteria{[]} |visibilityCriteria=VisibilityCriteria{[]}|Damaged|hi!\n---|------------------------------------------|-----------------------------------------|-------|---\n', color=java.awt.Color[r=192,g=192,b=192]}" };
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item94 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item70, str_array93);
    dungeonString58.append(str_array93);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.io.PoemWriter.parsePoemCommand(str_array93);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creature_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str68 + "' != '" + "DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}\nYou don't see anyone here.\n', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"+ "'", str68.equals("DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}\nYou don't see anyone here.\n', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item94);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test095"); }

    org.mafagafogigante.dungeon.entity.items.ItemPresetFactory[] itemPresetFactory_array0 = new org.mafagafogigante.dungeon.entity.items.ItemPresetFactory[] {  };
    org.mafagafogigante.dungeon.entity.items.ItemFactory itemFactory1 = new org.mafagafogigante.dungeon.entity.items.ItemFactory(itemPresetFactory_array0);
    org.mafagafogigante.dungeon.entity.items.ItemFactory itemFactory2 = new org.mafagafogigante.dungeon.entity.items.ItemFactory(itemPresetFactory_array0);
    org.mafagafogigante.dungeon.game.Id id4 = new org.mafagafogigante.dungeon.game.Id("100");
    org.mafagafogigante.dungeon.util.Percentage percentage6 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b8 = percentage6.equals((java.lang.Object)10.0d);
    double d9 = percentage6.toDouble();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity10 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage6);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset11 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity12 = itemPreset11.getIntegrity();
    itemPreset11.setIntegrityDecrementOnEat((-1));
    org.mafagafogigante.dungeon.entity.Weight weight15 = itemPreset11.getWeight();
    itemPreset11.setDrinkableHealing((int)(byte)1);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset18 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity19 = itemPreset18.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity20 = null;
    itemPreset18.setIntegrity(integrity20);
    org.mafagafogigante.dungeon.util.Percentage percentage22 = itemPreset18.getVisibility();
    java.lang.String str23 = itemPreset18.getType();
    itemPreset18.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage27 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset18.setVisibility(percentage27);
    itemPreset11.setVisibility(percentage27);
    boolean b30 = percentage6.biggerThanOrEqualTo(percentage27);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset34 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    itemPreset34.setDrinkableHealing((int)(short)0);
    org.mafagafogigante.dungeon.util.Percentage percentage38 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset34.setVisibility(percentage38);
    double d40 = org.mafagafogigante.dungeon.util.DungeonMath.weightedAverage((double)10.0f, 100.0d, percentage38);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset41 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity42 = itemPreset41.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity43 = null;
    itemPreset41.setIntegrity(integrity43);
    org.mafagafogigante.dungeon.util.Percentage percentage45 = itemPreset41.getVisibility();
    java.lang.String str46 = itemPreset41.getType();
    org.mafagafogigante.dungeon.entity.items.Item.Tag tag47 = org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE;
    itemPreset41.addTag(tag47);
    org.mafagafogigante.dungeon.util.Percentage percentage50 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b52 = percentage50.equals((java.lang.Object)10.0d);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity53 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage50);
    itemPreset41.setVisibility(percentage50);
    boolean b55 = percentage38.biggerThanOrEqualTo(percentage50);
    org.mafagafogigante.dungeon.entity.items.WeaponComponent weaponComponent57 = new org.mafagafogigante.dungeon.entity.items.WeaponComponent((int)(short)10, percentage50, 1);
    org.mafagafogigante.dungeon.util.Percentage percentage58 = percentage6.multiply(percentage50);
    boolean b59 = id4.equals((java.lang.Object)percentage50);
    org.mafagafogigante.dungeon.date.Date date66 = new org.mafagafogigante.dungeon.date.Date((long)' ', 10L, 60L, (long)(short)100, (long)17518, (long)10);
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit68 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR;
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit69 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.MINUTE;
    long long70 = dungeonTimeUnit68.as(dungeonTimeUnit69);
    org.mafagafogigante.dungeon.date.Date date71 = date66.plus(152, dungeonTimeUnit68);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.items.Item item72 = itemFactory2.makeItem(id4, date66);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemPresetFactory_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d40 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str46);
    org.junit.Assert.assertTrue("'" + tag47 + "' != '" + org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE + "'", tag47.equals(org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit68 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR + "'", dungeonTimeUnit68.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR));
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit69 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.MINUTE + "'", dungeonTimeUnit69.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.MINUTE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long70 == 60L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date71);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test096"); }

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
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances13 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances14 = new org.mafagafogigante.dungeon.game.BlockedEntrances(blockedEntrances13);
    org.mafagafogigante.dungeon.game.Direction direction15 = org.mafagafogigante.dungeon.game.Direction.EAST;
    java.lang.String str16 = direction15.toString();
    java.lang.String str17 = direction15.toString();
    blockedEntrances13.block(direction15);
    blockedEntrances5.block(direction15);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = blockedEntrances5.toString();
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
    org.junit.Assert.assertTrue("'" + direction15 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction15.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "East"+ "'", str16.equals("East"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "East"+ "'", str17.equals("East"));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test097"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity1 = creaturePreset0.getLuminosity();
    creaturePreset0.setInventoryItemLimit(0);
    int i4 = creaturePreset0.getAttack();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test098"); }

    org.mafagafogigante.dungeon.util.CircularList<java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>> circularlist_comparable_weight1 = new org.mafagafogigante.dungeon.util.CircularList<java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>>(45056);
    int i2 = circularlist_comparable_weight1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test099"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    java.lang.String str3 = integrity2.toString();
    java.lang.String str4 = integrity2.toString();
    boolean b5 = integrity2.isMaximum();
    int i6 = integrity2.getMaximum();
    org.mafagafogigante.dungeon.entity.Integrity integrity7 = new org.mafagafogigante.dungeon.entity.Integrity(integrity2);
    boolean b8 = integrity2.isMaximum();
    int i9 = integrity2.getCurrent();
    java.lang.String str10 = integrity2.toString();
    int i11 = integrity2.getMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0/1"+ "'", str3.equals("0/1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0/1"+ "'", str4.equals("0/1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0/1"+ "'", str10.equals("0/1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test100"); }

    org.mafagafogigante.dungeon.entity.Weight weight1 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    org.mafagafogigante.dungeon.entity.Weight weight2 = org.mafagafogigante.dungeon.entity.Weight.ZERO;
    org.mafagafogigante.dungeon.entity.Weight weight3 = weight1.add(weight2);
    org.mafagafogigante.dungeon.entity.Weight weight5 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)'#');
    org.mafagafogigante.dungeon.entity.Weight weight6 = weight3.add(weight5);
    java.lang.String str7 = weight5.toString();
    org.mafagafogigante.dungeon.entity.Weight weight9 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)'#');
    org.mafagafogigante.dungeon.entity.Weight weight11 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)'#');
    org.mafagafogigante.dungeon.entity.Weight weight12 = weight9.add(weight11);
    int i13 = weight5.compareTo(weight11);
    
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
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "35 kg"+ "'", str7.equals("35 kg"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test101"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity((int)(byte)1, (int)(byte)0);
    boolean b3 = integrity2.isMaximum();
    org.mafagafogigante.dungeon.entity.items.Item item4 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity5 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity2, item4);
    itemIntegrity5.incrementBy((int)(byte)0);
    itemIntegrity5.incrementBy((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage10 = itemIntegrity5.toPercentage();
    int i11 = itemIntegrity5.getMaximum();
    int i12 = itemIntegrity5.getCurrent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemIntegrity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test102"); }

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
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay19 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date3);
    org.mafagafogigante.dungeon.date.Date date23 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date27 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i28 = date23.compareTo(date27);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay29 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date23);
    long long30 = date23.getYear();
    long long31 = date23.getMonth();
    long long32 = date23.getDay();
    long long33 = date23.getHour();
    int i34 = date3.compareTo(date23);
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit36 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.date.Date date37 = date23.plus(38, dungeonTimeUnit36);
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "day 10 of month 1 of the year 97"+ "'", str18.equals("day 10 of month 1 of the year 97"));
    org.junit.Assert.assertTrue("'" + partOfDay19 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay19.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay29 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay29.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long30 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long31 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long32 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long33 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 1);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test103"); }

    // The following exception was thrown during execution in test generation
    try {
    int i1 = org.mafagafogigante.dungeon.game.Random.nextInteger((int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test104"); }

    org.mafagafogigante.dungeon.logging.DungeonLogger.fine("day 10 of month 1 of the year 1");

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test105"); }

    org.mafagafogigante.dungeon.entity.items.ItemPresetFactory[] itemPresetFactory_array0 = new org.mafagafogigante.dungeon.entity.items.ItemPresetFactory[] {  };
    org.mafagafogigante.dungeon.entity.items.ItemFactory itemFactory1 = new org.mafagafogigante.dungeon.entity.items.ItemFactory(itemPresetFactory_array0);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature2 = null;
    org.mafagafogigante.dungeon.date.Date date9 = new org.mafagafogigante.dungeon.date.Date((long)100, 100L, (long)81, (long)(byte)-1, (long)152, (-1L));
    java.lang.String str10 = date9.toTimeString();
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.items.Item item11 = itemFactory1.makeCorpse(creature2, date9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemPresetFactory_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "01:00:00"+ "'", str10.equals("01:00:00"));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test106"); }

    java.awt.Color color1 = null;
    org.mafagafogigante.dungeon.game.LocationDescription locationDescription2 = new org.mafagafogigante.dungeon.game.LocationDescription('4', color1);
    locationDescription2.setInfo("");
    locationDescription2.setInfo("User: Nicholas\nTime: 15:45:51\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 38.5 MiB out of the allocated 109.5 MiB\nOS: Windows 10 (amd64) 10.0");

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test107"); }

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
    boolean b13 = itemPreset0.isUnique();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tagset_tag8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test108"); }

    org.mafagafogigante.dungeon.stats.Statistics statistics0 = new org.mafagafogigante.dungeon.stats.Statistics();
    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics1 = statistics0.getBattleStatistics();
    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics2 = statistics0.getBattleStatistics();
    statistics0.writeStatistics();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(battleStatistics1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(battleStatistics2);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test109"); }

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
    int i13 = itemPreset0.getIntegrityDecrementOnHit();
    int i14 = itemPreset0.getIntegrityDecrementOnEat();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test110"); }

    org.mafagafogigante.dungeon.game.Id id0 = null;
    org.mafagafogigante.dungeon.entity.items.BookComponent bookComponent2 = new org.mafagafogigante.dungeon.entity.items.BookComponent(id0, "");
    java.lang.String str3 = bookComponent2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "This book teaches nothing. Text: "+ "'", str3.equals("This book teaches nothing. Text: "));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test111"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    java.lang.String str3 = integrity2.toString();
    java.lang.String str4 = integrity2.toString();
    boolean b5 = integrity2.isMaximum();
    int i6 = integrity2.getMaximum();
    int i7 = integrity2.getCurrent();
    org.mafagafogigante.dungeon.entity.Integrity integrity8 = new org.mafagafogigante.dungeon.entity.Integrity(integrity2);
    
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

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test112"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    org.mafagafogigante.dungeon.game.Id id3 = creaturePreset0.getId();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity4 = creaturePreset0.getLuminosity();
    org.mafagafogigante.dungeon.entity.creatures.Drop[] drop_array5 = new org.mafagafogigante.dungeon.entity.creatures.Drop[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop> arraylist_drop6 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop6, drop_array5);
    creaturePreset0.setDropList((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop6);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay9 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity10 = partOfDay9.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name11 = partOfDay9.getName();
    java.lang.String str13 = name11.getQuantifiedName((int)'a');
    java.lang.String str14 = name11.getSingular();
    java.lang.String str15 = name11.toString();
    java.lang.String str16 = name11.getSingular();
    java.lang.String str17 = name11.getPlural();
    java.lang.String str18 = name11.getPlural();
    creaturePreset0.setName(name11);
    java.lang.String str20 = name11.getSingular();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(drop_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    org.junit.Assert.assertTrue("'" + partOfDay9 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay9.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "a few Nights"+ "'", str13.equals("a few Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Night"+ "'", str14.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Night"+ "'", str15.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Night"+ "'", str16.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Nights"+ "'", str17.equals("Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Nights"+ "'", str18.equals("Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Night"+ "'", str20.equals("Night"));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test113"); }

    org.mafagafogigante.dungeon.util.NonNegativeInteger nonNegativeInteger1 = new org.mafagafogigante.dungeon.util.NonNegativeInteger((java.lang.Integer)28);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test114"); }

    org.mafagafogigante.dungeon.util.Percentage percentage1 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b3 = percentage1.equals((java.lang.Object)10.0d);
    double d4 = percentage1.toDouble();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity5 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage1);
    org.mafagafogigante.dungeon.entity.Visibility visibility6 = new org.mafagafogigante.dungeon.entity.Visibility(percentage1);
    org.mafagafogigante.dungeon.util.Percentage percentage7 = visibility6.toPercentage();
    org.mafagafogigante.dungeon.util.Percentage percentage8 = visibility6.toPercentage();
    org.mafagafogigante.dungeon.util.Percentage percentage9 = visibility6.toPercentage();
    java.lang.String str10 = visibility6.toString();
    org.mafagafogigante.dungeon.util.Percentage percentage11 = visibility6.toPercentage();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Visibility of 100.00%"+ "'", str10.equals("Visibility of 100.00%"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage11);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test115"); }

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
    org.mafagafogigante.dungeon.entity.items.Item[] item_array40 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item41 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b42 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item41, item_array40);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString44 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array49 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString44.append(str_array49);
    java.lang.String str51 = dungeonString44.toString();
    org.mafagafogigante.dungeon.game.Point point55 = new org.mafagafogigante.dungeon.game.Point(10, (int)'a', 0);
    java.lang.String[] str_array58 = new java.lang.String[] { "", "" };
    org.mafagafogigante.dungeon.util.Table table59 = new org.mafagafogigante.dungeon.util.Table(str_array58);
    boolean b60 = point55.equals((java.lang.Object)str_array58);
    dungeonString44.append(str_array58);
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item62 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item41, str_array58);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString64 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array69 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString64.append(str_array69);
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications71 = null;
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)dungeonString64, writingSpecifications71);
    observer3.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item41, dungeonString64);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"+ "'", str51.equals("DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array69);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test116"); }

    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery0 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    java.lang.String str1 = battleStatisticsQuery0.toString();
    org.mafagafogigante.dungeon.game.Id id2 = null;
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery4 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath5 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    battleStatisticsQuery4.setCauseOfDeath(causeOfDeath5);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay7 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.stats.BattleRecord battleRecord8 = new org.mafagafogigante.dungeon.stats.BattleRecord(id2, "", causeOfDeath5, partOfDay7);
    java.lang.String str9 = battleRecord8.getType();
    org.mafagafogigante.dungeon.game.Id id10 = battleRecord8.getId();
    boolean b11 = battleStatisticsQuery0.matches(battleRecord8);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay12 = battleRecord8.getPartOfDay();
    org.mafagafogigante.dungeon.game.Id id13 = battleRecord8.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "BattleStatisticsQuery{id=null, type='null', causeOfDeath=null, partOfDay=null}"+ "'", str1.equals("BattleStatisticsQuery{id=null, type='null', causeOfDeath=null, partOfDay=null}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath5);
    org.junit.Assert.assertTrue("'" + partOfDay7 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay7.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    org.junit.Assert.assertTrue("'" + partOfDay12 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay12.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id13);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test117"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] creaturePresetFactory_array0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] {  };
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory1 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array0);
    org.mafagafogigante.dungeon.game.Id id2 = null;
    org.mafagafogigante.dungeon.game.World world3 = null;
    org.mafagafogigante.dungeon.entity.creatures.Creature creature4 = creatureFactory1.makeCreature(id2, world3);
    org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory corpseItemPresetFactory5 = new org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory(creatureFactory1);
    java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.CreaturePreset> collection_creaturePreset6 = creatureFactory1.getPresets();
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics7 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Id id8 = null;
    int i9 = explorationStatistics7.getMaximumNumberOfVisits(id8);
    org.mafagafogigante.dungeon.game.Id id10 = null;
    int i11 = explorationStatistics7.getMaximumNumberOfVisits(id10);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset12 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity13 = itemPreset12.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity14 = null;
    itemPreset12.setIntegrity(integrity14);
    org.mafagafogigante.dungeon.util.Percentage percentage16 = itemPreset12.getVisibility();
    org.mafagafogigante.dungeon.entity.Integrity integrity17 = itemPreset12.getIntegrity();
    java.lang.String str18 = itemPreset12.getText();
    java.lang.String str19 = itemPreset12.getType();
    org.mafagafogigante.dungeon.entity.Integrity integrity22 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    boolean b23 = integrity22.isMaximum();
    integrity22.incrementBy((int)(short)0);
    org.mafagafogigante.dungeon.util.Percentage percentage26 = integrity22.toPercentage();
    itemPreset12.setHitRate(percentage26);
    org.mafagafogigante.dungeon.game.Id id29 = new org.mafagafogigante.dungeon.game.Id("100");
    java.lang.String str30 = id29.toString();
    itemPreset12.setId(id29);
    org.mafagafogigante.dungeon.entity.items.BookComponent bookComponent33 = new org.mafagafogigante.dungeon.entity.items.BookComponent(id29, "DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}");
    int i34 = explorationStatistics7.getVisitedLocations(id29);
    org.mafagafogigante.dungeon.game.World world35 = null;
    org.mafagafogigante.dungeon.entity.creatures.Creature creature36 = creatureFactory1.makeCreature(id29, world35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creaturePresetFactory_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(creature4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_creaturePreset6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "100"+ "'", str30.equals("100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(creature36);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test118"); }

    org.mafagafogigante.dungeon.entity.Weight weight1 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(short)100);
    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics2 = new org.mafagafogigante.dungeon.stats.WorldStatistics();
    boolean b3 = weight1.equals((java.lang.Object)worldStatistics2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test119"); }

    org.mafagafogigante.dungeon.date.Date date6 = new org.mafagafogigante.dungeon.date.Date((long)(byte)0, (long)0, (long)81, (long)10, 100L, (long)(short)1);
    java.lang.String str7 = date6.toDateString();
    org.mafagafogigante.dungeon.date.Date date11 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date15 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i16 = date11.compareTo(date15);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay17 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date11);
    long long18 = date11.getYear();
    org.mafagafogigante.dungeon.date.Duration duration19 = new org.mafagafogigante.dungeon.date.Duration(date6, date11);
    org.mafagafogigante.dungeon.util.CircularList<java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>> circularlist_comparable_weight21 = new org.mafagafogigante.dungeon.util.CircularList<java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>>(100);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature22 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory25 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature22, (-1), 0.0d);
    org.mafagafogigante.dungeon.entity.Weight weight26 = creatureInventory25.getWeight();
    circularlist_comparable_weight21.add((java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>)weight26);
    org.mafagafogigante.dungeon.entity.Weight weight29 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    org.mafagafogigante.dungeon.entity.Weight weight30 = org.mafagafogigante.dungeon.entity.Weight.ZERO;
    org.mafagafogigante.dungeon.entity.Weight weight31 = weight29.add(weight30);
    circularlist_comparable_weight21.add((java.lang.Comparable<org.mafagafogigante.dungeon.entity.Weight>)weight31);
    int i33 = circularlist_comparable_weight21.size();
    boolean b34 = duration19.equals((java.lang.Object)circularlist_comparable_weight21);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str35 = duration19.toString();
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "day 10 of month 1 of the year 1"+ "'", str7.equals("day 10 of month 1 of the year 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay17 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay17.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test120"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    java.lang.String str5 = itemPreset0.getType();
    org.mafagafogigante.dungeon.game.Id id6 = itemPreset0.getSpellId();
    long long7 = itemPreset0.getPutrefactionPeriod();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test121"); }

    org.mafagafogigante.dungeon.game.Id id0 = null;
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery2 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath3 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    battleStatisticsQuery2.setCauseOfDeath(causeOfDeath3);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay5 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.stats.BattleRecord battleRecord6 = new org.mafagafogigante.dungeon.stats.BattleRecord(id0, "", causeOfDeath3, partOfDay5);
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath7 = battleRecord6.getCauseOfDeath();
    org.mafagafogigante.dungeon.game.Id id8 = battleRecord6.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath3);
    org.junit.Assert.assertTrue("'" + partOfDay5 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay5.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id8);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test122"); }

    org.mafagafogigante.dungeon.commands.CommandHistory commandHistory0 = new org.mafagafogigante.dungeon.commands.CommandHistory();
    java.lang.String str2 = commandHistory0.getLastSimilarCommand("52 Nights");
    org.mafagafogigante.dungeon.commands.IssuedCommand issuedCommand4 = new org.mafagafogigante.dungeon.commands.IssuedCommand("the sky is cloudy");
    commandHistory0.addCommand(issuedCommand4);
    org.mafagafogigante.dungeon.commands.CommandHistory commandHistory6 = new org.mafagafogigante.dungeon.commands.CommandHistory();
    java.lang.String str8 = commandHistory6.getLastSimilarCommand("52 Nights");
    org.mafagafogigante.dungeon.commands.IssuedCommand issuedCommand10 = new org.mafagafogigante.dungeon.commands.IssuedCommand("the sky is cloudy");
    commandHistory6.addCommand(issuedCommand10);
    java.lang.String str12 = issuedCommand10.getStringRepresentation();
    commandHistory0.addCommand(issuedCommand10);
    org.mafagafogigante.dungeon.commands.PreparedIssuedCommand preparedIssuedCommand14 = org.mafagafogigante.dungeon.commands.IssuedCommandProcessor.prepareIssuedCommand(issuedCommand10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "the sky is cloudy"+ "'", str12.equals("the sky is cloudy"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(preparedIssuedCommand14);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test123"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    org.mafagafogigante.dungeon.game.Id id3 = creaturePreset0.getId();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity4 = creaturePreset0.getLuminosity();
    org.mafagafogigante.dungeon.entity.creatures.Drop[] drop_array5 = new org.mafagafogigante.dungeon.entity.creatures.Drop[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop> arraylist_drop6 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop6, drop_array5);
    creaturePreset0.setDropList((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop6);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay9 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity10 = partOfDay9.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name11 = partOfDay9.getName();
    java.lang.String str13 = name11.getQuantifiedName((int)'a');
    java.lang.String str14 = name11.getPlural();
    creaturePreset0.setName(name11);
    java.util.List<org.mafagafogigante.dungeon.game.Id> list_id16 = creaturePreset0.getItems();
    org.mafagafogigante.dungeon.entity.TagSet<org.mafagafogigante.dungeon.entity.creatures.Creature.Tag> tagset_tag17 = null;
    creaturePreset0.setTagSet(tagset_tag17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(drop_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    org.junit.Assert.assertTrue("'" + partOfDay9 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay9.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "a few Nights"+ "'", str13.equals("a few Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Nights"+ "'", str14.equals("Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_id16);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test124"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity((int)(byte)1, (int)(byte)0);
    boolean b3 = integrity2.isMaximum();
    org.mafagafogigante.dungeon.entity.items.Item item4 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity5 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity2, item4);
    itemIntegrity5.incrementBy((int)(byte)0);
    itemIntegrity5.incrementBy((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage10 = itemIntegrity5.toPercentage();
    org.mafagafogigante.dungeon.util.Percentage percentage12 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    boolean b13 = org.mafagafogigante.dungeon.game.Random.roll(percentage12);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset16 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    itemPreset16.setDrinkableHealing((int)(short)0);
    org.mafagafogigante.dungeon.util.Percentage percentage20 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset16.setVisibility(percentage20);
    double d22 = org.mafagafogigante.dungeon.util.DungeonMath.weightedAverage((double)10.0f, 100.0d, percentage20);
    java.lang.String str23 = percentage20.toString();
    org.mafagafogigante.dungeon.util.Percentage percentage24 = percentage12.multiply(percentage20);
    int i25 = percentage10.compareTo(percentage12);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature26 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory29 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature26, 0, (double)(short)10);
    org.mafagafogigante.dungeon.entity.Weight weight30 = creatureInventory29.getWeight();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset31 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity32 = itemPreset31.getIntegrity();
    org.mafagafogigante.dungeon.util.Percentage percentage33 = itemPreset31.getVisibility();
    boolean b34 = itemPreset31.isUnique();
    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset35 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id36 = null;
    creaturePreset35.setWeaponId(id36);
    creaturePreset35.setAttack(57);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity40 = creaturePreset35.getLuminosity();
    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset41 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id42 = null;
    creaturePreset41.setWeaponId(id42);
    creaturePreset41.setAttack(57);
    org.mafagafogigante.dungeon.game.Id[] id_array46 = new org.mafagafogigante.dungeon.game.Id[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.game.Id> arraylist_id47 = new java.util.ArrayList<org.mafagafogigante.dungeon.game.Id>();
    boolean b48 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.game.Id>)arraylist_id47, id_array46);
    creaturePreset41.setItems((java.util.List<org.mafagafogigante.dungeon.game.Id>)arraylist_id47);
    creaturePreset35.setItems((java.util.List<org.mafagafogigante.dungeon.game.Id>)arraylist_id47);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset51 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity52 = itemPreset51.getIntegrity();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity53 = itemPreset51.getLuminosity();
    org.mafagafogigante.dungeon.util.Percentage percentage55 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset51.setVisibility(percentage55);
    creaturePreset35.setVisibility(percentage55);
    itemPreset31.setHitRate(percentage55);
    org.mafagafogigante.dungeon.entity.Weight weight59 = weight30.multiply(percentage55);
    int i60 = percentage10.compareTo(percentage55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemIntegrity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d22 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "100.00%"+ "'", str23.equals("100.00%"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(id_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test125"); }

    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics0 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics1 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point2 = null;
    org.mafagafogigante.dungeon.game.Id id3 = null;
    explorationStatistics1.createEntryIfNotExists(point2, id3);
    org.mafagafogigante.dungeon.game.Point point8 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id9 = null;
    explorationStatistics1.addVisit(point8, id9);
    boolean b11 = explorationStatistics0.hasBeenSeen(point8);
    org.mafagafogigante.dungeon.game.Point point15 = new org.mafagafogigante.dungeon.game.Point(5, 90, (int)'#');
    int i16 = point15.getX();
    boolean b17 = explorationStatistics0.hasBeenSeen(point15);
    org.mafagafogigante.dungeon.game.Direction direction18 = org.mafagafogigante.dungeon.game.Direction.DOWN;
    org.mafagafogigante.dungeon.game.Point point19 = direction18.getOffset();
    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset20 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id21 = null;
    creaturePreset20.setWeaponId(id21);
    creaturePreset20.setAttack(57);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity25 = creaturePreset20.getLuminosity();
    int i26 = creaturePreset20.getInventoryItemLimit();
    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset27 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id28 = null;
    creaturePreset27.setWeaponId(id28);
    creaturePreset27.setAttack(57);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity32 = creaturePreset27.getLuminosity();
    creaturePreset27.setInventoryItemLimit(57);
    org.mafagafogigante.dungeon.entity.creatures.Drop[] drop_array35 = new org.mafagafogigante.dungeon.entity.creatures.Drop[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop> arraylist_drop36 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop36, drop_array35);
    creaturePreset27.setDropList((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop36);
    creaturePreset20.setDropList((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop36);
    org.mafagafogigante.dungeon.entity.items.ItemPresetFactory[] itemPresetFactory_array40 = new org.mafagafogigante.dungeon.entity.items.ItemPresetFactory[] {  };
    org.mafagafogigante.dungeon.entity.items.ItemFactory itemFactory41 = new org.mafagafogigante.dungeon.entity.items.ItemFactory(itemPresetFactory_array40);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset42 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity43 = itemPreset42.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity44 = null;
    itemPreset42.setIntegrity(integrity44);
    org.mafagafogigante.dungeon.util.Percentage percentage46 = itemPreset42.getVisibility();
    org.mafagafogigante.dungeon.entity.Integrity integrity47 = itemPreset42.getIntegrity();
    java.lang.String str48 = itemPreset42.getText();
    java.lang.String str49 = itemPreset42.getType();
    org.mafagafogigante.dungeon.entity.Integrity integrity52 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    boolean b53 = integrity52.isMaximum();
    integrity52.incrementBy((int)(short)0);
    org.mafagafogigante.dungeon.util.Percentage percentage56 = integrity52.toPercentage();
    itemPreset42.setHitRate(percentage56);
    org.mafagafogigante.dungeon.game.Id id59 = new org.mafagafogigante.dungeon.game.Id("100");
    java.lang.String str60 = id59.toString();
    itemPreset42.setId(id59);
    org.mafagafogigante.dungeon.entity.items.BookComponent bookComponent63 = new org.mafagafogigante.dungeon.entity.items.BookComponent(id59, "DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}");
    boolean b64 = itemFactory41.canMakeItem(id59);
    creaturePreset20.setId(id59);
    explorationStatistics0.createEntryIfNotExists(point19, id59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    org.junit.Assert.assertTrue("'" + direction18 + "' != '" + org.mafagafogigante.dungeon.game.Direction.DOWN + "'", direction18.equals(org.mafagafogigante.dungeon.game.Direction.DOWN));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(drop_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemPresetFactory_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "100"+ "'", str60.equals("100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test126"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date7 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i8 = date3.compareTo(date7);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay9 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date3);
    long long10 = date3.getYear();
    long long11 = date3.getMonth();
    long long12 = date3.getDay();
    org.mafagafogigante.dungeon.world.Weather weather13 = new org.mafagafogigante.dungeon.world.Weather(date3);
    long long14 = date3.getDay();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay9 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay9.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 10L);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test127"); }

    // The following exception was thrown during execution in test generation
    try {
    int i1 = org.mafagafogigante.dungeon.game.Random.nextInteger((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test128"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date7 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i8 = date3.compareTo(date7);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay9 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date3);
    long long10 = date3.getYear();
    long long11 = date3.getMonth();
    long long12 = date3.getDay();
    org.mafagafogigante.dungeon.world.Weather weather13 = new org.mafagafogigante.dungeon.world.Weather(date3);
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
    long long84 = date83.getMonth();
    org.mafagafogigante.dungeon.world.Weather weather85 = new org.mafagafogigante.dungeon.world.Weather(date83);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay86 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date83);
    java.lang.String str87 = date83.toTimeString();
    org.mafagafogigante.dungeon.world.WeatherCondition weatherCondition88 = weather13.getCurrentCondition(date83);
    java.lang.String str89 = date83.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay9 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay9.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 10L);
    
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
    org.junit.Assert.assertTrue(long84 == 10L);
    org.junit.Assert.assertTrue("'" + partOfDay86 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay86.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str87 + "' != '" + "03:00:00"+ "'", str87.equals("03:00:00"));
    org.junit.Assert.assertTrue("'" + weatherCondition88 + "' != '" + org.mafagafogigante.dungeon.world.WeatherCondition.CLEAR + "'", weatherCondition88.equals(org.mafagafogigante.dungeon.world.WeatherCondition.CLEAR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str89 + "' != '" + "10-10-10 03:00:00"+ "'", str89.equals("10-10-10 03:00:00"));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test129"); }

    int i2 = org.mafagafogigante.dungeon.game.Random.nextInteger(0, 13843);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 11874);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test130"); }

    org.mafagafogigante.dungeon.logging.DungeonLogger.info("Disabled LightSource of luminosity of 0.00%");

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test131"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity2 = itemPreset0.getLuminosity();
    org.mafagafogigante.dungeon.util.Percentage percentage4 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset0.setVisibility(percentage4);
    itemPreset0.setIntegrityDecrementPerDose(10);
    itemPreset0.setType("100 kg");
    boolean b10 = itemPreset0.isUnique();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test132"); }

    org.mafagafogigante.dungeon.date.Date date4 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date8 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i9 = date4.compareTo(date8);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay10 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date4);
    java.lang.String[] str_array16 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table17 = new org.mafagafogigante.dungeon.util.Table(str_array16);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString18 = table17.toColoredStringList();
    org.mafagafogigante.dungeon.game.ColoredString coloredString19 = org.mafagafogigante.dungeon.game.Random.select(list_coloredString18);
    boolean b20 = date4.equals((java.lang.Object)coloredString19);
    java.awt.Color color21 = coloredString19.getColor();
    org.mafagafogigante.dungeon.game.DungeonString dungeonString22 = new org.mafagafogigante.dungeon.game.DungeonString("This book teaches nothing. Text: Night", color21);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array23 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item24 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item24, item_array23);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString27 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array32 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString27.append(str_array32);
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item34 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item24, str_array32);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString36 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array41 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString36.append(str_array41);
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item43 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item24, str_array41);
    dungeonString22.append(str_array41);
    
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
    org.junit.Assert.assertNotNull(color21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item43);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test133"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table6 = new org.mafagafogigante.dungeon.util.Table(str_array5);
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications7 = null;
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)table6, writingSpecifications7);
    table6.insertSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test134"); }

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
    int i29 = weaponComponent26.getDamage();
    int i30 = weaponComponent26.getDamage();
    
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
    org.junit.Assert.assertTrue(i29 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 10);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test135"); }

    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances0 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.Direction direction1 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b2 = blockedEntrances0.isBlocked(direction1);
    org.mafagafogigante.dungeon.game.Direction direction3 = org.mafagafogigante.dungeon.game.Direction.WEST;
    boolean b4 = blockedEntrances0.isBlocked(direction3);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances5 = new org.mafagafogigante.dungeon.game.BlockedEntrances(blockedEntrances0);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances6 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.Direction direction7 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b9 = direction7.equalsIgnoreCase("");
    blockedEntrances6.block(direction7);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances11 = new org.mafagafogigante.dungeon.game.BlockedEntrances(blockedEntrances6);
    org.mafagafogigante.dungeon.game.Direction direction12 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b14 = direction12.equalsIgnoreCase("");
    java.lang.String str15 = direction12.toString();
    boolean b16 = blockedEntrances11.isBlocked(direction12);
    blockedEntrances5.block(direction12);
    org.junit.Assert.assertTrue("'" + direction1 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction1.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + direction3 + "' != '" + org.mafagafogigante.dungeon.game.Direction.WEST + "'", direction3.equals(org.mafagafogigante.dungeon.game.Direction.WEST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    org.junit.Assert.assertTrue("'" + direction7 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction7.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    org.junit.Assert.assertTrue("'" + direction12 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction12.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "East"+ "'", str15.equals("East"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test136"); }

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
    java.lang.String str16 = battleRecord15.getType();
    org.mafagafogigante.dungeon.game.Id id17 = battleRecord15.getId();
    java.lang.String str18 = battleRecord15.toString();
    
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "East"+ "'", str16.equals("East"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "BattleEntry{id=null, type='East', causeOfDeath=Unarmed : UNARMED, partOfDay=Noon}"+ "'", str18.equals("BattleEntry{id=null, type='East', causeOfDeath=Unarmed : UNARMED, partOfDay=Noon}"));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test137"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule2 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeBoundDoubleRule((double)(byte)1, (double)20601);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule2);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test138"); }

    org.mafagafogigante.dungeon.commands.CommandHistory commandHistory0 = new org.mafagafogigante.dungeon.commands.CommandHistory();
    java.lang.String str2 = commandHistory0.getLastSimilarCommand("52 Nights");
    org.mafagafogigante.dungeon.commands.IssuedCommand issuedCommand4 = new org.mafagafogigante.dungeon.commands.IssuedCommand("the sky is cloudy");
    commandHistory0.addCommand(issuedCommand4);
    org.mafagafogigante.dungeon.commands.CommandHistory commandHistory6 = new org.mafagafogigante.dungeon.commands.CommandHistory();
    java.lang.String str8 = commandHistory6.getLastSimilarCommand("East");
    org.mafagafogigante.dungeon.commands.CommandHistory.Cursor cursor9 = commandHistory6.getCursor();
    org.mafagafogigante.dungeon.commands.IssuedCommand issuedCommand11 = new org.mafagafogigante.dungeon.commands.IssuedCommand("100");
    commandHistory6.addCommand(issuedCommand11);
    org.mafagafogigante.dungeon.commands.IssuedCommandEvaluation issuedCommandEvaluation13 = org.mafagafogigante.dungeon.commands.IssuedCommandProcessor.evaluateIssuedCommand(issuedCommand11);
    commandHistory0.addCommand(issuedCommand11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cursor9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(issuedCommandEvaluation13);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test139"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.util.Percentage percentage2 = itemPreset0.getVisibility();
    int i3 = itemPreset0.getIntegrityDecrementPerDose();
    org.mafagafogigante.dungeon.util.Percentage percentage5 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b7 = percentage5.equals((java.lang.Object)10.0d);
    double d8 = percentage5.toDouble();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity9 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage5);
    org.mafagafogigante.dungeon.entity.Visibility visibility10 = new org.mafagafogigante.dungeon.entity.Visibility(percentage5);
    org.mafagafogigante.dungeon.util.Percentage percentage11 = visibility10.toPercentage();
    org.mafagafogigante.dungeon.util.Percentage percentage12 = visibility10.toPercentage();
    org.mafagafogigante.dungeon.util.Percentage percentage13 = visibility10.toPercentage();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay14 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity15 = partOfDay14.getLuminosity();
    org.mafagafogigante.dungeon.world.LuminosityVisibilityCriterion luminosityVisibilityCriterion16 = new org.mafagafogigante.dungeon.world.LuminosityVisibilityCriterion(luminosity15);
    boolean b17 = visibility10.visibleUnder(luminosity15);
    itemPreset0.setLuminosity(luminosity15);
    org.mafagafogigante.dungeon.entity.LightSource lightSource19 = new org.mafagafogigante.dungeon.entity.LightSource(luminosity15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage13);
    org.junit.Assert.assertTrue("'" + partOfDay14 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay14.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test140"); }

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
    long long23 = date14.getTime();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long23 == 86313600000L);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test141"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    java.lang.String str2 = itemPreset0.getType();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset3 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity4 = itemPreset3.getIntegrity();
    org.mafagafogigante.dungeon.util.Percentage percentage5 = itemPreset3.getVisibility();
    java.lang.String str6 = itemPreset3.getType();
    org.mafagafogigante.dungeon.game.Id id7 = null;
    itemPreset3.setId(id7);
    itemPreset3.setIntegrityDecrementOnHit(1);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset11 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity12 = itemPreset11.getIntegrity();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset13 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity14 = itemPreset13.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity15 = null;
    itemPreset13.setIntegrity(integrity15);
    org.mafagafogigante.dungeon.util.Percentage percentage17 = itemPreset13.getVisibility();
    java.lang.String str18 = itemPreset13.getType();
    org.mafagafogigante.dungeon.entity.items.Item.Tag tag19 = org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE;
    itemPreset13.addTag(tag19);
    itemPreset11.addTag(tag19);
    itemPreset3.addTag(tag19);
    itemPreset0.addTag(tag19);
    itemPreset0.setIntegrityDecrementPerDose((int)(byte)0);
    org.mafagafogigante.dungeon.util.Percentage percentage26 = itemPreset0.getVisibility();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    org.junit.Assert.assertTrue("'" + tag19 + "' != '" + org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE + "'", tag19.equals(org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage26);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test142"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    java.lang.String str5 = itemPreset0.getType();
    itemPreset0.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.entity.TagSet<org.mafagafogigante.dungeon.entity.items.Item.Tag> tagset_tag8 = itemPreset0.getTagSet();
    org.mafagafogigante.dungeon.game.Id id9 = null;
    itemPreset0.setId(id9);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity11 = itemPreset0.getLuminosity();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset12 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity13 = itemPreset12.getIntegrity();
    org.mafagafogigante.dungeon.util.Percentage percentage14 = itemPreset12.getVisibility();
    java.lang.String str15 = itemPreset12.getType();
    itemPreset12.setDrinkableHealing(10);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay18 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity19 = partOfDay18.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name20 = partOfDay18.getName();
    java.lang.String str22 = name20.getQuantifiedName((int)'a');
    java.lang.String str23 = name20.getSingular();
    java.lang.String str24 = name20.toString();
    java.lang.String str25 = name20.getSingular();
    itemPreset12.setName(name20);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset27 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity28 = itemPreset27.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity29 = null;
    itemPreset27.setIntegrity(integrity29);
    org.mafagafogigante.dungeon.util.Percentage percentage31 = itemPreset27.getVisibility();
    java.lang.String str32 = itemPreset27.getType();
    itemPreset27.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage36 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset27.setVisibility(percentage36);
    org.mafagafogigante.dungeon.game.Id id38 = null;
    itemPreset27.setId(id38);
    itemPreset27.setPutrefactionPeriod((long)(short)1);
    org.mafagafogigante.dungeon.entity.items.Item.Tag tag42 = org.mafagafogigante.dungeon.entity.items.Item.Tag.DECOMPOSES;
    boolean b43 = itemPreset27.hasTag(tag42);
    itemPreset12.addTag(tag42);
    boolean b45 = itemPreset0.hasTag(tag42);
    org.mafagafogigante.dungeon.date.Date date49 = new org.mafagafogigante.dungeon.date.Date((long)32, (long)(short)10, 0L);
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit51 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.SECOND;
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit52 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.MILLISECOND;
    long long53 = dungeonTimeUnit51.as(dungeonTimeUnit52);
    org.mafagafogigante.dungeon.date.Date date54 = date49.minus((int)(short)100, dungeonTimeUnit51);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.items.Item item55 = new org.mafagafogigante.dungeon.entity.items.Item(itemPreset0, date49);
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
    org.junit.Assert.assertNotNull(tagset_tag8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    org.junit.Assert.assertTrue("'" + partOfDay18 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay18.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "a few Nights"+ "'", str22.equals("a few Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Night"+ "'", str23.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Night"+ "'", str24.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Night"+ "'", str25.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    org.junit.Assert.assertTrue("'" + tag42 + "' != '" + org.mafagafogigante.dungeon.entity.items.Item.Tag.DECOMPOSES + "'", tag42.equals(org.mafagafogigante.dungeon.entity.items.Item.Tag.DECOMPOSES));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit51 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.SECOND + "'", dungeonTimeUnit51.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.SECOND));
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit52 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.MILLISECOND + "'", dungeonTimeUnit52.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.MILLISECOND));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long53 == 1000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date54);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test143"); }

    java.awt.Color color1 = null;
    org.mafagafogigante.dungeon.game.LocationDescription locationDescription2 = new org.mafagafogigante.dungeon.game.LocationDescription('a', color1);
    java.awt.Color color3 = locationDescription2.getColor();
    locationDescription2.setInfo("Night");
    char char6 = locationDescription2.getSymbol();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(color3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char6 == 'a');

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test144"); }

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
    org.mafagafogigante.dungeon.entity.Luminosity luminosity27 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage19);
    java.lang.String str28 = luminosity27.toString();
    
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
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Luminosity of 100.00%"+ "'", str28.equals("Luminosity of 100.00%"));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test145"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature1 = null;
    org.mafagafogigante.dungeon.entity.creatures.CreatureHealth creatureHealth2 = org.mafagafogigante.dungeon.entity.creatures.CreatureHealth.makeCreatureHealth(100, creature1);
    boolean b3 = creatureHealth2.isAlive();
    boolean b4 = creatureHealth2.isDead();
    creatureHealth2.decrementBy((int)(short)-1);
    org.mafagafogigante.dungeon.entity.creatures.HealthState healthState7 = creatureHealth2.getHealthState();
    org.mafagafogigante.dungeon.entity.creatures.HealthState healthState8 = creatureHealth2.getHealthState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creatureHealth2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    org.junit.Assert.assertTrue("'" + healthState7 + "' != '" + org.mafagafogigante.dungeon.entity.creatures.HealthState.UNINJURED + "'", healthState7.equals(org.mafagafogigante.dungeon.entity.creatures.HealthState.UNINJURED));
    org.junit.Assert.assertTrue("'" + healthState8 + "' != '" + org.mafagafogigante.dungeon.entity.creatures.HealthState.UNINJURED + "'", healthState8.equals(org.mafagafogigante.dungeon.entity.creatures.HealthState.UNINJURED));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test146"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] creaturePresetFactory_array0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] {  };
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory1 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array0);
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory2 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array0);
    org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory corpseItemPresetFactory3 = new org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory(creatureFactory2);
    org.mafagafogigante.dungeon.entity.items.ItemPresetFactory[] itemPresetFactory_array4 = new org.mafagafogigante.dungeon.entity.items.ItemPresetFactory[] { corpseItemPresetFactory3 };
    org.mafagafogigante.dungeon.entity.items.ItemFactory itemFactory5 = new org.mafagafogigante.dungeon.entity.items.ItemFactory(itemPresetFactory_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creaturePresetFactory_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemPresetFactory_array4);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test147"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] creaturePresetFactory_array0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] {  };
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory1 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array0);
    org.mafagafogigante.dungeon.game.Id id2 = null;
    org.mafagafogigante.dungeon.game.World world3 = null;
    org.mafagafogigante.dungeon.entity.creatures.Creature creature4 = creatureFactory1.makeCreature(id2, world3);
    org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory corpseItemPresetFactory5 = new org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory(creatureFactory1);
    java.util.Collection<org.mafagafogigante.dungeon.entity.items.ItemPreset> collection_itemPreset6 = corpseItemPresetFactory5.getItemPresets();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creaturePresetFactory_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(creature4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_itemPreset6);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test148"); }

    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances0 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    java.lang.String str1 = blockedEntrances0.toString();
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances2 = new org.mafagafogigante.dungeon.game.BlockedEntrances(blockedEntrances0);
    org.mafagafogigante.dungeon.game.Direction direction3 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b5 = direction3.equalsIgnoreCase("");
    org.mafagafogigante.dungeon.game.Direction direction6 = direction3.invert();
    boolean b7 = blockedEntrances2.isBlocked(direction3);
    java.lang.String str8 = blockedEntrances2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "None"+ "'", str1.equals("None"));
    org.junit.Assert.assertTrue("'" + direction3 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction3.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    org.junit.Assert.assertTrue("'" + direction6 + "' != '" + org.mafagafogigante.dungeon.game.Direction.WEST + "'", direction6.equals(org.mafagafogigante.dungeon.game.Direction.WEST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "None"+ "'", str8.equals("None"));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test149"); }

    org.mafagafogigante.dungeon.commands.CommandHistory commandHistory0 = new org.mafagafogigante.dungeon.commands.CommandHistory();
    java.lang.String str2 = commandHistory0.getLastSimilarCommand("");
    java.lang.String str4 = commandHistory0.getLastSimilarCommand("Unarmed : UNARMED");
    org.mafagafogigante.dungeon.commands.CommandHistory.Cursor cursor5 = commandHistory0.getCursor();
    org.mafagafogigante.dungeon.commands.CommandHistory.Cursor cursor6 = cursor5.moveUp();
    org.mafagafogigante.dungeon.commands.CommandHistory.Cursor cursor7 = cursor5.moveUp();
    cursor5.moveToEnd();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cursor5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cursor6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cursor7);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test150"); }

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
    org.mafagafogigante.dungeon.entity.TagSet<org.mafagafogigante.dungeon.entity.creatures.Creature.Tag> tagset_tag16 = null;
    creaturePreset0.setTagSet(tagset_tag16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "100.00%"+ "'", str14.equals("100.00%"));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test151"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    creaturePreset0.setAttack(57);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity5 = creaturePreset0.getLuminosity();
    int i6 = creaturePreset0.getInventoryItemLimit();
    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset7 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id8 = null;
    creaturePreset7.setWeaponId(id8);
    creaturePreset7.setAttack(57);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity12 = creaturePreset7.getLuminosity();
    creaturePreset7.setInventoryItemLimit(57);
    org.mafagafogigante.dungeon.entity.creatures.Drop[] drop_array15 = new org.mafagafogigante.dungeon.entity.creatures.Drop[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop> arraylist_drop16 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop16, drop_array15);
    creaturePreset7.setDropList((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop16);
    creaturePreset0.setDropList((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop16);
    org.mafagafogigante.dungeon.entity.Weight weight20 = creaturePreset0.getWeight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(drop_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weight20);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test152"); }

    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery0 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    java.lang.String str1 = battleStatisticsQuery0.toString();
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics2 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point3 = null;
    org.mafagafogigante.dungeon.game.Id id4 = null;
    explorationStatistics2.createEntryIfNotExists(point3, id4);
    org.mafagafogigante.dungeon.game.Point point9 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id10 = null;
    explorationStatistics2.addVisit(point9, id10);
    boolean b12 = battleStatisticsQuery0.equals((java.lang.Object)explorationStatistics2);
    org.mafagafogigante.dungeon.entity.items.ItemPresetFactory[] itemPresetFactory_array13 = new org.mafagafogigante.dungeon.entity.items.ItemPresetFactory[] {  };
    org.mafagafogigante.dungeon.entity.items.ItemFactory itemFactory14 = new org.mafagafogigante.dungeon.entity.items.ItemFactory(itemPresetFactory_array13);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset15 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity16 = itemPreset15.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity17 = null;
    itemPreset15.setIntegrity(integrity17);
    org.mafagafogigante.dungeon.util.Percentage percentage19 = itemPreset15.getVisibility();
    org.mafagafogigante.dungeon.entity.Integrity integrity20 = itemPreset15.getIntegrity();
    java.lang.String str21 = itemPreset15.getText();
    java.lang.String str22 = itemPreset15.getType();
    org.mafagafogigante.dungeon.entity.Integrity integrity25 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    boolean b26 = integrity25.isMaximum();
    integrity25.incrementBy((int)(short)0);
    org.mafagafogigante.dungeon.util.Percentage percentage29 = integrity25.toPercentage();
    itemPreset15.setHitRate(percentage29);
    org.mafagafogigante.dungeon.game.Id id32 = new org.mafagafogigante.dungeon.game.Id("100");
    java.lang.String str33 = id32.toString();
    itemPreset15.setId(id32);
    org.mafagafogigante.dungeon.entity.items.BookComponent bookComponent36 = new org.mafagafogigante.dungeon.entity.items.BookComponent(id32, "DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}");
    boolean b37 = itemFactory14.canMakeItem(id32);
    battleStatisticsQuery0.setId(id32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "BattleStatisticsQuery{id=null, type='null', causeOfDeath=null, partOfDay=null}"+ "'", str1.equals("BattleStatisticsQuery{id=null, type='null', causeOfDeath=null, partOfDay=null}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemPresetFactory_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "100"+ "'", str33.equals("100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test153"); }

    org.mafagafogigante.dungeon.commands.IssuedCommand issuedCommand1 = new org.mafagafogigante.dungeon.commands.IssuedCommand("the sky is cloudy");
    org.mafagafogigante.dungeon.util.StopWatch stopWatch2 = new org.mafagafogigante.dungeon.util.StopWatch();
    java.util.concurrent.TimeUnit timeUnit3 = null;
    java.lang.String str4 = stopWatch2.toString(timeUnit3);
    java.lang.String str5 = stopWatch2.toString();
    java.util.concurrent.TimeUnit timeUnit6 = null;
    java.lang.String str7 = stopWatch2.toString(timeUnit6);
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
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1 ms"+ "'", str5.equals("1 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test154"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    creaturePreset0.setAttack((int)(short)100);
    org.mafagafogigante.dungeon.game.Id id5 = creaturePreset0.getWeaponId();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity6 = creaturePreset0.getLuminosity();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity7 = creaturePreset0.getLuminosity();
    creaturePreset0.setAttack(0);
    int i10 = creaturePreset0.getHealth();
    org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] creaturePresetFactory_array11 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] {  };
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory12 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array11);
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory13 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array11);
    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset14 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id15 = null;
    creaturePreset14.setWeaponId(id15);
    creaturePreset14.setAttack(57);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity19 = creaturePreset14.getLuminosity();
    org.mafagafogigante.dungeon.entity.creatures.Creature.Tag tag20 = org.mafagafogigante.dungeon.entity.creatures.Creature.Tag.MILKABLE;
    boolean b21 = creaturePreset14.hasTag(tag20);
    org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId attackAlgorithmId22 = creaturePreset14.getAttackAlgorithmId();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset23 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity24 = itemPreset23.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity25 = null;
    itemPreset23.setIntegrity(integrity25);
    org.mafagafogigante.dungeon.util.Percentage percentage27 = itemPreset23.getVisibility();
    org.mafagafogigante.dungeon.entity.Integrity integrity28 = itemPreset23.getIntegrity();
    java.lang.String str29 = itemPreset23.getText();
    java.lang.String str30 = itemPreset23.getType();
    org.mafagafogigante.dungeon.entity.Integrity integrity33 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    boolean b34 = integrity33.isMaximum();
    integrity33.incrementBy((int)(short)0);
    org.mafagafogigante.dungeon.util.Percentage percentage37 = integrity33.toPercentage();
    itemPreset23.setHitRate(percentage37);
    org.mafagafogigante.dungeon.game.Id id40 = new org.mafagafogigante.dungeon.game.Id("100");
    java.lang.String str41 = id40.toString();
    itemPreset23.setId(id40);
    org.mafagafogigante.dungeon.entity.items.BookComponent bookComponent44 = new org.mafagafogigante.dungeon.entity.items.BookComponent(id40, "DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}");
    creaturePreset14.setId(id40);
    org.mafagafogigante.dungeon.game.World world46 = null;
    org.mafagafogigante.dungeon.entity.creatures.Creature creature47 = creatureFactory13.makeCreature(id40, world46);
    creaturePreset0.setId(id40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creaturePresetFactory_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity19);
    org.junit.Assert.assertTrue("'" + tag20 + "' != '" + org.mafagafogigante.dungeon.entity.creatures.Creature.Tag.MILKABLE + "'", tag20.equals(org.mafagafogigante.dungeon.entity.creatures.Creature.Tag.MILKABLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(attackAlgorithmId22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "100"+ "'", str41.equals("100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(creature47);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test155"); }

    org.mafagafogigante.dungeon.game.Id id0 = null;
    org.mafagafogigante.dungeon.entity.items.BookComponent bookComponent2 = new org.mafagafogigante.dungeon.entity.items.BookComponent(id0, "Night");
    org.mafagafogigante.dungeon.game.Id id3 = bookComponent2.getSpellId();
    int i4 = bookComponent2.getTimeToRead();
    org.mafagafogigante.dungeon.game.Id id5 = bookComponent2.getSpellId();
    int i6 = bookComponent2.getTimeToRead();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 5);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test156"); }

    org.mafagafogigante.dungeon.entity.items.Item[] item_array0 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item1 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item1, item_array0);
    java.lang.String[] str_array8 = new java.lang.String[] { "CounterMap{map={}}", "User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 34.4 MiB out of the allocated 123.0 MiB\nOS: Windows 10 (amd64) 10.0", "hi!", "0 ms", "User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 41.5 MiB out of the allocated 154.5 MiB\nOS: Windows 10 (amd64) 10.0" };
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item9 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item1, str_array8);
    java.lang.String[] str_array15 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table16 = new org.mafagafogigante.dungeon.util.Table(str_array15);
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item17 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems(list_item9, str_array15);
    org.mafagafogigante.dungeon.util.Table table18 = new org.mafagafogigante.dungeon.util.Table(str_array15);
    java.lang.String[] str_array24 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table25 = new org.mafagafogigante.dungeon.util.Table(str_array24);
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications28 = new org.mafagafogigante.dungeon.gui.WritingSpecifications(false, 32);
    boolean b29 = writingSpecifications28.shouldWait();
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)table25, writingSpecifications28);
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)table18, writingSpecifications28);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test157"); }

    org.mafagafogigante.dungeon.stats.Statistics statistics0 = new org.mafagafogigante.dungeon.stats.Statistics();
    statistics0.writeStatistics();
    statistics0.writeStatistics();
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker3 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics0);
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker4 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics0);
    org.mafagafogigante.dungeon.commands.IssuedCommand issuedCommand6 = new org.mafagafogigante.dungeon.commands.IssuedCommand("BattleStatistics{records=CounterMap{map={}}}");
    statistics0.addCommand(issuedCommand6);
    org.mafagafogigante.dungeon.stats.Statistics statistics8 = new org.mafagafogigante.dungeon.stats.Statistics();
    statistics8.writeStatistics();
    statistics8.writeStatistics();
    statistics8.writeStatistics();
    org.mafagafogigante.dungeon.commands.IssuedCommand issuedCommand13 = new org.mafagafogigante.dungeon.commands.IssuedCommand("BattleStatistics{records=CounterMap{map={}}}");
    org.mafagafogigante.dungeon.commands.PreparedIssuedCommand preparedIssuedCommand14 = org.mafagafogigante.dungeon.commands.IssuedCommandProcessor.prepareIssuedCommand(issuedCommand13);
    statistics8.addCommand(issuedCommand13);
    org.mafagafogigante.dungeon.commands.IssuedCommandEvaluation issuedCommandEvaluation16 = org.mafagafogigante.dungeon.commands.IssuedCommandProcessor.evaluateIssuedCommand(issuedCommand13);
    statistics0.addCommand(issuedCommand13);
    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics18 = statistics0.getBattleStatistics();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(preparedIssuedCommand14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(issuedCommandEvaluation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(battleStatistics18);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test158"); }

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
    int i20 = point18.getX();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 100);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test159"); }

    org.mafagafogigante.dungeon.commands.CommandHistory commandHistory0 = new org.mafagafogigante.dungeon.commands.CommandHistory();
    java.lang.String str2 = commandHistory0.getLastSimilarCommand("");
    java.lang.String str4 = commandHistory0.getLastSimilarCommand("Unarmed : UNARMED");
    java.lang.String str6 = commandHistory0.getLastSimilarCommand("Broken");
    java.lang.String str8 = commandHistory0.getLastSimilarCommand("User: Nicholas\nTime: 15:43:26\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 25.7 MiB out of the allocated 109.5 MiB\nOS: Windows 10 (amd64) 10.0");
    org.mafagafogigante.dungeon.commands.CommandHistory commandHistory9 = new org.mafagafogigante.dungeon.commands.CommandHistory();
    org.mafagafogigante.dungeon.commands.IssuedCommand issuedCommand11 = new org.mafagafogigante.dungeon.commands.IssuedCommand("BattleStatistics{records=CounterMap{map={}}}");
    org.mafagafogigante.dungeon.commands.PreparedIssuedCommand preparedIssuedCommand12 = org.mafagafogigante.dungeon.commands.IssuedCommandProcessor.prepareIssuedCommand(issuedCommand11);
    java.lang.String str13 = issuedCommand11.getStringRepresentation();
    commandHistory9.addCommand(issuedCommand11);
    commandHistory0.addCommand(issuedCommand11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(preparedIssuedCommand12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "BattleStatistics{records=CounterMap{map={}}}"+ "'", str13.equals("BattleStatistics{records=CounterMap{map={}}}"));

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test160"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    itemPreset0.setIntegrityDecrementOnEat((-1));
    org.mafagafogigante.dungeon.game.Id id4 = itemPreset0.getSpellId();
    int i5 = itemPreset0.getDrinkableDoses();
    itemPreset0.setDamage((-1));
    int i8 = itemPreset0.getIntegrityDecrementPerDose();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test161"); }

    java.lang.String[] str_array3 = new java.lang.String[] { "Damaged", "visibilityCriteria=VisibilityCriteria{[]}", "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str4 = new java.util.ArrayList<java.lang.String>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str4, str_array3);
    org.mafagafogigante.dungeon.io.Split split6 = org.mafagafogigante.dungeon.io.Split.splitOnOn((java.util.List<java.lang.String>)arraylist_str4);
    java.util.List<java.lang.String> list_str7 = split6.getAfter();
    org.mafagafogigante.dungeon.io.Split split8 = org.mafagafogigante.dungeon.io.Split.splitOnOn(list_str7);
    java.util.List<java.lang.String> list_str9 = split8.getBefore();
    org.mafagafogigante.dungeon.io.Split split10 = org.mafagafogigante.dungeon.io.Split.splitOnOn(list_str9);
    org.mafagafogigante.dungeon.io.Split split11 = org.mafagafogigante.dungeon.io.Split.splitOnOn(list_str9);
    
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
    org.junit.Assert.assertNotNull(list_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(split10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(split11);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test162"); }

    org.mafagafogigante.dungeon.entity.items.IntegrityState integrityState2 = org.mafagafogigante.dungeon.entity.items.IntegrityState.getIntegrityState(3, 11874);
    org.junit.Assert.assertTrue("'" + integrityState2 + "' != '" + org.mafagafogigante.dungeon.entity.items.IntegrityState.SEVERELY_DAMAGED + "'", integrityState2.equals(org.mafagafogigante.dungeon.entity.items.IntegrityState.SEVERELY_DAMAGED));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test163"); }

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
    java.lang.String str28 = percentage24.toString();
    double d29 = org.mafagafogigante.dungeon.util.DungeonMath.weightedAverage((double)(-1.0f), 10.0d, percentage24);
    
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
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "100.00%"+ "'", str28.equals("100.00%"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d29 == 10.0d);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test164"); }

    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics0 = new org.mafagafogigante.dungeon.stats.WorldStatistics();
    int i1 = worldStatistics0.getSpawnCount();
    worldStatistics0.addSpawn("Spell : null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test165"); }

    org.mafagafogigante.dungeon.util.Percentage percentage1 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b3 = percentage1.equals((java.lang.Object)10.0d);
    double d4 = percentage1.toDouble();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity5 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage1);
    org.mafagafogigante.dungeon.entity.Visibility visibility6 = new org.mafagafogigante.dungeon.entity.Visibility(percentage1);
    java.lang.String str7 = visibility6.toString();
    org.mafagafogigante.dungeon.util.Percentage percentage8 = visibility6.toPercentage();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Visibility of 100.00%"+ "'", str7.equals("Visibility of 100.00%"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage8);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test166"); }

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
    itemPreset0.setType("BattleStatisticsRequirement{query=BattleStatisticsQuery{id=null, type='null', causeOfDeath=null, partOfDay=null}, count=100}");
    org.mafagafogigante.dungeon.entity.Integrity integrity16 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    boolean b17 = integrity16.isMaximum();
    org.mafagafogigante.dungeon.entity.items.Item item18 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity19 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity16, item18);
    int i20 = integrity16.getCurrent();
    org.mafagafogigante.dungeon.entity.Integrity integrity21 = new org.mafagafogigante.dungeon.entity.Integrity(integrity16);
    itemPreset0.setIntegrity(integrity21);
    
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
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemIntegrity19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test167"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] creaturePresetFactory_array0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] {  };
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory1 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array0);
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory2 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array0);
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory3 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array0);
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory4 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creaturePresetFactory_array0);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test168"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset2 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity3 = itemPreset2.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity4 = null;
    itemPreset2.setIntegrity(integrity4);
    org.mafagafogigante.dungeon.util.Percentage percentage6 = itemPreset2.getVisibility();
    java.lang.String str7 = itemPreset2.getType();
    itemPreset2.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.entity.TagSet<org.mafagafogigante.dungeon.entity.items.Item.Tag> tagset_tag10 = itemPreset2.getTagSet();
    org.mafagafogigante.dungeon.entity.Weight weight12 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    itemPreset2.setWeight(weight12);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset14 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity15 = itemPreset14.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity16 = null;
    itemPreset14.setIntegrity(integrity16);
    org.mafagafogigante.dungeon.util.Percentage percentage19 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    itemPreset14.setHitRate(percentage19);
    itemPreset2.setHitRate(percentage19);
    double d22 = org.mafagafogigante.dungeon.util.DungeonMath.weightedAverage((double)46800, (double)3, percentage19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tagset_tag10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d22 == 3.0d);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test169"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature1 = null;
    org.mafagafogigante.dungeon.entity.creatures.CreatureHealth creatureHealth2 = org.mafagafogigante.dungeon.entity.creatures.CreatureHealth.makeCreatureHealth(100, creature1);
    boolean b3 = creatureHealth2.isAlive();
    java.lang.String str4 = creatureHealth2.toString();
    creatureHealth2.decrementBy((int)(byte)10);
    int i7 = creatureHealth2.getCurrent();
    org.mafagafogigante.dungeon.util.Percentage percentage8 = creatureHealth2.toPercentage();
    org.mafagafogigante.dungeon.util.Percentage percentage10 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    boolean b11 = org.mafagafogigante.dungeon.game.Random.roll(percentage10);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset14 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    itemPreset14.setDrinkableHealing((int)(short)0);
    org.mafagafogigante.dungeon.util.Percentage percentage18 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset14.setVisibility(percentage18);
    double d20 = org.mafagafogigante.dungeon.util.DungeonMath.weightedAverage((double)10.0f, 100.0d, percentage18);
    java.lang.String str21 = percentage18.toString();
    org.mafagafogigante.dungeon.util.Percentage percentage22 = percentage10.multiply(percentage18);
    org.mafagafogigante.dungeon.util.Percentage percentage24 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset25 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity26 = itemPreset25.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity27 = null;
    itemPreset25.setIntegrity(integrity27);
    org.mafagafogigante.dungeon.util.Percentage percentage29 = itemPreset25.getVisibility();
    java.lang.String str30 = itemPreset25.getType();
    itemPreset25.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage34 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset25.setVisibility(percentage34);
    boolean b36 = org.mafagafogigante.dungeon.game.Random.roll(percentage34);
    org.mafagafogigante.dungeon.util.Percentage percentage37 = percentage24.multiply(percentage34);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset38 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity39 = itemPreset38.getIntegrity();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity40 = itemPreset38.getLuminosity();
    org.mafagafogigante.dungeon.util.Percentage percentage42 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset38.setVisibility(percentage42);
    org.mafagafogigante.dungeon.util.Percentage percentage44 = percentage37.multiply(percentage42);
    org.mafagafogigante.dungeon.util.Percentage percentage45 = percentage10.multiply(percentage44);
    boolean b46 = percentage8.biggerThanOrEqualTo(percentage10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creatureHealth2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "CreatureHealth{integrity=100/100}"+ "'", str4.equals("CreatureHealth{integrity=100/100}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "100.00%"+ "'", str21.equals("100.00%"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test170"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity2 = itemPreset0.getLuminosity();
    org.mafagafogigante.dungeon.util.Percentage percentage4 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset0.setVisibility(percentage4);
    int i6 = itemPreset0.getNutrition();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset7 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity8 = itemPreset7.getIntegrity();
    itemPreset7.setIntegrityDecrementOnEat((-1));
    org.mafagafogigante.dungeon.entity.Weight weight11 = itemPreset7.getWeight();
    itemPreset7.setDrinkableHealing((int)(byte)1);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset14 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity15 = itemPreset14.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity16 = null;
    itemPreset14.setIntegrity(integrity16);
    org.mafagafogigante.dungeon.util.Percentage percentage18 = itemPreset14.getVisibility();
    java.lang.String str19 = itemPreset14.getType();
    itemPreset14.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage23 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset14.setVisibility(percentage23);
    itemPreset7.setVisibility(percentage23);
    org.mafagafogigante.dungeon.entity.items.Item.Tag tag26 = org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE;
    boolean b27 = itemPreset7.hasTag(tag26);
    itemPreset7.setUnique(false);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset30 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity31 = itemPreset30.getIntegrity();
    itemPreset30.setIntegrityDecrementOnEat((-1));
    org.mafagafogigante.dungeon.entity.Weight weight34 = itemPreset30.getWeight();
    itemPreset30.setDrinkableHealing((int)(byte)1);
    int i37 = itemPreset30.getDamage();
    org.mafagafogigante.dungeon.entity.items.Item.Tag tag38 = org.mafagafogigante.dungeon.entity.items.Item.Tag.CLOCK;
    boolean b39 = itemPreset30.hasTag(tag38);
    boolean b40 = itemPreset7.hasTag(tag38);
    itemPreset0.addTag(tag38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weight11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    org.junit.Assert.assertTrue("'" + tag26 + "' != '" + org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE + "'", tag26.equals(org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weight34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    org.junit.Assert.assertTrue("'" + tag38 + "' != '" + org.mafagafogigante.dungeon.entity.items.Item.Tag.CLOCK + "'", tag38.equals(org.mafagafogigante.dungeon.entity.items.Item.Tag.CLOCK));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test171"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    creaturePreset0.setAttack(57);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity5 = creaturePreset0.getLuminosity();
    creaturePreset0.setInventoryItemLimit(57);
    org.mafagafogigante.dungeon.entity.creatures.Drop[] drop_array8 = new org.mafagafogigante.dungeon.entity.creatures.Drop[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop> arraylist_drop9 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop9, drop_array8);
    creaturePreset0.setDropList((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop9);
    creaturePreset0.setInventoryWeightLimit((double)(byte)0);
    creaturePreset0.setAttack(85);
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
    org.junit.Assert.assertNotNull(drop_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test172"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    creaturePreset0.setAttack((int)(short)100);
    java.util.List<org.mafagafogigante.dungeon.entity.creatures.Drop> list_drop5 = creaturePreset0.getDropList();
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.creatures.Creature creature6 = new org.mafagafogigante.dungeon.entity.creatures.Creature(creaturePreset0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_drop5);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test173"); }

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
    org.mafagafogigante.dungeon.entity.creatures.Hero hero16 = null;
    org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster heroSpellcaster17 = new org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster(hero16);
    java.util.List<org.mafagafogigante.dungeon.spells.Spell> list_spell18 = heroSpellcaster17.getSpellList();
    boolean b19 = percentage13.equals((java.lang.Object)heroSpellcaster17);
    org.mafagafogigante.dungeon.spells.Spell spell20 = null;
    boolean b21 = heroSpellcaster17.knowsSpell(spell20);
    java.util.List<org.mafagafogigante.dungeon.spells.Spell> list_spell22 = heroSpellcaster17.getSpellList();
    org.mafagafogigante.dungeon.spells.Spell spell23 = null;
    // The following exception was thrown during execution in test generation
    try {
    heroSpellcaster17.learnSpell(spell23);
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
    org.junit.Assert.assertNotNull(list_spell18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_spell22);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test174"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature1 = null;
    org.mafagafogigante.dungeon.entity.creatures.CreatureHealth creatureHealth2 = org.mafagafogigante.dungeon.entity.creatures.CreatureHealth.makeCreatureHealth(100, creature1);
    int i3 = creatureHealth2.getMaximum();
    int i4 = creatureHealth2.getMaximum();
    java.lang.String str5 = creatureHealth2.toString();
    boolean b6 = creatureHealth2.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creatureHealth2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "CreatureHealth{integrity=100/100}"+ "'", str5.equals("CreatureHealth{integrity=100/100}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test175"); }

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
    org.mafagafogigante.dungeon.stats.Statistics statistics13 = new org.mafagafogigante.dungeon.stats.Statistics();
    statistics13.writeStatistics();
    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics15 = statistics13.getWorldStatistics();
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker16 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics13);
    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics17 = statistics13.getWorldStatistics();
    int i18 = countermap_worldStatistics0.getCounter(worldStatistics17);
    
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
    org.junit.Assert.assertNotNull(worldStatistics15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(worldStatistics17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test176"); }

    org.mafagafogigante.dungeon.commands.CommandHistory commandHistory0 = new org.mafagafogigante.dungeon.commands.CommandHistory();
    java.lang.String str2 = commandHistory0.getLastSimilarCommand("");
    java.lang.String str4 = commandHistory0.getLastSimilarCommand("Unarmed : UNARMED");
    org.mafagafogigante.dungeon.commands.CommandHistory.Cursor cursor5 = commandHistory0.getCursor();
    cursor5.moveToEnd();
    org.mafagafogigante.dungeon.commands.CommandHistory.Cursor cursor7 = cursor5.moveUp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cursor5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cursor7);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test177"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity((int)(byte)1, (int)(byte)0);
    boolean b3 = integrity2.isMaximum();
    org.mafagafogigante.dungeon.entity.items.Item item4 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity5 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity2, item4);
    itemIntegrity5.incrementBy((int)(byte)0);
    itemIntegrity5.incrementBy((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage10 = itemIntegrity5.toPercentage();
    itemIntegrity5.decrementBy(0);
    boolean b13 = itemIntegrity5.isBroken();
    itemIntegrity5.incrementBy((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemIntegrity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test178"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    itemPreset0.setIntegrityDecrementOnEat((-1));
    org.mafagafogigante.dungeon.entity.Weight weight4 = itemPreset0.getWeight();
    itemPreset0.setDrinkableHealing((int)(byte)1);
    int i7 = itemPreset0.getDamage();
    org.mafagafogigante.dungeon.game.Name name8 = itemPreset0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(name8);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test179"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, (int)(short)-1, (double)(short)-1);
    org.mafagafogigante.dungeon.entity.Weight weight4 = creatureInventory3.getWeightLimit();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight4);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test180"); }

    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics0 = new org.mafagafogigante.dungeon.stats.BattleStatistics();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement1 = null;
    boolean b2 = battleStatistics0.satisfies(battleStatisticsRequirement1);
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery3 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement5 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement(battleStatisticsQuery3, (int)(byte)100);
    boolean b6 = battleStatistics0.satisfies(battleStatisticsRequirement5);
    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics7 = new org.mafagafogigante.dungeon.stats.BattleStatistics();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement8 = null;
    boolean b9 = battleStatistics7.satisfies(battleStatisticsRequirement8);
    java.lang.String str10 = battleStatistics7.toString();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery11 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement13 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement(battleStatisticsQuery11, (int)(byte)100);
    boolean b14 = battleStatistics7.satisfies(battleStatisticsRequirement13);
    org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.CauseOfDeath> countermap_causeOfDeath15 = battleStatistics7.getKillsByCauseOfDeath();
    org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.CauseOfDeath> countermap_causeOfDeath16 = battleStatistics7.getKillsByCauseOfDeath();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery17 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement19 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement(battleStatisticsQuery17, (int)(byte)100);
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery20 = battleStatisticsRequirement19.getQuery();
    boolean b21 = battleStatistics7.satisfies(battleStatisticsRequirement19);
    boolean b22 = battleStatistics0.satisfies(battleStatisticsRequirement19);
    java.lang.String str23 = battleStatistics0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "BattleStatistics{records=CounterMap{map={}}}"+ "'", str10.equals("BattleStatistics{records=CounterMap{map={}}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_causeOfDeath15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_causeOfDeath16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(battleStatisticsQuery20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "BattleStatistics{records=CounterMap{map={}}}"+ "'", str23.equals("BattleStatistics{records=CounterMap{map={}}}"));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test181"); }

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
    itemPreset0.setNutrition(90);
    itemPreset0.setPutrefactionPeriod(85496399L);
    
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

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test182"); }

    java.lang.String[] str_array3 = new java.lang.String[] { "Damaged", "visibilityCriteria=VisibilityCriteria{[]}", "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str4 = new java.util.ArrayList<java.lang.String>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str4, str_array3);
    org.mafagafogigante.dungeon.io.Split split6 = org.mafagafogigante.dungeon.io.Split.splitOnOn((java.util.List<java.lang.String>)arraylist_str4);
    java.util.List<java.lang.String> list_str7 = split6.getBefore();
    org.mafagafogigante.dungeon.io.Split split8 = org.mafagafogigante.dungeon.io.Split.splitOnOn(list_str7);
    java.util.List<java.lang.String> list_str9 = split8.getAfter();
    
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
    org.junit.Assert.assertNotNull(list_str9);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test183"); }

    org.mafagafogigante.dungeon.io.Sleeper.sleep(1000L);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test184"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature1 = null;
    org.mafagafogigante.dungeon.entity.creatures.CreatureHealth creatureHealth2 = org.mafagafogigante.dungeon.entity.creatures.CreatureHealth.makeCreatureHealth(17518, creature1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creatureHealth2);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test185"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity((int)(byte)1, (int)(byte)0);
    boolean b3 = integrity2.isMaximum();
    org.mafagafogigante.dungeon.entity.items.Item item4 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity5 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity2, item4);
    itemIntegrity5.incrementBy((int)(byte)0);
    itemIntegrity5.incrementBy((int)(short)100);
    // The following exception was thrown during execution in test generation
    try {
    itemIntegrity5.decrementBy(35);
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
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test186"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date((long)82800, 60L, (long)0);
    long long4 = date3.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 715391136000000L);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test187"); }

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
    long long15 = date3.getHour();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 0L);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test188"); }

    org.mafagafogigante.dungeon.commands.CommandHistory commandHistory0 = new org.mafagafogigante.dungeon.commands.CommandHistory();
    java.lang.String str2 = commandHistory0.getLastSimilarCommand("visibilityCriteria=VisibilityCriteria{[]}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test189"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, (int)(short)0, (double)10.0f);
    int i4 = creatureInventory3.getItemCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test190"); }

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
    int i28 = creaturePreset0.getHealth();
    
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
    org.junit.Assert.assertTrue(i28 == 0);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test191"); }

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
    org.mafagafogigante.dungeon.game.ColoredString coloredString25 = new org.mafagafogigante.dungeon.game.ColoredString("Up", color23);
    org.mafagafogigante.dungeon.game.ColoredString coloredString26 = new org.mafagafogigante.dungeon.game.ColoredString("Enabled LightSource of luminosity of 0.00%", color23);
    
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
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test192"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity((int)(byte)1, (int)(byte)0);
    boolean b3 = integrity2.isZero();
    boolean b4 = integrity2.isZero();
    org.mafagafogigante.dungeon.entity.items.Item item5 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity6 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity2, item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemIntegrity6);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test193"); }

    org.mafagafogigante.dungeon.world.WeatherCondition weatherCondition0 = org.mafagafogigante.dungeon.world.WeatherCondition.OVERCAST;
    org.mafagafogigante.dungeon.world.WeatherCondition weatherCondition1 = org.mafagafogigante.dungeon.world.WeatherCondition.OVERCAST;
    org.mafagafogigante.dungeon.world.WeatherConditionVisibilityCriterion weatherConditionVisibilityCriterion2 = new org.mafagafogigante.dungeon.world.WeatherConditionVisibilityCriterion(weatherCondition0, weatherCondition1);
    java.lang.String str3 = weatherCondition0.toDescriptiveString();
    org.junit.Assert.assertTrue("'" + weatherCondition0 + "' != '" + org.mafagafogigante.dungeon.world.WeatherCondition.OVERCAST + "'", weatherCondition0.equals(org.mafagafogigante.dungeon.world.WeatherCondition.OVERCAST));
    org.junit.Assert.assertTrue("'" + weatherCondition1 + "' != '" + org.mafagafogigante.dungeon.world.WeatherCondition.OVERCAST + "'", weatherCondition1.equals(org.mafagafogigante.dungeon.world.WeatherCondition.OVERCAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "the sky is overcast"+ "'", str3.equals("the sky is overcast"));

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test194"); }

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
    java.util.List<org.mafagafogigante.dungeon.game.Id> list_id16 = creaturePreset0.getItems();
    org.mafagafogigante.dungeon.entity.TagSet<org.mafagafogigante.dungeon.entity.creatures.Creature.Tag> tagset_tag17 = null;
    creaturePreset0.setTagSet(tagset_tag17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(id_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_id16);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test195"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    int i3 = creaturePreset0.getAttack();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test196"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date7 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i8 = date3.compareTo(date7);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay9 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date3);
    long long10 = date3.getYear();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay11 = org.mafagafogigante.dungeon.game.PartOfDay.AFTERNOON;
    int i12 = org.mafagafogigante.dungeon.game.PartOfDay.getSecondsToNext(date3, partOfDay11);
    org.mafagafogigante.dungeon.date.Date date16 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date20 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i21 = date16.compareTo(date20);
    long long22 = date20.getDay();
    org.mafagafogigante.dungeon.date.Duration duration23 = new org.mafagafogigante.dungeon.date.Duration(date3, date20);
    org.mafagafogigante.dungeon.date.Date date30 = new org.mafagafogigante.dungeon.date.Date((long)(byte)0, (long)0, (long)81, (long)10, 100L, (long)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.date.Duration duration31 = new org.mafagafogigante.dungeon.date.Duration(date3, date30);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay9 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay9.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 10L);
    org.junit.Assert.assertTrue("'" + partOfDay11 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.AFTERNOON + "'", partOfDay11.equals(org.mafagafogigante.dungeon.game.PartOfDay.AFTERNOON));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 46800);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long22 == 10L);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test197"); }

    org.mafagafogigante.dungeon.entity.items.ItemPresetFactory[] itemPresetFactory_array0 = new org.mafagafogigante.dungeon.entity.items.ItemPresetFactory[] {  };
    org.mafagafogigante.dungeon.entity.items.ItemFactory itemFactory1 = new org.mafagafogigante.dungeon.entity.items.ItemFactory(itemPresetFactory_array0);
    org.mafagafogigante.dungeon.entity.items.ItemFactory itemFactory2 = new org.mafagafogigante.dungeon.entity.items.ItemFactory(itemPresetFactory_array0);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature3 = null;
    org.mafagafogigante.dungeon.date.Date date7 = new org.mafagafogigante.dungeon.date.Date((long)97, (long)(byte)-1, (long)'#');
    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics8 = new org.mafagafogigante.dungeon.stats.BattleStatistics();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement9 = null;
    boolean b10 = battleStatistics8.satisfies(battleStatisticsRequirement9);
    java.lang.String str11 = battleStatistics8.toString();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery12 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement14 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement(battleStatisticsQuery12, (int)(byte)100);
    boolean b15 = battleStatistics8.satisfies(battleStatisticsRequirement14);
    org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.CauseOfDeath> countermap_causeOfDeath16 = battleStatistics8.getKillsByCauseOfDeath();
    org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.CauseOfDeath> countermap_causeOfDeath17 = battleStatistics8.getKillsByCauseOfDeath();
    boolean b18 = date7.equals((java.lang.Object)countermap_causeOfDeath17);
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit20 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.YEAR;
    org.mafagafogigante.dungeon.date.Date date21 = date7.plus(45056, dungeonTimeUnit20);
    java.lang.String str22 = date7.toDateString();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay23 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date7);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.items.Item item24 = itemFactory2.makeCorpse(creature3, date7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemPresetFactory_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "BattleStatistics{records=CounterMap{map={}}}"+ "'", str11.equals("BattleStatistics{records=CounterMap{map={}}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_causeOfDeath16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_causeOfDeath17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit20 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.YEAR + "'", dungeonTimeUnit20.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.YEAR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "day 10 of month 1 of the year 97"+ "'", str22.equals("day 10 of month 1 of the year 97"));
    org.junit.Assert.assertTrue("'" + partOfDay23 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay23.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test198"); }

    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics0 = new org.mafagafogigante.dungeon.stats.WorldStatistics();
    int i1 = worldStatistics0.getLocationCount();
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str2 = worldStatistics0.getSpawnCounter();
    boolean b3 = countermap_str2.isNotEmpty();
    countermap_str2.incrementCounter("");
    boolean b6 = countermap_str2.isNotEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test199"); }

    org.mafagafogigante.dungeon.logging.DungeonLogger.fine("{10, 97, 0}");

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test200"); }

    org.mafagafogigante.dungeon.game.LocationPreset locationPreset0 = null;
    org.mafagafogigante.dungeon.game.World world1 = null;
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics2 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point3 = null;
    org.mafagafogigante.dungeon.game.Id id4 = null;
    explorationStatistics2.createEntryIfNotExists(point3, id4);
    org.mafagafogigante.dungeon.game.Point point9 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id10 = null;
    explorationStatistics2.addVisit(point9, id10);
    int i12 = point9.getX();
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.game.Location location13 = new org.mafagafogigante.dungeon.game.Location(locationPreset0, world1, point9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test201"); }

    org.mafagafogigante.dungeon.stats.Statistics statistics0 = new org.mafagafogigante.dungeon.stats.Statistics();
    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics1 = statistics0.getBattleStatistics();
    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics2 = statistics0.getWorldStatistics();
    int i3 = worldStatistics2.getLocationCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(battleStatistics1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(worldStatistics2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test202"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.entity.Integrity integrity4 = itemPreset0.getIntegrity();
    itemPreset0.setPutrefactionPeriod((long)(byte)0);
    org.mafagafogigante.dungeon.util.Percentage percentage7 = itemPreset0.getHitRate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage7);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test203"); }

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
    int i29 = integrity22.getCurrent();
    integrity22.decrementBy(205);
    
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
    org.junit.Assert.assertTrue(i29 == 0);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test204"); }

    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics0 = new org.mafagafogigante.dungeon.stats.BattleStatistics();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement1 = null;
    boolean b2 = battleStatistics0.satisfies(battleStatisticsRequirement1);
    java.lang.String str3 = battleStatistics0.toString();
    org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.CauseOfDeath> countermap_causeOfDeath4 = battleStatistics0.getKillsByCauseOfDeath();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath5 = null;
    countermap_causeOfDeath4.incrementCounter(causeOfDeath5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "BattleStatistics{records=CounterMap{map={}}}"+ "'", str3.equals("BattleStatistics{records=CounterMap{map={}}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_causeOfDeath4);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test205"); }

    org.mafagafogigante.dungeon.logging.DungeonLogger.fine("97-01-01 00:00:00");

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test206"); }

    org.mafagafogigante.dungeon.game.DungeonString dungeonString3 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString3.append(str_array8);
    java.awt.Color color10 = null;
    dungeonString3.setColor(color10);
    org.mafagafogigante.dungeon.date.Date date16 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date20 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i21 = date16.compareTo(date20);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay22 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date16);
    java.lang.String[] str_array28 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table29 = new org.mafagafogigante.dungeon.util.Table(str_array28);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString30 = table29.toColoredStringList();
    org.mafagafogigante.dungeon.game.ColoredString coloredString31 = org.mafagafogigante.dungeon.game.Random.select(list_coloredString30);
    boolean b32 = date16.equals((java.lang.Object)coloredString31);
    java.awt.Color color33 = coloredString31.getColor();
    org.mafagafogigante.dungeon.game.ColoredString coloredString34 = new org.mafagafogigante.dungeon.game.ColoredString("User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 41.5 MiB out of the allocated 154.5 MiB\nOS: Windows 10 (amd64) 10.0", color33);
    dungeonString3.setColor(color33);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString36 = new org.mafagafogigante.dungeon.game.DungeonString("Enabled LightSource of luminosity of 0.00%", color33);
    org.mafagafogigante.dungeon.game.LocationDescription locationDescription37 = new org.mafagafogigante.dungeon.game.LocationDescription(' ', color33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay22 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay22.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(coloredString31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color33);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test207"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table6 = new org.mafagafogigante.dungeon.util.Table(str_array5);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString7 = table6.toColoredStringList();
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications8 = null;
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)table6, writingSpecifications8);
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)table6);
    table6.insertSeparator();
    java.lang.String[] str_array17 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table18 = new org.mafagafogigante.dungeon.util.Table(str_array17);
    org.mafagafogigante.dungeon.util.Table table19 = new org.mafagafogigante.dungeon.util.Table(str_array17);
    table6.insertRow(str_array17);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.achievements.AchievementTrackerWriter.parseCommand(str_array17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test208"); }

    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics0 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.entity.creatures.Creature creature1 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory4 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature1, (-1), 0.0d);
    org.mafagafogigante.dungeon.entity.Weight weight5 = creatureInventory4.getWeight();
    int i6 = creatureInventory4.getItemCount();
    int i7 = creatureInventory4.getItemCount();
    org.mafagafogigante.dungeon.entity.Weight weight8 = creatureInventory4.getWeightLimit();
    org.mafagafogigante.dungeon.stats.Statistics statistics9 = new org.mafagafogigante.dungeon.stats.Statistics();
    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics10 = statistics9.getBattleStatistics();
    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics11 = statistics9.getWorldStatistics();
    boolean b12 = weight8.equals((java.lang.Object)statistics9);
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics13 = statistics9.getExplorationStatistics();
    org.mafagafogigante.dungeon.game.Id id14 = null;
    int i15 = explorationStatistics13.getKillCount(id14);
    org.mafagafogigante.dungeon.game.Id id16 = null;
    int i17 = explorationStatistics13.getKillCount(id16);
    org.mafagafogigante.dungeon.game.Id id18 = null;
    int i19 = explorationStatistics13.getVisitedLocations(id18);
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics20 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point21 = null;
    org.mafagafogigante.dungeon.game.Id id22 = null;
    explorationStatistics20.createEntryIfNotExists(point21, id22);
    org.mafagafogigante.dungeon.game.Point point27 = new org.mafagafogigante.dungeon.game.Point(10, (int)'a', 0);
    java.lang.String[] str_array30 = new java.lang.String[] { "", "" };
    org.mafagafogigante.dungeon.util.Table table31 = new org.mafagafogigante.dungeon.util.Table(str_array30);
    boolean b32 = point27.equals((java.lang.Object)str_array30);
    org.mafagafogigante.dungeon.game.Id id33 = null;
    explorationStatistics20.addVisit(point27, id33);
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics35 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point36 = null;
    org.mafagafogigante.dungeon.game.Id id37 = null;
    explorationStatistics35.createEntryIfNotExists(point36, id37);
    org.mafagafogigante.dungeon.game.Point point42 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id43 = null;
    explorationStatistics35.addVisit(point42, id43);
    java.lang.String str45 = point42.toString();
    int i46 = point42.getZ();
    org.mafagafogigante.dungeon.game.Id id47 = null;
    explorationStatistics20.addVisit(point42, id47);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset49 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity50 = itemPreset49.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity51 = null;
    itemPreset49.setIntegrity(integrity51);
    org.mafagafogigante.dungeon.util.Percentage percentage53 = itemPreset49.getVisibility();
    org.mafagafogigante.dungeon.entity.Integrity integrity54 = itemPreset49.getIntegrity();
    java.lang.String str55 = itemPreset49.getText();
    java.lang.String str56 = itemPreset49.getType();
    org.mafagafogigante.dungeon.entity.Integrity integrity59 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    boolean b60 = integrity59.isMaximum();
    integrity59.incrementBy((int)(short)0);
    org.mafagafogigante.dungeon.util.Percentage percentage63 = integrity59.toPercentage();
    itemPreset49.setHitRate(percentage63);
    org.mafagafogigante.dungeon.game.Id id66 = new org.mafagafogigante.dungeon.game.Id("100");
    java.lang.String str67 = id66.toString();
    itemPreset49.setId(id66);
    explorationStatistics13.addVisit(point42, id66);
    int i70 = explorationStatistics0.getVisitedLocations(id66);
    org.mafagafogigante.dungeon.entity.items.BookComponent bookComponent72 = new org.mafagafogigante.dungeon.entity.items.BookComponent(id66, "{100, 10, 10}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(battleStatistics10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(worldStatistics11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(explorationStatistics13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{32, 0, -1}"+ "'", str45.equals("{32, 0, -1}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str67 + "' != '" + "100"+ "'", str67.equals("100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test209"); }

    org.mafagafogigante.dungeon.game.PartOfDay partOfDay0 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity1 = partOfDay0.getLuminosity();
    org.mafagafogigante.dungeon.entity.LightSource lightSource2 = new org.mafagafogigante.dungeon.entity.LightSource(luminosity1);
    lightSource2.disable();
    lightSource2.disable();
    org.junit.Assert.assertTrue("'" + partOfDay0 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay0.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity1);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test210"); }

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
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics16 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point17 = null;
    org.mafagafogigante.dungeon.game.Id id18 = null;
    explorationStatistics16.createEntryIfNotExists(point17, id18);
    org.mafagafogigante.dungeon.game.Point point23 = new org.mafagafogigante.dungeon.game.Point(100, 10, (int)(byte)10);
    org.mafagafogigante.dungeon.game.Id id24 = null;
    explorationStatistics16.addVisit(point23, id24);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances26 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.Direction direction27 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b29 = direction27.equalsIgnoreCase("");
    blockedEntrances26.block(direction27);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances31 = new org.mafagafogigante.dungeon.game.BlockedEntrances(blockedEntrances26);
    org.mafagafogigante.dungeon.game.Direction direction32 = org.mafagafogigante.dungeon.game.Direction.EAST;
    org.mafagafogigante.dungeon.game.Direction direction33 = direction32.invert();
    blockedEntrances31.block(direction33);
    org.mafagafogigante.dungeon.game.Direction direction35 = org.mafagafogigante.dungeon.game.Direction.EAST;
    java.lang.String str36 = direction35.toString();
    java.lang.String str37 = direction35.toString();
    blockedEntrances31.block(direction35);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances39 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances40 = new org.mafagafogigante.dungeon.game.BlockedEntrances(blockedEntrances39);
    org.mafagafogigante.dungeon.game.Direction direction41 = org.mafagafogigante.dungeon.game.Direction.EAST;
    java.lang.String str42 = direction41.toString();
    java.lang.String str43 = direction41.toString();
    blockedEntrances39.block(direction41);
    blockedEntrances31.block(direction41);
    org.mafagafogigante.dungeon.game.Point point46 = direction41.getOffset();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset47 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity48 = itemPreset47.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity49 = null;
    itemPreset47.setIntegrity(integrity49);
    org.mafagafogigante.dungeon.util.Percentage percentage51 = itemPreset47.getVisibility();
    org.mafagafogigante.dungeon.entity.Integrity integrity52 = itemPreset47.getIntegrity();
    java.lang.String str53 = itemPreset47.getText();
    java.lang.String str54 = itemPreset47.getType();
    org.mafagafogigante.dungeon.entity.Integrity integrity57 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    boolean b58 = integrity57.isMaximum();
    integrity57.incrementBy((int)(short)0);
    org.mafagafogigante.dungeon.util.Percentage percentage61 = integrity57.toPercentage();
    itemPreset47.setHitRate(percentage61);
    org.mafagafogigante.dungeon.game.Id id64 = new org.mafagafogigante.dungeon.game.Id("100");
    java.lang.String str65 = id64.toString();
    itemPreset47.setId(id64);
    explorationStatistics16.addVisit(point46, id64);
    org.mafagafogigante.dungeon.date.Date date74 = new org.mafagafogigante.dungeon.date.Date((long)' ', 10L, 60L, (long)(short)100, (long)17518, (long)10);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.items.Item item75 = itemFactory15.makeItem(id64, date74);
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
    org.junit.Assert.assertTrue("'" + direction27 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction27.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    org.junit.Assert.assertTrue("'" + direction32 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction32.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    org.junit.Assert.assertTrue("'" + direction33 + "' != '" + org.mafagafogigante.dungeon.game.Direction.WEST + "'", direction33.equals(org.mafagafogigante.dungeon.game.Direction.WEST));
    org.junit.Assert.assertTrue("'" + direction35 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction35.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "East"+ "'", str36.equals("East"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "East"+ "'", str37.equals("East"));
    org.junit.Assert.assertTrue("'" + direction41 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction41.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "East"+ "'", str42.equals("East"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "East"+ "'", str43.equals("East"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "100"+ "'", str65.equals("100"));

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test211"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature1 = null;
    org.mafagafogigante.dungeon.entity.creatures.CreatureHealth creatureHealth2 = org.mafagafogigante.dungeon.entity.creatures.CreatureHealth.makeCreatureHealth(100, creature1);
    boolean b3 = creatureHealth2.isAlive();
    java.lang.String str4 = creatureHealth2.toString();
    creatureHealth2.decrementBy((int)(byte)10);
    org.mafagafogigante.dungeon.entity.creatures.HealthState healthState7 = creatureHealth2.getHealthState();
    int i8 = creatureHealth2.getCurrent();
    boolean b9 = creatureHealth2.isFull();
    int i10 = creatureHealth2.getCurrent();
    
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
    org.junit.Assert.assertTrue(i10 == 90);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test212"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    creaturePreset0.setAttack(57);
    int i5 = creaturePreset0.getAttack();
    int i6 = creaturePreset0.getInventoryItemLimit();
    org.mafagafogigante.dungeon.game.Id id7 = creaturePreset0.getId();
    int i8 = creaturePreset0.getHealth();
    creaturePreset0.setInventoryItemLimit(45056);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test213"); }

    org.mafagafogigante.dungeon.entity.items.LocationInventory locationInventory0 = new org.mafagafogigante.dungeon.entity.items.LocationInventory();
    org.mafagafogigante.dungeon.entity.items.Item item1 = null;
    boolean b2 = locationInventory0.hasItem(item1);
    int i3 = locationInventory0.getItemCount();
    locationInventory0.refreshItems();
    int i5 = locationInventory0.getItemCount();
    int i6 = locationInventory0.getItemCount();
    locationInventory0.refreshItems();
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item8 = locationInventory0.getItems();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item8);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test214"); }

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
    java.lang.String str26 = percentage22.toString();
    org.mafagafogigante.dungeon.entity.Weight weight29 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)'#');
    org.mafagafogigante.dungeon.entity.Weight weight31 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)'#');
    org.mafagafogigante.dungeon.entity.Weight weight32 = weight29.add(weight31);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset33 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity34 = itemPreset33.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity35 = null;
    itemPreset33.setIntegrity(integrity35);
    org.mafagafogigante.dungeon.util.Percentage percentage37 = itemPreset33.getVisibility();
    java.lang.String str38 = itemPreset33.getType();
    itemPreset33.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage42 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset33.setVisibility(percentage42);
    org.mafagafogigante.dungeon.util.Percentage percentage45 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    int i46 = percentage42.compareTo(percentage45);
    org.mafagafogigante.dungeon.entity.Weight weight47 = weight32.multiply(percentage42);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset48 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity49 = itemPreset48.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity50 = null;
    itemPreset48.setIntegrity(integrity50);
    org.mafagafogigante.dungeon.util.Percentage percentage52 = itemPreset48.getVisibility();
    org.mafagafogigante.dungeon.entity.Integrity integrity53 = itemPreset48.getIntegrity();
    java.lang.String str54 = itemPreset48.getText();
    org.mafagafogigante.dungeon.game.Name name55 = null;
    itemPreset48.setName(name55);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset57 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity58 = itemPreset57.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity59 = null;
    itemPreset57.setIntegrity(integrity59);
    org.mafagafogigante.dungeon.util.Percentage percentage61 = itemPreset57.getVisibility();
    java.lang.String str62 = itemPreset57.getType();
    itemPreset57.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage66 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset57.setVisibility(percentage66);
    boolean b68 = org.mafagafogigante.dungeon.game.Random.roll(percentage66);
    itemPreset48.setVisibility(percentage66);
    boolean b70 = percentage42.biggerThanOrEqualTo(percentage66);
    org.mafagafogigante.dungeon.entity.items.WeaponComponent weaponComponent72 = new org.mafagafogigante.dungeon.entity.items.WeaponComponent((int)(byte)1, percentage42, 43200);
    boolean b73 = percentage22.biggerThanOrEqualTo(percentage42);
    
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
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "100.00%"+ "'", str26.equals("100.00%"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test215"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    creaturePreset0.setAttack(57);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity5 = creaturePreset0.getLuminosity();
    creaturePreset0.setInventoryItemLimit(57);
    org.mafagafogigante.dungeon.entity.creatures.Drop[] drop_array8 = new org.mafagafogigante.dungeon.entity.creatures.Drop[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop> arraylist_drop9 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop9, drop_array8);
    creaturePreset0.setDropList((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop9);
    creaturePreset0.setInventoryWeightLimit((double)(byte)0);
    org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId attackAlgorithmId14 = creaturePreset0.getAttackAlgorithmId();
    org.mafagafogigante.dungeon.entity.TagSet<org.mafagafogigante.dungeon.entity.creatures.Creature.Tag> tagset_tag15 = null;
    creaturePreset0.setTagSet(tagset_tag15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(drop_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(attackAlgorithmId14);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test216"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    boolean b3 = integrity2.isMaximum();
    org.mafagafogigante.dungeon.entity.items.Item item4 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity5 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity2, item4);
    int i6 = integrity2.getCurrent();
    org.mafagafogigante.dungeon.entity.Integrity integrity7 = new org.mafagafogigante.dungeon.entity.Integrity(integrity2);
    integrity2.decrementBy(38);
    int i10 = integrity2.getCurrent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemIntegrity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test217"); }

    org.mafagafogigante.dungeon.game.DungeonString dungeonString1 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString1.append(str_array6);
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications8 = null;
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)dungeonString1, writingSpecifications8);
    java.awt.Color color10 = null;
    dungeonString1.setColor(color10);
    dungeonString1.resetColor();
    dungeonString1.resetColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test218"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity2 = itemPreset0.getLuminosity();
    org.mafagafogigante.dungeon.util.Percentage percentage4 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset0.setVisibility(percentage4);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity6 = itemPreset0.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name7 = itemPreset0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(name7);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test219"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    java.lang.String str4 = date3.toDateString();
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
    int i39 = org.mafagafogigante.dungeon.game.PartOfDay.getSecondsToNext(date3, partOfDay38);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity40 = partOfDay38.getLuminosity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "day 10 of month 10 of the year 10"+ "'", str4.equals("day 10 of month 10 of the year 10"));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 82800);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity40);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test220"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    creaturePreset0.setAttack((int)(short)100);
    org.mafagafogigante.dungeon.game.Id id5 = creaturePreset0.getWeaponId();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity6 = creaturePreset0.getLuminosity();
    org.mafagafogigante.dungeon.util.Percentage percentage7 = creaturePreset0.getVisibility();
    creaturePreset0.setType("3.5 KiB");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage7);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test221"); }

    org.mafagafogigante.dungeon.entity.items.Item[] item_array0 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item1 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item1, item_array0);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString4 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString4.append(str_array9);
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item11 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item1, str_array9);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString13 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString13.append(str_array18);
    java.lang.String str20 = dungeonString13.toString();
    org.mafagafogigante.dungeon.game.Point point24 = new org.mafagafogigante.dungeon.game.Point(10, (int)'a', 0);
    java.lang.String[] str_array27 = new java.lang.String[] { "", "" };
    org.mafagafogigante.dungeon.util.Table table28 = new org.mafagafogigante.dungeon.util.Table(str_array27);
    boolean b29 = point24.equals((java.lang.Object)str_array27);
    dungeonString13.append(str_array27);
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item31 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems(list_item11, str_array27);
    java.lang.String[] str_array34 = new java.lang.String[] { "", "" };
    org.mafagafogigante.dungeon.util.Table table35 = new org.mafagafogigante.dungeon.util.Table(str_array34);
    org.mafagafogigante.dungeon.wiki.WikiSearcher.search(str_array34);
    org.mafagafogigante.dungeon.wiki.WikiSearcher.search(str_array34);
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item38 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems(list_item31, str_array34);
    java.lang.String[] str_array41 = new java.lang.String[] { "", "" };
    org.mafagafogigante.dungeon.util.Table table42 = new org.mafagafogigante.dungeon.util.Table(str_array41);
    org.mafagafogigante.dungeon.util.Table table43 = new org.mafagafogigante.dungeon.util.Table(str_array41);
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item44 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems(list_item31, str_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"+ "'", str20.equals("DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item44);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test222"); }

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
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset30 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.util.Percentage percentage31 = itemPreset30.getHitRate();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset35 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    itemPreset35.setDrinkableHealing((int)(short)0);
    org.mafagafogigante.dungeon.util.Percentage percentage39 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset35.setVisibility(percentage39);
    double d41 = org.mafagafogigante.dungeon.util.DungeonMath.weightedAverage((double)10.0f, 100.0d, percentage39);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset42 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity43 = itemPreset42.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity44 = null;
    itemPreset42.setIntegrity(integrity44);
    org.mafagafogigante.dungeon.util.Percentage percentage46 = itemPreset42.getVisibility();
    java.lang.String str47 = itemPreset42.getType();
    org.mafagafogigante.dungeon.entity.items.Item.Tag tag48 = org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE;
    itemPreset42.addTag(tag48);
    org.mafagafogigante.dungeon.util.Percentage percentage51 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b53 = percentage51.equals((java.lang.Object)10.0d);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity54 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage51);
    itemPreset42.setVisibility(percentage51);
    boolean b56 = percentage39.biggerThanOrEqualTo(percentage51);
    org.mafagafogigante.dungeon.entity.items.WeaponComponent weaponComponent58 = new org.mafagafogigante.dungeon.entity.items.WeaponComponent((int)(short)10, percentage51, 1);
    itemPreset30.setVisibility(percentage51);
    boolean b60 = point26.equals((java.lang.Object)percentage51);
    int i61 = point26.getX();
    int i62 = point26.getZ();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d41 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str47);
    org.junit.Assert.assertTrue("'" + tag48 + "' != '" + org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE + "'", tag48.equals(org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == (-1));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test223"); }

    org.mafagafogigante.dungeon.date.Date date6 = new org.mafagafogigante.dungeon.date.Date((long)(byte)0, (long)0, (long)81, (long)10, 100L, (long)(short)1);
    java.lang.String str7 = date6.toDateString();
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit9 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR;
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit10 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.MINUTE;
    long long11 = dungeonTimeUnit9.as(dungeonTimeUnit10);
    org.mafagafogigante.dungeon.date.Date date12 = date6.minus(90, dungeonTimeUnit10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "day 10 of month 1 of the year 1"+ "'", str7.equals("day 10 of month 1 of the year 1"));
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit9 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR + "'", dungeonTimeUnit9.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR));
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit10 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.MINUTE + "'", dungeonTimeUnit10.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.MINUTE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 60L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date12);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test224"); }

    org.mafagafogigante.dungeon.entity.creatures.HealthState healthState0 = org.mafagafogigante.dungeon.entity.creatures.HealthState.UNINJURED;
    java.lang.String str1 = healthState0.toString();
    java.lang.String str2 = healthState0.toString();
    org.junit.Assert.assertTrue("'" + healthState0 + "' != '" + org.mafagafogigante.dungeon.entity.creatures.HealthState.UNINJURED + "'", healthState0.equals(org.mafagafogigante.dungeon.entity.creatures.HealthState.UNINJURED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Uninjured"+ "'", str1.equals("Uninjured"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Uninjured"+ "'", str2.equals("Uninjured"));

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test225"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date7 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i8 = date3.compareTo(date7);
    long long9 = date7.getDay();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay10 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    int i11 = org.mafagafogigante.dungeon.game.PartOfDay.getSecondsToNext(date7, partOfDay10);
    long long12 = date7.getYear();
    long long13 = date7.getDay();
    org.mafagafogigante.dungeon.date.Date date21 = new org.mafagafogigante.dungeon.date.Date((long)' ', 10L, 60L, (long)(short)100, (long)17518, (long)10);
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit23 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR;
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit24 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.MINUTE;
    long long25 = dungeonTimeUnit23.as(dungeonTimeUnit24);
    org.mafagafogigante.dungeon.date.Date date26 = date21.plus(152, dungeonTimeUnit23);
    org.mafagafogigante.dungeon.util.CounterMap<java.util.RandomAccess> countermap_randomAccess27 = new org.mafagafogigante.dungeon.util.CounterMap<java.util.RandomAccess>();
    java.lang.String[] str_array31 = new java.lang.String[] { "Damaged", "visibilityCriteria=VisibilityCriteria{[]}", "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str32 = new java.util.ArrayList<java.lang.String>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str32, str_array31);
    org.mafagafogigante.dungeon.io.Split split34 = org.mafagafogigante.dungeon.io.Split.splitOnOn((java.util.List<java.lang.String>)arraylist_str32);
    org.mafagafogigante.dungeon.io.Split split35 = org.mafagafogigante.dungeon.io.Split.splitOnOn((java.util.List<java.lang.String>)arraylist_str32);
    countermap_randomAccess27.incrementCounter((java.util.RandomAccess)arraylist_str32, (java.lang.Integer)3600);
    java.util.Spliterator<java.util.RandomAccess> spliterator_randomAccess38 = countermap_randomAccess27.spliterator();
    boolean b39 = date21.equals((java.lang.Object)spliterator_randomAccess38);
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit41 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR;
    org.mafagafogigante.dungeon.date.Date date42 = date21.plus(85, dungeonTimeUnit41);
    org.mafagafogigante.dungeon.date.Date date43 = date7.minus(10907, dungeonTimeUnit41);
    
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
    org.junit.Assert.assertTrue(long13 == 10L);
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit23 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR + "'", dungeonTimeUnit23.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR));
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit24 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.MINUTE + "'", dungeonTimeUnit24.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.MINUTE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long25 == 60L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(split34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(split35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_randomAccess38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit41 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR + "'", dungeonTimeUnit41.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date43);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test226"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    java.lang.String str5 = itemPreset0.getType();
    itemPreset0.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.entity.TagSet<org.mafagafogigante.dungeon.entity.items.Item.Tag> tagset_tag8 = itemPreset0.getTagSet();
    org.mafagafogigante.dungeon.game.Id id9 = null;
    itemPreset0.setId(id9);
    long long11 = itemPreset0.getPutrefactionPeriod();
    org.mafagafogigante.dungeon.game.Name name12 = itemPreset0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tagset_tag8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(name12);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test227"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date7 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i8 = date3.compareTo(date7);
    long long9 = date7.getDay();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay10 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    int i11 = org.mafagafogigante.dungeon.game.PartOfDay.getSecondsToNext(date7, partOfDay10);
    long long12 = date7.getYear();
    long long13 = date7.getDay();
    org.mafagafogigante.dungeon.date.Date date17 = new org.mafagafogigante.dungeon.date.Date((long)97, (long)(byte)-1, (long)'#');
    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics18 = new org.mafagafogigante.dungeon.stats.BattleStatistics();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement19 = null;
    boolean b20 = battleStatistics18.satisfies(battleStatisticsRequirement19);
    java.lang.String str21 = battleStatistics18.toString();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery22 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement24 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement(battleStatisticsQuery22, (int)(byte)100);
    boolean b25 = battleStatistics18.satisfies(battleStatisticsRequirement24);
    org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.CauseOfDeath> countermap_causeOfDeath26 = battleStatistics18.getKillsByCauseOfDeath();
    org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.CauseOfDeath> countermap_causeOfDeath27 = battleStatistics18.getKillsByCauseOfDeath();
    boolean b28 = date17.equals((java.lang.Object)countermap_causeOfDeath27);
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit30 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.YEAR;
    org.mafagafogigante.dungeon.date.Date date31 = date17.plus(45056, dungeonTimeUnit30);
    org.mafagafogigante.dungeon.date.Duration duration32 = new org.mafagafogigante.dungeon.date.Duration(date7, date31);
    org.mafagafogigante.dungeon.world.Weather weather33 = new org.mafagafogigante.dungeon.world.Weather(date7);
    
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
    org.junit.Assert.assertTrue(long13 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "BattleStatistics{records=CounterMap{map={}}}"+ "'", str21.equals("BattleStatistics{records=CounterMap{map={}}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_causeOfDeath26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_causeOfDeath27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit30 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.YEAR + "'", dungeonTimeUnit30.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.YEAR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date31);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test228"); }

    org.mafagafogigante.dungeon.game.DungeonString dungeonString1 = new org.mafagafogigante.dungeon.game.DungeonString("Disabled LightSource of luminosity of null");
    org.mafagafogigante.dungeon.io.Writer.writeAndWait((org.mafagafogigante.dungeon.game.Writable)dungeonString1);
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)dungeonString1);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString5 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString5.append(str_array10);
    java.lang.String str12 = dungeonString5.toString();
    org.mafagafogigante.dungeon.game.Point point16 = new org.mafagafogigante.dungeon.game.Point(10, (int)'a', 0);
    java.lang.String[] str_array19 = new java.lang.String[] { "", "" };
    org.mafagafogigante.dungeon.util.Table table20 = new org.mafagafogigante.dungeon.util.Table(str_array19);
    boolean b21 = point16.equals((java.lang.Object)str_array19);
    dungeonString5.append(str_array19);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array23 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item24 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item24, item_array23);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString27 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array32 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString27.append(str_array32);
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item34 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item24, str_array32);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString36 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array41 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString36.append(str_array41);
    java.lang.String[] str_array48 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table49 = new org.mafagafogigante.dungeon.util.Table(str_array48);
    dungeonString36.append(str_array48);
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item51 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems(list_item34, str_array48);
    dungeonString5.append(str_array48);
    org.mafagafogigante.dungeon.wiki.WikiSearcher.search(str_array48);
    dungeonString1.append(str_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"+ "'", str12.equals("DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item51);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test229"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule0 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeIdRule();
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule2 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeArraySizeRule((int)(short)0);
    java.util.Map<java.lang.String,org.mafagafogigante.dungeon.schema.JsonRule> map_str_jsonRule3 = null;
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule4 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeObjectRule(map_str_jsonRule3);
    org.mafagafogigante.dungeon.schema.JsonRule[] jsonRule_array5 = new org.mafagafogigante.dungeon.schema.JsonRule[] { jsonRule0, jsonRule2, jsonRule4 };
    java.util.ArrayList<org.mafagafogigante.dungeon.schema.JsonRule> arraylist_jsonRule6 = new java.util.ArrayList<org.mafagafogigante.dungeon.schema.JsonRule>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.schema.JsonRule>)arraylist_jsonRule6, jsonRule_array5);
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule8 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeFixedArrayRule((java.util.List<org.mafagafogigante.dungeon.schema.JsonRule>)arraylist_jsonRule6);
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule9 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeFixedArrayRule((java.util.List<org.mafagafogigante.dungeon.schema.JsonRule>)arraylist_jsonRule6);
    java.util.Spliterator<org.mafagafogigante.dungeon.schema.JsonRule> spliterator_jsonRule10 = arraylist_jsonRule6.spliterator();
    
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
    org.junit.Assert.assertNotNull(spliterator_jsonRule10);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test230"); }

    java.awt.Color color1 = null;
    org.mafagafogigante.dungeon.game.ColoredString coloredString2 = new org.mafagafogigante.dungeon.game.ColoredString("User: Nicholas\nTime: 15:42:10\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 19.7 MiB out of the allocated 123.0 MiB\nOS: Windows 10 (amd64) 10.0", color1);
    java.awt.Color color3 = coloredString2.getColor();
    java.lang.String str4 = coloredString2.toString();
    java.lang.String str5 = coloredString2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(color3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ColoredString{string='User: Nicholas\nTime: 15:42:10\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 19.7 MiB out of the allocated 123.0 MiB\nOS: Windows 10 (amd64) 10.0', color=null}"+ "'", str4.equals("ColoredString{string='User: Nicholas\nTime: 15:42:10\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 19.7 MiB out of the allocated 123.0 MiB\nOS: Windows 10 (amd64) 10.0', color=null}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ColoredString{string='User: Nicholas\nTime: 15:42:10\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 19.7 MiB out of the allocated 123.0 MiB\nOS: Windows 10 (amd64) 10.0', color=null}"+ "'", str5.equals("ColoredString{string='User: Nicholas\nTime: 15:42:10\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 19.7 MiB out of the allocated 123.0 MiB\nOS: Windows 10 (amd64) 10.0', color=null}"));

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test231"); }

    java.awt.Color color1 = null;
    org.mafagafogigante.dungeon.game.LocationDescription locationDescription2 = new org.mafagafogigante.dungeon.game.LocationDescription('4', color1);
    java.awt.Color color3 = locationDescription2.getColor();
    java.lang.String str4 = locationDescription2.toString();
    java.lang.String str5 = locationDescription2.toString();
    locationDescription2.setInfo("100");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(color3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "LocationDescription{symbol=4, color=null, info='You don't discover anything.'}"+ "'", str4.equals("LocationDescription{symbol=4, color=null, info='You don't discover anything.'}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "LocationDescription{symbol=4, color=null, info='You don't discover anything.'}"+ "'", str5.equals("LocationDescription{symbol=4, color=null, info='You don't discover anything.'}"));

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test232"); }

    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics0 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    int i2 = explorationStatistics0.getKillCount(id1);
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics3 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point4 = null;
    org.mafagafogigante.dungeon.game.Id id5 = null;
    explorationStatistics3.createEntryIfNotExists(point4, id5);
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics7 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point8 = null;
    org.mafagafogigante.dungeon.game.Id id9 = null;
    explorationStatistics7.createEntryIfNotExists(point8, id9);
    org.mafagafogigante.dungeon.game.Point point14 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id15 = null;
    explorationStatistics7.addVisit(point14, id15);
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics17 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point18 = null;
    org.mafagafogigante.dungeon.game.Id id19 = null;
    explorationStatistics17.createEntryIfNotExists(point18, id19);
    org.mafagafogigante.dungeon.game.Point point24 = new org.mafagafogigante.dungeon.game.Point((int)' ', (int)(byte)0, (int)(short)-1);
    org.mafagafogigante.dungeon.game.Id id25 = null;
    explorationStatistics17.addVisit(point24, id25);
    int i27 = point24.getZ();
    org.mafagafogigante.dungeon.game.Id id28 = null;
    explorationStatistics7.createEntryIfNotExists(point24, id28);
    org.mafagafogigante.dungeon.game.Id id30 = null;
    explorationStatistics3.addVisit(point24, id30);
    boolean b32 = explorationStatistics0.hasBeenSeen(point24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test233"); }

    org.mafagafogigante.dungeon.entity.items.FoodComponent foodComponent2 = new org.mafagafogigante.dungeon.entity.items.FoodComponent((int)(short)0, 0);
    int i3 = foodComponent2.getNutrition();
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
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test234"); }

    org.mafagafogigante.dungeon.entity.creatures.Hero hero0 = null;
    org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster heroSpellcaster1 = new org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster(hero0);
    java.util.List<org.mafagafogigante.dungeon.spells.Spell> list_spell2 = heroSpellcaster1.getSpellList();
    java.lang.String[] str_array3 = new java.lang.String[] {  };
    heroSpellcaster1.parseCast(str_array3);
    org.mafagafogigante.dungeon.spells.Spell spell5 = null;
    boolean b6 = heroSpellcaster1.knowsSpell(spell5);
    org.mafagafogigante.dungeon.spells.Spell spell7 = null;
    boolean b8 = heroSpellcaster1.knowsSpell(spell7);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString10 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array15 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString10.append(str_array15);
    java.lang.String[] str_array22 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table23 = new org.mafagafogigante.dungeon.util.Table(str_array22);
    dungeonString10.append(str_array22);
    heroSpellcaster1.parseCast(str_array22);
    java.util.List<org.mafagafogigante.dungeon.spells.Spell> list_spell26 = heroSpellcaster1.getSpellList();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_spell2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_spell26);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test235"); }

    org.mafagafogigante.dungeon.world.Sky sky0 = org.mafagafogigante.dungeon.world.SkyFactory.makeDarrowmereSky();
    java.lang.String str1 = sky0.toString();
    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array2 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria3 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array2);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature4 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer5 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature4);
    boolean b6 = visibilityCriteria3.isMetBy(observer5);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array7 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item8 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item8, item_array7);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString11 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array16 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString11.append(str_array16);
    observer5.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item8, dungeonString11);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature19 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory22 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature19, 0, (double)35);
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item23 = creatureInventory22.getItems();
    org.mafagafogigante.dungeon.game.DungeonString dungeonString25 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array30 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString25.append(str_array30);
    java.lang.String str32 = dungeonString25.toString();
    observer5.writeItemSight(list_item23, dungeonString25);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str34 = sky0.describeYourself(observer5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sky0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Sky{astronomicalBodies=[the Sun, a large, golden, spherical body, Mino, a small, dull white spherical body, Sario, a very small, green-tinted, perfectly spherical body]}"+ "'", str1.equals("Sky{astronomicalBodies=[the Sun, a large, golden, spherical body, Mino, a small, dull white spherical body, Sario, a very small, green-tinted, perfectly spherical body]}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(visibilityCriterion_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"+ "'", str32.equals("DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"));

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test236"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature1 = null;
    org.mafagafogigante.dungeon.entity.creatures.CreatureHealth creatureHealth2 = org.mafagafogigante.dungeon.entity.creatures.CreatureHealth.makeCreatureHealth(100, creature1);
    creatureHealth2.incrementBy(57);
    creatureHealth2.incrementBy(32);
    java.lang.String str7 = creatureHealth2.toString();
    org.mafagafogigante.dungeon.entity.creatures.HealthState healthState8 = creatureHealth2.getHealthState();
    int i9 = creatureHealth2.getCurrent();
    creatureHealth2.incrementBy((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creatureHealth2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "CreatureHealth{integrity=100/100}"+ "'", str7.equals("CreatureHealth{integrity=100/100}"));
    org.junit.Assert.assertTrue("'" + healthState8 + "' != '" + org.mafagafogigante.dungeon.entity.creatures.HealthState.UNINJURED + "'", healthState8.equals(org.mafagafogigante.dungeon.entity.creatures.HealthState.UNINJURED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test237"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, 0, (double)35);
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item4 = creatureInventory3.getItems();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset5 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity6 = itemPreset5.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity7 = null;
    itemPreset5.setIntegrity(integrity7);
    org.mafagafogigante.dungeon.util.Percentage percentage9 = itemPreset5.getVisibility();
    java.lang.String str10 = itemPreset5.getType();
    itemPreset5.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.entity.TagSet<org.mafagafogigante.dungeon.entity.items.Item.Tag> tagset_tag13 = itemPreset5.getTagSet();
    org.mafagafogigante.dungeon.entity.Entity[] entity_array14 = new org.mafagafogigante.dungeon.entity.Entity[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.Entity> arraylist_entity15 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.Entity>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.Entity>)arraylist_entity15, entity_array14);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity17 = org.mafagafogigante.dungeon.entity.Luminosity.resultantLuminosity((java.util.Collection<org.mafagafogigante.dungeon.entity.Entity>)arraylist_entity15);
    org.mafagafogigante.dungeon.util.Percentage percentage18 = luminosity17.toPercentage();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity19 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage18);
    itemPreset5.setVisibility(percentage18);
    org.mafagafogigante.dungeon.entity.creatures.Hero hero21 = null;
    org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster heroSpellcaster22 = new org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster(hero21);
    java.util.List<org.mafagafogigante.dungeon.spells.Spell> list_spell23 = heroSpellcaster22.getSpellList();
    boolean b24 = percentage18.equals((java.lang.Object)heroSpellcaster22);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array25 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item26 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item26, item_array25);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString29 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array34 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString29.append(str_array34);
    java.lang.String str36 = dungeonString29.toString();
    org.mafagafogigante.dungeon.game.Point point40 = new org.mafagafogigante.dungeon.game.Point(10, (int)'a', 0);
    java.lang.String[] str_array43 = new java.lang.String[] { "", "" };
    org.mafagafogigante.dungeon.util.Table table44 = new org.mafagafogigante.dungeon.util.Table(str_array43);
    boolean b45 = point40.equals((java.lang.Object)str_array43);
    dungeonString29.append(str_array43);
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item47 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item26, str_array43);
    org.mafagafogigante.dungeon.util.Table table48 = new org.mafagafogigante.dungeon.util.Table(str_array43);
    heroSpellcaster22.parseCast(str_array43);
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item50 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems(list_item4, str_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tagset_tag13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(entity_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_spell23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"+ "'", str36.equals("DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item50);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test238"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset4 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Weight weight5 = itemPreset4.getWeight();
    org.mafagafogigante.dungeon.entity.Weight weight7 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    org.mafagafogigante.dungeon.entity.Weight weight8 = org.mafagafogigante.dungeon.entity.Weight.ZERO;
    org.mafagafogigante.dungeon.entity.Weight weight9 = weight7.add(weight8);
    java.lang.String str10 = weight9.toString();
    itemPreset4.setWeight(weight9);
    itemPreset0.setWeight(weight9);
    org.mafagafogigante.dungeon.game.Name name13 = itemPreset0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weight5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0 kg"+ "'", str10.equals("0 kg"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(name13);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test239"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature1 = null;
    org.mafagafogigante.dungeon.entity.creatures.CreatureHealth creatureHealth2 = org.mafagafogigante.dungeon.entity.creatures.CreatureHealth.makeCreatureHealth(1, creature1);
    int i3 = creatureHealth2.getCurrent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creatureHealth2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test240"); }

    org.mafagafogigante.dungeon.game.MinimumBoundingRectangle minimumBoundingRectangle2 = new org.mafagafogigante.dungeon.game.MinimumBoundingRectangle(44105, 0);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test241"); }

    org.mafagafogigante.dungeon.entity.items.ItemUsageEffect itemUsageEffect1 = new org.mafagafogigante.dungeon.entity.items.ItemUsageEffect(22041);
    int i2 = itemUsageEffect1.getHealing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 22041);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test242"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity1 = itemPreset0.getLuminosity();
    org.mafagafogigante.dungeon.entity.Weight weight2 = itemPreset0.getWeight();
    org.mafagafogigante.dungeon.entity.Integrity integrity5 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    boolean b6 = integrity5.isMaximum();
    org.mafagafogigante.dungeon.entity.items.Item item7 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity8 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity5, item7);
    itemPreset0.setIntegrity(integrity5);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset12 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    itemPreset12.setDrinkableHealing((int)(short)0);
    org.mafagafogigante.dungeon.util.Percentage percentage16 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset12.setVisibility(percentage16);
    double d18 = org.mafagafogigante.dungeon.util.DungeonMath.weightedAverage((double)10.0f, 100.0d, percentage16);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset19 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity20 = itemPreset19.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity21 = null;
    itemPreset19.setIntegrity(integrity21);
    org.mafagafogigante.dungeon.util.Percentage percentage23 = itemPreset19.getVisibility();
    java.lang.String str24 = itemPreset19.getType();
    org.mafagafogigante.dungeon.entity.items.Item.Tag tag25 = org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE;
    itemPreset19.addTag(tag25);
    org.mafagafogigante.dungeon.util.Percentage percentage28 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b30 = percentage28.equals((java.lang.Object)10.0d);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity31 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage28);
    itemPreset19.setVisibility(percentage28);
    boolean b33 = percentage16.biggerThanOrEqualTo(percentage28);
    java.lang.String str34 = percentage28.toString();
    itemPreset0.setHitRate(percentage28);
    itemPreset0.setText("BattleEntry{id=null, type='East', causeOfDeath=Unarmed : UNARMED, partOfDay=Noon}");
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay38 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity39 = partOfDay38.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name40 = partOfDay38.getName();
    java.lang.String str42 = name40.getQuantifiedName((int)'a');
    java.lang.String str43 = name40.getSingular();
    java.lang.String str44 = name40.toString();
    java.lang.String str45 = name40.getSingular();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay47 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity48 = partOfDay47.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name49 = partOfDay47.getName();
    java.lang.String str51 = name49.getQuantifiedName((int)'a');
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay53 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity54 = partOfDay53.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name55 = partOfDay53.getName();
    org.mafagafogigante.dungeon.game.QuantificationMode quantificationMode57 = org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER;
    java.lang.String str58 = name55.getQuantifiedName((int)'4', quantificationMode57);
    java.lang.String str59 = name49.getQuantifiedName(97, quantificationMode57);
    java.lang.String str60 = name40.getQuantifiedName(35, quantificationMode57);
    itemPreset0.setName(name40);
    itemPreset0.setIntegrityDecrementPerDose(4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemIntegrity8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    org.junit.Assert.assertTrue("'" + tag25 + "' != '" + org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE + "'", tag25.equals(org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "100.00%"+ "'", str34.equals("100.00%"));
    org.junit.Assert.assertTrue("'" + partOfDay38 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay38.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "a few Nights"+ "'", str42.equals("a few Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "Night"+ "'", str43.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "Night"+ "'", str44.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "Night"+ "'", str45.equals("Night"));
    org.junit.Assert.assertTrue("'" + partOfDay47 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay47.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "a few Nights"+ "'", str51.equals("a few Nights"));
    org.junit.Assert.assertTrue("'" + partOfDay53 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay53.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name55);
    org.junit.Assert.assertTrue("'" + quantificationMode57 + "' != '" + org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER + "'", quantificationMode57.equals(org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "52 Nights"+ "'", str58.equals("52 Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "97 Nights"+ "'", str59.equals("97 Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "35 Nights"+ "'", str60.equals("35 Nights"));

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test243"); }

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
    org.mafagafogigante.dungeon.entity.Weight weight21 = itemPreset0.getWeight();
    itemPreset0.setType("DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=null}");
    
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
    org.junit.Assert.assertNotNull(weight21);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test244"); }

    org.mafagafogigante.dungeon.util.CircularList<org.mafagafogigante.dungeon.entity.creatures.Observer> circularlist_observer1 = new org.mafagafogigante.dungeon.util.CircularList<org.mafagafogigante.dungeon.entity.creatures.Observer>(35);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test245"); }

    org.mafagafogigante.dungeon.util.NonNegativeInteger nonNegativeInteger1 = new org.mafagafogigante.dungeon.util.NonNegativeInteger((java.lang.Integer)100);
    java.lang.String str2 = nonNegativeInteger1.toString();
    java.lang.String str3 = nonNegativeInteger1.toString();
    java.lang.Integer i4 = nonNegativeInteger1.toInteger();
    java.lang.String str5 = nonNegativeInteger1.toString();
    java.lang.String str6 = nonNegativeInteger1.toString();
    java.lang.String str7 = nonNegativeInteger1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100"+ "'", str2.equals("100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "100"+ "'", str3.equals("100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 100+ "'", i4.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100"+ "'", str5.equals("100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "100"+ "'", str6.equals("100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "100"+ "'", str7.equals("100"));

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test246"); }

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
    org.mafagafogigante.dungeon.util.Percentage percentage16 = new org.mafagafogigante.dungeon.util.Percentage((double)38);
    org.mafagafogigante.dungeon.util.Percentage percentage17 = percentage11.multiply(percentage16);
    double d18 = percentage16.toDouble();
    
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
    org.junit.Assert.assertNotNull(percentage17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 1.0d);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test247"); }

    java.awt.Color color1 = null;
    org.mafagafogigante.dungeon.game.LocationDescription locationDescription2 = new org.mafagafogigante.dungeon.game.LocationDescription('a', color1);
    java.awt.Color color3 = locationDescription2.getColor();
    locationDescription2.setInfo("BattleStatisticsQuery{id=null, type='null', causeOfDeath=null, partOfDay=null}");
    char char6 = locationDescription2.getSymbol();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(color3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char6 == 'a');

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test248"); }

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
    org.mafagafogigante.dungeon.util.Percentage percentage23 = luminosity20.toPercentage();
    
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
    org.junit.Assert.assertNotNull(percentage23);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test249"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    org.mafagafogigante.dungeon.game.Id id3 = creaturePreset0.getId();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity4 = creaturePreset0.getLuminosity();
    org.mafagafogigante.dungeon.entity.creatures.Drop[] drop_array5 = new org.mafagafogigante.dungeon.entity.creatures.Drop[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop> arraylist_drop6 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop6, drop_array5);
    creaturePreset0.setDropList((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop6);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay9 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity10 = partOfDay9.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name11 = partOfDay9.getName();
    java.lang.String str13 = name11.getQuantifiedName((int)'a');
    java.lang.String str14 = name11.getSingular();
    java.lang.String str15 = name11.toString();
    java.lang.String str16 = name11.getSingular();
    java.lang.String str17 = name11.getPlural();
    java.lang.String str18 = name11.getPlural();
    creaturePreset0.setName(name11);
    java.lang.String str20 = creaturePreset0.getType();
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics21 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point22 = null;
    org.mafagafogigante.dungeon.game.Id id23 = null;
    explorationStatistics21.createEntryIfNotExists(point22, id23);
    org.mafagafogigante.dungeon.game.Point point28 = new org.mafagafogigante.dungeon.game.Point(10, (int)'a', 0);
    java.lang.String[] str_array31 = new java.lang.String[] { "", "" };
    org.mafagafogigante.dungeon.util.Table table32 = new org.mafagafogigante.dungeon.util.Table(str_array31);
    boolean b33 = point28.equals((java.lang.Object)str_array31);
    org.mafagafogigante.dungeon.game.Id id34 = null;
    explorationStatistics21.addVisit(point28, id34);
    org.mafagafogigante.dungeon.game.Point point39 = new org.mafagafogigante.dungeon.game.Point(10, (int)'a', 0);
    int i40 = point39.getY();
    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset41 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id42 = null;
    creaturePreset41.setWeaponId(id42);
    creaturePreset41.setAttack(57);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity46 = creaturePreset41.getLuminosity();
    creaturePreset41.setInventoryItemLimit(57);
    org.mafagafogigante.dungeon.entity.creatures.Drop[] drop_array49 = new org.mafagafogigante.dungeon.entity.creatures.Drop[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop> arraylist_drop50 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop>();
    boolean b51 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop50, drop_array49);
    creaturePreset41.setDropList((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop50);
    creaturePreset41.setInventoryWeightLimit((double)(byte)0);
    org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId attackAlgorithmId55 = creaturePreset41.getAttackAlgorithmId();
    org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath typeOfCauseOfDeath56 = org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath.SPELL;
    java.lang.String str57 = typeOfCauseOfDeath56.toString();
    java.lang.String str58 = typeOfCauseOfDeath56.toString();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset59 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity60 = itemPreset59.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity61 = null;
    itemPreset59.setIntegrity(integrity61);
    org.mafagafogigante.dungeon.util.Percentage percentage63 = itemPreset59.getVisibility();
    org.mafagafogigante.dungeon.entity.Integrity integrity64 = itemPreset59.getIntegrity();
    java.lang.String str65 = itemPreset59.getText();
    org.mafagafogigante.dungeon.game.Name name66 = null;
    itemPreset59.setName(name66);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset68 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity69 = itemPreset68.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity70 = null;
    itemPreset68.setIntegrity(integrity70);
    org.mafagafogigante.dungeon.util.Percentage percentage72 = itemPreset68.getVisibility();
    java.lang.String str73 = itemPreset68.getType();
    itemPreset68.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage77 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset68.setVisibility(percentage77);
    boolean b79 = org.mafagafogigante.dungeon.game.Random.roll(percentage77);
    itemPreset59.setVisibility(percentage77);
    long long81 = itemPreset59.getPutrefactionPeriod();
    org.mafagafogigante.dungeon.game.Id id83 = new org.mafagafogigante.dungeon.game.Id("100");
    itemPreset59.setId(id83);
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath85 = new org.mafagafogigante.dungeon.stats.CauseOfDeath(typeOfCauseOfDeath56, id83);
    creaturePreset41.setId(id83);
    explorationStatistics21.addVisit(point39, id83);
    creaturePreset0.setId(id83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(drop_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    org.junit.Assert.assertTrue("'" + partOfDay9 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay9.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "a few Nights"+ "'", str13.equals("a few Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Night"+ "'", str14.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Night"+ "'", str15.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Night"+ "'", str16.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Nights"+ "'", str17.equals("Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Nights"+ "'", str18.equals("Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(drop_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(attackAlgorithmId55);
    org.junit.Assert.assertTrue("'" + typeOfCauseOfDeath56 + "' != '" + org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath.SPELL + "'", typeOfCauseOfDeath56.equals(org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath.SPELL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "Spell"+ "'", str57.equals("Spell"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "Spell"+ "'", str58.equals("Spell"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long81 == 0L);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test250"); }

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
    org.mafagafogigante.dungeon.entity.Weight weight18 = creaturePreset0.getWeight();
    
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
    org.junit.Assert.assertNull(weight18);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test251"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule1 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeStringLengthRule(22041);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule1);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test252"); }

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
    int i20 = itemPreset0.getDamage();
    
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
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test253"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table6 = new org.mafagafogigante.dungeon.util.Table(str_array5);
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications7 = null;
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)table6, writingSpecifications7);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString9 = table6.toColoredStringList();
    table6.insertSeparator();
    org.mafagafogigante.dungeon.entity.items.Item[] item_array11 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item12 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item12, item_array11);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString15 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array20 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString15.append(str_array20);
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item22 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item12, str_array20);
    // The following exception was thrown during execution in test generation
    try {
    table6.insertRow(str_array20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_item22);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test254"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date7 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i8 = date3.compareTo(date7);
    long long9 = date7.getDay();
    long long10 = date7.getHour();
    long long11 = date7.getYear();
    long long12 = date7.getHour();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test255"); }

    org.mafagafogigante.dungeon.commands.CommandHistory commandHistory0 = new org.mafagafogigante.dungeon.commands.CommandHistory();
    java.lang.String str2 = commandHistory0.getLastSimilarCommand("");
    java.lang.String str4 = commandHistory0.getLastSimilarCommand("Unarmed : UNARMED");
    org.mafagafogigante.dungeon.commands.IssuedCommand issuedCommand6 = new org.mafagafogigante.dungeon.commands.IssuedCommand("BattleStatistics{records=CounterMap{map={}}}");
    org.mafagafogigante.dungeon.commands.PreparedIssuedCommand preparedIssuedCommand7 = org.mafagafogigante.dungeon.commands.IssuedCommandProcessor.prepareIssuedCommand(issuedCommand6);
    org.mafagafogigante.dungeon.commands.PreparedIssuedCommand preparedIssuedCommand8 = org.mafagafogigante.dungeon.commands.IssuedCommandProcessor.prepareIssuedCommand(issuedCommand6);
    java.util.List<java.lang.String> list_str9 = issuedCommand6.getTokens();
    commandHistory0.addCommand(issuedCommand6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(preparedIssuedCommand7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(preparedIssuedCommand8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test256"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity((int)(byte)1, (int)(byte)0);
    boolean b3 = integrity2.isMaximum();
    org.mafagafogigante.dungeon.entity.items.Item item4 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity5 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity2, item4);
    itemIntegrity5.incrementBy((int)(byte)0);
    itemIntegrity5.incrementBy((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage10 = itemIntegrity5.toPercentage();
    boolean b11 = itemIntegrity5.isBroken();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemIntegrity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test257"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    creaturePreset0.setAttack(57);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity5 = creaturePreset0.getLuminosity();
    org.mafagafogigante.dungeon.entity.creatures.Creature.Tag tag6 = org.mafagafogigante.dungeon.entity.creatures.Creature.Tag.MILKABLE;
    boolean b7 = creaturePreset0.hasTag(tag6);
    org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId attackAlgorithmId8 = creaturePreset0.getAttackAlgorithmId();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset9 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity10 = itemPreset9.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity11 = null;
    itemPreset9.setIntegrity(integrity11);
    org.mafagafogigante.dungeon.util.Percentage percentage13 = itemPreset9.getVisibility();
    org.mafagafogigante.dungeon.entity.Integrity integrity14 = itemPreset9.getIntegrity();
    java.lang.String str15 = itemPreset9.getText();
    java.lang.String str16 = itemPreset9.getType();
    org.mafagafogigante.dungeon.entity.Integrity integrity19 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    boolean b20 = integrity19.isMaximum();
    integrity19.incrementBy((int)(short)0);
    org.mafagafogigante.dungeon.util.Percentage percentage23 = integrity19.toPercentage();
    itemPreset9.setHitRate(percentage23);
    org.mafagafogigante.dungeon.game.Id id26 = new org.mafagafogigante.dungeon.game.Id("100");
    java.lang.String str27 = id26.toString();
    itemPreset9.setId(id26);
    org.mafagafogigante.dungeon.entity.items.BookComponent bookComponent30 = new org.mafagafogigante.dungeon.entity.items.BookComponent(id26, "DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}");
    creaturePreset0.setId(id26);
    org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId attackAlgorithmId32 = null;
    creaturePreset0.setAttackAlgorithmId(attackAlgorithmId32);
    org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId attackAlgorithmId34 = creaturePreset0.getAttackAlgorithmId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity5);
    org.junit.Assert.assertTrue("'" + tag6 + "' != '" + org.mafagafogigante.dungeon.entity.creatures.Creature.Tag.MILKABLE + "'", tag6.equals(org.mafagafogigante.dungeon.entity.creatures.Creature.Tag.MILKABLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(attackAlgorithmId8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "100"+ "'", str27.equals("100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(attackAlgorithmId34);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test258"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    java.lang.String str3 = integrity2.toString();
    java.lang.String str4 = integrity2.toString();
    boolean b5 = integrity2.isMaximum();
    int i6 = integrity2.getMaximum();
    java.lang.String str7 = integrity2.toString();
    int i8 = integrity2.getCurrent();
    boolean b9 = integrity2.isZero();
    org.mafagafogigante.dungeon.entity.Integrity integrity10 = new org.mafagafogigante.dungeon.entity.Integrity(integrity2);
    org.mafagafogigante.dungeon.entity.items.Item item11 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity12 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity2, item11);
    integrity2.incrementBy(17518);
    
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
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemIntegrity12);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test259"); }

    org.mafagafogigante.dungeon.game.DungeonString dungeonString1 = new org.mafagafogigante.dungeon.game.DungeonString("");
    java.lang.String str2 = dungeonString1.toString();
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications5 = new org.mafagafogigante.dungeon.gui.WritingSpecifications(false, 57600);
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)dungeonString1, writingSpecifications5);
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)dungeonString1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "DungeonString{coloredStringList=[], currentColor=java.awt.Color[r=192,g=192,b=192]}"+ "'", str2.equals("DungeonString{coloredStringList=[], currentColor=java.awt.Color[r=192,g=192,b=192]}"));

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test260"); }

    org.mafagafogigante.dungeon.entity.Weight weight1 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset2 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity3 = itemPreset2.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity4 = null;
    itemPreset2.setIntegrity(integrity4);
    org.mafagafogigante.dungeon.util.Percentage percentage6 = itemPreset2.getVisibility();
    boolean b7 = itemPreset2.isUnique();
    org.mafagafogigante.dungeon.entity.Weight weight9 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    org.mafagafogigante.dungeon.entity.Weight weight10 = org.mafagafogigante.dungeon.entity.Weight.ZERO;
    org.mafagafogigante.dungeon.entity.Weight weight11 = weight9.add(weight10);
    java.lang.String str12 = weight11.toString();
    itemPreset2.setWeight(weight11);
    int i14 = weight1.compareTo(weight11);
    org.mafagafogigante.dungeon.entity.Weight weight16 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    int i17 = weight1.compareTo(weight16);
    org.mafagafogigante.dungeon.entity.Integrity integrity20 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    boolean b21 = integrity20.isMaximum();
    org.mafagafogigante.dungeon.entity.items.Item item22 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity23 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity20, item22);
    org.mafagafogigante.dungeon.util.Percentage percentage24 = itemIntegrity23.toPercentage();
    org.mafagafogigante.dungeon.entity.Weight weight25 = weight1.multiply(percentage24);
    org.mafagafogigante.dungeon.entity.Weight weight27 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    org.mafagafogigante.dungeon.entity.Weight weight28 = org.mafagafogigante.dungeon.entity.Weight.ZERO;
    org.mafagafogigante.dungeon.entity.Weight weight29 = weight27.add(weight28);
    java.lang.String str30 = weight29.toString();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset31 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity32 = itemPreset31.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity33 = null;
    itemPreset31.setIntegrity(integrity33);
    org.mafagafogigante.dungeon.util.Percentage percentage35 = itemPreset31.getVisibility();
    java.lang.String str36 = itemPreset31.getType();
    itemPreset31.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage40 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset31.setVisibility(percentage40);
    org.mafagafogigante.dungeon.util.Percentage percentage43 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    int i44 = percentage40.compareTo(percentage43);
    org.mafagafogigante.dungeon.entity.Weight weight45 = weight29.multiply(percentage40);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset46 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Weight weight47 = itemPreset46.getWeight();
    org.mafagafogigante.dungeon.entity.Weight weight49 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)(byte)-1);
    org.mafagafogigante.dungeon.entity.Weight weight50 = org.mafagafogigante.dungeon.entity.Weight.ZERO;
    org.mafagafogigante.dungeon.entity.Weight weight51 = weight49.add(weight50);
    java.lang.String str52 = weight51.toString();
    itemPreset46.setWeight(weight51);
    org.mafagafogigante.dungeon.entity.Weight weight54 = weight29.add(weight51);
    int i55 = weight1.compareTo(weight29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "0 kg"+ "'", str12.equals("0 kg"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemIntegrity23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "0 kg"+ "'", str30.equals("0 kg"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weight47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "0 kg"+ "'", str52.equals("0 kg"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test261"); }

    org.mafagafogigante.dungeon.game.Id id0 = null;
    org.mafagafogigante.dungeon.entity.items.BookComponent bookComponent2 = new org.mafagafogigante.dungeon.entity.items.BookComponent(id0, "Night");
    org.mafagafogigante.dungeon.game.Id id3 = bookComponent2.getSpellId();
    java.lang.String str4 = bookComponent2.getText();
    java.lang.String str5 = bookComponent2.toString();
    org.mafagafogigante.dungeon.game.Id id6 = bookComponent2.getSpellId();
    java.lang.String str7 = bookComponent2.getText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Night"+ "'", str4.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "This book teaches nothing. Text: Night"+ "'", str5.equals("This book teaches nothing. Text: Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Night"+ "'", str7.equals("Night"));

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test262"); }

    org.mafagafogigante.dungeon.util.Percentage percentage0 = null;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity1 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage0);
    org.mafagafogigante.dungeon.entity.LightSource lightSource2 = new org.mafagafogigante.dungeon.entity.LightSource(luminosity1);
    org.mafagafogigante.dungeon.entity.LightSource lightSource3 = new org.mafagafogigante.dungeon.entity.LightSource(luminosity1);
    org.mafagafogigante.dungeon.entity.LightSource lightSource4 = new org.mafagafogigante.dungeon.entity.LightSource(luminosity1);
    java.lang.String str5 = lightSource4.toString();
    java.lang.String str6 = lightSource4.toString();
    lightSource4.enable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Enabled LightSource of luminosity of null"+ "'", str5.equals("Enabled LightSource of luminosity of null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Enabled LightSource of luminosity of null"+ "'", str6.equals("Enabled LightSource of luminosity of null"));

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test263"); }

    org.mafagafogigante.dungeon.stats.Statistics statistics0 = new org.mafagafogigante.dungeon.stats.Statistics();
    statistics0.writeStatistics();
    statistics0.writeStatistics();
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker3 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics0);
    org.mafagafogigante.dungeon.stats.Statistics statistics4 = null;
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker5 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics4);
    int i6 = achievementTracker5.getUnlockedCount();
    java.util.Comparator<org.mafagafogigante.dungeon.achievements.UnlockedAchievement> comparator_unlockedAchievement7 = org.mafagafogigante.dungeon.achievements.comparators.UnlockedAchievementComparators.getDefaultComparator();
    java.util.List<org.mafagafogigante.dungeon.achievements.UnlockedAchievement> list_unlockedAchievement8 = achievementTracker5.getUnlockedAchievements(comparator_unlockedAchievement7);
    java.util.List<org.mafagafogigante.dungeon.achievements.UnlockedAchievement> list_unlockedAchievement9 = achievementTracker3.getUnlockedAchievements(comparator_unlockedAchievement7);
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.achievements.UnlockedAchievement unlockedAchievement10 = org.mafagafogigante.dungeon.game.Random.select(list_unlockedAchievement9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_unlockedAchievement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_unlockedAchievement8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_unlockedAchievement9);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test264"); }

    org.mafagafogigante.dungeon.entity.creatures.Hero hero0 = null;
    org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster heroSpellcaster1 = new org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster(hero0);
    org.mafagafogigante.dungeon.spells.Spell spell2 = null;
    boolean b3 = heroSpellcaster1.knowsSpell(spell2);
    org.mafagafogigante.dungeon.spells.Spell spell4 = null;
    // The following exception was thrown during execution in test generation
    try {
    heroSpellcaster1.learnSpell(spell4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test265"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.util.Percentage percentage2 = itemPreset0.getVisibility();
    java.lang.String str3 = itemPreset0.getType();
    org.mafagafogigante.dungeon.game.Id id4 = null;
    itemPreset0.setId(id4);
    itemPreset0.setIntegrityDecrementOnHit(1);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset8 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity9 = itemPreset8.getIntegrity();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset10 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity11 = itemPreset10.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity12 = null;
    itemPreset10.setIntegrity(integrity12);
    org.mafagafogigante.dungeon.util.Percentage percentage14 = itemPreset10.getVisibility();
    java.lang.String str15 = itemPreset10.getType();
    org.mafagafogigante.dungeon.entity.items.Item.Tag tag16 = org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE;
    itemPreset10.addTag(tag16);
    itemPreset8.addTag(tag16);
    itemPreset0.addTag(tag16);
    int i20 = itemPreset0.getDrinkableHealing();
    itemPreset0.setIntegrityDecrementOnHit((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    org.junit.Assert.assertTrue("'" + tag16 + "' != '" + org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE + "'", tag16.equals(org.mafagafogigante.dungeon.entity.items.Item.Tag.REPAIRABLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test266"); }

    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances0 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances1 = new org.mafagafogigante.dungeon.game.BlockedEntrances(blockedEntrances0);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances2 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.Direction direction3 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b5 = direction3.equalsIgnoreCase("");
    blockedEntrances2.block(direction3);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances7 = new org.mafagafogigante.dungeon.game.BlockedEntrances(blockedEntrances2);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances8 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.Direction direction9 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b10 = blockedEntrances8.isBlocked(direction9);
    boolean b12 = direction9.equalsIgnoreCase("");
    java.lang.String str13 = direction9.toString();
    blockedEntrances7.block(direction9);
    blockedEntrances0.block(direction9);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances16 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.Direction direction17 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b18 = blockedEntrances16.isBlocked(direction17);
    org.mafagafogigante.dungeon.game.Direction direction19 = org.mafagafogigante.dungeon.game.Direction.WEST;
    boolean b20 = blockedEntrances16.isBlocked(direction19);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances21 = new org.mafagafogigante.dungeon.game.BlockedEntrances(blockedEntrances16);
    org.mafagafogigante.dungeon.game.Point point25 = new org.mafagafogigante.dungeon.game.Point(100, 10, (int)(byte)10);
    java.lang.String str26 = point25.toString();
    org.mafagafogigante.dungeon.game.Direction direction27 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b29 = direction27.equalsIgnoreCase("Damaged");
    org.mafagafogigante.dungeon.game.Point point30 = new org.mafagafogigante.dungeon.game.Point(point25, direction27);
    boolean b31 = blockedEntrances21.isBlocked(direction27);
    blockedEntrances0.block(direction27);
    org.junit.Assert.assertTrue("'" + direction3 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction3.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    org.junit.Assert.assertTrue("'" + direction9 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction9.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "East"+ "'", str13.equals("East"));
    org.junit.Assert.assertTrue("'" + direction17 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction17.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    org.junit.Assert.assertTrue("'" + direction19 + "' != '" + org.mafagafogigante.dungeon.game.Direction.WEST + "'", direction19.equals(org.mafagafogigante.dungeon.game.Direction.WEST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{100, 10, 10}"+ "'", str26.equals("{100, 10, 10}"));
    org.junit.Assert.assertTrue("'" + direction27 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction27.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test267"); }

    org.mafagafogigante.dungeon.achievements.Achievement achievement0 = null;
    org.mafagafogigante.dungeon.date.Date date4 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date8 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i9 = date4.compareTo(date8);
    long long10 = date8.getDay();
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.achievements.UnlockedAchievement unlockedAchievement11 = new org.mafagafogigante.dungeon.achievements.UnlockedAchievement(achievement0, date8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 10L);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test268"); }

    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath0 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    org.mafagafogigante.dungeon.entity.creatures.HealthState healthState1 = org.mafagafogigante.dungeon.entity.creatures.HealthState.DEAD;
    boolean b2 = causeOfDeath0.equals((java.lang.Object)healthState1);
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table9 = new org.mafagafogigante.dungeon.util.Table(str_array8);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString10 = table9.toColoredStringList();
    boolean b11 = causeOfDeath0.equals((java.lang.Object)table9);
    org.mafagafogigante.dungeon.io.Writer.writeAndWait((org.mafagafogigante.dungeon.game.Writable)table9);
    table9.insertSeparator();
    
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

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test269"); }

    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics0 = new org.mafagafogigante.dungeon.stats.WorldStatistics();
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str1 = worldStatistics0.getSpawnCounter();
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str2 = worldStatistics0.getSpawnCounter();
    worldStatistics0.addSpawn("");
    int i5 = worldStatistics0.getSpawnCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test270"); }

    org.mafagafogigante.dungeon.util.NonNegativeInteger nonNegativeInteger1 = new org.mafagafogigante.dungeon.util.NonNegativeInteger((java.lang.Integer)32);
    java.lang.String str2 = nonNegativeInteger1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32"+ "'", str2.equals("32"));

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test271"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] creaturePresetFactory_array0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] {  };
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory1 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array0);
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory2 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array0);
    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset3 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id4 = null;
    creaturePreset3.setWeaponId(id4);
    creaturePreset3.setAttack(57);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity8 = creaturePreset3.getLuminosity();
    org.mafagafogigante.dungeon.entity.creatures.Creature.Tag tag9 = org.mafagafogigante.dungeon.entity.creatures.Creature.Tag.MILKABLE;
    boolean b10 = creaturePreset3.hasTag(tag9);
    org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId attackAlgorithmId11 = creaturePreset3.getAttackAlgorithmId();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset12 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity13 = itemPreset12.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity14 = null;
    itemPreset12.setIntegrity(integrity14);
    org.mafagafogigante.dungeon.util.Percentage percentage16 = itemPreset12.getVisibility();
    org.mafagafogigante.dungeon.entity.Integrity integrity17 = itemPreset12.getIntegrity();
    java.lang.String str18 = itemPreset12.getText();
    java.lang.String str19 = itemPreset12.getType();
    org.mafagafogigante.dungeon.entity.Integrity integrity22 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    boolean b23 = integrity22.isMaximum();
    integrity22.incrementBy((int)(short)0);
    org.mafagafogigante.dungeon.util.Percentage percentage26 = integrity22.toPercentage();
    itemPreset12.setHitRate(percentage26);
    org.mafagafogigante.dungeon.game.Id id29 = new org.mafagafogigante.dungeon.game.Id("100");
    java.lang.String str30 = id29.toString();
    itemPreset12.setId(id29);
    org.mafagafogigante.dungeon.entity.items.BookComponent bookComponent33 = new org.mafagafogigante.dungeon.entity.items.BookComponent(id29, "DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}");
    creaturePreset3.setId(id29);
    org.mafagafogigante.dungeon.game.World world35 = null;
    org.mafagafogigante.dungeon.entity.creatures.Creature creature36 = creatureFactory2.makeCreature(id29, world35);
    org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory corpseItemPresetFactory37 = new org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory(creatureFactory2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creaturePresetFactory_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity8);
    org.junit.Assert.assertTrue("'" + tag9 + "' != '" + org.mafagafogigante.dungeon.entity.creatures.Creature.Tag.MILKABLE + "'", tag9.equals(org.mafagafogigante.dungeon.entity.creatures.Creature.Tag.MILKABLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(attackAlgorithmId11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "100"+ "'", str30.equals("100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(creature36);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test272"); }

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
    java.util.List<java.lang.String> list_str11 = issuedCommandEvaluation9.getSuggestions();
    java.lang.String str12 = issuedCommandEvaluation9.toString();
    java.util.List<java.lang.String> list_str13 = issuedCommandEvaluation9.getSuggestions();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(preparedIssuedCommand6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(issuedCommandEvaluation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(issuedCommandEvaluation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "IssuedCommandEvaluation{valid=false, suggestions=[achievements, destroy, tutorial]}"+ "'", str12.equals("IssuedCommandEvaluation{valid=false, suggestions=[achievements, destroy, tutorial]}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test273"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature1 = null;
    org.mafagafogigante.dungeon.entity.creatures.CreatureHealth creatureHealth2 = org.mafagafogigante.dungeon.entity.creatures.CreatureHealth.makeCreatureHealth(100, creature1);
    boolean b3 = creatureHealth2.isAlive();
    java.lang.String str4 = creatureHealth2.toString();
    creatureHealth2.decrementBy((int)(byte)10);
    org.mafagafogigante.dungeon.entity.creatures.HealthState healthState7 = creatureHealth2.getHealthState();
    int i8 = creatureHealth2.getCurrent();
    boolean b9 = creatureHealth2.isFull();
    boolean b10 = creatureHealth2.isDead();
    org.mafagafogigante.dungeon.util.Percentage percentage11 = creatureHealth2.toPercentage();
    
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
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage11);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test274"); }

    boolean b1 = org.mafagafogigante.dungeon.util.Percentage.isValidPercentageString("ColoredString{string='hi!|visibilityCriteria=VisibilityCriteria{[]} |visibilityCriteria=VisibilityCriteria{[]}|Damaged|hi!\n---|------------------------------------------|-----------------------------------------|-------|---\n', color=java.awt.Color[r=192,g=192,b=192]}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test275"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule2 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeBoundDoubleRule((double)152, 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule2);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test276"); }

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
    org.mafagafogigante.dungeon.game.Id id12 = itemPreset0.getSpellId();
    
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
    org.junit.Assert.assertNull(id12);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test277"); }

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
    double d13 = creaturePreset0.getInventoryWeightLimit();
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
    org.junit.Assert.assertTrue(d13 == 0.0d);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test278"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.game.Name name2 = itemPreset0.getName();
    java.lang.String str3 = itemPreset0.getText();
    boolean b4 = itemPreset0.isUnique();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(name2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test279"); }

    org.mafagafogigante.dungeon.game.DungeonString dungeonString1 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString1.append(str_array6);
    java.lang.String str8 = dungeonString1.toString();
    org.mafagafogigante.dungeon.game.Point point12 = new org.mafagafogigante.dungeon.game.Point(10, (int)'a', 0);
    java.lang.String[] str_array15 = new java.lang.String[] { "", "" };
    org.mafagafogigante.dungeon.util.Table table16 = new org.mafagafogigante.dungeon.util.Table(str_array15);
    boolean b17 = point12.equals((java.lang.Object)str_array15);
    dungeonString1.append(str_array15);
    java.lang.String str19 = dungeonString1.toString();
    java.lang.String str20 = dungeonString1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"+ "'", str8.equals("DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"+ "'", str19.equals("DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"+ "'", str20.equals("DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}"));

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test280"); }

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
    itemPreset0.setDamage((int)(byte)0);
    
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

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test281"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] creaturePresetFactory_array0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] {  };
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory1 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array0);
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory2 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array0);
    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset3 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id4 = null;
    creaturePreset3.setWeaponId(id4);
    creaturePreset3.setAttack(57);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity8 = creaturePreset3.getLuminosity();
    org.mafagafogigante.dungeon.entity.creatures.Creature.Tag tag9 = org.mafagafogigante.dungeon.entity.creatures.Creature.Tag.MILKABLE;
    boolean b10 = creaturePreset3.hasTag(tag9);
    org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId attackAlgorithmId11 = creaturePreset3.getAttackAlgorithmId();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset12 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity13 = itemPreset12.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity14 = null;
    itemPreset12.setIntegrity(integrity14);
    org.mafagafogigante.dungeon.util.Percentage percentage16 = itemPreset12.getVisibility();
    org.mafagafogigante.dungeon.entity.Integrity integrity17 = itemPreset12.getIntegrity();
    java.lang.String str18 = itemPreset12.getText();
    java.lang.String str19 = itemPreset12.getType();
    org.mafagafogigante.dungeon.entity.Integrity integrity22 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    boolean b23 = integrity22.isMaximum();
    integrity22.incrementBy((int)(short)0);
    org.mafagafogigante.dungeon.util.Percentage percentage26 = integrity22.toPercentage();
    itemPreset12.setHitRate(percentage26);
    org.mafagafogigante.dungeon.game.Id id29 = new org.mafagafogigante.dungeon.game.Id("100");
    java.lang.String str30 = id29.toString();
    itemPreset12.setId(id29);
    org.mafagafogigante.dungeon.entity.items.BookComponent bookComponent33 = new org.mafagafogigante.dungeon.entity.items.BookComponent(id29, "DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}");
    creaturePreset3.setId(id29);
    org.mafagafogigante.dungeon.game.World world35 = null;
    org.mafagafogigante.dungeon.entity.creatures.Creature creature36 = creatureFactory2.makeCreature(id29, world35);
    java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.CreaturePreset> collection_creaturePreset37 = creatureFactory2.getPresets();
    org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory corpseItemPresetFactory38 = new org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory(creatureFactory2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creaturePresetFactory_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity8);
    org.junit.Assert.assertTrue("'" + tag9 + "' != '" + org.mafagafogigante.dungeon.entity.creatures.Creature.Tag.MILKABLE + "'", tag9.equals(org.mafagafogigante.dungeon.entity.creatures.Creature.Tag.MILKABLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(attackAlgorithmId11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "100"+ "'", str30.equals("100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(creature36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_creaturePreset37);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test282"); }

    org.mafagafogigante.dungeon.game.Direction direction1 = org.mafagafogigante.dungeon.game.Direction.fromAbbreviation("West");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(direction1);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test283"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay1 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity2 = partOfDay1.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name3 = partOfDay1.getName();
    org.mafagafogigante.dungeon.game.QuantificationMode quantificationMode5 = org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER;
    java.lang.String str6 = name3.getQuantifiedName((int)'4', quantificationMode5);
    creaturePreset0.setName(name3);
    int i8 = creaturePreset0.getHealth();
    creaturePreset0.setInventoryWeightLimit((double)17518);
    java.util.List<org.mafagafogigante.dungeon.game.Id> list_id11 = creaturePreset0.getItems();
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
    org.junit.Assert.assertNull(list_id11);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test284"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity2 = null;
    itemPreset0.setIntegrity(integrity2);
    org.mafagafogigante.dungeon.util.Percentage percentage4 = itemPreset0.getVisibility();
    org.mafagafogigante.dungeon.entity.Integrity integrity5 = itemPreset0.getIntegrity();
    java.lang.String str6 = itemPreset0.getText();
    java.lang.String str7 = itemPreset0.getType();
    org.mafagafogigante.dungeon.entity.Integrity integrity10 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    boolean b11 = integrity10.isMaximum();
    integrity10.incrementBy((int)(short)0);
    org.mafagafogigante.dungeon.util.Percentage percentage14 = integrity10.toPercentage();
    itemPreset0.setHitRate(percentage14);
    itemPreset0.setDrinkableHealing((int)(short)-1);
    org.mafagafogigante.dungeon.entity.Weight weight19 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)'#');
    org.mafagafogigante.dungeon.entity.Weight weight21 = org.mafagafogigante.dungeon.entity.Weight.newInstance((double)'#');
    org.mafagafogigante.dungeon.entity.Weight weight22 = weight19.add(weight21);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset23 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity24 = itemPreset23.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity25 = null;
    itemPreset23.setIntegrity(integrity25);
    org.mafagafogigante.dungeon.util.Percentage percentage27 = itemPreset23.getVisibility();
    java.lang.String str28 = itemPreset23.getType();
    itemPreset23.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage32 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset23.setVisibility(percentage32);
    org.mafagafogigante.dungeon.util.Percentage percentage35 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    int i36 = percentage32.compareTo(percentage35);
    org.mafagafogigante.dungeon.entity.Weight weight37 = weight22.multiply(percentage32);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset38 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity39 = itemPreset38.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity40 = null;
    itemPreset38.setIntegrity(integrity40);
    org.mafagafogigante.dungeon.util.Percentage percentage42 = itemPreset38.getVisibility();
    org.mafagafogigante.dungeon.entity.Integrity integrity43 = itemPreset38.getIntegrity();
    java.lang.String str44 = itemPreset38.getText();
    org.mafagafogigante.dungeon.game.Name name45 = null;
    itemPreset38.setName(name45);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset47 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity48 = itemPreset47.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity49 = null;
    itemPreset47.setIntegrity(integrity49);
    org.mafagafogigante.dungeon.util.Percentage percentage51 = itemPreset47.getVisibility();
    java.lang.String str52 = itemPreset47.getType();
    itemPreset47.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage56 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset47.setVisibility(percentage56);
    boolean b58 = org.mafagafogigante.dungeon.game.Random.roll(percentage56);
    itemPreset38.setVisibility(percentage56);
    boolean b60 = percentage32.biggerThanOrEqualTo(percentage56);
    itemPreset0.setHitRate(percentage32);
    
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
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test285"); }

    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications2 = new org.mafagafogigante.dungeon.gui.WritingSpecifications(false, 90);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test286"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date((long)'a', (long)1, (long)81);
    org.mafagafogigante.dungeon.world.Weather weather4 = new org.mafagafogigante.dungeon.world.Weather(date3);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay5 = org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity6 = partOfDay5.getLuminosity();
    int i7 = org.mafagafogigante.dungeon.game.PartOfDay.getSecondsToNext(date3, partOfDay5);
    java.lang.String str8 = partOfDay5.toString();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity9 = partOfDay5.getLuminosity();
    java.lang.String str10 = luminosity9.toString();
    org.junit.Assert.assertTrue("'" + partOfDay5 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay5.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 82800);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Midnight"+ "'", str8.equals("Midnight"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Luminosity of 20.00%"+ "'", str10.equals("Luminosity of 20.00%"));

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test287"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, (int)(short)0, (double)10.0f);
    org.mafagafogigante.dungeon.entity.items.Item item4 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory.SimulationResult simulationResult5 = creatureInventory3.simulateItemAddition(item4);
    org.junit.Assert.assertTrue("'" + simulationResult5 + "' != '" + org.mafagafogigante.dungeon.entity.items.CreatureInventory.SimulationResult.AMOUNT_LIMIT + "'", simulationResult5.equals(org.mafagafogigante.dungeon.entity.items.CreatureInventory.SimulationResult.AMOUNT_LIMIT));

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test288"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] creaturePresetFactory_array0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] {  };
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory1 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array0);
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory2 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array0);
    org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory corpseItemPresetFactory3 = new org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory(creatureFactory2);
    java.util.Collection<org.mafagafogigante.dungeon.entity.items.ItemPreset> collection_itemPreset4 = corpseItemPresetFactory3.getItemPresets();
    java.util.Collection<org.mafagafogigante.dungeon.entity.items.ItemPreset> collection_itemPreset5 = corpseItemPresetFactory3.getItemPresets();
    java.util.Collection<org.mafagafogigante.dungeon.entity.items.ItemPreset> collection_itemPreset6 = corpseItemPresetFactory3.getItemPresets();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creaturePresetFactory_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_itemPreset4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_itemPreset5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_itemPreset6);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test289"); }

    org.mafagafogigante.dungeon.util.StopWatch stopWatch4 = new org.mafagafogigante.dungeon.util.StopWatch();
    org.mafagafogigante.dungeon.logging.DungeonLogger.logCommandRenderingReport("a few Nights", "ItemIntegrity{integrity=1/1, item=null}", stopWatch4);
    java.lang.String str6 = stopWatch4.toString();
    org.mafagafogigante.dungeon.logging.DungeonLogger.logCommandRenderingReport("hi!|visibilityCriteria=VisibilityCriteria{[]} |visibilityCriteria=VisibilityCriteria{[]}|Damaged|hi!\n---|------------------------------------------|-----------------------------------------|-------|---\n", "97 B", stopWatch4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0 ms"+ "'", str6.equals("0 ms"));

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test290"); }

    org.mafagafogigante.dungeon.entity.creatures.Hero hero0 = null;
    org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster heroSpellcaster1 = new org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster(hero0);
    java.util.List<org.mafagafogigante.dungeon.spells.Spell> list_spell2 = heroSpellcaster1.getSpellList();
    org.mafagafogigante.dungeon.spells.Spell spell3 = null;
    boolean b4 = heroSpellcaster1.knowsSpell(spell3);
    java.util.List<org.mafagafogigante.dungeon.spells.Spell> list_spell5 = heroSpellcaster1.getSpellList();
    org.mafagafogigante.dungeon.game.DungeonString dungeonString7 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array12 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString7.append(str_array12);
    org.mafagafogigante.dungeon.gui.WritingSpecifications writingSpecifications14 = null;
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)dungeonString7, writingSpecifications14);
    java.lang.String[] str_array20 = new java.lang.String[] { "User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 34.4 MiB out of the allocated 123.0 MiB\nOS: Windows 10 (amd64) 10.0", "97 B", "DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}", "Unarmed : UNARMED" };
    dungeonString7.append(str_array20);
    org.mafagafogigante.dungeon.entity.creatures.Hero hero22 = null;
    org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster heroSpellcaster23 = new org.mafagafogigante.dungeon.entity.creatures.HeroSpellcaster(hero22);
    java.util.List<org.mafagafogigante.dungeon.spells.Spell> list_spell24 = heroSpellcaster23.getSpellList();
    java.lang.String[] str_array30 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table31 = new org.mafagafogigante.dungeon.util.Table(str_array30);
    heroSpellcaster23.parseCast(str_array30);
    dungeonString7.append(str_array30);
    heroSpellcaster1.parseCast(str_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_spell2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_spell5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_spell24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array30);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test291"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature1 = null;
    org.mafagafogigante.dungeon.entity.creatures.CreatureHealth creatureHealth2 = org.mafagafogigante.dungeon.entity.creatures.CreatureHealth.makeCreatureHealth(100, creature1);
    creatureHealth2.incrementBy(57);
    creatureHealth2.incrementBy(32);
    // The following exception was thrown during execution in test generation
    try {
    creatureHealth2.decrementBy(45056);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creatureHealth2);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test292"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay3 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity4 = partOfDay3.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name5 = partOfDay3.getName();
    org.mafagafogigante.dungeon.game.QuantificationMode quantificationMode7 = org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER;
    java.lang.String str8 = name5.getQuantifiedName((int)'4', quantificationMode7);
    creaturePreset0.setName(name5);
    creaturePreset0.setAttack(97);
    org.mafagafogigante.dungeon.util.Percentage percentage12 = creaturePreset0.getVisibility();
    double d13 = creaturePreset0.getInventoryWeightLimit();
    int i14 = creaturePreset0.getInventoryItemLimit();
    org.junit.Assert.assertTrue("'" + partOfDay3 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay3.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name5);
    org.junit.Assert.assertTrue("'" + quantificationMode7 + "' != '" + org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER + "'", quantificationMode7.equals(org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "52 Nights"+ "'", str8.equals("52 Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test293"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, 32, (double)'4');
    org.mafagafogigante.dungeon.entity.Weight weight4 = creatureInventory3.getWeight();
    int i5 = creatureInventory3.getItemLimit();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 32);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test294"); }

    org.mafagafogigante.dungeon.game.Id id0 = null;
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery2 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath3 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    battleStatisticsQuery2.setCauseOfDeath(causeOfDeath3);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay5 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.stats.BattleRecord battleRecord6 = new org.mafagafogigante.dungeon.stats.BattleRecord(id0, "", causeOfDeath3, partOfDay5);
    java.lang.String str7 = battleRecord6.getType();
    org.mafagafogigante.dungeon.game.Id id8 = battleRecord6.getId();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath9 = battleRecord6.getCauseOfDeath();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay10 = battleRecord6.getPartOfDay();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath3);
    org.junit.Assert.assertTrue("'" + partOfDay5 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay5.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(causeOfDeath9);
    org.junit.Assert.assertTrue("'" + partOfDay10 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay10.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test295"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    creaturePreset0.setAttack(57);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity5 = creaturePreset0.getLuminosity();
    creaturePreset0.setInventoryItemLimit(57);
    org.mafagafogigante.dungeon.entity.creatures.Drop[] drop_array8 = new org.mafagafogigante.dungeon.entity.creatures.Drop[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop> arraylist_drop9 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop9, drop_array8);
    creaturePreset0.setDropList((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop9);
    creaturePreset0.setInventoryWeightLimit((double)(byte)0);
    org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId attackAlgorithmId14 = creaturePreset0.getAttackAlgorithmId();
    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset15 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id16 = null;
    creaturePreset15.setWeaponId(id16);
    creaturePreset15.setAttack(57);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity20 = creaturePreset15.getLuminosity();
    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset21 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id22 = null;
    creaturePreset21.setWeaponId(id22);
    creaturePreset21.setAttack(57);
    org.mafagafogigante.dungeon.game.Id[] id_array26 = new org.mafagafogigante.dungeon.game.Id[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.game.Id> arraylist_id27 = new java.util.ArrayList<org.mafagafogigante.dungeon.game.Id>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.game.Id>)arraylist_id27, id_array26);
    creaturePreset21.setItems((java.util.List<org.mafagafogigante.dungeon.game.Id>)arraylist_id27);
    creaturePreset15.setItems((java.util.List<org.mafagafogigante.dungeon.game.Id>)arraylist_id27);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay31 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity32 = partOfDay31.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name33 = partOfDay31.getName();
    java.lang.String str35 = name33.getQuantifiedName((int)'a');
    creaturePreset15.setName(name33);
    creaturePreset0.setName(name33);
    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset38 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id39 = null;
    creaturePreset38.setWeaponId(id39);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay41 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity42 = partOfDay41.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name43 = partOfDay41.getName();
    org.mafagafogigante.dungeon.game.QuantificationMode quantificationMode45 = org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER;
    java.lang.String str46 = name43.getQuantifiedName((int)'4', quantificationMode45);
    creaturePreset38.setName(name43);
    org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId attackAlgorithmId48 = org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId.DUMMY;
    creaturePreset38.setAttackAlgorithmId(attackAlgorithmId48);
    creaturePreset0.setAttackAlgorithmId(attackAlgorithmId48);
    org.mafagafogigante.dungeon.game.Name name51 = creaturePreset0.getName();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset53 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity54 = itemPreset53.getIntegrity();
    org.mafagafogigante.dungeon.util.Percentage percentage55 = itemPreset53.getVisibility();
    java.lang.String str56 = itemPreset53.getType();
    itemPreset53.setDrinkableHealing(10);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay59 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity60 = partOfDay59.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name61 = partOfDay59.getName();
    java.lang.String str63 = name61.getQuantifiedName((int)'a');
    java.lang.String str64 = name61.getSingular();
    java.lang.String str65 = name61.toString();
    java.lang.String str66 = name61.getSingular();
    itemPreset53.setName(name61);
    org.mafagafogigante.dungeon.game.QuantificationMode quantificationMode69 = org.mafagafogigante.dungeon.game.QuantificationMode.WORD;
    java.lang.String str70 = name61.getQuantifiedName(81, quantificationMode69);
    org.mafagafogigante.dungeon.game.QuantificationMode quantificationMode72 = org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER;
    java.lang.String str73 = name61.getQuantifiedName(32, quantificationMode72);
    java.lang.String str74 = name51.getQuantifiedName((int)(short)10, quantificationMode72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(drop_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(attackAlgorithmId14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(id_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    org.junit.Assert.assertTrue("'" + partOfDay31 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay31.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "a few Nights"+ "'", str35.equals("a few Nights"));
    org.junit.Assert.assertTrue("'" + partOfDay41 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay41.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name43);
    org.junit.Assert.assertTrue("'" + quantificationMode45 + "' != '" + org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER + "'", quantificationMode45.equals(org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "52 Nights"+ "'", str46.equals("52 Nights"));
    org.junit.Assert.assertTrue("'" + attackAlgorithmId48 + "' != '" + org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId.DUMMY + "'", attackAlgorithmId48.equals(org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId.DUMMY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str56);
    org.junit.Assert.assertTrue("'" + partOfDay59 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay59.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + "a few Nights"+ "'", str63.equals("a few Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str64 + "' != '" + "Night"+ "'", str64.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "Night"+ "'", str65.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "Night"+ "'", str66.equals("Night"));
    org.junit.Assert.assertTrue("'" + quantificationMode69 + "' != '" + org.mafagafogigante.dungeon.game.QuantificationMode.WORD + "'", quantificationMode69.equals(org.mafagafogigante.dungeon.game.QuantificationMode.WORD));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "a few Nights"+ "'", str70.equals("a few Nights"));
    org.junit.Assert.assertTrue("'" + quantificationMode72 + "' != '" + org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER + "'", quantificationMode72.equals(org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str73 + "' != '" + "32 Nights"+ "'", str73.equals("32 Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str74 + "' != '" + "10 Nights"+ "'", str74.equals("10 Nights"));

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test296"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, 0, (double)35);
    creatureInventory3.refreshItems();

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test297"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    org.mafagafogigante.dungeon.util.Percentage percentage2 = itemPreset0.getVisibility();
    java.lang.String str3 = itemPreset0.getType();
    itemPreset0.setDrinkableHealing(10);
    org.mafagafogigante.dungeon.game.Id id6 = itemPreset0.getId();
    long long7 = itemPreset0.getPutrefactionPeriod();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test298"); }

    org.mafagafogigante.dungeon.commands.CommandDescription commandDescription2 = new org.mafagafogigante.dungeon.commands.CommandDescription("", "day 10 of month 1 of the year 1");
    java.lang.String str3 = commandDescription2.getInfo();
    java.lang.String str4 = commandDescription2.getInfo();
    java.lang.String str5 = commandDescription2.getInfo();
    java.lang.String str6 = commandDescription2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "day 10 of month 1 of the year 1"+ "'", str3.equals("day 10 of month 1 of the year 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "day 10 of month 1 of the year 1"+ "'", str4.equals("day 10 of month 1 of the year 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "day 10 of month 1 of the year 1"+ "'", str5.equals("day 10 of month 1 of the year 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + " : day 10 of month 1 of the year 1"+ "'", str6.equals(" : day 10 of month 1 of the year 1"));

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test299"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    org.mafagafogigante.dungeon.game.Id id3 = creaturePreset0.getId();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity4 = creaturePreset0.getLuminosity();
    org.mafagafogigante.dungeon.entity.creatures.Drop[] drop_array5 = new org.mafagafogigante.dungeon.entity.creatures.Drop[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop> arraylist_drop6 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop6, drop_array5);
    creaturePreset0.setDropList((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop6);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay9 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity10 = partOfDay9.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name11 = partOfDay9.getName();
    java.lang.String str13 = name11.getQuantifiedName((int)'a');
    java.lang.String str14 = name11.getSingular();
    java.lang.String str15 = name11.toString();
    java.lang.String str16 = name11.getSingular();
    java.lang.String str17 = name11.getPlural();
    java.lang.String str18 = name11.getPlural();
    creaturePreset0.setName(name11);
    int i20 = creaturePreset0.getHealth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(id3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(drop_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    org.junit.Assert.assertTrue("'" + partOfDay9 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay9.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "a few Nights"+ "'", str13.equals("a few Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Night"+ "'", str14.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Night"+ "'", str15.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Night"+ "'", str16.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Nights"+ "'", str17.equals("Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Nights"+ "'", str18.equals("Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test300"); }

    org.mafagafogigante.dungeon.commands.CommandHistory commandHistory0 = new org.mafagafogigante.dungeon.commands.CommandHistory();
    org.mafagafogigante.dungeon.commands.CommandHistory.Cursor cursor1 = commandHistory0.getCursor();
    cursor1.moveToEnd();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cursor1);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test301"); }

    org.mafagafogigante.dungeon.game.DungeonString dungeonString1 = new org.mafagafogigante.dungeon.game.DungeonString("{10, 97, 0}");

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test302"); }

    org.mafagafogigante.dungeon.date.Date date4 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date8 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i9 = date4.compareTo(date8);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay10 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date4);
    java.lang.String[] str_array16 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table17 = new org.mafagafogigante.dungeon.util.Table(str_array16);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString18 = table17.toColoredStringList();
    org.mafagafogigante.dungeon.game.ColoredString coloredString19 = org.mafagafogigante.dungeon.game.Random.select(list_coloredString18);
    boolean b20 = date4.equals((java.lang.Object)coloredString19);
    java.awt.Color color21 = coloredString19.getColor();
    org.mafagafogigante.dungeon.game.ColoredString coloredString22 = new org.mafagafogigante.dungeon.game.ColoredString("User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 41.5 MiB out of the allocated 154.5 MiB\nOS: Windows 10 (amd64) 10.0", color21);
    java.awt.Color color23 = coloredString22.getColor();
    java.lang.String str24 = coloredString22.getString();
    
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
    org.junit.Assert.assertNotNull(color21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 41.5 MiB out of the allocated 154.5 MiB\nOS: Windows 10 (amd64) 10.0"+ "'", str24.equals("User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 41.5 MiB out of the allocated 154.5 MiB\nOS: Windows 10 (amd64) 10.0"));

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test303"); }

    org.mafagafogigante.dungeon.commands.CommandHistory commandHistory0 = new org.mafagafogigante.dungeon.commands.CommandHistory();
    java.lang.String str2 = commandHistory0.getLastSimilarCommand("East");
    org.mafagafogigante.dungeon.stats.Statistics statistics3 = new org.mafagafogigante.dungeon.stats.Statistics();
    statistics3.writeStatistics();
    statistics3.writeStatistics();
    statistics3.writeStatistics();
    org.mafagafogigante.dungeon.commands.IssuedCommand issuedCommand8 = new org.mafagafogigante.dungeon.commands.IssuedCommand("BattleStatistics{records=CounterMap{map={}}}");
    org.mafagafogigante.dungeon.commands.PreparedIssuedCommand preparedIssuedCommand9 = org.mafagafogigante.dungeon.commands.IssuedCommandProcessor.prepareIssuedCommand(issuedCommand8);
    statistics3.addCommand(issuedCommand8);
    org.mafagafogigante.dungeon.commands.IssuedCommandEvaluation issuedCommandEvaluation11 = org.mafagafogigante.dungeon.commands.IssuedCommandProcessor.evaluateIssuedCommand(issuedCommand8);
    org.mafagafogigante.dungeon.commands.PreparedIssuedCommand preparedIssuedCommand12 = org.mafagafogigante.dungeon.commands.IssuedCommandProcessor.prepareIssuedCommand(issuedCommand8);
    commandHistory0.addCommand(issuedCommand8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(preparedIssuedCommand9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(issuedCommandEvaluation11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(preparedIssuedCommand12);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test304"); }

    org.mafagafogigante.dungeon.commands.CommandDescription commandDescription2 = new org.mafagafogigante.dungeon.commands.CommandDescription("Spell : null", "ColoredString{string='', color=null}");

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test305"); }

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
    java.lang.String str88 = duration42.toString();
    long long89 = duration42.getSeconds();
    
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
    org.junit.Assert.assertTrue("'" + str88 + "' != '" + "Less than a day"+ "'", str88.equals("Less than a day"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long89 == 0L);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test306"); }

    org.mafagafogigante.dungeon.world.TimeVisibilityCriterion timeVisibilityCriterion2 = new org.mafagafogigante.dungeon.world.TimeVisibilityCriterion(85, 2);
    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array3 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria4 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array3);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature5 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer6 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature5);
    boolean b7 = visibilityCriteria4.isMetBy(observer6);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array8 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item9 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item9, item_array8);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString12 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    observer6.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item9, dungeonString12);
    org.mafagafogigante.dungeon.world.VisibilityCriterion[] visibilityCriterion_array14 = new org.mafagafogigante.dungeon.world.VisibilityCriterion[] {  };
    org.mafagafogigante.dungeon.world.VisibilityCriteria visibilityCriteria15 = new org.mafagafogigante.dungeon.world.VisibilityCriteria(visibilityCriterion_array14);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature16 = null;
    org.mafagafogigante.dungeon.entity.creatures.Observer observer17 = new org.mafagafogigante.dungeon.entity.creatures.Observer(creature16);
    boolean b18 = visibilityCriteria15.isMetBy(observer17);
    org.mafagafogigante.dungeon.entity.items.Item[] item_array19 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item20 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item20, item_array19);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString23 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    observer17.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item20, dungeonString23);
    org.mafagafogigante.dungeon.game.DungeonString dungeonString26 = new org.mafagafogigante.dungeon.game.DungeonString("");
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString27 = dungeonString26.toColoredStringList();
    observer6.writeItemSight((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item20, dungeonString26);
    // The following exception was thrown during execution in test generation
    try {
    boolean b29 = timeVisibilityCriterion2.isMetBy(observer6);
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
    org.junit.Assert.assertNotNull(visibilityCriterion_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString27);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test307"); }

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
    java.lang.String str12 = weight10.toString();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset13 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity14 = itemPreset13.getLuminosity();
    org.mafagafogigante.dungeon.entity.Integrity integrity17 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    java.lang.String str18 = integrity17.toString();
    itemPreset13.setIntegrity(integrity17);
    boolean b20 = weight10.equals((java.lang.Object)integrity17);
    
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "0 kg"+ "'", str12.equals("0 kg"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "0/1"+ "'", str18.equals("0/1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test308"); }

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
    boolean b11 = issuedCommandEvaluation9.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(preparedIssuedCommand6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(issuedCommandEvaluation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(issuedCommandEvaluation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "IssuedCommandEvaluation{valid=false, suggestions=[achievements, destroy, tutorial]}"+ "'", str10.equals("IssuedCommandEvaluation{valid=false, suggestions=[achievements, destroy, tutorial]}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test309"); }

    org.mafagafogigante.dungeon.stats.Statistics statistics0 = new org.mafagafogigante.dungeon.stats.Statistics();
    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics1 = statistics0.getBattleStatistics();
    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics2 = statistics0.getWorldStatistics();
    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics3 = statistics0.getWorldStatistics();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(battleStatistics1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(worldStatistics2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(worldStatistics3);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test310"); }

    org.mafagafogigante.dungeon.world.WeatherCondition weatherCondition0 = org.mafagafogigante.dungeon.world.WeatherCondition.CLEAR;
    org.mafagafogigante.dungeon.world.WeatherCondition weatherCondition1 = org.mafagafogigante.dungeon.world.WeatherCondition.CLEAR;
    org.mafagafogigante.dungeon.world.WeatherConditionVisibilityCriterion weatherConditionVisibilityCriterion2 = new org.mafagafogigante.dungeon.world.WeatherConditionVisibilityCriterion(weatherCondition0, weatherCondition1);
    java.lang.String str3 = weatherCondition0.toDescriptiveString();
    java.lang.String str4 = weatherCondition0.toDescriptiveString();
    org.junit.Assert.assertTrue("'" + weatherCondition0 + "' != '" + org.mafagafogigante.dungeon.world.WeatherCondition.CLEAR + "'", weatherCondition0.equals(org.mafagafogigante.dungeon.world.WeatherCondition.CLEAR));
    org.junit.Assert.assertTrue("'" + weatherCondition1 + "' != '" + org.mafagafogigante.dungeon.world.WeatherCondition.CLEAR + "'", weatherCondition1.equals(org.mafagafogigante.dungeon.world.WeatherCondition.CLEAR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "the sky is clear"+ "'", str3.equals("the sky is clear"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "the sky is clear"+ "'", str4.equals("the sky is clear"));

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test311"); }

    org.mafagafogigante.dungeon.entity.items.FoodComponent foodComponent2 = new org.mafagafogigante.dungeon.entity.items.FoodComponent((int)'#', 17518);
    int i3 = foodComponent2.getIntegrityDecrementOnEat();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 17518);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test312"); }

    org.mafagafogigante.dungeon.game.Id id0 = null;
    org.mafagafogigante.dungeon.entity.items.BookComponent bookComponent2 = new org.mafagafogigante.dungeon.entity.items.BookComponent(id0, " : day 10 of month 1 of the year 1");
    java.lang.String str3 = bookComponent2.getText();
    java.lang.String str4 = bookComponent2.getText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " : day 10 of month 1 of the year 1"+ "'", str3.equals(" : day 10 of month 1 of the year 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " : day 10 of month 1 of the year 1"+ "'", str4.equals(" : day 10 of month 1 of the year 1"));

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test313"); }

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
    org.mafagafogigante.dungeon.entity.Weight weight19 = itemPreset0.getWeight();
    
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
    org.junit.Assert.assertNull(weight19);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test314"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date7 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i8 = date3.compareTo(date7);
    long long9 = date3.getYear();
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics10 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Id id11 = null;
    int i12 = explorationStatistics10.getMaximumNumberOfVisits(id11);
    org.mafagafogigante.dungeon.game.Id id13 = null;
    int i14 = explorationStatistics10.getVisitedLocations(id13);
    boolean b15 = date3.equals((java.lang.Object)id13);
    java.lang.String str16 = date3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "10-10-10 00:00:00"+ "'", str16.equals("10-10-10 00:00:00"));

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test315"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    itemPreset0.setIntegrityDecrementPerDose(46800);
    itemPreset0.setPutrefactionPeriod((long)(byte)10);
    org.mafagafogigante.dungeon.util.Percentage percentage7 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    java.lang.String str8 = percentage7.toString();
    org.mafagafogigante.dungeon.util.Percentage percentage10 = new org.mafagafogigante.dungeon.util.Percentage((double)100);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset11 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity12 = itemPreset11.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity13 = null;
    itemPreset11.setIntegrity(integrity13);
    org.mafagafogigante.dungeon.util.Percentage percentage15 = itemPreset11.getVisibility();
    java.lang.String str16 = itemPreset11.getType();
    itemPreset11.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage20 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset11.setVisibility(percentage20);
    boolean b22 = org.mafagafogigante.dungeon.game.Random.roll(percentage20);
    int i23 = percentage10.compareTo(percentage20);
    java.lang.String str24 = percentage20.toString();
    org.mafagafogigante.dungeon.util.Percentage percentage25 = percentage7.multiply(percentage20);
    itemPreset0.setHitRate(percentage20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "100.00%"+ "'", str8.equals("100.00%"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "100.00%"+ "'", str24.equals("100.00%"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage25);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test316"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table6 = new org.mafagafogigante.dungeon.util.Table(str_array5);
    org.mafagafogigante.dungeon.io.Writer.writeAndWait((org.mafagafogigante.dungeon.game.Writable)table6);
    table6.insertSeparator();
    table6.insertSeparator();
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString10 = table6.toColoredStringList();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_coloredString10);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test317"); }

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
    int i61 = dungeonString50.getLength();
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)dungeonString50);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 113);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test318"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] creaturePresetFactory_array0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePresetFactory[] {  };
    org.mafagafogigante.dungeon.entity.creatures.CreatureFactory creatureFactory1 = new org.mafagafogigante.dungeon.entity.creatures.CreatureFactory(creaturePresetFactory_array0);
    java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.CreaturePreset> collection_creaturePreset2 = creatureFactory1.getPresets();
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics3 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point4 = null;
    org.mafagafogigante.dungeon.game.Id id5 = null;
    explorationStatistics3.createEntryIfNotExists(point4, id5);
    org.mafagafogigante.dungeon.game.Point point10 = new org.mafagafogigante.dungeon.game.Point(100, 10, (int)(byte)10);
    org.mafagafogigante.dungeon.game.Id id11 = null;
    explorationStatistics3.addVisit(point10, id11);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances13 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.Direction direction14 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b16 = direction14.equalsIgnoreCase("");
    blockedEntrances13.block(direction14);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances18 = new org.mafagafogigante.dungeon.game.BlockedEntrances(blockedEntrances13);
    org.mafagafogigante.dungeon.game.Direction direction19 = org.mafagafogigante.dungeon.game.Direction.EAST;
    org.mafagafogigante.dungeon.game.Direction direction20 = direction19.invert();
    blockedEntrances18.block(direction20);
    org.mafagafogigante.dungeon.game.Direction direction22 = org.mafagafogigante.dungeon.game.Direction.EAST;
    java.lang.String str23 = direction22.toString();
    java.lang.String str24 = direction22.toString();
    blockedEntrances18.block(direction22);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances26 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances27 = new org.mafagafogigante.dungeon.game.BlockedEntrances(blockedEntrances26);
    org.mafagafogigante.dungeon.game.Direction direction28 = org.mafagafogigante.dungeon.game.Direction.EAST;
    java.lang.String str29 = direction28.toString();
    java.lang.String str30 = direction28.toString();
    blockedEntrances26.block(direction28);
    blockedEntrances18.block(direction28);
    org.mafagafogigante.dungeon.game.Point point33 = direction28.getOffset();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset34 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity35 = itemPreset34.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity36 = null;
    itemPreset34.setIntegrity(integrity36);
    org.mafagafogigante.dungeon.util.Percentage percentage38 = itemPreset34.getVisibility();
    org.mafagafogigante.dungeon.entity.Integrity integrity39 = itemPreset34.getIntegrity();
    java.lang.String str40 = itemPreset34.getText();
    java.lang.String str41 = itemPreset34.getType();
    org.mafagafogigante.dungeon.entity.Integrity integrity44 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    boolean b45 = integrity44.isMaximum();
    integrity44.incrementBy((int)(short)0);
    org.mafagafogigante.dungeon.util.Percentage percentage48 = integrity44.toPercentage();
    itemPreset34.setHitRate(percentage48);
    org.mafagafogigante.dungeon.game.Id id51 = new org.mafagafogigante.dungeon.game.Id("100");
    java.lang.String str52 = id51.toString();
    itemPreset34.setId(id51);
    explorationStatistics3.addVisit(point33, id51);
    org.mafagafogigante.dungeon.game.World world55 = null;
    org.mafagafogigante.dungeon.entity.creatures.Creature creature56 = creatureFactory1.makeCreature(id51, world55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creaturePresetFactory_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_creaturePreset2);
    org.junit.Assert.assertTrue("'" + direction14 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction14.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    org.junit.Assert.assertTrue("'" + direction19 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction19.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    org.junit.Assert.assertTrue("'" + direction20 + "' != '" + org.mafagafogigante.dungeon.game.Direction.WEST + "'", direction20.equals(org.mafagafogigante.dungeon.game.Direction.WEST));
    org.junit.Assert.assertTrue("'" + direction22 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction22.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "East"+ "'", str23.equals("East"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "East"+ "'", str24.equals("East"));
    org.junit.Assert.assertTrue("'" + direction28 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction28.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "East"+ "'", str29.equals("East"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "East"+ "'", str30.equals("East"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "100"+ "'", str52.equals("100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(creature56);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test319"); }

    org.mafagafogigante.dungeon.stats.Statistics statistics0 = new org.mafagafogigante.dungeon.stats.Statistics();
    statistics0.writeStatistics();
    statistics0.writeStatistics();
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker3 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics0);
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker4 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics0);
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker5 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics0);
    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics6 = statistics0.getWorldStatistics();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(worldStatistics6);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test320"); }

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
    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset15 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id16 = null;
    creaturePreset15.setWeaponId(id16);
    org.mafagafogigante.dungeon.game.Id id18 = creaturePreset15.getId();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity19 = creaturePreset15.getLuminosity();
    org.mafagafogigante.dungeon.entity.creatures.Drop[] drop_array20 = new org.mafagafogigante.dungeon.entity.creatures.Drop[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop> arraylist_drop21 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop21, drop_array20);
    creaturePreset15.setDropList((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop21);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay24 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity25 = partOfDay24.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name26 = partOfDay24.getName();
    java.lang.String str28 = name26.getQuantifiedName((int)'a');
    java.lang.String str29 = name26.getSingular();
    java.lang.String str30 = name26.toString();
    java.lang.String str31 = name26.getSingular();
    java.lang.String str32 = name26.getPlural();
    java.lang.String str33 = name26.getPlural();
    creaturePreset15.setName(name26);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset35 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity36 = itemPreset35.getIntegrity();
    itemPreset35.setIntegrityDecrementOnEat((-1));
    itemPreset35.setPutrefactionPeriod((-1L));
    itemPreset35.setDrinkableDoses((int)(short)10);
    java.lang.String str43 = itemPreset35.getText();
    org.mafagafogigante.dungeon.util.Percentage percentage45 = new org.mafagafogigante.dungeon.util.Percentage((double)'#');
    boolean b47 = percentage45.equals((java.lang.Object)10.0d);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity48 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage45);
    org.mafagafogigante.dungeon.util.Percentage percentage49 = luminosity48.toPercentage();
    itemPreset35.setLuminosity(luminosity48);
    creaturePreset15.setLuminosity(luminosity48);
    boolean b52 = visibility6.visibleUnder(luminosity48);
    org.mafagafogigante.dungeon.entity.LightSource lightSource53 = new org.mafagafogigante.dungeon.entity.LightSource(luminosity48);
    
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
    org.junit.Assert.assertNull(id18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(drop_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    org.junit.Assert.assertTrue("'" + partOfDay24 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay24.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(name26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "a few Nights"+ "'", str28.equals("a few Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "Night"+ "'", str29.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Night"+ "'", str30.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Night"+ "'", str31.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Nights"+ "'", str32.equals("Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "Nights"+ "'", str33.equals("Nights"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test321"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    java.lang.String str3 = integrity2.toString();
    java.lang.String str4 = integrity2.toString();
    boolean b5 = integrity2.isMaximum();
    int i6 = integrity2.getMaximum();
    int i7 = integrity2.getCurrent();
    int i8 = integrity2.getMaximum();
    
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
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test322"); }

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
    org.mafagafogigante.dungeon.util.Percentage percentage34 = itemPreset0.getVisibility();
    // The following exception was thrown during execution in test generation
    try {
    itemPreset0.setSpellId("DungeonString{coloredStringList=[ColoredString{string='hi!hi!DamagedBattleStatistics{records=CounterMap{map={}}}', color=java.awt.Color[r=192,g=192,b=192]}], currentColor=java.awt.Color[r=192,g=192,b=192]}");
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
    org.junit.Assert.assertNotNull(percentage34);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test323"); }

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
    creaturePreset0.setInventoryWeightLimit(0.0d);
    
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
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test324"); }

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
    creaturePreset0.setAttack(3);
    
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
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test325"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    java.lang.String str3 = integrity2.toString();
    java.lang.String str4 = integrity2.toString();
    boolean b5 = integrity2.isMaximum();
    int i6 = integrity2.getMaximum();
    java.lang.String str7 = integrity2.toString();
    boolean b8 = integrity2.isMaximum();
    boolean b9 = integrity2.isZero();
    java.lang.String str10 = integrity2.toString();
    boolean b11 = integrity2.isZero();
    org.mafagafogigante.dungeon.entity.items.Item item12 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity13 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity2, item12);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemIntegrity13);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test326"); }

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
    itemPreset0.setType("BattleStatisticsRequirement{query=BattleStatisticsQuery{id=null, type='null', causeOfDeath=null, partOfDay=null}, count=100}");
    org.mafagafogigante.dungeon.entity.TagSet<org.mafagafogigante.dungeon.entity.items.Item.Tag> tagset_tag14 = itemPreset0.getTagSet();
    boolean b15 = itemPreset0.isUnique();
    
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
    org.junit.Assert.assertNotNull(tagset_tag14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test327"); }

    org.mafagafogigante.dungeon.util.NonNegativeInteger nonNegativeInteger1 = new org.mafagafogigante.dungeon.util.NonNegativeInteger((java.lang.Integer)100);
    java.lang.String str2 = nonNegativeInteger1.toString();
    java.lang.Integer i3 = nonNegativeInteger1.toInteger();
    java.lang.Integer i4 = nonNegativeInteger1.toInteger();
    java.lang.String str5 = nonNegativeInteger1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100"+ "'", str2.equals("100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 100+ "'", i3.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 100+ "'", i4.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100"+ "'", str5.equals("100"));

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test328"); }

    org.mafagafogigante.dungeon.stats.Statistics statistics0 = new org.mafagafogigante.dungeon.stats.Statistics();
    statistics0.writeStatistics();
    statistics0.writeStatistics();
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker3 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics0);
    org.mafagafogigante.dungeon.achievements.AchievementTracker achievementTracker4 = new org.mafagafogigante.dungeon.achievements.AchievementTracker(statistics0);
    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics5 = statistics0.getWorldStatistics();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(worldStatistics5);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test329"); }

    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset0 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    creaturePreset0.setWeaponId(id1);
    creaturePreset0.setAttack(57);
    org.mafagafogigante.dungeon.entity.Luminosity luminosity5 = creaturePreset0.getLuminosity();
    creaturePreset0.setInventoryItemLimit(57);
    org.mafagafogigante.dungeon.entity.creatures.Drop[] drop_array8 = new org.mafagafogigante.dungeon.entity.creatures.Drop[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop> arraylist_drop9 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.creatures.Drop>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop9, drop_array8);
    creaturePreset0.setDropList((java.util.List<org.mafagafogigante.dungeon.entity.creatures.Drop>)arraylist_drop9);
    creaturePreset0.setInventoryWeightLimit((double)(byte)0);
    org.mafagafogigante.dungeon.entity.creatures.AttackAlgorithmId attackAlgorithmId14 = creaturePreset0.getAttackAlgorithmId();
    org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath typeOfCauseOfDeath15 = org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath.SPELL;
    java.lang.String str16 = typeOfCauseOfDeath15.toString();
    java.lang.String str17 = typeOfCauseOfDeath15.toString();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset18 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity19 = itemPreset18.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity20 = null;
    itemPreset18.setIntegrity(integrity20);
    org.mafagafogigante.dungeon.util.Percentage percentage22 = itemPreset18.getVisibility();
    org.mafagafogigante.dungeon.entity.Integrity integrity23 = itemPreset18.getIntegrity();
    java.lang.String str24 = itemPreset18.getText();
    org.mafagafogigante.dungeon.game.Name name25 = null;
    itemPreset18.setName(name25);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset27 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity28 = itemPreset27.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity29 = null;
    itemPreset27.setIntegrity(integrity29);
    org.mafagafogigante.dungeon.util.Percentage percentage31 = itemPreset27.getVisibility();
    java.lang.String str32 = itemPreset27.getType();
    itemPreset27.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage36 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset27.setVisibility(percentage36);
    boolean b38 = org.mafagafogigante.dungeon.game.Random.roll(percentage36);
    itemPreset18.setVisibility(percentage36);
    long long40 = itemPreset18.getPutrefactionPeriod();
    org.mafagafogigante.dungeon.game.Id id42 = new org.mafagafogigante.dungeon.game.Id("100");
    itemPreset18.setId(id42);
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath44 = new org.mafagafogigante.dungeon.stats.CauseOfDeath(typeOfCauseOfDeath15, id42);
    creaturePreset0.setId(id42);
    org.mafagafogigante.dungeon.game.Id id46 = org.mafagafogigante.dungeon.entity.creatures.CorpseItemPresetFactory.makeCorpseIdFromCreatureId(id42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(drop_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(attackAlgorithmId14);
    org.junit.Assert.assertTrue("'" + typeOfCauseOfDeath15 + "' != '" + org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath.SPELL + "'", typeOfCauseOfDeath15.equals(org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath.SPELL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Spell"+ "'", str16.equals("Spell"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Spell"+ "'", str17.equals("Spell"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long40 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(id46);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test330"); }

    org.mafagafogigante.dungeon.entity.items.FoodComponent foodComponent2 = new org.mafagafogigante.dungeon.entity.items.FoodComponent(3600, 97);
    int i3 = foodComponent2.getNutrition();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 3600);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test331"); }

    org.mafagafogigante.dungeon.date.Date date6 = new org.mafagafogigante.dungeon.date.Date((long)152, (long)2, (long)(byte)100, (long)1, (long)' ', (long)3600);
    org.mafagafogigante.dungeon.date.Date date10 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date14 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i15 = date10.compareTo(date14);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay16 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date10);
    long long17 = date10.getYear();
    java.lang.String str18 = date10.toDateString();
    int i19 = date6.compareTo(date10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay16 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay16.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "day 10 of month 10 of the year 10"+ "'", str18.equals("day 10 of month 10 of the year 10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test332"); }

    org.mafagafogigante.dungeon.commands.CommandHistory commandHistory0 = new org.mafagafogigante.dungeon.commands.CommandHistory();
    java.lang.String str2 = commandHistory0.getLastSimilarCommand("East");
    org.mafagafogigante.dungeon.commands.CommandHistory.Cursor cursor3 = commandHistory0.getCursor();
    org.mafagafogigante.dungeon.commands.IssuedCommand issuedCommand5 = new org.mafagafogigante.dungeon.commands.IssuedCommand("100");
    commandHistory0.addCommand(issuedCommand5);
    org.mafagafogigante.dungeon.commands.IssuedCommandEvaluation issuedCommandEvaluation7 = org.mafagafogigante.dungeon.commands.IssuedCommandProcessor.evaluateIssuedCommand(issuedCommand5);
    java.util.List<java.lang.String> list_str8 = issuedCommandEvaluation7.getSuggestions();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cursor3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(issuedCommandEvaluation7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test333"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule2 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeBoundDoubleRule((double)60L, (double)82800);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule2);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test334"); }

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
    org.mafagafogigante.dungeon.entity.Luminosity luminosity44 = new org.mafagafogigante.dungeon.entity.Luminosity(percentage35);
    org.mafagafogigante.dungeon.entity.Integrity integrity47 = new org.mafagafogigante.dungeon.entity.Integrity((int)(byte)1, (int)(byte)0);
    boolean b48 = integrity47.isMaximum();
    org.mafagafogigante.dungeon.entity.items.Item item49 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity50 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity47, item49);
    itemIntegrity50.incrementBy((int)(byte)0);
    itemIntegrity50.incrementBy((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage55 = itemIntegrity50.toPercentage();
    itemIntegrity50.decrementBy(0);
    org.mafagafogigante.dungeon.util.Percentage percentage58 = itemIntegrity50.toPercentage();
    int i59 = itemIntegrity50.getCurrent();
    org.mafagafogigante.dungeon.util.Percentage percentage60 = itemIntegrity50.toPercentage();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset61 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity62 = itemPreset61.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity63 = null;
    itemPreset61.setIntegrity(integrity63);
    org.mafagafogigante.dungeon.util.Percentage percentage65 = itemPreset61.getVisibility();
    java.lang.String str66 = itemPreset61.getType();
    itemPreset61.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage70 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset61.setVisibility(percentage70);
    org.mafagafogigante.dungeon.util.Percentage percentage73 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    int i74 = percentage70.compareTo(percentage73);
    int i75 = percentage60.compareTo(percentage70);
    boolean b76 = percentage35.biggerThanOrEqualTo(percentage60);
    
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
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemIntegrity50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test335"); }

    org.mafagafogigante.dungeon.util.NonNegativeInteger nonNegativeInteger1 = new org.mafagafogigante.dungeon.util.NonNegativeInteger((java.lang.Integer)100);
    java.lang.String str2 = nonNegativeInteger1.toString();
    java.lang.Integer i3 = nonNegativeInteger1.toInteger();
    java.lang.String str4 = nonNegativeInteger1.toString();
    java.lang.Integer i5 = nonNegativeInteger1.toInteger();
    java.lang.Integer i6 = nonNegativeInteger1.toInteger();
    java.lang.String str7 = nonNegativeInteger1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100"+ "'", str2.equals("100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 100+ "'", i3.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100"+ "'", str4.equals("100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 100+ "'", i5.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "100"+ "'", str7.equals("100"));

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test336"); }

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
    long long16 = itemPreset0.getPutrefactionPeriod();
    itemPreset0.setDamage(0);
    org.mafagafogigante.dungeon.date.Date date19 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.items.Item item20 = new org.mafagafogigante.dungeon.entity.items.Item(itemPreset0, date19);
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
    org.junit.Assert.assertNull(percentage15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 0L);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test337"); }

    org.mafagafogigante.dungeon.schema.JsonRule jsonRule0 = null;
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule1 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeOptionalRule(jsonRule0);
    org.mafagafogigante.dungeon.schema.JsonRule jsonRule2 = org.mafagafogigante.dungeon.schema.rules.JsonRuleFactory.makeVariableArrayRule(jsonRule0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonRule2);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test338"); }

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
    org.mafagafogigante.dungeon.game.Point point32 = new org.mafagafogigante.dungeon.game.Point(100, 10, (int)(byte)10);
    boolean b33 = explorationStatistics0.hasBeenSeen(point32);
    int i34 = point32.getX();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 100);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test339"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date7 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i8 = date3.compareTo(date7);
    long long9 = date7.getDay();
    long long10 = date7.getHour();
    long long11 = date7.getYear();
    long long12 = date7.getYear();
    
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
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test340"); }

    org.mafagafogigante.dungeon.game.DungeonString dungeonString1 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString1.append(str_array6);
    org.mafagafogigante.dungeon.io.Writer.write((org.mafagafogigante.dungeon.game.Writable)dungeonString1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test341"); }

    org.mafagafogigante.dungeon.commands.CommandHistory commandHistory0 = new org.mafagafogigante.dungeon.commands.CommandHistory();
    java.lang.String str2 = commandHistory0.getLastSimilarCommand("East");
    org.mafagafogigante.dungeon.commands.CommandHistory.Cursor cursor3 = commandHistory0.getCursor();
    java.lang.String str4 = cursor3.getSelectedCommand();
    org.mafagafogigante.dungeon.commands.CommandHistory.Cursor cursor5 = cursor3.moveDown();
    org.mafagafogigante.dungeon.commands.CommandHistory.Cursor cursor6 = cursor5.moveDown();
    java.lang.String str7 = cursor6.getSelectedCommand();
    org.mafagafogigante.dungeon.commands.CommandHistory.Cursor cursor8 = cursor6.moveUp();
    org.mafagafogigante.dungeon.commands.CommandHistory.Cursor cursor9 = cursor6.moveDown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cursor3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cursor5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cursor6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cursor8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cursor9);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test342"); }

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
    org.mafagafogigante.dungeon.game.Point point23 = new org.mafagafogigante.dungeon.game.Point(10, (int)'a', 0);
    int i24 = point23.getY();
    int i25 = point23.getX();
    java.lang.String str26 = point23.toString();
    org.mafagafogigante.dungeon.game.Id id28 = new org.mafagafogigante.dungeon.game.Id("100");
    java.lang.String str29 = id28.toString();
    explorationStatistics0.addVisit(point23, id28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{10, 97, 0}"+ "'", str26.equals("{10, 97, 0}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "100"+ "'", str29.equals("100"));

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test343"); }

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
    boolean b29 = org.mafagafogigante.dungeon.game.Random.roll(percentage27);
    org.mafagafogigante.dungeon.util.Percentage percentage30 = percentage11.multiply(percentage27);
    
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
    org.junit.Assert.assertNull(integrity16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage30);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test344"); }

    org.mafagafogigante.dungeon.util.Percentage percentage1 = new org.mafagafogigante.dungeon.util.Percentage((double)0);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test345"); }

    org.mafagafogigante.dungeon.entity.creatures.Creature creature0 = null;
    org.mafagafogigante.dungeon.entity.items.CreatureInventory creatureInventory3 = new org.mafagafogigante.dungeon.entity.items.CreatureInventory(creature0, (int)(short)-1, (double)(short)-1);
    int i4 = creatureInventory3.getItemLimit();
    org.mafagafogigante.dungeon.entity.items.Item item5 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.entity.items.CreatureInventory.SimulationResult simulationResult6 = creatureInventory3.simulateItemAddition(item5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test346"); }

    org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.util.CounterMap<java.util.Collection<org.mafagafogigante.dungeon.schema.JsonRule>>> countermap_countermap_collection_jsonRule0 = new org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.util.CounterMap<java.util.Collection<org.mafagafogigante.dungeon.schema.JsonRule>>>();

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test347"); }

    org.mafagafogigante.dungeon.stats.Statistics statistics0 = new org.mafagafogigante.dungeon.stats.Statistics();
    statistics0.writeStatistics();
    org.mafagafogigante.dungeon.stats.WorldStatistics worldStatistics2 = statistics0.getWorldStatistics();
    org.mafagafogigante.dungeon.util.CounterMap<java.lang.String> countermap_str3 = worldStatistics2.getSpawnCounter();
    worldStatistics2.addLocation("Luminosity of 100.00%");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(worldStatistics2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(countermap_str3);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test348"); }

    org.mafagafogigante.dungeon.entity.Integrity integrity2 = new org.mafagafogigante.dungeon.entity.Integrity((int)(byte)1, (int)(byte)0);
    boolean b3 = integrity2.isMaximum();
    org.mafagafogigante.dungeon.entity.items.Item item4 = null;
    org.mafagafogigante.dungeon.entity.items.ItemIntegrity itemIntegrity5 = org.mafagafogigante.dungeon.entity.items.ItemIntegrity.makeItemIntegrity(integrity2, item4);
    itemIntegrity5.incrementBy((int)(byte)0);
    itemIntegrity5.incrementBy((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage10 = itemIntegrity5.toPercentage();
    org.mafagafogigante.dungeon.util.Percentage percentage12 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    boolean b13 = org.mafagafogigante.dungeon.game.Random.roll(percentage12);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset16 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    itemPreset16.setDrinkableHealing((int)(short)0);
    org.mafagafogigante.dungeon.util.Percentage percentage20 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset16.setVisibility(percentage20);
    double d22 = org.mafagafogigante.dungeon.util.DungeonMath.weightedAverage((double)10.0f, 100.0d, percentage20);
    java.lang.String str23 = percentage20.toString();
    org.mafagafogigante.dungeon.util.Percentage percentage24 = percentage12.multiply(percentage20);
    int i25 = percentage10.compareTo(percentage12);
    boolean b26 = org.mafagafogigante.dungeon.game.Random.roll(percentage12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(itemIntegrity5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d22 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "100.00%"+ "'", str23.equals("100.00%"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(percentage24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test349"); }

    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit0 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.YEAR;
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit1 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.SECOND;
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit2 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.MILLISECOND;
    long long3 = dungeonTimeUnit1.as(dungeonTimeUnit2);
    long long4 = dungeonTimeUnit0.as(dungeonTimeUnit1);
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit0 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.YEAR + "'", dungeonTimeUnit0.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.YEAR));
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit1 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.SECOND + "'", dungeonTimeUnit1.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.SECOND));
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit2 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.MILLISECOND + "'", dungeonTimeUnit2.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.MILLISECOND));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 1000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 8640000L);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test350"); }

    // The following exception was thrown during execution in test generation
    try {
    org.mafagafogigante.dungeon.util.library.AutomaticShuffledStringLibrary automaticShuffledStringLibrary1 = new org.mafagafogigante.dungeon.util.library.AutomaticShuffledStringLibrary("This book teaches nothing. Text: Night");
      org.junit.Assert.fail("Expected exception of type org.mafagafogigante.dungeon.io.JsonObjectFactory.IllegalFilenameExtensionException");
    } catch (org.mafagafogigante.dungeon.io.JsonObjectFactory.IllegalFilenameExtensionException e) {
      // Expected exception.
    }

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test351"); }

    org.mafagafogigante.dungeon.commands.CommandHistory commandHistory0 = new org.mafagafogigante.dungeon.commands.CommandHistory();
    java.lang.String str2 = commandHistory0.getLastSimilarCommand("");
    java.lang.String str4 = commandHistory0.getLastSimilarCommand("Unarmed : UNARMED");
    org.mafagafogigante.dungeon.commands.CommandHistory.Cursor cursor5 = commandHistory0.getCursor();
    java.lang.String str6 = cursor5.getSelectedCommand();
    org.mafagafogigante.dungeon.commands.CommandHistory.Cursor cursor7 = cursor5.moveUp();
    org.mafagafogigante.dungeon.commands.CommandHistory.Cursor cursor8 = cursor7.moveUp();
    org.mafagafogigante.dungeon.commands.CommandHistory.Cursor cursor9 = cursor8.moveDown();
    org.mafagafogigante.dungeon.commands.CommandHistory.Cursor cursor10 = cursor9.moveDown();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cursor10);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test352"); }

    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances0 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.Direction direction1 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b3 = direction1.equalsIgnoreCase("");
    blockedEntrances0.block(direction1);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances5 = new org.mafagafogigante.dungeon.game.BlockedEntrances(blockedEntrances0);
    org.mafagafogigante.dungeon.game.Direction direction6 = org.mafagafogigante.dungeon.game.Direction.EAST;
    org.mafagafogigante.dungeon.game.Direction direction7 = direction6.invert();
    blockedEntrances5.block(direction7);
    boolean b10 = direction7.equalsIgnoreCase("Luminosity of 40.00%");
    org.junit.Assert.assertTrue("'" + direction1 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction1.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    org.junit.Assert.assertTrue("'" + direction6 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction6.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    org.junit.Assert.assertTrue("'" + direction7 + "' != '" + org.mafagafogigante.dungeon.game.Direction.WEST + "'", direction7.equals(org.mafagafogigante.dungeon.game.Direction.WEST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test353"); }

    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics0 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point1 = null;
    org.mafagafogigante.dungeon.game.Id id2 = null;
    explorationStatistics0.createEntryIfNotExists(point1, id2);
    org.mafagafogigante.dungeon.game.Point point7 = new org.mafagafogigante.dungeon.game.Point(152, (int)(byte)100, 17518);
    org.mafagafogigante.dungeon.entity.creatures.Creature creature9 = null;
    org.mafagafogigante.dungeon.entity.creatures.CreatureHealth creatureHealth10 = org.mafagafogigante.dungeon.entity.creatures.CreatureHealth.makeCreatureHealth(100, creature9);
    boolean b11 = point7.equals((java.lang.Object)creature9);
    boolean b12 = explorationStatistics0.hasBeenSeen(point7);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances13 = new org.mafagafogigante.dungeon.game.BlockedEntrances();
    org.mafagafogigante.dungeon.game.Direction direction14 = org.mafagafogigante.dungeon.game.Direction.EAST;
    boolean b16 = direction14.equalsIgnoreCase("");
    blockedEntrances13.block(direction14);
    org.mafagafogigante.dungeon.game.BlockedEntrances blockedEntrances18 = new org.mafagafogigante.dungeon.game.BlockedEntrances(blockedEntrances13);
    org.mafagafogigante.dungeon.game.Direction direction19 = org.mafagafogigante.dungeon.game.Direction.EAST;
    org.mafagafogigante.dungeon.game.Direction direction20 = direction19.invert();
    blockedEntrances18.block(direction20);
    org.mafagafogigante.dungeon.game.Direction direction22 = org.mafagafogigante.dungeon.game.Direction.EAST;
    java.lang.String str23 = direction22.toString();
    java.lang.String str24 = direction22.toString();
    blockedEntrances18.block(direction22);
    org.mafagafogigante.dungeon.game.Point point26 = direction22.getOffset();
    boolean b27 = explorationStatistics0.hasBeenSeen(point26);
    org.mafagafogigante.dungeon.stats.ExplorationStatistics explorationStatistics28 = new org.mafagafogigante.dungeon.stats.ExplorationStatistics();
    org.mafagafogigante.dungeon.game.Point point29 = null;
    org.mafagafogigante.dungeon.game.Id id30 = null;
    explorationStatistics28.createEntryIfNotExists(point29, id30);
    org.mafagafogigante.dungeon.game.Point point35 = new org.mafagafogigante.dungeon.game.Point(10, (int)'a', 0);
    java.lang.String[] str_array38 = new java.lang.String[] { "", "" };
    org.mafagafogigante.dungeon.util.Table table39 = new org.mafagafogigante.dungeon.util.Table(str_array38);
    boolean b40 = point35.equals((java.lang.Object)str_array38);
    org.mafagafogigante.dungeon.game.Id id41 = null;
    explorationStatistics28.addVisit(point35, id41);
    org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath typeOfCauseOfDeath43 = org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath.SPELL;
    java.lang.String str44 = typeOfCauseOfDeath43.toString();
    java.lang.String str45 = typeOfCauseOfDeath43.toString();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset46 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity47 = itemPreset46.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity48 = null;
    itemPreset46.setIntegrity(integrity48);
    org.mafagafogigante.dungeon.util.Percentage percentage50 = itemPreset46.getVisibility();
    org.mafagafogigante.dungeon.entity.Integrity integrity51 = itemPreset46.getIntegrity();
    java.lang.String str52 = itemPreset46.getText();
    org.mafagafogigante.dungeon.game.Name name53 = null;
    itemPreset46.setName(name53);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset55 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity56 = itemPreset55.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity57 = null;
    itemPreset55.setIntegrity(integrity57);
    org.mafagafogigante.dungeon.util.Percentage percentage59 = itemPreset55.getVisibility();
    java.lang.String str60 = itemPreset55.getType();
    itemPreset55.setIntegrityDecrementOnHit((int)(short)100);
    org.mafagafogigante.dungeon.util.Percentage percentage64 = new org.mafagafogigante.dungeon.util.Percentage((double)57);
    itemPreset55.setVisibility(percentage64);
    boolean b66 = org.mafagafogigante.dungeon.game.Random.roll(percentage64);
    itemPreset46.setVisibility(percentage64);
    long long68 = itemPreset46.getPutrefactionPeriod();
    org.mafagafogigante.dungeon.game.Id id70 = new org.mafagafogigante.dungeon.game.Id("100");
    itemPreset46.setId(id70);
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath72 = new org.mafagafogigante.dungeon.stats.CauseOfDeath(typeOfCauseOfDeath43, id70);
    explorationStatistics0.addVisit(point35, id70);
    org.mafagafogigante.dungeon.entity.items.BookComponent bookComponent75 = new org.mafagafogigante.dungeon.entity.items.BookComponent(id70, "Night");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(creatureHealth10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    org.junit.Assert.assertTrue("'" + direction14 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction14.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    org.junit.Assert.assertTrue("'" + direction19 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction19.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    org.junit.Assert.assertTrue("'" + direction20 + "' != '" + org.mafagafogigante.dungeon.game.Direction.WEST + "'", direction20.equals(org.mafagafogigante.dungeon.game.Direction.WEST));
    org.junit.Assert.assertTrue("'" + direction22 + "' != '" + org.mafagafogigante.dungeon.game.Direction.EAST + "'", direction22.equals(org.mafagafogigante.dungeon.game.Direction.EAST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "East"+ "'", str23.equals("East"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "East"+ "'", str24.equals("East"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    org.junit.Assert.assertTrue("'" + typeOfCauseOfDeath43 + "' != '" + org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath.SPELL + "'", typeOfCauseOfDeath43.equals(org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath.SPELL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "Spell"+ "'", str44.equals("Spell"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "Spell"+ "'", str45.equals("Spell"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(integrity56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(percentage59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long68 == 0L);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test354"); }

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
    org.mafagafogigante.dungeon.date.Date date47 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date51 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i52 = date47.compareTo(date51);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay53 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date47);
    long long54 = date47.getYear();
    org.mafagafogigante.dungeon.date.Date date58 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date62 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i63 = date58.compareTo(date62);
    long long64 = date58.getYear();
    int i65 = date47.compareTo(date58);
    org.mafagafogigante.dungeon.date.DungeonTimeUnit dungeonTimeUnit67 = org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR;
    org.mafagafogigante.dungeon.date.Date date68 = date58.minus(35, dungeonTimeUnit67);
    org.mafagafogigante.dungeon.date.Date date69 = date34.plus(3, dungeonTimeUnit67);
    long long70 = date69.getMonth();
    org.mafagafogigante.dungeon.world.Weather weather71 = new org.mafagafogigante.dungeon.world.Weather(date69);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay72 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date69);
    java.lang.String str73 = partOfDay72.toString();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity74 = partOfDay72.getLuminosity();
    
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
    org.junit.Assert.assertTrue(i52 == 0);
    org.junit.Assert.assertTrue("'" + partOfDay53 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT + "'", partOfDay53.equals(org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long54 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long64 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    org.junit.Assert.assertTrue("'" + dungeonTimeUnit67 + "' != '" + org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR + "'", dungeonTimeUnit67.equals(org.mafagafogigante.dungeon.date.DungeonTimeUnit.HOUR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long70 == 10L);
    org.junit.Assert.assertTrue("'" + partOfDay72 + "' != '" + org.mafagafogigante.dungeon.game.PartOfDay.NIGHT + "'", partOfDay72.equals(org.mafagafogigante.dungeon.game.PartOfDay.NIGHT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str73 + "' != '" + "Night"+ "'", str73.equals("Night"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(luminosity74);

  }

}
