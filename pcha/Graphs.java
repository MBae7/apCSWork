public class Graphs extends PApplet
{
    public void settings()
    {
        size(400, 400);
    }

    public void setup()
    {
        
    }

    public void draw()
    {
        background(0);
        ellipse(x, 200, 100, 50);
        x++;
    }

    private float x = 200;

    public static void main(String[] args)
    {
        PApplet.main("Graphs");
    }
}

