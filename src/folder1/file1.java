package folder1;

import folder2.File2;
import folder2.File4;

public class File1 {
    public static void main() {
        System.out.println("Inside file1Method");
    }

    public static void file1Method(String[] args) {
        // file1Method();
        File2.file2Method();
    }

     public static void file1Method2(String[] args) {
        File4.file4Method();
    }
}
