public class ValueFilter extends Filter<String> 
{
    private String value;

    public ValueFilter(String fieldName) 
    {
        super(fieldName);
    }

    public void setValue(String value) 
    {
        this.value = value;
    }

    public String getFilterValue() 
    {
        return value;
    }
}