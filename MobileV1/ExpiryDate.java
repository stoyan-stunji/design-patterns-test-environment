public class ExpiryDate 
{
    private Date from;
    private Date to;
    
    private Boolean allTime;

    public ExpiryDate(Date from, Date to)
    {
        this.from = from;
        this.to = to;
        this.allTime = false;
    }

    public ExpiryDate()
    {
        this.from = null;
        this.to = null;
        this.allTime = true;
    }
    
    public void forever()
    {
        this.from = null;
        this.to = null;
        this.allTime = true;
    }

    public Date getFrom() 
    {
        return this.from;
    }

    public void setFrom(Date from) 
    {
        this.from = from;
    }

    public Date getTo() 
    {
        return this.to;
    }

    public void setTo(Date to) 
    {
        this.to = to;
    }

    public Boolean isAllTime() 
    {
        return this.allTime;
    }
}
