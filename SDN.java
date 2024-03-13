public class SDN
  {
    public static void main(String[] args)
    {
        int[] values = {100, 52, 43, 99, 42, 40, 91};
        int sum = 0;
        for (int value : values)
          {
            if (value % 10 == 0) 
            {
                sum += value;
            }
          }
       System.out.println("Sum: " + sum);
  }
}
