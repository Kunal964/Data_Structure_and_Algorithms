package bitmanipulation;

public class Check_Compliment {
    public static  void checkcompliment(){
        // Two's Compliment of Number
        // int twos_compliment = (~5)+1;
        // Add 1 to an integer so I'm doing Minus of (~5)
        int compliment = -(~5);
        //   System.out.println("Two's Compliment: " + twos_compliment);
        System.out.println("Compliment: " + compliment);
    }

    public static void main(String[] args) {
        checkcompliment();
    }

}
