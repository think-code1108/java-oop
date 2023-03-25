public class Looping {
    public static void main(String[] args) {
        //For Loop
        for (int counter = 0; counter <= 10; counter++) {
            System.out.println("For Loop Ke - " + counter);
        }

        //While Loop
        int counterLoop = 0;
        while (counterLoop <= 5) {
            System.out.println("While Loop ke - " + counterLoop);
            counterLoop++;
        }

        //Do While Loop
        do {
            System.out.println("Do While Loop Ke - " + counterLoop);
            counterLoop++;
        } while (counterLoop <= 10);

        //Loop Array
        Number[] myNumbers = {90, 10, 11, 20};
        for (int counter = 0; counter < myNumbers.length; counter++) {
            System.out.println(myNumbers[counter]);
        }
    }
}
