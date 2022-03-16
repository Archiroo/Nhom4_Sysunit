package com.greentrade.common.utils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

    public static InputStream getInputStream(File file) {
        try {
            return new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<String> File2List(InputStream stream) {
        BufferedReader bufferedReader = null;
        List<String> lines = new ArrayList<>();
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8));
            boolean eof = false;
            while (!eof) {
                String line = bufferedReader.readLine();
                if (line != null)
                    lines.add(line.trim());
                else
                    eof = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null)
                    bufferedReader.close();
                if (stream != null)
                    stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return lines;
    }

    public static String File2String(String path){
        File file = new File(path);
        StringBuilder results = new StringBuilder();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null)
                results.append(st);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return results.toString();
    }

    public static boolean checkFileNotFound(String path){
        File f = new File(path);
        if(f.exists() && !f.isDirectory()) {
            return true;
        }
        return false;
    }

    private static InputStream getFileFromResourceAsStream(String fileName) {
//        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
//        InputStream is = classloader.getResourceAsStream(fileName);
        ClassLoader classLoader = FileUtil.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(fileName);
        if (inputStream == null) {
            throw new IllegalArgumentException("File not found! " + fileName);
        } else {
            return inputStream;
        }
    }

    public static String getErrorMsgFromResource(String errorCode, String lang){
        InputStream inputStream;
        if (lang.equals("vi")) {
            inputStream = getFileFromResourceAsStream("message/vi.json");
        } else if (lang.equals("en")) {
            inputStream = getFileFromResourceAsStream("message/en.json");
        } else {
            inputStream = getFileFromResourceAsStream("message/vi.json");
        }
        List<String> data = File2List(inputStream);
        String result = String.join("", data);
        try {
            Object obj = new JSONParser().parse(result);
            JSONObject jo = (JSONObject) obj;
            return (String) jo.get(errorCode);
        } catch (Exception e) {
            return ExceptionType.E100_003;
        }
    }

}
