package recursion;

import static org.junit.Assert.*;

import org.junit.Test;
import com.recursion.implementation.TowersOfHanoiImpl;

public class TestTowersOfHanoi {
	
	@Test
	public void testCreateTowersOfHanoi(){
		int n = 3;
		char srcTower = 'A';
		char auxTower = 'B';
		char destTower = 'C';
		TowersOfHanoiImpl obj = new TowersOfHanoiImpl();
		obj.createTowersOfHanoi(n, srcTower, destTower, auxTower);
	}
	
	@Test
	public void testCountMinimumMovements(){
		int n = 2;
		TowersOfHanoiImpl obj = new TowersOfHanoiImpl();
		int count = obj.countMinimumMovements(n);
		System.out.println("Minimum Movements count= " + count);
		assertEquals(3,count );
	}

}
