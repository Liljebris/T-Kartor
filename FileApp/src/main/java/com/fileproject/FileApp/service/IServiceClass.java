package com.fileproject.FileApp.service;

import java.io.IOException;

public interface IServiceClass {
    public void write(Object file) throws IOException;
    public String read(String filename) throws IOException;
}
