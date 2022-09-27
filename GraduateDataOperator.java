class GraduateDataOperator{
	
	static String[] GraduateNames={null, null,null,null};
	 
    static int position=0;
	static void save(String name)
	{
	System.out.println("enter");
	
	GraduateNames[position]=name;
	position++;
	
	System.out.println("saved"+name+"position"+position);
		
	System.out.println("exit");		
		
	}	

	static void display()
	{
		for(int index=0;index<GraduateNames.length;index++)
		{
			String ref=GraduateNames[index];
			System.out.println("Graduatenames are="+ref);
		}
		
	}
}