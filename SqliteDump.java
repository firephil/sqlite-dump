import java.io.IOException;

public class SqliteDump{
	
    public static void main(String[] args) {

    	String command = "sqlite3.exe  1.db .dump .output > 1.sql";
    	System.out.println(command);
    	
        try {
            Process process = Runtime.getRuntime().exec(command);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }
}
