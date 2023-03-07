import java.util.Random;

class DmvSimulator
{
    private static Random random = new Random();

    public static void main(String[] args) throws InterruptedException
    {
        System.out.println("\nWelcome to the Worst Place on Earth! The DMV!");
        Thread.sleep(5000);
        System.out.println("\nLet me give you a ticket that'll keep you here forever...");
        Thread.sleep(5000);

        int randomNum = random.nextInt(200) + 1;
        
        System.out.println("Your number is " + randomNum + ". Wow! That sucks! We just called that number. Looks like you'll have to wait. I hope you brought something to read! Have a seat.\n");
        Thread.sleep(5000);

        int calledNum = randomNum + 1;
        int windowNum = 1;
        
        while (calledNum != randomNum)
        {
            if (calledNum > 200)
            {
                calledNum = 0;
            }

            if (windowNum > 5)
            {
                windowNum = 1;
            }

            System.out.println("Number " + calledNum + ", please come to Window " + windowNum + ".");
            calledNum++;
            windowNum++;
            Thread.sleep(1000);
        }
        
        System.out.println("\nNumber " + calledNum + ", please come to Window " + windowNum + ".");
        Thread.sleep(3000);
        System.out.println("Amazing! You're still here! In that case, may I see your paperwork?");
        Thread.sleep(5000);
        System.out.println("\nYou hand in your paperwork...");
        Thread.sleep(3000);
        System.out.println("\nHmm... It seems you don't have the required paperwork.");
        Thread.sleep(3000);
        System.out.println("Looks like you'll have come back and get in line!");
        Thread.sleep(3000);
        System.out.println("MUHAHAHA! Your despair feeds our inefficient customer service! Begone!");
        Thread.sleep(3000);
    }
}