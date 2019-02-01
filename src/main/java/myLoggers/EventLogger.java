package myLoggers;

import myBeans.Event;

import java.io.IOException;

/**
 * Created by oshchegula on 18.01.2019.
 */
public interface EventLogger {
    public void logEvent(Event event) throws IOException;
}
