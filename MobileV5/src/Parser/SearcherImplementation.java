package Parser;

import Parser.Searcher;

public class SearcherImplementation implements Searcher
{
    private final QueryParser queryParser = new QueryParser();

    public List<Listing> search(List<Listing> listings, String query)
    {
        List<String> polishNotation = queryParser.toPolishNotation(query);
        return evaluate(listings, polishNotation);
    }

    private List<Listing> evaluate(List<Listing> listings, List<String> polishNotation)
    {
        Stack<Filter<Listing>> stack = new Stack<>();

        for (String token : polishNotation)
        {
            if (isOperator(token))
            {
                if (token.equals("|"))
                {
                    Filter<Listing> right = stack.pop();
                    Filter<Listing> left = stack.pop();
                    stack.push(new OrFilter<>(List.of(left, right)));
                }
                else if (token.equals("&"))
                {
                    Filter<Listing> right = stack.pop();
                    Filter<Listing> left = stack.pop();
                    stack.push(new AndFilter<>(List.of(left, right)));
                }
            }
            else if (isCondition(token))
            {
                stack.push(createFilterFromCondition(token));
            }
        }

        Filter<Listing> finalFilter = stack.isEmpty() ? item -> false : stack.pop();
        return listings.stream().filter(finalFilter::visit).collect(Collectors.toList());
    }

    private boolean isOperator(String token) {
        return token.equals("|") || token.equals("&");
    }

    private boolean isCondition(String token) {
        return token.contains("=") || token.contains("<") || token.contains(">");
    }

    private Filter<Listing> createFilterFromCondition(String condition)
    {
        
    }
}
