package in.ineuron.main;

import java.util.Scanner;

public class duplicate4555{
    public static void main(String[] args) {
    	System.out.println(" ");
    	Scanner Scn = new Scanner(System.in);
            boolean flag = false;
            int N= Scn.nextInt();
            int[]arr = new int[N];

            for(int k=0; k<N;k++){
                arr[k]= Scn.nextInt();
            }

            int key=Scn.nextInt();
            for(int j=0; j<N;j++){
               if(arr[j]==key){
                   System.out.println("Key found at index" + j);
                   flag= true;
               }
            }
            if(flag==false){
               System.out.println("Key not found");
            }
            }
}
