package lesson13;

import java.io.File;
import java.io.IOException;

public class FIleMain {
    public static void main(String[] args) {
        String path = "D://WORK//Stormnet//SomeDir";
        File dir1 = new File(path);
        File file1 = new File(path, "HelloWorld.txt");
        File file2 = new File(dir1, "HelloWorld.txt");

        try {
            file1.createNewFile();
            file2.createNewFile();
        } catch (IOException exception) {
            System.out.printf(exception.getMessage());
        }


        if (dir1.isDirectory()) {
            for (File element : dir1.listFiles()) {
                if(element.isDirectory()) {
                    System.out.println(element.getName() + "\t folder");
                } else {
                    System.out.println(element.getName() + "\t file");
                }
            }
        }

        File dir2 = new File("D://WORK//Stormnet//NewDir");
        boolean isCreated = dir2.mkdir();
        if (isCreated) {
            System.out.println("Folder has been created");
        }

        File newDir = new File("D://WORK//Stormnet//NewDirRenamed");
        dir2.renameTo(newDir);

        boolean isDeleted = newDir.delete();
        if (isDeleted) {
            System.out.println("Folder has been deleted");
        }

        File file = new File("D://WORK//Stormnet//SomeDir//newFile.txt");
        System.out.println(file.getName());
        System.out.println(file.getParent());
        if (file.exists()) {
            System.out.println("file exists");
        } else {
            System.out.println("file not found");
        }
        System.out.println(file.length());
        if (file.canRead()) {
            System.out.println("file can be read");
        } else {
            System.out.println("file can not be read");
        }

        if (file.canWrite()) {
            System.out.println("file can be write");
        } else {
            System.out.println("file can not be written");
        }
    }
}
