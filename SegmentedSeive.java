import java.util.*;
import java.lang.*;

class SegmentedSeive{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        int sizeVal = (high-low+1);
        int primeArray[]=new int[sizeVal];
        boolean seiveArray[]=new boolean[sizeVal];

        double floorv = Math.floor(Math.sqrt(high));
        int floorVal = (int) floorv;
        System.out.println("Floor Value"+floorVal);
        int indexCounter=0;
        for(int i=0;i<=floorVal;i++){
            int c=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    c++;
                }
                if(c==2){
                    primeArray[indexCounter]=i;
                    indexCounter++;
                }
                else{
                    continue;
                }
            }
        }
        for (int i = 0; i < indexCounter; i++) {
            System.out.println(primeArray[i]);
        }
       
        for(int i=0;i<sizeVal;i++){
            seiveArray[i]=true;
        }
        for (int k = 0; k < indexCounter; k++) {
            int primVal=primeArray[k];
            for(int i=0;i<sizeVal;i++){
                if(seiveArray[i]==true){
                    // int j=2*i;j<=n;j=j+i
                    // int j=i*i;j<=n;j=j+i
                    for(int j=0;j<sizeVal;j++){ 
                        if((primVal*j) < sizeVal){
                            if(((primVal*j) % primVal) == 0){
                                seiveArray[(primVal*j)]=false;
                            }
                        }
                        
                    }
                }
            }
        }
        for (int i = 0; i < seiveArray.length; i++) {
            System.out.println(seiveArray[i]);
        }
        
        for(int k=0;k<indexCounter;k++){
            if(seiveArray[k]==true)
                System.out.println("INDEX: "+k);
        }
    }
}