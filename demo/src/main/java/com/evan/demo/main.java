package com.evan.demo;

import java.io.*;

//遍历指定目录下所有文件
public class main {
    public static void main(String[] dd) {
//         将jsp转为html
        File file = new File("C:\\Users/lcx17/Desktop/test");

//直接传入目录即可
        try {
            run(file);
        } catch (Exception e) {
            System.out.println("出错啦");
        }
    }

    public static void run(File file) throws Exception {


        //返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件。
        File[] fe = file.listFiles();
        for (File sg : fe) {
            String name = sg.getName();
//            返回指定子字符串在此字符串中最右边出现处的索引。
            int index = name.lastIndexOf(".");
            String s = name.substring(0, index) + ".html";
            FileOutputStream fo = new FileOutputStream("C:\\Users/lcx17/Desktop/ss/" + s);//获取目标文件
//            使用打印流 将数据打印到html页面
            PrintStream ps = new PrintStream(fo);


            // /读取文件内容变成字符串
            BufferedReader bufferedReader = new BufferedReader(new FileReader(sg));
            String s1;
            StringBuffer stringBuffer = new StringBuffer();
            //将jsp页面内容变成一个字符串stringBuffer
            while ((s1 = bufferedReader.readLine()) != null) {
                stringBuffer.append(s1);
            }
            //获取jsp页面内容  然后对StringBuffer进行设置即可
            StringBuffer stringBuffer1 = run1(stringBuffer);   //为啥必须返回 因为地址不一样 在方法内部new了许多次 所以不能使用原来的 如果方法内部没有new 那么就不用返回值
            run1(stringBuffer);

//            然后将字符串输出到页面
            ps.print(stringBuffer1.toString());
            fo.close();
            ps.close();
        }


    }


    public static StringBuffer run1(StringBuffer stringBuffer) {
//        注意 此方法只能先把 %@去掉 然后去掉%= 然后去掉%  因为第三个包括第二个和第一个字符串

        //返回jsp内容
        String substring = null;
        try {
//            其实 只要越界异常了 就代表结束了
            while ((substring = stringBuffer.substring(stringBuffer.indexOf("<%@"), stringBuffer.indexOf("%>") + 2)) != null) {
                //将jsp标签变成空字符串
                String replace = stringBuffer.toString().replace(substring, "");
                //将删除后的字符串重新给了 字符串进行判断
                stringBuffer = new StringBuffer(replace);
            }
            ;
        } catch (Exception e) {
            System.out.println("越界异常");
//            System.out.println("去除<%@ %>后的字符串:" + stringBuffer);
        }


        try {
//            其实 只要越界异常了 就代表结束了
            while ((substring = stringBuffer.substring(stringBuffer.indexOf("<%="), stringBuffer.indexOf("%>") + 2)) != null) {
                //将jsp标签变成空字符串
                String replace = stringBuffer.toString().replace(substring, "");
                //将删除后的字符串重新给了 字符串进行判断
                stringBuffer = new StringBuffer(replace);
            }
            ;
        } catch (Exception e) {
            System.out.println("越界异常");
//            System.out.println("去除<%= %>后的字符串:" + stringBuffer);


        }


        try {
//            其实 只要越界异常了 就代表结束了
            while ((substring = stringBuffer.substring(stringBuffer.indexOf("<%"), stringBuffer.indexOf("%>") + 2)) != null) {
                //将jsp标签变成空字符串
                String replace = stringBuffer.toString().replace(substring, "");
                //将删除后的字符串重新给了 字符串进行判断
                stringBuffer = new StringBuffer(replace);
            }
            ;
        } catch (Exception e) {
            System.out.println("越界异常");
//            System.out.println("去除<% %>后的字符串:" + stringBuffer);
        }


        return stringBuffer;
    }


}

