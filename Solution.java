import java.util.*;

class Solution {

    public static int a;
    public static int b;

    public static String result(int a, int b) {
        if (a > b) {
            return a + " - " + b + " = " + (a - b);
        } else if (a < b) {
            return b + " - " + a + " = " + (b - a);
        } else {
            return a + " is equal to " + b;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int option;

        do {
            System.out.print("\n'1' - enter the two numbers for operation\n'2' - Exit\n\nEnter your option here: ");
            option = scan.nextInt();

            switch (option) {
                case 1:
                    System.out.print("\nEnter the first number: ");
                    a = scan.nextInt();
                    System.out.print("Enter the second number: ");
                    b = scan.nextInt();

                    System.out.println(result(a, b));
                    break;

                case 2:
                    System.out.println("Thank you for your session!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (option != 2);

        scan.close();
    }
}


    /*

    - 27. Remove Element -

class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int index=0;
        int flag=0;

        for(int i = 0; i < len; i++) {
            if (nums [i] != val) {
                nums [index++] = nums [i];
                flag=1;
            }
            if (nums [i] == val)
                flag = 1;
        }
        if (flag == 1)
        return index;

        else
            return nums.length;
    }
}
//-------------------------------------------------------------------------------------------
    - 200. Number of Islands -

https://www.youtube.com/watch?v=U6-X_QOwPcs&list=PLU_sdQYzUj2keVENTP0a5rdykRSgg9Wp-

    public int numIslands(char[][] grid) {

        int count = 0; // create initial number of islands;

        for (int i = 0; i < grid.length; i++){ // iterate through each element of the row;
            for (int j = 0; j < grid[i].length; j++) { // through each index;
            if (grid[i][j] == '1') {  // if we see '1',
                count ++;            // add it to a number of islands,
                result(grid, i, j); //  we call the method 'result' below;
            }
          }
       }
        return count; // the number of islands;
    }
    public void result (char[] [] grid, int i, int j){ // the method makes a boundary check;
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0')
        return;

        grid [i] [j] = '0'; // we set the element from '1' to '0' for not to see it again;
        result(grid, i+1, j); // up
        result(grid, i-1, j); // down
        result(grid, i, j-1); // left
        result(grid, i, j+1); // right
    }
  }
//-------------------------------------------------------------------------------------------
    - 219. Contains Duplicate II -

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> d = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            if (i - d.getOrDefault(nums[i], -1000000) <= k) { // getOrDefault in Java is a function or a method
                                                             // that comes with the HashMap class and is used to
                                                            // find the value mapped to the specified key in HashMap.
                return true;
            }
            d.put(nums[i], i);
        }
        return false;
    }
//-------------------------------------------------------------------------------------------
    - 220. Contains Duplicate III -

       public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        TreeSet<Long> ts = new TreeSet<>();
        for (int i = 0; i < nums.length; ++i) {
            Long x = ts.ceiling((long) nums[i] - (long) valueDiff);
            if (x != null && x <= (long) nums[i] + (long) valueDiff) {
                return true;
            }
            ts.add((long) nums[i]);
            if (i >= indexDiff) {
                ts.remove((long) nums[i - indexDiff]);
            }
        }
        return false;
    }
//--------------------------------------------------------------------------------------------






     */

