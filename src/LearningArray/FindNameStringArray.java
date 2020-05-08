package LearningArray;

public class FindNameStringArray {
    public static void main(String[] args) {
        String[] names = {"john", "rock", "justin"};
        boolean found = findName (names, "rock");
        if(found)
            System.out.println("user found");
        else {
            System.out.println("user not found");
        }
    }
     private static boolean findName(String[]names, String param){
        boolean isFound= false;
        for(String name: names){
            if(name.equals(param))
                isFound = true;
                else
                    isFound = false;
            }
        return isFound;
    }
}
