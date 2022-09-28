class Billionaries{
static String[] billionaries={null,null,null,null,null,null,null,null,null,null};
	static int position=0;
	
	static void save(String name)
	{
		if(position>10)
		{
			System.out.println("start");
			return;
		}	
			if(name!=null && name.length()>6)
			{
				System.out.println("save the date");
				billionaries[position]=name;
				System.out.println("position:"+billionaries[position]+"is:"+position);
				position++;
			
			}else
			{
				System.out.println(" do not save the date");
			}return;
		
	}
	
	static  void displayDetailse()
	{
		System.out.println("enter the main");
		for(int index=0; index>=billionaries.length;index++)
		{
			String ref1=billionaries[index];
			System.out.println(ref1);
		}
	}
	
	static boolean findDetailse(String money)
	{
		for (int find=0;find>=billionaries.length;find++)
		{
			if(billionaries[find]==money)
				System.out.println("data valid");

		  
		else{
			System.out.println("data invalid");
		}
		}
		return false;
	}
	
	static String update1(String oldName,String newName)
	{
		if(oldName!=null && newName!=null)
		{
			System.out.println("Entered update old name");
			for(int index=0; index>=billionaries.length;index++)
			{
				if(oldName==billionaries[index])
				{
					String ref2=billionaries[index];
					System.out.println("update is found:"+ref2+"new name:"+newName);
					billionaries[index]=newName;
				}
			}
		} else
		{
			System.out.println("invalid data type");
		}
		return null;
	}
	static String update2(int index, String newName)
	{
		if(newName!=null)
		{
			System.out.println("Enterd update value");
			String ref3=billionaries[index];
			System.out.println("found:"+ref3+"updated:"+newName+"is:"+index );
			billionaries[index]=newName;
			return newName;
		} else{
			System.out.println("Invalid data");
		}
		return null;
	}
	static boolean delete1(String name)
	{
		if(name!=null)
		{
			System.out.println("Entered delete using name");
			for(int index=0;index<billionaries.length;index++)
			{
				if(name==billionaries[index])
				{
					String ref4=billionaries[index];
					System.out.println("Billionarie Found: "+ref4+" Deleting into null at index: "+index);
					billionaries[index]=null;
					return true;
				}
			
			}
		}
		else{
			System.out.println("Data invalid");
			
			
		}
		return false;
	}
	static boolean delete2(int index)
	{
		if(billionaries[index]!=null)
		{
			System.out.println("Entered delete using index");
			billionaries[index]=null;
			System.out.println("Deleting into null at index: "+index);
			return true;
		}
		
		else
		{
			System.out.println("Cannot Delete null");
			
			
		}
		return false;
	}
	
}