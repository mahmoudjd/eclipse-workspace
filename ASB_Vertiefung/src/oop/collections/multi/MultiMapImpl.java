package oop.collections.multi;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MultiMapImpl<K, V> implements MultiMap<K, V>
{

    private Map<K, Set<V>> multiMap = new HashMap<>();

    @Override
    public int size()
    {

        return multiMap.size();
    }

    @Override
    public boolean containsValue(V value)
    {
        for (Set<V> val : multiMap.values())
        {
            if (val.contains(value))
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public Set<V> get(K key)
    {
        Set<V> value = new HashSet<>();
        for (V v : multiMap.get(key))
        {
            value.add(v);
        }
        return value;
    }

    @Override
    public void put(K key, V value)
    {
        if (multiMap.get(key) == null)
        {
            multiMap.put(key, new HashSet<>());
        }
        multiMap.get(key).add(value);
    }

    @Override
    public Set<V> remove(K key)
    {

        return multiMap.remove(key);
    }

    @Override
    public V remove(K key, V item)
    {
        Set<V> set = multiMap.get(key);

        if (!set.contains(item))
        {
            return null;
        }

        set.remove(item);

        return item;
    }

    @Override
    public Set<V> values()
    {
        Set<V> returnValue = new HashSet<>();
        for (Set<V> allValues : multiMap.values())
        {
            returnValue.addAll(allValues);
        }
        return returnValue;
    }

}
