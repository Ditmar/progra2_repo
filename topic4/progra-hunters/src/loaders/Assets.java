package loaders;

import java.awt.image.BufferedImage;

public class Assets {
    public static BufferedImage table;
    public static void init() {
        table = new LoaderImages().loadImage("C:/Users/PERSONAL/progra2_repo/topic4/progra-hunters/res/textures/poll.jpeg");
    
    }
}
