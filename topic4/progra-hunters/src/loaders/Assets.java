package loaders;

import java.awt.image.BufferedImage;

public class Assets {
    public static BufferedImage table;
    public static void init() {
        table = new LoaderImages().loadImage("/Users/ditmar/progra2_2024_2/topic4/progra-hunters/res/textures/poll.jpeg");
    
    }
}
