package History;

import java.util.Stack;

public class ListingKeeper
{
    private final Stack<ListingToken> historyStack = new Stack<>();
    // Int for steps
    public void saveState(ListingToken token)
    {
        historyStack.push(token);
    }

    public ListingToken restoreState()
    {
        if (!historyStack.isEmpty())
        {
            return historyStack.pop();
        }
        return null;
    }
}
