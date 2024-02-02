package folder2;

import folder1.File1;

public class File2 {
    public static void file2Method() {
        System.out.println("Inside file2Method");
    }

    public static void main(String[] args) {
        File1.main(args);
    }
}
