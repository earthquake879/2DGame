package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class Monster extends SuperObject {
	public static int strength;
	public Monster() {
		strength = 1;
		name = "Monster";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/NPC/2DGameMonster.png"));
		} catch (IOException e) {

		}
		collision = true;
	}
}
