/**
 *Calculator
*/
package ru.job4j;

/**
  *Class Calculate решение задачи части 001 урок 1.
  *@author Sorokin V.D.
  *@since 02.12.2017
*/

public class Calculate
{
		
	public static void main (String[] args)
	{Calculate calc = new Calculate();
	System.out.println(calc.echo ("Hello World"));}
	
	public final String echo (String value)
		{
		if (value != null) 
			{value = String.format("%s value=", value);}
				else {value ="value=null";}
		return String.format ("%s %s %s", value, value, value);
		}
}
	
