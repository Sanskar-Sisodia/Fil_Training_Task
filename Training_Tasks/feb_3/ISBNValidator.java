public class ISBNValidator {
    public static boolean validateISBN(String isbn) {
        StringBuffer sb = new StringBuffer(isbn.replace("-", ""));
        if (sb.length() != 10) return false;
        
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            if (!Character.isDigit(sb.charAt(i))) return false;
            sum += (sb.charAt(i) - '0') * (i + 1);
        }
        
        int checksum = sum % 11;
        char lastChar = sb.charAt(9);
        return (checksum == 10 && lastChar == 'X') || (checksum == (lastChar - '0'));
    }
    
    public static void getISBNDetails(String isbn) {
        if (!validateISBN(isbn)) {
            System.out.println("Invalid ISBN Code");
            return;
        }
        
        String[] parts = isbn.split("-");
        if (parts.length != 4) {
            System.out.println("Incorrect ISBN Format");
            return;
        }
        
        System.out.println("Valid ISBN Code");
        System.out.println("Country Code: " + parts[0]);
        System.out.println("Publisher Code: " + parts[1]);
        System.out.println("Book Number: " + parts[2]);
        System.out.println("Checksum: " + parts[3]);
    }
    
    public static void main(String[] args) {
        String isbn = "81-7656-031-6";
        getISBNDetails(isbn);
    }
}