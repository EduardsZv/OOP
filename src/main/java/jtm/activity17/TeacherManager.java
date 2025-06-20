package jtm.activity17;
import java.sql.Connection;
import java.util.List;
import static jtm.TestUtils.database;
import static jtm.TestUtils.password;
import static jtm.TestUtils.user;
import jtm.activity16.Person;
import jtm.activity16.PersonManager;

public class TeacherManager extends PersonManager {
    protected Connection conn;
    // use user value from src/resources/application.properties file
    static final String user = "u00";
    // use password value from src/resources/application.properties file
    static final String password = "u00";
    // use database value from src/resources/application.properties file
    static final String database = "database00";

    public TeacherManager() {
        super();
    }

    final void setConn(Connection conn) {
        this.conn = conn;
    }

    /**
     * Returns a Teacher instance represented by the specified ID.
     *
     * @param id the ID of teacher
     * @return a Teacher object
     */
    public Teacher findTeacher(int id) {

        /*- TODO #2 Write an sql statement that searches teacher by ID.
         * If teacher is not found return Teacher object with zero or null in its fields!
         * Hints:
         * 1. Because default database is not set in connection,
         *    use full notation for table "databaseXX.Teacher"
         * 2. Don't use transactions for search (autocommit=false, commit() is not called)
         *    because table should not be blocked for concurrent write during search
         */
        return null;
    }

    /**
     * Returns a list of Teacher object that contain the specified first name and
     * last name. This will return an empty List of no match is found.
     *
     * @param firstName the first name of teacher.
     * @param lastName  the last name of teacher.
     * @return a list of Teacher object.
     */
    public List<Teacher> findTeacher(String firstName, String lastName) {
        /*- TODO #3 Write an sql statement that searches teacher by first and
         * last name and returns results as List<Teacher>.
         * Note that search results of partial match
         * in form ...like '%value%'... should be returned
         * Note, that if nothing is found return empty list!
         * Don't use transactions for search (autocommit=false, commit() is not called)
         * because table should not be blocked for concurrent write during search
         */
        return null;

    }

    /**
     * Insert new teacher (first name and last name) into the repository.
     *
     * @param firstName the first name of teacher
     * @param lastName  the last name of teacher
     * @return true if success, else false.
     */

    public boolean insertTeacher(String firstName, String lastName, String department) {
        // TODO #4 Write an sql statement that inserts teacher in database.
        return false;
    }

    /**
     * Insert teacher object into database
     *
     * @param teacher passed teacher object
     * @return true on success, false on error (e.g. non-unique id)
     */
    public boolean insertTeacher(Teacher teacher) {
        // TODO #5 Write an sql statement that inserts teacher in database.
        return false;
    }

    /**
     * Updates an existing Teacher in the repository with the values represented by
     * the Teacher object.
     *
     * @param teacher a Teacher object, which contain information for updating.
     * @return true if row was updated.
     */
    public boolean updateTeacher(Teacher teacher) {
        // TODO #6 Write an sql statement that updates teacher information.
        return false;
    }

    /**
     * Delete an existing Teacher in the repository with the values represented by
     * the ID.
     *
     * @param id the ID of teacher.
     * @return true if row was deleted.
     */
    public boolean deleteTeacher(int id) {
        // TODO #7 Write an sql statement that deletes teacher from database.
        return false;
    }
}
