import myBeans.Client;
import myBeans.Event;
import myLoggers.ConsoleEventLogger;
import myLoggers.EventLogger;
import myLoggers.FileEventLogger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by oshchegula on 18.01.2019.
 */
public class App {
    public Client client;
    public EventLogger eventLogger;
    public FileEventLogger fileEventLogger;

    public App(Client client, EventLogger eventLogger) {
        super();
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public static void main(String[] args) throws IOException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("conf.xml");
        App app = (App) ctx.getBean("app");
        Event event = (Event) ctx.getBean("event");
        app.logEvent(event,"Some event for 1");
         event = (Event) ctx.getBean("event");
        app.logEvent(event,"Some event for 2");

    }

    private void logEvent(Event event,String msg) throws IOException {
        String message = msg.replaceAll(client.getId(),client.getFullName());
        event.setMsg(message);
        eventLogger.logEvent(event);

    }
}
