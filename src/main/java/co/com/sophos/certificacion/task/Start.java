package co.com.sophos.certificacion.task;

import co.com.sophos.certificacion.userpage.NavigationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Start implements Task{

	private NavigationPage navigation;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Open.browserOn(navigation));
		
	}

	public static Start thePage() {
		return Tasks.instrumented(Start.class);
	}

}
