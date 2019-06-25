public class Compare3
{
	public static CharSet largest(CharSet obj1, CharSet obj2, CharSet obj3) 
	{
	       if (obj1.compareTo(obj2) > 0 && obj1.compareTo(obj3) > 0)
		   return obj1;
	       else if (obj2.compareTo(obj1) > 0 && obj2.compareTo(obj3) > 0)
		   return obj2;
	       else if (obj3.compareTo(obj1) > 0 && obj3.compareTo(obj2) > 0)
		   return obj3;
	       return obj3;
	} 
}
