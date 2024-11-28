public class RangeFilter<T> extends Filter<T[]> 
{
    protected T min;
    protected T max;

    public RangeFilter(String fieldName) 
    {
        super(fieldName);
    }

    public void setRange(T min, T max) 
    {
        this.min = min;
        this.max = max;
    }

    public T[] getFilterValue() 
    {
        return (T[]) new Object[]{min, max};
    }
}
