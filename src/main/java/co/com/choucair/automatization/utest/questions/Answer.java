package co.com.choucair.automatization.utest.questions;

import co.com.choucair.automatization.utest.model.UTestData;
import co.com.choucair.automatization.utest.userinterface.LastStepView;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(UTestData uTestData) {
        return new Answer(uTestData.getStrQuestion());
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String q = Text.of(LastStepView.STRING_QUESTION).viewedBy(actor).asString();
        result = question.equals(q);
        return result;
    }
}
