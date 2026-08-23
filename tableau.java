import java.util.ArrayList;
public class tableau {
    public static void main(String[] args)
    {
        double[] tab = {12.5, 15.0, 20.0,25.0};
          for(double element : tab)
          {
            System.out.println(element);
          }

          ArrayList<Integer> nombre = new ArrayList<>();
          nombre.add(10);
          nombre.add(15);
          nombre.add(25);
          nombre.add(30);
          for(int element : nombre)
          {
            System.out.println(element);
          }

    }
}
