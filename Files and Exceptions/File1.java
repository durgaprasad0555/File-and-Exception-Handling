import java.util.*;

import java.io.IOException;
import java.io.File;

import java.io.FileWriter;

class File1{
    public static void main(String[] args) {
        while(true){
            Scanner sc=new Scanner(System.in);
            System.out.println("Menu based app - File Operations in Java");
            System.out.println("1. Create a new folder");
            System.out.println("2. Create a new text file");
            System.out.println("3. Write into a text file");
            System.out.println("4. Append data to a text file");
            System.out.println("5. Rename a file");
            System.out.println("6. Delete a file");
            System.out.print("Please enter the Menu: ");
            int a=sc.nextInt();

            switch (a) {
                case 1:
                    createFolder();
                    break;
                case 2:
                    createFile();
                    break;
                case 3:
                    writeToFile();
                    break;
                case 4:
                    appendToFile();
                    break;
                case 5:
                    renameFile();
                    break;
                case 6:
                    deleteFile();
                    break;
                default:
                    System.out.println("Invalid ");
                    break;
            }
            System.out.print("Do you want to continue");
            String str=sc.next();
            if(str.equals("n")){
                break;
            }
            
        }
       
       
    }

    public static void createFolder(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter folder name: ");
            String fn = sc.next();
            File folder = new File(fn);
            if (folder.mkdir()) {
                System.out.println("Folder created successfully");
            } 
            else {
                System.out.println("Folder creation failed");
            }
            sc.close();
    }

    public static void createFile(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter file name: ");
        
        try {
            String fn = sc.next();
            File file = new File(fn);
            if (file.createNewFile()) {
                System.out.println("File created successfully");
            } 
            else {
                System.out.println("File creation failed");
            }
        } 
        catch (IOException e) {
            System.out.println("Error reading input");
        }
        sc.close();
    }

    public static void writeToFile(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter file name: ");
        
        try {
            String fn = sc.next();
            FileWriter writer = new FileWriter(fn);
            System.out.println("Enter text to write to file (type 'done' to finish):");
            
            String str = "";
            while (!str.equals("done")) {
                str = sc.next();
                if (!str.equals("done")) {
                    writer.write(str);
                    writer.write(System.getProperty("str.separator"));
                }
            }
            writer.close();
            System.out.println("Text written to file successfully");
        } 
        catch (IOException e) {
            System.out.println("Error reading input");
        }
        sc.close();
    }

    public static void appendToFile(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter file name: ");
        
        try {
            String fn = sc.next();
            FileWriter writer = new FileWriter(fn,true);
            System.out.println("Enter text to append to file (type 'done' to finish):");
            
            String str = "";
            while (!str.equals("done")) {
               str = sc.next();
                if (!str.equals("done")) {
                    writer.write(str);
                    writer.write(System.getProperty("str.separator"));
                }
            }
            writer.close();
            System.out.println("Text written to file successfully");
        } 
        catch (IOException e) {
            System.out.println("Error reading input");
        }
        sc.close();
    }

    public static void renameFile(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter old file name");
        String of=sc.next();
        File oldFile = new File(of);
        System.out.print("Enter new file name");
        String nf=sc.next();
        File nf1 = new File(nf);
        if (oldFile.renameTo(nf1)) {
            System.out.println("File renamed successfully.");
        } else {
            System.out.println("Failed to rename file.");
        }
        sc.close();
    }

    public static void deleteFile(){
        Scanner sc=new Scanner(System.in);
        String fn=sc.next();
        File f = new File(fn);
        if (f.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete file.");
        }
        sc.close();
    }
}
