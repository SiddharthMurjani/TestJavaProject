package folder1;

import folder2.File2;

public class File1 {
    public static void file1Method() {
        System.out.println("Inside file1Method");
    }

    public static void main(String[] args) {
        file1Method();
        File2.file2Method();
    }
}
