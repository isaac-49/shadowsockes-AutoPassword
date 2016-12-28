package ss;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by issac on 2016/12/27.
 */
public class Application {
    public static void main(String []args){
        String url  = "http://www.ishadowsocks.info/";
        String password = "";
        try {
            password = HtmlUtil.getPassword(url, "A");
        } catch (IOException e) {
            e.printStackTrace();
        }

        writeToJson("C:\\Users\\issac\\Desktop\\issac.json","");
    }

    public  static void writeToJson(String src,String content){
        BufferedWriter bw = null;
        FileWriter writer = null;
        try {
            writer = new FileWriter(src);
            writer.write(content);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (writer != null){
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    if (writer != null) {
                        writer.close();
                    }
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
