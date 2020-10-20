try {
       // Llave temporal por keygenerator
       // frase pass Des
       SecretKey key = KeyGenerator.getInstance("DES").generateKey();

       // Instancia de clase Encrypter
       DesEncrypter encrypter = new DesEncrypter(key);

       // Utilizando encrypter con el secreto
       String encrypted = encrypter.encrypt("equipocuatro");

       // utilizando el secreto desencriptamos
       String decrypted = encrypter.decrypt(encrypted);
} catch (Exception e) {
}