package com.shatteredpixel.shatteredpixeldungeon.ui.changelist;

import com.shatteredpixel.shatteredpixeldungeon.Assets;
import com.shatteredpixel.shatteredpixeldungeon.items.weapon.melee.Sword;
import com.shatteredpixel.shatteredpixeldungeon.messages.Messages;
import com.shatteredpixel.shatteredpixeldungeon.scenes.ChangesScene;
import com.shatteredpixel.shatteredpixeldungeon.sprites.*;
import com.shatteredpixel.shatteredpixeldungeon.ui.Icons;
import com.watabou.noosa.Image;

import java.util.ArrayList;

public class vShort_Changes {
    public static void addAllChanges( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("Short-1.6", true, "");
        changes.hardlight(0xCCCCCC);
        changeInfos.add(changes);
        changes.addButton( new ChangeButton(Icons.get(Icons.SHORTER_CHEST), "Developer Commentary",
                "_-_ Released March 14th, 2025"));
        changes.addButton(new ChangeButton(Icons.get(Icons.SHPX), "ShatteredPD",
                "_-_ Ported everything from Shattered 3.0.1."));

        changes = new ChangeInfo("Short-1.5", true, "");
        changes.hardlight(0xCCCCCC);
        changeInfos.add(changes);
        changes.addButton( new ChangeButton(Icons.get(Icons.SHORTER_CHEST), "Developer Commentary",
                "_-_ Released September 20th, 2024"));
        changes.addButton(new ChangeButton(Icons.get(Icons.SHPX), "ShatteredPD",
                "_-_ Ported everything from Shattered 2.5.2."));

        changes = new ChangeInfo("Short-1.4", true, "");
        changes.hardlight(0xCCCCCC);
        changeInfos.add(changes);
        changes.addButton( new ChangeButton(Icons.get(Icons.SHORTER_CHEST), "Developer Commentary",
                "_-_ Released May 26th, 2024"));
        changes.addButton(new ChangeButton(Icons.get(Icons.SHPX), "ShatteredPD",
                "_-_ Ported everything from Shattered 2.4.1.\n" +
                        "_-_ Reintroduced alt variants and increased their chance to appear from 1/50 to 1/30."));
        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), Messages.get(ChangesScene.class, "misc"),
                "_-_ Fixed next chapter mob spawns not accounting for Shorter's chapter length."));

        changes = new ChangeInfo("Short-1.3", true, "");
        changes.hardlight(0xCCCCCC);
        changeInfos.add(changes);
        changes.addButton( new ChangeButton(Icons.get(Icons.SHORTER_CHEST), "Developer Commentary",
                "_-_ Released December 6th, 2023"));
        changes.addButton(new ChangeButton(Icons.get(Icons.SHPX), "ShatteredPD",
                "_-_ Ported everything from Shattered 2.2.1.\n" +
                        "_-_ Removed replacements for consumable talents, as Shattered actually made them decent."));

        changes = new ChangeInfo("Short-1.2", true, "");
        changes.hardlight(0xCCCCCC);
        changeInfos.add(changes);
        changes.addButton( new ChangeButton(Icons.get(Icons.SHORTER_CHEST), "Developer Commentary",
                "_-_ Released September 6th, 2023"));
        changes.addButton(new ChangeButton(Icons.get(Icons.SHPX), "ShatteredPD",
                "_-_ Ported everything from Shattered 2.1.4."));

        changes = new ChangeInfo("Short-1.1", true, "");
        changes.hardlight(0xCCCCCC);
        changeInfos.add(changes);
        changes.addButton( new ChangeButton(Icons.get(Icons.SHORTER_CHEST), "Developer Commentary",
                "_-_ Released March 13th, 2023"));
        changes.addButton(new ChangeButton(Icons.get(Icons.SHPX), "ShatteredPD",
                "_-_ Ported everything from Shattered 2.0."));
        changes.addButton(new ChangeButton(Icons.get(Icons.CHANGES), "Changelogs",
                "_-_ Reorganized Shorter's changelog into its category."));

        changes = new ChangeInfo("Short-1.0.8", true, "");
        changes.hardlight(0xCCCCCC);
        changeInfos.add(changes);
        changes.addButton( new ChangeButton(Icons.get(Icons.SHORTER_CHEST), "Developer Commentary",
                "_-_ Released October 5th, 2022"));
        changes.addButton(new ChangeButton(Icons.get(Icons.SHPX), "ShatteredPD",
                "_-_ Ported everything from Shattered 1.4."));

        changes = new ChangeInfo("Short-1.0.7", true, "");
        changes.hardlight(0xCCCCCC);
        changeInfos.add(changes);
        changes.addButton( new ChangeButton(Icons.get(Icons.SHORTER_CHEST), "Developer Commentary",
                "_-_ Released September 13th, 2022"));
        changes.addButton(new ChangeButton(Icons.get(Icons.SHPX), "ShatteredPD",
                "_-_ Ported everything from Shattered 1.3.2."));

        changes = new ChangeInfo("Short-1.0.6", true, "");
        changes.hardlight(0xCCCCCC);
        changeInfos.add(changes);
        changes.addButton( new ChangeButton(Icons.get(Icons.SHORTER_CHEST), "Developer Commentary",
                "_-_ Released April 12th, 2022"));
        changes.addButton(new ChangeButton(Icons.get(Icons.SHPX), "ShatteredPD",
                "_-_ Ported everything from Shattered 1.2.2."));
        changes.addButton(new ChangeButton(new ItemSprite(new Sword()), "Equipment",
                "_-_ Reduced weapon damage again.\n" +
                        "_-_ Reduced amount of XP required to level up.\n" +
                        "_-_ Reduced amount of items spawning on level."));
        changes.addButton(new ChangeButton(new RatSprite(), "Mobs",
                "_-_ Reduced HP numbers.\n" +
                        "_-_ Increased respawning cooldown from 50 to 80."));

        changes = new ChangeInfo("Short-1.0.5", true, "");
        changes.hardlight(0xCCCCCC);
        changeInfos.add(changes);
        changes.addButton( new ChangeButton(Icons.get(Icons.SHORTER_CHEST), "Developer Commentary",
                "_-_ Released January 21th, 2022"));
        changes.addButton(new ChangeButton(Icons.get(Icons.SHPX), "ShatteredPD",
                "_-_ Fixed laboratory rooms not appearing.\n\n" +
                        "_-_ Fixed debug thing on Dwarf King.\n\n" +
                        "_-_ Fixed wrong music playing on levels."));

        changes = new ChangeInfo("Short-1.0.4", true, "");
        changes.hardlight(0xCCCCCC);
        changeInfos.add(changes);
        changes.addButton( new ChangeButton(Icons.get(Icons.SHORTER_CHEST), "Developer Commentary",
                "_-_ Released December 23th, 2021"));
        changes.addButton(new ChangeButton(Icons.get(Icons.SHPX), "ShatteredPD",
                "_-_ Ported everything from Shattered 1.1."));

        changes = new ChangeInfo("Short-1.0.3", true, "");
        changes.hardlight(0xCCCCCC);
        changeInfos.add(changes);
        changes.addButton( new ChangeButton(Icons.get(Icons.SHORTER_CHEST), "Developer Commentary",
                "_-_ Released December 4th, 2021"));
        changes.addButton(new ChangeButton(new ItemSprite(new Sword()), "Equipment",
                "_-_ Armors and weapons (except spirit bow) have 25% less max scaling."));
        changes.addButton(new ChangeButton(new KingSprite(), "DK",
                "Fixed impossible phase 2."));

        changes = new ChangeInfo("Short-1.0.2", true, "");
        changes.hardlight(0xCCCCCC);
        changeInfos.add(changes);
        changes.addButton(new ChangeButton(new RatSprite(), "Sewer enemy adjustments",
                "_-_ Rat's HP is reduced from 6 to 5.\n" +
                        "_-_ Gnoll's HP is reduced from 9 to 8.\n" +
                        "_-_ Crab's HP is reduced from 11 to 10.\n" +
                        "_-_ Goo's HP is reduced from 80/96 to 70/84 and its damage is reduced from 0-7 to 0-6."));
        changes.addButton(new ChangeButton(new SkeletonSprite(), "Prison enemy adjustments",
                "_-_ Skeleton's HP is reduced from 16 to 14.\n" +
                        "_-_ Thief's HP is reduced from 13 to 12.\n" +
                        "_-_ DM-100's HP is reduced from 15 to 12.\n" +
                        "_-_ Necromancer's HP is reduced from 22 to 18.\n" +
                        "_-_ Tengu's HP is reduced from 120/140 to 100/116."));
        changes.addButton(new ChangeButton(new SpinnerSprite(), "Caves enemy adjustments",
                "_-_ Bat's HP is reduced from 24 to 21 and its damage is reduced from 3-13 to 2-10.\n" +
                        "_-_ Brute's HP is reduced from 32 to 27 and its damage is reduced from 3-18/6-27 to 2-15/4-23.\n" +
                        "_-_ Shaman's HP is reduced from 25 to 22 and its damage is reduced from 3-8/5-11 to 2-8/3-11.\n" +
                        "_-_ DM-200's HP is reduced from 50 to 36 and its damage is reduced from 6-18 to 4-14.\n" +
                        "_-_ DM-300's HP is reduced from 240/320 to 180/240 and its damage is reduced from 10-18 to 6-15."));
        changes.addButton(new ChangeButton(new GhoulSprite(), "City enemy adjustments",
                "_-_ Ghoul's HP is reduced from 30 to 24 and its damage is reduced from 10-17 to 6-15.\n" +
                        "_-_ Elemental's HP is reduced from 42 to 36 and its damage is reduced from 12-19 to 8-16.\n" +
                        "_-_ Monk's HP is reduced from 50 to 38 and its damage is reduced from 10-18 to 7-15.\n" +
                        "_-_ Warlock's HP is reduced from 55 to 42 and its damage is reduced from 10-16/9-15 to 8-14/6-12.\n" +
                        "_-_ DK's HP is reduced from 240/360 to 180/270 and its damage is reduced from 12-20 to 9-17."));
        changes.addButton(new ChangeButton(new EyeSprite(), "Halls enemy adjustments",
                "_-_ Ripper's HP is reduced from 44 to 35 and its damage is reduced from 12-19 to 9-16.\n" +
                        "_-_ Succubus's HP is reduced from 64 to 50 and its damage is reduced from 15-23 to 11-18.\n" +
                        "_-_ Eye's HP is reduced from 72 to 58 and its damage is reduced from 14-22/21-34 to 10-19/17-28.\n" +
                        "_-_ Scorpio's HP is reduced from 78 to 60 and its damage is reduced from 16-24 to 12-19.\n" +
                        "_-_ Yog's HP is reduced from 1000 to 500.\n" +
                        "_-_ Yog fist's HP is reduced from 300 to 150 and its damage is reduced from 13-25 to 9-19.\n"+
                        "_-_ Rusted fist's damage is reduced from 17-32 to 14-26.\n" +
                        "_-_ Bright and dark fist's damage is reduced from 10-20 to 8-16.\n" +
                        "_-_ God larva's HP is reduced from 15 to 12 and its damage is reduced from 12-17 to 9-15."));
        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), Messages.get(ChangesScene.class, "misc"),
                "_-_ Fixed Ring of Force's excess power.\n" +
                        "_-_ All chapters are same size.\n" +
                        "_-_ Decreased shop's prices by 2x.\n" +
                        "_-_ Reduced level requirements and amount of mobs.\n" +
                        "_-_ Reverted Bleeding change.\n" +
                        "_-_ Buffed many wands by 20%-40%.\n" +
                        "_-_ Ghost quest enemies have 2x less HP."));

        changes = new ChangeInfo("Short-1.0.1", true, "");
        changes.hardlight(0xCCCCCC);
        changeInfos.add(changes);

        changes.addButton( new ChangeButton(Icons.get(Icons.SHORTER_CHEST), "Developer Commentary",
                "_-_ Released November 13th, 2021\n" +
                        "\n" +
                        "Looks like not everything was very balanced."));

        changes.addButton(new ChangeButton(Icons.get(Icons.TALENT), "Levelling and Talents",
                "_-_ Added 1 talent point at each tier. Some levels can give you two points now.\n\n" +
                        "_-_ Dwarf Warlock and Demon Halls mobs give 1 extra EXP." ));

        changes.addButton(new ChangeButton(new ItemSprite(new Sword()), "Equipment",
                "_-_ Nerfed missile weapons and Ring of Force to be more in line with existing melee weapons.\n\n" +
                        "_-_ Rebalanced armors: +1 min scaling, but base scaling down to 2*tier-1." ));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), Messages.get(ChangesScene.class, "misc"),
                "_-_ Increased hunger rate."));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "_-_ Fixed chapter story windows displaying at wrong depths.\n\n" +
                        "_-_ Fixed too high shop prices."));

        changes = new ChangeInfo("Short-1.0.0", true, "");
        changes.hardlight(0xCCCCCC);
        changeInfos.add(changes);

        changes.addButton( new ChangeButton(Icons.get(Icons.SHORTER_CHEST), "Developer Commentary",
                "_-_ Released November 11th, 2021\n" +
                        "\n" +
                        "This was an idea even back in February, but I just got enough bored to implement that."));

        changes.addButton(new ChangeButton(Icons.get(Icons.DEPTH), "Shorter Dungeon",
                "_-_ The amount of floors have been reduced from 26 to 21.\n\n" +
                        "_-_ All rooms are normally sized.\n\n" +
                        "_-_ Level sizes are smaller.\n\n" +
                        "_-_ Reduced amount of traps and enemies on each stage."));



        changes.addButton(new ChangeButton(Icons.get(Icons.TALENT), "Levelling and Talents",
                "_-_ Hero's max level with enemies is reduced to 21 from 28 and cap has been decreased to 24.\n\n" +
                        "_-_ Talent points have been reduced to 3/4/6/7 from 5/6/8/10.\n\n" +
                        "_-_ Bunch of early-game talents have been buffed.\n\n" +
                        "_-_ Reduced EXP requirements by 20%." ));

        changes.addButton(new ChangeButton(new ItemSprite(new Sword()), "Equipment",
                "_-_ Max strength is 15 instead of 20, all equipment have been adjusted for that.\n\n" +
                        "_-_ Nerfed melee, ranged and magical weapons by 20%-40%.\n\n" +
                        "_-_ Nerfed armor blocking power by ~25%.\n\n" +
                        "_-_ Only 5 strength pots and 8 upgrade scrolls spawn in the dungeon.\n\n" +
                        "_-_ Cloak of Shadows upgrades faster to account for reduced level cap." ));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.RAT, 0, 0, 16, 16), "Enemy changes",
                "_-_ Most of monsters have reduced stats to fit new progression.\n\n" +
                        "_-_ Slimes, Prison Guards, Cave Spinners and Golems have been effectively removed from the game.\n\n" +
                        "_-_ Reduced amount of EXP rewarded from each monster."));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), Messages.get(ChangesScene.class, "misc"),
                "_-_ Buffed armor ability recharge time by 2x.\n\n" +
                        "_-_ Nerfed certain debuffs."));

        changes = new ChangeInfo("\n\n\n\n", true, "");
        changes.hardlight(0xCCCCCC);
        changeInfos.add(changes);
    }
}
