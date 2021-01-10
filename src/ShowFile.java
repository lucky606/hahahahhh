import java.io.File;
public class ShowFile {
    public static void main(String[] args) {
        File file = new File("F:\\test");
        showF(file);
    }
        public static void showF(File file){
            if (file.isDirectory()) {
                 File [] file1 = file.listFiles();
                 for (File f:file1){
                     showF(f);
                 }
            }
            else System.out.println(file.getName());

     }
}

