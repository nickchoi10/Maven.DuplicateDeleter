package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    HashMap<String, Integer> occurrence = new HashMap<>();
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
        getNumberOfOccurrence();
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        List<String> newArray = new ArrayList<>();
//        for(String a: array){
//            if(occurrence.containsKey(a)){
//                occurrence.put(a,occurrence.get(a)+1);
//            }else if(!occurrence.containsKey(a)){
//                occurrence.put(a,1);
//            }
//        }

        for(String b : array){
            if(super.hashMap.get(b)<maxNumberOfDuplications){
                newArray.add(b);
            }else if(super.hashMap.get(b)< maxNumberOfDuplications){
                newArray.add(b);
            }

        }
        return newArray.toArray(new String[0]);
    }




    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        List<String> newArray = new ArrayList<>();
//        for(String a: array){
//            if(occurrence.containsKey(a)){
//                occurrence.put(a,occurrence.get(a)+1);
//            }else if(!occurrence.containsKey(a)){
//                occurrence.put(a,1);
//            }
//        }

        for(String b : array){
            if(super.hashMap.get(b)<exactNumberOfDuplications){
                newArray.add(b);
            }else if(super.hashMap.get(b)!= exactNumberOfDuplications){
                newArray.add(b);
            }

        }
        return newArray.toArray(new String[0]);
    }

}
