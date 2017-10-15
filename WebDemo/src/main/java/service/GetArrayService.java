package service;

import java.util.Random;
import java.util.stream.IntStream;

public class GetArrayService {
    public int[] GetRandomArray(){
        int[] myList = new int[1000];
        int number = 0;
        Random rand = new Random();
        for(int i = 0;i<1000;i++){
            number = number+rand.nextInt(2)+1;//每次随机增加1或2
            myList[i] = number;
        };
        return myList;
    }
}
