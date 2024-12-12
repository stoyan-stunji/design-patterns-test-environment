package Filters.CompositeFilters;

import Filters.Filter;

import java.util.List;

public class OrFilter<T> implements Filter<T>
{
    private final List<Filter<T>> filters;
    private final int minMatches;

    public OrFilter(List<Filter<T>> filters, int minMatches) {
        this.filters = filters;
        this.minMatches = minMatches;
    }

    public boolean matches(T item) {
        int matchCount = 0;
        for (Filter<T> filter : filters) {
            if (filter.matches(item)) {
                matchCount++;
                if (matchCount >= minMatches) {
                    return true;
                }
            }
        }
        return false;
    }
}