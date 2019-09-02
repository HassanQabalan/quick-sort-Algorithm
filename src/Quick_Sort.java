public class Quick_Sort {
    
 public void quick(int A[],int low , int high){
     int splitpoint=partition( A, low , high);
     if(low<splitpoint)quick(A ,low ,splitpoint-1 );
     if(high>splitpoint)quick(A ,splitpoint+1,high );
   
 }
 private int partition(int  A[], int low , int high){
     int pivot=A[low];
     
     while(low<high ){
         
         while( A[high] > pivot && low < high){
           high--;}
         
         if(high != low){
             A[low]= A[high];
             low++;
         }
         
         while(low < high &&  A[low] < pivot){
         low++;}
         
         if(high != low){
             A[high] =A[low];
             high--;
         }
     }
      A[high]= pivot;
         return   high;
 }  
}   
