package com.in28minutes.mockito.mockito_demo.business;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class SomeBusinessImplMockTest {

    @Mock
    private DataService dataServiceMock;

    @InjectMocks
    private SomeBusinessImpl businessImpl;

    @Test
    void findTheGreatestFromAllData_TenElementsScenario(){
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{1,2,3,4,5,6,7,8,9,10});
        assertEquals(10, businessImpl.findTheGreatestFromAllData());
    }

    @Test
    void findTheGreatestFromAllData_ThreeElementsScenario(){
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{1,2,3});
        assertEquals(3, businessImpl.findTheGreatestFromAllData());
    }

}
