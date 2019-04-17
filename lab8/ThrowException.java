class ThrowException
{
    public static void main(String[] args) {
        try
        {
        String str ="hello";
        System.out.println(str.length());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}