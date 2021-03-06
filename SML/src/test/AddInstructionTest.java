package test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import sml.AddInstruction;
import sml.Instruction;
import sml.MachineInterface;
import sml.RegistersInterface;

public class AddInstructionTest {
	Instruction add;
	String example;
	@Before
	public void setUp() throws Exception {
		add = spy(new AddInstruction("L1",0,0,1));
		example = add.toString();
	}

	@Test
	public final void testToString() {
		String expected = "L1: add 0 + 1 to 0";
		String input = example;
		System.out.println(example);
		assertEquals("ToString Overriding not working properly or not implemented", expected, input);
	}

	@Test
	public final void testExecute() {
		//mocking
		MachineInterface m = mock(MachineInterface.class);
		RegistersInterface r = mock(RegistersInterface.class);
		when(r.getRegister(0)).thenReturn(5);//simulate register 0 has the value of 5
		when(r.getRegister(1)).thenReturn(9);//simulate register 1 has the value of 9
		when(m.getRegisters()).thenReturn(r);
	
		//input
		add.execute(m);
		
		//test
		
		verify(m.getRegisters()).setRegister(0, 14);
		
	}

	@Test
	public final void testAddInstruction() {
		String[] expected = new String[3];
		expected[0] = "L1:";
		expected[1] = "0";
		expected[2] = "+";
		String[] exampleArray = example.split(" ");
		String[] input = new String[3];
		input[0] = exampleArray[0];
		input[1] = exampleArray[2];
		input[2] = exampleArray[3];
		
		assertTrue("AddInstruction is not an instance of instruction", add instanceof Instruction);
		assertArrayEquals("label, register and parameter are not being translated properly",expected, input);
	}

	@Test
	public final void testInstruction() {
		String[] expected = new String[2];
		expected[0] = "L1:";
		expected[1] = "add";
		String[] exampleArray = example.split(" ");
		String[] input = new String[2];
		input[0] = exampleArray[0];
		input[1] = exampleArray[1];
	
		
		assertTrue("AddInstruction is not an instance of instruction", add instanceof Instruction);
		assertArrayEquals("label and opcode are not being translated properly",expected, input);
	}

}
