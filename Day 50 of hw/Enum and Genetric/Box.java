
package genetric;

public class Box<T> 
{
    T value;

    void setValue(T value) 
    {
        this.value = value;
    }

    void displayValue() 
    {
        if (value == null) 
        {
            System.out.println("Box is empty!");
        } else 
        {
            System.out.println("Stored Value: " + value);
        }
    }
}

