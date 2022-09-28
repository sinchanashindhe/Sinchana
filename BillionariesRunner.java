class BillionariesRunner{
	public static void main(String[] args)
	{
		System.out.println("Enter the main method");
		
		Billionaries.save("Mukesh Ambani");
		Billionaries.save("Shiv Nadar");
		Billionaries.save("Lakshmi Mittal");
		Billionaries.save("Gautam Adani");
		Billionaries.save("Kumar Birla");
		Billionaries.save("Cyrus Poonawalla");
		Billionaries.save("Dilip Shanghvi");
		Billionaries.save("Uday Kotak");
		Billionaries.save("Radhakishan Damani");
		Billionaries.save("Pallonji Mistry");
		 
		Billionaries.displayDetailse();
		
		boolean ref1=Billionaries.findDetailse("Mukesh Ambani");
		System.out.println(ref1);
		
	
		Billionaries.update1("Mukesh Ambani","uday");
		Billionaries.displayDetailse();
		
		Billionaries.update2(7,"ajaya");
		Billionaries.displayDetailse();
		
		boolean ref2=Billionaries.delete1("sanjay");
		System.out.println(ref2);
		Billionaries.displayDetailse();
		
		boolean ref3=Billionaries.delete2(4);
		System.out.println(ref3);
		Billionaries.displayDetailse();
		
	}
}