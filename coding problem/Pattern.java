/*      1 
       2 2 
      3 3 3 
     4 4 4 4 
    5 5 5 5 5 
   6 6 6 6 6 6 
  7 7 7 7 7 7 7 
 8 8 8 8 8 8 8 8 
9 9 9 9 9 9 9 9 9*/
class Pattern {
    public static void main(String[] args) {
        for(int i=1; i<10; i++) {
            for(int j=10; j>i; j--) {
                System.out.print(" ");
            }
            for(int k=0; k<i; k++) {
                System.out.print(" " + i);
            }
            for(int j=10; j>i; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}