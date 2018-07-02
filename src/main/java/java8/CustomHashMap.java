package java8;

public class CustomHashMap<K,V> {

	
	 @SuppressWarnings("unchecked")
	KeyValuePair<K, V> myList[]= new KeyValuePair[100];
	 
	 public V get(K key) {
		 int index=getHashCode(key);
		 KeyValuePair<K, V> e=myList[index];
		 
		 return getMatchVal(e,key);
	 }

	private V getMatchVal(KeyValuePair<K, V> e, K key) {
		while(e!=null) {
		if(e.getKey().equals(key)) {
			return e.getValue();
		}
		e=e.next;
		}
		return null;
	}

	 public void put(K key,V value) {
		 int index= getHashCode(key);
		 
		 storeValue(key,value,index);
		 
	 }
	private void storeValue(K key, V value, int index) {
		KeyValuePair<K, V> entry= myList[index];
		if(entry==null) {
			myList[index]= new KeyValuePair<K, V>(key, value);
		}else {
			boolean done= false;
			while(entry.next!=null) {
				if(entry.getKey().equals(key)) {
					entry.setValue(value);
				done=true;
				break;
				}
				entry=entry.next;
			}
			if(!done) {
				entry.next=new KeyValuePair<K,V>(key, value);
			}
		}
		
	}


	private void removeValue(K key) {
		int index=getHashCode(key);
		KeyValuePair<K, V> entry= myList[index];
		if(entry==null)
			return;
		if(entry.getKey().equals(key)) {
			if(entry.next==null)
				myList[index]=null;
		return;
		}
		
	}

	private int getHashCode(K key) {
		// TODO Auto-generated method stub
		int hash= key.hashCode();
		hash= hash%100;
		return hash;
	}
	 
	 public static void main(String args[]) {
	        CustomHashMap<Integer, Integer> map = new CustomHashMap<Integer, Integer>();
	        map.put(1, 1);
	        map.put(2, 2);
	        map.put(201,201);
	        System.out.println("get value is " + map.get(1));
	        System.out.println("get value is " + map.get(201));
	        System.out.println("get value is " + map.get(2));
	      //  map.remove(1);
	        System.out.println("After deletion " + map.get(1));
	        System.out.println("get value is " + map.get(201));
	    }

}
