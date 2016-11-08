package Tasks2;

/**
 * Created by elve on 11/2/2016.
 */
public class Task1 {

    public static void main(String[] args) {
        int[] array1={-5,-9,-5,-6,-9,-15,-945, 0,-22,-101};
        double[] array2={5.4,9,4,-6,9,24,24.21,0.3,5,2.3};

        System.out.println("Sum of all array elements = "+ sum(array1));
        System.out.println("Sum of all array elements (double data type) = "+ sum(array2));


        System.out.println("Min value of array element is "+ min(array1));
        System.out.println("Min value of array element (double data type) is "+ min(array2));


        System.out.println("Max value of array element is "+ max(array1));
        System.out.println("Max value of array element (double data type) is "+ max(array2));



        //MAX POSITIVE ELEMENT
        if (maxPositive(array1) >= 0){
            System.out.println("Max Positive value of array element is "+ maxPositive(array1));
        }
        else {
            System.out.println("Array does not contain positive elements");
        }


        if (maxPositive(array2) >= 0){
            System.out.println("Max Positive value of array elements (double data type) is "+ maxPositive(array2));
        }
        else {
            System.out.println("Array (double data type) does not contain positive elements");
        }


        System.out.println("Multiplication of array elements is "+ multiplication(array1));
        System.out.println("Multiplication of array elements (double data type) is "+ multiplication(array2));



        // MODULUS
        if (array1[9]==0){
            System.out.println("Invalid operation. Division by 0");
        }
        else {
            System.out.println("Modulus of 1st and last array elements =  "+ modulus(array1));
        }

        if (array2[9]==0){
            System.out.println("Invalid operation. Division by 0");
        }
        else {
            System.out.println("Modulus of 1st and last array elements =  "+ modulus(array2));
       }


        System.out.println("Second Largest value from array elements = " + secondLargest(array1));
        System.out.println("Second Largest value from array elements (double data type) = " + secondLargest(array2));

    }


// Let's calculate summary of all array elements
    public static int sum(int array[]){
        int a = 0;
        for (int i=0; i<=9; i++){
            a = a + array[i];
        }
        return a;
    }

    public static double sum(double array[]){
        double a;
        a=0;
        for (int i=0; i<=9; i++){
            a = a + array[i];
        }
        return a;
    }



// let's find minimum element of array
    public static int min(int array[]){
        int a = array[0];
        for (int i=1; i<=9; i++){
            if (a > array[i])
                a=array[i];
                    }
        return a;
    }

    public static double min(double array[]){
        double a = array[0];
        for (int i=1; i<=9; i++){
            if (a > array[i]){
                a=array[i];
            }
        }
        return a;
    }



// let's find max element of array
    public static int max(int array[]){
        int a = array[0];
        for (int i=1; i<=9; i++){
            if (a < array[i]){
                a = array[i];
            }
        }
        return a;
    }

    public static double max(double array[]) {
        double a = array[0];
        for (int i = 1; i <= 9; i++) {
            if (a < array[i]){
                a = array[i];
            }
        }
        return a;
    }



// let's find max positive element of array

    public static int maxPositive(int array[]){
        int a = array[0];
        for (int i = 1; i <= 9; i++) {
                if ((array[i] > 0) && (a < array[i])){
                    a = array[i];
                }
        }
        return a;
    }

    public static double maxPositive(double array[]){
        double a = array[0];
        for (int i = 1; i <= 9; i++) {
            if ((array[i] > 0) && (a < array[i])){
                a = array[i];
            }
        }
        return a;
    }



// let's find multiplication of elements of array

    public static int multiplication(int array[]){

        int a = 1;
        for (int i=0; i<=9; i++){
            if (a != 0){
            a = a*array[i];
            }
                else {
                 a=0;
                 break;
                }
        }
        return a;
    }

    public static double multiplication(double array[]){

        double a = 1;
        for (int i=0; i<=9; i++){
            if (a != 0){
                a = a*array[i];
            }
            else {
                a=0;
                break;
            }
        }
        return a;
    }



// let's find modulus of first and last elements of array

    public static int modulus(int array[]){
    int a = array [0];
    int b = array [9];
    int c = (a % b);
    return c;
    }

    public static double modulus(double array[]){
        double a = array [0];
        double b = array [9];
        double c = (a % b);
        return c;
    }



// let's find second Largest element of array

    public static int secondLargest(int array[]){
        int a = array[0];
        int b = 0;
            for (int i = 1; i<=9; i++){
                if ( array[i]>a ) {
                    a = array[i];
                }
            }
            for (int i = 0; i<=9; i++){
                if (array[i]< a){
                    b = array[i];
                    break;
                }
            }
            for (int i = 0; i<=9; i++) {
                if ((array[i] != a) && (array[i] > b)) {
                    b = array[i];
                }
            }
        return b;
    }

    public static double secondLargest(double array[]){
        double a = array[0];
        double b = 0;
        for (int i = 0; i<=9; i++){
            if ( array[i]>a ) {
                a = array[i];
            }
        }
        for (int i = 0; i<=9; i++){
            if (array[i]< a){
                b = array[i];
                break;
            }
        }
        for (int i = 0; i<=9; i++) {
            if ((array[i] != a) && (array[i] > b)) {
                b = array[i];
            }
        }
        return b;
    }
}
