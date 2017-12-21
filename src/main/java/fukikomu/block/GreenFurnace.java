package fukikomu.block;

import fukikomu.Fukikomu;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GreenFurnace extends Block
{
    public GreenFurnace()
    {
        super(Material.ROCK);
        setUnlocalizedName(Fukikomu.MODID + ".greenFurnace");
        setRegistryName("greenfurnace");
    }
}
