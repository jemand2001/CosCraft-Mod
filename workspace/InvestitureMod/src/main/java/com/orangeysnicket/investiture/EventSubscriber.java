package com.orangeysnicket.investiture;

import com.orangeysnicket.investiture.block.*;
import com.orangeysnicket.investiture.entity.EntityAshSprinkle;
import com.orangeysnicket.investiture.init.ModEntities;
import com.orangeysnicket.investiture.init.ModItems;
import com.orangeysnicket.investiture.item.*;
import com.orangeysnicket.investiture.material.InvestitureMaterials;
import com.orangeysnicket.investiture.init.ModBlocks;

// import com.sun.java.swing.plaf.windows.TMSchema;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;

import net.minecraft.item.HangingEntityItem;
import net.minecraftforge.event.RegistryEvent.Register;

public final class EventSubscriber {
	public static void registerBlocks(Register<Block> event) {
		final Block[] blocks = {
				// NORMAL BLOCKS
//				new AluminumBlock().setRegistryName("aluminum_block").setTranslationKey(Investiture.MODID + "." + "aluminum_block"),
//				new AshBlock().setRegistryName("ash_block").setTranslationKey(Investiture.MODID + "." + "ash_block"),
				// new AshTiles().setRegistryName("ash_tiles").setTranslationKey(Investiture.MODID + "." + "ash_tiles"),
				// new Block(new Block.Properties(Material.IRON, MaterialColor.WHITE_TERRACOTTA)),
				new AshTiles.Half("ash_tiles_half"),
				new AshTiles.Double("ash_tiles_double"),
//				new AtiumBlock().setRegistryName("atium_block").setTranslationKey(Investiture.MODID + "." + "atium_block"),
//				new BlackMetalBlock().setRegistryName("black_metal_block").setTranslationKey(Investiture.MODID + "." + "black_metal_block"),
//				new BrassBlock().setRegistryName("brass_block").setTranslationKey(Investiture.MODID + "." + "brass_block"),
//				new BronzeBlock().setRegistryName("bronze_block").setTranslationKey(Investiture.MODID + "." + "bronze_block"),
//				new ChiseledBlackMetalBlock().setRegistryName("chiseled_black_metal_block").setTranslationKey(Investiture.MODID + "." + "chiseled_black_metal_block"),
//				new ChiseledBrass().setRegistryName("chiseled_brass").setTranslationKey(Investiture.MODID + "." + "chiseled_brass"),
//				new ChiseledBronze().setRegistryName("chiseled_bronze").setTranslationKey(Investiture.MODID + "." + "chiseled_bronze"),
//				new ChiseledCopper().setRegistryName("chiseled_copper").setTranslationKey(Investiture.MODID + "." + "chiseled_copper"),
//				new ChiseledGold().setRegistryName("chiseled_gold").setTranslationKey(Investiture.MODID + "." + "chiseled_gold"),
//				new ChiseledIron().setRegistryName("chiseled_iron").setTranslationKey(Investiture.MODID + "." + "chiseled_iron"),
//				new ChiseledPewter().setRegistryName("chiseled_pewter").setTranslationKey(Investiture.MODID + "." + "chiseled_pewter"),
//				new ChiseledSteel().setRegistryName("chiseled_steel").setTranslationKey(Investiture.MODID + "." + "chiseled_steel"),
//				new ChiseledTin().setRegistryName("chiseled_tin").setTranslationKey(Investiture.MODID + "." + "chiseled_tin"),
//				new ChiseledZinc().setRegistryName("chiseled_zinc").setTranslationKey(Investiture.MODID + "." + "chiseled_zinc"),
//				new CopperBlock().setRegistryName("copper_block").setTranslationKey(Investiture.MODID + "." + "copper_block"),
//				new DarkSteelBlock().setRegistryName("dark_steel_block").setTranslationKey(Investiture.MODID + "." + "dark_steel_block"),
//				new IronRoofing().setRegistryName("iron_roofing").setTranslationKey(Investiture.MODID + "." + "iron_roofing"),
//				new LeadBlock().setRegistryName("lead_block").setTranslationKey(Investiture.MODID + "." + "lead_block"),
//				new LerasiumBlock().setRegistryName("lerasium_block").setTranslationKey(Investiture.MODID + "." + "lerasium_block"),
//				new PewterBlock().setRegistryName("pewter_block").setTranslationKey(Investiture.MODID + "." + "pewter_block"),
//				new SilverBlock().setRegistryName("silver_block").setTranslationKey(Investiture.MODID + "." + "silver_block"),
//				new SteelBlock().setRegistryName("steel_block").setTranslationKey(Investiture.MODID + "." + "steel_block"),
//				new Tiles().setRegistryName("tiles").setTranslationKey(Investiture.MODID + "." + "tiles"),
//				new TinBlock().setRegistryName("tin_block").setTranslationKey(Investiture.MODID + "." + "tin_block"),
//				new ZincBlock().setRegistryName("zinc_block").setTranslationKey(Investiture.MODID + "." + "zinc_block"),

				// ASH LAYERS
				// new AshLayer().setRegistryName("ash_layer").setTranslationKey(Investiture.MODID + "." + "ash_layer"),

				// STAIRS
				new BronzeStairs(Block.getStateById(0)).setRegistryName("bronze_stairs").setTranslationKey(Investiture.MODID + "." + "bronze_stairs"),
				new CopperStairs(Block.getStateById(0)).setRegistryName("copper_stairs").setTranslationKey(Investiture.MODID + "." + "copper_stairs"),
				new IronStairs(Block.getStateById(0)).setRegistryName("iron_stairs").setTranslationKey(Investiture.MODID + "." + "iron_stairs"),
				new PewterStairs(Block.getStateById(0)).setRegistryName("pewter_stairs").setTranslationKey(Investiture.MODID + "." + "pewter_stairs"),
				new TinStairs(Block.getStateById(0)).setRegistryName("tin_stairs").setTranslationKey(Investiture.MODID + "." + "tin_stairs"),

		};

		event.getRegistry().registerAll(blocks);		
	}
	public static void registerItems(Register<Item> event) {
		final Item[] items = {
//				new AluminumIngot("aluminum_ingot", Investiture.MODID + "." + "aluminum_ingot"),
//				new AtiumBead("atium_bead", Investiture.MODID + "." + "atium_bead"),
//				new BendalloyIngot("bendalloy_ingot", Investiture.MODID + "." + "bendalloy_ingot"),
//				new BrassIngot("brass_ingot", Investiture.MODID + "." + "brass_ingot"),
//				new BronzeIngot("bronze_ingot", Investiture.MODID + "." + "bronze_ingot"),
//				new CadmiumIngot("cadmium_ingot", Investiture.MODID + "." + "cadmium_ingot"),
//				new ChromiumIngot("chromium_ingot", Investiture.MODID + "." + "chromium_ingot"),
//				new CopperIngot("copper_ingot", Investiture.MODID + "." + "copper_ingot"),
//				new DuraluminIngot("duralumin_ingot", Investiture.MODID + "." + "duralumin_ingot"),
//				new ElectrumIngot("electrum_ingot", Investiture.MODID + "." + "electrum_ingot"),
//				new GlassDagger(InvestitureMaterials.MATERIAL_GLASS, "glass_dagger", Investiture.MODID + "." + "glass_dagger"),
//				new LerasiumBead("lerasium_bead", Investiture.MODID + "." + "lerasium_bead"),
//				new NicrosilIngot("nicrosil_ingot", Investiture.MODID + "." + "nicrosil_ingot"),
//				new ObsidianAxe(InvestitureMaterials.MATERIAL_OBSIDIAN, "obsidian_axe", "obsidian_axe"),
//				new ObsidianDagger(InvestitureMaterials.MATERIAL_OBSIDIAN, "obsidian_dagger", Investiture.MODID + "." + "obsidian_dagger"),
//				new PewterIngot("pewter_ingot", Investiture.MODID + "." + "pewter_ingot"),
//				new SteelIngot("steel_ingot", Investiture.MODID + "." + "steel_ingot"),
//				new TinIngot("tin_ingot", Investiture.MODID + "." + "tin_ingot"),
//				new ZincIngot("zinc_ingot", Investiture.MODID + "." + "zinc_ingot"),
//
//				// splitting this up over multiple lines for readability; i don't want to put this in its own class
//				// because it already does everything i want like this
//				new ItemHangingEntity(EntityAshSprinkle.class).setRegistryName("ash_sprinkle")
//						.setTranslationKey(Investiture.MODID + "." + "ash_sprinkle")
//						.setCreativeTab(Investiture.decoTab)
		};

		final Item[] BlockItem = {
//                new BlockItem()).setRegistryName(ModBlocks.ALUMINUM_BLOCK.getRegistryName()),
//                new BlockItem()).setRegistryName(ModBlocks.ASH_BLOCK.getRegistryName()),
//                // new BlockItemModBlocks.ASH_TILES).setRegistryName(ModBlocks.ASH_TILES.getRegistryName()),
//                new BlockItem()).setRegistryName(ModBlocks.ATIUM_BLOCK.getRegistryName()),
//                new BlockItem()).setRegistryName(ModBlocks.BLACK_METAL_BLOCK.getRegistryName()),
//                new BlockItem()).setRegistryName(ModBlocks.BRASS_BLOCK.getRegistryName()),
//                new BlockItem()).setRegistryName(ModBlocks.BRONZE_BLOCK.getRegistryName()),
//                new BlockItem()).setRegistryName(ModBlocks.BRONZE_STAIRS.getRegistryName()),
//                new BlockItem()).setRegistryName(ModBlocks.CHISELED_BLACK_METAL_BLOCK.getRegistryName()),
//                new BlockItem()).setRegistryName(ModBlocks.CHISELED_BRASS.getRegistryName()),
//                new BlockItem()).setRegistryName(ModBlocks.CHISELED_BRONZE.getRegistryName()),
//                new BlockItem()).setRegistryName(ModBlocks.CHISELED_COPPER.getRegistryName()),
//                new BlockItem()).setRegistryName(ModBlocks.CHISELED_GOLD.getRegistryName()),
//                new BlockItem()).setRegistryName(ModBlocks.CHISELED_IRON.getRegistryName()),
//                new BlockItem()).setRegistryName(ModBlocks.CHISELED_PEWTER.getRegistryName()),
//                new BlockItem()).setRegistryName(ModBlocks.CHISELED_STEEL.getRegistryName()),
//                new BlockItem()).setRegistryName(ModBlocks.CHISELED_TIN.getRegistryName()),
//                new BlockItem()).setRegistryName(ModBlocks.CHISELED_ZINC.getRegistryName()),
//                new BlockItem()).setRegistryName(ModBlocks.COPPER_BLOCK.getRegistryName()),
//                new BlockItem()).setRegistryName(ModBlocks.COPPER_STAIRS.getRegistryName()),
//                new BlockItem()).setRegistryName(ModBlocks.DARK_STEEL_BLOCK.getRegistryName()),
//                new BlockItem()).setRegistryName(ModBlocks.IRON_ROOFING.getRegistryName()),
//                new BlockItem()).setRegistryName(ModBlocks.IRON_STAIRS.getRegistryName()),
//                new BlockItem()).setRegistryName(ModBlocks.LEAD_BLOCK.getRegistryName()),
//                new BlockItem()).setRegistryName(ModBlocks.LERASIUM_BLOCK.getRegistryName()),
//                new BlockItem()).setRegistryName(ModBlocks.PEWTER_BLOCK.getRegistryName()),
//                new BlockItem()).setRegistryName(ModBlocks.PEWTER_STAIRS.getRegistryName()),
//                new BlockItem()).setRegistryName(ModBlocks.SILVER_BLOCK.getRegistryName()),
//                new BlockItem()).setRegistryName(ModBlocks.STEEL_BLOCK.getRegistryName()),
//                new BlockItem()).setRegistryName(ModBlocks.TILES.getRegistryName()),
//                new BlockItem()).setRegistryName(ModBlocks.TIN_BLOCK.getRegistryName()),
//                new BlockItem()).setRegistryName(ModBlocks.TIN_STAIRS.getRegistryName()),
//                new BlockItem()).setRegistryName(ModBlocks.ZINC_BLOCK.getRegistryName()),
//
//				// new BlockItemModBlocks.ASH_LAYER).setRegistryName(ModBlocks.ASH_LAYER.getRegistryName())
//				new ItemAshLayer().setRegistryName(ModBlocks.ASH_LAYER.getRegistryName())
        };

		event.getRegistry().registerAll(items);
		event.getRegistry().registerAll(net.minecraft.item.BlockItem);
	}
}
