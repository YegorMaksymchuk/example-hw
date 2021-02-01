import java.util.Arrays;

public class HomeWorkOne {
    public static void main(String[] args) {
        int[] arrayOne = new int[5];
        for (int i = 0; i <arrayOne.length ; i++) {
            arrayOne[i]=i+1;
        }
        System.out.println(Arrays.toString(arrayOne));
    }
}
