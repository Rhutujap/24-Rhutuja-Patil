
import ch.aplu.robotsim.Gear;
import ch.aplu.robotsim.NxtRobot;
import ch.aplu.robotsim.Tools;

public class square {
    
square()
  {
    NxtRobot r = new NxtRobot();
    Gear g = new Gear();
    r.addPart(g);
    g.setSpeed(100);
    
    g.forward(1000);
    g.left(275);
    g.forward(1000);
    g.left(275);
    g.forward(1000);
    g.left(275);
    
    g.forward(1000);
    
    Tools.delay(2000);
    r.exit();
  }
  public static void main(String[] args)
  {
    new square();
  }
}  
            

