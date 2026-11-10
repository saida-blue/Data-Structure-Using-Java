public class CustomExceptionExamples {
    public static void main(String[] args) {
        try {
            checkStudentId("S100", "S100");
        } catch (CustomExceptionExamples_DuplicateException e) {
            System.out.println(e.getMessage());
        }

        try {
            checkGrade(120);
        } catch (CustomExceptionExamples_InvalidGradeException e) {
            System.out.println(e.getMessage());
        }
    }

    static void checkStudentId(String newId, String oldId)
            throws CustomExceptionExamples_DuplicateException {
        if (newId.equals(oldId)) {
            throw new CustomExceptionExamples_DuplicateException("Duplicate student ID");
        }
    }

    static void checkGrade(int grade) {
        if (grade < 0 || grade > 100) {
            throw new CustomExceptionExamples_InvalidGradeException("Invalid grade");
        }
    }
}

class CustomExceptionExamples_DuplicateException extends Exception {
    CustomExceptionExamples_DuplicateException(String message) {
        super(message);
    }
}

class CustomExceptionExamples_InvalidGradeException extends RuntimeException {
    CustomExceptionExamples_InvalidGradeException(String message) {
        super(message);
    }
}
