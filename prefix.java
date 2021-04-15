class CommonPrefixString
{
	public String checkprefix(String[] string)
	{
		if(string.length==0)
		{
			System.out.println("no common prefix is present ");
			
		}
		int prefixno;
		for (prefixno=0;prefixno<string[0].length();prefixno++)
		{
			char required = string[0].charAt(prefixno);
		    for(int i=1;i<string.length;i++)
		    {
		    	if(prefixno>=string[i].length()||required!=string[i].charAt(prefixno))
		    	{
		    		return string[0].substring(0,prefixno);
		    	}
		    }
		    
	    }
	    return string[0];
	 }
    public static void main(String[] args) 
    {
	   String[] testcase1={"shanmuka","shanmu","shannu"};
	   String[] testcase2={"sai","shanmuka","mahesh"};
	   CommonPrefixString test=new CommonPrefixString();
	   String check1=test.checkprefix(testcase1);
	   System.out.println("lonest common prefix string of first testcase: "+check1);
	   String check2=test.checkprefix(testcase2);
	   System.out.println("lonest common prefix string of second testcase: "+check2);

	}
}