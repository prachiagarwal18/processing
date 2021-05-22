import processing.core.PApplet;

public class fourBall extends PApplet {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;
    int a=0;
    int b=0;
    int c=0;
    int d=0;

    public static void main(String[] args) {
        PApplet.main("fourBall",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        drawBall(a, HEIGHT);
        drawBall(b, HEIGHT*2);
        drawBall(c, HEIGHT*3);
        drawBall(d, HEIGHT*4);
        a++;
        b=b+2;
        c=c+3;
        d=d+4;
    }

    private void drawBall(int a, int height) {
        ellipse(a, (height) / 5, 20, 20);
    }
}
