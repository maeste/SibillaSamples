package it.javalinux.sibilla.sample.instrumentation;

/**
 * 
 * @author Stefano Maestri stefano.maestri@javalinux.it
 *
 */
public class App 
{
    private String foo;
    
    private int fooInt;

    /**
     * @return foo
     */
    public String getFoo() {
        return foo;
    }

    /**
     * @param foo Sets foo to the specified value.
     */
    public void setFoo(String foo) {
        this.foo = foo;
    }

    /**
     * @return fooInt
     */
    public int getFooInt() {
        return fooInt;
    }

    /**
     * @param fooInt Sets fooInt to the specified value.
     */
    public void setFooInt(int fooInt) {
        this.fooInt = fooInt;
    }
	
    
}
