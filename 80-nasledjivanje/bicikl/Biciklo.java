class Biciklo 
{
    public int gear;
    public int speed;
         
    public Biciklo(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }
         
    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }
         
    public void speedUp(int increment)
    {
        speed += increment;
    }
     
    public String toString() 
    {
        return("Broj tockova je " + gear + ", brzina " + speed);
    } 
}
