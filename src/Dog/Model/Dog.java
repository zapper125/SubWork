package Dog.Model;

import java.util.ArrayList;

import choice.controller.ChoiceController;
public class Dog
{
	
	private String quality1;
	private String quality2;
	private String quality3;
	

	public Dog(String quality1, String quality2, String quality3)
	{
		this.quality1 = quality1;
		this.quality2 = quality2; 
		this.quality3 = quality3;
	}
	
	public String getquality1()
	{
		return quality1;
	}
	
	public String getquality2()
	{
		return quality2;
	}
	
	public String getqulity3()
	{
		return quality3;
	}
	
	
	
}
