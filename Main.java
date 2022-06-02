import java.util.*;
public class Main {
    static ArrayList<HashSet<String>> together;
    static ArrayList<HashSet<String>> apart;
    static ArrayList<HashSet<String>> groups;
    static int counter = 0;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numTogether = Integer.parseInt(sc.nextLine());

        if(numTogether > 0) {
            together = new ArrayList<HashSet<String>>();

            for (int i = 0; i < numTogether; i++) {
                HashSet<String> tempSt = new HashSet<String>();
                for (int j = 0; j < 2; j++) {
                    tempSt.add(sc.next());
                }
                together.add(tempSt);
            }
        }

        int numApart = Integer.parseInt(sc.next());

        if(numApart > 0) {
            apart = new ArrayList<HashSet<String>>();

            for (int i = 0; i < numApart; i++) {
                HashSet<String> tempSt = new HashSet<String>();
                for (int j = 0; j < 2; j++) {
                    tempSt.add(sc.next());
                }
                apart.add(tempSt);
            }
        }

        int numGroups = Integer.parseInt(sc.next());
        groups = new ArrayList<HashSet<String>>();
        for(int i = 0; i < numGroups; i++){
            HashSet<String> tempSt = new HashSet<String>();
            for(int j = 0; j < 3; j++) {
                tempSt.add(sc.next());
            }
            groups.add(tempSt);
        }


        //checks for illegal group member violations
        for (int i = 0; i < groups.size(); i++){
            for(int j = 0; j < numApart; j++){
                if(groups.get(i).contains(apart.get(j))){
                    counter++;
                }
            }

        }

        //checks if members are together
         for (int i = 0; i < numTogether; i++){
            int groupcount= 0;
            for(int j = 0; j < numGroups; j++){
                if(groups.get(j).contains(together.get(i))){
                    groupcount++;
                }
            }
            if(groupcount == 0){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
