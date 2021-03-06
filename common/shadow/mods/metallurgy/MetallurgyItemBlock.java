package shadow.mods.metallurgy;

import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemStack;

public class MetallurgyItemBlock extends ItemBlock{

	public MetallurgyItemBlock(int par1) {
		super(par1);
		setHasSubtypes(true);
	}

	@Override
	public int getMetadata(int metadata) {
		return metadata;
	}

    @Override
	public String getItemNameIS(ItemStack itemstack) {
		int meta = itemstack.getItemDamage();
		return getItemName() + "." + meta;
	}
}
