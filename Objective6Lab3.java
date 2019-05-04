package SDPre.Labs;

public class Objective6Lab3 {
    public static void main(String[] args ){
        int counter = 1;

        while(counter <=20) {
            for (int n = 1; n <= 20; n++) {

                if (counter % 2 == 0)
                System.out.println(counter + " is even");
                else
                System.out.println(counter + " is odd");

                counter = (counter + 1);

            }
        }
    }

    }

