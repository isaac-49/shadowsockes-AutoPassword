package ss;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by ted on 28/12/16.
 */
public class JsonUtil {

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
