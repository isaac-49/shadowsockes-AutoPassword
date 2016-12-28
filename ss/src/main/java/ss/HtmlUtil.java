package ss;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by issac on 2016/12/27.
 */
public class HtmlUtil {

    public static String getPassword(String url,String host) throws IOException {
        Document document = Jsoup.connect(url).get();
        Elements elements = document.select("div>h4");
        for (Element element : elements) {
            System.out.println(element);
            if (element.toString().startsWith("<h4>"+host+"密码")){
                 return element.html().split(":")[1];
            }
        }
        return null;
    }

}
