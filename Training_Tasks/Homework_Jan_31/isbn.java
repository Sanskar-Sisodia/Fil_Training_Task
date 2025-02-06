class isbn {
    public static void main(String[] ar) {
        if (ar.length == 0) {
            System.out.println("error add 10 digit");
            return;
        }

        String isbnCode = ar[0]; 
        if (isbnCode.length() != 10) {
            System.out.println("error invalid");
            return;
        }

        int sum = 0;
        for (int i = 0; i < 9; i++) {
            char c = isbnCode.charAt(i);
            if (!Character.isDigit(c)) {
                System.out.println("error invalid");
                return;
            }
            sum += Integer.parseInt(String.valueOf(isbnCode.charAt(i))) * (i + 1); // Problem here

        }

        char check = isbnCode.charAt(9);
        int computedCheckDigit = sum % 11;
        boolean isValid = check==computedCheckDigit; // problem here

        if (!isValid) {
            System.out.println("Invalid ISBN");
        } else {
            System.out.println("Valid ISBN");
        }

        String group = isbnCode.substring(0, 1);
        String publisher = isbnCode.substring(1, 4);
        String title = isbnCode.substring(4, 9);
        String checksum = isbnCode.substring(9);

        System.out.println("Group Identifier (Language/Country): " + group);
        System.out.println("Publisher Code: " + publisher);
        System.out.println("Title Identifier: " + title);
        System.out.println("Checksum: " + checksum);
    }
}
