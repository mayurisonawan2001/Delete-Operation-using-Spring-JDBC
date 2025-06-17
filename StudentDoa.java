//just add delete method 
public int deleteStudent(int studentId) {
    String query = "DELETE FROM Student WHERE id = ?";
    return jdbcTemplate.update(query, studentId);
}
