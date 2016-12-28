package ss;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by issac on 2016/12/27.
 */
public class HtmlUtil {

    public static List<Configs> getConfigs(String url) throws IOException {
        List<Configs> list = new ArrayList<Configs>();
        Document document = Jsoup.connect(url).get();
        Elements elements = document.select("div>h4");
        for (int j = 0; j < 3; j++) {
            int i = j*6;
            String host = elements.get(i).html();
            String port = elements.get(i+1).html();
            String password = elements.get(i+2).html();
            Configs configs = new Configs(host,port,password);
            list.add(configs);
        }
        return list;
    }
}
