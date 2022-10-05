package com.shatteredpixel.shatteredpixeldungeon.ui.changelist;

import com.shatteredpixel.shatteredpixeldungeon.Assets;
import com.shatteredpixel.shatteredpixeldungeon.actors.mobs.DwarfKing;
import com.shatteredpixel.shatteredpixeldungeon.items.bombs.WoollyBomb;
import com.shatteredpixel.shatteredpixeldungeon.items.scrolls.exotic.ScrollOfMetamorphosis;
import com.shatteredpixel.shatteredpixeldungeon.items.weapon.melee.MagesStaff;
import com.shatteredpixel.shatteredpixeldungeon.items.weapon.melee.Sword;
import com.shatteredpixel.shatteredpixeldungeon.messages.Messages;
import com.shatteredpixel.shatteredpixeldungeon.scenes.ChangesScene;
import com.shatteredpixel.shatteredpixeldungeon.sprites.*;
import com.shatteredpixel.shatteredpixeldungeon.ui.Icons;
import com.shatteredpixel.shatteredpixeldungeon.ui.Window;
import com.watabou.noosa.Image;

import java.util.ArrayList;

public class v1_X_Changes {

	public static void addAllChanges( ArrayList<ChangeInfo> changeInfos ){
		ChangeInfo changes = new ChangeInfo("Short-1.0.8", true, "");
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

		add_v1_0_Changes(changeInfos);
	}

