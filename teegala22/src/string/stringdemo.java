package string;

public class stringdemo {

		// TODO Auto-generated constructor stub
		

			public static void main(String[] args) {
				String x= "hello";
				String y= "hello";
				
				System.out.println(x.equals(y));
				System.out.println(x==y);
				
				String s = new String("hello");
				
				System.out.println(x.equals(s));
				System.out.println(x==s);
				
				x.charAt(2); //l
				System.out.println(x.toUpperCase());  //HELLO
				System.out.println(x); //hello
				
			}

		
	}


