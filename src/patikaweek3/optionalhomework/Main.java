package patikaweek3.optionalhomework;

public class Main
{
    public static void main(String[] args)
    {
        MyList<Integer> myList = new MyList<>();

        myList.add(10);
        myList.add(20);
        myList.add(30);

        System.out.println(myList.size());
        System.out.println(myList.get(2));

        String str = myList.toString();
        System.out.println(str);

        System.out.println(myList.contains(20));
        System.out.println(myList.contains(1));

        System.out.println(myList.remove(2));
        String str2 = myList.toString();
        System.out.println(str2);

        System.out.println(myList.lastIndexOf(20));
    }
}

class MyList<T>
{
    private T[] array;
    private int capacity;
    private int size;

    public MyList()
    {
        this.capacity = 10;
        this.array = (T[]) new Object[capacity];
        this.size = 0;
    }

    public MyList(int capacity)
    {
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
        this.size = 0;
    }

    public int size()
    {
        return this.size;
    }

    public int getCapacity()
    {
        return this.capacity;
    }

    public void add(T data)
    {
        if (size == capacity)
        {
            capacity *= 2;
            T[] newArray = (T[]) new Object[capacity];
            if (size >= 0) System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }

        array[size] = data;
        size++;
    }

    public T get(int index)
    {
        if (index < 0 || index >= size)
        {
            return null;
        }

        return array[index];
    }

    public T remove(int index)
    {
        if (index < 0 || index >= size)
        {
            return null;
        }

        T removedData = array[index];

        for (int i = index; i < size - 1; i++)
        {
            array[i] = array[i + 1];
        }

        array[size - 1] = null;
        size--;

        return removedData;
    }

    public T set(int index, T data)
    {
        if (index < 0 || index >= size)
        {
            return null;
        }

        array[index] = data;

        return data;
    }

    public String toString()
    {
        if (size == 0)
        {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < size - 1; i++)
        {
            sb.append(array[i]).append(", ");
        }

        sb.append(array[size - 1]).append("]");

        return sb.toString();
    }

    public int indexOf(T data)
    {
        for (int i = 0; i < this.size; i++)
        {
            if (array[i].equals(data))
            {
                return i;
            }
        }

        return -1;
    }

    public int lastIndexOf(T data)
    {
        for (int i = this.size - 1; i >= 0; i--)
        {
            if (array[i].equals(data))
            {
                return i;
            }
        }

        return -1;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public T[] toArray()
    {
        T[] result = (T[]) new Object[size];
        System.arraycopy(array, 0, result, 0, size);
        return result;
    }

    public void clear()
    {
        for (int i = 0; i < size; i++)
        {
            array[i] = null;
        }
        size = 0;
    }

    public MyList<T> sublist(int start, int finish)
    {
        if (start < 0 || finish >= size || start > finish)
        {
            return null;
        }

        MyList<T> newList = new MyList<>(finish - start + 1);
        for (int i = start; i <= finish; i++)
        {
            newList.add(array[i]);
        }

        return newList;
    }

    public boolean contains(T data)
    {
        return indexOf(data) != -1;
    }
}
