package com.in28minutes.mockito.mockito_demo.business;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SomeBusinessImplStubTest {

    @Test
    void findTheGreatestFromAllData_basicScenario(){
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(10, result);
    }

}

class DataServiceStub implements DataService{

    @Override
    public int[] retrieveAllData() {
        return new int[]{1,2,3,4,5,6,7,8,9,10};
    }
}
