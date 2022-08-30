import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        File dir = new File("C://Users//User//Desktop//елена//Файл", "1st.txt");
        File dir2=new File("C://Users//User//Desktop//елена//Файл","2st.txt");
        boolean itog= dir.createNewFile();
        boolean itog1=dir2.createNewFile();
        System.out.println(dir.length());
        String [] ft=dir.list();
        String[] og=dir2.list();
        String TR= "1st Work ";
        String TR2="Try again";
        FileOutputStream fos = new FileOutputStream("C://Users//User//Desktop//елена//Файл/1st.txt");
        byte[] FFF=TR.getBytes();
        byte [] RTY=TR2.getBytes();

        fos.write(FFF);
        fos.write(RTY);
        Path fry = Paths.get("C://Users//User//Desktop//елена//Файл//1st.txt");

    }

}

