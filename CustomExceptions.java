public class CustomExceptions {
    public static void main(String[] args) {
        try {
            registerStudent("S101", "S101");
        } catch (CustomExceptions_DuplicateException e) {
            System.out.println(e.getMessage());
        }

        try {
            setGrade(130);
        } catch (CustomExceptions_InvalidGradeException e) {
            System.out.println(e.getMessage());
        }
    }

    static void registerStudent(String newId, String existingId)
            throws CustomExceptions_DuplicateException {
        if (newId.equals(existingId)) {
            throw new CustomExceptions_DuplicateException("This student ID already exists");
        }
        System.out.println("Student registered");
    }

    static void setGrade(int grade) {
        if (grade < 0 || grade > 100) {
            throw new CustomExceptions_InvalidGradeException("Grade must be from 0 to 100");
        }
        System.out.println("Grade saved");
    }
}

class CustomExceptions_DuplicateException extends Exception {
    CustomExceptions_DuplicateException(String message) {
        super(message);
    }
}

class CustomExceptions_InvalidGradeException extends RuntimeException {
    CustomExceptions_InvalidGradeException(String message) {
        super(message);
    }
}
