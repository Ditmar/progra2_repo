package loaders;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class LoaderImages {
    public BufferedImage loadImage(String path) {
        try {
            // todo config the correct way for the resources
            // getClass().getResource(path)
            // hack sol. new File(path);
            return ImageIO.read(new File(path));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
