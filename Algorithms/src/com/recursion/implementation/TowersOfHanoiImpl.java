package com.recursion.implementation;

import com.recursion.interfaces.ITowersOfHanoi;

public class TowersOfHanoiImpl implements ITowersOfHanoi{
	
	@Override
	public void createTowersOfHanoi(int n,char srcTower,char destTower,char auxTower){
		
		if(n <= 0){
			return;
		}
		
		createTowersOfHanoi(n-1,srcTower,auxTower,destTower);
		System.out.println("Moving Disk-" + n + " from Tower-" + srcTower + " to Tower-" + destTower);
		createTowersOfHanoi(n-1,auxTower,destTower,srcTower);
	}
	
	@Override
	public int countMinimumMovements(int n) {
		return calculateMinimumMovements(n);
	}
	
	private int calculateMinimumMovements(int n){
		if(n <= 0){
			return 0;
		}
		if(n == 1){
			return 1;
		}
			return 2*calculateMinimumMovements(n-1)+1;
		}

}
