import java.util.Arrays;

public class RepeatingEvenNumbers {
    static boolean isFind(int[]arr,int value){
        for (int i:arr) {
            if(i==value){
                return true;
            }
            
        }
        return false;

    }
    public static void main(String[]args){
        int[]list={2,7,3,3,2,9,10,21,1,33,9,1,8,8,3,5,6,6};
        int[]dublicate=new int[list.length];
        int Startindex=0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length ; j++) {
                if((i!=j)&&(list[i]==list[j])&&(list[i]%2==0)){
                    if(!isFind(dublicate,list[i])){
                        dublicate[Startindex++]=list[i];
                    }
                    break;
                }
                
            }
            
        }

        for(int value:dublicate){
            if(value!=0){
                System.out.println(value);
            }
        }
    }
}

