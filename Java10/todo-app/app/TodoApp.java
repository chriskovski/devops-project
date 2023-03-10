import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TodoApp {

    public static void main(String[] args) {
        String url = "jdbc:mysql://db:3306/todos";
        String username = "todo_user";
        String password = "todo_pass";

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            String sql = "SELECT * FROM todos";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                int id = result.getInt("id");
                String text = result.getString("text");
                boolean completed = result.getBoolean("completed");
                System.out.println(id + "\t" + text + "\t" + completed);
            }
        } catch (SQLException ex) {
            System.err.println("Error retrieving todos from database: " + ex.getMessage());
        }
    }

}
