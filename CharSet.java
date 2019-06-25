
public class CharSet implements Comparable<CharSet>
{
	private final int MAX_SIZE = 128;
	private boolean [] arr = new boolean[MAX_SIZE];
	
	public CharSet()
	{
	}
	public CharSet(char c)
	{
		arr[c] = true;
	}
	public CharSet(String c)
	{
		for (int i = 0; i < c.length(); i++)
			arr[c.charAt(i)] = true;
	}
	public CharSet union(CharSet a)
	{
		CharSet c = new CharSet();
		for (int i = 32; i < MAX_SIZE; i++)
		{
			if (a.arr[i] || arr[i])
				c.arr[i] = true;	
		}
		return c;
	}
	public CharSet intersection(CharSet a)
	{
		CharSet c = new CharSet();
		for (int i = 32; i < MAX_SIZE; i++)
		{
			if (a.arr[i] && arr[i])
				c.arr[i] = true;	
		}
		return c;
	}
	public boolean insert(char c)
	{
		if (c < MAX_SIZE && c > 31)
		{	
			arr[c] = true;
			return true;
		}
		return false;
	}
	public boolean remove(char c)
	{
		if (c < MAX_SIZE && c > 31)
		{	
			arr[c] = false;
			return true;
		}
		return false;
	}
	public boolean isElement(char c)
	{
		if (arr[c])
			return true;
		return false;
	}
	public int size()
	{
		int count = 0;
		for (int i = 32; i < MAX_SIZE; i++)
			if (arr[i])
				count++;
		return count;
	}
	public String toString()
	{
		String s = "{";
		for (int i = 32; i < MAX_SIZE; i++)
			if (arr[i])
				s+= (char)i;
		s+="}";
		return s;
	}
	public CharSet clone()
	{
		CharSet c = new CharSet();
		for (int i = 32; i < MAX_SIZE; i++)
		{
			if (arr[i])
				c.arr[i] = true;	
		}
		return c;
	}
	public boolean equal(CharSet a)
	{
		boolean b = false;

		for (int i = 32; i < MAX_SIZE; i++)
		{
			if (arr[i] && a.arr[i] || !arr[i] && !a.arr[i])
				b = true;
			else
			{	
				b = false;
				break;
			}
		}
		return b;
	}
	public boolean subset(CharSet a)
	{
		boolean b = false;
		for (int i = 32; i < MAX_SIZE; i++)
		{
			if (arr[i])
				if (a.arr[i])
					b = true;
				else
				{	
					b = false;
					break;
				}
		}
		return b;
	}
	public boolean superset(CharSet a)
	{
		boolean b = false;
		for (int i = 32; i < MAX_SIZE; i++)
		{
			if (a.arr[i]) 
				if(arr[i])
					b = true;
				else
				{	
					b = false;
					break;
				}
		}
		return b;
	}
	public void clear()
	{
		for (int i = 32; i < MAX_SIZE; i++)
			arr[i] = false;
	}
	//EXTRA CREDIT 2
	@Override
	public int compareTo(CharSet a) 
	{
		int set1 = 0, set2 = 0;
		for (int i = 32; i < MAX_SIZE; i++)
		{
			if (arr[i])
				set1++;
			if (a.arr[i])
				set2++;
		}
		if (set1 == set2)
			return 0;
		else if (set1 < set2)
			return -1;
		else
			return 1;
	}
}

