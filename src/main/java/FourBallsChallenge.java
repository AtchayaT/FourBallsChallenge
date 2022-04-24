import processing.core.PApplet;



public class FourBallsChallenge extends PApplet {


    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;

    public static final int Diameter=30;

    public static int noOfBalls = 4;
    public static  int x[] ={0,0,0,0};

    Balls[] balls = new Balls[noOfBalls];

    public static void main(String[] args) {
        PApplet.main("FourBallsChallenge", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        for(int i=1;i<=noOfBalls;i++){
            this.balls[i - 1]=new Balls(0,(i*HEIGHT)/5, DIAMETER,i);
        }
    }

    @Override
    public void draw() {
        for (int i = 1; i <= noOfBalls; i++) {
            this.balls[i-1].speedOfBalls();
            this.balls[i-1].draw(this);
        }
    }


}
 class Balls extends PApplet {
    int X,Y, diameter,speed;

    Balls(int X,int Y,int diameter,int speed) {
        this.X=X;
        this.Y=Y;
        this.diameter=diameter;
        this.speed=speed;
    }

     public void draw(FourBallsChallenge fourBallsChallenge) {
        fourBallsChallenge.ellipse(X,Y,diameter,diameter);
     }

     public void speedOfBalls() {
         this.X += this.speed;
     }

 }










