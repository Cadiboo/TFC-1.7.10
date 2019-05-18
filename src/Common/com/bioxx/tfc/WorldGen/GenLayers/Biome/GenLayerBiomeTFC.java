package com.bioxx.tfc.WorldGen.GenLayers.Biome;

import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

import com.bioxx.tfc.Core.TFC_Core;
import com.bioxx.tfc.WorldGen.TFCBiome;
import com.bioxx.tfc.WorldGen.TFCWorldType;
import com.bioxx.tfc.WorldGen.GenLayers.GenLayerTFC;

import biomesoplenty.common.biome.BiomeBOP;
import biomesoplenty.common.biome.overworld.AlpsBiome;
import biomesoplenty.common.biome.overworld.CherryBlossomGroveBiome;
import biomesoplenty.common.biome.overworld.ConiferousForestBiome;
import biomesoplenty.common.biome.overworld.FlowerMeadowBiome;
import biomesoplenty.common.biome.overworld.BogBiome;
import biomesoplenty.common.biome.overworld.BorealForestBiome;
import biomesoplenty.common.biome.overworld.BrushlandBiome;
import biomesoplenty.common.biome.overworld.ChaparralBiome;
import biomesoplenty.common.biome.overworld.GrasslandBiome;
import biomesoplenty.common.biome.overworld.LavenderFieldsBiome;
import biomesoplenty.common.biome.overworld.LushSwampBiome;
import biomesoplenty.common.biome.overworld.MapleWoodsBiome;
import biomesoplenty.common.biome.overworld.MeadowBiome;
import biomesoplenty.common.biome.overworld.MysticGroveBiome;
import biomesoplenty.common.biome.overworld.OminousWoodsBiome;
import biomesoplenty.common.biome.overworld.OrchardBiome;
import biomesoplenty.common.biome.overworld.OriginHillsBiome;
import biomesoplenty.common.biome.overworld.OutbackBiome;
import biomesoplenty.common.biome.overworld.PastureBiome;
import biomesoplenty.common.biome.overworld.PrairieBiome;
import biomesoplenty.common.biome.overworld.RedwoodForestBiome;
import biomesoplenty.common.biome.overworld.SeasonalForestBiome;
import biomesoplenty.common.biome.overworld.ShieldBiome;
import biomesoplenty.common.biome.overworld.ShrublandBiome;
import biomesoplenty.common.biome.overworld.SnowyConiferousForestBiome;
import biomesoplenty.common.biome.overworld.SnowyForestBiome;
import biomesoplenty.common.biome.overworld.SteppeBiome;
import biomesoplenty.common.biome.overworld.TemperateRainforestBiome;
import biomesoplenty.common.biome.overworld.TropicalRainforestBiome;
import biomesoplenty.common.biome.overworld.TundraBiome;
import biomesoplenty.common.biome.overworld.WastelandBiome;
import biomesoplenty.common.biome.overworld.WetlandBiome;
import biomesoplenty.common.biome.overworld.WoodlandBiome;
import biomesoplenty.common.biome.overworld.XericShrublandBiome;
import biomesoplenty.common.world.WorldTypeBOP;

