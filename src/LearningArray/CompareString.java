package LearningArray;

public class CompareString {
    public static void main(String[] args) {
       String temp;
        String [] name = {"birendra", "bhupendra","zeevan" ,"barsha"};
        for(int i = 0; i< name.length; i++) {
            for (int j = 0; j < name.length - 1; j++) {
                if (name[j].compareTo(name[j + 1]) > 0) {
                    temp = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = temp;
                }
            }
        }
            for(int i = 0; i< name.length;i++){
                System.out.println(name[i]);
            }
            }

        }

