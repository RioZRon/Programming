package Spliterator;

import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by riosysm on 2017/10/24.
 */
public class NumCounterSpliterator implements Spliterator<Character> {
    private String str;
    private int currentChar = 0;
     public NumCounterSpliterator(String str){
         this.str = str;
     }

    @Override
    public boolean tryAdvance(Consumer<? super Character> action) {
        action.accept(str.charAt(currentChar++));
        return currentChar < str.length();
    }

    @Override
    public Spliterator<Character> trySplit() {
        int currentSize = str.length() - currentChar;
        if(currentSize < 10) return null;

        for(int pos = currentSize/2 + currentSize; pos < str.length(); pos++){
            if(pos+1 < str.length()){
                if (Character.isDigit(str.charAt(pos)) && !Character.isDigit((str.charAt(pos+1)))) {
                    Spliterator<Character> spliterator = new NumCounterSpliterator(str.substring(currentChar, pos));
                    currentChar = pos;
                    return spliterator;
                }
                else{
                    if (Character.isDigit(str.charAt(pos))){
                        Spliterator<Character> spliterator = new NumCounterSpliterator(str.substring(currentChar,pos));
                        currentChar = pos;
                        return spliterator;
                    }
                }
            }

        }
        return  null;
    }
    @Override
    public long estimateSize() {
        return str.length() - currentChar;
    }

    @Override
    public int characteristics() {
        return ORDERED + SIZED + SUBSIZED + NONNULL + IMMUTABLE;
    }

}
