package com.soumyav.mockito.mockitodemo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class ListMock  {
@Test
public void letsMockListGet() {
	List listMock=mock(List.class);
	when(listMock.size()).thenReturn(2);
	assertEquals(2,listMock.size());
	assertEquals(2,listMock.size());
}
@Test
public void letsMockListGet1() {
	List listMock=mock(List.class);
	when(listMock.size()).thenReturn(2).thenReturn(3);
	assertEquals(2,listMock.size());
	assertEquals(3,listMock.size());
}
@Test
public void letsMockListGet2() {
	List listMock=mock(List.class);
	when(listMock.get(anyInt())).thenReturn("soumya");
	assertEquals("soumya",listMock.get(0));
	assertEquals("soumya",listMock.get(1));
}
@Test(expected=RuntimeException.class)
public void letsMockListGetException() {
	List listMock=mock(List.class);
	when(listMock.get(anyInt())).thenThrow(new RuntimeException("something"));
	listMock.get(0);
}
}
