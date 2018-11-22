package com.ahs.generate.packages.structure;

import java.io.File;

public class Main {
    
    private static final String PROJECT_PATH = "D:\\projects\\portal-empleo\\pe-candidate";
    private static final String PACKAGE_NAME = "com\\santander\\candidate";
    
    public static void main(
        String[] args){
        
        createDir("configuration");
        createDir("utils");
        createDir("engine\\adapter");
        createDir("engine\\component");
        createDir("engine\\constant");
        createDir("engine\\enitity");
        createDir("engine\\helper");
        createDir("engine\\model");
        createDir("engine\\service");
        createDir("engine\\web");
        createDir("engine\\exception");
        
    }
    
    private static void createDir(
        String path){
        File dir = new File(PROJECT_PATH + "\\src\\main\\java\\" + PACKAGE_NAME + "\\" + path);
        dir.mkdirs();
        
        dir = new File(PROJECT_PATH + "\\src\\test\\java\\" + PACKAGE_NAME + "\\" + path);
        dir.mkdirs();
    }
    
}
