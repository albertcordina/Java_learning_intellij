public class IfExample {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        if (num1 > num2 && num1 > num3) {
            System.out.println("The biggest out of the three numbers is " + num1);
            System.out.println();
            if (num1 > num2 + num3) {
                System.out.print(num1 + " is bigger than the sum of " + num2 + "+" + num3 + " = " + (num2 + num3));
            }
            if (num1 < num2 + num3) {
                System.out.print(num1 + " is less than the sum of " + num2 + "+" + num3 + " = " + (num2 + num3));
            }
        }

        if (num2 > num1 && num2 > num3) {
            System.out.println("The biggest out of the three numbers is " + num2);
            System.out.println();
            if (num2 > num1 + num3) {
                System.out.print(num2 + " is bigger than the sum of " + num1 + "+" + num3 + " = " + (num1 + num3));
            }
            if (num2 < num1 + num3) {
                System.out.println(num2 + " is less than the sum of " + num1 + "+" + num3 + " = " + (num1 + num3));
            }
        }
        if (num3 > num1 && num3 > num2) {
            System.out.println("The biggest out of the three numbers is " + num3);
            if (num3 > num1 + num2) {
                System.out.print(num3 + " is bigger than the sum of " + num1 + "+" + num2 + " = " + (num1 + num2));
            }
            if (num3 < num1 + num2) {
                System.out.print(num3 + " is less than the sum of " + num1 + "+" + num2 + " = " + (num1 + num2));
            }
        }
    }
}
