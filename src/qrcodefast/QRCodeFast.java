/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qrcodefast;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author bg18
 */
public class QRCodeFast {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        //QrCode qr0 = QrCode.encodeText("Hello, world!", QrCode.Ecc.MEDIUM);
        QrCode qr0 = QrCode.encodeText("Hello, world! TODO code application logic here", QrCode.Ecc.MEDIUM);
        BufferedImage img = qr0.toImage(4, 10);
        ImageIO.write(img, "png", new File("qr-code.png"));

        for (int i = 0; i < 10; i++) {
            long t0 = System.currentTimeMillis();
            QrCode qr01 = QrCode.encodeText("Hello, world! TODO code application logic here", QrCode.Ecc.MEDIUM);
            BufferedImage img1 = qr01.toImage(4, 10);
            ImageIO.write(img, "png", new File("qr-code.png"));
            long t1 = System.currentTimeMillis();
            System.out.println(t1 - t0);
        }

    }

}
