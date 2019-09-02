public class Quick_Sort2 {

 public void quick2(int A[],int low , int high){
     int splitpoint=partition( A, low , high);
     if(low<splitpoint)quick2(A ,low ,splitpoint-1 );
     if(high>splitpoint)quick2(A ,splitpoint+1,high );
     
      }
 
    private int partition(int  A[], int low , int high){
        
     int mid =(low+high)/2;
     mid=low;
     int pivot=A[mid];
     
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