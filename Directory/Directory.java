package Directory;

public class Directory

{

    private String dirName;
    protected String dirFisicalAdress; // адресс физического устройства директории
    static String dirPath;          // путь к директории на физическом устройстве
    static int numberOfFiles;                 // число файлов в директории
    int dirSize;                       // размер директории(суммарный размер файлов в ней)


    public int getFilesSize() {
        for (int i = 0, i < Directory.numberOfFiles, i++){
            int FilesSize = +File.fileSize;
        }
    }

    public static void main(String[] args) {
        new File();
    }


}