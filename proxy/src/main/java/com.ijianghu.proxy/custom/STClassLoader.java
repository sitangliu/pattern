package com.ijianghu.proxy.custom;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * @author kai on
 * @date 2019/3/13 15:21
 */
public class STClassLoader extends ClassLoader{
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String className = STClassLoader.class.getPackage().getName() + "." + name;
        if(classPathFile != null){
            File classFile = new File(classPathFile,name.replaceAll("\\.","/")+".class");
            if(classFile.exists()){
                FileInputStream in =  null;
                ByteArrayOutputStream out = null;
                try{
                    in = new FileInputStream(classFile);
                    out = new ByteArrayOutputStream();
                    byte[] buff = new byte[1024];
                    int len;
                    while((len = in.read(buff))!=-1){
                        out.write(buff,0,len);
                    }
                    return defineClass(className,out.toByteArray(),0,out.size());

                }catch (Exception e){
                    e.printStackTrace();
                }

            }

        }
        return null;
    }

    private File classPathFile;
    public STClassLoader(){
        String classPath = STClassLoader.class.getResource("").getPath();
        this.classPathFile = new File(classPath);
    }




}
