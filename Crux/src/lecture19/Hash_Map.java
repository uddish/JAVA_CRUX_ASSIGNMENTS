package lecture19;

import java.util.ArrayList;
import java.util.HashMap;

public class Hash_Map<K, V> {

	ArrayList<Node<K, V>> buckets;
	int size;

	public Hash_Map()	{
		size = 0;
		buckets = new ArrayList<>();
		for(int i = 0; i < 5; i++)	{
			buckets.add(null);
		}
	}

	public int size()	{
		return buckets.size();
	}

	public Boolean isEmpty()	{
		return (buckets.size() == 0);
	}

	public int getIndex(K key)	{
		int bucketIndex = key.hashCode();
		return (bucketIndex % buckets.size());
	}

	public void put(K key, V value)	{
		int bucketIndex = getIndex(key);
		Node<K, V> newNode = new Node<K, V>(key, value);
		Node<K, V> head = buckets.get(bucketIndex);
		Node<K, V> temp = head;

		if(temp == null)	{
			head = newNode;
			buckets.set(bucketIndex, head);
			size++;
		}
		else	{
			//Overwriting Condition
			while(temp != null)	{
				if(temp.key.equals(key))	{
					temp.value = value;
					return;
				}
				temp = temp.next;
			}

			newNode.next = head;
			head = newNode;
			buckets.set(bucketIndex, head);
		}
		//REHASHING
		if((1.0*size / buckets.size()) > 0.7)	{
			rehash();
		}
	}

	private void rehash() {
		size = 0;
		ArrayList<Node<K, V>> temp = buckets;
		ArrayList<Node<K, V>> buckets = new ArrayList<>();
		for(int i = 0; i < temp.size()*2;i++)	{
			buckets.add(null);
		}
		for(int i = 0;i < temp.size();i++)	{
			Node<K, V> temp1 = temp.get(i);
			if(temp1 == null)	{
				continue;
			}
			while(temp1 != null)	{
				put(temp1.key, temp1.value);
				temp1 = temp1.next;
			}
		}

	}

	public V get(K key)	{
		int bucketIndex = getIndex(key);
		Node<K, V> temp = buckets.get(bucketIndex);

		if(temp == null)	{
			//Empty Exception
		}
		else	{
			while(temp != null)	{
				if(temp.key.equals(key))	{
					return temp.value;
				}
				temp = temp.next;
			}
		}
		return null;	//If V is of INTEGER type, it can take null bec it is of INTEGER type not int(Wrapper Class)
	}

	public void remove(K key)	{
		int bucketIndex = getIndex(key);
		Node<K, V> head = buckets.get(bucketIndex);
		Node<K, V> temp = head;
		if(head == null)	{
			return;
		}
		Node<K, V> prev = null;
		while(temp != null)	{
			if(temp.key.equals(key))	{
				if(prev == null)	{
					head = temp.next;
					prev = temp;
					buckets.set(bucketIndex, head);
					size--;
					return;
				}
				else	{
					prev.next = temp.next;
					size--;
					return;
				}
			}
			else	{
				prev = temp;
				temp = temp.next;
			}
		}

	}


}
