
public class Test {

    public static void main(String[] args) {
        
 
         java.lang.System.nanoTime();
       
        int A[]=new int[10];
       
       for (int i = 0; i <A.length; i++) {
            A[i] =(int) ((int)5+Math.random()*10);
        }
      //  int B[]= { 10 , 3 ,17  , 15 , 14 , 8 , 5 , 9 , 20 , 15 };
       
        double startTime = (double) System.nanoTime();
      Quick_Sort b = new Quick_Sort();
        
         b.quick(A, 0, 9);
        
     /*for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }*/
     
        double endTime   = (double) System.nanoTime();
        double totalTime = endTime - startTime;
        System.out.println(totalTime);
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
         double startTime1 = (double) System.nanoTime();

          Quick_Sort2 a = new Quick_Sort2();
        
          a.quick2(A, 0, 9);
          
          for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
          
        /*  double endTime1  = (double) System.nanoTime();
        double totalTime1 = endTime1 - startTime1;
        System.out.println(totalTime1/1000000000);*/
    
    }   

}/*

	Quick_Sort 2		Quick_Sort1	n
	0.001003624		0.001135759	10
	0.001592029		0.001161415	1000
	0.007079249		0.00475043	10000
	0.033256433		0.03592692	100000
	0.110338355		0.080901851	1000000
	18.43578623		7.995004543	100000000



*/