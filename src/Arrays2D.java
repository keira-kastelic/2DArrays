public class Arrays2D {
    public static void main(String[] args) {
        // 2D Arrays = array of arrays
        int[][] a = new int[4][3]; // making an array, item contained in it is an int array
        // 4 rows and 3 columns
        /** "Monster array"
         * 0: [ , , ]
         * 1: [ , , ]
         * 2: [ , , ]
         * 3: [ , , ]
         */

        System.out.println(a.length); // 4 --> rows
        System.out.println(a[0].length); // 3 --> columns

        // set them equal to values
        for(int rows = 0; rows < a.length; rows++){ // loop through all four of the outer items
            for(int cols = 0; cols < a[rows].length; cols++){ // looping through the inner array
                a[rows][cols] = rows; // at row 0 and column 0, then loops through
            }
        }

        // printing the values
        for(int rows = 0; rows < a.length; rows++){
            for(int cols = 0; cols < a[rows].length; cols++){
                System.out.println(a[rows][cols] + " ");
            }
            System.out.println();
        }


    }
}
