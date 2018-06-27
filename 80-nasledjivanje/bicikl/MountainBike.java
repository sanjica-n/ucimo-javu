class MountainBike extends Biciklo 
{
     
    public int seatHeight;
 
    public MountainBike(int gear,int speed, int startHeight)
    {
        super(gear, speed);
        seatHeight = startHeight;
    } 
         
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    } 
     
    // overriding parent method
    @Override
    public String toString()
    {
        return (super.toString() + ", visina sedista " + seatHeight);
    }
     
}
