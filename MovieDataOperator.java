class MovieDataOperator{
	
	static String[] MovieNames={null, null,null,null};
	 
    static int position=0;
	static void save(String name)
	{
	System.out.println("enter");
	
	MovieNames[position]=name;
	position++;
	
	System.out.println("saved"+name+"position"+position);
		
	System.out.println("exit");		
		
	}	

	static void display()
	{
		for(int index=0;index<MovieNames.length;index++)
		{
			String ref=MovieNames[index];
			System.out.println("Movie names are="+ref);
		}
		
	}
}