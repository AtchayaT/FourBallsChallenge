import processing.core.PApplet;

public class FourBallsChallenge extends PApplet {


        public static final int WIDTH=640;
        public static final int HEIGHT=480;
        public static final int DIAMETER=20;
        public static int x1=0,x2=0,x3=0,x4=0;



            public static void main(String[] args) {
                PApplet.main("FourBallsChallenge",args);
     }

        @Override
        public void settings() {
            super.settings();
            size(WIDTH, HEIGHT);
        }

        @Override
        public void setup() {
            paintWhite();
        }

        @Override
        public void draw() {
            ellipse(x1++,HEIGHT/5, DIAMETER, DIAMETER);
            ellipse(x2+=2,HEIGHT*2/5, DIAMETER, DIAMETER);
            ellipse(x3+=3,HEIGHT*3/5, DIAMETER, DIAMETER);
            ellipse(x4+=4,HEIGHT*4/5, DIAMETER, DIAMETER);
        }

        private void paintWhite() {
            background(255);
        }
    }







