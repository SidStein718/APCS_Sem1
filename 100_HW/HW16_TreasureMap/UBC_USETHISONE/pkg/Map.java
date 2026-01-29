package pkg;
import java.util.Scanner;
import java.util.Random;


public class Map {
	int [][] map;		// 2D Array as a visual representation of the map
	int treasureX;		// Hidden treasure location X coordinate
	int treasureY;		// Hidden treasure location Y coordinate
	int posX;			// Current X position of the player
	int posY;			// Current Y position of the player

	/*
		Initialize the 2D array map with row and column lengths.
		Initialize starting location as 0,0 including the starting map value of 2 for current location.
		Call generateTreasure to create a treasure location.
	*/
	public Map(int row, int column){
		map = new int[row][column];
		posX = 0;
		posY = 0;
		map[posX][posY] = 2;
		generateTreausure();
	}

	/*
		Generate and X and Y coordinate of the treasure given the size of the map
	*/
	public void generateTreasure(){
		int x = (int)(Math.random() * map.length);
		int y = (int)(Math.rnadom() * map[0].length);
		treasureX = x;
		treasureY = y;
	}

	/*
		The position of the player is changed depending on a command given.
		This method should also change map values to indicate where the player is.
		Add 2 if the player is in the current location. (should also update old positons)

		Integer paramter m for move represents the below commands:
		1 - up
		2 - down
		3 - left
		4 - right
		5 - left up
		6 - right up
		7 - left down
		8 - right down

		Returns true if the player location was moved correctly
		Returns false if the player choose an invalid location
	*/
	public boolean move(int m){
		int coordX = posX;
		int coordY = posY;
		
		if(m == 1){
			coordX--;
		}
		else if(m == 2){
			coordX++
		}
		else if(m == 3){
			coordY--
		}
		else if(m == 4){
			coordY++
		}
		else if(m == 5){
			coordX--;
			coordY--;
		}
		else if(m == 6){
			coordX--;
			coordY++;
		}
		else if(m == 7){
			coordX++;
			coordY--;
		}
		else if(m == 8){
			coordX++;
			coordY++
		}
		else{
			return false;
		}
		
		if(coordX < 0 || coordX >= map.length || coordY < 0 || coordY >= map[0].length){
			return false;
		}
		
		map[posX][posY] -=2;
		
		posX = coordX;
		posY = coordY;
		
		map[posX][posY] += 2;

		return true;	// Dummy value to make work
	}

	/*
		Given 2 integer parameters, check validity of location and move the current positon.
		This method should also change map values to indicate where the player is.
		Add 2 if the player is in the current location. (should also update old positons)

		Returns true if the player location was moved correctly
		Returns false if the player choose an invalid location
	*/
	public boolean move(int row, int col){
		if(row < 0 || row >= map.length || col < 0 || col >= map[0].length){
			return false;
		}
		
		map[posX][posY] -= 2;
		
		posX = row;
		posY = col;
		
		map[posX][posY] += 2;
		
		return true;	// Dummy value to make work
	}

	/*
		This method checks for treasure!
		Check the current position of the player
		Adding 1 indicates that the spot has been searched for treasure.
			Only check unchecked spots.
		Returns true if treasure was found, false otherwise.
	*/
	public boolean dig(){
		if(map[posX][posY] == 0){
			map[posX][posY] += 1;
			if(posXX == treasureX && posY == treasureY){
				return true;
			}
		}
		return false;
	}

	/*
		This method prints the location of the treasure.
		Set the map value of the treasure to 7 (7 is the lucky number!)
		Print where the treasure was
		Call printMap()
	*/
	public void printTreasureLoc(){
		map[treasureX][treasureY] = 7;
		System.out.println("Treasure found at row " + treasureX + ", column " + treasureY);
		printMap();
	}

	/*
		Print the entire map of the 2D array.
	*/
	public void printMap(){
		for(int i = 0; i < map.length; i++){
			for(int j = 0; j < map[i].length; j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}	
	}

}
