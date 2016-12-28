package ss;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.List;

/**
 * Created by issac on 2016/12/27.
 */
public class Application {

    public static void main(String []args) throws IOException {
        String url  = "http://www.ishadowsocks.info/";
        String file = "C:\\Users\\issac\\Desktop\\issac.json";

        List<Configs> list = HtmlUtil.getConfigs(url);
        ObjectMapper mapper = new ObjectMapper();
        String content = mapper.writeValueAsString(list);
        JsonUtil.writeToJson(file,content);
    }
}
