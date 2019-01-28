
/**
 * @author Dylan Kearney
 */
public class myPicture
{
    private Square trunk1;
    private Square trunk2;
    private Square trunk3;
    private Circle leaf1;
    private Circle leaf2;
    private Circle leaf3;
    private Square branch1;
    private Square branch2;
    private boolean drawn;

    /**
     * Constructor for objects of class myPicture
     */
    public myPicture()
    {
        trunk1 = new Square();
        trunk2 = new Square();
        trunk3 = new Square();  
        leaf1 = new Circle();
        leaf2 = new Circle();
        leaf3 = new Circle();
        branch1 = new Square();
        branch2 = new Square();
        drawn = false;
    }
    
        public void draw()
    {
        trunk1.moveHorizontal(-140);
        trunk1.moveVertical(20);
        trunk1.changeSize(40);
        trunk1.changeColor("brown");
        trunk1.makeVisible();
        
        trunk2.moveHorizontal(-140);
        trunk2.moveVertical(60);
        trunk2.changeSize(40);
        trunk2.changeColor("brown");
        trunk2.makeVisible();
        
        trunk3.moveHorizontal(-140);
        trunk3.moveVertical(100);
        trunk3.changeSize(40);
        trunk3.changeColor("brown");
        trunk3.makeVisible();
        
        leaf1.changeColor("green");
        leaf1.moveHorizontal(-50);
        leaf1.moveVertical(-10);
        leaf1.changeSize(80);
        leaf1.makeVisible();
        
        leaf2.changeColor("green");
        leaf2.moveHorizontal(-100);
        leaf2.moveVertical(10);
        leaf2.changeSize(70);
        leaf2.makeVisible();
        
        leaf3.changeColor("green");
        leaf3.moveHorizontal(-90);
        leaf3.moveVertical(-20);
        leaf3.changeSize(90);
        leaf3.makeVisible();
        
        branch1.moveHorizontal(-100);
        branch1.moveVertical(60);
        branch1.changeSize(20);
        branch1.changeColor("brown");
        branch1.makeVisible();
        
        branch2.moveHorizontal(-80);
        branch2.moveVertical(60);
        branch2.changeSize(20);
        branch2.changeColor("brown");
        branch2.makeVisible();
    }
}
