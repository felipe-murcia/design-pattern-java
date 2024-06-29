package com.company.behavioral.strategy;

/**
 * Created by felipemurcia on 1/8/19.
 */
public class Context {
    private StragetyTextFormatter stragetyTextFormatter;

    public Context(StragetyTextFormatter stragetyTextFormatter){
        this.stragetyTextFormatter = stragetyTextFormatter;
    }

    public void publishText(String text){
        stragetyTextFormatter.format(text);
    }
}
