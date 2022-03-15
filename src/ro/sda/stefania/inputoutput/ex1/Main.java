package ro.sda.stefania.inputoutput.ex1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\SDA WORK\\newFile.txt");

        StringBuffer fileContent = new StringBuffer();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String fileLine;
            while ((fileLine = bufferedReader.readLine()) != null) {
                fileContent.append(fileLine);
                fileContent.append("\n");
            }
        }

        String newFileContent = fileContent.toString().replace("merge", "salut");

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            bufferedWriter.write(newFileContent);
        }
    }

}