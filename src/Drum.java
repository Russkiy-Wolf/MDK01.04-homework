import java.util.Objects;

public class Drum implements Instrument
{
    private String size;


    public String getSize()
    {
        return size;
    }

    public void setSize(String size)
    {
        this.size = size;

    }

    @Override
    public  void play()
    {
        size = "15";
        System.out.println("Играет барабан с размером" + " " + size);
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Drum)) return false;

        Drum drum = (Drum) o;

        return Objects.equals(size, drum.size);
    }

    @Override
    public int hashCode()
    {
        return size != null ? size.hashCode() : 0;
    }

    @Override
    public String toString()
    {
        return "Drum{" +
                "size='" + size + '\'' +
                '}';
    }
}
