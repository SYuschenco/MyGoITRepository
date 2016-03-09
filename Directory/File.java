package Directory;

public class File {

    String fileName;
    String fileType;
    String fileLocation;
    static int fileSize;


    File(){
        fileLocation=Directory.dirPath;
        Directory.numberOfFiles=+1;
         }
}
