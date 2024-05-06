@FunctionalInterface
interface Sample {
    String run();
    default void hello() {
    	System.out.println("Default method call");
    }
}

public class functionalinterface implements Sample {
	  @Override
	    public String run() {
	        return "Sample interface run";
	    }
    public static void main(String[] args) {
        functionalinterface f =new functionalinterface();
        System.out.println(f.run());
        f.hello();
    }

  
}