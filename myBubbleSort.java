
/**
 * Write a description of class myBubbleSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class myBubbleSort{
 public static void main (String[] args){
    int[]myArray= {24,-12,1000,-3,0,0,-5,67,312,82,4,9,101,45,56,-1002};
    bubblesort(myArray);
    System.out.println(java.util.Arrays.toString(myArray));
}
public static void swap(int[]A, int i, int j){
    int temp= A[i];
    A[i]= A[j];
    A[j]= temp;
}

public static void bubblesort(int[]A){
    for(int i=0; i<A.length-1; i++){
        for(int j=0; j<A.length-i-1; j++){
            if (A[j]> A[j+1]){
                swap(A, j, j+1);
            }
        }
    }
}
}
                
          