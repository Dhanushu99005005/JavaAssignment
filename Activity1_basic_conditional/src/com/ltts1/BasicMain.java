
package com.ltts1;
/**
 * @file Employee.java
 * @author DHANUSH U
 * @brief .
 * @version 0.1
 * @date 2021-08-14
 */
public class BasicMain {

	public static void main(String[] args) {
        int[] arr = new int[10];
		
		for(int i=0;i<arr.length;i++ )
		{
			arr[i]=i;
		}
        for(int x : arr)
        {
        	if(x==5) 
        	{
        		continue;
        	}
            System.out.println(x);
        }
		

	}

}
