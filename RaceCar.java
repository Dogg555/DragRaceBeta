public class RaceCar
{
  private String make;
  private String model;
  private int topSpeed;
  private int rarity;
  private int cost;
  private int level;
  private int experience;
  
  public RaceCar() 
  {
    
  }
  public RaceCar(String ma, String mo, int ts, int r, int c, int l, int e)
  {
    make = ma;
    model = mo;
    topSpeed = ts;
    rarity = r;
    cost = c;
    level = l;
    experience = e;
  }
  public void setMake(String ma) 
  {
    this.make = ma;
  }
  public void setModel(String mo) 
  {
    this.model = mo;
  }
  public void setTopSpeed(int ts)
  {
    this.topSpeed = ts;
  }
  public void setRarirty(int r) 
  {
    this.rarity = r;
  }
  public void setCost(int c) 
  {
    this.cost = c;
  }
  public void setLevel(int l) 
  {
    this.level = l;
  }
  public void setExperience(int e) 
  {
    this.experience = e;
  }
  public String getMake()
  {
    return make;
  }
  public String getModel() 
  {
    return model;
  }
  public int getTopSpeed() 
  {
    return topSpeed;
  }
  public int getRarity() 
  {
    return rarity;
  }
  public int getCost() 
  {
    return cost;
  }
  public int getLevel() 
  {
    return level;
  }
  public int getExperience() 
  {
    return experience;
  }
}