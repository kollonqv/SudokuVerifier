import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierTest {

// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891

	@Test
	public void testVerify() {
		SudokuVerifier sudoku = new SudokuVerifier();
		int result = sudoku.verify("417369825632158947958724316825437169791586432346912758289643571573291684164875293");
		
		assertEquals("0", 0, result);
	}
	

	@Test	//REQUIREMENT 1
	public void testRule1() {
		SudokuVerifier sudoku = new SudokuVerifier();
		int result = sudoku.verify("417369825-632158947958724316825437169791586432346912758289643571573291684164875293");
		
		assertEquals("-1", -1, result);
	}
	
	@Test	//REQUIREMENT 2
	public void testRule2() {
		SudokuVerifier sudoku = new SudokuVerifier();
		int result = sudoku.verify("4173698256321589479587243168254371697915864323469127582896435715732916841648752931");
		
		assertEquals("-2", -2, result);
	}
	
	@Test	//REQUIREMENT 3
	public void testRule3() {
		SudokuVerifier sudoku = new SudokuVerifier();
		int result = sudoku.verify("447369825632158947958724316825437169791586432346912758289643571573291684164875293");
		
		assertEquals("-3", -3, result);
		
	}


}
