import greenfoot.*;
import java.util.Random;

public class MyWorld extends World {
    private Random random = new Random();

    public MyWorld() {
        super(1100, 650, 1);
        addObject(new pesawat(), 200, 400);
    }
    

    public void act() {
        if (random.nextInt(230) < 1) { // Munculkan "orang" dengan probabilitas 5%
            int randomX = random.nextInt(getWidth()); // Koordinat X acak
            int randomY = random.nextInt(getHeight()); // Koordinat Y acak
            addObject(new Orang(), randomX, randomY);
            // Tambahkan objek "orang" secara acak
        }
    }
    
}   