	public static void add_v1_0_Changes( ArrayList<ChangeInfo> changeInfos ) {

		ChangeInfo changes = new ChangeInfo("v1.0.0", true, "");
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes = new ChangeInfo("v1.0.3", false, null);
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
				"Fixed (caused by 1.0.2):\n" +
				"_-_ Reclaim Trap spells incorrectly starting with a summoning trap reclaimed\n\n" +
				"Fixed (caused by 1.0.1):\n" +
				"_-_ Music corruption and crashes for Desktop users\n\n" +
				"Fixed (caused by 1.0.0):\n" +
				"_-_ Various rare game crashes\n" +
				"_-_ Some items being treated as equipped after save/load with lost inventory\n" +
				"_-_ Cases where liquid metal could be applied to items at full durability\n\n" +
				"Fixed (existed prior to 1.0.0):\n" +
				"_-_ Minor text and vfx corrections"));

		changes = new ChangeInfo("v1.0.2 & v1.0.1", false, null);
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
				"Fixed (caused by 1.0.1):\n" +
				"_-_ Additional crashes caused by the new music system\n\n" +
				"Fixed (caused by 1.0.0):\n" +
				"_-_ Negative STR bonuses not displaying separately\n" +
				"_-_ Elemental Power talent not being buffed as intended\n" +
				"_-_ Geyser traps rarely knocking the hero into other characters\n" +
				"_-_ Unbreakable traps breaking in more rare cases\n" +
				"_-_ Hasty Retreat talent giving fewer turns of haste/invis than intended\n\n" +
				"Fixed (existed prior to 1.0.0):\n" +
				"_-_ minor vfx corrections\n" +
				"_-_ Time stasis sometimes not preventing harmful effects in its last turn."));

		changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), Messages.get(ChangesScene.class, "misc"),
				"_-_ Added info buttons to the scroll of enchantment window"));

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
				"Fixed (caused by 1.0.0):\n" +
				"_-_ Various rare crash bugs\n" +
				"_-_ Various minor visual and textual errors\n" +
				"_-_ Graphics hitching when music was enabled\n" +
				"_-_ Pressing enter not confirming single line text input\n" +
				"_-_ Enemies attacking the golden lotus, despite it being neutral\n" +
				"_-_ Remote Beacon talent not actually being buffed\n" +
				"_-_ Ankhs still resurrecting the hero even if they lost their inventory\n" +
				"_-_ Unbreakable traps breaking in rare cases\n" +
				"_-_ Transmogrified enemies dropping items where they were transmogrified\n" +
				"_-_ Potions/Scrolls never breaking due to frost/fire\n" +
				"_-_ Sheep triggering traps before occupying space on them"));

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
				"Fixed (existed prior to 1.0.0):\n" +
				"_-_ Rings not being renamable if they weren't IDed\n" +
				"_-_ Disarming traps opening chests\n" +
				"_-_ Rogue's body replacement ally being vulnerable to various AI-related debuffs\n" +
				"_-_ Some ranged enemies becoming frozen if they were attacked from out of their vision"));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes.addButton( new ChangeButton(Icons.get(Icons.SHPX), "Developer Commentary",
				"_-_ Released August 17th, 2021\n" +
				"_-_ 71 days after Shattered v0.9.3\n" +
				"_-_ 316 days after Shattered v0.9.0\n" +
				"_-_ A bit more than 7 years after v0.1.0!\n" +
				"\n" +
				"_That's right, we've hit v1.0.0!_ This update was previously called v0.9.4 while in beta.\n\n" +
				"Shattered will also now use the _major.minor.patch_ version naming scheme moving forward. So, the next patch will be v1.0.1, and the next update will be v1.1.0. _This change does not affect my plans for future updates!_\n\n" +
				"Expect more dev commentary here in the future."));

		changes.addButton( new ChangeButton(Icons.get(Icons.DISPLAY), "iOS Release!",
				"_Shattered Pixel Dungeon is now available on the iOS App Store!_\n\n" +
				"After years of requests, Shattered is finally available on Apple devices! The iOS version of the game will release in lockstep with the Android version moving forward, with some small variance due to different update approval processes.\n\n" +
				"Note that the iOS version costs $5, but comes with some supporter features built-in. I have no plans to make any changes to the monetization of the Android version."));

		changes.addButton( new ChangeButton(Icons.get(Icons.AUDIO), "new music!",
				"_The game's music tracks has been remastered!_\n\n" +
				"The new music is composed by Kristjan Harristo, check the about scene for more details on them. Currently we have only replaced the existing tracks, but we are working on tracks for each of the dungeons regions as well!\n\n" +
				"The new in-game track in particular is also an experiment in variable music looping. The track has an intro and a main segment and can play the main segment once or twice before looping back to the intro. This makes the track notably less repetative, and we intend to use similar techniques in other tracks."));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.LIQUID_METAL), "new alchemy recipes!",
				"Two new alchemy recipes have been added! They're focused on helping you recycle thrown weapons and wands that you don't want to use.\n\n" +
				"_Liquid metal_ lets you sacrifice thrown weapons to repair other ones.\n\n" +
				"_Arcane resin_ lets you sacrifice a wand to upgrade other low level wands.\n\n" +
				"A new page has been added to the alchemy guide for these recipes, and it's now possible to find later guidebook pages in the prison."));

		changes.addButton(new ChangeButton(new Image(new Image(Assets.Environment.TERRAIN_FEATURES, 64, 64, 16, 16)), "new traps",
				"Two new traps have been added! They are both less common traps that have a higher potential to be helpful.\n\n" +
				"_Geyser traps_ convert surrounding terrain to water and throw back anything near them.\n\n" +
				"_Gateway traps_ are a special teleportation trap which never expire, and always teleport to the same location.\n\n" +
				"All teleportation traps now also affect characters and items next to them."));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.MASTERY), "new player experience improvements",
				"_The adventurer's guidebook is now the Tome of Dungeon Mastery!_\n\n" +
				"This is partly as a reference to the tome of mastery, which I removed in the previous update, and partly because the game's tutorial functionality has been improved.\n\n" +
				"Guidebook pages are now a bit shorter and more plentiful, and some of them are now given to the player right at the start of the game. These automatic pages are suggested to the player to read at crucial moments. This way the guidebook does a better job of highlighting info right when it's needed."));

		changes.addButton(new ChangeButton(new Image(new SpectralNecromancerSprite()), "spectral necromancers",
				"A new rare variant has been added for necromancers: _Spectral Necromancers!_\n\n" +
				"These necromancers don't care for skeletons, and prefer to summon a bunch of wraiths instead! Dealing with their horde might be tricky, but you'll be rewarded with a scroll of remove curse."));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.ANKH), "new ankh mechanics",
				"_Regular Ankhs_ have been totally redesigned, and now give the player a chance to save all of their equipment! Be careful though, you'll have to fight your way back to your lost gear.\n\n" +
				"_Blessed Ankhs_ have received comparatively minor changes. In addition to the resurrection effect, these ankhs now also give the player 3 turns of invulnerability. This should help give players a moment to heal up after being revived."));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
		changes.hardlight(CharSprite.WARNING);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.STONE_FEAR), "runestones",
				"All Scrolls now produce 2 runestones, instead of some scrolls producing 3. The stones that used to be given in higher quantities have received buffs in compensation:\n\n" +
				"_- Stone of Intuition_ can now be used a second time if the guess was correct.\n" +
				"_- Stone of Flock_ AOE up to 5x5 from 3x3, sheep duration increased slightly.\n" +
				"_- Stone of Deepened Sleep_ is now stone of deep sleep, instantly puts one enemy into magical sleep.\n" +
				"_- Stone of Clairvoyance_ AOE up to 20x20, from 12x12.\n" +
				"_- Stone of Aggression_ duration against enemies up 5, now works on bosses, and always forces attacking.\n" +
				"_- Stone of Affection_ is now stone of fear, it fears one target for 20 turns."));

		changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), Messages.get(ChangesScene.class, "misc"),
				"_-_ Various tech and stability improvements.\n" +
				"_-_ Increased the minimum supported Android version to 4.0, from 2.3.\n" +
				"_-_ Game versions that use github for update checking can now opt-in to beta updates within the game.\n\n" +

				"_-_ Item renaming functionality has been moved to within the item info window.\n" +
				"_-_ Various minor UI improvements to the intro, welcome and about scenes.\n" +
				"_-_ Adjusted settings windows, removed some unnecessary elements.\n" +
				"_-_ Armor with the warrior's seal on it now states max shielding.\n" +
				"_-_ Bonus strength is now shown separately from base strength.\n\n" +

				"_-_ Improved the exit visuals on floor 10.\n" +
				"_-_ Becoming magic immune now also cleanses existing magical buffs and debuffs.\n" +
				"_-_ Traps that spawn visible or that never deactivate can no longer appear in enclosed spaces"));

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
				"Fixed:\n" +
				"_-_ Various rare crash bugs\n" +
				"_-_ Various minor visual and text errors\n" +
				"_-_ damage warn triggering when hero gains HP from being hit\n" +
				"_-_ various rare bugs involving pitfall traps\n\n" +

				"_-_ statues not becoming aggressive when debuffed\n" +
				"_-_ swapping places with allies reducing momentum\n" +
				"_-_ DK minions dropping imp quest tokens\n" +
				"_-_ giant succubi teleporting into enclosed spaces\n" +
				"_-_ spectral blades being blocked by allies\n" +
				"_-_ Spirit Hawk and Shadow Clone being corruptible\n\n" +

				"_-_ wands losing max charge on save/load in rare cases\n" +
				"_-_ magical infusion clearing curses\n" +
				"_-_ dewdrops stacking on each other in rare cases\n" +
				"_-_ exploding skeletons not being blocked by transfusion shield in rare cases\n" +
				"_-_ rare incorrect interactions between swiftthistle and golden lotus"));

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
				"Fixed:\n" +
				"_-_ various minor errors with electricity effects\n" +
				"_-_ soul mark not working properly on low HP enemies with shielding\n" +
				"_-_ various rare errors with shadows buff\n" +
				"_-_ errors with time freeze and inter-floor teleportation mechanics\n" +
				"_-_ rooted characters not being immune to knockback effects\n\n" +

				"_-_ gladiator combos dealing much more damage than intended in certain cases\n" +
				"_-_ magical charge and scroll empower interacting incorrectly\n" +
				"_-_ magical sight not working with farsight talent\n" +
				"_-_ perfect copy talent giving very slightly more HP than intended\n" +
				"_-_ wild magic using cursed wands as if they're normal"));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "buffs"), false, null);
		changes.hardlight(CharSprite.POSITIVE);
		changeInfos.add(changes);

		changes.addButton( new ChangeButton(new ItemSprite(ItemSpriteSheet.CROWN, null), "Armor Ability Buffs pt.1",
				"Based on balance data and feedback, I'm making a bunch of buffs and adjustments to armor abilities and their related talents!\n\n" +
				"_- Endure_ bonus damage conversion rate up to 1/3 from 1/4.\n\n" +
				"_- Striking Wave_ effectiveness increased by 20%.\n" +
				"_- Shock Force_ now actually adds 20% damage per level as stated. Previously it only added 15%.\n\n" +
				"_- Wild Magic_ now boosts wand levels, instead of overriding them.\n" +
				"_- Conserved Magic_ now has a chance to give each wand a 3rd shot.\n" +
				"_- Conserved Magic_ charge cost reduction down to 33/55/70/80% from 44/69/82/90%.\n\n" +
				"_- Elemental Blast_ base damage increased to 15-25 from 10-20.\n" +
				"_- Elemental Power_ now boosts power by 20% per level, up from 15%.\n\n" +
				"_- Remote Beacon_ range per level increased to 4, from 3."));

		changes.addButton( new ChangeButton(new ItemSprite(ItemSpriteSheet.CROWN, null), "Armor Ability Buffs pt.2",
				"_- Shadow Clone_ now follows the hero at 2x speed.\n" +
				"_- Shadow Blade_ damage per level increased to 7.5% from 6.25%.\n" +
				"_- Cloned Armor_ armor per level increased to 15% from 12.5%.\n\n" +
				"_- Spirit Hawk_ evasion, accuracy, and duration increased by 20%.\n" +
				"_- Swift Spirit_ now gives 2/3/4/5 dodges, up from 1/2/3/4.\n" +
				"_- Go for the Eyes_ now gives 2/4/6/8 turns of blind, up from 2/3/4/5.\n\n" +
				"_- Spirit Blades_ effectiveness increased by 20%."));

		changes.addButton( new ChangeButton(new WoollyBomb(),
				"As stones of flock were buffed, I thought it was only fair to give woolly bombs some compensation buffs as well:\n\n" +
				"_-_ AOE size up to 9x9 from 5x5\n" +
				"_-_ Sheep duration up to 12-16 from 8-16"));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
		changes.hardlight(CharSprite.NEGATIVE);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(new MagesStaff(),
				"The Mage continues to do too well in the early game since the talent changes in v0.9.1. Rather than weakening his talents and other magical abilities more, I've decided to make him more reliant on them instead by reducing his melee damage.\n\n" +
				"_- Mage's Staff_ base damage reduced to 1-7 from 1-8."));

		changes.addButton( new ChangeButton(new ItemSprite(ItemSpriteSheet.CROWN, null), "Armor Ability Nerfs",
				"I focused mostly on buffs this update, but a few abilities and talents do need to be scaled back a little:\n\n" +
				"_- Double Jump_ charge cost reduction down to 20/36/50/60%, from 24/42/56/67%.\n\n" +
				"_- Telefrag_ self damage increased to a flat 5 per level.\n\n" +
				"_- Smoke Bomb_ max range reduced to 6 tiles from 8.\n" +
				"_- Body Replacement_ armor reduced to 1-3 per level, from 1-5.\n" +
				"_- Hasty Retreat_ turns of haste/invis reduced to 1/2/3/4 from 2/3/4/5\n" +
				"_- Shadow Step_ charge cost reduction down to 20/36/50/60%, from 24/42/56/67%.\n\n" +
				"_- Double Mark_ charge cost reduction down to 30/50/65/75%, from 33/55/70/80%.\n\n" +
				"_- 13th armor ability_ now only lasts for 6 turns, but also no longer prevents EXP or item drops. I'm trying to retain the ability's core theme while making it a bit less effective at totally removing enemies.\n" +
				"_- resistance talent_ damage reduction reduced to 10/19/27/35%, from 10/20/30/40%."));

	}

}
