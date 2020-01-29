package com.ijianghu.proxy.custom;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author kai on
 * @date 2019/3/13 16:20
 */
public class STProxy {

    public static final String ln = "\r\n";

    public static Object newProxyInstance(STClassLoader classLoader,Class<?>[] interfaces,STInvocationHandler h){

        try{
            //1、动态生成源代码.java文件
            String src = generateSrc(interfaces);
            System.out.println(src);
            //2、Java文件输出到磁盘
            String path = STProxy.class.getResource("").getPath();
            File file = new File(path + "$Proxy0.java");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(src);
            fileWriter.flush();
            fileWriter.close();

            //3、把生成的.java文件编译成.class文件
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
            Iterable<? extends JavaFileObject> iterable = manager.getJavaFileObjects(file);

            JavaCompiler.CompilationTask task = compiler.getTask(null, manager, null, null, null, iterable);
            task.call();
            manager.close();

            //4、编译生成的.class文件加载到JVM中
            Class<?> proxyClass = classLoader.findClass("$Proxy0");
            Constructor<?> c = proxyClass.getConstructor(STInvocationHandler.class);

            //5、返回字节码重组以后的新的代理对象
            return c.newInstance(h);


        }catch (Exception e){
            e.printStackTrace();
        }


        return null;
    }

    /**
     * 动态生成源代码.java文件
     * @param interfaces
     * @return
     */
    private static String generateSrc(Class<?>[] interfaces) {

        StringBuffer sb = new StringBuffer();
        sb.append("package com.ijianghu.proxy.custom;" + ln);
        sb.append("import com.ijianghu.proxy.bossproxy.People;" + ln);
        sb.append("import java.lang.reflect.*;" + ln);
        sb.append("public class $Proxy0 implements "+interfaces[0].getName()+"{"+ln);
            sb.append("STInvocationHandler h;"+ln);
            sb.append("public $Proxy0(STInvocationHandler h){"+ln);
            sb.append(" this.h = h;"+ln);
            sb.append(" }"+ln);
            for(Method m: interfaces[0].getMethods()){
                Class<?>[] params = m.getParameterTypes();

                StringBuffer paramNames = new StringBuffer();
                StringBuffer paramValues = new StringBuffer();
                StringBuffer paramClasses = new StringBuffer();

               for(int i=0;i<params.length;i++){
                   Class clazz = params[i];
                   String type = clazz.getName();
                   String paramName=toLowerFirstCase(clazz.getSimpleName());
                   paramNames.append(type+" "+paramName);
                   paramValues.append(paramName);
                   paramClasses.append(clazz.getName()+".class");
                   if(i > 0 && i<params.length-1){
                       paramNames.append(",");
                       paramClasses.append(",");
                       paramValues.append(",");
                   }
               }

               sb.append("public "+m.getReturnType().getName()+" "+m.getName()+"("+paramNames.toString()+") {"+ln);
                    sb.append("try{"+ln);
                        sb.append("Method m = "+interfaces[0].getName()+".class.getMethod(\""+m.getName()+"\",new Class[]{"+paramClasses.toString()+"});"+ln);
                        sb.append((hasReturn(m.getReturnType())?"  ":"return")+getCaseCode("this.h.invoke(this,m,new Object[]{"+paramValues+"})",m.getReturnType())+";"+ln);
                    sb.append("}catch(Error _ex){ }");
                    sb.append("catch(Throwable e) {"+ln);
                    sb.append("throw new UndeclaredThrowableException(e);"+ln);
                    sb.append("}"+ln);
                    sb.append(getReturnEmptyCode(m.getReturnType()));
                sb.append("}"+ln);
            }
        sb.append("}"+ln);
        return sb.toString();
    }

    private static Map<Class,Class> mappings = new HashMap<Class, Class>();
    static {
        mappings.put(int.class,Integer.class);
    }

    private static String getReturnEmptyCode(Class<?> returnClass){
        if(mappings.containsKey(returnClass)){
            return "return 0;";
        }else if(returnClass == void.class){
            return "";
        }else {
            return "return null";
        }
    }

    private static String getCaseCode(String code,Class<?> returnClass){
        if(mappings.containsKey(returnClass)){
            return "(("+mappings.get(returnClass).getName()+")"+code+")."+returnClass.getSimpleName()+"Value()";
        }
        return code;
    }

    private static boolean hasReturn(Class<?> clazz){
        return clazz.getTypeName() != Void.class.getSimpleName();
    }

    private static String toLowerFirstCase(String src){
        char[] chars = src.toCharArray();
        chars[0] +=32;
        return String.valueOf(chars);
    }

}
