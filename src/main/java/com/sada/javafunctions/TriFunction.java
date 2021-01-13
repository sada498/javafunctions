package com.sada.javafunctions;
//calling this interface in Bi functional class
public interface TriFunction<T, U, V, R >{
    R apply(T t, U u, V v);
}
