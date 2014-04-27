/**
 * 
 */
package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import sml.Registers;

/**
 * @author Guilherme
 *
 */
public class RegistersTest {
    Registers r;
    @Before
    public void setUp() throws Exception{
        r = new Registers();
    }

    /*
     * assert constructor inits array at value 0 for every position.
     */
    @Test
    public final void testRegisters(){
        //setup
        int numberOfRegisters = 32;
        int expected = 0;
        //test
        for (int i = 0; i != numberOfRegisters; i++) {
            assertEquals(expected,r.getRegisters()[i]);
        }
    }
	/**
	 * Test method for {@link sml.Registers#setRegister(int, int)}.
	 */
	@Test
	public final void testSetRegister() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link sml.Registers#getRegister(int)}.
	 */
	@Test
	public final void testGetRegister() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link sml.Registers#getRegisters()}.
	 */
	@Test
	public final void testGetRegisters() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link sml.Registers#setRegisters(int[])}.
	 */
	@Test
	public final void testSetRegisters() {
		fail("Not yet implemented"); // TODO
	}

}
