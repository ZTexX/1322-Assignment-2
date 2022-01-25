import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Encryption encr = new Encryption();
    int choice = 0;

    do {
      System.out.println("1. Encrypt a message\n2. Decrypt a message\n3. Quit\n\nEnter Choice:");
      choice = Integer.parseInt(br.readLine());

      switch(choice) {
        case 1:
          System.out.println("Enter the plain text message:");

          if (true) {
            String msg = br.readLine();
            System.out.println("\nEncrypted Msg: " + encr.encrypt_message(msg) + "\n");
          }
          break;
        case 2:
          System.out.println("Enter the encrypted message:");

          if (true) {
            String msg = br.readLine();
            System.out.println("\nDecrypted Msg: " + encr.decrypt_message(msg) + "\n");
          }
          break;
        case 3:
          break;
        default:
          System.out.println("That is not a valid choice.");
          break;
      }
    } while (choice != 3);
  }
}