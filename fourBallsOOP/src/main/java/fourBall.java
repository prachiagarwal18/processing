import processing.core.PApplet;

public class fourBall extends PApplet {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;
    public static final int DIAMETER=20;
    private Ball[] balls=new Ball[4];
    public fourBall(){

        for(int IndexOfBall=0;IndexOfBall<balls.length;IndexOfBall++){
            int ballNum=IndexOfBall+1;
            balls[IndexOfBall]=new Ball(HEIGHT*ballNum/5,ballNum,DIAMETER);
        }
    }

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
        for(Ball ball:balls){
            ball.drawBall(this);
            ball.increamnetInXDirection();
        }
    }

}