public class GenLayerBiomeTFC extends GenLayerTFC
{
	/** this sets all the biomes that are allowed to appear in the overworld */
	private TFCBiome[] allowedBiomes = new TFCBiome[] {
	
	//TFC Biomes
			TFCBiome.OCEAN,
			TFCBiome.HIGH_HILLS,
			TFCBiome.PLAINS,
			TFCBiome.HIGH_PLAINS,
			TFCBiome.SWAMPLAND,
			TFCBiome.ROLLING_HILLS,
			TFCBiome.MOUNTAINS,
			
	//Biomes O' Plenty Biomes
			BOPCBiomes.alps,
			BOPCBiomes.arctic,
			BOPCBiomes.bambooForest,
			BOPCBiomes.bayou,
			BOPCBiomes.bog,
			BOPCBiomes.borealForest,
			BOPCBiomes.brushland,
			BOPCBiomes.canyon,
			BOPCBiomes.chaparral,
			BOPCBiomes.cherryBlossomGrove,
			BOPCBiomes.coniferousForest,
			BOPCBiomes.snowyConiferousForest,
			BOPCBiomes.crag,
			BOPCBiomes.deadForest,
			BOPCBiomes.deadSwamp,
			BOPCBiomes.deciduousForest,
			BOPCBiomes.denseForest,
			BOPCBiomes.eucalyptusForest,
			BOPCBiomes.fen,
			BOPCBiomes.flowerField,
			BOPCBiomes.frostForest,
			BOPCBiomes.fungiForest,
			BOPCBiomes.garden,
			BOPCBiomes.grassland,
			BOPCBiomes.grove,
			BOPCBiomes.heathland,
			BOPCBiomes.highland,
			BOPCBiomes.jadeCliffs,
			BOPCBiomes.landOfLakes,
			BOPCBiomes.lavenderFields,
			BOPCBiomes.lushDesert,
			BOPCBiomes.lushSwamp,
			BOPCBiomes.mapleWoods,
			BOPCBiomes.marsh,
			BOPCBiomes.meadow,
			BOPCBiomes.moor,
			BOPCBiomes.mountain,
			BOPCBiomes.mysticGrove,
			BOPCBiomes.ominousWoods,
			BOPCBiomes.originValley,
			BOPCBiomes.outback,
			BOPCBiomes.prairie,
			BOPCBiomes.rainforest,
			BOPCBiomes.redwoodForest,
			BOPCBiomes.sacredSprings,
			BOPCBiomes.seasonalForest,
			BOPCBiomes.shield,
			BOPCBiomes.shrubland,
			BOPCBiomes.sludgepit,
			BOPCBiomes.steppe,
			BOPCBiomes.temperateRainforest,
			BOPCBiomes.thicket,
			BOPCBiomes.tropicalRainforest,
			BOPCBiomes.tundra,
			BOPCBiomes.wasteland,
			BOPCBiomes.wetland,
			BOPCBiomes.woodland,
			BOPCBiomes.xericShrubland,
			
	//Biomes O' Plenty Sub Biomes
			BOPCBiomes.alpsForest,
			BOPCBiomes.canyonRavine,
			BOPCBiomes.glacier,
			BOPCBiomes.landOfLakesMarsh,
			BOPCBiomes.mangrove,
			BOPCBiomes.meadowForest,
			BOPCBiomes.oasis,
			BOPCBiomes.orchard,
			BOPCBiomes.quagmire,
			BOPCBiomes.scrubland,
			BOPCBiomes.seasonalForestClearing,
			BOPCBiomes.silkGlades,
			BOPCBiomes.spruceWoods,
			BOPCBiomes.tropics,
			BOPCBiomes.volcano,
			
	//Biomes O' Plenty Ocean Biomse
			BOPCBiomes.coralReef,
			BOPCBiomes.kelpForest,
			
	//Biomes O' Plenty River Biomes
			BOPCBiomes.lushRiver,
			BOPCBiomes.dryRiver

	};

	public GenLayerBiomeTFC(long par1, GenLayer par3GenLayer, TFCWorldType par4)
	{
		super(par1);
		this.parent = (GenLayerTFC) par3GenLayer;
	}

	/**
	 * Returns a list of integer values generated by this layer. These may be interpreted as temperatures, rainfall
	 * amounts, or biomeList[] indices based on the particular GenLayer subclass.
	 */
	@Override
	public int[] getInts(int par1, int par2, int par3, int par4)
	{
		int[] var5 = this.parent.getInts(par1, par2, par3, par4);
		validateIntArray(var5, par3, par4);
		int[] var6 = IntCache.getIntCache(par3 * par4);

		for (int var7 = 0; var7 < par4; ++var7)
		{
			for (int var8 = 0; var8 < par3; ++var8)
			{
				this.initChunkSeed(var8 + par1, var7 + par2);
				int id = var5[var8 + var7 * par3];
				if (TFC_Core.isOceanicBiome(id))
					var6[var8 + var7 * par3] = id;
				else
					var6[var8 + var7 * par3] = this.allowedBiomes[this.nextInt(this.allowedBiomes.length)].biomeID;

				validateInt(var6, var8 + var7 * par3);
			}
		}
		return var6;
	}
}
