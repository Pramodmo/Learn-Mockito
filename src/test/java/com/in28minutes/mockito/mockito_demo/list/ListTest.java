package com.in28minutes.mockito.mockito_demo.list;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ListTest {

    @Test
    public void simpleTest(){
      List listMock = mock(List.class);
      when(listMock.size()).thenReturn(3);
      assertEquals(3, listMock.size());
    }

    @Test
    public void multipleReturns(){
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(3).thenReturn(2);
        assertEquals(3, listMock.size());
        assertEquals(2, listMock.size());
    }

    @Test
    public void parameters(){
        List listMock = mock(List.class);
        when(listMock.get(0)).thenReturn(3);
        when(listMock.get(1)).thenReturn(4);
        assertEquals(3, listMock.get(0));
        assertEquals(4, listMock.get(1));
        assertEquals(null, listMock.get(2));
    }

    @Test
    public void genericParameters(){
        List listMock = mock(List.class);
        when(listMock.get(Mockito.anyInt())).thenReturn(3);
        assertEquals(3, listMock.get(0));
        assertEquals(3, listMock.get(1));
        assertEquals(3, listMock.get(2));
    }

}
