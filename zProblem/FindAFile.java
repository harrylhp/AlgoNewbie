package zProblem;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Scanner;

public class FindAFile {
    public static void main(String[]args){
        //Define directory path
        File directory = new File("/Users/harrylhp/IdeaProjects/PlayGround/Playground/src/zProblem");
        String [] fList = directory.list();
        System.out.println(Arrays.toString(fList));

        FilenameFilter filter = (dir,name) -> name.endsWith(".java");
        String [] fJavaList = directory.list(filter);
        System.out.println(Arrays.toString(fJavaList));

        FilenameFilter filter2 = (dir,name) -> name.contains("Long"); //CharSquence is same as Str
        String [] fJavaList2 = directory.list(filter2);
        if (fJavaList2 != null) {
            Arrays.stream(fJavaList2)
                    .forEach(System.out::println);
        }

        // Searching a file
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of file to search : ");
        String fileToSearch = sc.next();
        System.out.println("Searching file..." + fileToSearch);

        // 1.Using normal java
        System.out.println("Search Result - Old way for FileSearch");
        FilenameFilter searchNameOfFile = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.startsWith(fileToSearch);
            }
        };
        String [] fSearch = directory.list(searchNameOfFile);
        System.out.println(Arrays.toString(fSearch));

        // 2.Using lambda
        System.out.println("Search Result - Using Lambda for FileSearch");
        FilenameFilter searchNameOfFile2 = (file,name) -> name.startsWith(fileToSearch);
        String [] fSearch2 = directory.list(searchNameOfFile2);
        System.out.println(Arrays.toString(fSearch2));

        // 3. Search File and using Lambda
        File [] fSearch3 = directory.listFiles((dir,name) -> name.startsWith("Long"));
        Arrays.stream(fSearch3).forEach(file -> System.out.println("File Name is :" + file.getName()));

    }
}
