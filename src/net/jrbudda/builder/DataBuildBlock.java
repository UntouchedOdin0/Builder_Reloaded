package net.jrbudda.builder;

import java.util.EnumSet;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.UnsafeValues;
import org.bukkit.material.MaterialData;

class DataBuildBlock
  extends EmptyBuildBlock
{
  private MaterialData mat;
  private byte newdata;
  
  DataBuildBlock(int x, int y, int z, int id, byte data)
  {
     this.X = x;
     this.Y = y;
     this.Z = z;
     this.mat = convertMaterial(id, data);
     this.newdata = data;
  }
  
  public MaterialData getMat()
  {
     return this.mat;
  }
  
  public byte getData()
  {
     return this.newdata;
  }
  
  public static MaterialData convertMaterial(int ID, byte Data) {
     for (Material i : EnumSet.allOf(Material.class)) if (i.getId() == ID) return new MaterialData(Bukkit.getUnsafe().fromLegacy(new MaterialData(i, Data)));
     return new MaterialData(Material.AIR);
  }
}

