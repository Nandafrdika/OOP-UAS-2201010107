/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uasoop;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author NandaFrdika
 */
class loadIMG {

public static BufferedImage loadImage(String img){
BufferedImage bimg = null;
try{
 bimg = ImageIO.read(new File (img));
    
}catch(IOException e){


}    

return bimg;
    
    }
}
