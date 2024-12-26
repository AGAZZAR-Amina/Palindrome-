package com.pantxi.Plandrome;

import org.junit.jupiter.api.* ;
import static org.junit.jupiter.api.Assertions.* ;
import java.util.* ;

public class TestPlandrome {
    @Test
    public void TestPlandrome1(){

        assertEquals("true",Plandrome.IsPlandrome("")) ;
    }
  @Test
    public void TestPlandrome2(){
        assertEquals("true",Plandrome.IsPlandrome("A"));
  }

    @Test
    public void TestPlandrome3(){
        assertEquals("false",Plandrome.IsPlandrome("hello"));
    }
    @Test
    public void TestPlandrome4(){
        assertEquals("true",Plandrome.IsPlandrome("radar"));
    }
    @Test
    public void TestPlandrome5(){
        assertEquals("true",Plandrome.IsPlandrome("Radar"));
    }
}
