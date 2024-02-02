package folder2;

import folder1.File1;
import folder1.File3;

public class File2 {
    public static void file2Method() {
        System.out.println("Inside file2Method");
        File3.file3Method()
    }

    public static void main(String[] args) {
        File1.main(args);
    }
}
