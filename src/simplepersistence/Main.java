package simplepersistence;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        
        Person person = null;
        StringBuilder stringBuilder = null;
        
        try(FileReader fileReader = new FileReader("myFile");){
            stringBuilder = new StringBuilder();
            
            int c;
            
            while ((c = fileReader.read()) != -1)
                stringBuilder.append((char)c);
        }
        catch(IOException exception){
            System.out.println(exception);
        }
        
        String userData = stringBuilder.toString();
        String[] userProps = userData.split(";");
        if(userProps.length == 3)
        {
            person = new Person(userProps[0], Integer.valueOf(userProps[1]), userProps[2]);
        }
        System.out.println(person);
    }

}
