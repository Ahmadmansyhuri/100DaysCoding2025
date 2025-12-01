package isc100dayscooding;

public class Days085 {
    public static void main(String[] args) {
        int [] array = {12, 23, 65, 87, 44};
        int max_num = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max_num) {
                max_num = array[i]; 
            }
        }
        System.out.println(max_num);
    }
}
