package shadow.mods.metallurgy.precious;

import java.util.Map;

import com.google.common.collect.Maps;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

import net.minecraft.src.Block;
import net.minecraft.src.ChestItemRenderHelper;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.RenderBlocks;
import net.minecraft.src.TileEntityRenderer;

public class FC_ChestRenderHelper implements ISimpleBlockRenderingHandler
{	
	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelID, RenderBlocks renderer) {
		// TODO Auto-generated method stub
		FC_TileEntityChest tec = new FC_TileEntityChest();
		tec.setType(metadata);
		TileEntityRenderer.instance.renderTileEntityAt(tec, 0.0D, 0.0D, 0.0D, 0.0F);
	}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean shouldRender3DInInventory() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int getRenderId() {
		// TODO Auto-generated method stub
		return mod_MetallurgyPrecious.PreciousChest.getRenderType();
	}
}
