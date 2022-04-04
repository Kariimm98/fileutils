/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package cat.uvic.teknos.m06.fileutils;


import java.io.File;



public class FileUtils {

    public static boolean isValidDirectory(String path){
        File file = new File(path);

        if(!file.exists()){
            return false;
        }

        if(!file.isDirectory()){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {

        System.out.println(isValidDirectory("hola") );
    }
}
