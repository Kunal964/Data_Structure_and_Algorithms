package Arrays;

public class ReversedArray {

        public static void reversed(int[] number){
            int  first = 0 , last = number.length-1;
            while (first<last) {
                int temp = number[last];
                number[last] = number[first];
                number[first] = temp;

                first++;
                last--;
            }

        }
        public static void main(String[] args) {
            int[] number = {1,3,6,7,5,8,2};
            reversed(number);

            for(int i =0; i<number.length ; i++){
                System.out.print(number[i] + " ");

            }
            System.out.println();


        }

}

