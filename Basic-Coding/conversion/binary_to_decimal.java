package conversion;

public class binary_to_decimal
{
    public static void main(String[] args)
    {
        String binary = "1010";

        int decimal = Integer.parseInt(binary , 2);
        System.out.println(decimal);

    }
}
