package vk.com;
class Aa {
	public static void main(String args[] ) {
       int a[][]= {
    		   {1,2,3,4},
    		   {2,3,4},
    		   {4,4,5,7,6}
       };
       for(int i=0;i<a.length;i++) {
    	   for(int j=0;j<a[i].length;j++) {
    		   System.out.print(a[i][j]+" ");
    	   }
    	   System.out.println();
       }
    }
}