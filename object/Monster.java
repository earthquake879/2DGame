package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class Monster extends SuperObject{
	
	GamePanel gp;
	
	public Monster(GamePanel gp){
		
		name = "Monster";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/npc/2DGameMonster.png"));
			uTool.scaleImage(image, gp.tileSize, gp.tileSize);
		}catch(IOException e){
			e.printStackTrace();
		}
		collision = true;
	}
}

