package net.meteor.common;

import net.meteor.common.item.ItemDetector;
import net.meteor.common.item.ItemEnchArmor;
import net.meteor.common.item.ItemEnchAxe;
import net.meteor.common.item.ItemEnchHoe;
import net.meteor.common.item.ItemEnchPickaxe;
import net.meteor.common.item.ItemEnchSpade;
import net.meteor.common.item.ItemEnchSword;
import net.meteor.common.item.ItemFoodMeteorsMod;
import net.meteor.common.item.ItemFrezariteAxe;
import net.meteor.common.item.ItemFrezariteHoe;
import net.meteor.common.item.ItemFrezaritePickaxe;
import net.meteor.common.item.ItemFrezariteSpade;
import net.meteor.common.item.ItemFrezariteSword;
import net.meteor.common.item.ItemKreknoSword;
import net.meteor.common.item.ItemMeteorsMod;
import net.meteor.common.item.ItemSummoner;
import net.minecraft.init.Enchantments;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

@Mod.EventBusSubscriber(modid = MeteorsMod.MOD_ID)
public class MeteorItems {
	
	public static final ArmorMaterial MeteoriteArmor = EnumHelper.addArmorMaterial("METEORITE", "METEORITE", 36, new int[] { 2, 7, 5, 2 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0f);
	public static final ArmorMaterial FrezariteArmor = EnumHelper.addArmorMaterial("FREZARITE", "FREZARITE", 7, new int[] { 2, 5, 3, 1 }, 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0f);
	public static final ArmorMaterial KreknoriteArmor = EnumHelper.addArmorMaterial("KREKNORITE", "KREKNORITE", 40, new int[] { 3, 8, 6, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0f);

	public static final ToolMaterial MeteoriteTool = EnumHelper.addToolMaterial("METEORITE", 3, 900, 10.0F, 2, 15);
	public static final ToolMaterial FrezariteTool = EnumHelper.addToolMaterial("FREZARITE", 2, 225, 7.0F, 2, 20);

	//TODO 1.12.2 change setTranslationKey to be registered in the event.
	public static final Item itemMeteorChips 			= new ItemMeteorsMod()/*.setTexture("MeteorChips")*/.setMaxStackSize(64).setRegistryName("MeteorChips");
	public static final Item itemRedMeteorGem 			= new ItemMeteorsMod()/*.setTexture("RedMeteorGem")*/.setMaxStackSize(64).setRegistryName("RedMeteorGem");
	public static final Item itemMeteorSummoner 		= new ItemSummoner()/*.setTexture("MeteorSummoner")*/.setRegistryName("MeteorSummoner");
	public static final Item itemFrezaCrystal 			= new ItemMeteorsMod()/*.setTexture("FrezariteCrystal")*/.setMaxStackSize(64).setRegistryName("FrezariteCrystal");
	public static final Item itemKreknoChip 			= new ItemMeteorsMod()/*.setTexture("KreknoriteChip")*/.setMaxStackSize(64).setRegistryName("KreknoriteChip");
	public static final Item itemVanillaIceCream 		= new ItemFoodMeteorsMod(4, false)/*.setTexture("VanillaIceCream")*/.setMaxStackSize(64).setRegistryName("VanillaIceCream");
	public static final Item itemChocolateIceCream 		= new ItemFoodMeteorsMod(6, false)/*.setTexture("ChocolateIceCream")*/.setMaxStackSize(64).setRegistryName("ChocolateIceCream");
	public static final Item itemMeteorProximityDetector= new ItemDetector(0)/*.setTexture("MeteorDetectorProximity")*/.setRegistryName("MeteorDetectorProximity");
	public static final Item itemMeteorTimeDetector 	= new ItemDetector(1)/*.setTexture("MeteorDetectorTime")*/.setRegistryName("MeteorDetectorTime");
	public static final Item itemMeteorCrashDetector 	= new ItemDetector(2)/*.setTexture("MeteorDetectorCrash")*/.setRegistryName("MeteorDetectorCrash");
	public static final Item MeteoriteHelmet 			= new ItemEnchArmor(MeteoriteArmor, 3, EntityEquipmentSlot.HEAD).setEnch(MeteorsMod.Magnetization, 1)/*.setTexture("MeteoriteHelmet").setArmorTexture("Meteorite")*/.setRegistryName("MeteoriteHelmet");
	public static final Item MeteoriteBody 				= new ItemEnchArmor(MeteoriteArmor, 3, EntityEquipmentSlot.CHEST).setEnch(MeteorsMod.Magnetization, 1)/*.setTexture("MeteoriteChest").setArmorTexture("Meteorite")*/.setRegistryName("MeteoriteChest");
	public static final Item MeteoriteLegs 				= new ItemEnchArmor(MeteoriteArmor, 3, EntityEquipmentSlot.LEGS).setEnch(MeteorsMod.Magnetization, 1)/*.setTexture("MeteoriteLegs").setArmorTexture("Meteorite")*/.setRegistryName("MeteoriteLegs");
	public static final Item MeteoriteBoots 			= new ItemEnchArmor(MeteoriteArmor, 3, EntityEquipmentSlot.FEET).setEnch(MeteorsMod.Magnetization, 1)/*.setTexture("MeteoriteBoots").setArmorTexture("Meteorite")*/.setRegistryName("MeteoriteBoots");
	public static final Item MeteoriteAxe 				= new ItemEnchAxe(MeteoriteTool)/*.setTexture("MeteoriteAxe")*/.setEnch(MeteorsMod.Magnetization, 1).setRegistryName("MeteoriteAxe");
	public static final Item MeteoriteSpade 			= new ItemEnchSpade(MeteoriteTool)./*setTexture("MeteoriteSpade").*/setEnch(MeteorsMod.Magnetization, 1).setRegistryName("MeteoriteSpade");
	public static final Item MeteoriteSword 			= new ItemEnchSword(MeteoriteTool)/*.setTexture("MeteoriteSword")*/.setEnch(MeteorsMod.Magnetization, 1).setRegistryName("MeteoriteSword");
	public static final Item MeteoritePickaxe 			= new ItemEnchPickaxe(MeteoriteTool)/*.setTexture("MeteoritePickaxe")*/.setEnch(MeteorsMod.Magnetization, 1).setRegistryName("MeteoritePickaxe");
	public static final Item MeteoriteHoe 				= new ItemEnchHoe(MeteoriteTool)/*.setTexture("MeteoriteHoe")*/.setEnch(MeteorsMod.Magnetization, 1)/*.setRegistryName("MeteoriteHoe")*/;
	public static final Item FrezariteHelmet 			= new ItemEnchArmor(FrezariteArmor, 3, EntityEquipmentSlot.HEAD).setEnch(Enchantments.RESPIRATION, 3)/*.setTexture("FrezariteHelmet").setArmorTexture("Frezarite")*/.setRegistryName("FrezariteHelmet");
	public static final Item FrezariteBody 				= new ItemEnchArmor(FrezariteArmor, 3, EntityEquipmentSlot.CHEST).setEnch(Enchantments.AQUA_AFFINITY, 1)/*.setTexture("FrezariteChest").setArmorTexture("Frezarite")*/.setRegistryName("FrezariteChest");
	public static final Item FrezariteLegs 				= new ItemEnchArmor(FrezariteArmor, 3, EntityEquipmentSlot.LEGS).setEnch(MeteorsMod.ColdTouch, 1)/*.setTexture("FrezariteLegs").setArmorTexture("Frezarite")*/.setRegistryName("FrezariteLegs");
	public static final Item FrezariteBoots 			= new ItemEnchArmor(FrezariteArmor, 3, EntityEquipmentSlot.FEET).setEnch(MeteorsMod.ColdTouch, 1)/*.setTexture("FrezariteBoots").setArmorTexture("Frezarite")*/.setRegistryName("FrezariteBoots");
	public static final Item FrezaritePickaxe 			= new ItemFrezaritePickaxe(FrezariteTool)/*.setTexture("FrezaritePickaxe")*/.setRegistryName("FrezaritePickaxe");
	public static final Item FrezariteSpade 			= new ItemFrezariteSpade(FrezariteTool)/*.setTexture("FrezariteSpade")*/.setRegistryName("FrezariteSpade");
	public static final Item FrezariteSword 			= new ItemFrezariteSword(FrezariteTool)/*.setTexture("FrezariteSword")*/.setRegistryName("FrezariteSword");
	public static final Item FrezariteAxe 				= new ItemFrezariteAxe(FrezariteTool)/*.setTexture("FrezariteAxe")*/.setRegistryName("FrezariteAxe");
	public static final Item FrezariteHoe 				= new ItemFrezariteHoe(FrezariteTool)/*.setTexture("FrezariteHoe")*/.setRegistryName("FrezariteHoe");
	public static final Item KreknoriteHelmet 			= new ItemEnchArmor(KreknoriteArmor, 3, EntityEquipmentSlot.HEAD).setEnch(Enchantments.FIRE_PROTECTION, 4)/*.setTexture("KreknoriteHelmet").setArmorTexture("Kreknorite")*/.setRegistryName("KreknoriteHelmet");
	public static final Item KreknoriteBody 			= new ItemEnchArmor(KreknoriteArmor, 3, EntityEquipmentSlot.CHEST).setEnch(Enchantments.FIRE_PROTECTION, 4)/*.setTexture("KreknoriteChest").setArmorTexture("Kreknorite")*/.setRegistryName("KreknoriteChest");
	public static final Item KreknoriteLegs 			= new ItemEnchArmor(KreknoriteArmor, 3, EntityEquipmentSlot.LEGS).setEnch(Enchantments.FIRE_PROTECTION, 4)/*.setTexture("KreknoriteLegs").setArmorTexture("Kreknorite")*/.setRegistryName("KreknoriteLegs");
	public static final Item KreknoriteBoots 			= new ItemEnchArmor(KreknoriteArmor, 3, EntityEquipmentSlot.FEET).setEnch(Enchantments.FIRE_PROTECTION, 4)/*.setTexture("KreknoriteBoots").setArmorTexture("Kreknorite")*/.setRegistryName("KreknoriteBoots");
	public static final Item KreknoriteSword 			= new ItemKreknoSword(MeteoriteTool).setRegistryName("KreknoriteSword")/*.setTexture("KreknoriteSword")*/;

	// Begin industrialization! :D
	public static final Item MeteoriteIngot				= new ItemMeteorsMod()/*.setTexture("MeteoriteIngot")*/.setRegistryName("MeteoriteIngot");
	public static final Item FrozenIron					= new ItemMeteorsMod()/*.setTexture("FrozenIron")*/.setRegistryName("FrozenIron");
	public static final Item KreknoriteIngot			= new ItemMeteorsMod()/*.setTexture("KreknoriteIngot")*/.setRegistryName("KreknoriteIngot");
	
	public static void readyItems() {
		MeteoriteAxe.setHarvestLevel("axe", 3);
		MeteoritePickaxe.setHarvestLevel("pickaxe", 3);
		MeteoriteSpade.setHarvestLevel("shovel", 3);
		FrezaritePickaxe.setHarvestLevel("pickaxe", 2);
		FrezariteSpade.setHarvestLevel("shovel", 2);
		FrezariteAxe.setHarvestLevel("axe", 2);
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {

		event.getRegistry().register(itemMeteorChips);
		event.getRegistry().register(itemRedMeteorGem);
		event.getRegistry().register(itemFrezaCrystal);
		event.getRegistry().register(itemKreknoChip);
		event.getRegistry().register(itemVanillaIceCream);
		event.getRegistry().register(itemChocolateIceCream);
		event.getRegistry().register(itemMeteorCrashDetector);
		event.getRegistry().register(itemMeteorProximityDetector);
		event.getRegistry().register(itemMeteorTimeDetector);
		event.getRegistry().register(itemMeteorSummoner);
		event.getRegistry().register(FrezariteHelmet);
		event.getRegistry().register(FrezariteBody);
		event.getRegistry().register(FrezariteLegs);
		event.getRegistry().register(FrezariteBoots);
		event.getRegistry().register(FrezaritePickaxe);
		event.getRegistry().register(FrezariteSpade);
		event.getRegistry().register(KreknoriteHelmet);
		event.getRegistry().register(KreknoriteBody);
		event.getRegistry().register(KreknoriteLegs);
		event.getRegistry().register(KreknoriteBoots);
		event.getRegistry().register(KreknoriteSword);
		event.getRegistry().register(MeteoriteAxe);
		event.getRegistry().register(MeteoriteBody);
		event.getRegistry().register(MeteoriteBoots);
		event.getRegistry().register(MeteoriteHelmet);
		event.getRegistry().register(MeteoriteHoe);
		event.getRegistry().register(MeteoriteLegs);
		event.getRegistry().register(MeteoritePickaxe);
		event.getRegistry().register(MeteoriteSpade);
		event.getRegistry().register(MeteoriteSword);
		event.getRegistry().register(FrezariteSword);
		event.getRegistry().register(FrezariteAxe);
		event.getRegistry().register(FrezariteHoe);
		event.getRegistry().register(MeteoriteIngot);
		event.getRegistry().register(FrozenIron);
		event.getRegistry().register(KreknoriteIngot);
		
		// Ore Dictionary
		OreDictionary.registerOre("ingotMeteorite", MeteoriteIngot);
		OreDictionary.registerOre("ingotFrozenIron", FrozenIron);
		OreDictionary.registerOre("ingotKreknorite", KreknoriteIngot);
	}
	
}
