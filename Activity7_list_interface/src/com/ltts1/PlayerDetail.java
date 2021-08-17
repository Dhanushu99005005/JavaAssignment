package com.ltts1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PlayerDetail {

	public static void main(String[] args) throws IOException{
		
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		LinkedList linkedList = new LinkedList();
		
		System.out.println("Enter player details : ");
		
		System.out.println("Enter player name : ");
		String PlayerName = reader.readLine();
		
		System.out.println("Enter player age : ");
		int PlayerAge = Integer.parseInt(reader.readLine());
		
		System.out.println("Enter Country : ");
		String PlayerCountry = reader.readLine();
		
		linkedList.add(PlayerName);
		linkedList.add(PlayerAge);
		linkedList.add(PlayerCountry);
		
		final String confirmation = "yes";
		String checkCondition ="yes";
		
		while(checkCondition.toLowerCase().equals(confirmation))
		{
		System.out.println("Enter Operation to be performed : ");
		System.out.println("1. Add Player skill ");
		System.out.println("2. Remove data ");
		System.out.println("3. Display details ");
		int option = Integer.parseInt(reader.readLine());
		
		if(option==1)
		{
			System.out.println("Enter Skill : ");
			String PlayerSkill = reader.readLine();
			
			System.out.println("Enter position to add skill : ");
			int SkillAddPos = Integer.parseInt(reader.readLine());
			
			linkedList.set(SkillAddPos, PlayerSkill);
		}
		else if(option==2)
		{
			System.out.println("Enter position to add skill : ");
			int SkillDelPos = Integer.parseInt(reader.readLine());
			
			linkedList.remove(SkillDelPos);
		}
		else if(option==3)
		{
			System.out.println("Player details : ");
			Iterator iter = linkedList.iterator();
			while(iter.hasNext()) {
				System.out.println(iter.next());
			}
		}
		System.out.println("Do you want to continue(yes/no) ");
		checkCondition = reader.readLine();
		}
	}

}
