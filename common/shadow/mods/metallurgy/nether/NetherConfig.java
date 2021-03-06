package shadow.mods.metallurgy.nether;

import java.io.File;
import java.io.IOException;

import net.minecraft.client.Minecraft;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraftforge.common.Configuration;

public class NetherConfig  {

	public static int NetherMetalsVeinID;
	public static int NetherMetalsBrickID;
	public static int NetherAlloysBrickID;
	public static int furnaceID;
	
	public static boolean[] alloyEnabled = new boolean[3];
	public static boolean[] metalEnabled = new boolean[8];
	public static boolean furnaceEnabled;

	public static float[] speeds = new float[8];
	public static int[] buckets = new int[8];

	public static int[] VeinCount = new int[8];
	public static int[] OreCount = new int[8];
	public static int[] OreHeight = new int[8];

	public static int ObsidianVeinCount;
	public static int ObsidianOreCount;
	public static int ObsidianOreHeight;
	public static int ItemStartID;
	
	
	public static void init()
	{
		File file = new File(mod_MetallurgyNether.proxy.getMinecraftDir() + "/config/Metallurgy");
    	file.mkdir();
    	File newFile = new File(mod_MetallurgyNether.proxy.getMinecraftDir() + "/config/Metallurgy/MetallurgyNether.cfg");
    	
        try
        {
            newFile.createNewFile();
            System.out.println("Successfully created/read configuration file");
        }
        catch (IOException e)
        {
            System.out.println("Could not create configuration file for mod_MetallugyBase. Reason:");
            System.out.println(e);
        }

        /* [Forge] Configuration class, used as config method */
        Configuration config = new Configuration(newFile);

        /* Load the configuration file */
        config.load();
        
        
    	NetherMetalsVeinID = config.getOrCreateBlockIdProperty("Metal Ore", 915).getInt(915);
    	NetherMetalsBrickID = config.getOrCreateBlockIdProperty("Metal Brick", 916).getInt(916);
    	NetherAlloysBrickID = config.getOrCreateBlockIdProperty("Alloy Brick", 917).getInt(917);
    	furnaceID = config.getOrCreateBlockIdProperty("Nether Smelter", 918).getInt(918);

    	for(int i = 0; i < 3; i++)
    		alloyEnabled[i] = config.getOrCreateBooleanProperty(AlloyNetherEnum.names[i] + " Enabled", "Ores", true).getBoolean(true);
    	for(int i = 0; i < 8; i++)
    		metalEnabled[i] = config.getOrCreateBooleanProperty(OreNetherEnum.names[i] + " Enabled", "Ores", true).getBoolean(true);


    	
    	speeds[0] = config.getOrCreateIntProperty("Ignatius", "Furnace Speed", 10000).getInt(10000)/1000f;
    	speeds[1] = config.getOrCreateIntProperty("ShadowIron", "Furnace Speed", 9500).getInt(9500)/1000f;
    	speeds[2] = config.getOrCreateIntProperty("ShadowSteel", "Furnace Speed", 9000).getInt(9000)/1000f;
    	speeds[3] = config.getOrCreateIntProperty("Vyroxeres", "Furnace Speed", 8500).getInt(8500)/1000f;
    	speeds[4] = config.getOrCreateIntProperty("Inolashite", "Furnace Speed", 8000).getInt(8000)/1000f;
    	speeds[5] = config.getOrCreateIntProperty("Kalendrite", "Furnace Speed", 7000).getInt(7000)/1000f;
    	speeds[6] = config.getOrCreateIntProperty("Vulcanite", "Furnace Speed", 6000).getInt(6000)/1000f;
    	speeds[7] = config.getOrCreateIntProperty("Sanguinite", "Furnace Speed", 5000).getInt(5000)/1000f;

    	buckets[0] = config.getOrCreateIntProperty("Ignatius", "Furnace Buckets", 10).getInt(10);
    	buckets[1] = config.getOrCreateIntProperty("ShadowIron", "Furnace Buckets", 20).getInt(20);
    	buckets[2] = config.getOrCreateIntProperty("ShadowSteel", "Furnace Buckets", 30).getInt(30);
    	buckets[3] = config.getOrCreateIntProperty("Vyroxeres", "Furnace Buckets", 40).getInt(40);
    	buckets[4] = config.getOrCreateIntProperty("Inolashite", "Furnace Buckets", 50).getInt(50);
    	buckets[5] = config.getOrCreateIntProperty("Kalendrite", "Furnace Buckets", 60).getInt(60);
    	buckets[6] = config.getOrCreateIntProperty("Vulcanite", "Furnace Buckets", 80).getInt(80);
    	buckets[7] = config.getOrCreateIntProperty("Sanguinite", "Furnace Buckets", 100).getInt(100);

    	ItemStartID = config.getOrCreateIntProperty("Item Start IDs", "Item Ids Uses next 550", 27000).getInt(27000);

    	for(int i = 0; i < 8; i++)
    	{
	    	VeinCount[i] = config.getOrCreateIntProperty(OreNetherEnum.names[i] + " Vein Count", "Ore Generation", OreNetherEnum.defaultVeinCount[i]).getInt(OreNetherEnum.defaultVeinCount[i]);
	    	OreCount[i] = config.getOrCreateIntProperty(OreNetherEnum.names[i] + " Ore Count", "Ore Generation", OreNetherEnum.defaultOreCount[i]).getInt(OreNetherEnum.defaultOreCount[i]);
	    	OreHeight[i] = config.getOrCreateIntProperty(OreNetherEnum.names[i] + " Height", "Ore Generation", OreNetherEnum.defaultOreHeight[i]).getInt(OreNetherEnum.defaultOreHeight[i]);
    	}
    
    	ObsidianVeinCount = config.getOrCreateIntProperty("Obsidian Vein Count", "Ore Generation", 1).getInt(1);
    	ObsidianOreCount = config.getOrCreateIntProperty("Obsidian Ore Count", "Ore Generation", 72).getInt(72);
    	ObsidianOreHeight = config.getOrCreateIntProperty("Obsidian Height", "Ore Generation", 3).getInt(128);
    	
    	config.save();
	}
}
