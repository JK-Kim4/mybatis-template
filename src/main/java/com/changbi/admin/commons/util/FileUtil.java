package com.changbi.admin.commons.util;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.InputStream;

public class FileUtil {

    public static BufferedImage imageResize(InputStream inputStream,
                                            int width,
                                            int height) throws Exception{

        //전송 이미지
        BufferedImage inputImage = ImageIO.read(inputStream);

        //리턴 이미지
        BufferedImage outputImage = new BufferedImage(width, height, inputImage.getType());

        Graphics2D g2d = outputImage.createGraphics();
        g2d.drawImage(inputImage, 0, 0, width, height, null);
        g2d.dispose();

        return outputImage;
    }


}
