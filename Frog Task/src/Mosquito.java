import java.util.Random;

public class Mosquito {
    boolean alive = true;
    

    public void zhzh()
    {
        System.out.println("ЖЖЖЖЖ");
    }
    public Mosquito[] makeMosquitos()
    {
        Mosquito[] mosqArray = new Mosquito[12];
        for (int i=0; i < 12; i++)
        {
            mosqArray[i] = new Mosquito();
        }
        return mosqArray;
    }
}
