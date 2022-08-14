package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {

        int i, j, k;

        // for loop for printing
        // upper half
        for (i = height; i >0; i--) {

            // printing i spaces at
            // the beginning of each row
            for (j = height-i; j >=1; j--){
                System.out.print(" ");
            }


            // printing i to rows value
            // at the end of each row
            for (k = 1; k <= i; k++){
                System.out.print("8 ");
            }


            System.out.println();
        }

        for (i = 1; i <=height; i++) {

            // printing i spaces at
            // the beginning of each row
            for (j = 1; j <=height-i; j++){
                System.out.print(" ");
            }


            // printing i to rows value
            // at the end of each row
            for (k = 1; k <= i; k++){
                System.out.print("8 ");
            }


            System.out.println();
        }


    }
        }



