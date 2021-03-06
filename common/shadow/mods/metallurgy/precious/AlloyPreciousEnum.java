package shadow.mods.metallurgy.precious;

import shadow.mods.metallurgy.IMetalSetEnum;
import shadow.mods.metallurgy.MetallurgyEnumToolMaterial;

public class AlloyPreciousEnum implements IMetalSetEnum{

	public static String[] name = {"Brass", "Electrum"};
	private int[] expValues = {4, 11};
	private int[] harvestLevels = {2, 2};
	private int[] pickLevels = {1, 2};
	private int[] dungeonLootChances = {35, 15};
	private int[] dungeonLootAmounts = {3, 2};
	
	@Override
	public int numMetals() {
		return 2;
	}

	@Override
	public int startID() {
		return PreciousConfig.ItemStartID + 150;
	}

	@Override
	public String name(int i) {
		return name[i];
	}

	@Override
	public int expValue(int i) {
		return expValues[i];
	}

	@Override
	public int oreHarvestLevel(int i) {
		return harvestLevels[i];
	}

	@Override
	public int brickHarvestLevel(int i) {
		return harvestLevels[i];
	}

	@Override
	public int pickLevel(int i) {
		return pickLevels[i];
	}

	@Override
	public String image() {
		return "/shadow/MetallurgyPreciousAlloys.png";
	}

	@Override
	public boolean isAlloy() {
		return true;
	}

	@Override
	public int veinCount(int i) {
		return 0;
	}

	@Override
	public int oreCount(int i) {
		return 0;
	}

	@Override
	public int oreHeight(int i) {
		return 0;
	}

	@Override
	public int oreID() {
		return 0;
	}

	@Override
	public int brickID() {
		return PreciousConfig.PreciousAlloysBrickID;
	}

	@Override
	public String getSetName() {
		return "PreciousAlloy";
	}

	@Override
	public MetallurgyEnumToolMaterial toolEnum(int i) {
		switch(i)
		{
			case(0):
				return MetallurgyEnumToolMaterial.Brass;
			case(1):
				return MetallurgyEnumToolMaterial.Electrum;
		}
		return MetallurgyEnumToolMaterial.Brass;
	}

	@Override
	public boolean isCatalyst(int i) {
		return false;
	}

	@Override
	public int dungeonLootChance(int i) {
		return dungeonLootChances[i];
	}

	@Override
	public int dungeonLootAmount(int i) {
		return dungeonLootAmounts[i];
	}

	@Override
	public int numRails(int i) {
		return 0;
	}

	@Override
	public int getDimension()
	{
		return 0;
	}

}
