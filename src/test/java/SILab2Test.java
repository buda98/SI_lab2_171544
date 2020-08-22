import org.junit.Test;
import static org.junit.Assert.*;

public class SILab2Test {
	    @Test
	    public void EveryBranch() {
	        assertEquals(0, SILab2.checkPrime(5));
	        //path => 1 - 2 - 4 - 5 - 6 - 8 - 9 - 10.1 - 10.2 - 11 - 13 - 10.3 - 10.2 - 14 - 15 - 17
	        
	        assertEquals(0, SILab2.checkPrime(-1));
	        //path => 1 - 2 - 3
	        
	        assertEquals(0, SILab2.checkPrime(1));
	        //path => 1 - 2 - 4 - 5 - 6 - 7 - 17
	        
	        assertEquals(0, SILab2.checkPrime(6));
	        //path => 1 - 2 - 4 - 5 - 6 - 8 - 9 - 10.1 - 10.2 - 11 - 12 - 17
	    }

	    @Test
	    void MultipleConditions() {
	    	//if (n == 0 || n == 1) {//6
	        assertEquals(true, SILab2.checkPrime(0)); //(True) OR (X)
	        assertEquals(true, SILab2.checkPrime(1)); //(False) OR (True)
	    }
	}
