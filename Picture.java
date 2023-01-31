/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
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
    }
}
