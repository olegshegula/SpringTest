package myLoggers;

import myBeans.Event;

/**
 * Created by oshchegula on 18.01.2019.
 */
public class ConsoleEventLogger implements EventLogger {

      public void logEvent(Event event) {
       System.out.println(event.toString());
    }
}
