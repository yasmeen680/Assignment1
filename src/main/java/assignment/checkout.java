package assignment;

public class checkout {
  private int runnigTotal=0;
  public void add(int itemCount,int price)
  {
	  runnigTotal+=(itemCount*price);
  }
  public int total()
  {
	  return runnigTotal;
  }
}
