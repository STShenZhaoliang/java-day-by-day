package com.st.service;

import com.st.exception.MyException;

import java.io.FileNotFoundException;

public interface DemoService {
    void show1();

    void show2();

    void show3() throws FileNotFoundException;

    void show4();

    void show5() throws MyException;
}
