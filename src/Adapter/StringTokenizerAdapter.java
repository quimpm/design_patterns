package Adapter;

import java.util.Iterator;
import java.util.StringTokenizer;

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
        return hasMoreElements();
    }

    @Override
    public Object next() {
        return nextElement();
    }

}
