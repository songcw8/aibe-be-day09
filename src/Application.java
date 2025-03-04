import llm.LLM;
import llm.ModelCategory;
import slack.Slack;
import util.logger.MyLogger;
import util.logger.MyLoggerLevel;
import util.secret.MySecret;
import util.secret.NoEnvException;
import util.secret.SecretCategory;
import util.webClient.WebClient;

import java.io.IOException;
import java.util.HashMap;

public class Application {
    public static void main(String[] args) throws NoEnvException, InterruptedException, IOException {
        Slack slack = new Slack();
        LLM llm = new LLM();
        String aiResult = llm.sendPrompt(ModelCategory.LLAMA, "Recommend a random Oasis song title only");
        // 이미지 만들기
        String imageResult = llm.sendPrompt(
                ModelCategory.FLUX,
                "Create thumbnail images for '%s'.".formatted(aiResult)
        );
//        System.out.println(imageResult);
        slack.sendMessage(aiResult);
        // 추론 모델 만들기
    }
}
