 package net.jrbudda.builder;
 
 import java.util.Map;
 import net.citizensnpcs.api.jnbt.Tag;

 class TileBuildBlock
   extends DataBuildBlock
 {
   TileBuildBlock(int x, int y, int z, int id, byte data)
   {
     super(x, y, z, id, data);
   }
   
   public Map<String, Tag> tiles = null;
 }

