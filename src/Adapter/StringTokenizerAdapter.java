package Adapter;

import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.function.Consumer;

public class StringTokenizerAdapter extends StringTokenizer implements Iterator {

    public StringTokenizerAdapter(String str){
        super(str);
    }

    public StringTokenizerAdapter(String str, String delim){
        super(str, delim);
    }

    public StringTokenizerAdapter(String str, String delim, boolean returnDelims){
        super(str, delim, returnDelims);
    }

    @Override
    public boolean hasNext() {
        return super.hasMoreTokens();
    }

    @Override
    public Object next() {
        return super.nextToken();
    }

}
