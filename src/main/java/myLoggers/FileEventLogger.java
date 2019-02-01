package myLoggers;


import myBeans.Event;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by oshchegula on 18.01.2019.
 */
public class FileEventLogger implements EventLogger {
    private String fileName;
    public void logEvent(Event event) throws IOException {
       File myFile = new File(fileName);
        FileUtils.writeStringToFile(myFile,event.toString(),true);
    }
}
