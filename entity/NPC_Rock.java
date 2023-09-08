package entity;

import java.io.IOException;
import entity.Player;
import javax.imageio.ImageIO;
import main.UI;
import main.GamePanel;;

public class NPC_Rock extends Entity {
	GamePanel gp;
	UI ui;

	public NPC_Rock(GamePanel gp) {
		this.gp = gp;
		ui = new UI(gp);
		worldX = 26;
		worldY = 34;
		collisionOn = true;

	}

	public void interact() {
		ui.showMessage("Shhhhh, don't tell anyone I'm here");
	}

	public void getRockImage() {
		try {
			up1 = ImageIO.read(getClass().getResourceAsStream("/player/bigrock.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
