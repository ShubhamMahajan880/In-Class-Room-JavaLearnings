class AdditionSystem
{
    static String first;
    static String second;

    public static void main(String args[])
    {
        first = args[0];
        second = args[1];

        int firstNumber = Integer.parseInt(first);
        int secondNumber = Integer.parseInt(second);

        int finalAns = numberAddition(firstNumber, secondNumber);
        System.out.println("The sum is - " + finalAns);
    }

    static int numberAddition(int a, int b)
    {
        return a + b;
    }
}