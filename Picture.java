/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * 
 * @author  Jonah A. Miranda
 * @version 2023.01.30
 */
public class Picture
{
    // private Square wall;
    // private Square window;
    // private Triangle roof;
    // private Circle sun;
    private boolean drawn;
    private Person lebron;
    private Circle basketball;
    private Circle circle3;
    private Square sky;
    private Square court;
    private Square backboard;
    private Square piece;
    private Square pole1; 
    private Square pole2; 
    private Square pole3;
    private Square pole4;
    private Square pole5;
    private Square pole6;
    private Square pole7;
    private Square pole8;
    private Square pole9;
    private Triangle net;
    private Square paint;
    private Square paint2;
    private Circle key;
    


    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // wall = new Square();
        // window = new Square();
        // roof = new Triangle();  
        // sun = new Circle();
        lebron = new Person();
        basketball = new Circle();
        sky = new Square();
        court = new Square();
        backboard = new Square();
        piece = new Square();
        pole1 = new Square();
        pole2 = new Square();
        pole3 = new Square();
        pole4 = new Square();
        pole5 = new Square();
        pole6 = new Square();
        pole7 = new Square();
        pole8 = new Square();
        pole9 = new Square();
        net = new Triangle();
        paint = new Square();
        paint2 = new Square();
        key = new Circle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            // wall.moveHorizontal(-140);
            // wall.moveVertical(20);
            // wall.changeSize(120);
            // wall.makeVisible();
            
            // window.changeColor("black");
            // window.moveHorizontal(-120);
            // window.moveVertical(40);
            // window.changeSize(40);
            // window.makeVisible();
    
            // roof.changeSize(60, 180);
            // roof.moveHorizontal(20);
            // roof.moveVertical(-60);
            // roof.makeVisible();
    
            // sun.changeColor("yellow");
            // sun.moveHorizontal(100);
            // sun.moveVertical(-40);
            // sun.changeSize(80);
            // sun.makeVisible();
            
            sky.makeVisible();
            sky.changeColor("blue");
            sky.moveHorizontal(-330);
            sky.moveVertical(-480);
            sky.changeSize(525);
            
            court.makeVisible();
            court.changeColor("greenish"); 
            court.moveHorizontal(-330);
            court.moveVertical(45);
            court.changeSize(525);
            
            lebron.makeVisible();
            lebron.moveHorizontal(-50);
            lebron.moveVertical(-20);
            
            basketball.changeColor("orange");
            basketball.changeSize(20);
            basketball.makeVisible();
            basketball.moveHorizontal(80);
            basketball.moveVertical(-20);
            
            backboard.makeVisible(); 
            backboard.changeColor("black");
            backboard.changeSize(80);
            backboard.moveHorizontal(100);
            backboard.moveVertical(-85);
            
            piece.makeVisible();
            piece.changeColor("red");
            piece.changeSize(35);
            piece.moveHorizontal(123);
            piece.moveVertical(-40);
            
            pole1.makeVisible(); 
            pole1.changeColor("grey");
            pole1.changeSize(15);
            pole1.moveHorizontal(145);
            pole1.moveVertical(-5);
            
            pole2.makeVisible(); 
            pole2.changeColor("grey");
            pole2.changeSize(15);
            pole2.moveHorizontal(145);
            pole2.moveVertical(10);
            
            pole3.makeVisible(); 
            pole3.changeColor("grey");
            pole3.changeSize(15);
            pole3.moveHorizontal(145);
            pole3.moveVertical(15);
            
            pole4.makeVisible(); 
            pole4.changeColor("grey");
            pole4.changeSize(15);
            pole4.moveHorizontal(145);
            pole4.moveVertical(25);
            
            pole5.makeVisible(); 
            pole5.changeColor("grey");
            pole5.changeSize(15);
            pole5.moveHorizontal(145);
            pole5.moveVertical(35);
            
            pole6.makeVisible(); 
            pole6.changeColor("grey");
            pole6.changeSize(15);
            pole6.moveHorizontal(145);
            pole6.moveVertical(45);
            
            pole7.makeVisible(); 
            pole7.changeColor("grey");
            pole7.changeSize(15);
            pole7.moveHorizontal(145);
            pole7.moveVertical(55);
            
            pole8.makeVisible(); 
            pole8.changeColor("grey");
            pole8.changeSize(15);
            pole8.moveHorizontal(145);
            pole8.moveVertical(65);
            
            pole9.makeVisible(); 
            pole9.changeColor("grey");
            pole9.changeSize(15);
            pole9.moveHorizontal(145);
            pole9.moveVertical(65);
            
            net.makeVisible(); 
            net.changeColor("white");
            net.changeSize(35, 35);
            net.moveHorizontal(240);
            net.moveVertical(-40);
            
            paint.makeVisible();
            paint.changeColor("red");
            paint.changeSize(60);
            paint.moveHorizontal(85);
            paint.moveVertical(55);
            
            paint2.makeVisible();
            paint2.changeColor("red");
            paint2.changeSize(60);
            paint2.moveHorizontal(60);
            paint2.moveVertical(55);
            
            key.makeVisible();
            key.changeColor("red");
            key.changeSize(60);
            key.moveHorizontal(110);
            key.moveVertical(85);
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        // wall.changeColor("black");
        // window.changeColor("white");
        // roof.changeColor("black");
        // sun.changeColor("black");
        sky.changeColor("black");
        court.changeColor("black");
        lebron.changeColor("white");
        basketball.changeColor("white");
        backboard.changeColor("white");
        piece.changeColor("black");
        pole1.changeColor("white");
        pole2.changeColor("white");
        pole3.changeColor("white");
        pole4.changeColor("white");
        pole5.changeColor("white");
        pole6.changeColor("white");
        pole7.changeColor("white");
        net.changeColor("white");
        paint.changeColor("white");
        paint2.changeColor("white");
        key.changeColor("white");

    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        // wall.changeColor("red");
        // window.changeColor("black");
        // roof.changeColor("green");
        // sun.changeColor("yellow");
        sky.changeColor("blue");
        court.changeColor("greenish");
        lebron.changeColor("black");
        basketball.changeColor("orange");
        backboard.changeColor("black");
        piece.changeColor("red");
        pole1.changeColor("grey");
        pole2.changeColor("grey");
        pole3.changeColor("grey");
        pole4.changeColor("grey");
        pole5.changeColor("grey");
        pole6.changeColor("grey");
        pole7.changeColor("grey");
        net.changeColor("white");
        paint.changeColor("red");
        paint2.changeColor("red");
        key.changeColor("red");
        
    }
}
