package org.RandoopTest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test01"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.mafagafogigante.dungeon.game.Engine.refresh();

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test02"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.mafagafogigante.dungeon.map.WorldMapWriter.writeMap();

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test03"); }

    java.lang.String[] str_array2 = new java.lang.String[] { "", "" };
    org.mafagafogigante.dungeon.util.Table table3 = new org.mafagafogigante.dungeon.util.Table(str_array2);
    org.mafagafogigante.dungeon.util.Table table4 = new org.mafagafogigante.dungeon.util.Table(str_array2);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.mafagafogigante.dungeon.achievements.AchievementTrackerWriter.parseCommand(str_array2);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test04"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.mafagafogigante.dungeon.game.Engine.endTurn();

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test05"); }

    org.mafagafogigante.dungeon.util.ShuffledRange shuffledRange2 = new org.mafagafogigante.dungeon.util.ShuffledRange((int)(short)0, (int)(short)-1);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = shuffledRange2.get((-1));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test06"); }

    org.mafagafogigante.dungeon.game.DungeonString dungeonString1 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString1.append(str_array6);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.mafagafogigante.dungeon.achievements.AchievementTrackerWriter.parseCommand(str_array6);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test07"); }

    org.mafagafogigante.dungeon.date.Date date3 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date7 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i8 = date3.compareTo(date7);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay9 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date3);
    long long10 = date3.getYear();
    org.mafagafogigante.dungeon.game.Id id11 = null;
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery13 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath14 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    battleStatisticsQuery13.setCauseOfDeath(causeOfDeath14);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay16 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.stats.BattleRecord battleRecord17 = new org.mafagafogigante.dungeon.stats.BattleRecord(id11, "", causeOfDeath14, partOfDay16);
    int i18 = org.mafagafogigante.dungeon.game.PartOfDay.getSecondsToNext(date3, partOfDay16);
    
    // Checks the contract:  equals-hashcode on battleRecord17 and battleRecord17
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on battleRecord17 and battleRecord17", battleRecord17.equals(battleRecord17) ? battleRecord17.hashCode() == battleRecord17.hashCode() : true);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test08"); }

    org.mafagafogigante.dungeon.util.ShuffledRange shuffledRange2 = new org.mafagafogigante.dungeon.util.ShuffledRange((int)(short)0, (int)(short)-1);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i3 = shuffledRange2.getSize();

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test09"); }

    org.mafagafogigante.dungeon.game.Id id0 = null;
    org.mafagafogigante.dungeon.game.Id id2 = null;
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery4 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath5 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    battleStatisticsQuery4.setCauseOfDeath(causeOfDeath5);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay7 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.stats.BattleRecord battleRecord8 = new org.mafagafogigante.dungeon.stats.BattleRecord(id2, "", causeOfDeath5, partOfDay7);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay9 = org.mafagafogigante.dungeon.game.PartOfDay.EVENING;
    org.mafagafogigante.dungeon.stats.BattleRecord battleRecord10 = new org.mafagafogigante.dungeon.stats.BattleRecord(id0, "day 10 of month 10 of the year 10", causeOfDeath5, partOfDay9);
    
    // Checks the contract:  equals-hashcode on battleRecord8 and battleRecord8
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on battleRecord8 and battleRecord8", battleRecord8.equals(battleRecord8) ? battleRecord8.hashCode() == battleRecord8.hashCode() : true);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test10"); }

    org.mafagafogigante.dungeon.stats.BattleStatistics battleStatistics0 = new org.mafagafogigante.dungeon.stats.BattleStatistics();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement1 = null;
    boolean b2 = battleStatistics0.satisfies(battleStatisticsRequirement1);
    java.lang.String str3 = battleStatistics0.toString();
    org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.CauseOfDeath> countermap_causeOfDeath4 = battleStatistics0.getKillsByCauseOfDeath();
    java.lang.String str5 = countermap_causeOfDeath4.toString();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath6 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery7 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    battleStatisticsQuery7.setType("Damaged");
    battleStatisticsQuery7.setType("");
    boolean b12 = causeOfDeath6.equals((java.lang.Object)battleStatisticsQuery7);
    org.mafagafogigante.dungeon.game.Id id13 = null;
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery15 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath16 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    battleStatisticsQuery15.setCauseOfDeath(causeOfDeath16);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay18 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.stats.BattleRecord battleRecord19 = new org.mafagafogigante.dungeon.stats.BattleRecord(id13, "", causeOfDeath16, partOfDay18);
    boolean b20 = battleStatisticsQuery7.matches(battleRecord19);
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath21 = battleRecord19.getCauseOfDeath();
    countermap_causeOfDeath4.incrementCounter(causeOfDeath21, (java.lang.Integer)3600);
    
    // Checks the contract:  equals-hashcode on battleRecord19 and battleRecord19
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on battleRecord19 and battleRecord19", battleRecord19.equals(battleRecord19) ? battleRecord19.hashCode() == battleRecord19.hashCode() : true);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test11"); }

    org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath typeOfCauseOfDeath0 = org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath.SPELL;
    org.mafagafogigante.dungeon.game.Id id1 = null;
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath2 = new org.mafagafogigante.dungeon.stats.CauseOfDeath(typeOfCauseOfDeath0, id1);
    org.mafagafogigante.dungeon.game.Id id3 = null;
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath4 = new org.mafagafogigante.dungeon.stats.CauseOfDeath(typeOfCauseOfDeath0, id3);
    
    // Checks the contract:  equals-hashcode on causeOfDeath2 and causeOfDeath2
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on causeOfDeath2 and causeOfDeath2", causeOfDeath2.equals(causeOfDeath2) ? causeOfDeath2.hashCode() == causeOfDeath2.hashCode() : true);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test12"); }

    org.mafagafogigante.dungeon.game.Id id0 = null;
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath2 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery3 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    battleStatisticsQuery3.setType("Damaged");
    battleStatisticsQuery3.setType("");
    boolean b8 = causeOfDeath2.equals((java.lang.Object)battleStatisticsQuery3);
    org.mafagafogigante.dungeon.game.Id id9 = null;
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery11 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath12 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    battleStatisticsQuery11.setCauseOfDeath(causeOfDeath12);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay14 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.stats.BattleRecord battleRecord15 = new org.mafagafogigante.dungeon.stats.BattleRecord(id9, "", causeOfDeath12, partOfDay14);
    boolean b16 = battleStatisticsQuery3.matches(battleRecord15);
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath17 = battleRecord15.getCauseOfDeath();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay18 = org.mafagafogigante.dungeon.game.PartOfDay.EVENING;
    org.mafagafogigante.dungeon.stats.BattleRecord battleRecord19 = new org.mafagafogigante.dungeon.stats.BattleRecord(id0, "Badly Injured", causeOfDeath17, partOfDay18);
    
    // Checks the contract:  equals-hashcode on battleRecord15 and battleRecord15
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on battleRecord15 and battleRecord15", battleRecord15.equals(battleRecord15) ? battleRecord15.hashCode() == battleRecord15.hashCode() : true);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test13"); }

    org.mafagafogigante.dungeon.game.Id id0 = null;
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath2 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery3 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    battleStatisticsQuery3.setType("Damaged");
    battleStatisticsQuery3.setType("");
    boolean b8 = causeOfDeath2.equals((java.lang.Object)battleStatisticsQuery3);
    org.mafagafogigante.dungeon.game.Id id9 = null;
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery11 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath12 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    battleStatisticsQuery11.setCauseOfDeath(causeOfDeath12);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay14 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.stats.BattleRecord battleRecord15 = new org.mafagafogigante.dungeon.stats.BattleRecord(id9, "", causeOfDeath12, partOfDay14);
    boolean b16 = battleStatisticsQuery3.matches(battleRecord15);
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath17 = battleRecord15.getCauseOfDeath();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath18 = battleRecord15.getCauseOfDeath();
    org.mafagafogigante.dungeon.game.Id id19 = null;
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery21 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath22 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    battleStatisticsQuery21.setCauseOfDeath(causeOfDeath22);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay24 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.stats.BattleRecord battleRecord25 = new org.mafagafogigante.dungeon.stats.BattleRecord(id19, "", causeOfDeath22, partOfDay24);
    org.mafagafogigante.dungeon.stats.BattleRecord battleRecord26 = new org.mafagafogigante.dungeon.stats.BattleRecord(id0, "100.00%", causeOfDeath18, partOfDay24);
    
    // Checks the contract:  equals-hashcode on battleRecord25 and battleRecord25
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on battleRecord25 and battleRecord25", battleRecord25.equals(battleRecord25) ? battleRecord25.hashCode() == battleRecord25.hashCode() : true);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test14"); }

    org.mafagafogigante.dungeon.util.ShuffledRange shuffledRange2 = new org.mafagafogigante.dungeon.util.ShuffledRange((int)'a', (int)(byte)10);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i3 = shuffledRange2.getSize();

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test15"); }

    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery0 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    battleStatisticsQuery0.setType("Damaged");
    battleStatisticsQuery0.setType("");
    org.mafagafogigante.dungeon.date.Date date8 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date12 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i13 = date8.compareTo(date12);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay14 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date8);
    battleStatisticsQuery0.setPartOfDay(partOfDay14);
    org.mafagafogigante.dungeon.game.Id id16 = null;
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery18 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath19 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    battleStatisticsQuery18.setCauseOfDeath(causeOfDeath19);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay21 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.stats.BattleRecord battleRecord22 = new org.mafagafogigante.dungeon.stats.BattleRecord(id16, "", causeOfDeath19, partOfDay21);
    battleStatisticsQuery0.setPartOfDay(partOfDay21);
    
    // Checks the contract:  equals-hashcode on battleRecord22 and battleRecord22
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on battleRecord22 and battleRecord22", battleRecord22.equals(battleRecord22) ? battleRecord22.hashCode() == battleRecord22.hashCode() : true);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test16"); }

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
    java.lang.String str17 = causeOfDeath16.toString();
    
    // Checks the contract:  equals-hashcode on battleRecord13 and battleRecord13
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on battleRecord13 and battleRecord13", battleRecord13.equals(battleRecord13) ? battleRecord13.hashCode() == battleRecord13.hashCode() : true);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test17"); }

    org.mafagafogigante.dungeon.game.PartOfDay partOfDay0 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity1 = partOfDay0.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name2 = partOfDay0.getName();
    java.lang.String str4 = name2.getQuantifiedName((int)'a');
    java.lang.String str5 = name2.getSingular();
    java.lang.String str6 = name2.toString();
    java.lang.String str8 = name2.getQuantifiedName((int)(short)10);
    java.lang.String str9 = name2.getSingular();
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    java.lang.String str11 = name2.getQuantifiedName((int)(short)0);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test18"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.mafagafogigante.dungeon.map.WorldMapWriter.writeDebugMap();

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test19"); }

    org.mafagafogigante.dungeon.commands.IssuedCommand issuedCommand1 = new org.mafagafogigante.dungeon.commands.IssuedCommand("BattleStatistics{records=CounterMap{map={}}}");
    org.mafagafogigante.dungeon.commands.PreparedIssuedCommand preparedIssuedCommand2 = org.mafagafogigante.dungeon.commands.IssuedCommandProcessor.prepareIssuedCommand(issuedCommand1);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    preparedIssuedCommand2.execute();

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test20"); }

    org.mafagafogigante.dungeon.commands.IssuedCommand issuedCommand1 = new org.mafagafogigante.dungeon.commands.IssuedCommand("BattleStatistics{records=CounterMap{map={}}}");
    java.util.List<java.lang.String> list_str2 = issuedCommand1.getTokens();
    org.mafagafogigante.dungeon.util.StopWatch stopWatch3 = new org.mafagafogigante.dungeon.util.StopWatch();
    java.lang.String str4 = stopWatch3.toString();
    java.lang.String str5 = stopWatch3.toString();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.mafagafogigante.dungeon.game.Game.renderTurn(issuedCommand1, stopWatch3);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test21"); }

    org.mafagafogigante.dungeon.game.Id id0 = null;
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery2 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath3 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    battleStatisticsQuery2.setCauseOfDeath(causeOfDeath3);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay5 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.stats.BattleRecord battleRecord6 = new org.mafagafogigante.dungeon.stats.BattleRecord(id0, "", causeOfDeath3, partOfDay5);
    org.mafagafogigante.dungeon.game.Name name7 = partOfDay5.getName();
    
    // Checks the contract:  equals-hashcode on battleRecord6 and battleRecord6
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on battleRecord6 and battleRecord6", battleRecord6.equals(battleRecord6) ? battleRecord6.hashCode() == battleRecord6.hashCode() : true);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test22"); }

    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery0 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    java.lang.String str1 = battleStatisticsQuery0.toString();
    battleStatisticsQuery0.setType("Badly Injured");
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
    battleStatisticsQuery0.setPartOfDay(partOfDay18);
    
    // Checks the contract:  equals-hashcode on battleRecord19 and battleRecord19
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on battleRecord19 and battleRecord19", battleRecord19.equals(battleRecord19) ? battleRecord19.hashCode() == battleRecord19.hashCode() : true);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test23"); }

    org.mafagafogigante.dungeon.util.ShuffledRange shuffledRange2 = new org.mafagafogigante.dungeon.util.ShuffledRange((int)'a', (int)(byte)10);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = shuffledRange2.get((int)(short)1);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test24"); }

    java.lang.String[] str_array2 = new java.lang.String[] { "", "" };
    org.mafagafogigante.dungeon.util.Table table3 = new org.mafagafogigante.dungeon.util.Table(str_array2);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.mafagafogigante.dungeon.achievements.AchievementTrackerWriter.parseCommand(str_array2);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test25"); }

    org.mafagafogigante.dungeon.game.PartOfDay partOfDay0 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity1 = partOfDay0.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name2 = partOfDay0.getName();
    org.mafagafogigante.dungeon.game.QuantificationMode quantificationMode4 = org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER;
    java.lang.String str5 = name2.getQuantifiedName((int)'4', quantificationMode4);
    java.lang.String str7 = name2.getQuantifiedName(3600);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay9 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity10 = partOfDay9.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name11 = partOfDay9.getName();
    org.mafagafogigante.dungeon.game.QuantificationMode quantificationMode13 = org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER;
    java.lang.String str14 = name11.getQuantifiedName((int)'4', quantificationMode13);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    java.lang.String str15 = name2.getQuantifiedName((int)(byte)-1, quantificationMode13);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test26"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.mafagafogigante.dungeon.game.Engine.rollDateAndRefresh((int)(short)1);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test27"); }

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
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath20 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    org.mafagafogigante.dungeon.entity.creatures.HealthState healthState21 = org.mafagafogigante.dungeon.entity.creatures.HealthState.DEAD;
    boolean b22 = causeOfDeath20.equals((java.lang.Object)healthState21);
    java.lang.String[] str_array28 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table29 = new org.mafagafogigante.dungeon.util.Table(str_array28);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString30 = table29.toColoredStringList();
    org.mafagafogigante.dungeon.game.ColoredString coloredString31 = org.mafagafogigante.dungeon.game.Random.select(list_coloredString30);
    boolean b32 = causeOfDeath20.equals((java.lang.Object)list_coloredString30);
    battleStatisticsQuery0.setCauseOfDeath(causeOfDeath20);
    
    // Checks the contract:  equals-hashcode on battleRecord16 and battleRecord16
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on battleRecord16 and battleRecord16", battleRecord16.equals(battleRecord16) ? battleRecord16.hashCode() == battleRecord16.hashCode() : true);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test28"); }

    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset0 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity1 = itemPreset0.getIntegrity();
    itemPreset0.setIntegrityDecrementOnEat((-1));
    itemPreset0.setPutrefactionPeriod((-1L));
    itemPreset0.setDrinkableDoses((int)(short)10);
    itemPreset0.setDrinkableDoses((int)(byte)100);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay10 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity11 = partOfDay10.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name12 = partOfDay10.getName();
    java.lang.String str14 = name12.getQuantifiedName((int)'a');
    java.lang.String str15 = name12.getPlural();
    org.mafagafogigante.dungeon.entity.items.CreatureInventory.SimulationResult simulationResult16 = org.mafagafogigante.dungeon.entity.items.CreatureInventory.SimulationResult.ALREADY_IN_THE_INVENTORY;
    boolean b17 = name12.equals((java.lang.Object)simulationResult16);
    itemPreset0.setName(name12);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay20 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity21 = partOfDay20.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name22 = partOfDay20.getName();
    java.lang.String str24 = name22.getQuantifiedName((int)'a');
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay26 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity27 = partOfDay26.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name28 = partOfDay26.getName();
    org.mafagafogigante.dungeon.game.QuantificationMode quantificationMode30 = org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER;
    java.lang.String str31 = name28.getQuantifiedName((int)'4', quantificationMode30);
    java.lang.String str32 = name22.getQuantifiedName(97, quantificationMode30);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    java.lang.String str33 = name12.getQuantifiedName((int)(short)-1, quantificationMode30);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test29"); }

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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.mafagafogigante.dungeon.achievements.AchievementTrackerWriter.parseCommand(str_array27);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test30"); }

    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery0 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    battleStatisticsQuery0.setType("Damaged");
    org.mafagafogigante.dungeon.game.Id id3 = null;
    battleStatisticsQuery0.setId(id3);
    org.mafagafogigante.dungeon.game.Id id5 = null;
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery7 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath8 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    battleStatisticsQuery7.setCauseOfDeath(causeOfDeath8);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay10 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.stats.BattleRecord battleRecord11 = new org.mafagafogigante.dungeon.stats.BattleRecord(id5, "", causeOfDeath8, partOfDay10);
    boolean b12 = battleStatisticsQuery0.matches(battleRecord11);
    org.mafagafogigante.dungeon.entity.creatures.CreaturePreset creaturePreset13 = new org.mafagafogigante.dungeon.entity.creatures.CreaturePreset();
    org.mafagafogigante.dungeon.entity.Luminosity luminosity14 = creaturePreset13.getLuminosity();
    boolean b15 = battleStatisticsQuery0.equals((java.lang.Object)creaturePreset13);
    
    // Checks the contract:  equals-hashcode on battleRecord11 and battleRecord11
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on battleRecord11 and battleRecord11", battleRecord11.equals(battleRecord11) ? battleRecord11.hashCode() == battleRecord11.hashCode() : true);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test31"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.mafagafogigante.dungeon.game.Engine.rollDateAndRefresh(10);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test32"); }

    org.mafagafogigante.dungeon.game.DungeonString dungeonString1 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString1.append(str_array6);
    java.lang.String[] str_array13 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table14 = new org.mafagafogigante.dungeon.util.Table(str_array13);
    dungeonString1.append(str_array13);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.mafagafogigante.dungeon.achievements.AchievementTrackerWriter.parseCommand(str_array13);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test33"); }

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
    org.mafagafogigante.dungeon.game.Id id20 = null;
    battleStatisticsQuery0.setId(id20);
    
    // Checks the contract:  equals-hashcode on battleRecord16 and battleRecord16
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on battleRecord16 and battleRecord16", battleRecord16.equals(battleRecord16) ? battleRecord16.hashCode() == battleRecord16.hashCode() : true);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test34"); }

    org.mafagafogigante.dungeon.game.Id id0 = null;
    org.mafagafogigante.dungeon.game.Id id2 = null;
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery4 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath5 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    battleStatisticsQuery4.setCauseOfDeath(causeOfDeath5);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay7 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.stats.BattleRecord battleRecord8 = new org.mafagafogigante.dungeon.stats.BattleRecord(id2, "", causeOfDeath5, partOfDay7);
    java.lang.String str9 = battleRecord8.getType();
    org.mafagafogigante.dungeon.game.Id id10 = battleRecord8.getId();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath11 = battleRecord8.getCauseOfDeath();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay12 = null;
    org.mafagafogigante.dungeon.stats.BattleRecord battleRecord13 = new org.mafagafogigante.dungeon.stats.BattleRecord(id0, "hi!", causeOfDeath11, partOfDay12);
    
    // Checks the contract:  equals-hashcode on battleRecord8 and battleRecord8
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on battleRecord8 and battleRecord8", battleRecord8.equals(battleRecord8) ? battleRecord8.hashCode() == battleRecord8.hashCode() : true);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test35"); }

    org.mafagafogigante.dungeon.util.ShuffledRange shuffledRange2 = new org.mafagafogigante.dungeon.util.ShuffledRange((int)(short)0, (int)(short)-1);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = shuffledRange2.get((int)(short)100);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test36"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table6 = new org.mafagafogigante.dungeon.util.Table(str_array5);
    org.mafagafogigante.dungeon.util.Table table7 = new org.mafagafogigante.dungeon.util.Table(str_array5);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.mafagafogigante.dungeon.achievements.AchievementTrackerWriter.parseCommand(str_array5);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test37"); }

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
    org.mafagafogigante.dungeon.entity.Integrity integrity14 = new org.mafagafogigante.dungeon.entity.Integrity((int)(byte)1, (int)(byte)0);
    boolean b15 = integrity14.isZero();
    integrity14.incrementBy(81);
    boolean b18 = integrity14.isZero();
    boolean b19 = battleStatisticsQuery0.equals((java.lang.Object)b18);
    
    // Checks the contract:  equals-hashcode on battleRecord8 and battleRecord8
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on battleRecord8 and battleRecord8", battleRecord8.equals(battleRecord8) ? battleRecord8.hashCode() == battleRecord8.hashCode() : true);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test38"); }

    org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath typeOfCauseOfDeath0 = org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath.SPELL;
    org.mafagafogigante.dungeon.game.Id id1 = null;
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath2 = new org.mafagafogigante.dungeon.stats.CauseOfDeath(typeOfCauseOfDeath0, id1);
    java.lang.String str3 = typeOfCauseOfDeath0.toString();
    
    // Checks the contract:  equals-hashcode on causeOfDeath2 and causeOfDeath2
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on causeOfDeath2 and causeOfDeath2", causeOfDeath2.equals(causeOfDeath2) ? causeOfDeath2.hashCode() == causeOfDeath2.hashCode() : true);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test39"); }

    org.mafagafogigante.dungeon.util.ShuffledRange shuffledRange2 = new org.mafagafogigante.dungeon.util.ShuffledRange((int)'a', (int)'#');
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i3 = shuffledRange2.getSize();

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test40"); }

    org.mafagafogigante.dungeon.util.ShuffledRange shuffledRange2 = new org.mafagafogigante.dungeon.util.ShuffledRange((int)'#', 32);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i3 = shuffledRange2.getSize();

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test41"); }

    org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.CauseOfDeath> countermap_causeOfDeath0 = new org.mafagafogigante.dungeon.util.CounterMap<org.mafagafogigante.dungeon.stats.CauseOfDeath>();
    org.mafagafogigante.dungeon.game.Id id1 = null;
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery3 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath4 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    battleStatisticsQuery3.setCauseOfDeath(causeOfDeath4);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay6 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.stats.BattleRecord battleRecord7 = new org.mafagafogigante.dungeon.stats.BattleRecord(id1, "", causeOfDeath4, partOfDay6);
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath8 = battleRecord7.getCauseOfDeath();
    int i9 = countermap_causeOfDeath0.getCounter(causeOfDeath8);
    
    // Checks the contract:  equals-hashcode on battleRecord7 and battleRecord7
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on battleRecord7 and battleRecord7", battleRecord7.equals(battleRecord7) ? battleRecord7.hashCode() == battleRecord7.hashCode() : true);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test42"); }

    org.mafagafogigante.dungeon.util.ShuffledRange shuffledRange2 = new org.mafagafogigante.dungeon.util.ShuffledRange((int)(short)1, (int)(short)1);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i3 = shuffledRange2.getSize();

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test43"); }

    java.lang.String[] str_array2 = new java.lang.String[] { "", "" };
    org.mafagafogigante.dungeon.util.Table table3 = new org.mafagafogigante.dungeon.util.Table(str_array2);
    org.mafagafogigante.dungeon.wiki.WikiSearcher.search(str_array2);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.mafagafogigante.dungeon.achievements.AchievementTrackerWriter.parseCommand(str_array2);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test44"); }

    java.lang.String[] str_array1 = new java.lang.String[] { "52 Nights" };
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.mafagafogigante.dungeon.achievements.AchievementTrackerWriter.parseCommand(str_array1);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test45"); }

    org.mafagafogigante.dungeon.commands.IssuedCommand issuedCommand1 = new org.mafagafogigante.dungeon.commands.IssuedCommand("the sky is cloudy");
    java.lang.String str2 = issuedCommand1.toString();
    org.mafagafogigante.dungeon.util.StopWatch stopWatch3 = new org.mafagafogigante.dungeon.util.StopWatch();
    java.lang.String str4 = stopWatch3.toString();
    java.lang.String str5 = stopWatch3.toString();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.mafagafogigante.dungeon.game.Game.renderTurn(issuedCommand1, stopWatch3);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test46"); }

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
    java.lang.String str20 = battleStatisticsQuery0.toString();
    
    // Checks the contract:  equals-hashcode on battleRecord16 and battleRecord16
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on battleRecord16 and battleRecord16", battleRecord16.equals(battleRecord16) ? battleRecord16.hashCode() == battleRecord16.hashCode() : true);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test47"); }

    org.mafagafogigante.dungeon.util.ShuffledRange shuffledRange2 = new org.mafagafogigante.dungeon.util.ShuffledRange((int)'a', (int)'#');
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    shuffledRange2.shuffle();

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test48"); }

    org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath typeOfCauseOfDeath0 = org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath.UNARMED;
    java.lang.String str1 = typeOfCauseOfDeath0.toString();
    org.mafagafogigante.dungeon.game.Id id2 = null;
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath3 = new org.mafagafogigante.dungeon.stats.CauseOfDeath(typeOfCauseOfDeath0, id2);
    java.lang.String str4 = typeOfCauseOfDeath0.toString();
    
    // Checks the contract:  equals-hashcode on causeOfDeath3 and causeOfDeath3
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on causeOfDeath3 and causeOfDeath3", causeOfDeath3.equals(causeOfDeath3) ? causeOfDeath3.hashCode() == causeOfDeath3.hashCode() : true);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test49"); }

    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath0 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery1 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    battleStatisticsQuery1.setType("Damaged");
    battleStatisticsQuery1.setType("");
    boolean b6 = causeOfDeath0.equals((java.lang.Object)battleStatisticsQuery1);
    org.mafagafogigante.dungeon.game.Id id7 = null;
    battleStatisticsQuery1.setId(id7);
    org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath typeOfCauseOfDeath9 = org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath.UNARMED;
    java.lang.String str10 = typeOfCauseOfDeath9.toString();
    org.mafagafogigante.dungeon.game.Id id11 = null;
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath12 = new org.mafagafogigante.dungeon.stats.CauseOfDeath(typeOfCauseOfDeath9, id11);
    battleStatisticsQuery1.setCauseOfDeath(causeOfDeath12);
    
    // This assertion (transitivity of equals) fails 
    org.junit.Assert.assertTrue("Contract failed: equals-transitive on causeOfDeath12, causeOfDeath0, and typeOfCauseOfDeath9.", !(causeOfDeath12.equals(causeOfDeath0) && causeOfDeath0.equals(typeOfCauseOfDeath9)) || causeOfDeath12.equals(typeOfCauseOfDeath9));

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test50"); }

    org.mafagafogigante.dungeon.game.Id id0 = null;
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery2 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath3 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    battleStatisticsQuery2.setCauseOfDeath(causeOfDeath3);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay5 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.stats.BattleRecord battleRecord6 = new org.mafagafogigante.dungeon.stats.BattleRecord(id0, "", causeOfDeath3, partOfDay5);
    java.lang.String str7 = partOfDay5.toString();
    
    // Checks the contract:  equals-hashcode on battleRecord6 and battleRecord6
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on battleRecord6 and battleRecord6", battleRecord6.equals(battleRecord6) ? battleRecord6.hashCode() == battleRecord6.hashCode() : true);

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test51"); }

    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery0 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    boolean b2 = battleStatisticsQuery0.equals((java.lang.Object)0.0d);
    org.mafagafogigante.dungeon.game.Id id3 = null;
    battleStatisticsQuery0.setId(id3);
    org.mafagafogigante.dungeon.game.Id id5 = null;
    battleStatisticsQuery0.setId(id5);
    org.mafagafogigante.dungeon.game.Id id7 = null;
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery9 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath10 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    battleStatisticsQuery9.setCauseOfDeath(causeOfDeath10);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay12 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.stats.BattleRecord battleRecord13 = new org.mafagafogigante.dungeon.stats.BattleRecord(id7, "", causeOfDeath10, partOfDay12);
    java.lang.String str14 = battleRecord13.getType();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay15 = battleRecord13.getPartOfDay();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay16 = battleRecord13.getPartOfDay();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath17 = battleRecord13.getCauseOfDeath();
    battleStatisticsQuery0.setCauseOfDeath(causeOfDeath17);
    
    // Checks the contract:  equals-hashcode on battleRecord13 and battleRecord13
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on battleRecord13 and battleRecord13", battleRecord13.equals(battleRecord13) ? battleRecord13.hashCode() == battleRecord13.hashCode() : true);

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test52"); }

    org.mafagafogigante.dungeon.util.ShuffledRange shuffledRange2 = new org.mafagafogigante.dungeon.util.ShuffledRange((int)'#', 32);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = shuffledRange2.get((int)(short)-1);

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test53"); }

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
    org.mafagafogigante.dungeon.game.Direction direction29 = org.mafagafogigante.dungeon.game.Direction.DOWN;
    org.mafagafogigante.dungeon.game.Point point30 = direction29.getOffset();
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset31 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity32 = itemPreset31.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity33 = null;
    itemPreset31.setIntegrity(integrity33);
    org.mafagafogigante.dungeon.util.Percentage percentage35 = itemPreset31.getVisibility();
    org.mafagafogigante.dungeon.entity.Integrity integrity36 = itemPreset31.getIntegrity();
    java.lang.String str37 = itemPreset31.getText();
    java.lang.String str38 = itemPreset31.getType();
    org.mafagafogigante.dungeon.entity.Integrity integrity41 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    boolean b42 = integrity41.isMaximum();
    integrity41.incrementBy((int)(short)0);
    org.mafagafogigante.dungeon.util.Percentage percentage45 = integrity41.toPercentage();
    itemPreset31.setHitRate(percentage45);
    org.mafagafogigante.dungeon.game.Id id48 = new org.mafagafogigante.dungeon.game.Id("100");
    java.lang.String str49 = id48.toString();
    itemPreset31.setId(id48);
    org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath typeOfCauseOfDeath52 = org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath.SPELL;
    org.mafagafogigante.dungeon.game.Id id53 = null;
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath54 = new org.mafagafogigante.dungeon.stats.CauseOfDeath(typeOfCauseOfDeath52, id53);
    java.lang.String str55 = causeOfDeath54.toString();
    org.mafagafogigante.dungeon.date.Date date59 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date63 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i64 = date59.compareTo(date63);
    long long65 = date63.getDay();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay66 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date63);
    org.mafagafogigante.dungeon.stats.BattleRecord battleRecord67 = new org.mafagafogigante.dungeon.stats.BattleRecord(id48, "Disabled LightSource of luminosity of null", causeOfDeath54, partOfDay66);
    explorationStatistics0.createEntryIfNotExists(point30, id48);
    
    // Checks the contract:  equals-hashcode on causeOfDeath54 and causeOfDeath54
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on causeOfDeath54 and causeOfDeath54", causeOfDeath54.equals(causeOfDeath54) ? causeOfDeath54.hashCode() == causeOfDeath54.hashCode() : true);

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test54"); }

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
    org.mafagafogigante.dungeon.game.Id id17 = new org.mafagafogigante.dungeon.game.Id("100");
    java.lang.String str18 = id17.toString();
    itemPreset0.setId(id17);
    org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath typeOfCauseOfDeath21 = org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath.SPELL;
    org.mafagafogigante.dungeon.game.Id id22 = null;
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath23 = new org.mafagafogigante.dungeon.stats.CauseOfDeath(typeOfCauseOfDeath21, id22);
    java.lang.String str24 = causeOfDeath23.toString();
    org.mafagafogigante.dungeon.date.Date date28 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date32 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i33 = date28.compareTo(date32);
    long long34 = date32.getDay();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay35 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date32);
    org.mafagafogigante.dungeon.stats.BattleRecord battleRecord36 = new org.mafagafogigante.dungeon.stats.BattleRecord(id17, "Disabled LightSource of luminosity of null", causeOfDeath23, partOfDay35);
    java.lang.String str37 = id17.toString();
    
    // Checks the contract:  equals-hashcode on battleRecord36 and battleRecord36
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on battleRecord36 and battleRecord36", battleRecord36.equals(battleRecord36) ? battleRecord36.hashCode() == battleRecord36.hashCode() : true);

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test55"); }

    org.mafagafogigante.dungeon.game.DungeonString dungeonString1 = new org.mafagafogigante.dungeon.game.DungeonString("hi!");
    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "Damaged", "BattleStatistics{records=CounterMap{map={}}}", "" };
    dungeonString1.append(str_array6);
    java.lang.String str8 = dungeonString1.toString();
    org.mafagafogigante.dungeon.game.Point point12 = new org.mafagafogigante.dungeon.game.Point(10, (int)'a', 0);
    java.lang.String[] str_array15 = new java.lang.String[] { "", "" };
    org.mafagafogigante.dungeon.util.Table table16 = new org.mafagafogigante.dungeon.util.Table(str_array15);
    boolean b17 = point12.equals((java.lang.Object)str_array15);
    dungeonString1.append(str_array15);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.mafagafogigante.dungeon.achievements.AchievementTrackerWriter.parseCommand(str_array15);

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test56"); }

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
    java.lang.String str16 = causeOfDeath2.toString();
    
    // Checks the contract:  equals-hashcode on battleRecord15 and battleRecord15
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on battleRecord15 and battleRecord15", battleRecord15.equals(battleRecord15) ? battleRecord15.hashCode() == battleRecord15.hashCode() : true);

  }

  @Test
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test57"); }

    org.mafagafogigante.dungeon.commands.IssuedCommand issuedCommand1 = new org.mafagafogigante.dungeon.commands.IssuedCommand("BattleStatistics{records=CounterMap{map={}}}");
    java.lang.String str2 = issuedCommand1.toString();
    org.mafagafogigante.dungeon.commands.PreparedIssuedCommand preparedIssuedCommand3 = org.mafagafogigante.dungeon.commands.IssuedCommandProcessor.prepareIssuedCommand(issuedCommand1);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    preparedIssuedCommand3.execute();

  }

  @Test
  public void test58() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test58"); }

    org.mafagafogigante.dungeon.game.PartOfDay partOfDay0 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity1 = partOfDay0.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name2 = partOfDay0.getName();
    java.lang.String str4 = name2.getQuantifiedName((int)'a');
    java.lang.String str5 = name2.getSingular();
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    java.lang.String str7 = name2.getQuantifiedName((int)(short)0);

  }

  @Test
  public void test59() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test59"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.mafagafogigante.dungeon.game.Engine.rollDateAndRefresh(3);

  }

  @Test
  public void test60() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test60"); }

    org.mafagafogigante.dungeon.game.PartOfDay partOfDay0 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity1 = partOfDay0.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name2 = partOfDay0.getName();
    java.lang.String str4 = name2.getQuantifiedName((int)'a');
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay6 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity7 = partOfDay6.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name8 = partOfDay6.getName();
    org.mafagafogigante.dungeon.game.QuantificationMode quantificationMode10 = org.mafagafogigante.dungeon.game.QuantificationMode.NUMBER;
    java.lang.String str11 = name8.getQuantifiedName((int)'4', quantificationMode10);
    java.lang.String str12 = name2.getQuantifiedName(97, quantificationMode10);
    java.lang.String str14 = name2.getQuantifiedName(38);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset16 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity17 = itemPreset16.getIntegrity();
    org.mafagafogigante.dungeon.util.Percentage percentage18 = itemPreset16.getVisibility();
    java.lang.String str19 = itemPreset16.getType();
    itemPreset16.setDrinkableHealing(10);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay22 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity23 = partOfDay22.getLuminosity();
    org.mafagafogigante.dungeon.game.Name name24 = partOfDay22.getName();
    java.lang.String str26 = name24.getQuantifiedName((int)'a');
    java.lang.String str27 = name24.getSingular();
    java.lang.String str28 = name24.toString();
    java.lang.String str29 = name24.getSingular();
    itemPreset16.setName(name24);
    org.mafagafogigante.dungeon.game.QuantificationMode quantificationMode32 = org.mafagafogigante.dungeon.game.QuantificationMode.WORD;
    java.lang.String str33 = name24.getQuantifiedName(81, quantificationMode32);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    java.lang.String str34 = name2.getQuantifiedName(0, quantificationMode32);

  }

  @Test
  public void test61() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test61"); }

    org.mafagafogigante.dungeon.game.Id id0 = null;
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery2 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath3 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    battleStatisticsQuery2.setCauseOfDeath(causeOfDeath3);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay5 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.stats.BattleRecord battleRecord6 = new org.mafagafogigante.dungeon.stats.BattleRecord(id0, "", causeOfDeath3, partOfDay5);
    java.lang.String str7 = battleRecord6.getType();
    org.mafagafogigante.dungeon.game.Id id8 = battleRecord6.getId();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath9 = battleRecord6.getCauseOfDeath();
    boolean b11 = causeOfDeath9.equals((java.lang.Object)"One");
    
    // Checks the contract:  equals-hashcode on battleRecord6 and battleRecord6
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on battleRecord6 and battleRecord6", battleRecord6.equals(battleRecord6) ? battleRecord6.hashCode() == battleRecord6.hashCode() : true);

  }

  @Test
  public void test62() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test62"); }

    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery0 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath1 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    battleStatisticsQuery0.setCauseOfDeath(causeOfDeath1);
    org.mafagafogigante.dungeon.entity.items.ItemPreset itemPreset3 = new org.mafagafogigante.dungeon.entity.items.ItemPreset();
    org.mafagafogigante.dungeon.entity.Integrity integrity4 = itemPreset3.getIntegrity();
    org.mafagafogigante.dungeon.entity.Integrity integrity5 = null;
    itemPreset3.setIntegrity(integrity5);
    org.mafagafogigante.dungeon.util.Percentage percentage7 = itemPreset3.getVisibility();
    org.mafagafogigante.dungeon.entity.Integrity integrity8 = itemPreset3.getIntegrity();
    java.lang.String str9 = itemPreset3.getText();
    java.lang.String str10 = itemPreset3.getType();
    org.mafagafogigante.dungeon.entity.Integrity integrity13 = new org.mafagafogigante.dungeon.entity.Integrity(1, 0);
    boolean b14 = integrity13.isMaximum();
    integrity13.incrementBy((int)(short)0);
    org.mafagafogigante.dungeon.util.Percentage percentage17 = integrity13.toPercentage();
    itemPreset3.setHitRate(percentage17);
    org.mafagafogigante.dungeon.game.Id id20 = new org.mafagafogigante.dungeon.game.Id("100");
    java.lang.String str21 = id20.toString();
    itemPreset3.setId(id20);
    org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath typeOfCauseOfDeath24 = org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath.SPELL;
    org.mafagafogigante.dungeon.game.Id id25 = null;
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath26 = new org.mafagafogigante.dungeon.stats.CauseOfDeath(typeOfCauseOfDeath24, id25);
    java.lang.String str27 = causeOfDeath26.toString();
    org.mafagafogigante.dungeon.date.Date date31 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date35 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i36 = date31.compareTo(date35);
    long long37 = date35.getDay();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay38 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date35);
    org.mafagafogigante.dungeon.stats.BattleRecord battleRecord39 = new org.mafagafogigante.dungeon.stats.BattleRecord(id20, "Disabled LightSource of luminosity of null", causeOfDeath26, partOfDay38);
    battleStatisticsQuery0.setId(id20);
    
    // Checks the contract:  equals-hashcode on battleRecord39 and battleRecord39
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on battleRecord39 and battleRecord39", battleRecord39.equals(battleRecord39) ? battleRecord39.hashCode() == battleRecord39.hashCode() : true);

  }

  @Test
  public void test63() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test63"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.mafagafogigante.dungeon.game.Engine.rollDateAndRefresh(4);

  }

  @Test
  public void test64() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test64"); }

    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery0 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement battleStatisticsRequirement2 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsRequirement(battleStatisticsQuery0, (int)(byte)100);
    org.mafagafogigante.dungeon.game.Id id3 = null;
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath5 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    org.mafagafogigante.dungeon.entity.creatures.HealthState healthState6 = org.mafagafogigante.dungeon.entity.creatures.HealthState.DEAD;
    boolean b7 = causeOfDeath5.equals((java.lang.Object)healthState6);
    java.lang.String[] str_array13 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table14 = new org.mafagafogigante.dungeon.util.Table(str_array13);
    java.util.List<org.mafagafogigante.dungeon.game.ColoredString> list_coloredString15 = table14.toColoredStringList();
    boolean b16 = causeOfDeath5.equals((java.lang.Object)table14);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay17 = org.mafagafogigante.dungeon.game.PartOfDay.NOON;
    org.mafagafogigante.dungeon.stats.BattleRecord battleRecord18 = new org.mafagafogigante.dungeon.stats.BattleRecord(id3, "East", causeOfDeath5, partOfDay17);
    java.lang.String str19 = battleRecord18.toString();
    boolean b20 = battleStatisticsQuery0.matches(battleRecord18);
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath21 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    org.mafagafogigante.dungeon.entity.creatures.HealthState healthState22 = org.mafagafogigante.dungeon.entity.creatures.HealthState.DEAD;
    boolean b23 = causeOfDeath21.equals((java.lang.Object)healthState22);
    battleStatisticsQuery0.setCauseOfDeath(causeOfDeath21);
    
    // Checks the contract:  equals-hashcode on battleRecord18 and battleRecord18
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on battleRecord18 and battleRecord18", battleRecord18.equals(battleRecord18) ? battleRecord18.hashCode() == battleRecord18.hashCode() : true);

  }

  @Test
  public void test65() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test65"); }

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
    java.lang.String str15 = itemPreset0.getText();
    org.mafagafogigante.dungeon.date.Date date19 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date23 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i24 = date19.compareTo(date23);
    long long25 = date23.getDay();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay26 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    int i27 = org.mafagafogigante.dungeon.game.PartOfDay.getSecondsToNext(date23, partOfDay26);
    long long28 = date23.getYear();
    org.mafagafogigante.dungeon.date.Date date35 = new org.mafagafogigante.dungeon.date.Date((long)(byte)0, (long)0, (long)81, (long)10, 100L, (long)(short)1);
    java.lang.String str36 = date35.toDateString();
    org.mafagafogigante.dungeon.date.Date date40 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date44 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i45 = date40.compareTo(date44);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay46 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date40);
    long long47 = date40.getYear();
    org.mafagafogigante.dungeon.date.Duration duration48 = new org.mafagafogigante.dungeon.date.Duration(date35, date40);
    long long49 = date35.getMonth();
    int i50 = date23.compareTo(date35);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.mafagafogigante.dungeon.entity.items.Item item51 = new org.mafagafogigante.dungeon.entity.items.Item(itemPreset0, date23);

  }

  @Test
  public void test66() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test66"); }

    org.mafagafogigante.dungeon.util.ShuffledRange shuffledRange2 = new org.mafagafogigante.dungeon.util.ShuffledRange((int)(short)0, (int)(short)-1);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = shuffledRange2.get(4);

  }

  @Test
  public void test67() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test67"); }

    org.mafagafogigante.dungeon.game.Id id0 = null;
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery2 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath3 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    battleStatisticsQuery2.setCauseOfDeath(causeOfDeath3);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay5 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.stats.BattleRecord battleRecord6 = new org.mafagafogigante.dungeon.stats.BattleRecord(id0, "", causeOfDeath3, partOfDay5);
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath7 = battleRecord6.getCauseOfDeath();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay8 = battleRecord6.getPartOfDay();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath9 = battleRecord6.getCauseOfDeath();
    java.lang.String str10 = causeOfDeath9.toString();
    
    // Checks the contract:  equals-hashcode on battleRecord6 and battleRecord6
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on battleRecord6 and battleRecord6", battleRecord6.equals(battleRecord6) ? battleRecord6.hashCode() == battleRecord6.hashCode() : true);

  }

  @Test
  public void test68() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test68"); }

    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery0 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    java.lang.String str1 = battleStatisticsQuery0.toString();
    battleStatisticsQuery0.setType("Badly Injured");
    org.mafagafogigante.dungeon.date.Date date10 = new org.mafagafogigante.dungeon.date.Date((long)100, 100L, (long)81, (long)(byte)-1, (long)152, (-1L));
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay11 = org.mafagafogigante.dungeon.game.PartOfDay.DUSK;
    int i12 = org.mafagafogigante.dungeon.game.PartOfDay.getSecondsToNext(date10, partOfDay11);
    battleStatisticsQuery0.setPartOfDay(partOfDay11);
    org.mafagafogigante.dungeon.game.Id id14 = null;
    org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery battleStatisticsQuery16 = new org.mafagafogigante.dungeon.achievements.BattleStatisticsQuery();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath17 = org.mafagafogigante.dungeon.stats.CauseOfDeath.getUnarmedCauseOfDeath();
    battleStatisticsQuery16.setCauseOfDeath(causeOfDeath17);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay19 = org.mafagafogigante.dungeon.game.PartOfDay.NIGHT;
    org.mafagafogigante.dungeon.stats.BattleRecord battleRecord20 = new org.mafagafogigante.dungeon.stats.BattleRecord(id14, "", causeOfDeath17, partOfDay19);
    java.lang.String str21 = battleRecord20.getType();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay22 = battleRecord20.getPartOfDay();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay23 = battleRecord20.getPartOfDay();
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath24 = battleRecord20.getCauseOfDeath();
    boolean b25 = battleStatisticsQuery0.matches(battleRecord20);
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay26 = org.mafagafogigante.dungeon.game.PartOfDay.MIDNIGHT;
    org.mafagafogigante.dungeon.entity.Luminosity luminosity27 = partOfDay26.getLuminosity();
    battleStatisticsQuery0.setPartOfDay(partOfDay26);
    
    // Checks the contract:  equals-hashcode on battleRecord20 and battleRecord20
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on battleRecord20 and battleRecord20", battleRecord20.equals(battleRecord20) ? battleRecord20.hashCode() == battleRecord20.hashCode() : true);

  }

  @Test
  public void test69() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test69"); }

    org.mafagafogigante.dungeon.commands.IssuedCommand issuedCommand1 = new org.mafagafogigante.dungeon.commands.IssuedCommand("ItemIntegrity{integrity=0/1, item=null}");
    org.mafagafogigante.dungeon.commands.PreparedIssuedCommand preparedIssuedCommand2 = org.mafagafogigante.dungeon.commands.IssuedCommandProcessor.prepareIssuedCommand(issuedCommand1);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    preparedIssuedCommand2.execute();

  }

  @Test
  public void test70() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test70"); }

    org.mafagafogigante.dungeon.entity.items.Item[] item_array0 = new org.mafagafogigante.dungeon.entity.items.Item[] {  };
    java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item> arraylist_item1 = new java.util.ArrayList<org.mafagafogigante.dungeon.entity.items.Item>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item1, item_array0);
    java.lang.String[] str_array8 = new java.lang.String[] { "CounterMap{map={}}", "User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 34.4 MiB out of the allocated 123.0 MiB\nOS: Windows 10 (amd64) 10.0", "hi!", "0 ms", "User: Nicholas\nTime: 15:42:12\nDate: 2017-04-09\nJava: Java version 1.8.0_121 by Oracle Corporation\nHeap: Using 41.5 MiB out of the allocated 154.5 MiB\nOS: Windows 10 (amd64) 10.0" };
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item9 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems((java.util.List<org.mafagafogigante.dungeon.entity.items.Item>)arraylist_item1, str_array8);
    java.lang.String[] str_array15 = new java.lang.String[] { "hi!", "visibilityCriteria=VisibilityCriteria{[]}", "visibilityCriteria=VisibilityCriteria{[]}", "Damaged", "hi!" };
    org.mafagafogigante.dungeon.util.Table table16 = new org.mafagafogigante.dungeon.util.Table(str_array15);
    java.util.List<org.mafagafogigante.dungeon.entity.items.Item> list_item17 = org.mafagafogigante.dungeon.entity.creatures.HeroUtils.findItems(list_item9, str_array15);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.mafagafogigante.dungeon.achievements.AchievementTrackerWriter.parseCommand(str_array15);

  }

  @Test
  public void test71() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test71"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.mafagafogigante.dungeon.game.Engine.rollDateAndRefresh((int)(short)10);

  }

  @Test
  public void test72() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test72"); }

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
    org.mafagafogigante.dungeon.game.Id id17 = new org.mafagafogigante.dungeon.game.Id("100");
    java.lang.String str18 = id17.toString();
    itemPreset0.setId(id17);
    org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath typeOfCauseOfDeath21 = org.mafagafogigante.dungeon.stats.TypeOfCauseOfDeath.SPELL;
    org.mafagafogigante.dungeon.game.Id id22 = null;
    org.mafagafogigante.dungeon.stats.CauseOfDeath causeOfDeath23 = new org.mafagafogigante.dungeon.stats.CauseOfDeath(typeOfCauseOfDeath21, id22);
    java.lang.String str24 = causeOfDeath23.toString();
    org.mafagafogigante.dungeon.date.Date date28 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    org.mafagafogigante.dungeon.date.Date date32 = new org.mafagafogigante.dungeon.date.Date(10L, 100L, 100L);
    int i33 = date28.compareTo(date32);
    long long34 = date32.getDay();
    org.mafagafogigante.dungeon.game.PartOfDay partOfDay35 = org.mafagafogigante.dungeon.game.PartOfDay.getCorrespondingConstant(date32);
    org.mafagafogigante.dungeon.stats.BattleRecord battleRecord36 = new org.mafagafogigante.dungeon.stats.BattleRecord(id17, "Disabled LightSource of luminosity of null", causeOfDeath23, partOfDay35);
    java.lang.String str37 = partOfDay35.toString();
    
    // Checks the contract:  equals-hashcode on battleRecord36 and battleRecord36
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on battleRecord36 and battleRecord36", battleRecord36.equals(battleRecord36) ? battleRecord36.hashCode() == battleRecord36.hashCode() : true);

  }

  @Test
  public void test73() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test73"); }

    org.mafagafogigante.dungeon.util.ShuffledRange shuffledRange2 = new org.mafagafogigante.dungeon.util.ShuffledRange((int)'a', (int)(byte)10);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    shuffledRange2.shuffle();

  }

}
