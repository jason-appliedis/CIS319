import java.sql.*;


public class App {
    private static final String sqlConnectionString = "jdbc:sqlserver://localhost:1433;databaseName=CIS319;user=cis319;password=CIS319password!!;";
    private static final String sqlQueryStatements = "SELECT AuthorID, FirstName, LastName FROM Authors WHERE LastName LIKE 'D%'";
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
        connectToDb(sqlConnectionString, sqlQueryStatements);
    }
    //recieves a connection string and executes SQL Query displaying the result in the console
    public static void connectToDb(String dbConnectionString, String sqlQuery){
        try {
            Connection connection = DriverManager.getConnection(dbConnectionString);
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            System.out.println(resultSet.getMetaData());

            ResultSetMetaData metaData = resultSet.getMetaData();
            int numCols = metaData.getColumnCount();


            System.out.println("\n\n\nCopyright Results: ");
            System.out.println("Total Number or results: " + numCols);
            System.out.println();
            System.out.println("-----------------------------------");



            for(int i = numCols; i >= 1; i-- ){
                System.out.printf("%-8s\t", metaData.getColumnName(i));
            }
            System.out.println();
            resultSet.last();
            while(resultSet.previous()){
                for(int i = numCols; i >= 1; i-- ){
                    System.out.printf("%-8s\t", resultSet.getObject(i));
                }
                System.out.println();
            }
        } catch(SQLException sqlEx){
            sqlEx.printStackTrace();
        }

    }
}
