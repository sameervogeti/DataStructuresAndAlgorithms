import java.util.Arrays;

/*
 * Program to calculate Product of Arrays using recursion.
 * */
public class ProductOfArraysUsingRecursion {
    int result;

    public static void main(String[] args) {
        int[] array = {5, 7, 2};
        ProductOfArraysUsingRecursion productOfArraysUsingRecursion = new ProductOfArraysUsingRecursion();
        System.out.println(productOfArraysUsingRecursion.productOfArrays(array));
    }

    int productOfArrays(int[] array) {

        if (array.length == 0) {
            return 1;
        }
        result = array[0] * productOfArrays(Arrays.copyOfRange(array, 1, array.length));
        return result;
    }
}
