import java.awt.*;


public class Vertice{
    private Vertice predecessor;
    private Integer distance;
    
    
    public Integer getDistance() {
        return distance;
    }
    public void setDistance(Integer distance) {
        this.distance = distance;
    }
    private Color color = Color.WHITE;
 
    
    public Vertice getPredecessor() {
        return predecessor;
    }
    public void setPredecessor(Vertice predecessor) {
        this.predecessor = predecessor;
    }
   
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    
}