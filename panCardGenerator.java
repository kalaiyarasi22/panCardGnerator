public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Generate 3 random uppercase letters
        StringBuilder panCard = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            char randomUpperCaseLetter = (char) (random.nextInt(26) + 'A');
            panCard.append(randomUpperCaseLetter);
        }

        // Get type input and capitalize the first letter
        System.out.println("Enter the type of Registration (Student, College, People, Human): ");
        String type = scanner.nextLine();
        String typeFirstLetter = capitalizeFirstLetter(type);
        panCard.append(typeFirstLetter);
        
        // Get name input and capitalize the first letter
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        String nameFirstLetter = capitalizeFirstLetter(name);
        panCard.append(nameFirstLetter);
        
        // Generate a sequence of 4 random digits
        for (int i = 0; i < 3; i++) {
            int randomDigit = random.nextInt(10);
            panCard.append(randomDigit);
        }
        
        // Generate the last random digit and convert it to an uppercase letter
        int randomDigit = random.nextInt(10);
        char lastDigitUpperCase = (char) (randomDigit + 'A');
        panCard.append(lastDigitUpperCase);

        // Calculate the sum of ASCII values
        int asciiSum = 0;
        for (int i = 0; i < panCard.length(); i++) {
            asciiSum += panCard.charAt(i);
        }
        char checkCharacter = (char) (asciiSum % 26 + 'A');
        panCard.append(checkCharacter);

        // Print the final PANCARD number
        System.out.println("Generated PANCARD number: " + panCard.toString());
        
        // Close the scanner
        scanner.close();
    }

    // Method to capitalize the first letter of a string
    public static String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase();
    }
}
