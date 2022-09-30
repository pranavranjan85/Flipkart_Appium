package ORG.TYSS.GENERIC_UTILITY;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility
{
	/**
	 * This method is used to generate random number	
	 * @return
	 */
	public int getRandomNumber() {
		return new Random().nextInt(1000);
	}
	/**
	 * This method is used to convert string to long
	 * @param StringData
	 * @return
	 */
	public long converStringToLong(String StringData) {
		return Long.parseLong(StringData);
	}


	/**
	 * this method is used to print the statement
	 * @param value
	 */
	public void printStatement(String value)
	{
		  System.out.println(value);
	}

	/**
	 * This method is is used to split the string based on strategy
	 * @param value
	 * @param strategy
	 * @return
	 */
	public String[] splitString(String value, String strategy)
	{
		return value.split(strategy);
	}


	/**
	 * This method is used to fetch current date
	 * @param strategy
	 * @return
	 */

	public String getCurrentDate(String strategy)
	{
		return new SimpleDateFormat(strategy).format(new Date());
	}

}
