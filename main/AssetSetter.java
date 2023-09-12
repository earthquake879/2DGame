package main;

import object.Monster;
import object.OBJ_Boots;
import object.OBJ_Chest;
import object.OBJ_Door;
import object.OBJ_Key;
import object.OBJ_Sword;

public class AssetSetter {
	GamePanel gp;
	
	public AssetSetter(GamePanel gp) {
		this.gp = gp;
	}
	
	public void setObject(){
		
		gp.obj[0] = new OBJ_Key(gp);
		gp.obj[0].worldX = 40 * gp.tileSize;
		gp.obj[0].worldY = 7 * gp.tileSize;
		
		gp.obj[1] = new OBJ_Key(gp);
		gp.obj[1].worldX = 23 * gp.tileSize; 
		gp.obj[1].worldY = 40 * gp.tileSize; 
		
		gp.obj[2] = new OBJ_Key(gp);
		gp.obj[2].worldX = 38 * gp.tileSize; 
		gp.obj[2].worldY = 8 * gp.tileSize; 
		
		gp.obj[3] = new OBJ_Door(gp);
		gp.obj[3].worldX = 35 * gp.tileSize;
		gp.obj[3].worldY = 14 * gp.tileSize;
		
		gp.obj[4] = new OBJ_Door(gp);
		gp.obj[4].worldX = 33 * gp.tileSize; 
		gp.obj[4].worldY = 18 * gp.tileSize; 
		
		gp.obj[5] = new OBJ_Door(gp);
		gp.obj[5].worldX = 31 * gp.tileSize; 
		gp.obj[5].worldY = 20 * gp.tileSize; 
		
		gp.obj[6] = new OBJ_Chest(gp);
		gp.obj[6].worldX = 35 * gp.tileSize; 
		gp.obj[6].worldY = 11 * gp.tileSize; 
		
		gp.obj[7] = new OBJ_Boots(gp);
		gp.obj[7].worldX = 23 * gp.tileSize; 
		gp.obj[7].worldY = 38 * gp.tileSize; 
		
		gp.obj[8] = new OBJ_Sword(gp);
		gp.obj[8].worldX = 18 * gp.tileSize; 
		gp.obj[8].worldY = 15 * gp.tileSize; 
		
		gp.obj[9] = new Monster(gp);
		gp.obj[9].worldX = 35 * gp.tileSize;
		gp.obj[9].worldY = 15 * gp.tileSize;
	}
}
