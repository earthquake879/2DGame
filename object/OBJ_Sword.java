package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Sword extends SuperObject{
	
	GamePanel gp;
	
	public OBJ_Sword(GamePanel gp){
		
		name = "Sword";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/sword_normal.png"));
			uTool.scaleImage(image, gp.tileSize, gp.tileSize);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
