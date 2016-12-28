# shadowsockes-AutoPassword

>shadowsockes是一个socke代理，是一个跨平台的代理软件。

因为在http://www.ishadowsocks.info 上有密码的代理帐号提供使用。但是密码6小时会自动更新一次。而且服务器IP也不定时更换。

##实现自动抓取密码
项目中使用Jsoup工具，很方便地从页面中把服务器IP、密码、端口等信息抓取出来。

*如果想在6小时自动去获取密码，要加定时器*

## 修改配置
因为不同平台上的客户端的配置文件不一样。所以要根据实际情况来修改shadowsockes的配置文件。

**例如：**

MacOS上的配置文件是plist，是mac平台上的一种格式。我暂时没有去研究怎么去利用Java代码去修改它。

Windows上的配置文件是 * .json格式的。所以改起来比较方便。


