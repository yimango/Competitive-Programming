import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int len = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int act = Integer.parseInt(scanner.nextLine());

        int horzCount = 0;
        int vertCount = 0;

        HashSet inputList = new HashSet<String>();
            for(int i = 2; i <= act + 1; i++){
                String nextAct = scanner.nextLine();
                if(inputList.contains(nextAct)){
                    if(Character.toString(nextAct.charAt(0)).equals("R")){
                        vertCount--;
                    }else{
                        horzCount--;
                    }
                    inputList.remove(nextAct);
                }else{inputList.add(nextAct);
                    if(Character.toString(nextAct.charAt(0)).equals("R")){
                        vertCount++;
                    }else{
                        horzCount++;
                    }
        }
        }System.out.println(vertCount * width + horzCount * len - 2 * vertCount * horzCount);
    }
}
