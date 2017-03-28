/*
 * This is a class to demo the usage
 * of Anonymous classes in java
 * 
 *
 */

public class AnonymousClasses {
    interface HelloWorld {
	    public void greet();
    }

    public void hello() {
	    class EngilishHelloWorld implemts HelloWorld { // this is the usage of Local class [Local class 依然是class declaration, anonymous class 是一个expression]
	        String name = "hello";
		
		@override
	        public void greet() {
		    System.out.println("Hello " + name) ;
		}
	    }
            HelloWorld ehw = new EnglishHelloWorld();
	    ehw.greet();


	    //following is the example of anonymous classs
	    /* 1. new operator
	     * 2. name of interface / class to extend
	     * 3. parantheses
	     * 4. body,  里面不能有statement， 只有method declaration 和变量定义
	     */
	    HelloWorld hw = new HelloWorld() {
		    String name = "mundo";
		    public void greet() {
                       System.out.println("Salute " + name );
		    }
	    };
            
	    hw.greet();
    }
}

