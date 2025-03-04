import slack.Slack;
import util.logger.MyLogger;
import util.logger.MyLoggerLevel;
import util.secret.MySecret;
import util.secret.NoEnvException;
import util.secret.SecretCategory;
import util.webClient.WebClient;

import java.util.HashMap;

public class Application {
    public static void main(String[] args) throws NoEnvException, InterruptedException {
        Slack slack = new Slack();
        slack.sendMessage("https://youtu.be/MlZOFIRC9HA?si=-AGparYReruotzyo"); //샴페인슈퍼노바
        //slack.sendMessage("안녕, 코딩 할 때 듣는 oasis 노래를 추천해줄게");
//        for (int i = 0; i < 100; i++) {
//            Thread.sleep(1000);
//            slack.sendMessage("안녕, 코딩 할 때 듣는 oasis 노래를 추천해줄게");
//            Thread.sleep(1000);
//            slack.sendMessage("https://youtu.be/oplra1FJxWI?si=_Un9wbJGNQUKQ84X");
//            Thread.sleep(1000);
//            slack.sendMessage("https://youtu.be/MlZOFIRC9HA?si=-AGparYReruotzyo");
//        }
    }
}
