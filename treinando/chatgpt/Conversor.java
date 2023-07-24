package treinando.chatgpt;

public class Conversor {
   
    public static void main(String[] args) {
        // Variável byte e suas conversões
        byte byteVar = 2;
        short byteToShort = byteVar;
        int byteToInt = byteVar;
        long byteToLong = byteVar;
        float byteToFloat = byteVar;
        double byteToDouble = byteVar;
        char byteToChar = (char) byteVar;
        boolean byteToBoolean = (byteVar != 0);
        String byteToString = String.valueOf(byteVar);

        // Variável short e suas conversões
        short shortVar = 2;
        byte shortToByte = (byte) shortVar;
        int shortToInt = shortVar;
        long shortToLong = shortVar;
        float shortToFloat = shortVar;
        double shortToDouble = shortVar;
        char shortToChar = (char) shortVar;
        boolean shortToBoolean = (shortVar != 0);
        String shortToString = String.valueOf(shortVar);

        // Variável int e suas conversões
        int intVar = 2;
        byte intToByte = (byte) intVar;
        short intToShort = (short) intVar;
        long intToLong = intVar;
        float intToFloat = intVar;
        double intToDouble = intVar;
        char intToChar = (char) intVar;
        boolean intToBoolean = (intVar != 0);
        String intToString = String.valueOf(intVar);

        // Variável long e suas conversões
        long longVar = 2L;
        byte longToByte = (byte) longVar;
        short longToShort = (short) longVar;
        int longToInt = (int) longVar;
        float longToFloat = longVar;
        double longToDouble = longVar;
        char longToChar = (char) longVar;
        boolean longToBoolean = (longVar != 0);
        String longToString = String.valueOf(longVar);

        // Variável float e suas conversões
        float floatVar = 2.0f;
        byte floatToByte = (byte) floatVar;
        short floatToShort = (short) floatVar;
        int floatToInt = (int) floatVar;
        long floatToLong = (long) floatVar;
        double floatToDouble = floatVar;
        char floatToChar = (char) floatVar;
        boolean floatToBoolean = (floatVar != 0);
        String floatToString = String.valueOf(floatVar);

        // Variável double e suas conversões
        double doubleVar = 2.0;
        byte doubleToByte = (byte) doubleVar;
        short doubleToShort = (short) doubleVar;
        int doubleToInt = (int) doubleVar;
        long doubleToLong = (long) doubleVar;
        float doubleToFloat = (float) doubleVar;
        char doubleToChar = (char) doubleVar;
        boolean doubleToBoolean = (doubleVar != 0);
        String doubleToString = String.valueOf(doubleVar);

        // Variável char e suas conversões
        char charVar = '2';
        byte charToByte = (byte) charVar;
        short charToShort = (short) charVar;
        int charToInt = (int) charVar;
        long charToLong = (long) charVar;
        float charToFloat = (float) charVar;
        double charToDouble = (double) charVar;
        boolean charToBoolean = (charVar != 0);
        String charToString = String.valueOf(charVar);

        // Variável boolean e suas conversões
        boolean booleanVar = true;
        byte booleanToByte = booleanVar ? (byte) 1 : (byte) 0;
        short booleanToShort = booleanVar ? (short) 1 : (short) 0;
        int booleanToInt = booleanVar ? 1 : 0;
        long booleanToLong = booleanVar ? 1L : 0L;
        float booleanToFloat = booleanVar ? 1.0f : 0.0f;
        double booleanToDouble = booleanVar ? 1.0 : 0.0;
        char booleanToChar = booleanVar ? '1' : '0';
        String booleanToString = String.valueOf(booleanVar);
        
          // Variável String e suas conversões
        String stringVar = "2";
        byte stringToByte = Byte.parseByte(stringVar);
        short stringToShort = Short.parseShort(stringVar);
        int stringToInt = Integer.parseInt(stringVar);
        long stringToLong = Long.parseLong(stringVar);
        float stringToFloat = Float.parseFloat(stringVar);
        double stringToDouble = Double.parseDouble(stringVar);
        char stringToChar = stringVar.charAt(0);
        boolean stringToBoolean = Boolean.parseBoolean(stringVar);
        
        // Saída de dados
        System.out.println("Variável String e suas conversões:");
        System.out.println("stringVar = " + stringVar);
        System.out.println("stringToByte = " + stringToByte);
        System.out.println("stringToShort = " + stringToShort);
        System.out.println("stringToInt = " + stringToInt);
        System.out.println("stringToLong = " + stringToLong);
        System.out.println("stringToFloat = " + stringToFloat);
        System.out.println("stringToDouble = " + stringToDouble);
        System.out.println("stringToChar = " + stringToChar);
        System.out.println("stringToBoolean = " + stringToBoolean);
       
        System.out.println();

        System.out.println("Variável byte e suas conversões:");
        System.out.println("byteVar = " + byteVar);
        System.out.println("byteToShort = " + byteToShort);
        System.out.println("byteToInt = " + byteToInt);
        System.out.println("byteToLong = " + byteToLong);
        System.out.println("byteToFloat = " + byteToFloat);
        System.out.println("byteToDouble = " + byteToDouble);
        System.out.println("byteToChar = " + byteToChar);
        System.out.println("byteToBoolean = " + byteToBoolean);
        System.out.println("byteToString = " + byteToString);

        System.out.println();

        System.out.println("Variável short e suas conversões:");
        System.out.println("shortVar = " + shortVar);
        System.out.println("shortToByte = " + shortToByte);
        System.out.println("shortToInt = " + shortToInt);
        System.out.println("shortToLong = " + shortToLong);
        System.out.println("shortToFloat = " + shortToFloat);
        System.out.println("shortToDouble = " + shortToDouble);
        System.out.println("shortToChar = " + shortToChar);
        System.out.println("shortToBoolean = " + shortToBoolean);
        System.out.println("shortToString = " + shortToString);

        System.out.println();

        System.out.println("Variável int e suas conversões:");
        System.out.println("intVar = " + intVar);
        System.out.println("intToByte = " + intToByte);
        System.out.println("intToShort = " + intToShort);
        System.out.println("intToLong = " + intToLong);
        System.out.println("intToFloat = " + intToFloat);
        System.out.println("intToDouble = " + intToDouble);
        System.out.println("intToChar = " + intToChar);
        System.out.println("intToBoolean = " + intToBoolean);
        System.out.println("intToString = " + intToString);

        System.out.println();

        System.out.println("Variável long e suas conversões:");
        System.out.println("longVar = " + longVar);
        System.out.println("longToByte = " + longToByte);
        System.out.println("longToShort = " + longToShort);
        System.out.println("longToInt = " + longToInt);
        System.out.println("longToFloat = " + longToFloat);
        System.out.println("longToDouble = " + longToDouble);
        System.out.println("longToChar = " + longToChar);
        System.out.println("longToBoolean = " + longToBoolean);
        System.out.println("longToString = " + longToString);

        System.out.println();

        System.out.println("Variável float e suas conversões:");
        System.out.println("floatVar = " + floatVar);
        System.out.println("floatToByte = " + floatToByte);
        System.out.println("floatToShort = " + floatToShort);
        System.out.println("floatToInt = " + floatToInt);
        System.out.println("floatToLong = " + floatToLong);
        System.out.println("floatToDouble = " + floatToDouble);
        System.out.println("floatToChar = " + floatToChar);
        System.out.println("floatToBoolean = " + floatToBoolean);
        System.out.println("floatToString = " + floatToString);

        System.out.println();

        System.out.println("Variável double e suas conversões:");
        System.out.println("doubleVar = " + doubleVar);
        System.out.println("doubleToByte = " + doubleToByte);
        System.out.println("doubleToShort = " + doubleToShort);
        System.out.println("doubleToInt = " + doubleToInt);
        System.out.println("doubleToLong = " + doubleToLong);
        System.out.println("doubleToFloat = " + doubleToFloat);
        System.out.println("doubleToChar = " + doubleToChar);
        System.out.println("doubleToBoolean = " + doubleToBoolean);
        System.out.println("doubleToString = " + doubleToString);

        System.out.println();

        System.out.println("Variável char e suas conversões:");
        System.out.println("charVar = " + charVar);
        System.out.println("charToByte = " + charToByte);
        System.out.println("charToShort = " + charToShort);
        System.out.println("charToInt = " + charToInt);
        System.out.println("charToLong = " + charToLong);
        System.out.println("charToFloat = " + charToFloat);
        System.out.println("charToDouble = " + charToDouble);
        System.out.println("charToBoolean = " + charToBoolean);
        System.out.println("charToString = " + charToString);

        System.out.println();

        System.out.println("Variável boolean e suas conversões:");
        System.out.println("booleanVar = " + booleanVar);
        System.out.println("booleanToByte = " + booleanToByte);
        System.out.println("booleanToShort = " + booleanToShort);
        System.out.println("booleanToInt = " + booleanToInt);
        System.out.println("booleanToLong = " + booleanToLong);
        System.out.println("booleanToFloat = " + booleanToFloat);
        System.out.println("booleanToDouble = " + booleanToDouble);
        System.out.println("booleanToChar = " + booleanToChar);
        System.out.println("booleanToString = " + booleanToString);
    }
}
