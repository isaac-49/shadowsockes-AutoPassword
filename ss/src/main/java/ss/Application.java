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
        String file = args[0];
        List<Configs> list = HtmlUtil.getConfigs(url);
        Properties p = setProperties(list);
        ObjectMapper mapper = new ObjectMapper();
        String content = mapper.writeValueAsString(p);
        JsonUtil.writeToJson(file,content);
    }

    public static Properties setProperties(List<Configs> configses){
        Properties p = new Properties();
        p.setStrategy(null);
        p.setIndex(0);
        p.setGlobal(false);
        p.setEnabled(true);
        p.setShareOverLan(false);
        p.setIsDefault(false);
        p.setLocalPort(1080);
        p.setPacUrl(null);
        p.setUseOnlinePac(false);
        p.setAvailabilityStatistics(false);
        p.setConfigs(configses);
        return p;
    }

}
