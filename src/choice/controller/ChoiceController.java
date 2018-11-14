package choice.controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;

import Dog.Model.Dog;


public class ChoiceController
{
	public void start()
	{
		Constructor();
	}
	
	private Dog userDog;
	private Dog userDog2;
	private Dog userDog3;
	
	public ArrayList <Dog> DogList;
	{
		
	} 
	
	private void buildList()
	{
		DogList.add(userDog);
		DogList.add(userDog2);
		DogList.add(userDog3);
	}
	
	public void fatdog()
	{
		
		userDog = new Dog("Boy", "girl", "XD");
		userDog2 = new Dog("Deer", "Cat", "Moose?");
		userDog3 = new Dog("fat", "Skinny", "No?");
		
		buildList();
	}
	
	
	public void Constructor()
	{
		JOptionPane.showMessageDialog(null ,userDog);
	}
	
	
}
