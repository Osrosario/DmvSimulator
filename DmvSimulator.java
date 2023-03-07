import java.util.Random;

class DmvSimulator
{
    private static Random random = new Random();

    public static void main(String[] args) throws InterruptedException
    {
        System.out.println("\nWelcome to the Worst Place on Earth! The DMV!");
        System.out.println("\nLet me give you a ticket that'll keep you here forever...");

        int randomNum = random.nextInt(200) + 1;
        
        System.out.println("Your number is " + randomNum + ". Wow! That sucks! We just called that number. Looks like you'll have to wait. I hope you brought something to read! Have a seat.\n");

        int calledNum = randomNum + 1;
        int windowNum = 1;
        int miracleNum = random.nextInt(100) + 1;
        
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
        }
        
        if (miracleNum == 27)
        {
            System.out.println("\nAmazing! You're still here! In that case, may I see your paperwork?");
            System.out.println("\nYou hand in your paperwork...");
            System.out.println("\nWow! You actually have the correct paperwork!");
        }
        else
        {
            System.out.println("\nNumber " + calledNum + ", please come to Window " + windowNum + ".");
            System.out.println("Amazing! You're still here! In that case, may I see your paperwork?");
            System.out.println("\nYou hand in your paperwork...");
            System.out.println("\nYou really waited all this time and don't even have the correct paperwork?? Shame...");
            System.out.println("Looks like you'll have come back and get in line!");
            System.out.println("MUHAHAHAAHAHHAHAHAHAHAHAHAHAHHAHAAHAHAhahahahAHAHAHAHaahahahAHAHHA! Your despair feeds our inefficient customer service! Begone foul beast!");
        }
    }
}