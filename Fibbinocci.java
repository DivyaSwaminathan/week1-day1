package week1.day1;


public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int input =11;
      int sum=0;
      int firstnum=0,secondnum=1;
      System.out.println(firstnum + "\n" + secondnum);
      for (int i=2;i<input;i++) {
    	  sum=firstnum+secondnum;
    	  firstnum=secondnum;
    	  secondnum=sum;
    	  System.out.println(sum);
      }
    
	}

}
