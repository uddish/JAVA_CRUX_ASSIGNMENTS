package lecture19;

public class HashMapUse {

	public static void main(String[] args) {

		Hash_Map<Integer,Integer> map = new Hash_Map<>();
//		map.put(1, 2);
//		map.put(2, 1);
		for(int i = 1;i <= 5;i++)	{
			map.put(i, i+1);
		}
		map.remove(1);	
		System.out.println(map.get(1));
		System.out.println(map.get(2));
	}

}
