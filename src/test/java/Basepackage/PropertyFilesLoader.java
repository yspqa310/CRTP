package Basepackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFilesLoader {
    static Properties prop = new Properties();
    static String FilesPath = System.getProperty("user.dir") + "\\CRTP_Framework\\src\\test\\resources\\";
    static File PropDirectory = new File(FilesPath);
    static File[] allFiles = PropDirectory.listFiles();

    public static String getPropertyValue(String key) {
        try {
            if(allFiles != null){
            for (File files : allFiles) {
                if(files.isFile() && files.getName().contains(".properties")){
                FileInputStream fileToLoad = new FileInputStream(files);
                prop.load(fileToLoad);}
            }}
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return prop.getProperty(key);
    }
    public String GetPropertyValue(String key) {
        try {
            for (File files : allFiles) {
                FileInputStream fileToLoad = new FileInputStream(files);
                prop.load(fileToLoad);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return prop.getProperty(key);
    }
}
