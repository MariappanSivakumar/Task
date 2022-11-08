class FrequncySort
{
	public String getString()
	{
		String input ="";
		try {
			input = ((new java.io.BufferedReader(new java.io.InputStreamReader(System.in))).readLine());
		}catch(java.io.IOException e){}
		return input;
	}
	public void getData()
	{
		System.out.println("Enter the number...:");
		int iteration = Integer.parseInt(getString());
		int Elements[] = new int[iteration];
		System.out.println("Enter the number one by one...:");
		for(int i=0;i<iteration;i++)
			Elements[i] = Integer.parseInt(getString());
		process(Elements);
	}
	public void process(int Elements[])
	{
		java.util.Map<Integer,Integer> elementsCount = new java.util.TreeMap();
		java.util.Set<Integer> set = new java.util.TreeSet();
		int len = Elements.length;
		
		for(int i=0;i<len;i++){
			if(elementsCount.containsKey(Elements[i]) == false) {
				elementsCount.put(Elements[i],1);
			} else {
				elementsCount.put(Elements[i], elementsCount.get(Elements[i])+1);
			} 
		}

		java.util.Map<Integer,java.util.ArrayList<Integer>> map = new java.util.LinkedHashMap();
		for(java.util.Map.Entry<Integer,Integer> inte : elementsCount.entrySet() )
		{

			int n = inte.getValue();
			if(!map.containsKey(n)) {
				map.put(n,new java.util.ArrayList());
				for(int i=0;i<inte.getValue();i++)
				map.get(n).add(inte.getKey());
			} else {
				for(int i=0;i<inte.getValue();i++)
				map.get(n).add(inte.getKey());
			}
		}
		System.out.println(map);
	}
	public static void main(String ar[])
	{
		new FrequncySort().getData(); 
	}
}
