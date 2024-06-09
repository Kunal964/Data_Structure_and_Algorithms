package RecursioBasics;

public class RemoveDuplicatesinString {
    public static  void RemoveDuplicates(String str, int index, StringBuilder newstr, boolean map[]){
        if (index == str.length()){
            System.out.println(newstr);
            return;
        }
        char currchar = str.charAt(index);
        // In Java, the default value for a boolean in an array is false.
        if(map[currchar-'a']){
            // if we found true in a boolean array, then move forward
            RemoveDuplicates(str,index+1,newstr,map);
        }
        else {
            map[currchar - 'a'] =true;
            // set boolean array true and append the current char to new string.
            RemoveDuplicates(str, index+1, newstr.append(currchar), map);
        }
    }

    public static void main(String[] args) {
        String str = "intercollegiate";
        RemoveDuplicates(str, 0 , new StringBuilder(""), new boolean[26]);
    }
}
