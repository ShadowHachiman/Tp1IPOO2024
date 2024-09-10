// 1 A)
public class Spot {
    private double x;
    private double y;
    public  Spot(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getY() {
        return y;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void  add(int n){
        setX(getX()+n);
        setY(getY()+n);
    }

    public void addSpot(Spot oneSpot){
        setX(getX()+ oneSpot.getX());
        setY(getY()+ oneSpot.getY());
    }
    public double distance(Spot oneSpot){
        double dx = getX()- oneSpot.getX();
        double dy = getY()- oneSpot.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}
