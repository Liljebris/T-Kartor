package com.fileproject.FileApp.service;
import com.fileproject.FileApp.model.File;

import java.io.IOException;

public interface IServiceClass {
    public void write(String content) throws IOException;
    public String read() throws IOException;
}
