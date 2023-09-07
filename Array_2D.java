public class Array_2D {
    public static void main(String[] args) {
        // 2D array = an array of arrays; 1:45;

      /*  String[][] cars = new String[3][3];
        cars[0][0] = "Camaro"; // the first [] is row, the second [] is the position in the column;
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverado";
        cars[1][0] = "Mustang";
        cars[1][1] = "Ranger";
        cars[1][2] = "F-150";
        cars[2][0] = "Ferrari";
        cars[2][1] = "BMW";
        cars[2][2] = "Tesla";

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {  //  nested 'for' loop;
                System.out.print(cars[i][j] + " ");     // i = row, j = column;
            }
        }  */
        // another way:
        String[][] cars = {
                {"Camaro", "Corvette", "Silverado"},
                {"Mustang", "Ranger", "F-150"},
                {"Ferrari", "BMW", "Tesla"}
        };
        for (int i = 0; i < cars.length; i++) {
            String[] subArray = cars[i];
            for (int j = 0; j < subArray.length; j++) {
                System.out.printf("%s\t", subArray[j]);
            }
            System.out.println();
        }

        int [][] arr = {{1,2},{3,4}};

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                System.out.printf(arr[i] [j] + "");
            }
            System.out.println();
        }
        arr [0] [0] = 10;  // NOTE: it is like the coordinates: first -> 'y' and second -> 'x'
        arr [0] [1] = 20;  // starting from the upper left corner going down and to the right;
        arr [1] [0] = 30;
        arr [1] [1] = 40;

        for (int [] x : arr) {     // for each loop is used for involving all elements within an Array;
            for (int y : x) {
                System.out.print(y);
            }
            System.out.println();
        }
    }
}