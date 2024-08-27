package com.in28minutes.mockito.mockito_demo.business;

public class SomeBusinessImpl {

    private DataService dataService;

    public SomeBusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }

    public int findTheGreatestFromAllData(){
        int[] data =dataService.retrieveAllData();
        int greatestValue = Integer.MIN_VALUE;
        for(int num:data){
            if(num > greatestValue){
                greatestValue = num;
            }
        }
        return greatestValue;
    }

}

interface DataService{
    int[] retrieveAllData();
}
