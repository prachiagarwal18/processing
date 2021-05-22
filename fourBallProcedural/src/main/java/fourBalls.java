import processing.core.PApplet;

public class fourBalls extends PApplet {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;
    int a=0;
    int b=0;
    int c=0;
    int d=0;

    public static void main(String[] args) {
        PApplet.main("fourBalls",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
//        ellipse(WIDTH/2,HEIGHT/2,20,20);
    }

    @Override
    public void draw() {
        ellipse(a,(HEIGHT)/5,20,20);
        ellipse(b,(HEIGHT*2)/5,20,20);
        ellipse(c,(HEIGHT*3)/5,20,20);
        ellipse(d,(HEIGHT*4)/5,20,20);
        a++;
        b=b+2;
        c=c+3;
        d=d+4;

    }
}
