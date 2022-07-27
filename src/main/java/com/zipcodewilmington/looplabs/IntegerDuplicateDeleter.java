package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {



    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
        getNumberOfOccurrence();
    }



    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        List<Integer> newArray = new ArrayList();
        for(Integer i : array){
            if(super.hashMap.get(i) <maxNumberOfDuplications){
                newArray.add(i);
            }
        }
        return newArray.toArray(new Integer[0]);
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        List<Integer> newArray = new ArrayList();
        for(Integer i : array){
            if(super.hashMap.get(i) !=exactNumberOfDuplications){
                newArray.add(i);
            }
        }
        return newArray.toArray(new Integer[0]);
    }
}
