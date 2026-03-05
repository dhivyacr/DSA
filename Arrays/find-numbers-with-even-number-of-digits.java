import java.util.*;
class Solution {
    public int findNumbers(int[] list) {
        int count=0;
        for(int i=0;i<list.length;i++){
            int digit = (int)Math.log10(Math.abs(list[i]))+1;
            if(digit%2==0){
                count++;
            }
        }
       return count;
    }
}
        /*
        public int findNumbers(int[] list){
        int count=0;
        for(int i=0;i<list.length;i++){
            int element=list[i];
            if(even(element)){
                count++;
            }
        }
        return count;
    }
    boolean even (int element){
        int count = (int) Math.log10(element)+1;
        if(count%2==0){
            return true;
        }
        return false;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        ArrayList<Integer>list=new ArrayList<>();
        while(sc.hasNextInt()){
            list.add(sc.nextInt());
        }
    }
}*/
