class barcode {
    public static void main(String[] args) {
        String code = "8901725331119"; 

        if (code.length() != 13) {
            System.out.println("Invalid Barcode Length");
            return;
        }

        int sum = 0;

       
        for (int i = 0; i < 13; i++) {
            int digit = Character.getNumericValue(code.charAt(i));
            
            if (i % 2 == 0) {
                sum += digit * 1; 
            } else {
                sum += digit * 3; 
            }
        }

        if (sum % 10 == 0) {
            System.out.println("Valid Barcode");
        } else {
            System.out.println("Not Valid Barcode");
        }
    }
}
