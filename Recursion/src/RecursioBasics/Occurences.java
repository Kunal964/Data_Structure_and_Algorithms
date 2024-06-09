package RecursioBasics;
import java.util.Scanner;

public class Occurences {
    // first occurence
    public  static  int firstoccurence(int[] arr, int i , int key){
        if (arr[i] == key){
            return i;
        }
        else if (i== arr.length-1){
            return -1;
        }
        return firstoccurence(arr, i+1,key);
    }

    //last occurence
    public static  int lastoccurence(int[] arr, int i, int key){
        if (arr[i] == key){
            return i;
        }
        else if(i == 0){
            return -1;
        }
        return lastoccurence(arr, i-1,key);

    }
    // All the index value where key lies
    public  static int occurences(int[] arr, int i, int key){
        if (i == arr.length){
            return -1;
        }
        if (arr[i] == key){
            System.out.println("The index value where key "+ key+ " lies: " + i);
        }
        return occurences(arr, i+1,key);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Key");
        int key = sc.nextInt();
        int[] arr = {1,2,3,4,2,2,4,4,6,8,9};
        System.out.println("First Occurrence of the given key:  "+key+" is "+ firstoccurence(arr,0,key));
        System.out.println("Last Occurrence of th given key : "+key+" is "+ lastoccurence(arr, arr.length-1,key));
        occurences(arr,0,key);
    }
}
