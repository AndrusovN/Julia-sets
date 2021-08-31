package com.company;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
public class MainDraw {
    private static final int MAX_ITER = 100;

    public static void Draw(int W, int H, int a, int b, Complex C, String filename) throws Exception{
        BufferedImage img = new BufferedImage(W, H, BufferedImage.TYPE_3BYTE_BGR);
        Graphics2D g2d = img.createGraphics();

        try {
            g2d.setColor(Color.WHITE);
            g2d.fillRect(0, 0, W, H);
            Calculus MyCalc = new Calculus(C);
            for (int i = 0; i < W; i++){
                for (int j = 0; j < H; j++){
                    double r = (i - (double)W / 2.0) * a / W;
                    double im = (j - (double)H / 2.0) * b / H;
                    boolean IsIn = MyCalc.isIn(MAX_ITER, new Complex(r, im));
                    if(IsIn){
                        g2d.setColor(new Color(0, 0, 255));
                        g2d.fillRect(i, j, 1, 1);
                    }
                }
            }
        } finally {
            g2d.dispose();
        }
        ImageIO.write(img, "PNG", new File(filename + ".png"));
    }

}
