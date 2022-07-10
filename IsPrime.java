package week1.day1;
public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int input = 67;
    int flag=0;
     for (int i=2;i<input-1;i++) {
    	
    	if(input%i == 0) {
    		flag=1;
    		break;}
    	
    	
     }
     if(flag==0)
     System.out.println("The number " + input + " is  a prime number");
     else 
     {
    	 System.out.println("The number " + input+ " is not a prime number");
     }
	}
}

